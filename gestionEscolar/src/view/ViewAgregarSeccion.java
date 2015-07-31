package view;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;


public class ViewAgregarSeccion extends JFrame{
	private String modalidad;
	private int curso;
	private int Seccion;
	private String jornada;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnGuardar;

	
	ViewAgregarSeccion(){
		getContentPane().setLayout(null);
		
		JLabel lblAgregarSeccion = new JLabel("Agregar Seccion");
		lblAgregarSeccion.setBounds(153, 32, 92, 14);
		getContentPane().add(lblAgregarSeccion);
		
		JLabel lblModalidad = new JLabel("Modalidad:");
		lblModalidad.setBounds(59, 66, 66, 14);
		getContentPane().add(lblModalidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(313, 63, 20, 20);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(124, 63, 192, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(59, 97, 46, 14);
		getContentPane().add(lblCurso);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 94, 137, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(261, 94, 28, 20);
		getContentPane().add(comboBox_1);
		
		JLabel lblSeccion = new JLabel("Seccion:");
		lblSeccion.setBounds(59, 132, 46, 14);
		getContentPane().add(lblSeccion);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 129, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblJornada = new JLabel("Jornada:");
		lblJornada.setBounds(59, 169, 60, 14);
		getContentPane().add(lblJornada);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 166, 165, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(288, 166, 28, 20);
		getContentPane().add(comboBox_2);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(165, 197, 80, 20);
		getContentPane().add(btnGuardar);
		
		
		
	}
}
