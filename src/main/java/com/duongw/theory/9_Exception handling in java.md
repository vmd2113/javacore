# Exception

- There are two main types of exceptions in Java: checked exceptions and unchecked exceptions. Checked exceptions are
  exceptions that must be either caught or declared to be thrown by the method in which they may occur. Unchecked
  exceptions, on the other hand, are exceptions that do not need to be explicitly caught or declared, and they typically
  indicate programming errors or other exceptional conditions that are beyond the control of the program.

- Java provides a robust exception handling mechanism through the use of try-catch blocks, where code that may throw
  exceptions is enclosed in a try block, and any exceptions that are thrown are caught and handled by catch blocks.
  Additionally, Java allows for the use of finally blocks to execute cleanup code regardless of whether an exception is
  thrown or not. This combination of try, catch, and finally blocks provides a powerful mechanism for managing
  exceptional
  conditions in Java programs.

# Exception Hierarchy

<img src="image/9_exception_hierarchy.png">

Throwable:

- Error : Represents serious problems that are typically beyond the control of the application, such as OutOfMemoryError
  or StackOverflowError. Usually, it is not appropriate for applications to catch or handle Error instances.
- Exception : Represents exceptional conditions that a program should catch and handle. This is further divided into:
- Checked Exceptions (Compiletime Exceptions) : These are exceptions that must be either caught or declared in the
  method's throws clause. They are subclasses of Exception but not of RuntimeException.
- Unchecked Exceptions (RuntimeExceptions) : These are exceptions that don't need to be caught or declared. They
  typically represent programming errors or other conditions that are beyond the control of the program. They are
  subclasses of RuntimeException.

<h1>Checked Exceptions </h1>
- IOException : Represents an error occurred during I/O operations.
- FileNotFoundException : Indicates that a file could not be found.
- EOFException : Indicates that the end of a file or stream has been reached unexpectedly.
- SQLException : Indicates an error occurred while accessing a database.
- ClassNotFoundException : Indicates that a class could not be found during runtime. And many more...

<h1> Unchecked Exceptions (RuntimeExceptions) </h1>
- ArithmeticException : Indicates that an arithmetic operation has failed.
- NullPointerException : Indicates an attempt to access or invoke a method on a null object.
- ArrayIndexOutOfBoundsException : Indicates that an array has been accessed with an illegal index.
- IllegalArgumentException : Indicates that a method has been passed an illegal or inappropriate argument.
- IllegalStateException : Indicates that the application is in an inappropriate state for the requested operation.
- ClassCastException : Indicates an invalid cast operation. And many more...

<b>Best Practices </b>
- Resource Management : Use the finally block to ensure that resources like files, database connections, or network
connections are properly closed, regardless of whether an exception occurs.
- Error Cleanup : Perform any necessary cleanup operations in the finally block to leave the program or system in a
consistent state, even in the event of an error.
- Avoid Logic : Keep the finally block free from complex logic to ensure that it executes quickly and reliably. Complex
logic in the finally block can make code harder to understand and maintain.