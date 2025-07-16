package practice_2v;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String someoOwner){
        this.owner = someoOwner;
    }
    String getOwner(){
        return this.owner;

    }
    void setOwner(String newOwner){
        this.owner = newOwner;

    }

    double deposit(double amount){
        return this.balance += amount;
    }

    double withdraw(double amount){
        return this.balance -= amount;

    }
    void  printBalance(){
        System.out.println("Ваш баланс: " + this.balance);
    }
}
