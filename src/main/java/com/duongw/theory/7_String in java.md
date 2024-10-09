# STRING TRONG JAVA

1) String data type

- there are two ways to declare String in java (Using Literals | Using `new` operator)
  (should use Literals instead of using `new` operator
  In short: literals use String pool to perform management, when comparing 2 identical strings, it will return True
  result, and when performing storage, it takes less memory than when using `new` operator)

- Convert a String object to String pool:

```java
public class StringExample {

    public static void main(String[] args) {
        // sử dụng intern() method để thực hiện chuyển một đối tượng sang string pool
        String a = "hello";
        String a_obj = new String().intern();
        System.out.print(a == a_obj);

        // concat() method

        String hello = "hello" + " world";
        String concatHello = "hello".concat("").concat("world");

        // String("") != String null

        // Can use unicode char values inside String

        // Finding the length of a Strng

        int length_a_string = a.length();

        // Comparing String
        // boolean

        String str1 = "Duong";
        String str2 = "DUONG";
        String str3 = "VDuong";

        boolean isSame = str1.equals(str2); // false
        boolean isSame2 = str1.equalsIgnoreCase(str2); //true
        boolean isSame3 = str1.equals(str3); // false

        // int -> using order in Unicode order (j befor p)
        String test1 = "java";
        String test2 = "python";
        int comparison1 = test1.compareTo("java"); // = 0
        int comparison2 = test1.compareTo(test2); // <0 and result  -
        int comparison3 = test2.compareTo(test1); // >0 and result  + 

        // fetch a character at an index in String
        String java = "JAVA";
        char j = java.charAt(0); //J

        // check string is empty;
        boolean isEmpty = java.isEmpty();
        boolean isEmpty2 = java.length() == 0;

        // using equal()
        // changing the case in String

        String uperCase = java.toUpperCase();
        String lowerCase = java.toLowerCase();

        // convert String as values;

        int value = 32;
        String value_ = String.valueOf(value);

        int age = 30;
        String age_ = "" + age;

        // searchin method;
        String helloWorld = "hello world";
        // indexOf(Str) : find index of the first occurence
        int index = helloWorld.indexOf("world");

        // contain() method
        boolean isContain = helloWorld.contains("world");// true
        boolean isContain2 = helloWorld.contains("word");  //false
        // startWith(str) and endWith(str)
        boolean isStartWith = helloWorld.startsWith("hello"); //true;
        boolean isEndWith = helloWorld.endsWith("d");

        // matches() method: used for more comple pattern maching using regular expressions
        boolean isMatch = helloWorld.matches(".*world.*");

        // trimming a string: to remove spaccing head and tail of String

        String name = "  Van Minh Duong  ";
        String name = name.trim();

        //fetching substring in string in java
        String substring1 = originalString.substring(7);
        System.out.println("Substring from index 7: " + substring1); // Output: World!

        // Lấy chuỗi con từ vị trí 0 đến 5 (chỉ số 5 không được bao gồm)
        String substring2 = originalString.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2); // Output: Hello

        // Lấy chuỗi con từ vị trí 7 đến 12 (chỉ số 12 không được bao gồm)
        String substring3 = originalString.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring3); // Output: World

        // replacing string in java
        String originalString = "Hello, World!";

        // Thay thế tất cả các ký tự 'o' bằng 'a'
        String replacedString1 = originalString.replace('o', 'a');
        System.out.println("Replaced String 1: " + replacedString1); // Output: Hella, Warld!

        // Thay thế chuỗi "World" bằng "Java"
        String replacedString2 = originalString.replace("World", "Java");
        System.out.println("Replaced String 2: " + replacedString2); // Output: Hello, Java!

        String originalString = "cat bat rat mat";

        // Thay thế tất cả các từ kết thúc bằng 'at' bằng 'dog'
        String replacedString = originalString.replaceAll("\\bat\\b", "dog");
        System.out.println("Replaced String: " + replacedString); // Output: cat dog rat mat


        String originalString = "cat bat rat mat";

        // Thay thế lần xuất hiện đầu tiên của từ kết thúc bằng 'at' bằng 'dog'
        String replacedString = originalString.replaceFirst("\\bat\\b", "dog");
        System.out.println("Replaced String: " + replacedString); // Output: cat dog rat mat

        // split strings

        String part[] = originalString.split(" ");

        //joining strings

        String result = String.join(" ", part);
        // format String
        /**
         public static String format(String format, Object... args)
         public static String format(Locale locale, String format, Object... args)
         Các mẫu định dạng sử dụng ký tự % để chỉ định chỗ đặt các giá trị. Một số mẫu định dạng thông dụng bao gồm:
         %d: Số nguyên (integer).
         %f: Số thực dấu phẩy động (floating-point).
         %s: Chuỗi (string).
         %c: Ký tự (character).
         %b: Giá trị boolean.*/
        String name = "John";
        int age = 25;
        double salary = 12345.6789;

        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(formattedString);


    }
}


```

### SỰ KHÁC BIỆT STRING VÀ STRING BUILDER KHI THỰC HIỆN NỐI CHUỖI

<br>
*String: là một kiểu dữ liệu <i>imutable</i> <br>
*String builder: cho phép thao tác trên một đối tượng duy nhất và thay đổi nội dung liên tục


<br>
* Chương trình so sánh thời gian thực thi chương trình khi sử dụng String và String builder khi thực hiện nối chuỗi 
<br>

```java
package com.morphine;

public class _5_stringbuilder {
    public static void main(String[] args) {
        long start = System.nanoTime();

        String s = "Hello";
        for (int i = 0; i < 1000; i++) {
            s += " world";
        }
        long end = System.nanoTime();
        System.out.println("Total time: " + (end - start));


        long startStringBuilder = System.nanoTime();

        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 1000; i++) {
            sb.append(" world");
        }
        String string_sb = sb.toString();
        long endStringBuilder = System.nanoTime();
        System.out.println("Total time: " + (endStringBuilder - startStringBuilder));
    }
}

```

  