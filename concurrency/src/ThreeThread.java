/**
 * Created by raghuanna on 8/27/17.
 */
class One implements Runnable {

    public void run() {
        System.out.print(Thread.currentThread().getName());
        //System.out.println("In One method; thread name is: " + Thread.currentThread().getName());
    }


}


class Two implements Runnable {

    public void run() {
        //System.out.println("In Two method; thread name is: " + Thread.currentThread().getName());

        new One().run();
        new Thread(new One(), "Two").start();
        new Thread(new One(), "One").start();
    }
}


class ThreeThread {
    public static void main(String args[]) {
        new Thread(new Two(), "Three").start();
        System.out.println("In main method; thread name is: " +
                Thread.currentThread().getName());


    }
}