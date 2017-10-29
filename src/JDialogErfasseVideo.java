import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialogErfasseVideo extends JDialog {
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	public String derTitel = "";
	public String dieRegie = "";
	public int laenge = 0;
	private JLabel labelErfasseVideo = new JLabel();
	private JLabel labelDieRegie = new JLabel();
	private JLabel labelLaenge = new JLabel();
	private JLabel labelDerTitel = new JLabel();
	private JTextField textFieldDerTitel = new JTextField();
	private JTextField textFieldDieRegie = new JTextField();
	private JTextField numberFieldLaenge = new JTextField();
	private JButton buttonErfasseVideo = new JButton();
	private JButton buttonAbbrechen = new JButton();
	// Ende Attribute

	public JDialogErfasseVideo(JFrame owner, boolean modal) {
		// Dialog-Initialisierung
		super(owner, modal);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 224;
		int frameHeight = 371;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten

		labelErfasseVideo.setBounds(8, 8, 110, 20);
		labelErfasseVideo.setText("ErfasseVideo");
		cp.add(labelErfasseVideo);
		textFieldDerTitel.setBounds(32, 64, 150, 20);
		textFieldDerTitel.setText("DerTitel");
		cp.add(textFieldDerTitel);
		textFieldDieRegie.setBounds(32, 120, 150, 20);
		textFieldDieRegie.setText("DieRegie");
		cp.add(textFieldDieRegie);
		numberFieldLaenge.setBounds(32, 232, 75, 20);
		numberFieldLaenge.setText("42");
		cp.add(numberFieldLaenge);
		labelDerTitel.setBounds(32, 40, 110, 20);
		labelDerTitel.setText("DerTitel");
		cp.add(labelDerTitel);
		labelDieRegie.setBounds(32, 96, 110, 20);
		labelDieRegie.setText("DieRegie");
		cp.add(labelDieRegie);
		labelLaenge.setBounds(32, 208, 110, 20);
		labelLaenge.setText("Laenge");
		cp.add(labelLaenge);
		buttonErfasseVideo.setBounds(8, 288, 100, 25);
		buttonErfasseVideo.setText("ErfasseVideo");
		buttonErfasseVideo.setMargin(new Insets(2, 2, 2, 2));
		buttonErfasseVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonErfasseVideo_ActionPerformed(evt);
			}
		});
		cp.add(buttonErfasseVideo);
		buttonAbbrechen.setBounds(129, 288, 75, 25);
		buttonAbbrechen.setText("Abbrechen");
		buttonAbbrechen.setMargin(new Insets(2, 2, 2, 2));
		buttonAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonAbbrechen_ActionPerformed(evt);
			}
		});
		cp.add(buttonAbbrechen);
		// Ende Komponenten

		setResizable(false);
		setVisible(false);
	} // end of public JDialogErfasseCD

	// Anfang Methoden
	public void buttonErfasseVideo_ActionPerformed(ActionEvent evt) {
		derTitel = textFieldDerTitel.getText();
		dieRegie = textFieldDieRegie.getText();
		laenge = Integer.parseInt(numberFieldLaenge.getText());
		
		JFrameMedienverwaltung.db.erfasseMedium(new Video(derTitel, dieRegie, laenge));
		
		buttonAbbrechen_ActionPerformed(evt);
	} // end of buttonErfasseCD_ActionPerformed

	public void buttonAbbrechen_ActionPerformed(ActionEvent evt) {
		textFieldDerTitel.setText("DerTitel");
		textFieldDieRegie.setText("DieRegie");
		numberFieldLaenge.setText("42");
		this.setVisible(false);
	} // end of buttonAbbrechen_ActionPerformed

	// Ende Methoden

} // end of class JDialogErfasseCD
