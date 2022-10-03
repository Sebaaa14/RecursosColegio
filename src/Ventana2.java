import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtRut;
	private JTextField txtCorreo;
	private JTextField txtEspecial;
	private String nombre;
	private String correo;
	private int rut;
	private String especial;
	private int tipo;
	/**
	 * Create the frame.
	 */
	public Ventana2(int tipoAux) {
		tipo=tipoAux;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 22, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Rut:");
		lblNewLabel.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 68, 16, 0);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Correo:");
		lblNewLabel_1.setBounds(10, 99, 46, 14);
		contentPane.add(lblNewLabel_1);
		JLabel lblEspecial;
		if(tipo==0) {
			lblEspecial = new JLabel("Rol:");
		}else {
			lblEspecial = new JLabel("Especialidad:");
		}
		lblEspecial.setBounds(10, 138, 80, 14);
		contentPane.add(lblEspecial);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			nombre = txtNombre.getText();
			}
		});
		txtNombre.setBounds(78, 19, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtRut = new JTextField();
		txtRut.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			rut = Integer.parseInt(txtRut.getText());
			}
		});
		txtRut.setBounds(78, 58, 86, 20);
		contentPane.add(txtRut);
		txtRut.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				correo = txtCorreo.getText();
			}
		});
		txtCorreo.setBounds(78, 96, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtEspecial = new JTextField();
		txtEspecial.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				especial = txtEspecial.getText();
			}
		});
		txtEspecial.setBounds(78, 135, 86, 20);
		contentPane.add(txtEspecial);
		txtEspecial.setColumns(10);
		
		Button button = new Button("Agregar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tipo==0) {
					Alumno al = new Alumno(rut,nombre,correo,Integer.parseInt(especial));
					Gestion.getInstancia().agregarAlumno(al);
				}else {
					Profesor pr = new Profesor(rut,nombre,correo,especial);
					Gestion.getInstancia().agregarProfesor(pr);
				}
			}
		});
		button.setBounds(210, 61, 129, 79);
		contentPane.add(button);
	}
}
