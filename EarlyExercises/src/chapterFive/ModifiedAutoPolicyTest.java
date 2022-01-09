package chapterFive;

public class ModifiedAutoPolicyTest {
    public static void main(String[] args) {
        ModifiedAutoPolicy policy1 = new ModifiedAutoPolicy("23434GGH","NY","Toyota Corolla");
        policy1.setState("MA");
        System.out.println(policy1.getState());


    }
}
