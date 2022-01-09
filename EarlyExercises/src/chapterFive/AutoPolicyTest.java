package chapterFive;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy("233344AS", "MA", "Toyota Corolla");

        AutoPolicy policy2 = new AutoPolicy("323341DE", "DA", "Lexus GXS");


        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
        public static void policyInNoFaultState (AutoPolicy policy){
            System.out.printf("The Autopolicy :%nAccount number %s with car model %s of %nState %s ", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState());

            if (policy.isNoFaultState() == true) {
                System.out.println("is a No-Fault State");
            } else {
                System.out.println("is not a No-Fault State");
            }
        }
    }


