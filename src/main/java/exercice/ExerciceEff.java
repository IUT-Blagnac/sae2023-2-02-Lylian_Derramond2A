package exercice;

import java.util.*;

public class ExerciceEff {

    public static List<String> solution(String str, List<Character> ordre) {

        ArrayList<String> tabMots;
        ArrayList<Double> poids;
        Map<Character, Double> dictionnaire = new HashMap<>();
        Map<String, Double> dicotextInt = new HashMap<>();

        //on créer les poids pour chacune des lettres
        poids = poidsInt(ordre);

        //on transforme le string de la phrase en plusieurs mots.
        tabMots = creerTabMots(str);
        
        // on créer un dictionnaire avec comme clé la lettre et en valeur son poid correspondant
        dictionnaire = dico(ordre, poids);

        //on créer un poid pour chacun des mots par rapport aux lettres qu'il contient
        dicotextInt = dicoTextInt(tabMots, dictionnaire);

        tabMots = trier(dicotextInt,tabMots);

        return tabMots;
    }

    /**
     * Créer une ArrayList de mots à partir d'un String d'une phrase
     * @param str string d'une phrase
     * @return un tableau de mots créer avec le string str
     */
    public static ArrayList<String> creerTabMots(String str) {
        ArrayList<String> tabMots = new ArrayList<>();

        StringBuilder motActuel = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char caractere = str.charAt(i);

            if (caractere != ' ' && caractere != ',' && caractere != '\'' && caractere != '.') {
                motActuel.append(caractere);
            } else {
                if (motActuel.length() > 0) {
                    tabMots.add(motActuel.toString());
                    motActuel.setLength(0);
                }
            }
        }

        if (motActuel.length() > 0) {
            tabMots.add(motActuel.toString());
        }

        return tabMots;
    }



    /**
     * Fonction qui permet de créer un tableau de poid par rapport aux caractères de List<> ordre
     * 
     * @param order list des caractères
     * @return ArrayList des poids en fonction des caractères
     */
    public static ArrayList<Double> poidsInt(List<Character> order) {

        ArrayList<Double> poids = new ArrayList<>();

        double poid = order.size();

        for(int i = 0; i < order.size() ; i ++) {
            poids.add(poid);
            poid--;
        }

        return poids;
    }


    /**
     * Creer un dictionnaire avec comme cle les caracteres de ordre et en valeur le poid correspondant.
     */
    public static Map<Character, Double> dico(List<Character> ordre, ArrayList<Double> poidsOrdre) {

        Map<Character, Double> dictionnaire = new HashMap<>();

        for (int i = 0; i < ordre.size(); i++) {
            dictionnaire.put(ordre.get(i), poidsOrdre.get(i));
        }

        return dictionnaire;
    }


    /**
     * Transforme le tableau de mots en tableau de int en convertissant chaque lettre en sa valeur correspondante et en mutipliant le poid d'une lettre avec
     * un coef plus ou moins grand en fonction de son emplacement.
     * @param tabMots
     * @param dictionnaire
     * @return
     */
    public static Map<String, Double> dicoTextInt(ArrayList<String> tabMots, Map<Character, Double> dictionnaire) {

        Map<String, Double> dicoIntMots = new HashMap<>();

        for (String mot : tabMots) {
            double valeur = 0; // Valeur par défaut si la clé n'est pas présente dans le dictionnaire
            double multiplicateur = 1000000.0;

            int cpt = 0;

            for (char caractere : mot.toCharArray()) {
                if(cpt == 0 && !dictionnaire.containsKey(caractere)){
                    valeur = 0;
                    break;
                }
                else {
                    if (dictionnaire.containsKey(caractere)) {
                        valeur += dictionnaire.get(caractere)*multiplicateur;
                        
                    }
                    multiplicateur *= 0.1;
                }
                cpt++;
            }   
            dicoIntMots.put(mot,valeur);
        }

        return dicoIntMots;

    }

    /**
     * Utilise le dictionnaire dicoIntMots qui contient chaque mot commencant par une lettre de ordre avec leur valeur
     * pour classer les mots de la phrase de tabMots dans l'ordre décroissant et d'ensuit ajouter tous les autres mots
     * @param dicoIntMots
     * @param tabMots
     * @return
     */
    public static ArrayList<String> trier(Map<String, Double> dicoIntMots, ArrayList<String> tabMots) {
        ArrayList<String> listMotsFin = new ArrayList<>();
        ArrayList<String> listMotsNull = new ArrayList<>();

        // Parcourir les mots de tabMots
        for (String mot : tabMots) {
            if (dicoIntMots.containsKey(mot)) {
                // Le mot est présent dans dicoIntMots
                double valeur = dicoIntMots.get(mot);

                // Parcourir les mots déjà classés dans listMotsFin
                int j = 0;
                while (j < listMotsFin.size()) {
                    String motCourant = listMotsFin.get(j);
                    double valeurCourante = dicoIntMots.get(motCourant);

                    if (valeurCourante < valeur) {
                        // Insérer le mot à sa position correcte
                        listMotsFin.add(j, mot);
                        break;
                    }

                    j++;
                }

                if (j == listMotsFin.size()) {
                    // Le mot doit être inséré à la fin de listMotsFin
                    listMotsFin.add(mot);
                }
            } else {
                // Le mot n'est pas trouvé dans dicoIntMots
                listMotsNull.add(mot);
            }
        }

        // Ajouter les mots non trouvés à la fin de listMotsFin
        listMotsFin.addAll(listMotsNull);

        return listMotsFin;
    }

}
