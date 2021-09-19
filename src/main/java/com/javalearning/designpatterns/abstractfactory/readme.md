# Abstract Factory 

The Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying
their concrete classes.

Imagine we have 3 objects: `Chair`, `Table`, and `Sofa`.

These objects can also be of different types. All of them can be Modern, Victorian or Futuristic.
Examples: `ModernChair`, `VictorianSofa`, `FuturisticTable`.

The idea here is to make each concrete class conform to its abstract interface.
For example, `ModernChair` and `VictorianChair` both conform to the `Chair` interface.

This allows the client to accept all types of `Chair`, `Table` and `Sofa` without having specific code for each concrete
implementation (`Modern`, `Victorian`, etc).

We apply the same logic to factories.

We have an abstract `FurnitureFactory` interface. All other concrete factories conform to this interface:
`ChairFactory`, `TableFactory` and `SofaFactory`.

The client can then interact with any factory that's available, without having to write specific code related to each
concrete factory. This allows us to extend this model completely by just adding factories. We
don't modify existing code. 

If we want to add a new object type, like `Lamp`, we would need to modify existing factories and types to accept it.
