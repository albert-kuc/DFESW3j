package vendormachine.users.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    Wallet object;

    @BeforeEach
    public void setup() {
        object = new Wallet("brandName", 200f);
    }

    @Test
    public void constructor_TEST() {
        // Override object to test another constructor
        object = new Wallet();

        assertTrue(object instanceof Wallet);
    }

    @Test
    public void constructor_wCredit_TEST() {
        // Override object to test another constructor
        object = new Wallet(100f);

        assertTrue(object instanceof Wallet);
    }

    @Test
    public void constructor_wCreditAndBrand_TEST() {

        assertTrue(object instanceof Wallet);

    }

    @Test
    public void getAllCredit_TEST() {

        assertEquals(200, object.getAllCredit());
    }

    @Test
    public void getBrand_TEST() {

        assertEquals("brandName", object.getBrand());
    }

    @Test
    public void addCredit_TEST() {
        object.addCredit(100f);

        assertEquals(300, object.getAllCredit());
    }

    @Test
    public void getCredit_TEST() {

        float credit = object.getCredit(150f);
        assertEquals(150f, credit);
        assertEquals(50f, object.getAllCredit());
    }

    @Test
    public void getCreditFail_TEST() {

        float credit = object.getCredit(1000f);
        assertEquals(0, credit);
        assertEquals(200, object.getAllCredit());
    }

    @Test
    public void setCredit_TEST() {
        object.setCredit(1000f);
        assertEquals(1000, object.getAllCredit());
    }

    @Test
    public void setBrand_TEST() {
        object.setBrand("newBrand");
        assertEquals("newBrand", object.getBrand());
    }
}