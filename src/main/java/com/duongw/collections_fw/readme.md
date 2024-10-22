## Interfaces

1. Collection
   Represents a group of objects known as elements.
   Sub interfaces : List, Set, and Queue.
2. List
   Ordered collection (by index).
   Allows duplicate elements.
   Sub interfaces : ArrayList, LinkedList, Vector, Stack, etc.
3. Set
   Collection that does not allow duplicate elements.
   Sub interfaces : HashSet, LinkedHashSet, TreeSet.
4. Queue
   Collection used to hold elements before processing.
   Follows FIFO (First-In-First-Out) order.
   Sub interfaces : Deque, PriorityQueue.
5. Map
   Represents a mapping between keys and values.
   Does not extend the Collection interface.
   Sub interfaces : HashMap, LinkedHashMap, TreeMap.

## Classes

1. ArrayList
   Resizable array implementation of the List interface.
   Allows fast random access but slower insertion/deletion at the middle.
2. LinkedList
   Doubly-linked list implementation of the List interface.
   Efficient for insertion/deletion at the beginning/middle.
3. HashSet
   Implements the Set interface using a hash table.
   Does not guarantee the order of elements.
4. TreeSet
   Implements the Set interface using a Red-Black tree.
   Maintains elements in sorted order.
5. HashMap
   Implements the Map interface using a hash table.
   Provides constant-time performance for basic operations (get and put).
6. TreeMap
   Implements the Map interface using a Red-Black tree.
   Maintains elements in sorted order based on keys.