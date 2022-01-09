package chapterFive;

public class AutoPolicy {
    private String accountNumber;
    private String state;
    private String makeAndModel;


    public AutoPolicy(String accountNumber, String state, String makeAndModel){
        this.accountNumber = accountNumber;
        this.state = state;
        this.makeAndModel = makeAndModel;
    }

    public void setAccountNumber(String newAccountNumber){
        accountNumber = newAccountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel() {
        return makeAndModel;
    }

   public boolean isNoFaultState(){
        boolean noFaultState;
        switch(getState()){
            case "MA":
            case "NY":
            case "NJ":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;

        }
        return noFaultState;
   }
}
