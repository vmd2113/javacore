
# OPERATOR AND LOOP IN JAVA

## Operator
- An operator is a symbol that performs an operation on operands. In Java, operators can be classified into different types based on the number of operands they work with.

### Unary Operator
- Unary operators perform an operation on a single operand.

| Operator | Description                        | Example                     |
|----------|------------------------------------|-----------------------------|
| `+`      | Unary plus operator.               | `+a`                        |
| `-`      | Unary minus operator.              | `-a`                        |
| `!`      | Logical NOT operator.              | `!true` results in `false`  |
| `~`      | Bitwise complement operator.       | `~a` flips bits of `a`      |
| `++`     | Pre/Post-increment operator.       | `++a` or `a++`              |
| `--`     | Pre/Post-decrement operator.       | `--a` or `a--`              |

#### Example for Unary Operator:
```java
class UnaryOperatorExample {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(+a);   // Unary plus, outputs 5
        System.out.println(-a);   // Unary minus, outputs -5
        System.out.println(++a);  // Pre-increment, outputs 6
        System.out.println(a++);  // Post-increment, outputs 6 then increments
        System.out.println(a);    // Now a is 7
        System.out.println(!false); // Logical NOT, outputs true
    }
}
```

### Binary Operator
- Binary operators perform operations on two operands.

| Operator     | Description                        | Example                      |
|--------------|------------------------------------|------------------------------|
| `+`          | Addition operator.                 | `a + b`                      |
| `-`          | Subtraction operator.              | `a - b`                      |
| `*`          | Multiplication operator.           | `a * b`                      |
| `/`          | Division operator.                 | `a / b`                      |
| `%`          | Remainder operator.                | `a % b`                      |
| `&`          | Bitwise AND operator.              | `a & b`                      |
| `|`          | Bitwise OR operator.               | `a | b`                      |
| `^`          | Bitwise XOR operator.              | `a ^ b`                      |
| `>>`         | Right shift operator.              | `a >> 1`                     |
| `<<`         | Left shift operator.               | `a << 1`                     |
| `==`         | Equality operator.                 | `a == b`                     |
| `!=`         | Inequality operator.               | `a != b`                     |
| `<`          | Less than operator.                | `a < b`                      |
| `<=`         | Less than or equal to operator.    | `a <= b`                     |
| `>`          | Greater than operator.             | `a > b`                      |
| `>=`         | Greater than or equal to operator. | `a >= b`                     |
| `&&`         | Logical AND operator.              | `a && b`                     |
| `||`         | Logical OR operator.               | `a || b`                     |

#### Example for Binary Operator:
```java
class BinaryOperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a + b);  // Outputs 15 (Addition)
        System.out.println(a - b);  // Outputs 5 (Subtraction)
        System.out.println(a * b);  // Outputs 50 (Multiplication)
        System.out.println(a / b);  // Outputs 2 (Division)
        System.out.println(a % b);  // Outputs 0 (Remainder)
        System.out.println(a > b);  // Outputs true (Comparison)
    }
}
```

## Loop
- Loops are used to repeat a block of code until a specific condition is met. Java has three main types of loops: `while`, `for`, and `do-while` loops.

### While loop
- The `while` loop executes a block of code as long as the condition is `true`.

```java
class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

### For loop
- The `for` loop is used when the number of iterations is known beforehand.

```java
class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

### Do-while loop
- The `do-while` loop is similar to the `while` loop, but it ensures the block of code is executed at least once.

```java
class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
```

## Break and Continue
- `break`: Terminates the loop.
- `continue`: Skips the current iteration and continues with the next.

```java
class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;  // Exits loop when i is 3
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;  // Skips printing 3
            }
            System.out.println(i);
        }
    }
}
```

## Switch Statement
- The `switch` statement allows you to execute one block of code out of many based on the value of an expression.

```java
class SwitchStatementExample {
    public static void main(String[] args) {
        int i = 3;
        switch (i) {
        case 1:
            System.out.println("i is 1");
            break;
        case 2:
            System.out.println("i is 2");
            break;
        case 3:
            System.out.println("i is 3");
            break;
        default:
            System.out.println("i is not 1, 2, or 3");
            break;
        }
    }
}
```

## If Statement
- The `if` statement checks a condition and executes the block of code if the condition is `true`.

```java
class IfStatementExample {
    public static void main(String[] args) {
        int i = 3;
        if (i == 3) {
            System.out.println("i is 3");
        } else if (i == 2) {
            System.out.println("i is 2");
        } else {
            System.out.println("i is not 1 or 2");
        }
    }
}
```
