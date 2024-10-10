package Sorting;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    //comparable es una interfaz que define
    //una manera default de comparar objetos de cualquier tipo.
    public static class Card implements Comparable<Card>{
        int value;
        String type;

        Card(int value, String type){
            this.value = value;
            this.type = type;
        }

        public int getValue() {
            return value;
        }

        public String getType() {
            return type;
        }

        // de manera predeterminada ordenará siempre por valor, a no ser
        // que se especifique otra forma de comparar con un comparator
        @Override
        public int compareTo(Card card) {
            return Integer.compare(getValue(), card.getValue());
        }
    }

    // permite ordenar por type
    public static class CardTypeComparator implements Comparator<Card>{
        @Override
        public int compare(Card c1, Card c2) {
            //collator permite comparar string de manera case sensitive
            //es decir considerando si tiene mayusculas o minusculas el string
            Collator col = Collator.getInstance();
            return col.compare(c1.getType(),c2.getType());
        }
    }

    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(5, "diamonds"));
        cards.add(new Card(7, "spades"));
        cards.add(new Card(8, "clubs"));
        cards.add(new Card(2, "hearts"));
        cards.add(new Card(8, "diamonds"));
        cards.add(new Card(12, "diamonds"));
        Collections.sort(cards);

        for(Card card: cards) {
            System.out.println(card.getValue());
        }

        Collections.sort(cards, new CardTypeComparator());
        for(Card card: cards) {
            System.out.println(card.getType());
        }
    }
}
