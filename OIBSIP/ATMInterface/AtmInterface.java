import java.util.Scanner;
class AtmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, ch1, ch2;
        System.out.println("----------WELCOME TO ATM----------");
        System.out.println("1.Register");
        System.out.println("2.Exit");

        System.out.print("Enter Your Choice:");
        choice = sc.nextInt();
        if (choice == 1) {
            BankAccount bankAccount = new BankAccount();
            bankAccount.register();
            System.out.println("1.Login");
            System.out.println("2.Exit");
            /**
            * User enters their choice whether to login or to exit.
            * 
            */
            System.out.print("Enter Your Choice:");
            ch1 = sc.nextInt();
            if (ch1 == 1) 
            {
                if (bankAccount.login()) 
                {
                    System.out.println("\n");
                    System.out.println("----------WELCOME----------");
                    boolean isFinished = false;
                    while (!isFinished) 
                    {
                        System.out.print("\n");
                        System.out.println(
                                "1.Withdraw \n2.Deposit \n3.Check Balance\n4.Transfer\n5.Transaction History \n6.Exit");
                        System.out.print("Enter Your Choice :");
                        ch2 = sc.nextInt();
                        switch (ch2) {
                            case 1:
                                bankAccount.withdraw();
                                break;
                            case 2:
                                bankAccount.deposit();
                                break;
                            case 3:
                                bankAccount.checkBalance();
                                break;
                            case 4:
                                bankAccount.transfer();
                                break;
                            case 5:
                                bankAccount.transHistory();
                                break;
                            case 6:
                                isFinished = true;
                                break;
                        }
                    }
                }
            } 
            else
                System.out.print("Thank you visit again!"); 
        } 
        else
            System.out.print("Thank you visit again!");
    }
}
