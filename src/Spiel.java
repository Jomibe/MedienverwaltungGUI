public abstract class Spiel extends Medium {
	
	protected int fsk;
	
	public Spiel(String derTitel, int laenge, int fsk) {
		super(derTitel, laenge);
		this.fsk = fsk;
	}
	
	public void setzeKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	public String gibKommentar() {
		return kommentar;
	}

	public void setzeVorhanden(boolean vorhanden) {
		habIch = vorhanden;
	}

	public boolean gibVorhanden() {
		return habIch;
	}
	
	public abstract String getAusgabe();
}