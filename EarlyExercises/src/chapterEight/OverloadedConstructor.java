package chapterEight;

public class OverloadedConstructor {
    private int cocoaQty;
    private int milkQty;
    private int sugarQty;

    public OverloadedConstructor (int cocoaQty,int milkQty,int sugarQty){
        this.cocoaQty = cocoaQty;
        this.milkQty = milkQty;
        this.sugarQty = sugarQty;
    }
    public OverloadedConstructor(){
        sugarQty = 5;
    }
    public OverloadedConstructor(int cocoaQty, int milkQty){
        this.cocoaQty = cocoaQty;
        this.milkQty = milkQty;
    }
    public OverloadedConstructor(int milkQty){
        this(0,milkQty);
    }

    public int getCocoaQty() {
        return cocoaQty;
    }

    public void setCocoaQty(int cocoaQty) {
        this.cocoaQty = cocoaQty;
    }

    public int getMilkQty() {
        return milkQty;
    }

    public void setMilkQty(int milkQty) {
        this.milkQty = milkQty;
    }

    public int getSugarQty() {
        return sugarQty;
    }

    public void setSugarQty(int sugarQty) {
        this.sugarQty = sugarQty;
    }
}
