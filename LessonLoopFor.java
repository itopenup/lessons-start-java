class LessonLoopFor {
	public static void main (String[] arguments) {

		for (int i=0; i<10; i++) {
			System.out.printf("%d; ", i);
		}

		System.out.println();

		for (int i=0; i<10; i++) {
			if (i == 3) {
				continue;
			}

			System.out.printf("%d; ", i);
		}

		System.out.println();

		for (int i=0; i<10; i++) {
			if (i == 7) {
				break;
			}
			
			System.out.printf("%d; ", i);
		}

		System.out.println();
	}
}