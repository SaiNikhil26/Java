import java.util.*;
class sales
{
    String id,name,region;
    int year;
    sales(String id,String name,String region,int year)
    {
        this.id = id;
        this.name = name;
        this.region = region;
        this.year = year;
    }
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(region);
        System.out.println(year);
    }
}
public class pat3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,year;
        String id,name,region;
        n = sc.nextInt();
        if(n==0)
        System.out.println("Invalid Input");
        else
        {
            ArrayList<sales> sl = new ArrayList<sales> ();
            sales s;
            for(i=0;i<n;i++)
            {
                id = sc.next();
                name = sc.next();
                region = sc.next();
                year = sc.nextInt();
                s = new sales(id,name,region,year);
                sl.add(s);
            }
            ArrayList<sales> north = new ArrayList<sales> ();
            ArrayList<sales> south = new ArrayList<sales> ();
            for(sales x:sl)
            {
                if(x.region.toLowerCase().equals("north"))
                north.add(x);
                else if(x.region.toLowerCase().equals("south"))
                south.add(x);
            }
            System.out.println("North");
            for(sales p:north)
            p.display();
            System.out.println("South");
            for(sales m:south)
            m.display();
        }
    }
}
