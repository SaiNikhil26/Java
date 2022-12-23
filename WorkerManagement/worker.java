import java.util.*;
class emp
{
    String id,name,type;
    int sal;
    emp(String id,String name,int sal,String type)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.type = type;
    }
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(sal);
        System.out.println(type);
    }
}
public class pat2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String id,name,type;
        int n,i,sal;
        n = sc.nextInt();
        if(n==0)
        System.out.println("Invalid Input");
        else
        {
            emp m;
            ArrayList<emp> e = new ArrayList<emp> ();
            for(i=0;i<n;i++)
            {
                id = sc.next();
                name = sc.next();
                sal = sc.nextInt();
                type = sc.next();
                m = new emp(id,name,sal,type);
                e.add(m);
            }
            ArrayList<emp> con = new ArrayList<emp> ();
            ArrayList<emp> daily = new ArrayList<emp> ();
            for(emp b:e)
            {
                if(b.type.toLowerCase().equals("contract"))
                con.add(b);
                else if(b.type.toLowerCase().equals("daily"))
                daily.add(b);
            }
            System.out.println("Contract workers");
            for(emp c:con)
            c.display();
            System.out.println("Daily workers:");
            for(emp d:daily)
            d.display();
        }
    }
}
