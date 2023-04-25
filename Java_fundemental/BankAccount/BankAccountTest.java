class BankAccountTest {
    public static void main(String[] args) {
        System.out.println(BankAccount.tottalMoney());
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount(1500,30000);
        System.out.println(BankAccount.accountNumbers());
        account2.deposit("saving",1500);
        account2.deposit("checking",1500);
        System.out.println(account2.getCheckingBalance());
        System.out.println(account3.getSavingsBalance());
        System.out.println(BankAccount.tottalMoney());
        account3.withdraw("checking",2000);
        account3.withdraw("saving",2000);
        account3.withdraw("tahwish",2000);
        System.out.println(BankAccount.tottalMoney());
    }
}
