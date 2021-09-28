# Singleton

Singleton is a **creational** design pattern that lets you ensure a class has only one instance, while providing a
global access point to this instance. 

This pattern solves two problems at the same time, violating the Single
Responsibility Principle. It can also be more difficult to implement in multithreaded environments. Several threads
could try to create the singleton object at the same time.

It can be useful for controlling access to shared resources, for example, in a database.

This pattern also protects the instance from being overwritten by other pieces of code. This makes it more resilient
than just using a global variable to store the object. Global variables are usually much more easily overwritten.

This pattern is implemented by making the default constructor private, to prevent the use of the `new` Operator. At the
same time, a static creation method is created. It will create an object only once, saving it in a static field.
All future calls to this static method just return the cached object.
