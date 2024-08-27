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

		boolean validvariable = false;
		while (!validvariable) {
			try {
				score = input.nextDouble();
				if (score >= 0 && score <= 10) {
					validvariable = true;
				} else {
					System.out.println("Invalid, please enter a value between 0 and 10:");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number:");
				input.nextLine();
			}

		}

		input.close();
	}

	void solve() {
		if (score < 3) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
		}
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Student A = new Student();
		A.setName("Hai");
		A.inputScore();
		A.solve();

	}
}
