public class Table {

    public static void main(String[] args) {

        int rows = 3;
        int columns = 3;

        int table [] [] = new int [rows] [columns];

        //assign values to the first row

        table [0] [0] = 10;
        table [0] [1] = 11;
        table [0] [2] = 12;

        //assign values to the second row

        table [1] [0] = 20;
        table [1] [1] = 21;
        table [1] [2] = 22;

        //assign values to the third row

        table [2] [0] = 30;
        table [2] [1] = 31;
        table [2] [2] = 32;

        // Row length
        System.out.println(table.length);
        // Column length
        System.out.println(table[0].length);

        System.out.println(table [1] [2]);

        //print data
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {

                System.out.print(table [i] [j] + " ");
            } System.out.println(" ");
        }


    }
}
