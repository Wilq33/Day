package Sample;

public class Overloading {

    public static void main(String[] args) {

        Overloading obj = new Overloading();
        obj.login(123456789, "password");
        obj.add(10, 20, 30);
        byte b1 = 25;
        byte b2 = 45;
        obj.add(b1, b2);

    }

    public void add(byte a, byte b){

        System.out.println(a + b);

    }

    public void add(int a, int b, int c){

        System.out.println(a + b + c);

    }

    public void login (String username, String password){

    }

    public void login (int mobile, String password){

        System.out.println("Login successful");

    }
}
