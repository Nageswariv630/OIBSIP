import java.util.Scanner;

class BankAccount {
    String userName;
    String password;
    int accountNo = (int) (Math.random() * 999999 + 1000000000);
    double avlBalance;
    String transactionHistory = "";

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username:");
        this.userName = sc.nextLine();
        System.out.print("Enter new Password:");
        this.password = sc.nextLine();
        System.out.print("Your Account Number:" + accountNo);
        System.out.print("\n");
        System.out.print("Enter amount to deposit:");
        avlBalance = sc.nextDouble();
        System.out.println("Congratulations");
        System.out.println("Bank account created Successfully! ");
    }

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin) {
            System.out.print("Enter Your Username:");
            String name = sc.nextLine();
            if (name.equals(userName)) {
                while (!isLogin) {
                    System.out.print("Enter Your Password :");
                    String Password = sc.nextLine();
                    if (Password.equals(password)) {
                        System.out.print("Login successful");
                        isLogin = true;
                    } else {
                        System.out.println("Incorrect Password");
                    }
                }
            } else {
                System.out.println("Username not found");
            }
        }
        return isLogin;
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw:");
        float amount = sc.nextFloat();
        try {
            if (avlBalance >= amount) {
                avlBalance = avlBalance - amount;
                System.out.println("Withdraw Successfully");
                System.out.println("please collect your cash");
                System.out.println("Available balance is:" + avlBalance);
                String str = amount + "/- Withdrawed\n";
                transactionHistory = transactionHistory.concat(str);
            } else {
                System.out.println("Insufficient Balance");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit:");
        double amount = sc.nextDouble();
        try {
            avlBalance = avlBalance + amount;
            System.out.println("Amount Deposited Successfully");
            String str = amount + "/- deposited\n";
            transactionHistory = transactionHistory.concat(str);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number to transfer:");
        int recAccNo = sc.nextInt();
        System.out.print("Enter amount to transfer:");
        float amount = sc.nextFloat();
        try {
            if (avlBalance >= amount) {
                if (amount <= 10000) {
                    avlBalance = avlBalance - amount;
                    System.out.println("Successfully Transfered to Account no: " + recAccNo);
                    String str = amount + " /- transfered to Acc number " + recAccNo + "\n";
                    transactionHistory = transactionHistory.concat(str);
                } else {
                    System.out.println("Sorry your Limit is only 10000");
                }
            } else {
                System.out.println("Insufficient Balance");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance" + avlBalance + "/-");
    }

    public void transHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions are done");
        } else {
            System.out.println("Transaction history:");
            System.out.println(transactionHistory);
        }
    }
}