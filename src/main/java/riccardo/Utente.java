package riccardo;

public class Utente {
    private String nome;
    private String surname;
    private int eta;

    public Utente(String nome, String surname, int eta) {
        this.nome = nome;
        this.surname = surname;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
