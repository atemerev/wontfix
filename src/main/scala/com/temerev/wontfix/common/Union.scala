package com.temerev.wontfix.common

import scala.reflect.runtime.universe._

object Union extends UnionTypeHelpers {

  type union[A] = {
    type or[B] = Disjunction[not[A]]#or[B]#apply
    type apply = not[not[A]]
  }

  type prove[U] = { type containsType[X] = not[not[X]] <:< U }

  /**
    * Constructs a new unary union instance with the supplied type as its only
    * member type.
    */
  def unary[T: TypeTag] = new Union[union[T]#apply]

  /**
    * == INTERNAL API ==
    *
    * Returns a new Union constructed from a conjunction of Union.not[_] types
    * and an additional type to add to the conjunction.
    *
    * Given `C = not[A] with not[B]` and `T`, this method returns a Union
    * wrapping the equivalent of `union[A] #or [B] #or [T]`.
    *
    * A `TypeTag` describing the conjunction of negations unwrapped from the
    * underlying union type is readily available via its
    * `underlyingConjunctionTag` method.
    *
    * Usage:
    *
    * {{{
    * val binaryUnion = new Union[union [Int] #or [String]]
    *
    * val ternaryUnion = Union.combine(
    *   binaryUnion.underlyingConjunctionTag,
    *   typeTag[Boolean]
    * )
    *
    * ternaryUnion.typeMembers // yields Vector(Int, String, Boolean)
    *
    * }}}
    *
    * @tparam C the starting conjunction of negations
    * @tparam T the type to add to the conjunction before negation
    */
  protected[common] def combine[C <: not[_]: TypeTag, T: TypeTag] = {
    new Union()(typeTag[not[C with not[T]]])
  }

}

private[common] trait UnionTypeHelpers {

  import annotation.unchecked._

  sealed trait not[-A] {
    type or[B] = Disjunction[A @uncheckedVariance]#or[B]#apply
    type apply = not[A @uncheckedVariance]
    type unapply = (A @uncheckedVariance)
  }

  trait Disjunction[A] {
    type or[B] = Disjunction[A with not[B]]
    type apply = not[A]
  }
}

class Union[U <: Union.not[_]: TypeTag] {

  import Union._

  /**
    * The underlying type of the union, a Union.not[_].
    */
  type underlying = U

  type containsType[X] = prove[U]#containsType[X]

  /**
    * TypeTag for the underlying type of the union.
    */
  val underlyingTag = typeTag[U]

  /**
    * Given U is a Union.not[X], returns X.
    */
//  val underlyingConjunctionTag: TypeTag[Union.not[_]] = {
//    val ut = typeOf[U]
//    val tParams = ut.typeSymbol.asType.typeParams // List[Symbol]
//    ReflectionHelpers.tagForType(tParams.head.asType.toTypeIn(ut)).asInstanceOf[TypeTag[Union.not[_]]]
//  }

  case class Value[T](ref: T, tag: TypeTag[T])

  /**
    * Storage for a value assigned to the union instance, the type of which must conform to one
    * of the types in the union.
    */
  protected var wrappedValue: Value[_] = Value((), typeTag[Unit])

  /**
    * Returns the set of member types of the underlying union.
    */
  def typeMembers(): Seq[Type] = {
    val ut = typeOf[U]
    val tParams = ut.typeSymbol.asType.typeParams // List[Symbol]
    val actualParam = tParams.head.asType.toTypeIn(ut)

    val notType = typeOf[Union.not[_]]
    var members = Vector[Type]()

    actualParam.foreach { part =>
      if (part <:< notType) {
        val partParams = part.typeSymbol.asType.typeParams.map { _.asType.toTypeIn(part).dealias }
        members ++= partParams
      }
    }

    members.distinct.toIndexedSeq
  }

  /**
    * Returns `true` if the supplied type is a member of this union.
    */
  def contains[X: TypeTag]: Boolean = typeOf[not[not[X]]] <:< typeOf[U]

  /**
    * Assigns a new value to the union, as long as the type of the value assigned is a member of
    * the union.
    */
  def assign[X: TypeTag: containsType](newValue: X) {
    wrappedValue = Value(newValue, typeTag[X])
  }

  /**
    * Retrieves the value assigned to the union, or Unit if no value is assigned.
    */
  def rawValue() = wrappedValue.ref

  /**
    * Retrieves the value assigned to the union as an Option[X] where X is one of the types in
    * the union.
    */
  def value[X: TypeTag: containsType](): Option[X] = wrappedValue match {
    case Value(x, tag) if tag.tpe <:< typeOf[X] => Some(x.asInstanceOf[X])
    case _                                      => None
  }

  /**
    * == Java API ==
    */
  @throws[ClassCastException]
  def value[P](prototype: P) = wrappedValue.ref.asInstanceOf[P]

}