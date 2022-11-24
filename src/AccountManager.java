public class AccountManager {
    private  double balance;

    public void deposit(double amount){
        balance= getBalance()+amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException{
       if (balance>=amount){
           balance=getBalance()-amount;
       }else{
           throw new BalanceInsufficentException("bakiye yetersiz");
           //System.out.println("hesaptan para çekilmedi bakiye yetersiz");
       }

    }
    public double getBalance(){
        return balance;
    }
}
