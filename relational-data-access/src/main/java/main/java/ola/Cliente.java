package main.java.ola;

public class Cliente {

    private long id;
    private String primeiroNome, ultimoNome;

    public Cliente(long id, String primeiroNome, String ultimoNome) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, primeiroNome='%s', ultimoNome='%s']",
                id, primeiroNome, ultimoNome);
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

}
