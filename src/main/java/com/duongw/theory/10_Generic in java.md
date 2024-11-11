# GENERIC

1) Generics
   Generics trong Java giúp định nghĩa các kiểu dữ liệu tổng quát cho các lớp và phương thức, cho phép sử dụng lại mã
   nguồn với nhiều kiểu dữ liệu khác nhau mà vẫn đảm bảo an toàn về kiểu (type safety). Generics thường được sử dụng
   trong các cấu trúc dữ liệu như List, Map, Set, v.v., và trong các lớp hoặc phương thức có thể làm việc với các kiểu
   dữ liệu khác nhau
2) Lợi ích của Generics
   Generics trong Java phục vụ nhiều mục đích quan trọng:

- An toàn kiểu (Type Safety): Generics cung cấp kiểm tra kiểu dữ liệu trong thời gian biên dịch, giúp phát hiện các lỗi
  liên quan đến kiểu ngay tại thời điểm biên dịch thay vì lúc chạy. Điều này đảm bảo bạn không thể chèn sai loại đối
  tượng
  vào một container generic, giúp giảm thiểu lỗi và làm cho mã nguồn đáng tin cậy hơn.

- Tái sử dụng mã nguồn (Code Reusability): Generics cho phép bạn viết mã có thể làm việc với nhiều loại dữ liệu khác
  nhau
  mà không ảnh hưởng đến an toàn kiểu. Điều này thúc đẩy việc tái sử dụng mã nguồn, khi bạn có thể viết các lớp, giao
  diện, và phương thức tổng quát làm việc với nhiều loại dữ liệu.

- Trừu tượng hóa (Abstraction): Generics cho phép bạn viết mã linh hoạt và trừu tượng hơn, có thể làm việc với nhiều
  loại
  dữ liệu khác nhau. Điều này giúp tạo ra mã nguồn gọn gàng, dễ bảo trì và mở rộng.

- Hiệu suất (Performance): Generics có thể cải thiện hiệu suất bằng cách loại bỏ nhu cầu ép kiểu trong nhiều tình huống.
  Điều này giúp mã chạy hiệu quả hơn, đặc biệt trong các ứng dụng yêu cầu hiệu suất cao.

- Thiết kế API (API Design): Generics giúp thiết kế API linh hoạt và dễ sử dụng hơn. Bằng cách sử dụng generics, bạn có
  thể tạo ra API an toàn kiểu và cung cấp khả năng kiểm tra tốt hơn trong thời gian biên dịch, giúp cải thiện khả năng
  sử
  dụng và đọc hiểu mã.

- Nhìn chung, generics trong Java là một phần quan trọng trong việc viết mã nguồn mạnh mẽ, dễ tái sử dụng và an toàn
  kiểu.
  Chúng đóng vai trò thiết yếu trong lập trình Java hiện đại, giúp cải thiện chất lượng mã nguồn, dễ bảo trì và hiệu
  suất,
  trở thành một tính năng không thể thiếu của ngôn ngữ này.

## Sử dụng mở rộng của Generics trong java

1) Covariance là một khái niệm trong lập trình hướng đối tượng cho phép một lớp con (subclass) ghi đè một phương thức
   của
   lớp cha (superclass) với kiểu trả về là một lớp con của kiểu trả về của phương thức lớp cha. Điều này giúp tăng cường
   tính linh hoạt khi ghi đè phương thức và cho phép lớp con trả về một kiểu dữ liệu cụ thể hơn.

2) Trong Java, covariance chủ yếu được sử dụng trong bối cảnh ghi đè phương thức và các kiểu trả về trong các cấu trúc
   kế
   thừa.

3) Trong Java, covariance có thể được minh họa bằng cách sử dụng ghi đè phương thức (method overriding) và kế thừa.Ví dụ
   một lớp cha là Animal và một lớp con Dog kế thừa từ Animal. Nếu lớp Animal có một phương thức
   makeSound() trả về một đối tượng Animal, thì lớp Dog có thể ghi đè phương thức này để trả về một đối tượng Dog nhờ
   vào cơ chế covariance.

### Sử dụng Upper Bound Wildcards

Upper bound wildcards được sử dụng khi bạn muốn chỉ định rằng một kiểu dữ liệu tổng quát có thể là bất kỳ kiểu con nào
của một kiểu nhất định. Chẳng hạn, nếu bạn có một phương thức chấp nhận List của bất kỳ kiểu nào là kiểu con của Number,
bạn có thể sử dụng upper bound wildcard để chỉ định điều này.

```java 

public class Main {

    public void processNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}

```

### Sử dụng Lower Bound Wildcards

Lower Bounded Wildcards trong Java là một tính năng trong generics, cho phép nới lỏng các ràng buộc về kiểu của các đối
tượng được truyền vào phương thức. Được biểu diễn bằng cú pháp <? super T>, lower bounded wildcards cho phép một tham số
có kiểu là T hoặc bất kỳ lớp cha nào của T.

```java
import java.util.List;

public class LowerBoundedWildcardExample {

    public static void addAllNumbers(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);

        List<Integer> integers = Arrays.asList(1, 2, 3);

        addAllNumbers(numbers, integers);

        System.out.println("Combined List: " + numbers);
    }
}
```

### Unbounded Wildcards

Unbounded Wildcards trong Java là một loại wildcard trong generics, được biểu thị bằng dấu ?, để đại diện cho một kiểu
không xác định. Khi sử dụng unbounded wildcards, bạn cho phép một phương thức hoặc lớp generic chấp nhận bất kỳ kiểu nào
mà không cần quan tâm đến kiểu cụ thể.


1) using ubounded wildcards with collection

```java
import java.util.List;

public class UnboundedWildcardsExample {
    public static double sum(List<?> list) {
        double sum = 0.0;
        for (Object obj : list) {
            if (obj instanceof Number) {
                sum += ((Number) obj).doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sum(integers));
        System.out.println("Sum of doubles: " + sum(doubles));
    }
}
```


2) using ubounded wildcards with generic methods
```java
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardsExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("Hello", "World");

        System.out.print("Integers: ");
        printList(integers);

        System.out.print("Strings: ");
        printList(strings);
    }
}
```