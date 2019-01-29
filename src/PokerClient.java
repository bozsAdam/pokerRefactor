import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerClient {

    private List<Card> myCards;


    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        myCards = new ArrayList<>(Arrays.asList(
                                            new Card(p1),
                                            new Card(p2),
                                            new Card(p3),
                                            new Card(p4),
                                            new Card(p5)));

    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card highestCard = new Card("s2");
        List<Card> enemyCards = new ArrayList<>(Arrays.asList(
                                                            new Card(p1),
                                                            new Card(p2),
                                                            new Card(p3),
                                                            new Card(p4),
                                                            new Card(p5)));

        for (Card card:myCards){
            if(highestCard.getValue()<card.getValue()){
                highestCard = card;
            }
        }
        
        for (Card card:enemyCards){
            if(highestCard.getValue()<card.getValue()){
                highestCard = card;
            }
        }

        return myCards.contains(highestCard);
    }

}