import java.util.*;
class library
{
    Scanner sc = new Scanner(System.in);
    static int b_id = 1000;
    String name;
    String author;
    int book_id;
    String status = new String("a");
    library(String name,String author)
    {
        this.name = name;
        this.author = author;
    }
    public void issue()
    {
        if(status.equals("a"))
        {
            status = "i";
            System.out.println("Book ID: "+book_id);
            System.out.println("Name of the book: "+name);
            System.out.println("Author: "+author);
            System.out.println("Status: "+status);
        }
    }
    public void a_id()
    {
        b_id = b_id+4;
        book_id = b_id;
    }
    public void return_b()
    {
        status = "a";
        System.out.println("Thank you for returning");
    }
    public void display()
    {
        System.out.println("Book ID: "+book_id);
        System.out.println("Name of the book: "+name);
        System.out.println("Author: "+author);
        System.out.println("Status: "+status);
    }
}
public class mat1_1
{
    public static void main(String args[])
    {
        int n,i,choice,id;
        String name,author,status;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        library l[] = new library[n];
        for(i=0;i<n;i++)
        {
            name = sc.nextLine();
            author = sc.nextLine();
            l[i] = new library(name,author);
            l[i].a_id();
        }
        System.out.println("1-Display,2-Issue,3-Return,4-Exit");
        do
        {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice)
            {
                case 1:
                for(int j=0;j<n;j++)
                {
                l[j].display();
                }
                break;
                case 2:
                String b_name;
                for(int j=0;j<n;j++)
                {
                    System.out.println("Enter the book name");
                    b_name = sc.next();
                    if(b_name.equals(l[j].name) && l[j].status.equals("a"))
                    {
                        System.out.println("Book is available");
                        l[j].issue();
                        break;
                    }
                    else
                    {
                        System.out.println("Sorry the book is not available");
                        break;
                    }
                }
                break;
                case 3:
                {
                    String r_name;
                    System.out.println("Enter the name of the book to be returned");
                    r_name = sc.next();
                    for(int j=0;j<n;j++)
                    {
                        if(r_name.equals(l[j].name))
                        {
                            System.out.println("Book is returned");
                            l[j].return_b();
                            break;
                        }
                        else
                        {
                            System.out.println("Sorry the book is not issued");
                            break;
                        }
                    }
                }
                break;
            }
        }
        while(choice!=4);
        {
            System.out.println("Thank you!!Visit Again");
            return;
        }
    }
}
