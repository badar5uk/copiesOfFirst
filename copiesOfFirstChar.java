import java.util.Scanner;

public class CopiesOfFirstChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String userInp = scan.next();
        if (userInp.substring(0).equals(userInp.substring(userInp.length() - 1))) {
            System.out.print(userInp.substring(0));
            System.out.print(userInp.substring(0));
            System.out.print(userInp.substring(0));
        } else if ((userInp.substring(0, 2).equals(userInp.substring(userInp.length() - 2)))) {
            System.out.print(userInp.substring(0, 2));
            System.out.print(userInp.substring(0, 2));
            System.out.print(userInp.substring(0, 2));
        } else if ((userInp.substring(0, 2).contains(userInp.substring(userInp.length())))) {
            System.out.print(userInp.substring(0, 2));
            System.out.print(userInp.substring(0, 2));
            System.out.print(userInp.substring(0, 2));
        }
    }
}
