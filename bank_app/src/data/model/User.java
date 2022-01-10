package data.model;

public class User {
    private Gender gender;
    private String email;
    private String lastName;
    private String firstName;
    private String accountNumber;
    private String phoneNumber;

    public User(String firstName, String lastName, String email, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void updateProfile(UserUpdateForm updateForm) {
        if (updateForm.getFirstName() != null && updateForm.getFirstName().trim() != ""){
            firstName = updateForm.getFirstName();
        }
        if (updateForm.getLastName() != null && updateForm.getLastName().trim() != ""){
            lastName = updateForm.getLastName();
        }
        if (updateForm.getPhoneNumber() != null && updateForm.getPhoneNumber().trim() != ""){
            phoneNumber = updateForm.getPhoneNumber();
        }
        if (updateForm.getEmail() != null && updateForm.getEmail().trim() != ""){
            email = updateForm.getEmail();
        }
        if (updateForm.getAccountNumber() != null && updateForm.getAccountNumber().trim() != ""){
            accountNumber = updateForm.getAccountNumber();
        }
        if (updateForm.getGender() != null){
            gender = updateForm.getGender();
        }
    }
}
