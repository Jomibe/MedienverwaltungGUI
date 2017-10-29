import java.util.ArrayList;
import java.util.Iterator;

public class Datenbank {
	private ArrayList medien;

	public Datenbank() {
		medien = new ArrayList();
	}

	public void erfasseMedium(Medium dasMedium) {
		medien.add(dasMedium);
	}
	
	public String auflisten() {
		// Liste der CDs ausgeben
		String gesammelteMedienAusgaben = "";
		for (Iterator iter = medien.iterator(); iter.hasNext();) {
			Medium tmp = (Medium) iter.next();
			gesammelteMedienAusgaben += tmp.getAusgabe();
		}
		return gesammelteMedienAusgaben;
	}
}
