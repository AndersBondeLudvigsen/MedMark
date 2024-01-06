package Øvelse11;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Tekst", "Lav en klasse Article der har tre attributter: heading, body og \n" +
                "author. Lav test-kode der sætter alle tre attributter, og sørg for at \n" +
                "body er en lang tekst – f.eks. indholdet af denne øvelsesbeskrivelse!", "Anders");
        System.out.println(article.getLongestWord());
        System.out.println(article.getWords());
    }
}
