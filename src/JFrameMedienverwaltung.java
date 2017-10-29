import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameMedienverwaltung extends JFrame {
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	private JButton buttonErfasseVideo = new JButton();
	private JButton buttonErfasseCD = new JButton();
	private JButton buttonAuflisten = new JButton();
	private JLabel labelMedienverwaltung = new JLabel();
	private JButton buttonSchliessen = new JButton();
	private JDialogErfasseCD DialogErfasseCD = new JDialogErfasseCD(this, true);
	private JDialogErfasseVideo DialogErfasseVideo = new JDialogErfasseVideo(this, true);
	private JDialogAuflisten DialogAuflisten = new JDialogAuflisten(this, true);
	
	public static Datenbank db = new Datenbank();
	// Ende Attribute

	public JFrameMedienverwaltung() {
		// Frame-Initialisierung
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 391;
		int frameHeight = 123;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setResizable(false);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		buttonErfasseVideo.setBounds(16, 48, 115, 25);
		buttonErfasseVideo.setText("ErfasseVideo");
		buttonErfasseVideo.setMargin(new Insets(2, 2, 2, 2));
		buttonErfasseVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonErfasseVideo_ActionPerformed(evt);
			}
		});
		cp.add(buttonErfasseVideo);
		buttonErfasseCD.setBounds(160, 48, 83, 25);
		buttonErfasseCD.setText("ErfasseCD");
		buttonErfasseCD.setMargin(new Insets(2, 2, 2, 2));
		buttonErfasseCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonErfasseCD_ActionPerformed(evt);
			}
		});
		cp.add(buttonErfasseCD);
		buttonAuflisten.setBounds(280, 48, 75, 25);
		buttonAuflisten.setText("auflisten");
		buttonAuflisten.setMargin(new Insets(2, 2, 2, 2));
		buttonAuflisten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonAuflisten_ActionPerformed(evt);
			}
		});
		cp.add(buttonAuflisten);
		labelMedienverwaltung.setBounds(16, 8, 166, 20);
		labelMedienverwaltung.setText("Medienverwaltung");
		cp.add(labelMedienverwaltung);
		buttonSchliessen.setBounds(216, 8, 75, 25);
		buttonSchliessen.setText("Schliessen");
		buttonSchliessen.setMargin(new Insets(2, 2, 2, 2));
		buttonSchliessen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonSchliessen_ActionPerformed(evt);
			}
		});
		cp.add(buttonSchliessen);
		// Ende Komponenten
		this.setResizable(false);
		this.setVisible(true);
	} // end of public JFrameMedienverwaltung

	// Anfang Methoden

	public static void main(String[] args) {
		new JFrameMedienverwaltung();
		db.erfasseMedium(new Videospiel("GTA", 42, 18, true)); 
		db.erfasseMedium(new Brettspiel("Mensch ärgere dich nicht", 42, 4));
	} // end of main

	public void buttonErfasseVideo_ActionPerformed(ActionEvent evt) {
		DialogErfasseVideo.setVisible(true);
	} // end of buttonErfasseVideo_ActionPerformed

	public void buttonErfasseCD_ActionPerformed(ActionEvent evt) {
		DialogErfasseCD.setVisible(true);
	} // end of buttonErfasseCD_ActionPerformed

	public void buttonAuflisten_ActionPerformed(ActionEvent evt) {
		DialogAuflisten.textAreaAuflisten.setText(db.auflisten());
		DialogAuflisten.setVisible(true);
		db.auflisten();
	} // end of buttonAuflisten_ActionPerformed

	public void buttonSchliessen_ActionPerformed(ActionEvent evt) {
		this.dispose();
	} // end of buttonSchliessen_ActionPerformed

	// Ende Methoden
} // end of class JFrameMedienverwaltung
