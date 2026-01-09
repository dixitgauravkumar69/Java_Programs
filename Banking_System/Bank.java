package Banking_System;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Deposit\n" +
                "2.Withdraw\n" +
                "3.View_Statement");

        int action=sc.nextInt();


        Bankaccount Gaurav=new Bankaccount();

        switch(action)
        {
            case 1:
                Gaurav.deposit();
                break;
            case 2:
                Gaurav.withdraw();
                break;
            case 3:
                Gaurav.view_Statement();
                break;
            default:
                System.out.println("Choose correct Option");
        }



    }
}
