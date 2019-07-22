class LessonArray1 {
	public static void main (String[] arguments) {
		int[] I;
		String[] S = new String[] {"Spring", "Summer", "Autumn", "Winter"};

		I = new int[5];
		I[0] = 5;
		I[1] = 4;
		I[2] = 3;
		I[3] = 2;
		I[4] = 1;

		System.out.println("-------------------------------------------");
		System.out.println("Integer array ascendant:");
		for (int i = I.length-1; i >= 0; i--) {
			System.out.printf("%d; ", I[i]);
		}
		System.out.println("\n-------------------------------------------");

		System.out.println("String array:");
		for (int s=0; s<S.length; s++) {
			System.out.printf("%s; ", S[s]);
		}
		System.out.println("\n-------------------------------------------");

		

		System.out.printf("2nd (by index) element of the String array: %s", S[2]);
		System.out.println("\n-------------------------------------------");
	}
}