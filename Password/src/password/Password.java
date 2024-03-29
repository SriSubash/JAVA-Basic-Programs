
package password;

public class Password 
{
    public int check(String pass)
    {
        int len=pass.length(),digits=0;
                for (int i = 0; i < len; i++)
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57)
                digits++;
        if(len<6)
            return 1;
        else if (!pass.equals(pass.toUpperCase()))
            return 1;
        else if(digits<0)
            return 1;
        return 0;
    }
}