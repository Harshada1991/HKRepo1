//package print_even_odd;

public class EvenOddDriver {

    public static void main(String[] args) {
        PrintEvenOdd peo = new PrintEvenOdd(1, 20);
        Thread even = new Thread(new EvenThread(peo));
        even.setName("Even thread : ");
        Thread odd = new Thread(new OddThread(peo));
        odd.setName("Odd thread : ");
        even.start();
        odd.start();

    }

}