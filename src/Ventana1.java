import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ventana1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	


	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button btn1 = new Button("Agregar Alumnos");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Gestion.mostrarVentana2(0);
			}
		});
		btn1.setBounds(21, 10, 137, 50);
		contentPane.add(btn1);
		
		Button btn2 = new Button("Agregar Profesor");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gestion.mostrarVentana2(1);
			}
		});
		btn2.setBounds(21, 66, 137, 52);
		contentPane.add(btn2);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(170, 10, 89, 107);
		contentPane.add(btnNewButton);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
