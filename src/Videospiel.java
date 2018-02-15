public class Videospiel extends Spiel {
	
	private boolean online;

	public Videospiel(String derTitel, int laenge, int fsk, boolean online) {
		super(derTitel, laenge, fsk);
		this.online = online;
	}

	public String getAusgabe() {
		String ausgabe;
		ausgabe = Medium.trennzeichen + "\nVideospiel: " + titel + " (FSK " + fsk + ")\n" + "Muss online gespielt werden: " + online + "\n" + kommentar + "\n";
		return ausgabe;
	}
	
}