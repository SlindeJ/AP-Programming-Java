package Q2.Prog213vAList;

public class Bank {
    private double myAmount;

    public Bank(double amount) {
        myAmount = amount;
    }

    public Double getAmount() {
        return myAmount;
    }

    public void calc(Transaction thing) {
        if (thing.getCode().equals("D")) {
            myAmount += thing.getAmount();
        }
        if (thing.getCode().equals("S")) {
            myAmount -= thing.getAmount();
        } else if (thing.getCode().equals("C")) {
            if (thing.getAmount() > this.getAmount()) {
                myAmount = this.getAmount() - 10;
            } else {
                myAmount -= thing.getAmount();
            }
        }
    }
}
