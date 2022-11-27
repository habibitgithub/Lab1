import java.util.*;
public class LabTask4{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Matric percentage");
		int matricMarks=scanner.nextInt();
		System.out.println("Enter Intermediate percentage");
		int intermediateMarks=scanner.nextInt();
		System.out.println("Enter Testscoure");
		int testScoure=scanner.nextInt();
		double obtainMatricMarks = matricMarks*0.1;
		double obtainIntermediate = intermediateMarks*0.3;
		double obtainTestMarks = testScoure*0.6;
		System.out.println("Total Cpn="+(obtainMatricMarks+obtainIntermediate+obtainTestMarks));
		}
}