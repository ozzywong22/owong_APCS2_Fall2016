//Oscar Wong Calculate Library 8/31/26
//square will square an integer that is given
public class Calculate {
	public static int square(int number){
		return(number * number);
	}
	public static int cube(int number){
		return(number * number * number);
	}
	public static int average(int numOne, int numTwo){
		int answer = ((numOne + numTwo)/2);
		return(answer);
	}
	public static double averageOverload(double num1, double num2, double num3){
		return((num1 + num2 + num3)/3);
	}
	public static double toDegrees(double number){
		double x = 3.14159/180;
		return(x * number);
	}
	public static double toRadians(double number){
		return (number * 3.14159)/180;
	}
	public static double discriminant(double num1, double num2, double num3){
		double x = num2 * num2;
		double y = num1 * num3;
		double z = 4 * y;
		return(x-z);
	}
	public static int toImproperFrac(int num1, int num2, int num3){
		int x = (num1 * num3) + num2;
		return(x/num3);
	}
	public static int toMixedNum(int num1, int num2){
		int x = num1/num2;
		int y = num1%num2;
		return(x_(y/num2));
	}
	public static int
	
	
	
}