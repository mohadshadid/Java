import java.util.ArrayList;

class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static ArrayList<BankAccount> allAccounts=new ArrayList<BankAccount>();  
    
    BankAccount(){
        checkingBalance=0;
        savingsBalance=0;
        allAccounts.add(this);
    }

    BankAccount(double checkingBalance,double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        allAccounts.add(this);
    }
    public static int accountNumbers(){
        return allAccounts.size();
    }
    public static double tottalMoney(){
        double tottalMoney=0;
        for(BankAccount account:allAccounts){
            System.out.println(account.checkingBalance);
            tottalMoney+=account.checkingBalance+account.savingsBalance;
        }
        return tottalMoney;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void deposit(String account, double money){
        if ("checking".equals(account)){
            checkingBalance+=money;
        }
        else if ("saving".equals(account)){
            savingsBalance+=money;
        }
        else{
            System.out.println("Invalid account");
        }

    }
    public void withdraw(String account, double money){
        if ("checking".equals(account)){
            if (this.checkingBalance>=money){
                checkingBalance-=money;
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        else if ("saving".equals(account)){
            if(this.savingsBalance>=money){
                savingsBalance-=money;
            }
        }
        else{
            System.out.println("Invalid account");
        }
    }

}
