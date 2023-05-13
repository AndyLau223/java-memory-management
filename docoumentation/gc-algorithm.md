# Garbage Collection Algorithm 


## Being eligible for GC 

Objects on the heap are no longer needed when they don't have a connection to the stack.

```java

// create object, and stored in the heap
// variable "o" holds a reference to an object of type "Object" on the stack.
Object o = new Object();

System.out.println(o);

// variable "0" set to null, nothing else in our application holds a reference to the Object we've created.
// it becomes eligible for GC.
o = null;
```

maharishi