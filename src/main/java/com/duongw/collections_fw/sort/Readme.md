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
| Tiêu chí          | Comparable                                                  | Comparator                                                |
|-------------------|-------------------------------------------------------------|-----------------------------------------------------------|
| **Mục đích**      | Định nghĩa cách sắp xếp mặc định cho đối tượng.             | Tạo các tiêu chí sắp xếp linh hoạt khác nhau.             |
| **Package**       | `java.lang`                                                 | `java.util`                                               |
| **Phương thức**   | `compareTo()`                                               | `compare()`                                               |
| **Sử dụng**       | Implement trực tiếp trong class của đối tượng.              | Thường được sử dụng như một class riêng hoặc lambda.      |
| **Tính năng**     | Giới hạn với một cách sắp xếp mặc định.                     | Cho phép định nghĩa nhiều tiêu chí sắp xếp.               |
| **Thay đổi code** | Cần thay đổi trong class của đối tượng để áp dụng.          | Có thể thay đổi sắp xếp mà không sửa class của đối tượng. |
| **Ứng dụng**      | Tốt cho sắp xếp mặc định đơn giản, ví dụ sắp xếp theo `id`. | Tốt cho sắp xếp đa tiêu chí (tuổi, tên, lương, v.v.).     |



<span> <i>trong thực tế, sử dụng comparator và ứng dụng hơn so với Comparable</i> </span>
Đây là một số cách triển khai comparator

<h2> Sử dụng Class riêng </h2>

```java
import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}



public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Duong", 18));
        personList.add(new Person(2, "Thi", 19));
        personList.add(new Person(3, "Hong", 20));

        // Sắp xếp theo tên sử dụng PersonNameComparator
        Collections.sort(personList, new PersonNameComparator());
        System.out.println("Danh sách sau khi sắp xếp theo tên:");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Sắp xếp theo tuổi sử dụng PersonAgeComparator
        Collections.sort(personList, new PersonAgeComparator());
        System.out.println("\nDanh sách sau khi sắp xếp theo tuổi:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}


```

<h2> Sử dụng anonymous class </h2>

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Duong", 18));
        personList.add(new Person(2, "Thi", 19));
        personList.add(new Person(3, "Hong", 20));

        // Sắp xếp theo tên
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        // Sắp xếp theo tuổi
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
    }
}

```

<h2> Sử dụng lambda </h2>

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Duong", 18));
        personList.add(new Person(2, "Thi", 19));
        personList.add(new Person(3, "Hong", 20));

        // Sắp xếp theo tên
        personList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Sắp xếp theo tuổi
        personList.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    }
}

```

<h2> Sử dụng method reference </h2>

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Duong", 18));
        personList.add(new Person(2, "Thi", 19));
        personList.add(new Person(3, "Hong", 20));

        // Sắp xếp theo tên
        personList.sort(Comparator.comparing(Person::getName));

        // Sắp xếp theo tuổi
        personList.sort(Comparator.comparingInt(Person::getAge));
    }
}

```
<h2> Sử dụng Comparator.comparing </h2>


```java
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Duong", 18));
        personList.add(new Person(2, "Thi", 19));
        personList.add(new Person(3, "Hong", 20));

        // Sắp xếp theo tên, sau đó theo tuổi nếu tên trùng nhau
        personList.sort(Comparator.comparing(Person::getName)
                                  .thenComparing(Person::getAge));
    }
}

```

