import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        StringBuilder sb = new StringBuilder(username);
        String reversedUser = sb.reverse().toString();
        int counter = 0;

        while(true) {
            if(!password.equals(reversedUser)) {
                counter++;
                if(counter == 4) {
                    System.out.println("User " + username + " blocked!");
                    return ;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.println("User " + username + " logged in.");
                break;
            }
            password = scanner.nextLine();
        }
    }
}
