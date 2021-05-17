/*카드 게임에 쓰이는 카드 한 벌을 나타내는 자료구조를 설계하라. 블랙잭 게임 구현*/
// Enum is a speical class tha represents a group of constants(Unchangeable variables like final variables

public enum Suit{
  Club(0),Diamond(1),Heart(2),Spade(3);
  private int value;
  private Suit(int v){
    value = v;
  }
  public int getValue(){
    return value;
  }
  public static Suit getSuitFromValue(int Value){
    //...
  }
}

public class Deck{
  private ArrayList cards;
  private int dealtIndex =0;
  
  public void setDeckOfCards(ArrayList deckOfCards){
    ...
  }
  
  public void shuffle(){
    ...
  }
  
  public int remainingCards(){
    return cards.size() -dealtIndex;
  }
  
  public T[] dealHand(int number){
    ...
  }
  
  public T dealCard(){...}
  
}


public abstract class Card{
  private boolean available = true;
  protected int faceValue;
  protected Suit suit;
  public Card(int c, Suit s){
    faceValue = c;
    suit = s;
  }
  
  public abstract int value();
  
  public Suit suit(){
    return suit;
  }
  
  public boolean isAvailable(){
    return available;
  }
  public void markUnavailable(){
    available = false;
  }
  public void markAvailable(){
    available = true;
  }
  
}

public class Hand {
  protected ArrayList cards = new ArrayList();
  public int score(){
    int score =0;
    for(T card : cards){
      score += card.value;
    }
    return score;
  }
  public void addCard(T card){
    cards.add(card);
  }
}
//Deck을 자바 제네릭으로 구현하되 T의 타입은 Card로 제한했다. Card는 추상 클래스로 구현

public class BlackJavHand extends Hand{
  
  public int score(){
    ArrayList<Integer> scores = possibleScores();
    int maxUnder = Integer.MIN_VALUE;
    int minOver =Integer.MAX_VALUE;
    for(int score: scores){
      if(score >21 && score <minOver){
        minOver = score;
      }else if (Score <= 21 && score >maxUnder){
        maxUnder = score;
      }
    }
    return maxUnder == Integer.MINVALUE?minOver :maxUnder;\
  }



