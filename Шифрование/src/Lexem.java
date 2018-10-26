import org.jetbrains.annotations.NotNull;

public class Lexem implements Comparable<Lexem>{

    private char bykva;
    private int kolvo;

    public void setBykva(char bykva) {
        this.bykva = bykva;
    }

    public char getBykva() {
        return bykva;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public int getKolvo() {
        return kolvo;
    }

    public Lexem(char bykva, int kolvo) {
        setBykva(bykva);
        setKolvo(kolvo);
    }

    @Override
    public int compareTo(@NotNull Lexem o) {
        return o.getKolvo();
    }
}

