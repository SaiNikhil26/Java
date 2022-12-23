import java.util.*;
class shoppe
{
    String id;
    shoppe(String id)
    {
        this.id = id;
    }
}
class ele extends shoppe
{
    String name;
    int price;
    int qty,total;
    ele(String name,int price,String id)
    {
        super(id);
        this.name = name;
        this.price = price;
        this.total = 0;
    }
    void cal(int qty)
    {
        total = total + qty*price;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(qty);
        System.out.println(total);
    }
}
class printer extends shoppe
{
    String name;
    int price;
    int qty,total;
    printer(String name,int price,String id)
    {
        super(id);
        this.name = name;
        this.price = price;
        this.total = 0;
    }
    void cal(int qty)
    {
        total = total + qty*price;
    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(qty);
        System.out.println(total);
    }
}
public class pat12
{
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        String name,id;
        int price,qty;
        int i,n;
        n = Integer.parseInt(sc.nextLine());
        if(n==0)
        System.out.println("Invalid Input");
        else
        {
            ele e;
            printer p;
            ArrayList<ele> l1 = new ArrayList<ele>(n);
            ArrayList<printer> l2 = new ArrayList<printer>(n);
            for(i=0;i<n;i++)
            {
                id=sc.nextLine();
                if(id.charAt(0)=='E')
                {
                    name = sc.nextLine();
                    price = sc.nextInt();
                    sc.nextLine();
                    e = new ele(name,price,id);
                    l1.add(e);
                }
                else if(id.charAt(0)=='P')
                {
                    name = sc.nextLine();
                    price = sc.nextInt();
                    sc.nextLine();
                    p = new printer(name,price,id);
                    l2.add(p);
                }
            }
            char y = 'Y';
            while(y!='N')
            {
                char x = 'Y';
                while(x!='N')
                {
                String choice = sc.nextLine();
                for(ele a:l1)
                {
                    if(choice.equals(a.name))
                    {
                        qty = Integer.parseInt(sc.nextLine());
                        a.cal(qty);
                    }
                    else
                    {
                        for(printer z:l2)
                        { 
                        if(choice.equals(z.name))
                        {
                            qty = Integer.parseInt(sc.nextLine());
                            a.cal(qty);
                        }
                    }
                x = sc.next().charAt(0);
                if(x=='N')
                {
                    System.out.println("Bill");
                    for(ele b:l1)
                    b.display();
                    for(printer c:l2)
                    c.display();
                }
                }
                y = sc.next().charAt(0);
            }
        }
     }
}
     }
}
