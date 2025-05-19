import java.util.Scanner;
public class HomeworkOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string_one = sc.nextLine();
        String str_1 = "";
        String str_2 = "";


        for (int i = 0; i < string_one.length(); i++) {
            char c = string_one.charAt(i);
            if (c == ' ') {
                str_2 = str_1 + " " + str_2;
                str_1 = "";
            }
            else {
                str_1 += c;
                if ( i == string_one.length()-1) {
                    str_2 = str_1 + " " + str_2;

                }
            }
        }
        System.out.println(str_2);
    }
}
