import java.util.*;
import java.lang.*;
 class StudentGradeCaculator
{
    public static void main (String args[])
{
    int avg,telugu,hindi,english,maths,science,social,total,result;
    System.out.println("Enter the marks in each subject (0-100)");
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks in TELUGU subject (0-100)");
    telugu=sc.nextInt();
System.out.println("Enter the marks in HINDI subject (0-100)");
    hindi=sc.nextInt();
System.out.println("Enter the marks in ENGLISH subject (0-100)");
    english=sc.nextInt();
System.out.println("Enter the marks in MATHS subject (0-100)");
    maths=sc.nextInt();
System.out.println("Enter the marks in SCIENCE subject (0-100)");
    science=sc.nextInt();
System.out.println("Enter the marks in SOCIAL subject (0-100)");
    social=sc.nextInt();
    total=(telugu+hindi+english+maths+science+social);
    avg=(total/6);
if(telugu>=35&&hindi>=35&&english>=35&&maths>=35&&science>=35&&social>=35)
 result=1;
else
result=0;
System.out.println("Total Marks");
System.out.println(total);
System.out.println("Average");
System.out.println(avg+"%");
System.out.println("Grade");
    if(avg>90&&result>0)
     System.out.println("Outstanding");
    else if(avg>80&&result>0)   
    System.out.println("Above average");
    else if(avg>70&&result>0)
    System.out.println("Average");
    else if(avg>55&&result>0)
    System.out.println("Below average");
    else if (avg>35&&result>0)
    System.out.println("Pass");
    else
    System.out.println("Fail");
}
    
}
