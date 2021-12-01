import pl.sggw.SimpleWzimBoundedQueue;

public class Main {

    public static void main(String[] args) {
        SimpleWzimBoundedQueue<Integer> Kolejka = new SimpleWzimBoundedQueue<Integer>(7);
        Kolejka.add(1);
        Kolejka.add(2);
        Kolejka.add(3);
        Kolejka.add(4);
        Kolejka.add(5);
        Kolejka.add(6);
        Kolejka.add(7);

        //Kolejka.add(8);

    }
}
