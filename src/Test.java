public class Test {

    public static void main(String[] args) {


        try {
            System.out.println("Beginning");


            int divide = 10 / 0;
            System.out.println(divide);
        }catch(Exception e){

            System.out.println("Error occurred");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
       System.out.println("Ending");

    }

}
