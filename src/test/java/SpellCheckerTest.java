import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpellCheckerTest {
    @Test
    public void test()
    {
        
        String input = "Hello!!! Nurse!!!";
        String actual = App.parse(input);
        String expected = "hello nurse";
        Assertions.assertEquals(expected, actual);
    }

}
