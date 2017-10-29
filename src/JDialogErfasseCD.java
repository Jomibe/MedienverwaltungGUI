import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialogErfasseCD extends JDialog {
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	public String derTitel = "";
	public String derKuenstler = "";
	public int laenge = 0;
	public int stuecke = 0;
	private JLabel labelErfasseCD = new JLabel();
	private JLabel labelDerKuenstler = new JLabel();
	private JLabel labelStuecke = new JLabel();
	private JLabel labelLaenge = new JLabel();
	private JLabel labelDerTitel = new JLabel();
	private JTextField textFieldDerTitel = new JTextField();
	private JTextField textFieldDerKuenstler = new JTextField();
	private JTextField numberFieldStuecke = new JTextField();
	private JTextField numberFieldLaenge = new JTextField();
	private JButton buttonErfasseCD = new JButton();
	private JButton buttonAbbrechen = new JButton();
	// Ende Attribute

	public JDialogErfasseCD(JFrame owner, boolean modal) {
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

		labelErfasseCD.setBounds(8, 8, 110, 20);
		labelErfasseCD.setText("ErfasseCD");
		cp.add(labelErfasseCD);
		textFieldDerTitel.setBounds(32, 64, 150, 20);
		textFieldDerTitel.setText("DerTitel");
		cp.add(textFieldDerTitel);
		textFieldDerKuenstler.setBounds(32, 120, 150, 20);
		textFieldDerKuenstler.setText("DerKuenstler");
		cp.add(textFieldDerKuenstler);
		numberFieldStuecke.setBounds(32, 176, 75, 20);
		numberFieldStuecke.setText("42");
		cp.add(numberFieldStuecke);
		numberFieldLaenge.setBounds(32, 232, 75, 20);
		numberFieldLaenge.setText("42");
		cp.add(numberFieldLaenge);
		labelDerTitel.setBounds(32, 40, 110, 20);
		labelDerTitel.setText("DerTitel");
		cp.add(labelDerTitel);
		labelDerKuenstler.setBounds(32, 96, 110, 20);
		labelDerKuenstler.setText("DerKuenstler");
		cp.add(labelDerKuenstler);
		labelStuecke.setBounds(32, 152, 110, 20);
		labelStuecke.setText("Stuecke");
		cp.add(labelStuecke);
		labelLaenge.setBounds(32, 208, 110, 20);
		labelLaenge.setText("Laenge");
		cp.add(labelLaenge);
		buttonErfasseCD.setBounds(8, 288, 75, 25);
		buttonErfasseCD.setText("ErfasseCD");
		buttonErfasseCD.setMargin(new Insets(2, 2, 2, 2));
		buttonErfasseCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonErfasseCD_ActionPerformed(evt);
			}
		});
		cp.add(buttonErfasseCD);
		buttonAbbrechen.setBounds(104, 288, 75, 25);
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
	public void buttonErfasseCD_ActionPerformed(ActionEvent evt) {
		derTitel = textFieldDerTitel.getText();
		derKuenstler = textFieldDerKuenstler.getText();
		laenge = Integer.parseInt(numberFieldLaenge.getText());
		stuecke = Integer.parseInt(numberFieldStuecke.getText());
		
		JFrameMedienverwaltung.db.erfasseMedium(new CD(derTitel, derKuenstler, stuecke, laenge));
		
		buttonAbbrechen_ActionPerformed(evt);
	} // end of buttonErfasseCD_ActionPerformed

	public void buttonAbbrechen_ActionPerformed(ActionEvent evt) {
		textFieldDerTitel.setText("DerTitel");
		textFieldDerKuenstler.setText("DerKuenstler");
		numberFieldStuecke.setText("42");
		numberFieldLaenge.setText("42");
		this.setVisible(false);
	} // end of buttonAbbrechen_ActionPerformed

	// Ende Methoden

} // end of class JDialogErfasseCD
