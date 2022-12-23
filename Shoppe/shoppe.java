import java.util.*;
class Shop
{
    Scanner sc=new Scanner(System.in);
    public String items=new String();
    public int price;
    Shop()
    {
        price=0;
    }
    
    public void getinputs()
    {
        items=sc.next();
        price=sc.nextInt();
    }
}
class Computers extends Shop
{
    Computers(Shop s)
    {
        this.items=s.items;
        this.price=s.price;
    }
}
class Printers extends Shop
{
    Printers(Shop s)
    {
        this.items=s.items;
        this.price=s.price;
    }
}
class Purchase
{
    Scanner sc=new Scanner(System.in);
    public static int id;
    public int qty,total;
    public String product=new String();
    Purchase()
    {
        id=1000;
        qty=0;
        total=0;
    }
    public void purchase_item(int x,Shop s[])
    {
        product=sc.next();
        qty=sc.nextInt();
        for (int i=0;i<x;i++)
        {
            if (product.equals(s[i].items))
            {
                total= s[i].price*qty;
            }
        }
        
    }
    public void display()
    {
        System.out.println(product+" Qty "+qty+" Amount "+total);
    } 

}
public class mat2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Shop[] s=new Shop[n];
        for (int i=0;i<n;i++)
        {
            s[i]=new Shop();
            s[i].getinputs();
        }
        char y='Y';
        while(y!='N')
        {
        int total=0;
        ArrayList<Purchase> p=new ArrayList();
        char x='Y';
        Purchase a;
        Purchase b;
        while (x!='N')
        {
            a=new Purchase();
            a.purchase_item(n,s);
            p.add(a);
            x=sc.next().charAt(0);
            if (x=='N')
            {
                Iterator<Purchase> itr=p.iterator();
                while(itr.hasNext())
                {
                    b=itr.next();
                    b.display();
                    total+=b.total;
                }
                System.out.println("Total amount "+total);
            }
        }
        y=sc.next().charAt(0);
        }
    }
}
