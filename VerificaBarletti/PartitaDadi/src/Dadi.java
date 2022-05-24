import java.util.*;
public class Dadi extends Thread{
    private String nome;
    private int punteggio;
    static ArrayList<String> cock = new ArrayList<>();
    public Dadi(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        int t1 = 0, t2 = 0, t3 = 0;
        System.out.println(this.nome + " Si è aggiunto alla partita");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {    }
        while(t1 == 0 || t2 == 0){
            t1 = (int)(Math.random()*7);
            t2 = (int)(Math.random()*7);
        }
        System.out.println("Primo lancio: " + t1 + "\nSecondo lancio: " + t2);
        if(t1 == t2){
            System.out.println("Lancio Bonus! " + this.nome);
            do{
                t3 = (int)(Math.random()*7);
            }while(t3 == 0);
        }
        punteggio = t1 + t2 + t3;
        System.out.println(this.nome + " ha totalizzato " + punteggio + " punti!");
    }

}
