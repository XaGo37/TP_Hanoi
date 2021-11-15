
package TP_Hanoi;

import java.util.ArrayList;

public class Pile {

    protected ArrayList<Object> pile;

    public Pile() {

        this.pile = new ArrayList();

    }

    public void empiler(Object newValue) {
        this.pile.add(newValue);
    }

    public Object depiler() {
        if (this.pile.size() <= 0) {
            System.out.println("La pile est vide");
            return null;
        } else {
            Object temp = this.pile.get(this.pile.size() - 1);
            this.pile.remove(temp);
            return temp;
        }

    }

}

