package africa.semicolon.phoneBook.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Document("Contacts")
public class Contact {
    @Id
    private String id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    private String middleName;
    @NonNull
    private String mobile;
    private String office;
}
