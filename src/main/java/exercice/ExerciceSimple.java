package exercice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ExerciceSimple {

    public static List<String> solution(String str, List<Character> ordre) {
        ArrayList<String> listMots= new ArrayList<>();
        listMots = creerTabMots(str);

        ArrayList<String> listMotsNull= new ArrayList<>();

        ArrayList<String> listMotsFin= new ArrayList<>();

        for(int i = 0; i < ordre.size() ; i++) {
            for(int j = 0 ; j < listMots.size() ;  j++) {
                if (listMots.get(j).toCharArray()[0] == ordre.get(i)) {
                    listMotsFin.add(listMots.get(j));

                }
                else {
                    if (listMots.get(j).toCharArray()[0] != ordre.get(i))
                        listMotsNull.add(listMots.get(j));
                }
                listMots.remove(j);
            }
        }

        if (listMotsNull.size() > 0) {
            listMotsFin.addAll(listMotsNull);
        }
        return listMotsFin;
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
                // Si un mot est terminé, l'ajouter à l'ArrayList
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
}
