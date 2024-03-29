
package deviation;
import java.util.Scanner;
public class Deviation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] Array = new double[50];
        System.out.println("Enter the no of Elements : ");
        int  n = sc.nextInt();
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;i++)
        {
            Array[i] = sc.nextInt();
        }
        Stddev obj = new Stddev();
        double SD = obj.calculateSD(Array);

        System.out.format("Standard Deviation = %.4f"+SD);
    }
}
class Stddev
{

    double calculateSD(double Array[])
    {
        double sum = 0.0, sd = 0.0;
        int len = Array.length;

        for(int i=0 ; i<len ;i++) {
            sum += Array[i];
        }

        double mean = sum/len;

        for(int j=0 ; j<len ;j++) {
            sd += Math.pow(Array[j] - mean, 2);
        }

        return Math.sqrt(sd/len);
    }
}

