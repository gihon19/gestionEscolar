package view;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class ViewMatriculaReIngreso extends JFrame {

	private int Rne;
	private String Nombre;
	private String Apellido;
	private String Modalidad;
	private int Curso;
	private int Seccion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton Matricular;
	private JButton Cancelar;
	
    ViewMatriculaReIngreso(){
    	getContentPane().setLayout(null);
    	
    	textField = new JTextField();
    	textField.setBounds(152, 53, 183, 20);
    	getContentPane().add(textField);
    	textField.setColumns(10);
    	
    	JLabel lblRne = new JLabel("RNE");
    	lblRne.setBounds(28, 55, 46, 17);
    	getContentPane().add(lblRne);
    	
    	JLabel lblMatriculaDeRe = new JLabel("Matricula de Re- Ingreso");
    	lblMatriculaDeRe.setBounds(150, 11, 154, 31);
    	getContentPane().add(lblMatriculaDeRe);
    	
    	JLabel lblNombre = new JLabel("Nombre");
    	lblNombre.setBounds(28, 87, 46, 14);
    	getContentPane().add(lblNombre);
    	
    	JLabel lblApellido = new JLabel("Apellido");
    	lblApellido.setBounds(28, 125, 46, 14);
    	getContentPane().add(lblApellido);
    	
    	JLabel lblModalidad = new JLabel("Modalidad");
    	lblModalidad.setBounds(28, 150, 68, 14);
    	getContentPane().add(lblModalidad);
    	
    	JLabel lblCurso = new JLabel("Curso");
    	lblCurso.setBounds(28, 175, 46, 14);
    	getContentPane().add(lblCurso);
    	
    	JLabel lblSeccion = new JLabel("Seccion");
    	lblSeccion.setBounds(28, 200, 46, 14);
    	getContentPane().add(lblSeccion);
    	
    	textField_1 = new JTextField();
    	textField_1.setBounds(152, 84, 183, 20);
    	getContentPane().add(textField_1);
    	textField_1.setColumns(10);
    	
    	textField_2 = new JTextField();
    	textField_2.setBounds(152, 116, 183, 20);
    	getContentPane().add(textField_2);
    	textField_2.setColumns(10);
    	
    	textField_3 = new JTextField();
    	textField_3.setBounds(152, 147, 183, 20);
    	getContentPane().add(textField_3);
    	textField_3.setColumns(10);
    	
    	textField_4 = new JTextField();
    	textField_4.setBounds(152, 172, 39, 20);
    	getContentPane().add(textField_4);
    	textField_4.setColumns(10);
    	
    	textField_5 = new JTextField();
    	textField_5.setBounds(152, 197, 39, 20);
    	getContentPane().add(textField_5);
    	textField_5.setColumns(10);
    	
    	JComboBox comboBox = new JComboBox();
    	comboBox.setBounds(188, 172, 28, 20);
    	getContentPane().add(comboBox);
    	
    	JComboBox comboBox_1 = new JComboBox();
    	comboBox_1.setBounds(188, 197, 28, 20);
    	getContentPane().add(comboBox_1);
    	
    	JComboBox comboBox_2 = new JComboBox();
    	comboBox_2.setBounds(333, 147, 28, 20);
    	getContentPane().add(comboBox_2);
    	
    	JButton btnMatricular = new JButton("Matricular");
    	btnMatricular.setBounds(63, 237, 92, 31);
    	getContentPane().add(btnMatricular);
    	
    	JButton btnCancelar = new JButton("Cancelar");
    	btnCancelar.setBounds(239, 237, 96, 31);
    	getContentPane().add(btnCancelar);
	}
}
