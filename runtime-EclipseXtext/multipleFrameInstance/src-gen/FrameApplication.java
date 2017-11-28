import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameApplication {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final JFrame A = new JFrame(); // Annotation "final" necessaire sur mon poste
				final JFrame B = new JFrame(); // Annotation "final" necessaire sur mon poste
				A.setLayout(new FlowLayout());
				A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				A.setTitle("Frame A");
				A.setSize(200, 100);
				JLabel labelA0 = new JLabel();
				A.add(labelA0);
				labelA0.setText("Hello");
				JButton buttonA1 = new JButton();
				A.add(buttonA1);
				buttonA1.setText("...");
				buttonA1.addActionListener(new ActionListener() {
					//@Override // --> Fonctionne sans l'annotation sur mon poste, decommenter sinon
					public void actionPerformed(ActionEvent e)
					{
						A.setVisible(false);
						B.setVisible(true);
					}
				});
				B.setLayout(new FlowLayout());
				B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				B.setTitle("Frame B");
				B.setSize(300, 100);
				JLabel labelB0 = new JLabel();
				B.add(labelB0);
				labelB0.setText("...World!");
				JButton buttonB1 = new JButton();
				B.add(buttonB1);
				buttonB1.setText("Restart");
				buttonB1.addActionListener(new ActionListener() {
					//@Override // --> Fonctionne sans l'annotation sur mon poste, decommenter sinon
					public void actionPerformed(ActionEvent e)
					{
						B.setVisible(false);
						A.setVisible(true);
					}
				});
				A.setVisible(true);
			}
		});
	}
}
