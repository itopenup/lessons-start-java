import java.util.Scanner;

class LessonLinearApp_2 {
	public static void main (String[] arguments) {
		//Declare variables for time values
		short hour1, hour2, min1, min2, sec1, sec2;
		long hour, min, sec;

		/*
		Declare variable Scanner to read console input
		Assume input to be separated with colon and EOL
		*/
		java.util.Scanner scanner = new Scanner(System.in).useDelimiter(":|\n");

		System.out.print("Enter start time (hour:min:sec): ");
		hour1 = scanner.nextShort(); //Read first part separated with colon
		min1 = scanner.nextShort(); //Read second part separated with colon
		sec1 = scanner.nextShort(); //Read third part separated with colon

		System.out.print("Enter end time (hour:min:sec): ");
		hour2 = scanner.nextShort();
		min2 = scanner.nextShort();
		sec2 = scanner.nextShort();

		long differenceInSeconds = (hour2 - hour1) * 3600 + (min2 - min1) * 60 + (sec2 - sec1);
		hour = differenceInSeconds / 3600;
		min = (differenceInSeconds - hour * 3600) / 60;
		sec = differenceInSeconds - hour * 3600 - min * 60;

		System.out.printf("Difference is: %d hour(s), %d minute(s), %d second(s)", hour, min, sec);
		System.out.println();
	}
}