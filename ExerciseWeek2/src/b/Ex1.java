package b;

import java.util.*;

class Student {
	double score;

	String name;

	void setName(String text) {
		name = text;
	}

	void inputScore() {
		Scanner input = new Scanner(System.in);
		System.out.print("Score of " + name + " is ");

		do {
			try {
				score = input.nextDouble();
			} catch (InputMismatchException e) {
				score = -1;
			}

			if (score > 10 || score < 0) {
				System.out.println("Invalid, please enter right value:");
			}
			input.nextLine();
		} while (score > 10 || score < 0);

		input.close();
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Student A = new Student();
		A.setName("Hai");
		A.inputScore();
		if(A.score >= 0 || A.score < 3) {
			System.out.println("Fail");
		}else {
			System.out.println("Pass");
		}

	}
}
