import java.util.Scanner;
public class Calculatepercentage {
    float percentage;
    float total_marks;
    float scored;
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The total Subject");
    float total_marks=sc.nextFloat();
    
    System.out.println("Enter the Maths Marks");
    float maths=sc.nextFloat();
    System.out.println("Enter the English marks");
    int English=sc.nextInt();
    System.out.println("Enter the Hindi marks");
    float Hindi=sc.nextFloat();
    System.out.println("Enter the Chemistry marks");
    float chemistry=sc.nextFloat();
    System.out.println("Enter the physics marks");
    float physics=sc.nextFloat();
    float scored=maths+English+Hindi+chemistry+physics;
    System.out.println("Total scored \n"+scored);
   float percentage=(scored/500)*100;
   System.out.println("percentage \n"+ percentage);
    



}    
}
