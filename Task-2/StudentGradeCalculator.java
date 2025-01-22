
import java.util.Scanner;

class StudentGradeCalculator
{
    public static void main(String args[])
    {
        float eng, phy, chem, math, comp;
        double total, average, percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextFloat();
        System.out.print("Enter marks of physics subjects:");
        phy=op.nextFloat();
        System.out.print("Enter marks of chemistry subjects:");
        chem=op.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math=op.nextFloat();
        System.out.print("Enter marks of computers subjects:");
        comp=op.nextFloat();

        /* Calculate total, average and percentage */
        total = eng + phy + chem + math + comp;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;

        /* Print all results */
        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage+ " %");

    }
}