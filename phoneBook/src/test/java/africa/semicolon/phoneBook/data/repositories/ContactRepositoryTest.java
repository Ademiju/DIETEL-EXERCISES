package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@DataMongoTest
public class ContactRepositoryTest {

    @Autowired
    private ContactRepository repository;
    @Test
    public void saveContactTest(){
        Contact contact = new Contact("Increase", "Uwadiale","08069");
        contact.setOffice("23 yaba");
        contact.setMiddleName("Lois");
        Contact savedContact = repository.save(contact);
        assertNotNull(savedContact.getId());
//        assertEquals(1,repository.count() );
        assertThat(savedContact.getId(),is(notNullValue()));
        assertThat(repository.count(),is(1L));
    }
}