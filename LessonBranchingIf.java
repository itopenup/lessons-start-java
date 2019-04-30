import java.util.Scanner;

class LessonBranchingIf {
	public static void main (String[] arguments) {
		float x, y = -99999;

		java.util.Scanner scanner = new Scanner(System.in);

		System.out.print("Enter X: ");
		x = scanner.nextFloat();

		if (x < -2) y = 0;
		else if (x >= -2 && x < -1) y = -x - 2;
		else if (x >= -1 && x < 1) y = x;
		else if (x >= 1 && x < 2) y = -x + 2;
		else y = 0;

		System.out.printf("For X = %f Y = %f", x, y);
		System.out.println();
	}
}