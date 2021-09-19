# Factory Method

The Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but
allows subclasses to alter the type of objects that will be created. It is useful for decoupling object creation from
manipulation and business logic elements.

In this example, we have a `Character`, that is concretely represented by `Warrior` and `Dragon`. Example methods
are `attack()`, `defend()` and `walk()`.

Finally, we have a `Scenario` class. `Scenario` has two children: `Battlefield` and `City`. Character creation'
Each `Scenario` also has a `start()` method, which initiates the simulation. This is our Factory class.

**`Scenario`'s `createCharacters()` method is abstract, allowing
`City` and `Battlefield` to override it and create what they need (factory method).**

The `City` only contains `Warrior` objects. However, if we create a `Battlefield`, it will
contain `Warrior` and `Dragon` objects.

## Note

This is a "classical" implementation of the Factory method, which includes the fact that Scenario has other responsibilities
besides creation. I would not do this in a big working repository.

I personally think that having literally a `CharacterFactory` would work better.
You can have composition between `CharacterFactory` and `Scenario`, and achieve the same results but with better
defined roles in the objects.
