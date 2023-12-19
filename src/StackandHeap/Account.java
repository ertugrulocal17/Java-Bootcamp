package StackandHeap;

public class Account {
    int accountId;
    String accountName;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public static void main(String[] args) {
        int accountId = 1;
        String accountName = "John";

        Account account = null;
        account = printAccount(accountId, accountName);
    }
    static Account printAccount(int accountId, String accountName){
        return new Account(accountId, accountName);
    }
}
