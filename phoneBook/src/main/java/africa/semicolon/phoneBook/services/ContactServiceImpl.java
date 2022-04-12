package africa.semicolon.phoneBook.services;

import africa.semicolon.phoneBook.data.models.Contact;
import africa.semicolon.phoneBook.data.repositories.ContactRepository;
import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponse;
import africa.semicolon.phoneBook.dtos.responses.FindContactResponse;
import africa.semicolon.phoneBook.exceptions.AddContactFailureException;
import africa.semicolon.phoneBook.exceptions.ContactDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactRepository database;
    @Override
    public AddContactResponse addContact(AddContactRequest addContactRequest) {
        if (phoneNumberExist(addContactRequest.getPhoneNumber()))
            throw new AddContactFailureException("Phone number already Exist");
        String firstName = addContactRequest.getFirstName();
        String lastName = addContactRequest.getLastName();
        String middleName = addContactRequest.getMiddleName();
        String phoneNumber = addContactRequest.getPhoneNumber();
        String officeAddress = addContactRequest.getOfficeAddress();

        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        newContact.setMiddleName(middleName);
        newContact.setOffice(officeAddress);
        database.save(newContact);
        AddContactResponse addContactResponse = new AddContactResponse();
        addContactResponse.setFullName(firstName + " " + lastName);
        addContactResponse.setPhoneNumber(phoneNumber);
        return addContactResponse;
    }

    private boolean phoneNumberExist(String phoneNumber) {
        Contact contact = database.findByMobile(phoneNumber);
        return contact != null;
    }

    @Override
    public ContactRepository getRepository() {
        return database;
    }

    @Override
    public FindContactResponse findByPhoneNumber(String phoneNumber) {
        Contact contact = database.findByMobile(phoneNumber);
        if(contact == null) throw new ContactDoesNotExistException(phoneNumber+" does not Exist");
        FindContactResponse response = new FindContactResponse();
        response.setPhoneNumber(contact.getMobile());
        response.setFullName(contact.getFirstName()+" "+contact.getLastName());
        return response;
    }

    @Override
    public FindContactResponse findByFirstName(String firstName) {
        Contact contact = database.findByFirstName(firstName);
        if(contact == null) throw new ContactDoesNotExistException(firstName+" does not Exist");
        FindContactResponse response = new FindContactResponse();
        response.setPhoneNumber(contact.getMobile());
        response.setFullName(contact.getFirstName()+" "+contact.getLastName());
        return response;
    }

    @Override
    public Contact findContactByFirstName(String firstName) {
        Contact contact = database.findByFirstName(firstName);
        if(contact == null) throw new ContactDoesNotExistException(firstName+" does not Exist");
        return contact;
    }

    @Override
    public void deleteAll() {
        database.deleteAll();
        System.out.println("All contacts successfully deleted");

    }

    @Override
    public void  deleteByMobile(String mobile) {
        Contact contact = database.findByMobile(mobile);
        if(contact == null) throw new ContactDoesNotExistException(mobile+" does not Exist");
        database.delete(contact);
        System.out.println(contact+" successfully deleted");

    }
}

