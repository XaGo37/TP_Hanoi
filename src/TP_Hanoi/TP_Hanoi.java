package TP_Hanoi;
import java.util.Random;


public class TP_Hanoi {
    public static void main(String[] args) {

        PileEntiers P1 = new PileEntiers("Pile 1"); // Création des objets P1,P2,P3
        PileEntiers P2 = new PileEntiers("Pile 2");
        PileEntiers P3 = new PileEntiers("Pile 3");

        Random number = new Random(); // Création d'un nombre aléatoire

        for (int i = 0; i < 5; i++) {
            P1.empiler(number.nextInt(100)); //Empiler nombre aléatoire dans P1
        }

        for (int i = 0; i < P1.pile.size(); i++) {  // Tant que i ne depasse pas la taille de la pile
            if ((Integer) P1.pile.get(i) % 2 == 0) { // Si i nombre paire
                P2.empiler(P1.pile.get(i)); // Empiler dans P2

            } else {                            // Sinon i nombre impaire
                P3.empiler(P1.pile.get(i));     // Empiler dans P3
            }
        }
        System.out.println("La liste comprend les nombres :" + P1.pile);
        System.out.println("Les nombres paires sont : " + P2.pile);
        System.out.println("Les nombres impaires sont : " + P3.pile);

    }
}
