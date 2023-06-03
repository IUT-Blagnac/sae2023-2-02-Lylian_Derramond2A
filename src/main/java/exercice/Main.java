package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "bonjour je suis lylian derramond et je suis content";
        List<Character> ordre = List.of('j','s', 'l', 'd', 'e', 'c', 's', 'r', 't');
        long startTime = System.nanoTime();
        System.out.println(ExerciceSimple.solution(texte,ordre));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Le programme s'est exécuté en " + duration + " millisecondes.");
    }
}
