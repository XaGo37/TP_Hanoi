
package TP_Hanoi;

import java.util.ArrayList;


public class PileEntiers extends Pile {

    private String name = null;

    public PileEntiers(String name) {
        this.pile = new ArrayList<Object>();
        this.name=name;

    }

    public void empiler(Integer newValue) {
        this.pile.add(newValue);
    }

    public Integer depiler() {
        if (this.pile.size() <= 0) {
            System.out.println("La pile est vide");
            return null;
        } else {

            Object temp = this.pile.get(this.pile.size() - 1);
            this.pile.remove(temp);
            return (Integer) temp;
        }

    }

    @Override
    public String toString() {
        return this.name;
    }
}