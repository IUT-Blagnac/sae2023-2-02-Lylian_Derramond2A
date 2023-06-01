package exercice;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {

        ArrayList<String> tabTrie;
        tabTrie = crerTabMots(str);



        return tabTrie;
    }

    /**
     * Créer une ArrayList de mots à partir d'un String d'une phrase
     * @param str string d'une phrase
     * @return un tableau de mots créer avec le string str
     */
    public static ArrayList<String> crerTabMots(String str) {
        // Diviser la chaîne en mots en utilisant l'espace comme délimiteur
        String[] mots = str.split(" ");

        // Convertir le tableau de mots en ArrayList
        ArrayList<String> tabMots = new ArrayList<>(Arrays.asList(mots));

        // Retourner l'ArrayList contenant les mots
        return tabMots;
    }
}
