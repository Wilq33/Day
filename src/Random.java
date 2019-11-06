public class Random {

    public static void main(String[] args){


        //Random number between 0 and 10
        double random = Math.round(Math.random() * 10);
        System.out.println("The random number is: "+ random);

        if(random == 5){

            System.out.println(random + " is the lucky number");
        }else if(random >= 6 && random <= 9){

            System.out.println(random + " is greater than 5 but less than 10");
        }else if(random ==10){

            System.out.println(random + " is the winning number");
        }else{

            System.out.println(random + " is less than 5");
        }

    }

}
