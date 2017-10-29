public abstract class Medium {
	protected String titel;
	protected int spielzeit;
	protected boolean habIch;
	protected String kommentar;
	public static String trennzeichen = "[][][][][][][][][][][][][][][][][][][][][]";

	public Medium(String derTitel, int laenge) {
		titel = derTitel;
		spielzeit = laenge;
		habIch = false;
		kommentar = "<kein Kommentar>";
	}
	
	public abstract String getAusgabe();
}
