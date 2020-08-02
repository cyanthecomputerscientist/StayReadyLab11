

public class FizzBuzz
{

    public Integer smileyFrowny(String input)
    {
        Integer count = 0; 
        Boolean eyes = false;
        Boolean frown = false;
        for (int i = 0; i < input.length(); i++) 
        {
                if(input.charAt(i) == ':' || input.charAt(i) == ';' || input.charAt(i) == '8')
                {
                    eyes = true;
                }
                else if(input.charAt(i) =='(' || input.charAt(i) == 'C'|| input.charAt(i) == '<' || input.charAt(i) =='[' || input.charAt(i) == '{' || input.charAt(i) == '@')
                {
                    frown = true;
                }
                
                if (frown == true && eyes == true)
                {
                    count++;
                    frown = false; 
                    eyes = false;
                }
                
                
        }

        return count; 
    }
    
}