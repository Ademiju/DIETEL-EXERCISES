package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.Package;
import africa.semicolon.sendAm.data.models.PackageDescription;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageServiceImplTest {

    @Test
    void packageCanBeCreatedTest(){
         PackageService packageService = new PackageServiceImpl();
        addOnePackage(packageService);

        assertEquals(1,packageService.getRepository().count());
    }

    private void addOnePackage(PackageService packageService) {
        AddPackageRequest newRequest = new AddPackageRequest();

        newRequest.setWeightInGrammes(23.43);
        newRequest.setName("Boxers");
        newRequest.setQuantity(4);
        packageService.newResponse(newRequest);
    }

    @Test
    void moreThanOnePackageCanBeAddedTest(){
        PackageService packageService = new PackageServiceImpl();
        addThreePackages(packageService);

    assertEquals(3,packageService.getRepository().count());
}

    private void addThreePackages(PackageService packageService) {
        addOnePackage(packageService);

        AddPackageRequest secondRequest = new AddPackageRequest();
        secondRequest.setName("Laptop");
        secondRequest.setWeightInGrammes(355.89);
        secondRequest.setQuantity(2);
        packageService.newResponse(secondRequest);

        AddPackageRequest thirdRequest = new AddPackageRequest();
        thirdRequest.setName("Shoe");
        thirdRequest.setWeightInGrammes(155.86);
        thirdRequest.setQuantity(1);
        packageService.newResponse(thirdRequest);
    }

    @Test
    void addingPackageGivesCorrectResponseTest(){
    PackageService packageService = new PackageServiceImpl();
    AddPackageRequest firstRequest = new AddPackageRequest();
    firstRequest.setWeightInGrammes(23.43);
    firstRequest.setName("Boxers");
    firstRequest.setQuantity(4);
    packageService.newResponse(firstRequest);

    assertEquals("Boxers",firstRequest.getName());
    assertEquals(23.43,firstRequest.getWeightInGrammes());
    assertEquals(4, firstRequest.getQuantity());
}
    @Test
    void addingMoreThanOnePackageGivesTheCorrectResponseTest() {
        PackageService packageService = new PackageServiceImpl();
        AddPackageRequest firstRequest = new AddPackageRequest();
        firstRequest.setWeightInGrammes(23.43);
        firstRequest.setName("Boxers");
        firstRequest.setQuantity(4);
        packageService.newResponse(firstRequest);
        assertEquals("Boxers", firstRequest.getName());
        assertEquals(23.43, firstRequest.getWeightInGrammes());
        assertEquals(4, firstRequest.getQuantity());

        AddPackageRequest secondRequest = new AddPackageRequest();
        secondRequest.setName("Laptop");
        secondRequest.setWeightInGrammes(355.89);
        secondRequest.setQuantity(2);
        packageService.newResponse(secondRequest);
        assertEquals("Laptop", secondRequest.getName());
        assertEquals(355.89, secondRequest.getWeightInGrammes());
        assertEquals(2, secondRequest.getQuantity());

        AddPackageRequest thirdRequest = new AddPackageRequest();
        thirdRequest.setName("Shoe");
        thirdRequest.setWeightInGrammes(155.86);
        thirdRequest.setQuantity(1);
        packageService.newResponse(thirdRequest);
        assertEquals("Shoe", thirdRequest.getName());
        assertEquals(155.86, thirdRequest.getWeightInGrammes());
        assertEquals(1, thirdRequest.getQuantity());
    }
    @Test
    void
}