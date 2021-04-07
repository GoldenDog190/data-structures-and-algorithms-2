package challenges.utilities;

import challenges.stacksandqueues.Stack;

import javax.xml.stream.events.Characters;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MultiBracketValidation (String input){
    static Map<Character, Character> pairs = Map.ofEntries(
            entry('{', '}'),
            entry('[', ']'),
            entry('(', ')')
            );

    public static boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(pairs.containsKey(c)) stack.push(c);
            if(pairs.containsValue(c)){
                if(pairs.get(stack.peek()) == c) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

}
