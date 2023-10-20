public class Count {
    int a;
    int b;
    char operation;
    int result;
    public Count(int a, int b, char operation, int result) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }

        public int chooseOperation() {
        try {
            switch (operation) {
                case ('+'):
                    result = a + b;
                    System.out.println(result);
                    return result;
                case ('-'):
                    result = a - b;
                    System.out.println(result);
                    return result;
                case ('*'):
                    result = a * b;
                    System.out.println(result);
                    return result;
                case ('/'):
                    result = a / b;
                    System.out.println(result);
                    return result;
            }
        }
        catch (NumberFormatException e){
            System.out.println("Введено неправильное значение");
            return 0;
        }

            return 0;
        }

}
