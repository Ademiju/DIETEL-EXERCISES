package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.dtos.requests.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.FindPackageResponse;

public interface PackageService {
    AddPackageResponse newResponse (AddPackageRequest request);

    PackageRepository getRepository();

    FindPackageResponse findPackageById(int id);



}
