package challenges.CodeWars;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String repeatedString = "";
        for (int i = 0; i < repeat; i++) {
            repeatedString += string;
        }
        return repeatedString;
    }
}
