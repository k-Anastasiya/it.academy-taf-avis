package by.it.academi.anastasiya_karpovich.api.object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Token {
    protected static final Logger logger = LogManager.getLogger();

    private static String access_token;
    private static String token_type;
    private static Integer expires_in;

    public Token(String access_token, String token_type, Integer expires_in) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        System.out.println(access_token + token_type);
    }

    public static String getAccess_token() {
        return access_token;
    }

    public static String getToken_type() {
        return token_type;
    }

    public static Integer getExpires_in() {
        return expires_in;
    }
}
