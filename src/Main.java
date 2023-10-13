import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО");
        int a = scanner.nextInt();
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
        int b = scanner.nextInt();

        System.out.println("ВВЕДИТЕ ОПЕРАЦИЮ");
        char s = scanner.next().charAt(0);
        switch (s){
            case('+'):
                System.out.println(a+b);
                break;
            case('-'):
                System.out.println(a-b);
                break;
            case('*'):
                System.out.println(a*b);
                break;
            case('/'):
                System.out.println(a/b);
                break;
        }
    }
}