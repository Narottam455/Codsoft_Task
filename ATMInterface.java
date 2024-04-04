import java.util.*;
public class ATMInterface {
    public static void main(String[] args){
        double totalbalance =2000;
        atm ATM=new atm(totalbalance);
        Scanner sc= new Scanner(System.in);
        while (1==1){
            ATM.ATMMENU();
            System.out.print("Enter your option:- ");
            int option = sc.nextInt();
            ATM.selectoption(option);
            System.out.println();

        }
    }

}
