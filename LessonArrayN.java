import java.lang.Math;

class LessonArrayN {
	public static void main (String[] arguments) {
		int[][][] I;

		String[][] S = new String[][] {
			{"December", "January", "February"},
			{"March", "April", "May"},
			{"June", "July", "August"},
			{"September", "October", "November"}
		};

		I = new int[3][2][5];

		//Init array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 5; k++) {
					int value = (int) (Math.random() * 100);
					I[i][j][k] = value;
				}
			}
		}

		System.out.println("-------------------------------------------");
		System.out.println("Integer array:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d: ", i);

			for (int j = 0; j < 2; j++) {
				System.out.printf("%d {", j);

				for (int k = 0; k < 5; k++) {
					System.out.printf("%d;", I[i][j][k]);
				}

				System.out.print("}   ");
			}

			System.out.println();
		}
		System.out.println("\n-------------------------------------------");

		System.out.println("String array:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%s; ", S[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------------");
	}
}