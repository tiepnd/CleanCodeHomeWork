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
## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
Gõ link đến mã nguồn bài này vào đây. Đừng comment code. Nếu thực sự CleanCode thì không cần comment vẫn hiểu được.

### 2. Composition over Inheritance và DI
Gõ link đến mã nguồn bài này vào đây


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả

## Phần 4: Thiết kế RESTful API

## Phần 5: Lập trình Restful API

## Trắc nghiệm
