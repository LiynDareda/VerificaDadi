import javax.crypto.spec.DESKeySpec;

public class App {
    public static void main(String[] args) throws Exception {
        Dadi d1 = new Dadi("Barletti");
        Dadi d2 = new Dadi("Lanzi");
        d1.setPriority(10);

        System.out.println("INIZIO PARTITA");
        d1.start();
        d2.start();
        d1.join();
        d2.join();
        System.out.println("FINE PARTITA");
    }
}
