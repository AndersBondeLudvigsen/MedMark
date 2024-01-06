package Øvelse11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String auther;
    private String[] bodyWords;

    public Article(String heading, String body, String auther) {
        this.heading = heading;
        this.body = body;
        this.auther = auther;
    }
    public String getLongestWord(){
        bodyWords = body.split(" ");
        String longestWord = " ";
        for (String word : bodyWords){
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }
    public ArrayList<String> getWords(){
        ArrayList <String> allWords = new ArrayList<>();
        for (String word : bodyWords){
            if (!allWords.contains(word)){
                allWords.add(word);
            }
        }
        return allWords;
    }
}
