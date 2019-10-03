import les4.BadWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBadWord {
    @Test
    public  void tesecorrect(){
        String result = BadWord.prov("I love dog", "love");
        assertEquals("I *** dog",result);
    }

    @Test
    public  void teseIncorrect(){
        String result = BadWord.prov("I love dog", "516");
        assertEquals("I love dog",result);
    }

    @Test
    public  void teseIncorrect1(){
        String result = BadWord.prov("I love dog, dogs", "dog");
        assertEquals("I love ***, ***s",result);
    }

    @Test
    public  void teseIncorrect2(){
        String result = BadWord.prov("I love dog, dogs", "dog");
        assertEquals("I love ***, ***s",result);
    }
}
