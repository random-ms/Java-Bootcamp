public class Main {

    public static void main(String[] args) {
        Thread childTread = new Thread(()->count(), "child");
        childTread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": "+ i);
        }
    }
}