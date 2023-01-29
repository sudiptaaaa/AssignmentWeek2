package AbstractClass;

public class TesterBank{
    public static void main(String[] args) {    

        BankA A = new BankA();
        A.getBalance();       

        BankB B = new BankB();
        B.getBalance();       

        BankC C = new BankC();
        C.getBalance();     
    }
}

/*
 * Output:
 * Balance deposited in Bank A: $100
 * Balance deposited in Bank B: $150
 * Balance deposited in Bank C: $200
 */
