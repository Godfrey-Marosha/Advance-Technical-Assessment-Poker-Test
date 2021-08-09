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
public enum Results {
    STRAIGHT_FLUSH("Straight Flush"),
    STRAIGHT("Straight"),
    FLUSH("Flush"),
    FOUR_OF_A_KIND("Four of a Kind"),
    FULL_HOUSE("Full House"),
    THREE_OF_A_KIND("Three of a Kind"),
    TWO_PAIR("Two Pair"),
    ONE_PAIR("One Pair"),
    NOTHING("Nothing");

    private final String label;
    Results(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return this.label;
    }
}
