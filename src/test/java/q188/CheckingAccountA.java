package q188;

public class CheckingAccountA {
    public int amount;
    public CheckingAccountA(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int x) {
    	amount += x;
    }
    public static void main(String[] args) {
        CheckingAccountA acct = new CheckingAccountA((int)(Math.random()*1000));
        // line n1
        acct.amount=0;
//        acct.setAmount(0);
//        acct.changeAmount(-acct.amount);

         System.out.println(acct.getAmount());
     }
 
}
//Which three lines, when inserted independently at line n1,
// cause the program to print a 0 balance?
//B.	acct.amount = 0;
//C.	acct.setAmount(0);
//G.	acct.changeAmount(-acct.amount);

