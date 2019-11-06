public class Home {


    int i;
    //display
    int j;


    //void
    public void display(){



        System.out.println("Text inside display Method");
    }

    //string
    public String word(){

        String x = "Display";

        return "Word";
    }


    //number
    public int number(int k, String a, char c, float f){

        k = 20;
        f = 12.5f;
        a ="Display";

        return 5;
    }


    public static void main(String[] args){

        Home house1 = new Home();
        house1.display();

        Home house2 = new Home();
        house2.word();
        //house.number(k, a, c, f);


    }

}
