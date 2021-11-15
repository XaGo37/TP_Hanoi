
package TP_Hanoi;

import java.util.ArrayList;

public class Liste {

    private ArrayList<Object> liste;
    private int position;

    public Liste() {
        this.liste = new ArrayList<Object>();
        premier();
    }

    public void premier() {
        position = 0;
    }

    public void dernier() {
        position = this.liste.size() - 1;
    }

    public Object suivant() {
        if (this.position > this.liste.size() || this.position < 0) {
            System.out.println("La liste est vide ou pleine");
            return null; // retourner un object vide
        } else {
            this.position++;

            return this.liste.get(position);
        }

    }
}
