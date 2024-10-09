
### HƯỚNG ĐỐI TƯỢNG (OOP)
- Đối tượng: một thực thể (có phương thức - thuộc tính)
- Phân biệt: Class - Object - Instance - Reference

<h4>Class: là một lớp mẫu (blueprint) sử dụng nhằm tạo ra và xây dựng các đối tượng, định nghĩa các thuộc tính (properties) + phương thức (method)</h4>
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
}

```

Object (đối tượng) là một thể hiện của class (có thể gọi là con của class) có những thuộc tính và phương thức cụ thể. Được lưu trữ và tồn tại trong bộ nhớ máy tính
```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red");
        car1.displayInfo(); // Output: Model: Toyota, Color: Red
    }
}

```

Instance là một thể hiện cụ thể rõ ràng của một lớp (tương tự như Object) nhưng dùng Instance ở đây thể hiện đối tượng được tạo ra từ một class cụ thể
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
Reference: là một biến lưu trữ  địa chỉ của đối tượng. Nó trỏ đến vị trí bộ nhớ của đối tượng được lưu trữ, thông qua tham chiếu chúng ta có thể truy cập và thao  tác với đối tượng
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
<h2>Static variable and Instance</h2>
- khi

<h4> Override method và overriding method </h4>
