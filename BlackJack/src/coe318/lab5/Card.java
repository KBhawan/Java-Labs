package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;

  
  public int rank;
  public int suit;
  public boolean faceUp;
   
  public Card(int rank, int suit, boolean faceUp) {
    
      if (rank < 1) {
          this.rank = 1;
      } else if (rank > 14) {
          this.rank = 14;
      } else if (rank == 14) {
          this.rank = 1;
      } else this.rank = rank;
      
      
      
      
      if (suit < CLUB || suit > SPADE) {
          this.suit = CLUB;
      }
      else {
          this.suit = suit;
      }
      
      this.faceUp = faceUp;
  }
  

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return this.faceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    this.faceUp = faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return this.rank; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return this.suit;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    return this.rank == c.rank && this.suit == c.suit && this.faceUp == c.faceUp;
    
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
    int rankComp = Integer.compare(this.rank, c.rank);
    if (rankComp != 0) {
        return rankComp;
    }
    else {
      return Integer.compare(this.suit, c.suit);//FIX THIS
  }
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      if (rank >= 2 || rank <= 10) {
          return String.valueOf(rank);
      }
      else if (rank == 11) {
          return "Jack"; 
      } else if (rank == 12) {
          return "Queen";
      } else if (rank == 13) {
          return "King";
      } else if (rank == 1) {
        return "Ace";
      }
      else {
          return "Error";
      }
  }
     

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
      switch (suit) {
          case 0:
              return "Club";
          case 1:
              return "Diamond";
          case 2:
              return "Heart";
          case 3:
              return "Spade";
          default:
              return "Error"; //FIX THIS
      }
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {
if (faceUp == true) {
    return getRankString() + " " + getSuitString(); 
} else if (faceUp == false) {
    return "?";
} else { 
    return "Error";
}
   //FIX THIS
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}