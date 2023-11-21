public class Animale {
    private String verso;

    public String getVerso() {
        return verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    public void faiIlVerso (Animale animale) {
        System.out.println(animale.getVerso());
    }

    @Override
    public String toString() {
        return "Animale{" +
                "verso='" + verso + '\'' +
                '}';
    }
}
