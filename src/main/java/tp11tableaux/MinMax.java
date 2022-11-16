package tp11tableaux;

public class MinMax {
    public static void main(String[] args) {
        //Déclaration du tableau de noms de produits
        String[] noms = {"Crayon", "Gomme", "Stylo", "Equerre", "Règle"};
        Double[] prix = {2.00, 2.50, 3.00, 3.50, 4.00};

        //Déclaration des variables prixMin et prixMax
        double prixMin = prix[0];
        double prixMax = prix[0];

        for (int i = 0; i < noms.length; i++){
            if(prix[i] < prixMin){
                prixMin = prix[i];
            }
            if(prix[i] > prixMax){
                prixMax  = prix[i];
            }
        }
        System.out.println("Prix min :" + prixMin);
        System.out.println("Prix max :" + prixMax);
    }
}
