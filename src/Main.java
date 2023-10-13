import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО");
        int a = scanner.nextInt();
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
        int b = scanner.nextInt();

        System.out.println("ВВЕДИТЕ ОПЕРАЦИЮ");
        char s = scanner.next().charAt(0);
        result = count(a,b,s, result);

        System.out.println("ВВЕДИТЕ ОПЕРАЦИЮ");
        s = scanner.next().charAt(0);
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
        b = scanner.nextInt();
        result = count(result,b,s, result);


    }

    public static int count(int a, int b, char s, int result){
        switch (s){
            case('+'):
                result = a+b;
                System.out.println(result);
                return result;
            case('-'):
                result = a-b;
                System.out.println(result);
                return result;
            case('*'):
                result = a*b;
                System.out.println(result);
                return result;
            case('/'):
                result = a/b;
                System.out.println(result);
                return result;
        }
        return 0;
    }
}