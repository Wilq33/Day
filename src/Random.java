public class Random {

    public static double randomNumber = Math.round(Math.random() *10);

    public static void main(String[] args){

        //Random number between 0 and 10
       System.out.println("The random number is: "+ randomNumber);

        if(randomNumber == 5){

            System.out.println(randomNumber + " is the lucky number");
        }else if(randomNumber >= 6 && randomNumber <= 9){

            System.out.println(randomNumber + " is greater than 5 but less than 10");
        }else if(randomNumber == 10){

            System.out.println(randomNumber + " is the winning number");
        }else{

            System.out.println(randomNumber + " is less than 5");
        }

    }

}
