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

    public static void addNumbers2(int r, int s){

        int add = r + s;
        System.out.println("r + s = " + add);

    }



    public static void main(String[] args) {

        print();
        addNumbers();
        addNumbers2(12, 18);

    }
}
