public class Brettspiel extends Spiel {
	
	private int maxspieler;

	public Brettspiel(String derTitel, int laenge, int maxspieler) {
		super(derTitel, laenge, laenge);
		this.maxspieler = maxspieler;
	}

	public String getAusgabe() {
		String ausgabe;
		ausgabe = Medium.trennzeichen + "\nBrettspiel: " + titel + " (Maximal " + maxspieler + " Spieler)\n" + kommentar + "\n";
		return ausgabe;
	}
	
}