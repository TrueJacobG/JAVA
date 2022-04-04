public class User {

    private String name;
    private String surname;
    private int phoneNumber;

    User(String name, String surname, int phoneNumber) {
        validate(name, surname, phoneNumber);
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    private void validate(String name, String surname, int phoneNumber) {
        validateName(name);
        validateSurname(surname);
        validatePhoneNumber(phoneNumber);
    }

    private void validateName(String name) {
        if(name == null || name.length() == 0){
            throw new RuntimeException("You have to use name!");
        }
    }

    private void validateSurname(String surname) {
        if(surname == null || surname.length() < 3){
            throw new RuntimeException("You have to use surname!");
        }
    }

    private void validatePhoneNumber(int phoneNumber) {
        if(String.valueOf(phoneNumber).length() != 9){
            throw new RuntimeException("Your phone number must be 9 numbers length!");
        }
    }

}
