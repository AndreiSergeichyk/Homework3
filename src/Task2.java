import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        n--;
        while (n>=0){
            System.out.println(fibonachi(n));
            n--;
        }
    }

    private static int fibonachi(int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else {
            return fibonachi(n-1)+fibonachi(n-2);
        }
    }
}
