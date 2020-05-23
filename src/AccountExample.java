import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX="^[_a-z0-9]{6,}$";
    private static Pattern pattern;
    private Matcher matcher;

    public AccountExample(){
        pattern=Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validAccount(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
