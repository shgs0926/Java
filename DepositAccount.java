
public class DepositAccount {
    //账号
    private String account;
    //储户姓名
    private String name;
    //存款余额
    private double depositBalance;
    //年利率
    public static double annualInterestRate ;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        DepositAccount.annualInterestRate = annualInterestRate;
    }

    public void createAccount(String account,String name,double depositBalance){
        setAccount(account);
        setName(name);
        this.depositBalance = depositBalance;
    }

    public void deposit(double money){
      this.depositBalance+=money;
    }

    public double computeBalance(){
        return depositBalance*annualInterestRate+depositBalance;
    }

    public static void main(String[] args) {
        DepositAccount saver = new DepositAccount();
        DepositAccount.setAnnualInterestRate(0.023);
        saver.createAccount("1234567890","ZhangSan",5000);
        saver.deposit(2000);
        System.out.println("余额为 ："+saver.getDepositBalance());
        System.out.println("年利息为："+ saver.computeBalance());
    }
}
