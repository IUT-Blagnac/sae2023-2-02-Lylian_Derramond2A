package exercice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class Tests {
    @Test
    public void testSimple() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), testExo.solution("666, the number of the beast", List.of('6', 't', 'n', 'o', 'b')));
    }
    @Test
    public void test1mot() {
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), testExo.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
    }
    
    @Test
    public void testVide() {
    	// Chaine vide
	    assertEquals(List.of(), testExo.solution("",List.of('6', 't', 'n', 'o', 'b')));
    } 
    
    @Test
    public void testExemple() {
    	// Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), testExo.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
    } 
    
    @Test
    public void testIdentique() {
    	 // Chaine avec des mots identiques
        assertEquals(List.of("demain","aujourd","hui","il", "il", "imagine", "imagine", "pleut", "pleut"), testExo.solution("imagine aujourd'hui il pleut, imagine demain il pleut",List.of('d','a','h','i','p')));
    } 
    
    @Test
    public void testMinmaj() {
    	 // Chaine avec des mots majuscules et minuscules
        assertEquals(List.of("c", "Est", "En", "moment", "le", "aller", "A", "d", "piscine", "La", "somme", "nous", "juin"), testExo.solution("nous somme En juin, c'Est le moment d'aller A La piscine",List.of('c', 'E', 'm', 'l', 'a', 'A', 'd', 'p', 'L', 's', 'e', 'n', 'j')));
    } 
    
    @Test
    public void testLong() {
    	 // Chaine avec des mots majuscules et minuscules
        assertEquals(List.of("adipisci", "adipisci", "aliquam", "amet", "animi", "architecto", "architecto", "aspernatur", "aspernatur", "assumenda", "at", "at", "aut", "aut", "aut", "aut", "aut", "aut", "aut", "aut", "aut", "autem", "beatae", "beatae", "blanditiis", "consequatur", "consequuntur", "corrupti", "cum", "delectus", "deleniti", "deleniti", "deleniti", "deleniti", "deserunt", "dicta", "dicta", "dicta", "distinctio", "distinctio", "distinctio", "dolor", "dolor", "dolor", "dolor", "dolore", "dolorem", "doloremque", "dolores", "dolores", "dolorum", "ducimus", "ea", "ea", "ea", "ea", "ea", "ea", "earum", "earum", "earum", "eius", "eligendi", "eligendi", "enim", "enim", "eos", "error", "esse", "est", "est", "est", "est", "et", "et", "et", "et", "et", "et", "et", "et", "et", "et", "et", "et", "eum", "eum", "eum", "eum", "eveniet", "excepturi", "expedita", "explicabo", "explicabo", "facere", "facilis", "fuga", "fuga", "galisum", "hic", "id", "id", "id", "illo", "illo", "illum", "in", "in", "in", "in", "internos", "ipsam", "ipsum", "iste", "iste", "itaque", "iure", "iusto", "laboriosam", "laudantium", "laudantium", "lorem", "maiores", "maxime", "minus", "modi", "modi", "molestiae", "molestiae", "molestiae", "molestias", "molestias", "nam", "natus", "necessitatibus", "nemo", "nihil", "nihil", "nisi", "non", "non", "non", "non", "obcaecati", "obcaecati", "odio", "odio", "officiis", "omnis", "omnis", "omnis", "omnis", "optio", "perferendis", "porro", "possimus", "praesentium", "quas", "quas", "quasi", "quasi", "qui", "qui", "qui", "qui", "qui", "qui", "quia", "quia", "quia", "quia", "quibusdam", "quibusdam", "quidem", "quis", "quis", "quis", "quisquam", "quisquam", "quo", "quo", "quod", "quos", "ratione", "ratione", "ratione", "ratione", "ratione", "rem", "rem", "repellat", "repellat", "repellat", "repellendus", "rerum", "rerum", "sed", "sed", "similique", "similique", "similique", "sint", "sit", "sit", "sit", "sit", "sit", "sit", "soluta", "sunt", "sunt", "sunt", "sunt", "suscipit", "temporibus", "tenetur", "totam", "ullam", "unde", "unde", "unde", "ut", "ut", "ut", "ut", "ut", "vel", "vel", "vel", "vel", "vel", "velit", "velit", "veritatis", "veritatis", "vero", "voluptas", "voluptas", "voluptatem", "voluptatem", "voluptatem", "voluptatem"), testExo.solution("lorem ipsum dolor sit amet non voluptas expedita rem omnis earum sit quis enim ut laudantium sunt est ratione iste sed laudantium illo at dolore distinctio in dolorem ratione sit consequatur velit ut repellendus dolorum est temporibus odio ea architecto illum aut similique officiis eum optio quibusdam ea quas facere qui natus porro et quibusdam molestias aut similique assumenda ea obcaecati quia id nemo totam et molestiae quidem non error unde et quas soluta vel iusto repellat aut quisquam minus in enim unde et perferendis beatae ut velit explicabo et voluptatem rerum vel maxime facilis aut dolores deserunt qui eius architecto quo deleniti quia at modi iure qui suscipit nisi in dolor dolores qui deleniti ducimus eum voluptatem eligendi sit earum quia ea aspernatur molestias ea earum laboriosam id quasi dolor et omnis dicta est repellat nihil non autem nihil et molestiae voluptas qui similique internos rem quis blanditiis sit ullam omnis sed sint dicta vel dicta sunt non beatae quasi aut eveniet illo eum maiores praesentium et rerum consequuntur id ratione ratione est quis adipisci quo explicabo esse ea aliquam possimus hic distinctio corrupti qui veritatis necessitatibus et delectus quia aut tenetur modi cum sunt obcaecati nam omnis ratione aut deleniti vero et dolor quisquam ut distinctio molestiae sit ipsam unde eum quod animi aut voluptatem galisum eos sunt excepturi aut quos deleniti ut fuga doloremque in eligendi adipisci et fuga odio vel veritatis aspernatur et iste itaque vel repellat voluptatem", List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')));
    } 
    
		 
}