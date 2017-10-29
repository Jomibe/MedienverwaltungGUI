import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialogAuflisten extends JDialog {
	private static final long serialVersionUID = 1L;
	// Anfang Attribute
	private JButton buttonAbbrechen = new JButton();
	public JTextArea textAreaAuflisten = new JTextArea();
	//public Datenbank db = JFrameMedienverwaltung.db;
	// Ende Attribute

	public JDialogAuflisten(JFrame owner, boolean modal) {
		// Dialog-Initialisierung
		super(owner, modal);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 500;
		int frameHeight = 400;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);
		textAreaAuflisten.setBounds(8, 8, frameWidth -20, 200);
		buttonAbbrechen.setBounds(104, 288, 75, 25);
		buttonAbbrechen.setText("Abbrechen");
		buttonAbbrechen.setMargin(new Insets(2, 2, 2, 2));
		buttonAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				buttonAbbrechen_ActionPerformed(evt);
			}
		});
		cp.add(textAreaAuflisten);
		cp.add(buttonAbbrechen);
		// Ende Komponenten

		setResizable(false);
		setVisible(false);
	} // end of public JDialogErfasseCD

	public void buttonAbbrechen_ActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		this.textAreaAuflisten.setText("");
	} // end of buttonAbbrechen_ActionPerformed

	// Ende Methoden

} // end of class JDialogErfasseCD
