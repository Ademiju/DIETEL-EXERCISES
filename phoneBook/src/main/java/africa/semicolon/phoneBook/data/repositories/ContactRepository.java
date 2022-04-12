package africa.semicolon.phoneBook.data.repositories;

import africa.semicolon.phoneBook.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact findByMobile(String mobile);
    Contact findByFirstName(String firstName);
    void deleteAll();





}
