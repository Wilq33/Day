import static java.lang.Math.random;

public class Home {


    int i = 123;
    //display
    int j = 234;


    //void
    public void display(){

      i = 333;

        System.out.println("Text inside display Method");
    }

    //string
    public String word(){

        String x = "Display";

        return "Word";
    }


    //number
    public int number(int k, String a, char c, float f){

        i = 345;
        j = 890;
        k = 20;
        f = 12.5f;
        a ="Display";

        return 5;
    }


    public static void main(String[] args){

        /*Home house1 = new Home();
        house1.display();

        Home house2 = new Home();
        house2.word();*/
        //house.number(k, a, c, f);

        /*Home h1 = new Home();
        h1.i++; // i = 123 + 1

        Home h2 = new Home();
        h2.i--; // i = 123 - 1

        Home h3 = new Home();
        //It should be 123
        System.out.println(h3.i);
        //It should be 122
        System.out.println(h2.i);*/

        Calculator calcSum = new Calculator();
        int sum = calcSum.getSum(10,5);
        Calculator calcSub = new Calculator();
        int sub = calcSub.getSub(10,5);
        Calculator calcMul = new Calculator();
        int mul = calcMul.getMul(10,5);
        Calculator calcDiv = new Calculator();
        int div = calcDiv.getDiv(10,5);

        System.out.println("The sum is: "+ sum);
        System.out.println("The sum is: "+ sub);
        System.out.println("The sum is: "+ mul);
        System.out.println("The sum is: "+ div);

        random();
        System.out.println("The random number is: "+ random());

    }

}
