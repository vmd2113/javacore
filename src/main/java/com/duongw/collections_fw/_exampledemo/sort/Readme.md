#  Comparator và Comparable in Java

Java cung cấp hai interface chính, `Comparable` và `Comparator`, để so sánh các đối tượng trong Collection. Cả hai có các ứng dụng và mục đích khác nhau trong việc sắp xếp đối tượng.

## 1. `Comparable` interface
`Comparable` là một interface được dùng để định nghĩa thứ tự tự nhiên của một đối tượng trong Java. Khi một lớp triển khai `Comparable`, lớp đó có thể tự sắp xếp đối tượng của chính nó.

```java
public class ClassNameComparator implements Comparator<ClassName> {
    @Override
    public int compare(ClassName o1, ClassName o2) {
        // logic so sánh
    }
}

``` 
## 2. `Comparator` interface
`Comparator` cho phép so sánh đối tượng mà không yêu cầu đối tượng triển khai interface này. Điều này rất hữu ích khi cần sắp xếp đối tượng theo nhiều tiêu chí khác nhau mà không làm thay đổi cấu trúc của lớp gốc.
```java
public class ClassNameComparator implements Comparator<ClassName> {
    @Override
    public int compare(ClassName o1, ClassName o2) {
        // logic so sánh
    }
}

```
| **Đặc Điểm**          | **Comparable**         | **Comparator**                                   |
|-----------------------|------------------------|--------------------------------------------------|
| **Interface**         | `java.lang.Comparable` | `java.util.Comparator`                           |
| **Phương thức**       | `compareTo(Object o)`  | `compare(Object o1, Object o2)`                  |
| **Sắp xếp tự nhiên**  | Có                     | Không                                            |
| **Sắp xếp tùy chỉnh** | Không                  | Có                                               |
| **Nhiều tiêu chí**    | Không                  | Có thể tạo nhiều `Comparator` cho nhiều tiêu chí |


