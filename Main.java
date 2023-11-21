public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Animale gatto = new Gatto();
        animale.faiIlVerso(gatto);
        animale.faiIlVerso(animale);
    }
}
