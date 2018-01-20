import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();
        int result = 0;

        while (number!=0){
            result += number%10;
            number = number/10;
        }

        System.out.println(result);
    }
}
