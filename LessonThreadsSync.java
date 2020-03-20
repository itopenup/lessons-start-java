public class LessonThreadsSync {
	
	public static void main(String[] args) {
		final CommonResource commonResource = new CommonResource();

		for (int i=0; i<5; i++) {
			Thread thread = new Thread(new ThreadImpl(commonResource));
			thread.setName("Thread " + i);
			thread.start();
		}
	}
}

class CommonResource {
	private int i = 0;

	public synchronized void doEverything() {
		this.i = 0;

		for (int k=0; k<5; k++) {
			System.out.printf("%s: %d \n", Thread.currentThread().getName(), this.i);
			this.i++;

			try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
		}
	}
}

class ThreadImpl implements Runnable {

	CommonResource res;

	public ThreadImpl(CommonResource res) {
		this.res = res;
	}

	public void run() {
		res.doEverything();
	}
}