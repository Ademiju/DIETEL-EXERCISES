package chapterThree;

public class PetrolPurchase {

    private String petrolStationLocation;
    private String petrolType;
    private int quantityOfPetrolInLitre;
    private double pricePerLitre;
    private double percentageDiscount;
    private double purchaseAmount;

    public PetrolPurchase (String location, String petrolType, int quantityOfPetrolInLitre, double price, double discount){

        petrolStationLocation = location;

        this.petrolType = petrolType;

         this.quantityOfPetrolInLitre= quantityOfPetrolInLitre;

        pricePerLitre = price;

        percentageDiscount = discount;


    }

    public void setLocation(String location){

        petrolStationLocation = location;
    }
    public String getLocation(){

        return petrolStationLocation;
    }
    public void setPetrolType(String typeOfPetrol){

        petrolType = typeOfPetrol;
    }
    public String getType(){
        return petrolType;

    }

    public void setQuantity(int quantityOfPetrolInLitre){

        this.quantityOfPetrolInLitre = quantityOfPetrolInLitre;
    }

    public int getQuantity(){

        return quantityOfPetrolInLitre;
    }

    public void setPrice(double price){
        pricePerLitre = price;

    }

    public double getPrice(){

        return pricePerLitre;
    }

    public void  setDiscount(double discount) {
        percentageDiscount =discount;
    }
    public double getDiscount(){
        return percentageDiscount;
    }



    public void calculatePurchaseAmount(){
       double purchase =  this.quantityOfPetrolInLitre*this.pricePerLitre;
       purchaseAmount = purchase - (purchase *this.percentageDiscount*0.01);

    }

    public double getPurchaseAmount(){

        return purchaseAmount;
    }

}
