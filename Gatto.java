public class Gatto extends Animale {
    private String verso = "miao";

    @Override
    public String getVerso() {
        return verso;
    }

    @Override
    public void setVerso(String verso) {
        this.verso = verso;
    }
}
