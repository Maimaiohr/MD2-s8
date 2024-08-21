
import java.util.Scanner;
import java.util.regex.Pattern;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            String regexPass = "^(?!.*\\s).{6,}$";

            System.out.print("Nhập email:");
            String email = sc.nextLine();

            System.out.print("Nhập password:");
            String password = sc.nextLine();

            if (Pattern.matches(regexEmail, email) && Pattern.matches(regexPass, password)) {
                System.out.println("Hop le");
            }else {
                System.out.println("Khong hop le");
            }
        }while (true);
    }
}
