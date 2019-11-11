public class Brake {


    public void breakAndContinue(){

        System.out.println("First");

        //break;

        //continue;

        System.out.println("Last");

    }

    public static void main(String[] args){

        /*Brake b = new Brake();
        b.breakAndContinue();*/

        for(int i=0; i<10; i++){

            if (i>=3)
                continue;

            /*if(i==5)
            break;
            */

            System.out.println(i);
        }

        System.out.println("Outside the loop");
    }
}
