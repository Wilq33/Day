public class Salary {

    public static void main(String[] args) {

        int[] salary;

        salary = new int[10];

        try {
            salary[12] = 100;

        }catch(Exception e){

            System.out.println("Error occurred");
            System.out.println(e.getMessage());

        }

        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println(month[0]);
        System.out.println(month.length);
        System.out.println(salary[2]);

        for(int i=0; i<month.length; i++){

            System.out.println(month[i]);
        }

    }
}
