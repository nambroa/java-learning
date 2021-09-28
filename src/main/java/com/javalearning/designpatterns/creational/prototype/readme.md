# Prototype

Prototype is a **creational** design patterns that lets you clone existing objects without making your code
dependent on their classes.

By having the cloning process done **inside** of the class that needs cloning, no encapsulation is broken and
you don't add any dependencies to the service, application or object that needs the clone. This class is called a
**Prototype**.

If the Prototype gets extended in the future, you just need to extend the `clone` method inside of it,
and no users of the method will need to make any changes or adaptations related to cloning the extra field.

## Prototype Registry

If the Prototype has some common field configurations that get requested to clone all the time, it could be useful
storing those in some sort of registry. It can start with a `Hashmap<Id, Prototype>` and grow to something like a cache.

This saves time cloning frequently-requested objects, especially useful if the object has other complex objects inside
of it that need cloning.

## Example

We can create a `Prototype` via an interface or an abstract class. In this case, we will have an abstract class
`Shape` with a `clone()` method, that will be implemented by its children.

With the interface, you just need to declare one with a `clone()` method inside of it, and have the interested
classes implement that interface.