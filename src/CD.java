public class CD extends Medium {
	private String kuenstler;
	private int titelanzahl;
	
	public CD(String derTitel, String derKuenstler, int stuecke, int laenge) {
		super(derTitel, laenge);
		kuenstler = derKuenstler;
		titelanzahl = stuecke;
	}

	public String getAusgabe() {
		String ausgabe;
		ausgabe = Medium.trennzeichen + "\nCD: " + titel + " (" + spielzeit + " Min)\n" + kuenstler + "Titelanzahl: " + titelanzahl + "\n" + kommentar + "\n";
		
		return ausgabe;
	}
}
