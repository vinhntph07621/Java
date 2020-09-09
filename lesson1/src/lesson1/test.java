package lesson1;
import java.util.*;

public class test {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là arrListString
        // có kiểu là String
        ArrayList<String> arrListString = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");

        // duyệt theo kích thước của arrListString
        // sử dụng vòng lặp for thông thường
        // phương thức arrListString.size() sẽ trả về số phần tử của arrListString
        // và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        // sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Các phần tử có trong arrListString là: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }
}
