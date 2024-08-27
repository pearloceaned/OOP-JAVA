package b;

import java.util.*;

class Student2 {
	double mathScore;
	double physicScore;
	double chemistryScore;
	String name;

	public void setName(String name) {
		this.name = name;
	}

	Scanner input = new Scanner(System.in);

	void setScore() {
		System.out.println("Score of " + name + " is ");
		mathScore = getScore("Math score = ");
		physicScore = getScore("Physics score = ");
		chemistryScore = getScore("Chemistry score = ");
		input.close();
	}

	double getScore(String text) {
		double score = -1;
		boolean validvariable = false;
		while (!validvariable) {
			try {
				System.out.print(text);
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

		return score;
	}

	void solve() {
		double average = (double) (mathScore + physicScore + chemistryScore) / 3;
		if (average >= 8) {
			System.out.print("Rank: GIOI");

		}
		if (6.5 <= average && average < 8) {
			System.out.print("Rank: KHA");

		}
		if (5 <= average && average < 6.5) {
			System.out.print("Rank: TRUNG BINH");

		}
		if (3.5 <= average && average < 5) {
			System.out.print("Rank: YEU");

		}
		if (average < 3.5) {
			System.out.print("Rank: KEM");

		}
	}
}

public class Ex2 {

	public static void main(String[] args) {
		Student2 a = new Student2();
		a.setName("Hai");
		a.setScore();

		a.solve();
	}
}
