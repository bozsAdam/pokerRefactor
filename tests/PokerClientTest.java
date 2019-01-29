import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    void testHighestCardIsMineAce() {
        PokerClient pokerClient = new PokerClient("h2", "d4", "s7", "sj", "cq");
        assertFalse(pokerClient.highestCardIsMine("s2", "h6", "sj", "d2", "sk"));
    }

    @Test
    void testHighestCardIsMineTen(){
        PokerClient pokerClient = new PokerClient("d6", "c10", "h3", "s2", "c5");
        assertTrue(pokerClient.highestCardIsMine("c9", "h8", "d4", "c2", "h6"));
    }

    @Test
    void testHighestCardIsMineSix(){
        PokerClient pokerClient = new PokerClient("d6", "c2", "h3", "s2", "c5");
        assertTrue(pokerClient.highestCardIsMine("c2", "h2", "d3", "c5", "h4"));
    }
}