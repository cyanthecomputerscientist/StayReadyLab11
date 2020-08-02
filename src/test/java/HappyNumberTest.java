import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest 
{
    @Test
   public void HappyNumberTest1()
   {
        //given
        HappyNumber happyNumber = new HappyNumber();
        String input = "22"; 
        //when 
        Integer expected = 0;
        Integer actual = happyNumber.happyNumber(input);
        //then 
        Assertions.assertEquals(expected, actual);
   }
   @Test
    public void HappyNumberTest2()
    {
        //given
        HappyNumber happyNumber = new HappyNumber();
        String input = "1";
        //when 
        Integer expected = 1;
        Integer actual = happyNumber.happyNumber(input);
        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void HappyNumberTest3()
    {
        //given
        HappyNumber happyNumber = new HappyNumber();
        String input = "7";
        //when 
        Integer expected = 1;
        Integer actual = happyNumber.happyNumber(input);
        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void HappyNumberTest4()
    {
        //given
        HappyNumber happyNumber = new HappyNumber();
        String input = "4";
        //when 
        Integer expected = 0;
        Integer actual = happyNumber.happyNumber(input);
        //then
        Assertions.assertEquals(expected, actual);
    }
}