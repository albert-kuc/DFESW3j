package vendormachine.users;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void constructor_TEST() {
        Person object = new Person("testName");

        assertTrue(object instanceof Person);
    }

    @Test
    public void getName_TEST() {
        Person object = new Person("testName");
        assertEquals("testName", object.getName());
    }
}