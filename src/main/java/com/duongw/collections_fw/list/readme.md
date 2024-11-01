# LIST

List là một trong những interface chính trong Java Collection Framework, cung cấp một cấu trúc dữ liệu có thứ tự, cho
phép các phần tử trùng lặp. Nó là một interface con của Collection và có các class phổ biến như ArrayList, LinkedList,
Vector, và Stack.

Interface List trong Java đại diện cho một collection có thứ tự của các phần tử. List cho phép các phần tử trùng lặp và
duy trì thứ tự chèn, tức là các phần tử được lưu trữ theo thứ tự chúng được thêm vào. Nó mở rộng interface Collection và
bao gồm các phương thức đặc biệt để truy cập và thao tác theo vị trí.

Các đặc điểm chính của List

- Thứ tự - List lưu trữ các phần tử theo thứ tự chèn vào.
- Trùng lặp - Cho phép các phần tử trùng lặp.
- Vị trí - List hỗ trợ truy cập phần tử qua vị trí (index), với các phương thức như get(), set(), add(), và remove() dựa
  trên chỉ mục.

### ARRAYLIST

`ArrayList` là một class cụ thể triển khai interface List trong Java. Nó được sử dụng rộng rãi để lưu trữ một danh sách
các phần tử có thể thay đổi kích thước, duy trì thứ tự chèn và cho phép các phần tử trùng lặp.


<h3> Đặc điểm của ArrayList </h3>

1) Truy cập nhanh bằng index - Nhờ vào cấu trúc mảng bên trong, ArrayList cho phép truy cập các phần tử rất nhanh bằng
   chỉ số (index).
2) Tăng kích thước tự động - Khi số lượng phần tử vượt quá sức chứa hiện tại, ArrayList tự động tăng kích thước lên
   khoảng 50%.
3) Không đồng bộ (Non-synchronized) - ArrayList không an toàn cho các hoạt động đa luồng vì nó không đồng bộ. Tuy nhiên,
   nếu cần đồng bộ, chúng ta có thể sử dụng Collections.synchronizedList() để tạo một ArrayList đồng bộ.
   Chứa các phần tử trùng lặp - ArrayList cho phép thêm các phần tử trùng lặp vào danh sách.

<h3> So sánh với List </h3>

| Aspect             | ArrayList                                           | List                                                                                          |
|--------------------|-----------------------------------------------------|-----------------------------------------------------------------------------------------------|
| Definition         | Concrete class implementing List interface.         | Interface defining a list data structure.                                                     |
| Data Structure     | Uses a resizable array as the underlying structure. | No specific data structure; it's an abstraction.                                              |
| Performance        | Fast random access due to array structure.          | Depends on the specific implementation (like ArrayList, LinkedList).                          |
| Synchronization    | Not synchronized (thread-unsafe).                   | Depends on the implementation; List interface itself does not enforce synchronization.        |
| Flexibility        | Fixed to ArrayList functionality.                   | List can be implemented by different classes like ArrayList, LinkedList, etc.                 |
| Instantiation      | Can be instantiated directly.                       | Cannot be instantiated directly; only interfaces can be instantiated through implementations. |
| Duplicate Elements | Allows duplicates.                                  | Allows duplicates if the implementation supports it.                                          |
| Ordering           | Maintains insertion order.                          | Ordering depends on the specific implementation.                                              |

<h3> Việc sử dụng </h3>

- Khi cần truy cập phần tử nhanh - ArrayList có tốc độ truy cập nhanh nhờ vào cấu trúc mảng bên trong.
- Khi không cần đồng bộ hóa - ArrayList không đồng bộ, nên nếu không có nhu cầu sử dụng trong môi trường đa luồng thì
  đây là một lựa chọn tốt.
- Khi thêm/xóa phần tử ở cuối - ArrayList hoạt động tốt khi thêm/xóa phần tử ở cuối danh sách, vì không cần di chuyển
  các phần tử khác.

### LINKEDLIST

là một class triển khai List `interface` và sử dụng cấu trúc dữ liệu liên kết. Trong cấu trúc liên kết này, mỗi phần
tử (
node) chứa giá trị của chính nó và một tham chiếu đến phần tử kế tiếp trong danh sách. `LinkedList` hỗ trợ các thao tác
nhanh ở đầu và cuối danh sách, nhưng truy cập phần tử theo chỉ mục sẽ chậm hơn so với `ArrayList`.


<h3> Đặc  điểm của linked </h3>

1) Cấu trúc liên kết kép (Doubly Linked List) - LinkedList trong Java được triển khai dưới dạng doubly linked list,
   nghĩa là mỗi node có tham chiếu đến cả node trước và node sau nó.
2) Hiệu quả cho thêm/xóa đầu và cuối - Các thao tác thêm và xóa ở đầu hoặc cuối danh sách trong LinkedList là rất nhanh,
   vì chúng chỉ cần cập nhật các tham chiếu.
3) Không đồng bộ (Non-synchronized) - Tương tự như ArrayList, LinkedList cũng không đồng bộ và không an toàn trong môi
   trường đa luồng.

<h3> So sánh với ArrayList </h3>

| Aspect                        | LinkedList                                     | ArrayList                               |
|-------------------------------|------------------------------------------------|-----------------------------------------|
| **Underlying Data Structure** | Doubly linked list.                            | Resizable array.                        |
| **Access Time**               | Slower random access (O(n)).                   | Fast random access (O(1)).              |
| **Insertion/Deletion**        | Fast at beginning and end (O(1)).              | Slower (O(n)) when not at the end.      |
| **Memory Usage**              | Higher, as each node stores data and pointers. | Lower, as it only stores data.          |
| **Iteration**                 | Slightly slower due to pointer traversal.      | Faster due to contiguous memory layout. |
| **Best Use Cases**            | Frequently add/remove from head/tail.          | Frequently access elements by index.    |

<h3> Việc sử dụng </h3>

1) Khi cần thêm hoặc xóa phần tử ở đầu hoặc cuối danh sách thường xuyên - LinkedList hiệu quả cho việc thêm và xóa
   đầu/cuối vì chỉ cần cập nhật các tham chiếu.
2) Khi kích thước danh sách thay đổi nhiều - Vì LinkedList không cần phải dời các phần tử khi thêm/xóa, nó hiệu quả hơn
   trong các tình huống cần thay đổi kích thước danh sách thường xuyên.

### VECTOR

`Vector` là một class triển khai List `interface` và sử dụng cấu trúc dữ liệu liên kết. Vector trong Java là một cấu
trúc dữ liệu giống với ArrayList, nhưng có một vài điểm khác biệt quan trọng:

- Đồng bộ hóa (Synchronization): Vector là một lớp đồng bộ hóa (synchronized), nghĩa là nó an toàn cho các thao tác từ
  nhiều luồng (thread-safe). Điều này có nghĩa là mọi phương thức của Vector đều được tự động khóa để đảm bảo tính toàn
  vẹn của dữ liệu khi có nhiều luồng truy cập đồng thời.

- Tăng kích thước động: Khi dung lượng hiện tại của Vector đầy, nó sẽ tự động tăng kích thước theo tỷ lệ cụ thể (thường
  là tăng gấp đôi), giúp quản lý bộ nhớ động mà không cần định kích thước ban đầu.

- Tính kế thừa từ List: Vector triển khai cả List và RandomAccess interface, do đó nó có các phương thức tương tự như
  ArrayList.

<h3> Đặc  điểm của vector </h3>

1) Kích thước động:

- Vector có khả năng thay đổi kích thước linh hoạt. Khi dung lượng hiện tại không đủ, nó sẽ tự động tăng kích thước gấp
  đôi, đảm bảo không cần phải sao chép dữ liệu khi thêm phần tử mới.

2) Đồng bộ hóa (Synchronized):

- Vector là lớp thread-safe vì tất cả các phương thức của nó đều được đồng bộ hóa, nghĩa là chỉ một thread có thể truy
  cập Vector tại một thời điểm. Điều này giúp tránh xung đột dữ liệu trong môi trường đa luồng.
- Tuy nhiên, điều này khiến Vector chậm hơn so với ArrayList trong các thao tác không cần đồng bộ hóa.

3) Lưu trữ phần tử theo thứ tự:

- Vector duy trì thứ tự các phần tử theo thứ tự chèn vào (insertion order). Do đó, khi duyệt qua Vector, phần tử sẽ được
  trả về theo thứ tự mà chúng được thêm vào.


4) Hỗ trợ chỉ mục (Index-based):

- Vector là một danh sách có chỉ mục, nghĩa là bạn có thể truy cập các phần tử bằng cách sử dụng chỉ số của chúng, giống
  như với ArrayList.

5) Chứa phần tử trùng lặp:

- Vector cho phép chứa các phần tử trùng lặp và hỗ trợ các giá trị null.

6) Hỗ trợ Enumeration và Iterator:

- Vector hỗ trợ cả Enumeration và Iterator để duyệt qua các phần tử. Enumeration là một giao diện cũ, còn Iterator là
  giao
  diện mới và linh hoạt hơn.

7) Không khuyến nghị cho các ứng dụng mới:

- Mặc dù Vector vẫn có trong Java, nhưng thường không được khuyến nghị sử dụng trong các ứng dụng hiện đại do hiệu năng
  thấp hơn ArrayList khi không cần đồng bộ hóa. ArrayList được sử dụng phổ biến hơn và linh hoạt hơn.
  Ví dụ sử dụng Vector:

### STACK
