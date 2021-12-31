package chapterThree;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase semicolon = new PetrolPurchase("Yaba","Diesel", 0,655,3);

        semicolon.setLocation("Bariga");
        semicolon.setPetrolType("Gasolene");
        semicolon.setPrice(750.0);
        semicolon.setQuantity(300);
        semicolon.setDiscount(15);
        semicolon.calculatePurchaseAmount();
        System.out.println("Your fuel purchase location is "+semicolon.getLocation());
        System.out.println(("Your petrol Type is "+semicolon.getType()));
        System.out.println("Your Quantity of "+semicolon.getType()+" purchased is "+semicolon.getQuantity());
        System.out.println("The price of "+semicolon.getQuantity()+" litres of "+semicolon.getType()+" purchased is #"+semicolon.getPrice()+" per litres");
        System.out.println("The discount on "+semicolon.getQuantity()+" litres of "+semicolon.getType()+" purchased is "+semicolon.getDiscount());
        System.out.println("Your net purchase Amount is #"+semicolon.getPurchaseAmount());
    }
}
