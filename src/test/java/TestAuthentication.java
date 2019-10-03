import les4.Authentication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuthentication {
    @Test
    public  void teseIncorrect(){
        boolean result = Authentication.logIn("123123","123");
        assertEquals(false,result);
    }

    @Test
    public  void teseCorrect(){
        boolean result = Authentication.logIn("admin","root");
        assertEquals(true, result);
    }
}
