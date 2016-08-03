WontFIX: A Pragmatic Scala FIX Engine
=====================================

This library is work-in-progress. APIs can change anytime. Nothing is 
true and everything is permitted. Fnord.

### Composing messages

Unlike most other FIX engines, messages in WontFIX are strictly immutable.
You can construct arbitrary FIX messages with standard and custom fields.

Here's an example for MDEntryRequest message from FIX 4.4:

```
    val mdRequest = Fix(
      MsgType -> MarketDataRequest,
      MDReqID -> 1001,
      SubscriptionRequestType -> SnapshotPlusUpdates,
      MarketDepth -> 0,
      MDUpdateType -> FullRefresh,
      NoMDEntryTypes -> FixGroup(
        Fix(MDEntryType -> Bid), Fix(MDEntryType -> Offer)
      ),
      NoRelatedSym -> FixGroup(
        Fix(Symbol -> "EUR/USD", SecurityIDSource -> 8),
        Fix(Symbol -> "GBP/USD", SecurityIDSource -> 8),
        Fix(Symbol -> "USD/JPY", SecurityIDSource -> 8)
      )
    )
```