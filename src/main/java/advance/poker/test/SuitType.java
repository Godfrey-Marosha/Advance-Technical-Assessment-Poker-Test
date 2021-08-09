/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * And open the template in the editor.
 */
package advance.poker.test;

/**
 *
 * @author Godfrey Marosha
 */
public enum SuitType {
    /**
    RANK OF THE SUITS:
    1. Spades are the 1st HIGHEST suit
    2. Hearts are the 2nd HIGHEST suit
    3. Diamonds are the 3rd HIGHEST suit
    4. Clubs are the 4th HIGHEST suit
     */
    
    S("\u2660"),  // spades
    H ("\u2663"),  // hearts
    D("\u2666"),  // diamonds
    C("\u2663");  // clubs
    
    private final String value;
    
    private SuitType(String value)
    {
       this.value = value;
    }

    @Override
    public String toString()
    {
       return this.value;
    }
}
