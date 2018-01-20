import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 0;

        System.out.println("Введите колличество дней: ");
        int n = scanner.nextInt();

        for(int i = 0;i<n;i++){

            System.out.println("Введите осадки за "+n+" день: ");

            int a = scanner.nextInt();
            sum+=a;

            if(max<a){
                max = a;
            }

        }

        System.out.println("Колличество дней - "+n);
        System.out.println("Сумма осадков - "+sum);
        System.out.println("Среднее колличество осадков за "+n+" дней - "+sum/n);
        System.out.println("Максимальное значения осадков - "+max);

    }
}
