import java.util.Scanner;
public class StudentGradeCalculator {
     public static void main(String []args){
         Scanner sc= new Scanner (System.in);
         System.out.println(" Entre the  number of subject  ");
         int totalsubjects =sc.nextInt(); int SubMarks; int Totalamrks=0;
         for (int i=0;i<totalsubjects;i++){
             System.out.println(" Entre the Subject marks ");
             SubMarks=sc.nextInt();
             Totalamrks+=SubMarks;
         }
         double Avgpercentage=(Totalamrks/totalsubjects);
         char Grade;
         if (Avgpercentage >= 90)
             Grade='O';
         else if ( Avgpercentage < 90 && Avgpercentage >=80)
             Grade='A';
         else if (Avgpercentage <80 && Avgpercentage >=70) {
             Grade='B';

         }
         else if (Avgpercentage<70 && Avgpercentage >=60) {
             Grade='C';


         }
         else
             Grade='D';

         System.out.println(" Total Marks ="+ Totalamrks);
         System.out.println("Average percentage="+Avgpercentage+"%");
         System.out.println("Grade="+Grade);
     }
}

