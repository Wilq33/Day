package Rough;

public class Bank {

    public int accountNo = 123456;
    public int pinNo = 1234;
    public double balanceAmount = 1000000;

    public void withdrawAmount(int accNo, int pin, int amount){

        if(accNo == accountNo && pin == pinNo){

            if(amount<=balanceAmount){

                balanceAmount = balanceAmount - amount;
                System.out.println("Amount withdrew: " + amount);

            }else{

                System.out.println("Insufficient Balance");

            }


        }else{

            System.out.println("Invalid credentials");

        }

    }


    public static void main(String[] args) {

    }
}
