package Hanoi;

import TP_Hanoi.PileEntiers;

import java.util.Scanner;

public class Hanoi<AdaptiveCoding> {

    public static void main(String[] args) {

        PileEntiers PileDepart = new PileEntiers("1"); // Création des objets P1,P2,P3
        PileEntiers PileInter = new PileEntiers("2");
        PileEntiers PileArrive = new PileEntiers("3");
        int n = saisie();
        remplir(PileDepart,n);
        resolve(n, PileDepart, PileArrive, PileInter );;
    }

    private static int saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre de disque :");
        String n = sc.nextLine();
        System.out.println("Vous avez saisi : " + n);

        if(n.matches("^[1-9]\\d*")){
            System.out.println("Nombre correct");
            return Integer.parseInt(n);
        }
        else System.out.println("ERREUR");
        return 0;
    }

    private static void remplir(PileEntiers PileDepart, int n){
        for(int i = n; i>0; i--){
            PileDepart.empiler(i);
        }
    }



    static void resolve(int n, PileEntiers PileDepart, PileEntiers PileArrive, PileEntiers PileInter)
    {
        if (n == 1)
        {
            System.out.println("Deplacement du disque de la pile "+ PileDepart+" à la pile "+PileArrive);
            return;
        }
        resolve(n - 1, PileDepart, PileInter, PileArrive);
        System.out.println("Déplacement du disque "+ n + " de la pile " + PileDepart +" à la pile " + PileArrive );
        resolve(n - 1, PileInter, PileArrive, PileDepart);


    }
}
