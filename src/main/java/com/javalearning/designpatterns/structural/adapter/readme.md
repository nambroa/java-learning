# Adapter (aka Wrapper)

Adapter is a **structural** design pattern that allows objects with incompatible interfaces to collaborate. For example,
creating an object that allows XML data to be understood by a client that expects data in JSON format.

Object1 can receive an adapter interface, which allows it to call the adapter's methods. When the adapter receives this
call, it transforms the requests with the expectations of Object2, adapting it. Finally, the request is passed to Object2.

## Example

We have a `RoundHole` and 2 types of `Shapes`: `Round` and `Square`. `RoundHole` and `RoundShape` have compatible interfaces,
but `SquareShape` does not. So `SquareShape` could not find through the `RoundHole`. We can create a `SquareShapeAdapter`
that pretends to be `RoundShape`, but it has a `SquareShape` inside.

The `Client` can then create a `RoundHole` and a `SquareShapeAdapter` with a `SquareShape` inside. The `SquareShape` would
now fit the `RoundHole`.