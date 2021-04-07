package challenges.utilities;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MultiBracketValidationTest {
    @Test
    public void isEmptyTest(){
        String empty = "";
        assertTrue("it is empty", MultiBracketValidation.multiBracketValidation(empty));
    }

    @Test
    public void noBrackets(){
        String noBracket = "hello";
        assertTrue("there are no brackets but its ok", MultiBracketValidation.multiBracketValidation(noBracket));
    }

    @Test
    public void bracket(){
        List<String> character = ArrayList.asList(
                "(hello)", "[hello], {hello}"
        );

        charac.stream().forEach( c ->
                assertTrue("there are no brackets but its ok", MultiBracketValidation.multiBracketValidation())
                );
    }

    @Test
    public void nestedBracket(){
        List<String> character = ArrayList.asList(
                "(he[l]lo)", "[he(l)lo], {he{l}lo}"
        );

        charac.stream().forEach( c ->
                assertTrue("there are no brackets but its ok", MultiBracketValidation.multiBracketValidation())
        );
    }
}
