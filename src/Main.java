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
        Coount count = new Coount(a,b,s,result);
        result = count.x();


        System.out.println("ВВЕДИТЕ ОПЕРАЦИЮ");
        s = scanner.next().charAt(0);
        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
        b = scanner.nextInt();
        Coount count2 = new Coount(result,b,s,result);
        result = count2.x();


    }


}

