import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        int result = 0;


        System.out.println("Введите первое число");
        int a = scanner.nextInt();


        while (isContinue){
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            Count count = new Count(a,b,operation,result);
            result = count.chooseOperation();

            System.out.println("Продолжить?");
            char yesOrNot = scanner.next().charAt(0);
                if (yesOrNot == 'n'){
                    isContinue = false;
                    break;
                }
                else {
                    a = result;
                    continue;
                }
        }

    }
}

