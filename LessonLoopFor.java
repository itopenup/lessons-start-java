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

		outerLoop:
		for (int i=0; i<10; i++) {
			for (int j=0; j<5; j++) {
				if (j == 3) {
					break outerLoop;
				}
				
				System.out.printf("%d.%d; ", i, j);
			}
		}

		System.out.println();
	}
}