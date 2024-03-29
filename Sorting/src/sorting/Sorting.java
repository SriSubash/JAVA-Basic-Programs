
package sorting;

public class Sorting
{
    public static void main(String args[ ])
    {
        String a[]=new String[20];
        int j,i;
        String temp;
        for(i=0;i<args.length;i++)
        {
            a[i]=args[i];
        }
        System.out.println("Elements in the unsorted array are: ");
        for(i=0;i<args.length;i++)
        {
            System.out.println(a[i]+"\t");
        }
        for(i=0;i<args.length;i++)
        {
            for(j=i+1;j<args.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array elements are: ");
        for(i=0;i<args.length;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
}
