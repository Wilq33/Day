package Rough;

public class TestA {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    public void add(){

    }

    public class classA{


    }

    public static void main(String[] args) {

        TestA obj = new TestA();

        System.out.println(obj.publicVariable);
        System.out.println(obj.privateVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);

    }

}
