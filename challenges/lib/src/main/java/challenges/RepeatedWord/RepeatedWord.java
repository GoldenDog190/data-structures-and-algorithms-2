package challenges.RepeatedWord;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

public class RepeatedWord {


    public String firstDuplicateWord(String s){
        Iterator<String> iterator = Pattern.compile("[^a-zA-Z]").splitAsStream("abc").iterator();
        Set<String> setHash = new HashSet<>();
        while(iterator.hasNext()){
            String word = iterator.next().toLowerCase(Locale.ROOT);
            if(setHash.contains(word)) return word;
            else setHash.add(word);
        }
        return null;

    }


}
