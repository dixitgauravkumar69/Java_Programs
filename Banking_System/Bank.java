package Banking_System;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Deposit\n" +
                "2.Withdraw\n" +
                "3.View_Statement");

        int action=sc.nextInt();


        Bankaccount Kunal=new Bankaccount();

        switch(action)
        {
            case 1:
                Kunal.deposit();
                break;
            case 2:
                Kunal.withdraw();
                break;
            case 3:
                Kunal.view_Statement();
                break;
            default:
                System.out.println("Choose correct Option");
        }



    }
}
