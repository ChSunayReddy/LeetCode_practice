import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public boolean isNumber(String s) {
        String regex = "^\\s*[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))(e[+-]?\\d+)?\\s*$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}