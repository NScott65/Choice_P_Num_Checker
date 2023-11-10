import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum;
        boolean prime = true;

        System.out.println("Input your number: ");
        if(scan.hasNextInt()) {
            userNum = scan.nextInt();
            if(userNum == 2){
                System.out.println(userNum + " is a prime number.");
                System.exit(0);
            }
            for(int i = 2; i < userNum; i++) {
                if (userNum % 2 == 0) {
                    prime = false;
                }
            }
            if(prime == true){
                System.out.println(userNum + " is a prime number.");
            }else if(prime == false){
                System.out.println(userNum + " is not a prime number.");
            }
        }
    }
}