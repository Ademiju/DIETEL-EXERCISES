package chapterThree;

public class Car {

    private String model;
    private String year;
    private double price;
    private double discount;

    public Car(String carModel, String carModelYear, double carPrice){
        model = carModel;
        year = carModelYear;
        price = carPrice;


    }
    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }
    public void setYear(String carModelYear){
        year = carModelYear;
    }
    public String getYear(){
        return year;
    }
    public void setPrice(double carPrice){
        if (carPrice > 0.0) {
            price = carPrice;
        }
        else{
            System.out.println("Car prices cannot be negative.....Try Again");
        }
    }
    public double getPrice(){
        return price;
    }

    public void setDiscountPrice(double carDiscount){
        price = price - carDiscount*0.01*price;
    }

}
