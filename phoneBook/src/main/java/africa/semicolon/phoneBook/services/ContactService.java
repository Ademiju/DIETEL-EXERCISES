package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.models.Contact;
import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponse;
import africa.semicolon.phoneBook.dtos.responses.FindContactResponse;

public interface ContactService {
    AddContactResponse addContact(AddContactRequest addContactRequest);

    ContactRepository getRepository();

    FindContactResponse findByPhoneNumber(String phoneNumber);

    FindContactResponse findByFirstName(String firstName);

    Contact findContactByFirstName(String firstName);

    void deleteAll();


    void deleteByMobile(String mobile);


}
