# Bridge

Bridge is a **structural** design pattern that lets you split classes into abstraction and implementation. These two 
layers can then be created independently of each other.

Bridge manages this solution by using composition instead of inheritance. In this way, extending a class in multiple
dimensions does not cause an exponential grow of related classes. Each dimension to extends gets its own composition 
relation to the main class.

A Bridge can be similar to an Adapter. However, they specialize in solving different problems. When you have two classes
that must talk the same language but are different, an Adapter works best. When you have several clusters of classes
with different configurations that must communicate with another cluster (for example, GUI and backend of an app),
a Bridge works best.

Bridge also lets you switch implementations found inside the abstraction at runtime.

## Example

`Device` is our implementation interface, which will be followed by `TV` and `MP3` (mock objects).
`Remote` is our abstraction, which will contain a Device.

All `Remote` classes work with `Devices` via the `Device` interface (**Bridge**). This allows multiple different classes
of `Remote` to support multiple `Devices`, since they all conform to the same interface.

The `Remote` classes can be created independently of the `Device` classes, since they communicate via the interface.
Adding another `Device` class does not affect any `Remote`, since it must conform to the `Device` interface.