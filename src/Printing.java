public class Printing {

    public static void print(){

        System.out.println("Checking");

    }

    public static int a = 30;
    public static int b = 20;

    public static void addNumbers(){

        int c = a + b;
        System.out.println("a + b = " + c);

    }

    public static int addNumbers2(int r, int s){

        int add = r + s;
        return add;

    }

    public static void table(int t){

        for(int i=1; i<=10; i++){

            System.out.println(t*i);

        }

    }

    public static void main(String[] args) {

        print();
        addNumbers();
        int res = addNumbers2(12, 18);
        System.out.println("r + s = " + res);
        table(3);

    }
}
