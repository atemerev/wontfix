WontFIX: A Pragmatic Scala FIX Engine
=====================================

This library is work-in-progress. APIs can change anytime. Nothing is 
true and everything is permitted.

### Warning!

All code is licensed under **AGPL**. AGPL is not your dad's GPL. AGPL is 
a particularly crazy license that requires open-sourcing anything linked to 
this code, if it can be accessed by the network. This effectively means that
you cannot use this code in commercial environment without buying separate
commercial license.

### Composing messages

Unlike most other FIX engines, messages in WontFIX are strictly immutable.
You can construct arbitrary FIX messages with standard and custom fields.
Here is an example:

```scala
val quote = FixMessage(fix50.Quote,
  Symbol("EUR/USD"),
  QuoteReqID("rff-297800023114"),
  QuoteID("QPN209897199991"),
  FixGroup(fix50.NoQuoteEntries,
    List(Side(BID), Price("1.34523")),
    List(Side(OFFER), Price("1.34531"))),
  Party("DB"),
  FixField(9000, "DB-FX"))
```

