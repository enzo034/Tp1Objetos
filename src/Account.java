public class Account
{
    private int id;
    private String name;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public Account()
    {
        id = -1;
        name = "N";
        balance = -1.0;
    }

    public Account(int id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public double depositAccount(double deposit)
    {
        balance += deposit;
        return balance;
    }

    public double withdrawAccount(double withdraw)
    {
        if(withdraw <= balance)
        {
            balance -= withdraw;
        }
        else
        {
            System.out.println("The balance is insufficient. Actual balance  = " + balance);
        }
        return balance;
    }

    public void showData()
    {
        System.out.println("Account[Id = " + id + ", name = " + name + ", balance = " + balance + "]");
    }

}