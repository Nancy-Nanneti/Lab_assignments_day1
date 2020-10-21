package labassignment_day1;
import java.util.Scanner;

public class gradesAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int numStudents=sc.nextInt();
		int sum=0;
		int grades[]=new int[numStudents];
		//System.out.println("Enter the grade for student:");
		for(int i=0;i<numStudents;i++) {
			System.out.println("Enter the grade for student"+(i+1)+":");
			grades[i]=sc.nextInt();
			sum=sum+grades[i];
			if(grades[i] >100) {
			System.out.println("Invalid grade,try again......");
			i--;
			}
			sc.close();
		      ///System.out.print(i+":");
		      // sum=sum+grades[i];
	}
		System.out.println("The average is:"+(sum/numStudents));

}
}
