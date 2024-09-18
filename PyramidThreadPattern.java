public class PyramidThreadPattern extends Thread {
    int lines;

    public PyramidThreadPattern(int lines) {
        try {
            if (lines % 2 == 0) throw new LinesAreNotOdd("Input odd number");
            this.lines = lines;
        } catch (LinesAreNotOdd _) {
        }
    }

    @Override
    public void run() {
        int white_space = lines * 2, k = 1;
        for (int i = 0; i < lines; i++) {
            if (white_space > 0)
                System.out.print(" ".repeat(white_space));
            for (int j = 0; j < k; j++) {
                System.out.print("* ");
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                //Thread Interrupted
            }
            k += 2;
            white_space -= 2;
            System.out.println();
        }
    }
}

class LinesAreNotOdd extends Exception {
    public LinesAreNotOdd(String message) {
        super(message);
    }
}