package FlowControls;

import java.util.Scanner;

public class ElseIfStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an Test score:");
	    Scanner sc = new Scanner(System.in);
	    int testscore = sc.nextInt();
        
		char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade = " +grade);
	}

}
