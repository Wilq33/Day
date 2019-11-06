public class Random {

    public static void main(String[] args){


        //Random number between 0 and 10
        double random = Math.round(Math.random() * 10);
        System.out.println("The random number is: "+ random);

        if(random > 5){

            System.out.println("Number is greater that 5");
        }else{

            System.out.println("Number is lower than 5");
        }

    }

}
