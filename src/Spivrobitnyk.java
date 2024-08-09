public class Spivrobitnyk {
    private String PIB;
    private String posada;
    private String email;
    private String telefon;
    private int vik;

    public Spivrobitnyk(String PIB, String posada, String email, String telefon, int vik) {
        this.PIB = PIB;
        this.posada = posada;
        this.email = email;
        this.telefon = telefon;
        this.vik = vik;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getPosada() {
        return posada;
    }

    public void setPosada(String posada) {
        this.posada = posada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }
}
