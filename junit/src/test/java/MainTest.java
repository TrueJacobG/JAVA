import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

    @Test
    public void shouldAddUser(){
        Manager manager = new Manager();
        // if gives true, then error
        Assertions.assertFalse(manager.getLength() <= 0);
        // if value is not as expected, then error
        Assertions.assertEquals(1, manager.getLength());
    }

    // if this doesn't throw error, then something is not alright
    @Test
    @DisplayName("Name == null, gives error")
    public void checkName(){
        Assertions.assertThrows(RuntimeException.class, () ->{
            new User(null, "Cool", 123321123);
        });
    }


    // check if every value of array gives RuntimeException, if no then error
    // surname becomes "" then "a" then...
    @DisplayName("Surname == null or length == 0, gives error")
    @ParameterizedTest
    // You can also use MethodSource(func that returns list of strings in this example)
    @ValueSource(strings = {"", "a", "bb"})
    public void checkSurname(String surname){
        Assertions.assertThrows(RuntimeException.class, () ->{
            new User("asd", surname, 123_231_123);
        });
    }
}