package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.Package;
import africa.semicolon.sendAm.data.models.PackageDescription;
import africa.semicolon.sendAm.data.models.Status;
import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.data.repositories.PackageRepositoryImpl;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.FindPackageResponse;

public class PackageServiceImpl implements PackageService{
    private PackageRepository packageRepository = new PackageRepositoryImpl();

    @Override
    public AddPackageResponse newResponse(AddPackageRequest request) {
        AddPackageResponse addPackageResponse = new AddPackageResponse();
        PackageDescription packageDescription = new PackageDescription();
        Package newPackage = new Package();
        packageDescription.setWeightInGrammes(request.getWeightInGrammes());
        packageDescription.setName(request.getName());
        newPackage.setDescription(packageDescription);
        Status status = new Status();
        status.setStatus("Package added");
        newPackage.getStatusList().add(status);
        Package savedPackage = packageRepository.save(newPackage);


        addPackageResponse.setDescription(packageDescription);
        addPackageResponse.setQuantity(request.getQuantity());
        return addPackageResponse;
    }

    @Override
    public PackageRepository getRepository() {
        return packageRepository;
    }

    @Override
    public FindPackageResponse findPackageById(int id) {
        return null;
    }
}
