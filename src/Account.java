public class Account {
    int acctNumber;
    int balance;
    private Course courses;

    //Constructor
    public Account(int studentID, int balance, Course courses) {
        this.acctNumber = studentID;
        this.balance = balance;
        this.courses = courses;
    }

    //Setters and Getters
    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //toString


    @Override
    public String toString() {
        return "Account" +
                "acctNumber= " + '\n' + acctNumber +
                "balance=" + balance;
    }

    //Add Class Amount Method(Amount)

    //Make Payment Method(Amount)

}
