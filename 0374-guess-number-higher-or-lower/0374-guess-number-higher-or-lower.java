public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=n/2;
        if(guess(n)==0)
        {
            return n;
        }
        while(true)
        {
            if(guess(i)==0)
            {
                break;
            }
            else if(guess(i)==1)
            {
                i+=10;
                if(guess(i)==-1)
                {
                for(int j=0;j<10;j++)
                {
                    i--;
                 if(guess(i)==0)
                 {
                    break;
                 }
                }
                }
            }
            else
            {                
                i-=10;           
                if(guess(i)==1)
                {     
                for(int j=0;j<10;j++)
                {
                    i--;
                if(guess(i)==0)
                {
                    break;
                }
                
                }
                }
            }
        }
    return i ;
    }
}