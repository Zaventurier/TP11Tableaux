package tp11tableaux;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //- Programme principal du tp11 -

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un numéro :");
        int num = sc.nextInt();

        //Déclaration du tableau de noms de produits
        String[] noms = {"Crayon", "Gomme", "Stylo", "Equerre", "Règle"};
        Double[] prix = {2.00, 2.50, 3.00, 3.50, 4.00};

        //Affichage des enregistrements du tableau

        for (int i = 0; i < noms.length; i++){
            if(num == i){
                System.out.println(noms[i] + " - " + prix[i] + " €");
            }
        }
    }
}
