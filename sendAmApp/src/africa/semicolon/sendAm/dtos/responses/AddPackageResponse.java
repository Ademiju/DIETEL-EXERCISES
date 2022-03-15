package africa.semicolon.sendAm.dtos.responses;

import africa.semicolon.sendAm.data.models.PackageDescription;

public class AddPackageResponse {
    private int quantity;
    private PackageDescription description;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PackageDescription getDescription() {
        return description;
    }

    public void setDescription(PackageDescription description) {
        this.description = description;
    }
}
