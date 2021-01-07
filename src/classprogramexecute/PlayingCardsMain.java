package classprogramexecute;
import classprogram.PlayingCards;

public class PlayingCardsMain {
    public static void main(String[] args) {
        PlayingCards card = new PlayingCards(13,"diamond");
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
    }
}
