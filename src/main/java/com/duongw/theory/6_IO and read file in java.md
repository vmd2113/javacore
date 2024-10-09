# IO AND READ FILE IN JAVA

## Input and output

- Input and output (I/O) is the process of transferring data between a computer and a device, such as a printer or a
  keyboard.

### Input

- Input is the process of transferring data from a device to a computer.
    - Keyboard input
    - Mouse input
    - Scanner input

### Output

- Output is the process of transferring data from a computer to a device.
  <br>


* Use scanner

```java
// Java program to demonstrate input and output

import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        // syntax to declare input and output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}


```

Lỗi khi đọc chuỗi và số: Khi sử dụng nextInt() hay nextDouble() và tiếp theo là nextLine(), có thể gặp lỗi do bộ đệm
không được làm sạch hoàn toàn. Điều này xảy ra khi một số nguyên hoặc số thực không đọc hết dòng, gây nhầm lẫn trong các
lần đọc sau đó.



```java
import java.util.Scanner;

public class ScannerIssueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int intValue = scanner.nextInt();

        // Tiêu thụ ký tự xuống dòng còn lại bởi nextInt()
        scanner.nextLine();

        System.out.print("Nhập một chuỗi: ");
        String stringValue = scanner.nextLine();

        System.out.println("Số nguyên: " + intValue);
        System.out.println("Chuỗi: " + stringValue);

        scanner.close();
    }
}
```

Use BufferReader

```java
// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
	public static void main(String[] args)
		throws IOException
	{
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}
} 
```
## Read file

- Read file is the process of reading data from a file.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```


```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```


## Write file

- Write file is the process of writing data to a file.

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, BufferedWriter!");
            writer.newLine();  // Tạo dòng mới
            writer.write("Java I/O rất linh hoạt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```
