package vendormachine.users.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    public void constructor_TEST() {
        Wallet object = new Wallet();

        assertTrue(object instanceof Wallet);
    }

    @Test
    public void constructor_wCredit_TEST() {
        Wallet object = new Wallet(100f);

        assertTrue(object instanceof Wallet);
    }

    @Test
    public void constructor_wCreditAndBrand_TEST() {
        Wallet object = new Wallet("brandName", 100f);

        assertTrue(object instanceof Wallet);

    }

    @Test
    public void getAllCredit_TEST() {
        Wallet object = new Wallet();

        assertEquals(0.5f, object.getAllCredit());
    }

    @Test
    public void getBrand_TEST() {
        Wallet object = new Wallet("brandName", 200f);

        assertEquals("brandName", object.getBrand());
    }

    @Test
    public void addCredit_TEST() {
        Wallet object = new Wallet(200f);
        object.addCredit(100f);

        assertEquals(300, object.getAllCredit());
    }

    @Test
    public void getCredit_TEST() {
        Wallet object = new Wallet(500f);

        float credit = object.getCredit(100f);
        assertEquals(100f, credit);
        assertEquals(400f, object.getAllCredit());
    }

    @Test
    public void getCreditFail_TEST() {
        Wallet object = new Wallet(50f);

        float credit = object.getCredit(100f);
        assertEquals(0f, credit);
        assertEquals(50f, object.getAllCredit());
    }

    @Test
    public void setCredit_TEST() {
        Wallet object = new Wallet(150f);
        object.setCredit(1000f);
        assertEquals(1000, object.getAllCredit());
    }

    @Test
    public void setBrand_TEST() {
        Wallet object = new Wallet();
        object.setBrand("newBrand");
        assertEquals("newBrand", object.getBrand());
    }
}