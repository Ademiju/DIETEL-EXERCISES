package africa.semicolon.phoneBook.controller;

import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;
import africa.semicolon.phoneBook.dtos.responses.AddContactResponse;
import africa.semicolon.phoneBook.dtos.responses.ApiResponse;
import africa.semicolon.phoneBook.dtos.responses.FindContactResponse;
import africa.semicolon.phoneBook.exceptions.AddContactFailureException;
import africa.semicolon.phoneBook.exceptions.ContactDoesNotExistException;
import africa.semicolon.phoneBook.services.ContactService;
import africa.semicolon.phoneBook.services.ContactServiceImpl;
import africa.semicolon.phoneBook.utils.NameCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/contact")
@RestController
public class ContactController {
@Autowired
    private ContactService contactService;

    @PostMapping("/addContact")

    public ResponseEntity<?> addNewContact(@RequestBody AddContactRequest request){
        try {
            NameCase.changeToSentenceCase(request);
            return new ResponseEntity<>(contactService.addContact(request),HttpStatus.CREATED);
        }catch (AddContactFailureException error){
            return new ResponseEntity<>(new ApiResponse(false, error.getMessage()),HttpStatus.NOT_ACCEPTABLE);
        }

    }
    @GetMapping("/mobile/{phoneNumber}")
    public ResponseEntity<?> getContactByPhoneNumber(@PathVariable String phoneNumber){
        try {
            return new ResponseEntity<>(contactService.findByPhoneNumber(phoneNumber), HttpStatus.FOUND) ;
        } catch (ContactDoesNotExistException error){
            return new ResponseEntity<>(new ApiResponse(false, error.getMessage()),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/name/{firstName}")
    public ResponseEntity<?> getContactResponseByFirstName(@PathVariable String firstName){
        try {
            return new ResponseEntity<>(contactService.findByFirstName(firstName), HttpStatus.FOUND) ;
        } catch (ContactDoesNotExistException error){
            return new ResponseEntity<>(new ApiResponse(false, error.getMessage()),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/search/{firstName}")
    public ResponseEntity<?> getContactByFirstName(@PathVariable String firstName){
        try {
            return new ResponseEntity<>(contactService.findContactByFirstName(firstName), HttpStatus.FOUND) ;
        } catch (ContactDoesNotExistException error){
            return new ResponseEntity<>(new ApiResponse(false, error.getMessage()),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{phoneNumber}")
    public ResponseEntity<?> deleteByPhoneNumber(@PathVariable String phoneNumber){
        try {
            contactService.deleteByMobile(phoneNumber);
            return new ResponseEntity<>(new ApiResponse(true,"Deleted Successfully"), HttpStatus.FOUND) ;
        }catch(ContactDoesNotExistException error){
            return new ResponseEntity<>(new ApiResponse(false, error.getMessage()),HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/deleteAll")
    public void deleteAll(){
        contactService.deleteAll();
    }
}

