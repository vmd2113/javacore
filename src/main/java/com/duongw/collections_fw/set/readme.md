# SET

Trong Java, Set là một Collection không cho phép chứa các phần tử trùng lặp. Set thường được sử dụng khi muốn lưu
trữ các phần tử duy nhất và không cần đảm bảo thứ tự. Set là một interface trong thư viện Java Collections và có các
triển khai phổ biến như HashSet, LinkedHashSet, và TreeSet, mỗi loại có đặc điểm riêng biệt phù hợp với từng tình huống
sử dụng khác nhau.

<h3> Đặc Điểm Chính của Set </h3>
   - hông chứa phần tử trùng lặp: Set chỉ chứa các phần tử duy nhất. Nếu bạn cố gắng thêm một phần tử đã tồn tại, Set sẽ
   không thay đổi.
   - Không duy trì thứ tự chèn (trừ LinkedHashSet): Set không nhất thiết phải duy trì thứ tự chèn của các phần tử.
   - LinkedHashSet là một ngoại lệ vì nó duy trì thứ tự chèn.
   - Hiệu suất cao: Set cung cấp hiệu suất cao khi tìm kiếm, chèn và xóa phần tử nhờ cách thức triển khai của nó, đặc biệt
   là HashSet. 

 <h3> Các Triển Khai Chính của Set </h3>
   Java cung cấp các triển khai khác nhau của Set, bao gồm:

1) HashSet
   HashSet sử dụng một bảng băm (hash table) để lưu trữ các phần tử, do đó không duy trì thứ tự chèn.
   Hiệu suất cao trong việc thêm, xóa và tìm kiếm phần tử, nhưng không duy trì thứ tự của các phần tử.
   Hỗ trợ chứa null.
   Ứng dụng: Thích hợp khi cần lưu trữ các phần tử duy nhất mà không quan tâm đến thứ tự.

2) LinkedHashSet
   LinkedHashSet là một phiên bản mở rộng của HashSet, sử dụng liên kết kép để duy trì thứ tự chèn của các phần tử.
   Có hiệu suất chậm hơn HashSet một chút vì phải duy trì thứ tự chèn.
   Ứng dụng: Thích hợp khi cần vừa đảm bảo không có phần tử trùng lặp vừa duy trì thứ tự chèn.

3) TreeSet
   TreeSet triển khai Set bằng cách sử dụng cây đỏ-đen (red-black tree), giúp duy trì thứ tự tự nhiên của các phần tử
   hoặc
   thứ tự xác định bởi một Comparator tuỳ chỉnh.
   TreeSet không cho phép chứa null vì không thể so sánh null với các phần tử khác.
   Ứng dụng: Sử dụng khi bạn cần lưu trữ các phần tử duy nhất theo thứ tự tự nhiên hoặc thứ tự được xác định sẵn.

<h3> Một số phương thức </h3>
   Set kế thừa từ Collection, nên có một số phương thức chung được sử dụng để thao tác với các phần tử của Set. Một số
   phương thức quan trọng bao gồm:

- `add(E e)`: Thêm phần tử e vào Set. Trả về true nếu phần tử chưa tồn tại trong Set, ngược lại trả về false.
- `remove(Object o)`: Xóa phần tử o khỏi Set nếu tồn tại. Trả về true nếu phần tử được xóa, ngược lại false.
- `contains(Object o)`: Kiểm tra xem Set có chứa phần tử o hay không. Trả về true nếu có, ngược lại false.
- `size()`: Trả về số lượng phần tử hiện có trong Set.
- `clear()`: Xóa toàn bộ phần tử trong Set.
- `isEmpty()`: Kiểm tra xem Set có rỗng hay không. Trả về true nếu Set rỗng, ngược lại false.

<h3> Ưu Điểm và Nhược Điểm của Set </h3>

1) Ưu điểm:

- Đảm bảo không có phần tử trùng lặp.
- Hiệu suất cao khi tìm kiếm, thêm và xóa phần tử (đặc biệt với HashSet).
- TreeSet cho phép duy trì thứ tự tự nhiên hoặc thứ tự được xác định.

2) Nhược điểm:

- Set không hỗ trợ truy cập theo chỉ số (index) như List.
- Không có sẵn phương thức để sắp xếp trong HashSet hoặc LinkedHashSet, ngoại trừ TreeSet.
- TreeSet có chi phí cao hơn so với HashSet và LinkedHashSet vì duy trì thứ tự tự nhiên.

<h3> Ứng Dụng Thực Tế của Set </h3>

- Loại bỏ phần tử trùng lặp: Set là một lựa chọn tuyệt vời khi bạn cần lưu trữ các giá trị duy nhất, chẳng hạn danh
  sách các ID người dùng duy nhất hoặc danh sách email không trùng lặp.
- Kiểm tra tồn tại nhanh chóng: HashSet cho phép kiểm tra nhanh chóng một phần tử có tồn tại trong Set hay không, giúp
  tăng hiệu suất trong các ứng dụng yêu cầu tìm kiếm nhanh.
- Lưu trữ các giá trị sắp xếp: TreeSet có thể được sử dụng để lưu trữ các phần tử theo thứ tự tự nhiên, hữu ích khi bạn
  cần dữ liệu luôn được sắp xếp.

## HASHSET

<p> HashSet là một trong những triển khai phổ biến nhất của Set trong Java. Đây là lớp cung cấp hiệu suất cao để lưu trữ các phần tử duy nhất (không trùng lặp) và thường được sử dụng trong các tình huống cần thao tác nhanh với các tập hợp phần tử mà không quan tâm đến thứ tự chèn.
</p>

1. Khi Nào Nên Dùng HashSet


- Cần lưu trữ các phần tử duy nhất mà không cần bảo toàn thứ tự chèn.
- Muốn tăng hiệu suất khi tìm kiếm, thêm hoặc xóa phần tử, đặc biệt với các tập dữ liệu lớn.
- Không yêu cầu sắp xếp hoặc duy trì thứ tự cụ thể của các phần tử.
- HashSet lý tưởng cho các trường hợp như:
  Loại bỏ các phần tử trùng lặp từ một tập hợp dữ liệu,
  Kiểm tra xem một phần tử có tồn tại trong tập hợp hay không,
  Lưu trữ các ID duy nhất (như ID người dùng hoặc mã sản phẩm),

2. Cách HashSet Hoạt Động

- HashSet sử dụng một bảng băm (hash table) để lưu trữ dữ liệu. Mỗi phần tử được băm thành một chỉ mục (index) trong
  bảng băm, và phần tử sẽ được lưu tại chỉ mục đó.

- Khi thêm một phần tử, HashSet tính toán giá trị băm (hash value) của phần tử để xác định vị trí lưu trữ trong bảng
  băm.
  Nếu hai phần tử có cùng giá trị băm, chúng sẽ được lưu trong cùng một bucket (cùng một vị trí) theo cách liên kết (
  chaining).
  Khi tìm kiếm, HashSet cũng tính toán giá trị băm của phần tử cần tìm để định vị trong bảng băm, giúp quá trình tìm
  kiếm
  nhanh chóng.

3. Một Số Phương Thức Quan Trọng của HashSet
   HashSet cung cấp các phương thức cơ bản từ Set interface, bao gồm:

- `add(E e)`: Thêm phần tử e vào HashSet. Trả về true nếu phần tử chưa tồn tại, false nếu ngược lại.
- `remove(Object o)`: Xóa phần tử o khỏi HashSet. Trả về true nếu phần tử tồn tại và đã bị xóa, ngược lại trả về false.
- `contains(Object o)`: Kiểm tra xem HashSet có chứa phần tử o hay không. Trả về true nếu có, false nếu không.
- `isEmpty()`: Kiểm tra xem HashSet có rỗng không. Trả về true nếu rỗng, ngược lại false.
- `size()`: Trả về số lượng phần tử hiện có trong HashSet.
- `clear()`: Xóa toàn bộ các phần tử trong HashSet.

4. Ưu Điểm và Nhược Điểm của HashSet

- Ưu Điểm
  Hiệu suất cao cho các thao tác thêm, xóa, và tìm kiếm phần tử.
  Không có phần tử trùng lặp trong HashSet.
  Thích hợp cho các ứng dụng cần kiểm tra sự tồn tại của phần tử nhanh chóng và loại bỏ các phần tử trùng lặp.
- Nhược Điểm
  Không duy trì thứ tự chèn của phần tử, vì vậy không phù hợp nếu cần dữ liệu theo thứ tự nhất định.
  Có thể gặp va chạm băm trong một số trường hợp, dẫn đến giảm hiệu suất

## LINKEDHASHSET

LinkedHashSet là một triển khai của interface Set trong Java. Nó kết hợp cả hai đặc điểm: đảm bảo không có phần tử trùng
lặp như HashSet và duy trì thứ tự chèn của các phần tử nhờ sử dụng cấu trúc bảng băm kết hợp với danh sách liên kết kép.


<h3> Đặc điểm của LinkedHashSet: </h3>

1) Duy trì thứ tự chèn:

- LinkedHashSet đảm bảo rằng các phần tử được duy trì theo thứ tự chèn ban đầu.
  Thứ tự này hữu ích trong các trường hợp cần hiển thị dữ liệu theo đúng thứ tự mà chúng được thêm vào.

2) Không chứa phần tử trùng lặp:

- Tương tự như các triển khai khác của Set, LinkedHashSet không cho phép phần tử trùng lặp.

3) Hiệu suất:

- Thêm, xóa và tìm kiếm phần tử trong LinkedHashSet có thời gian trung bình là
  O(1), nhưng chậm hơn HashSet do phải duy trì thứ tự chèn.

4) Cho phép null:

- LinkedHashSet hỗ trợ chứa một phần tử null

<h3> Khi nào nên sử dụng LinkedHashSet: </h3>

- Khi cần lưu trữ các phần tử duy nhất và duy trì thứ tự chèn.
- Trong các trường hợp cần duy trì thứ tự duyệt, ví dụ:Lưu trữ các bước trong một quy trình cụ thể. Xử lý các bản ghi
  theo thứ tự đã được nhập.

## TREESET

TreeSet là một triển khai của interface Set trong Java sử dụng cấu trúc cây đỏ-đen (Red-Black Tree). Điều này cho phép
TreeSet duy trì thứ tự sắp xếp của các phần tử, dù đó là thứ tự tự nhiên hoặc thứ tự được xác định bởi một Comparator
tùy chỉnh.

<h3> Đặc điểm của TreeSet: </h3>

1) Duy trì thứ tự sắp xếp:

- TreeSet sắp xếp các phần tử theo thứ tự tự nhiên (nếu phần tử triển khai Comparable) hoặc theo thứ tự được chỉ định
  bởi
  một Comparator tùy chỉnh.
- Các phần tử được duyệt theo thứ tự đã sắp xếp.

2) Không chứa phần tử trùng lặp:

- TreeSet chỉ lưu trữ các phần tử duy nhất, tương tự như các Set khác.

3) Không cho phép null:

- TreeSet không hỗ trợ phần tử null vì việc so sánh null với các phần tử khác sẽ gây ra lỗi.

4) Hiệu suất:

- Các thao tác thêm, xóa, và tìm kiếm trong TreeSet có thời gian trung bình là
  O(logn) do sử dụng cấu trúc cây cân bằng.

# So sánh HashSet, LinkedHashSet, và TreeSet trong Java

| **Đặc điểm**             | **HashSet**                         | **LinkedHashSet**                           | **TreeSet**                                     |
|--------------------------|-------------------------------------|---------------------------------------------|-------------------------------------------------|
| **Cấu trúc dữ liệu**     | Bảng băm (Hash Table)               | Bảng băm + Danh sách liên kết kép           | Cây nhị phân cân bằng (Red-Black Tree)          |
| **Thứ tự phần tử**       | Không xác định                      | Theo thứ tự chèn                            | Theo thứ tự tự nhiên hoặc `Comparator` tùy chọn |
| **Hiệu năng (thêm/xóa)** | Trung bình \(O(1)\)                 | Trung bình \(O(1)\), nhưng chậm hơn HashSet | \(O(\log n)\), chậm hơn do sắp xếp              |
| **Bộ nhớ tiêu thụ**      | Ít nhất                             | Nhiều hơn do dùng danh sách liên kết kép    | Nhiều nhất do cấu trúc cây phức tạp             |
| **Ứng dụng**             | Khi không quan trọng thứ tự phần tử | Khi cần duy trì thứ tự chèn                 | Khi cần sắp xếp phần tử theo thứ tự             |

## Khi nào nên sử dụng

- **HashSet**: Phù hợp khi hiệu năng là ưu tiên và thứ tự của các phần tử không quan trọng.
- **LinkedHashSet**: Dùng khi cần duy trì thứ tự chèn của các phần tử.
- **TreeSet**: Thích hợp khi cần sắp xếp các phần tử theo thứ tự tự nhiên hoặc một thứ tự tùy chỉnh.



