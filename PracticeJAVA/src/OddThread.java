//package print_even_odd;

public class OddThread implements Runnable {
    PrintEvenOdd peo;
    public OddThread(PrintEvenOdd peo) {
        this.peo=peo;
    }
    @Override
    public void run() {
        peo.printOdd();

    }

}