import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testConstructorIllegalNumber(){
        assertThrows(IllegalArgumentException.class, ()->{
            Card card = new Card("S99");
        });
    }

    @Test
    void testConstructorIllegalColor(){
        assertThrows(IllegalArgumentException.class, ()->{
            Card card = new Card("G2");
        });
    }

    @Test
    void testConstructorIllegalBoth(){
        assertThrows(IllegalArgumentException.class, ()->{
            Card card = new Card("YZ");
        });
    }

    @Test
    void testCardValueJack(){
        Card card = new Card("SJ");
        assertEquals(11,card.getValue());
    }

    @Test
    void testCardValue3(){
        Card card = new Card("C3");
        assertEquals(3,card.getValue());
    }

    @Test
    void testCardValueAce(){
        Card card = new Card("HA");
        assertEquals(14,card.getValue());
    }
}