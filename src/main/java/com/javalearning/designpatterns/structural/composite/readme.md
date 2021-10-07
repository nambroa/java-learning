# Composite

Composite is a **structural** design pattern that lets you compose objects into tree structures. You can then work with
the multi-object tree structure as if it were an individual object.

This pattern works best when the core of your app can be represented as an upside-down tree.

## Example

Imagine that you have a `Box`. That box can contain `Products`, or other `Boxes`. These smaller `Boxes` can contain
`Products`, or other `Boxes`, etc.

Applying the `Composite` pattern here, we will use a common interface to calculate the total price of the `Box`
(i.e the total price of the `Products`). We will call this common interface `Item`. To get the price of an item, we just
call `item.getPrice()`. Since `Item` is implemented by both `Box` and `Product`, we are treating the `Item` as an
individual object, when it could contain thousands of `Boxes` and `Products`.

The need for a common interface to use for interaction makes the `Composite` pattern sometimes difficult to use. It is
challenging to provide a common interface for many classes with differing functionality. You could end up using an
interface that is *too* generic and thus difficult to understand.