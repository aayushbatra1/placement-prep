package OOP;

class BankAccount{
    private String owner;
    private int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    //getter
    public int getBalance(){
        return balance;
    }
    //setter with validation
    public void setBalance(int balance){
        if (balance < 0){
            System.out.print("Balance can't be negative!");
        }else{
            this.balance = balance;
        }
    }
    void showDetails(){
        System.out.println(owner + "'s balance: " + balance);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Aayush", 10000);
        acc.showDetails();

        acc.setBalance(-500);
        acc.setBalance(15000);
        acc.showDetails();
    }
}
