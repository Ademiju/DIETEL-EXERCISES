package bankApp;

public enum Type {SAVINGS(5.20),CURRENT(2.5),TEENS(3.2);
    private final double interest;

    Type(double interest){
        this.interest  = interest;
    }

    public double getInterest() {
        return interest;
    }
}
