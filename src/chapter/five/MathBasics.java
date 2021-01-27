package chapter.five;


import java.util.Arrays;
import java.util.List;

public class MathBasics {
	public static void main(String[] args) {

		{
			//double Math:min(double a, double b)
			//float Math:min(float a, float b)
			//int Math:min(int a, int b)
			//long Math:min(long a, long b)

			int first = Math.max(3, 7);  // 7
			int second = Math.min(7, -9);  // -9

		}{

			//long Math:round(double num)
			//int Math:round(float num)

			long low = Math.round(123.45); // 123
			long high = Math.round(123.50); // 124
			int fromFloatLow = Math.round(123.45f); // 123
			int fromFloatHigh = Math.round(123.50f); // 124

		}{

			// double Math:pow(double number, double exponent)

			double squared = Math.pow(5, 2); // 25.0
			double squareRooted = Math.pow(25, 0.5); // 5.0

		}{

			//double Math:random()

			double num = Math.random(); // 0 =< num < 1

		}


		{
			double one = Math.pow(1, 2);
			//int two = Math.round(1.0); //incompatible types: possible lossy conversion from long to int
			//float three = Math.random(); //incompatible types: possible lossy conversion from double to float
			var doubles = new double[] { one, /*two, three*/};
			String [] names = {"Tom", "Dick", "Harry"};
			//List<String> list = names.asList(); //cannot find symbol
			var other = Arrays.asList(names);
			other.set(0, "Sue");
}
	}
}
