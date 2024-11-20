# MAP

Map là một interface trong Java để dùng lưu trữ các cặp key-value.Trong Map, mỗi key là duy nhất, trong khi đó value có
thể trùng lặp.

<h3> Ưu điểm của Map </h3>

1) Truy xuất nhanh: Map cho phép truy cập dữ liệu rất nhanh thông qua key. Đặc biệt, HashMap có khả năng truy xuất rất
   nhanh nhờ sử dụng cấu trúc bảng băm (hash table).

2) Quản lý cặp key-value: Map hỗ trợ quản lý các cặp key-value một cách hiệu quả. Điều này đặc biệt hữu ích khi bạn cần
   ánh xạ giữa hai tập dữ liệu, chẳng hạn như mã sản phẩm và tên sản phẩm.

3) Dễ dàng kiểm tra sự tồn tại của key hoặc value: Các phương thức như containsKey() và containsValue() giúp kiểm tra sự
   tồn tại của key hoặc value mà không cần phải duyệt qua toàn bộ dữ liệu.

4) Loại bỏ dữ liệu trùng lặp theo key: Vì key trong Map phải là duy nhất, Map đảm bảo rằng không có sự trùng lặp về key,
   giúp quản lý dữ liệu nhất quán.

5) Đa dạng hóa lựa chọn: Java cung cấp nhiều loại Map khác nhau (HashMap, LinkedHashMap, TreeMap, Hashtable) giúp người
   dùng lựa chọn loại Map phù hợp với nhu cầu:

- HashMap cho hiệu năng cao.
- LinkedHashMap bảo toàn thứ tự chèn.
- TreeMap sắp xếp theo thứ tự tự nhiên.

<h3> Nhược điểm của Map </h3>

1) Không cho phép lặp lại key: Trong Map, các key phải là duy nhất. Điều này có nghĩa là nếu bạn cần lưu trữ nhiều giá
   trị cho cùng một key, bạn sẽ phải sử dụng một cấu trúc khác (như Map<K, List<V>>), điều này phức tạp hóa thêm.

2) Không đồng bộ (Synchronization): Các loại Map như HashMap và LinkedHashMap không đồng bộ hóa, khiến chúng không an
   toàn trong môi trường đa luồng (multi-threading). Tuy nhiên, Java cung cấp ConcurrentHashMap cho mục đích này.

3) Hiệu năng của TreeMap chậm hơn: Vì TreeMap lưu trữ các phần tử trong một cấu trúc cây đỏ-đen (Red-Black Tree) nên
   hiệu năng của nó chậm hơn HashMap khi truy xuất dữ liệu. Điều này có thể ảnh hưởng đến hiệu năng nếu dữ liệu quá lớn
   và cần truy xuất nhanh.

4) Không phù hợp với thao tác trên thứ tự cụ thể: HashMap không bảo toàn thứ tự chèn, trong khi TreeMap chỉ sắp xếp theo
   thứ tự của key chứ không linh hoạt tùy chỉnh.

5) Yêu cầu bộ nhớ lớn: HashMap và LinkedHashMap có thể tốn bộ nhớ vì cơ chế băm và liên kết bên trong để lưu trữ các cặp
   key-value. Đặc biệt khi kích thước Map tăng lên, bộ nhớ cần cũng tăng lên.


<h3> Khi nào nên sử dụng Map </h3>

| **Map Implementation** | **Mô tả**                                                                                               | **Khi nào sử dụng**                                                       |
|------------------------|---------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| **HashMap**            | - Lưu trữ các cặp key-value không theo thứ tự.                                                          | Khi không cần bảo toàn thứ tự của các cặp key-value và ưu tiên hiệu năng. |
|                        | - Cho phép một giá trị `null` làm key và nhiều giá trị `null` làm value.                                |                                                                           |
|                        | - Truy xuất nhanh nhờ bảng băm.                                                                         |                                                                           |
| **LinkedHashMap**      | - Giữ thứ tự chèn của các cặp key-value.                                                                | Khi cần bảo toàn thứ tự chèn.                                             |
|                        | - Truy xuất nhanh tương tự `HashMap`.                                                                   |                                                                           |
| **TreeMap**            | - Sắp xếp các cặp key-value theo thứ tự tự nhiên của key hoặc theo comparator do người dùng định nghĩa. | Khi cần dữ liệu luôn được sắp xếp.                                        |
|                        | - Dựa trên cấu trúc cây nhị phân.                                                                       |                                                                           |
| **Hashtable**          | - Tương tự `HashMap` nhưng không cho phép giá trị `null`.                                               | Khi cần đồng bộ hóa cho môi trường đa luồng.                              |
|                        | - Đồng bộ (synchronization).                                                                            |                                                                           |


<h3> Phương thức của Map </h3>


| **Phương thức**                                                                              | **Mô tả**                                                                                 |
|----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------|
| **put(K key, V value)**                                                                      | Thêm một cặp key-value vào Map. Nếu key đã tồn tại, giá trị mới sẽ ghi đè lên giá trị cũ. |
| **putAll(Map<? extends K, ? extends V> m)**                                                  | Thêm tất cả các cặp key-value từ Map được chỉ định vào Map hiện tại.                      |
| **get(Object key)**                                                                          | Trả về value tương ứng với key, hoặc `null` nếu key không tồn tại.                        |
| **getOrDefault(Object key, V defaultValue)**                                                 | Trả về value tương ứng với key hoặc giá trị mặc định nếu key không tồn tại.               |
| **remove(Object key)**                                                                       | Xóa cặp key-value tương ứng với key đã cho.                                               |
| **remove(Object key, Object value)**                                                         | Xóa key-value nếu key tồn tại và giá trị của nó bằng giá trị được chỉ định.               |
| **replace(K key, V value)**                                                                  | Thay thế giá trị liên kết với key, nếu key tồn tại.                                       |
| **replace(K key, V oldValue, V newValue)**                                                   | Thay thế giá trị chỉ khi giá trị hiện tại của key khớp với giá trị cũ.                    |
| **containsKey(Object key)**                                                                  | Kiểm tra xem key có tồn tại trong Map không.                                              |
| **containsValue(Object value)**                                                              | Kiểm tra xem value có tồn tại trong Map không.                                            |
| **keySet()**                                                                                 | Trả về tập hợp tất cả các key trong Map.                                                  |
| **values()**                                                                                 | Trả về tập hợp tất cả các value trong Map.                                                |
| **entrySet()**                                                                               | Trả về tập hợp tất cả các cặp key-value trong Map dưới dạng `Map.Entry`.                  |
| **size()**                                                                                   | Trả về số lượng các cặp key-value trong Map.                                              |
| **clear()**                                                                                  | Xóa toàn bộ các cặp key-value trong Map.                                                  |
| **isEmpty()**                                                                                | Kiểm tra xem Map có rỗng không (không chứa cặp key-value nào).                            |
| **forEach(BiConsumer<? super K, ? super V> action)**                                         | Thực thi một hành động cho mỗi cặp key-value trong Map.                                   |
| **compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)**          | Tính toán lại giá trị cho key đã cho.                                                     |
| **computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)**                 | Thêm key với giá trị được tính toán nếu key không tồn tại.                                |
| **computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)** | Tính toán lại giá trị nếu key tồn tại.                                                    |
| **merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)**   | Hợp nhất giá trị mới vào Map dựa trên key.                                                |

## LinkedHashMap



## TreeMap

# So sánh HashMap, LinkedHashMap, và TreeMap trong Java

| **Đặc điểm**             | **HashMap**                         | **LinkedHashMap**                           | **TreeMap**                                     |
|--------------------------|-------------------------------------|---------------------------------------------|-------------------------------------------------|
| **Cấu trúc dữ liệu**     | Bảng băm (Hash Table)               | Bảng băm + Danh sách liên kết kép           | Cây nhị phân cân bằng (Red-Black Tree)          |
| **Thứ tự phần tử**       | Không xác định                      | Theo thứ tự chèn                            | Theo thứ tự tự nhiên hoặc `Comparator` tùy chọn |
| **Hiệu năng (thêm/xóa)** | Trung bình \(O(1)\)                 | Trung bình \(O(1)\), nhưng chậm hơn HashMap | \(O(\log n)\), chậm hơn do sắp xếp              |
| **Bộ nhớ tiêu thụ**      | Ít nhất                             | Nhiều hơn do dùng danh sách liên kết kép    | Nhiều nhất do cấu trúc cây phức tạp             |
| **Ứng dụng**             | Khi không quan trọng thứ tự phần tử | Khi cần duy trì thứ tự chèn                 | Khi cần sắp xếp phần tử theo thứ tự             |


