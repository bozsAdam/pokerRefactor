import java.util.*;

public class Card {
    private String cardColor;
    private String cardValue;
    private final HashMap alphabeticCardValue = new HashMap<String,Integer>() {{
        put("J", 11);
        put("Q", 12);
        put("K", 13);
        put("A", 14);
    }};

    Card(String cardCode) throws IllegalArgumentException {
        this.cardColor = cardCode.substring(0,1);
        this.cardValue = cardCode.substring(1).toUpperCase();
        colorValidation();
        numberValidation(cardValue);
    }

    private void numberValidation(String cardValue) {
        if (alphabeticCardValue.get(cardValue) == null) {
            int intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10 || intCardValue < 2) throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
        }
    }

    private void colorValidation() {
        List<String> colors = new ArrayList<>(Arrays.asList("S", "C", "D", "H"));
        if (!colors.contains(cardColor)) throw new IllegalArgumentException("card color isn't valid: " + cardColor);
    }

    int getValue() {
        return alphabeticCardValue.get(cardValue) == null ? Integer.parseInt(cardValue) : (Integer) alphabeticCardValue.get(cardValue);
    }
}
