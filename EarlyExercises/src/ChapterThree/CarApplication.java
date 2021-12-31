package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car test = new Car("TestModel","2020",0);
        test.setModel("Free Cruise");
        test.setYear("2021 L.E");
        test.setPrice(1_000_000);
//        test.setPrice(-5666);
        System.out.println("My test car model is "+test.getModel());
        System.out.println("My test car Year of production is "+test.getYear());
        System.out.println("My test car Price is #"+test.getPrice());
        System.out.println();

        Car toyota = new Car("Toyota Camry AWD","2020",15_100_900.64);
        Car lexus = new Car("Lexus ES Hybrid","2020",19_038_567.33);

        System.out.println(toyota.getModel()+" "+toyota.getYear()+" price is #"+ toyota.getPrice());
        System.out.println(lexus.getModel()+" "+lexus.getYear()+" price is #"+lexus.getPrice());
        System.out.println();
        toyota.setDiscountPrice(5);
        lexus.setDiscountPrice(7);

        System.out.println(toyota.getModel()+" "+toyota.getYear()+" discounted price is #"+ toyota.getPrice());
        System.out.println(lexus.getModel()+" "+lexus.getYear()+" discounted price is #"+lexus.getPrice());



    }
}
