import java.util.*;
import java.util.Arrays;
public class mat6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,n;
System.out.println("Enter the number of students:");
n = sc.nextInt();
b_tech b[] = new b_tech[n];
re_scholar r[] = new re_scholar[n];
bca c[] = new bca[n];
for(i=0;i<n;i++)
{
System.out.println("Enter 1 for B-TECH,Enter 2 for BCA,Enter 3 for RESEARCH SCHOLAR");
int a;
a = sc.nextInt(); 
switch (a)
{
case (1):
{
b[i] = new b_tech();
b[i].cal_total();
b[i].cal_grade();
b[i].display();
break;
}
case(2):
{
c[i] = new bca();
c[i].get_assign();
c[i].bca_total();
c[i].cal_grade();
c[i].bca_display();
break;
}
case(3):
{
r[i] = new re_scholar();
r[i].re_total();
r[i].cal_grade();
r[i].re_display();
break;
}
default:
{
    
    System.out.println("Invalid Input");
    break;
}
}
}
}
}
interface cal
{
    void cal_total();
    void cal_grade();
    void display();
}
interface cal2 
{
    void re_total();
    void re_display();
    void cal_grade();
}
//Base class
abstract class student 
{
String name,reg_no;
Scanner sc = new Scanner(System.in);
student()
{
System.out.println("Enter name:");
this.name = sc.next();
System.out.println("Enter reg number:");
this.reg_no = sc.next();
}
}

//UG student class derived from Student class
class ug_student extends student 
{
int credits;
int duration,cat1,cat2,a1,a2,a3;
double att;
ug_student()
{
System.out.println("Enter credits:");
this.credits = sc.nextInt();
System.out.println("Enter duration:");
this.duration = sc.nextInt();
System.out.println("Enter cat1 marks out of 20:");
this.cat1 = sc.nextInt();
System.out.println("Enter cat2 marks out of 20:");
this.cat2 = sc.nextInt();
System.out.println("Enter Assignment1 marks out of 10:");
this.a1 = sc.nextInt();
System.out.println("Enter Assignment2 marks out of 10:");
this.a2 = sc.nextInt();
System.out.println("Enter Assignment3 marks out of 10:");
this.a3 = sc.nextInt();
System.out.println("Enter attendance:");
this.att = sc.nextDouble();
}
public void display()
{
System.out.println("Name: "+name);
System.out.println("Reg number: "+reg_no);
System.out.println("Credits: "+credits);
System.out.println("Duration: "+duration); 
}
}

//B_tech class derived from ug_student class
class b_tech extends ug_student implements cal
{
int cat1=super.cat1;
int cat2=super.cat2;
int cat3;
int a1=super.a1;
int a2=super.a2;
int a3=super.a3;
int total;
double att;
String grade = "";
b_tech()
{
System.out.println("Enter cat3 marks out of 20:");
this.cat3 = sc.nextInt();
}
public void cal_total()
{ 
    if(att>=90)
    {
        total = cat1+cat2+cat3+a1+a2+a3+10;
    }
    else
    {
        total = cat1+cat2+cat3+a1+a2+a3;  
    }
}
public void cal_grade()
{
    if(total>=90)
    {
        grade = "S";
    } 
    else if(total>=80 && total<90)
    {
        grade = "A";
    }
    else if(total>=70 && total<80)
    {
        grade = "B";
    }
    else if(total>=60 && total<70)
    {
        grade = "C";
    }
    else if(total>=50 && total<60)
    {
        grade = "D";
    }
    else
    {
        grade = "N";
    }
}
public void display()
{
super.display();
System.out.println("Cat1: "+cat1);
System.out.println("Cat2: "+cat2);
System.out.println("Cat3: "+cat3);
System.out.println("Assignment 1: "+a1);
System.out.println("Assignment 2: "+a2);
System.out.println("Assignment 3: "+a3);
System.out.println("Total: "+total);
System.out.println("Grade: "+grade);
}
}

//Research scholar class derived from student class
class re_scholar extends student implements cal2
{
int c1,c2,c3,c4,p1,total;
String grade;
re_scholar()
{
        System.out.println("Enter c1 marks out of 20:");
this.c1 = sc.nextInt();
System.out.println("Enter c2 marks out of 20:");
this.c2 = sc.nextInt();
System.out.println("Enter c3 marks out of 20:");
this.c3 = sc.nextInt();
System.out.println("Enter c4 marks out of 20:");
this.c4 = sc.nextInt();
System.out.println("Enter p1 marks out of 20:");
p1 = sc.nextInt();
}
public void re_total()
{
total = c1+c2+c3+c4+p1;
}
public void cal_grade()
{
    if(total>=90)
    {
        grade = "S";
    } 
    else if(total>=80 && total<90)
    {
        grade = "A";
    }
    else if(total>=70 && total<80)
    {
        grade = "B";
    }
    else if(total>=60 && total<70)
    {
        grade = "C";
    }
    else if(total>=50 && total<60)
    {
        grade = "D";
    }
    else
    {
        grade = "N";
    }
}
public void re_display()
{
System.out.println("Name: "+name);
System.out.println("Reg Number:"+reg_no);
System.out.println("C1: "+c1);
System.out.println("C2: "+c2);
System.out.println("C3: "+c3);
System.out.println("C4: "+c4);
System.out.println("P1: "+p1);
System.out.println("Total: "+total);
System.out.println("Grade: "+grade);
}
}

// BCA class derived from ug_student class
class bca extends ug_student 
{
    int c1=super.cat1;
    int c2=super.cat2;
    int lear;
    int a1=super.a1;
    int a2=super.a2;
    int a3=super.a3;
    int assign[] = new int[3];
    double att=super.att;
    double total;
    String grade;
    bca()
    {
        System.out.println("Enter extra learning courses marks out of 40:");
        this.lear = sc.nextInt();
        this.assign[0] = a1;
        this.assign[1] = a2;
        this.assign[2] = a3;
    }
    public void get_assign()
    {
        Arrays.sort(assign);
    }
    public void bca_total()
    {
        if(att>=90)
        {
            total = ((c1+c2)/2)+lear+((assign[1]+assign[2]))+10.0;
        }
        else
        {
            total = ((c1+c2)/2)+lear+((assign[1]+assign[2]));
        }
    }
    public void cal_grade()
{
    if(total>=90)
    {
        grade = "S";
    } 
    else if(total>=80 && total<90)
    {
        grade = "A";
    }
    else if(total>=70 && total<80)
    {
        grade = "B";
    }
    else if(total>=60 && total<70)
    {
        grade = "C";
    }
    else if(total>=50 && total<60)
    {
        grade = "D";
    }
    else
    {
        grade = "N";
    }
}
    public void bca_display()
    {
        super.display();
        System.out.println("Cat1: "+c1);
        System.out.println("Cat2: "+c2);
        System.out.println("Extra learning course: "+lear);
        System.out.println("Best of Assignment marks: "+assign[1]+" "+assign[2]);
        System.out.println("Total: "+total);
        System.out.println("Grade: "+grade);
    }

}
