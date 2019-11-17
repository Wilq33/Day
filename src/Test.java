public class Test {

    public static void main(String[] args) {


        try {
            System.out.println("Beginning");


            int divide = 10 / 0;
            System.out.println(divide);
        }catch(Throwable t){

            System.out.println("Error occured");
        }
       System.out.println("Ending");

    }

}
