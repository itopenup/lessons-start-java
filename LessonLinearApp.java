class LessonLinearApp {

	public static void main (String[] arguments) {
		float fahr, cels;

		System.out.println("Enter temperature in Fahreheits:");
		String input = System.console().readLine();

		try {
			fahr = Float.parseFloat(input);
		} catch (NumberFormatException e) {
			System.out.println("Error: bad input");
			return;
		}

		cels =  5 / 9 * (fahr - 32);

		System.out.println(input + " Fahrenheits equals " + String.valueOf(cels) + " degrees");
	}
}