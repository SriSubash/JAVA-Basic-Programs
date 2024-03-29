/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package products;
import java.util.Scanner;

public class ProductsDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product pobj=new Product();
        CD[] cdobj=new CD[10];
        Book[] bobj=new Book[10];
        Scientific[] sobj=new Scientific[10];
        int ch,n,c=0,b=0,s=0,i;
        System.out.println("Enter the No of Products : ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("1->CD.\n2->BOOK.\n3->SCIENTIFIC BOOK.\n");
            System.out.println("Enter your Choice :");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 -> {
                    cdobj[c]=new CD();
                    cdobj[c].getcd();
                    c++;
                    pobj.cds++;
                }
                case 2 -> {
                    bobj[b]=new Book();
                    bobj[b].getbook();
                    b++;
                    pobj.books++;
                }
                case 3 -> {
                    sobj[s]=new Scientific();
                    sobj[s].getbook();
                    s++;
                    pobj.sbooks++;
                }
            }
        }
        System.out.println("**********CD**********");
        for(i=0;i<c;i++)
            cdobj[i].putcd();
        System.out.println("*********Book*********");
        for(i=0;i<b;i++)
            bobj[i].putbook();
        System.out.println("***Scientific Book****");
        for(i=0;i<s;i++)
            sobj[i].putbook();
        pobj.stockdetails();
    } 
}
class Product{
    public int productid;
    public String productname,producttype;
    public float productprice;
    public int cds=0,books=0,sbooks=0;
    public void stockdetails(){
        System.out.println("No of CDs : "+cds);
        System.out.println("No of Books : "+books);
        System.out.println("No of Scientific Books : "+sbooks);
    }
}
class CD extends Product{
    String genre;
    public void getcd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the CD ID");
        productid=sc.nextInt();
        System.out.println("Enter the CD Name");
        productname=sc.next();
        System.out.println("Enter the CD Price");
        productprice=sc.nextFloat();
        System.out.println("Enter the CD Genre");
        genre=sc.next();
        producttype="CD";
    }
    public void putcd(){
        System.out.println("CD ID : "+productid);
        System.out.println("CD Name : "+productname);
        System.out.println("CD Price : "+productprice);
        System.out.println("Product Type : "+producttype);
        System.out.println("CD Genre : "+genre);
    }
    
}
class Book extends Product{
    String author;
    int year;
    Book(){
        producttype="Book";
    }
    public void getbook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Book ID");
        productid=sc.nextInt();
        System.out.println("Enter the Book Name");
        productname=sc.next();
        System.out.println("Enter the Book Price");
        productprice=sc.nextFloat();
        System.out.println("Enter the Author Name");
        author=sc.next();
        System.out.println("Enter the Published Year");
        year=sc.nextInt();
        
    }
    public void putbook(){
        System.out.println("Book ID : "+productid);
        System.out.println("Book Name : "+productname);
        System.out.println("Book Price : "+productprice);
        System.out.println("Product Type : "+producttype);
        System.out.println("Book Author : "+author);
        System.out.println("Published Year : "+year);
    }
}
class Scientific extends Book{
    
    Scientific(){
        producttype="Scietific Book";
    }
}
