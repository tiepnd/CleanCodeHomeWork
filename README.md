# Nguyễn Đức Tiệp
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Đơn giản, trực tiếp, dễ đọc dễ cải tiến
   - Các định danh đều thể hiện rõ nghĩa
   - Có ít sự phụ thuộc
   - Không có mã bị trùng lặp (duplicate)
   - Thể hiện được ý tưởng của thiết kế
2. Đáp án của tôi là team B bởi vì:
   - Nếu không clean code ngay từ đầu, thì công số để refactor lại cũng tương đương thời gian code, trường hợp xấu nhất sẽ phải đập code đi xây lại
   - Vì bỏ 30% thời gian đào tạo clean code còn hơn là có thể phải bỏ hơn 30% thời gian để fix bug
   - Vì áp dụng clean code là cả 1 quá trình nên cân bằng giữa tiến độ và clean code là không hợp lý, dữ án sẽ bị ảnh hướng lớn, 30% cho clean code là hợp lý
3. Clean Code để lượng bug giảm đi, bớt street.
4. Đề xuất phù hợp với quy ước Clean Code
   - Đề xuất của Vân float raise là thuộc tính trong class Salary rồi.
     int calculateSalaryAfterYears(int initialSalary, int NthYear);
5. 

```Java
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
   private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

   void writePost(Post post) { //ví dụ mẫu một phương thức nhé
      //Bổ xung logic vào đây
   }

   void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

   }
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author; //Tác giả của bài viết
   private ArrayList<Comment> comments; //Một post chứa nhiều Comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó ! 
}

private class Comment{
   private long id;
   private String title;
   private Post post; //Bài viết mà comment gắn vào
   private User author; //Tác giả của comment
   //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
}
```
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
Gõ link đến mã nguồn bài này vào đây. Đừng comment code. Nếu thực sự CleanCode thì không cần comment vẫn hiểu được.

### 2. Composition over Inheritance và DI
Gõ link đến mã nguồn bài này vào đây


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả

## Phần 4: Thiết kế RESTful API

## Phần 5: Lập trình Restful API

## Trắc nghiệm
1. Điều nào không đúng khi nói về Design Pattern?
  ```
   C. Đã được thiết kế và cài đặt ở mức chi tiết.
  ```
---

2. Các OOP Design Pattern được chia làm mấy nhóm?
   ```
   B. 3
   ```
---

3. Các design pattern của nhóm Behavioral pattern có đặc điểm nào dưới đây?
   ```
   D. Quan tâm đến cách giao tiếp giữa các lớp và các đối tượng.
   ```
---

4. Trong trường hợp client muốn khởi tạo một đối tượng mà không cần quan tâm logic khởi tạo đối tượng hoặc không biết rõ lớp của đối tượng thì chúng ta nên áp dụng design pattern nào đã được học?
  ```
   C. Factory Method
   ```
---

5. Cách cài đặt Bill Pugh của Singleton pattern có đảm bảo thread-safe hay không?
   ```
   A. Có
   ```
---

6. Đối tượng được khởi tạo bằng Builder pattern có điểm gì khác biệt so với đối tượng được khởi tạo bằng cách thông thường (thông qua toán tử new, rồi sau đó set các giá trị thông qua setter method)?
   ```
   B. Immutable
   ```
---

7. Khi sử dụng annotation @Builder của Lombok thì đối tượng được khởi tạo có đảm bảo immutable hay không?
   ```
   A. Không
   ```
---

8. Trong design pattern Flyweight, chúng ta lưu trữ loại dữ liệu nào trong bộ nhớ cache (flyweight factory)?
   ```
   A. Dữ liệu không thay đổi theo context
   ```
---

9. Nếu có nhiều class chứa các thuật toán gần như giống hệt nhau và chỉ có một số ít khác biệt, thì chúng ta sẽ áp dụng design pattern nào đã được học để tránh bị lặp lại code, cũng như tốn ít công sức sửa code nếu có yêu cầu phải thay đổi tất cả các thuật toán?
   ```
   B. Template Method
   ```
---

10. Một tác vụ có nhiều thuật toán để xử lý. Để dễ dàng chuyển đổi thuật toán tại thời điểm chạy chương trình tùy theo request từ phía client, chúng ta sẽ áp dụng design pattern nào đã được học?
   ```
      A. Strategy
   ```
---

11. REST là gì?
   ```
      B. Kiểu kiến trúc phần mềm
   ```
---

12. Đâu không phải là đặc điểm của một hệ thống RESTful?
   ```
      C. Server lưu trữ session và history của client.
   ```
---

13. Khi RESTful API có nhiệm vụ thêm mới một resource, chúng ta nên sử dụng HTTP method nào?
   ```
      B. POST
   ```
---

14. HTTP method nào không đảm bảo idempotent trong tất cả các trường hợp?
   ```
      B. POST
   ```
---

15. Chúng ta nên sử dụng query parameter cho những trường hợp nào?
   ```
      D. Cả 3 đáp án trên
   ```
---

16. Các interface/class có nhiệm vụ thao tác với cơ sở dữ liệu được đặt ở layer nào?
   ```
      B. Repository
   ```
---

17. Các bạn đã được tìm hiểu mấy phương pháp đánh version cho RESTful API trong khóa học?
   ```
      D. 4
   ```
---

18. Trong Spring Framework, phương pháp xử lý lỗi nào dưới đây cho phép chúng ta xử lý lỗi ở mức toàn ứng dụng (global)?
   ```
      B. Chỉ sử dụng @ExceptionHandler
   ```
---

19. Để thông báo cho người quản trị hệ thống biết một chức năng đã gặp lỗi, chúng ta nên sử dụng log level nào?
   ```
      C. ERROR
   ```
---

20. Để cảnh báo việc tiến trình có thể không chạy đúng với logic, nhưng ứng dụng vẫn có thể tiếp tục, chúng ta nên sử dụng log level nào?
   ```
      B. WARN
   ```
---

21. Có phải method được đánh dấu annotation @Cacheable luôn được thực thi mỗi khi RESTful API được gọi?
   ```
      B. Không
   ```

---

22. Anti-pattern Jaywalking phù hợp trong trường hợp nào?
   ```
      C. A và B.
   ```
---

23. Đâu không phải là giải pháp phù hợp để thay thế cho anti-pattern Multi-column Attributes? Giả sử tôi cần lưu các tag của một article.
   ```
      A. Tạo một bảng trung gian (join table) giữa tag và article.
   ```
---

24. Nếu sử dụng anti-pattern Entity-Value-Attribute, giả sử đối tượng có 5 thuộc tính, vậy tôi cần thực hiện tất cả bao nhiêu phép JOIN để lấy đủ thông tin của 5 thuộc tính?
   ```
      B. 3
   ```
---

25. Tree model nào không dễ để query child node ngay dưới?
   ```
      C. Nested Set
   ```
