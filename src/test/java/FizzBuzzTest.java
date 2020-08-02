
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest
{
    @Test
   public void smileyFrownyTest()
   {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        String input = "I want to buy a onesie… :o) but know >;-( it won’t suit me :'{";
        //when 
        Integer expected = 2;
        Integer actual = fizzBuzz.smileyFrowny(input);
        Assertions.assertEquals(expected, actual);
   }
   @Test
   public void smileyFrownyTest2()
   {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String input = "Someone I know :o) recently combined Maple Syrup :'D & buttered Popcorn 8~C thinking it would taste like caramel popcorn >;'@. It didn’t :-< and they don’t recommend anyone ;{ else do it either :o@ :o3.";
        //when 
        Integer expected = 5;
        Integer actual = fizzBuzz.smileyFrowny(input);
        Assertions.assertEquals(expected, actual);
   }
   @Test
   public void smileyFrownyTest3()
   {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String input ="I'd rather be a bird than a fish. :D";
        Integer expected = 0;
        Integer actual = fizzBuzz.smileyFrowny(input);
        Assertions.assertEquals(expected, actual);
   }
   @Test
   public void smileyFrownyTest4()
   {
        //Given
        FizzBuzz fizzBuzz =new FizzBuzz();
        String input = ">8-[";
        //When 
        Integer expected = 1;
        Integer actual = fizzBuzz.smileyFrowny(input);
        Assertions.assertEquals(expected, actual);
   }
}