public class Video extends Medium {

	private String regisseur;

	public Video(String derTitel, String dieRegie, int laenge) {
		super(derTitel, laenge);
		regisseur = dieRegie;
	}
	
	public String getAusgabe() {
		String ausgabe;
		ausgabe = Medium.trennzeichen + "\nVideo: " + titel + " (" + spielzeit + " Min)\n" + regisseur + "\n" + kommentar + "\n";
		return ausgabe;
	}
}