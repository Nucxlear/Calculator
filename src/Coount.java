public class Coount {
    int a;
    int b;
    char s;
    int result;
    public Coount(int a, int b, char s, int result) {
        this.a = a;
        this.b = b;
        this.s = s;
        this.result = result;


    }

        public int x() {
            switch (s) {
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
            return 0;
        }

}
