import java.util.ArrayList;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        String scrambled = "";
        int i = 0;
        while(i < word.length()-1){
            if(word.charAt(i) == 'A' && word.charAt(i+1) != 'A'){
                scrambled += word.charAt(i+1);
                scrambled += word.charAt(i);
                i++;
            }
            else {
                scrambled += word.charAt(i);
            }
            i++;
        }
        if(word.length() != scrambled.length())
            scrambled += word.charAt(word.length()-1);

        return scrambled;
    }
    public static void scrambleOrRemove(List<String> wordList){
        List<String> newWords = new ArrayList<>();
        for(String word : wordList){
            if(!scrambleWord(word).equals(word)){
                newWords.add(scrambleWord(word));
            }
        }
        wordList.clear();
        wordList.addAll(newWords);


    }

}
