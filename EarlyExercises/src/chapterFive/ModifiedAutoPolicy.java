package chapterFive;

public class ModifiedAutoPolicy {
    private String accountNumber;
    private String state;
    private String makeAndModel;


    public ModifiedAutoPolicy(String accountNumber, String state, String makeAndModel){
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
        if(state == "ME"||state == "MA"||state == "CT"||state == "NH"||state =="NY"||state == "PA"||state =="VT"||state == "NJ") {
            this.state = state;
        }else{
            System.out.println("Cannot Set State: State entered doesn't exist!!!\nDefault State is: ");

        }
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
