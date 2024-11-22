# Java OOP Concepts

## **Java Object-Oriented Programming (OOP)**

OOP là một phương pháp lập trình dựa trên khái niệm về các **đối tượng** (*objects*), mỗi đối tượng là một thực thể chứa
**thuộc tính** (*attributes*) và **phương thức** (*methods*). Dưới đây là các khái niệm cơ bản và các tính chất của OOP.

---

## **1. Class, Object, Instance, và Reference**

### **1.1. Class**

- **Định nghĩa**: `Class` là một khuôn mẫu (*blueprint*) để tạo ra các đối tượng (*objects*). Nó định nghĩa các thuộc
  tính và hành vi của đối tượng.
- **Ví dụ**:

```java
public class Car {
    private String color;
    private String model;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}
```

### **1.2. Object**

- **Định nghĩa**:`Object` (đối tượng) là một thể hiện của class (*class instance*) (có thể gọi là con của class) lưu trữ
  những thuộc tính và phương thức cụ thể và được lưu trữ và tồn tại trong bộ nhớ máy tính

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red");
        car1.displayInfo(); // Output: Model: Toyota, Color: Red
    }
}

```

### **1.3. Instance**

- **Định nghĩa**: `Instance` là một đối tượng cụ thể rõ ràng của một lớp (tương tự như Object) nhưng dùng Instance ở đây
  thể hiện đối tượng trong lúc runtime
  được tạo ra từ một class cụ thể
- ***So sánh Object vs Instance**:
  `Object` là kết quả của việc tạo một `Instance`.
  `Instance` tập trung vào quá trình và bản chất của việc tạo một đối tượng từ lớp.

```java
public class Car {
    private String color;
    private String model;

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    {
        Car car1 = new Car("Toyota", "Red");
    }
}



```

### **1.4. Reference**

- **Định nghĩa**: `Reference` là một biến lưu trữ địa chỉ của đối tượng. Nó trỏ đến vị trí bộ nhớ của đối tượng được lưu
  trữ, thông qua
  tham chiếu chúng ta có thể truy cập và thao tác với đối tượng

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red"); // car1 là reference trỏ đến đối tượng Car
        Car car2 = car1; // car2 tham chiếu đến cùng một đối tượng như car1

        car2.displayInfo(); // Output: Model: Toyota, Color: Red
        car1.displayInfo(); // Output: Model: Toyota, Color: Red
    }
}

```

| Thuật ngữ | Ý nghĩa                                                                  | Ví dụ                           |
|-----------|--------------------------------------------------------------------------|---------------------------------|
| Class     | Khuôn mẫu để tạo đối tượng.                                              | Car                             |
| Object    | Thể hiện cụ thể của class, tồn tại trong bộ nhớ.                         | car1 = new Car("Toyota", "Red") |
| Instance  | Một đối tượng được tạo từ một class cụ thể, thường nhấn mạnh ở runtime.  | Giống như Object.               |
| Reference | Biến chứa địa chỉ bộ nhớ của đối tượng, cho phép thao tác với đối tượng. | car1 hoặc car2.                 |

## **Shallow Copy vs Deep Copy (OOP)**

- **Shallow Copy**: Sao chép nông, Sao chép nông chỉ sao chép tham chiếu đến các thuộc tính, không tạo bản sao thực sự
  của đối tượng.

```java

public class Car {
    private String color;
    private String model;

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

        // sử dụng sao chép nông
    }

    {
        Car car1 = new Car("Toyota", "Red");
        Car car2 = car1;
        // như vậy thì car1 và car2 tham chiếu đến cùng một đối tượng và khi thay đổi thuộc tính của một trong hai đối tượng thì cả hai đối tượng sẽ thay đổi

        /**có một các để thực hiện thay đổi và một đối tượng được tham chiếu cùng một hoặc nhiều đối tượng khác đó là: sử dụng
         *
         */
    }


    {
        // đây là thực hiện sao chép sâu
        Car car1 = new Car("Toyota", "Red");
        Car car2 = new Car(car1); // Tạo bản sao sâu

        car2.color = "Blue"; // Thay đổi màu của car2

        car1.displayInfo(); // Model: Toyota, Color: Red
        car2.displayInfo(); // Model: Toyota, Color: Blue
    }
}
```

# **Deep Clone trong Java**

## **1. Khái niệm Deep Clone**

- **Deep Clone** (sao chép sâu) là quá trình tạo ra một bản sao hoàn chỉnh của một đối tượng bao gồm cả các đối tượng mà
  nó tham chiếu đến.
- Các thuộc tính kiểu đối tượng (reference type) cũng được sao chép hoàn toàn, thay vì chỉ sao chép địa chỉ tham chiếu
  như trong **Shallow Clone** (sao chép nông).

---

## **2. Các cách thực hiện Deep Clone**

### **2.1. Sử dụng Constructor**

Cách đơn giản nhất để thực hiện Deep Clone là sử dụng một constructor sao chép, tự mình sao chép từng thuộc tính.

```java
class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address(Address address) {
        this.street = address.street;
        this.city = address.city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = new Address(address); // Sao chép sâu
    }

    public Person(Person person) {
        this.name = person.name;
        this.address = new Address(person.address); // Sao chép sâu
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Hanoi");
        Person person1 = new Person("John", address);
        Person person2 = new Person(person1);

        person2.address = new Address("456 Second St", "Saigon");

        System.out.println(person1); // Output: John lives at 123 Main St, Hanoi
        System.out.println(person2); // Output: John lives at 456 Second St, Saigon
    }
}


```

## **OOP in Java**

<h3> Khái niệm lập trình hướng đối tượng trong java</h3>
Lập trình Hướng Đối Tượng là một mô hình lập trình dựa trên các đối tượng (objects) – những thực thể bao gồm dữ liệu (thuộc tính) và các hành vi (phương thức). OOP tổ chức chương trình bằng cách chia thành các lớp (classes), nơi mỗi lớp biểu diễn một loại đối tượng cụ thể.

Đặc điểm chính:

- Dữ liệu và hành vi được đóng gói trong đối tượng.
- Sử dụng các tính chất chính: Đóng gói, Kế thừa, Đa hình, Trừu tượng hóa.
- Có thể bảo vệ dữ liệu nhờ tính đóng gói.
- Dễ mở rộng và bảo trì nhờ sử dụng kế thừa và đa hình.

### **1.1. Đóng gói** Encapsulation

<h4> Định nghĩa</h4> 
<p>Đóng gói là quá trình ẩn các thuộc tính chi tiết khi triển khai một đối tượng, chỉ cung các các phướng thức truy cập đối tượng đó (bao gồm `getter`, `setter`). Nó đảm bảo tính bảo mật và kiểm soát việc truy cập dữ liệu từ bên trong của từng đối tượng</p>

```java

class Account {

    // Attributes
    private String accountNumber;
    private double balance;


    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter và Setter kiểm soát truy cập
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // functions

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }


}

```

### **1.2. Kế thừa** Inheritance

<h4> Định nghĩa</h4> 
<p>Kế thừa là một đặc tính cho phép một lớp được thừa kế các thuộc tính và phương thức của một lớp cha. Hỗ trợ tái sử duụng mã nguồn và giảm thiểu dư thừa</p>
<p>Key: extends</p>
- object class: default superclass

<h4> Relationships</h4>
- is-a: Mối quan hệ is-a thể hiện tính kế thừa (inheritance). Một lớp con (subclass) được xem là một loại (a type) của lớp cha (superclass).
Mối quan hệ này thường được sử dụng khi một lớp cần kế thừa hành vi (methods) hoặc thuộc tính (fields) từ một lớp khác.
- has-a:Mối quan hệ has-a thể hiện thành phần (composition). Một lớp sở hữu một (hoặc nhiều) đối tượng của lớp khác làm thành phần.

```java

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

```

### **1.3. Đa hình** Polymorphism

<h4> Định nghĩa</h4>
<p> Đa hình là đặc tính cho phép một đối có thể tái định nghĩa phương thức của một đối tượng để sử dụng thông qua overriding và overloading</p>

```java
//@Overloading: sử dụng các phương thức có cùng tên nhưng có các tham số/ đầu vào khác nhau nhằm thực đa dạng hóa mục đích thực hiện.
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

//@Overriding: thực hiện ghi đè, tái định nghĩa phương thức của một lớp mà nó extends, hoặc implement
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}




```

### **1.4. Trừu tượng** Abstraction

<h4> Định nghĩa</h4>

- Trừu tượng hóa là quá trình che giấu các chi tiết triển khai và chỉ hiển thị những thông tin quan trọng. Nó thường
  được thực hiện thông qua abstract class và interface. Với abstract class có thể có thuộc tính nhằm mục địch chia sẻ
  những thuộc tính có tính khuôn mẫu</p>
- Một lớp trừu tượng là một lớp không thể được khởi tạo trực tiếp. Nó có thể chứa cả phương thức trừu tượng (không có
  thân) và phương thức cụ thể (có thân).
- Được khai báo bằng từ khóa abstract.

- khi lớp con thực hiện kế thừa lớp abstract, các phương thức của lớp cha phải được override trong lớp con. trừ khi lớp
  con là một lớp trừu tượng

```java
abstract class Animal {
    static String areas = "Asia";

    String name;
    String sound;

    abstract void sound(); // Phương thức trừu tượng

    void eat() { // Phương thức cụ thể
        System.out.println("This animal eats food.");
    }
}


```

```java
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment(); // Phương thức trừu tượng

    void printReceipt() { // Phương thức cụ thể
        System.out.println("Payment of $" + amount + " processed.");
    }
}

class PayPalPayment extends Payment {
    String email;

    PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment for " + email);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment for card: " + cardNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new PayPalPayment(100, "user@example.com");
        payment1.processPayment();
        payment1.printReceipt();

        Payment payment2 = new CreditCardPayment(200, "1234-5678-9876-5432");
        payment2.processPayment();
        payment2.printReceipt();
    }
}

```

<h4> Interface </h4>

- là một bản thiết kế hoàn toàn trừu tượng của một lớp. Nó định nghĩa một tập hợp các phương thức mà một lớp phải thực
  hiện nếu muốn triển khai giao diện đó. Giao diện không chứa bất kỳ thực thi cụ thể nào cho các phương thức này, mà chỉ
  cung cấp một hợp đồng (contract) mà các lớp con phải tuân thủ.

- Sau Java 8, interface có thể định nghĩa cho phương thức: sử dụng static, default method
- Sau Java 9, Private methods có thể có thân để hỗ trợ việc tái sử dụng logic trong default và static methods.

Default Method:

Dùng để cung cấp phương thức mặc định mà lớp thực thi có thể sử dụng hoặc ghi đè.
Thích hợp để mở rộng giao diện mà không phá vỡ các lớp đã triển khai.

```java
interface Animal {
    void makeSound();

    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof!
        dog.eat();       // Output: This animal eats food.
    }
}

```

Dùng để cung cấp logic tiện ích không liên quan đến đối tượng của interface.
Không thể bị ghi đè bởi các lớp thực thi.

```java
interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathOperations.add(5, 3);
        System.out.println(result); // Output: 8
    }
}

```

Private Method (từ Java 9):

Dùng để chia sẻ logic chung giữa các phương thức default và static.
Không thể gọi từ bên ngoài interface hoặc lớp thực thi.

```java
interface Logger {
    default void logInfo(String message) {
        log("INFO: " + message);
    }

    default void logError(String message) {
        log("ERROR: " + message);
    }

    private void log(String message) {
        System.out.println(message);
    }
}

class ApplicationLogger implements Logger {
}

public class Main {
    public static void main(String[] args) {
        ApplicationLogger logger = new ApplicationLogger();
        logger.logInfo("Application started."); // Output: INFO: Application started.
        logger.logError("An error occurred.");  // Output: ERROR: An error occurred.
    }
}

```

<h4> Sự khác nhau giữa lớp trừu tượng (abstract class) và interface</h4>

| **Tiêu chí**         | **Interface**                                                                  | **Abstract Class**                                                               |
|----------------------|--------------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| **Mục đích sử dụng** | Định nghĩa một tập hợp các hành vi mà lớp thực thi (implement) phải tuân theo. | Được sử dụng để chia sẻ các phương thức chung và để thực hiện tính trừu tượng.   |
| **Tính kế thừa**     | Một lớp có thể implement nhiều interface.                                      | Một lớp chỉ có thể kế thừa một abstract class (Java không hỗ trợ đa kế thừa).    |
| **Loại phương thức** | - Chỉ chứa các phương thức abstract trước Java 8.                              | - Có thể chứa cả abstract và non-abstract methods (các phương thức có thực thi). |
|                      | - Từ Java 8, có thể có default và static methods.                              |                                                                                  |
|                      | - Từ Java 9, có thể có private methods.                                        |                                                                                  |
| **Thuộc tính**       | - Các thuộc tính mặc định là public static final (hằng số).                    | - Có thể có cả thuộc tính instance và static với phạm vi truy cập khác nhau.     |
|                      | - Không thể có các biến instance.                                              |                                                                                  |
| **Từ khóa sử dụng**  | `interface`, `implements`.                                                     | `abstract`, `extends`.                                                           |
| **Tốc độ thực thi**  | Chậm hơn do phải thực hiện tra cứu tại runtime.                                | Nhanh hơn vì đã được định nghĩa cụ thể một phần.                                 |
| **Constructor**      | Không có constructor.                                                          | Có thể có constructor (được sử dụng cho việc khởi tạo các thuộc tính chung).     |
| **Phạm vi ứng dụng** | - Khi các lớp thực thi cần tuân thủ một tập hợp hành vi.                       | - Khi các lớp chia sẻ logic chung nhưng cần sự trừu tượng ở một số phương thức.  |
|                      | - Khi cần hỗ trợ đa kế thừa.                                                   |                                                                                  |

<h4> khi nào sử dụng interface và abstract class</h4>

1. Sử dụng abstract class:

- khi có sự liên quan chặt chẽ giữa các lớp con: Dùng abstract class khi bạn cần chia sẻ một logic hoặc thuộc tính chung
  giữa các lớp con. Các lớp con có một quan hệ "is-a" với abstract class.
- có logic chung cần chia sẻ giữ các lớp con: Abstract class cho phép viết cashc phương thức có thực thi để các lớp con
  có thể tái sử dụng
- cần sử dụng thuộc tính hoặc constructor: Abstract class cung cấp các biến instance giúp chúng ta dễ dàng thực thi các
  logic chung.

```java
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


abstract class Shape {
    public void displayAreaFormula() {
        System.out.println("Area formula varies for different shapes.");
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

```

2. Sử dụng interface:

- Không có logic chung giữa các lớp: Khi các lớp con không có ràng buộc và liên kết rõ ràng, nhưng cần tuân theo một số
  quy đình cụ thể
- khi lớp này cần định nghĩa một tập phương thức (có thể thực hiện)
- Cần hỗ trợ đa kế thừa
- tái định nghĩa mối quan hệ giữa cch thành phần trong hệ thống (sử dụng dependency injection)

```java
class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

interface Flyable {
    void fly();
}

class Bat extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bat can fly.");
    }
}


interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird can fly.");
    }
}

class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish can swim.");
    }
}

```

<h4> So sánh constructor và phương thức</h4>

1. Constructor

**Khái niệm**:

- Constructor là một phương thức đặc biệt trong một lớp, được gọi tự động khi một đối tượng của lớp được tạo.
- Constructor dùng để khởi tạo giá trị ban đầu cho các thuộc tính (fields) của đối tượng.

  **Đặc điểm**:
- Tên của constructor trùng với tên của lớp.
- Không có kiểu trả về (không khai báo kiểu trả về, kể cả void).
- Được gọi tự động khi sử dụng từ khóa new để tạo đối tượng.
- Nếu bạn không định nghĩa constructor, Java sẽ cung cấp một constructor mặc định (default constructor).

**Các loại constructor**

- default constructor: Không có constructor nào được khai báo trong lớp.
- parameterized constructor:
- constructor overloading:

2. Phương thức
   **Khái niệm**:

- Phương thức (method) là một khối mã thực hiện một nhiệm vụ cụ thể và có thể được gọi nhiều lần trong chương trình.
- Nó tương tự như một hàm trong các ngôn ngữ lập trình khác, nhưng được gắn liền với một lớp hoặc đối tượng.

  **Đặc điểm**:
- Phương thức có thể có kiểu trả về hoặc không (trường hợp không có, dùng từ khóa void).
- Có thể nhận tham số đầu vào để thực hiện nhiệm vụ.
- Được gọi thông qua tên của phương thức và có thể thông qua đối tượng.

  <h4> Quy tắc đặt tên biến trong java </h4>

| **Thành phần**  | **Quy tắc**                                  | **Ví dụ**                       |
|-----------------|----------------------------------------------|---------------------------------|
| **Biến**        | camelCase, rõ ràng, dễ hiểu                  | `userName`, `isActive`          |
| **Tham số**     | camelCase, đặt tên ngữ nghĩa rõ ràng         | `userName`, `accountBalance`    |
| **Phương thức** | camelCase, bắt đầu bằng động từ, rõ mục đích | `getUserName`, `calculateTotal` |
| **Package**     | lowercase, tổ chức theo tên miền đảo ngược   | `com.example.project.module`    |










