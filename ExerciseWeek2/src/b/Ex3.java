package b;

import java.util.*;

class Equation{
	double a;
	double b;
	Scanner input = new Scanner(System.in);
	void setScore() {
		
		
		a = getScore("a = ");
		
		b = getScore("b = ");
		
		input.close();
	}
		
	double getScore(String text) {
		double score = -1;
		boolean validvariable = false;
		
		while (!validvariable) {
			try {
				System.out.print(text);
				score = input.nextDouble();
				if(score >= 0 && score <= 10) {
					validvariable = true;
				}else {
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
		double x;
		if(a != 0) {
			x = - (double)b / a;
			System.out.println(x);
		}else if(a == 0 && b != 0){
			System.out.println("Phuong trinh vo nghiem");
		}else {
			System.out.println("Phuong trinh co nghiem voi moi x");
		}
	}
}




public class Ex3 {
	
	
	
	public static void main(String[] args) {
		Equation pt = new Equation();
		pt.setScore();
		pt.solve();
		
	}
}
