# Builder

Builder is a **creational** design pattern that lets you construct complex objects, step by step. This pattern allows you
to produce different representations of an object using the same pieces of code.

It is a useful alternative VS making an object using one monstrous constructor with a lot of parameters. This massive
constructor is undesirable since, generally, not all parameters are useful at all times.
It is also a cleaner solution than making one subclass for each representation of the object you need, since this
approach leaves you with an ever increasing number of classes.

Imagine you have a `House` class. The house can contain windows, doors, rooms, a garage,
a pool, flowers or trees. Having a constructor with 7 parameters means that most
parameters will be unused unless all your houses look identical. Having `HouseWithPool`,
`HouseWithPoolAndTrees`, etc, gives you a number of subclasses that becomes unmanageable very fast.

With the Builder pattern, you extract the `House` construction to its own `Builder` class. The class has methods like
`buildPool()`, `buildRoof()`, `buildTrees()` with a final `get()` method that finishes the `House`. 

This method of constructing objects allows you to only call the steps you need to create a particular configuration of
the `House`. You cannot access the `House` while it is being built, as the object is incomplete.

If you need different types with different configurations (like `GlassWall`, `WoodWall`), you can have several `Builder`
classes that conform to the same `Builder` interface.

If the client needs the same object configurations over and over, it can be useful to create a `Director` class
that exposes these configurations. The `Director` then calls the `Builder` in the background.
Doing this protects the `Builder`'s code from exposure, but the number of methods in the `Director`'s code can scale up
really fast if the client keeps needing new configurations.