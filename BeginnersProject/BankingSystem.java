import java.util.HashMap;

abstract class Account{
    public abstract void Deposit(String id, int amount);
    public abstract void Withdraw(String id, int amnount) throws Exception;
    public abstract void Transfer(String id, int amount) throws Exception;
}
class SaADB{
    public static HashMap <String, Integer> db = new HashMap<>();
    public static int getAmount(String id){
        return db.getOrDefault(id, 0);
    }
    public static void setAmount(String id, int amount){
        db.put(id, amount);
    }
    public static boolean getKey (String id){
        return db.containsKey(id);
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
    public static boolean getKey (String id){
        return db.containsKey(id);
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
        System.out.println("For id " + id + " " + amount + " has been deposited.");
        System.out.println("Current amount " + updated_account);
    }
    @Override
    public void Withdraw(String id, int amount) throws Exception{
        int cur = SaADB.getAmount(id);
        if (amount > cur) throw new Exception("Error !!"); 
        int updated_account = cur - amount;
        SaADB.setAmount(id, updated_account);
        System.out.println("For id " + id + " " + amount + " has been debited.");
        System.out.println("Current amount " + updated_account);
    }
    public void Transfer(String id, int amount) throws Exception{
        if (CuADB.getKey(id)){
            int sa_current_amount = SaADB.getAmount(id);
            double limit_transfer = 0.3 * sa_current_amount;
            if (amount > sa_current_amount || amount > limit_transfer) throw new Exception("Error !!");
            int sa_updated_amount = sa_current_amount - amount;
            SaADB.setAmount(id, sa_updated_amount);
            System.out.println("Savings account updated !!!");
            System.out.println(amount + " tk debited. Current deposit " + sa_updated_amount);

            int ca_current_amount  = CuADB.getAmount(id);
            int ca_updated_amount = ca_current_amount + amount;
            CuADB.setAmount(id, ca_updated_amount);
            System.out.println("Savings account updated !!!");
            System.out.println(amount + " tk deposited. Saving deposit " + ca_updated_amount);

        }
        else throw new Exception ("You dont have a Current Account");
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
        System.out.println("For id " + id + " " + amount + " has been deposited.");
        System.out.println("Current amount " + updated_account);
    }
    @Override
    public void Withdraw(String id, int amount) throws Exception{
        int cur = CuADB.getAmount(id);
        if (amount > cur) throw new Exception("Error !!");
        int updated_account = cur - amount;
        CuADB.setAmount(id, updated_account);
        System.out.println("For id " + id + " " + amount + " has been debited.");
        System.out.println("Current amount " + updated_account);
    }
    public void Transfer(String id, int amount) throws Exception{
        if (SaADB.getKey(id)){
            int ca_current_amount = CuADB.getAmount(id);
            if (amount > ca_current_amount) throw new Exception("Error !!");
            int ca_updated_amount = ca_current_amount - amount;
            CuADB.setAmount(id, ca_updated_amount);
            System.out.println("Savings account updated !!!");
            System.out.println(amount + " tk debited. Current deposit " + ca_updated_amount);

            int sa_current_amount  = SaADB.getAmount(id);
            int sa_updated_amount = sa_current_amount + amount;
            SaADB.setAmount(id, sa_updated_amount);
            System.out.println("Savings account updated !!!");
            System.out.println(amount + " tk deposited. Saving deposit " + sa_updated_amount);
        }
        else throw new Exception("Error !! You dont have savings account");
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
        SavingAccount user1 = new SavingAccount("SA-435", 566);
        CurrentAccount user2 = new CurrentAccount("SA-435", 1000);
        user1.Deposit("SA-435", 1000);
        try {
            user1.Withdraw("SA-435", 66);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try{
            user2.Transfer("SA-435", 1000);
        } catch(Exception e){
            e.printStackTrace();
        }

        try{
            user1.Transfer("SA-435", 2000);
        }
        catch(Exception e){
             e.printStackTrace();
        }
    }
}
