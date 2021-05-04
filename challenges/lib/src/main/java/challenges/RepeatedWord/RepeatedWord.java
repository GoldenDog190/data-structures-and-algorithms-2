package challenges.RepeatedWord;




import javax.sound.sampled.Line;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RepeatedWord {


    public String firstDuplicateWord(String s){
        Iterator<String> iterator = Pattern.compile("[^a-zA-Z]+").splitAsStream("abc").iterator();
        Set<String> setHash = new HashSet<>();
        while(iterator.hasNext()){
            String word = iterator.next().toLowerCase(Locale.ROOT);
            if(setHash.contains(word)) return word;
            else setHash.add(word);
        }
        return null;

    }

    public Map<String, Integer> countFrequency(String string) {
        Map<String, Integer> count = new HashMap<>();
        Pattern.compile("[^a-zA-Z]+").splitAsStream(string).forEach(s -> count.merge(s.toLowerCase(Locale.ROOT), 1, Integer::sum));
        return count;
    }

    public List<String> commonWords(String string, int k){
        Map<String, Integer> count = new HashMap<>();
        Pattern.compile("[^a-zA-Z]+").splitAsStream(string).forEach(s -> count.merge(s.toLowerCase(Locale.ROOT), 1, Integer::sum));
        return count.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).limit(k).map(Map.Entry::getKey).collect(Collectors.toList(ArrayList::new));
    }


}
