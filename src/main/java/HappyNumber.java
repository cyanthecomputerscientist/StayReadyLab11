public class HappyNumber 
{
     
    public Integer happyNumber(String input)
    {
        Integer ishappynumber = 0; 
        Integer number = Integer.parseInt(input);
        if (number ==1 || number == 7)
        {
            ishappynumber = 1; 
            return ishappynumber;   
        }
        int sum = number; int x = number;
        while (sum>9) 
        {
            sum = 0; 
            while(x>0)
            {
                int digit = x%10;
                sum += digit *digit;
                x/=10;
            }
            if(sum ==1)
            {
                ishappynumber = 1;
                return ishappynumber;
            }
            x=sum;
        }
            if (sum == 7) 
            {
                ishappynumber = 1; 
                return ishappynumber;    
            }
            ishappynumber = 0; 
        return ishappynumber;
    }
}