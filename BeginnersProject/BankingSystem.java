import java.util.HashMap;

abstract class Account{
    public abstract void Deposit(String id, int amount);
    public abstract void Withdraw(String id, int amnount) throws Exception;
    // public abstract void Transfer(String id, int amount);
}
class SaADB{
    public static HashMap <String, Integer> db = new HashMap<>();
    public static int getAmount(String id){
        return db.getOrDefault(id, 0);
    }
    public static void setAmount(String id, int amount){
        db.put(id, amount);
    }
}
class CuADB{
    public static HashMap <String, Integer> db = new HashMap<>();
    public static int getAmount(String id){
        return db.getOrDefault(id, 0);
    }
    public static void setAmount(String id, int amount){
        db.put(id, amount);
    }
}
class SavingAccount extends Account{
    private int amount;
    private String id;
    public SavingAccount (String id, int amount){
        this.amount = amount;
        this.id = id;
        SaADB.setAmount(id, amount);
    }
    
    @Override
    public void Deposit(String id, int amount){
        int cur = SaADB.getAmount(id);
        int updated_account = cur + amount;
        SaADB.setAmount(id, updated_account);
        System.out.println(amount + " has been deposited.");
        System.out.println("Current amount " + updated_account);
    }
    @Override
    public void Withdraw(String id, int amount) throws Exception{
        int cur = SaADB.getAmount(id);
        if (amount > cur) throw new Exception("Error !!"); 
        int updated_account = cur - amount;
        SaADB.setAmount(id, updated_account);
        System.out.println(amount + " has been credited.");
        System.out.println("Current amount " + updated_account);
    }

}
class CurrentAccount extends Account{
    private int amount;
    private String id;
    public CurrentAccount (String id, int amount){
        this.amount = amount;
        this.id = id;
        CuADB.setAmount(id, amount);
    }
    @Override
    public void Deposit(String id, int amount){
        int cur = CuADB.getAmount(id);
        int updated_account = amount + cur;
        CuADB.setAmount(id, updated_account);
        System.out.println(amount + " has been deposited.");
        System.out.println("Current amount " + updated_account);
    }
    @Override
    public void Withdraw(String id, int amount) throws Exception{
        int cur = CuADB.getAmount(id);
        if (amount > cur) throw new Exception("Error !!");
        int updated_account = cur - amount;
        CuADB.setAmount(id, updated_account);
        System.out.println(amount + " has been credited.");
        System.out.println("Current amount " + updated_account);
    }

}
class Customer{
    private String name;
    private String id;
    private SavingAccount savingaccount;
    private CurrentAccount currentaccount;

    Customer(String name, String id){
        this.name = name;
        this.id = id;
    }
    Customer (String id){
        this.id = id;
    }

    // setters
    public void setSavingAccount (SavingAccount savingaccount){
        this.savingaccount = savingaccount;
    }
    public void setCurrentAccount(CurrentAccount currentaccount){
        this.currentaccount = currentaccount;
    }

    //getters
    public String getId(){
        return id;
    }
    public SavingAccount getSavingAccount(){
        return savingaccount;
    }
    public CurrentAccount getCurrentAccount(){
        return currentaccount;
    }
}
public class BankingSystem{
    public static void main(String[] args) {

        // CuADB.db.clear(); SaADB.db.clear();

        Customer c1 = new Customer("Lionel", "1001");
        SavingAccount sa = new SavingAccount("SA-1001", 12000);
        c1.setSavingAccount(sa);

        Customer c2 = new Customer("1002");
        CurrentAccount ca = new CurrentAccount("CA-1002", 100);
        ca = new CurrentAccount("CA-1002", 1000);
        c2.setCurrentAccount(ca);
        try {
            c1.getSavingAccount().Withdraw("SA-1001", 2000);
        } catch (Exception e) {
            System.out.println("Not enough money at the account");
        }

        try {
            c2.getCurrentAccount().Withdraw(null, 100000);
        } catch (Exception e) {
             System.out.println("Not enough money at the account");
        };


    }
}
