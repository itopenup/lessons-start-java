import java.util.Scanner;

class LessonBranchingSwitch {
	public static void main (String[] arguments) {

		java.util.Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the season: ");
		String seasonName = scanner.nextLine();
		String seasonDescription = "";

		switch (seasonName) {
			case "spring":
				seasonDescription = "green";
				break;

			case "summer":
				seasonDescription = "bright";
				break;

			case "autumn":
				seasonDescription = "yellow";
				break;

			case "winter":
				seasonDescription = "white";
				break;

			default:
				seasonDescription = "unknown";
		}

		System.out.printf("%s is %s", seasonName, seasonDescription);
		System.out.println();
	}
}