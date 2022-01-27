package WarmUp;

public class Husband {
    private Wife myWife;

    Husband(Wife myWife){
        this.myWife = myWife;

    }

    public void askMyWifeToCook(String foodToCook){
        System.out.println("Baby i need you to cook for Uncle Tunde");
        if(foodToCook == "Eba") {
            System.out.println("I don't cook Eba");
        }
        else {
            System.out.printf("I can cook %s%n",foodToCook);
            myWife.cook(foodToCook);

        }
    }

}
