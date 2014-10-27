package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

import java.awt.GridLayout;

import javax.swing.border.LineBorder;

import java.awt.Color;

import logica.Logica;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaComparar extends JFrame {

	private JPanel contentPane;
	private JTextField[][] jTextFieldMatrizUno;
	private JTextField[][] jTextFieldMatrizDos;
	JPanel panelMatrizUno;
	JPanel panelMatrizDos;


	public void crearTablaUno(int filas, int columnas) {

		panelMatrizUno.removeAll();
		GridLayout grid = new GridLayout(filas, columnas);
		panelMatrizUno.setLayout(grid);
		jTextFieldMatrizUno = new JTextField[filas][columnas];
		for (int i = 0; i < jTextFieldMatrizUno.length; i++) {
			for (int j = 0; j < jTextFieldMatrizUno[0].length; j++) {
				JTextField jTextField = new JTextField();
				jTextFieldMatrizUno[i][j] = jTextField;

				if (i == 0 || j == 0) {
					jTextField.setFont(new Font("Tahoma", Font.BOLD
							| Font.ITALIC, 14));
				} else {
					jTextField.setFont(new Font("Dialog", Font.PLAIN, 18));
				}
				jTextField.setHorizontalAlignment(SwingConstants.CENTER);
				panelMatrizUno.add(jTextField);
			}
		}
	}

	public void importarMatrizUno() {
		Logica logica = new Logica();
		String[][] matrizOut = logica
				.importarMatriz("/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/zachman.txt");
		crearTablaUno(matrizOut.length, matrizOut[0].length);
		llenarTablaUno(matrizOut);

	}

	public void llenarTablaUno(String matrizOut[][]) {

		for (int k = 0; k < matrizOut.length; k++) {
			for (int l = 0; l < matrizOut[0].length; l++) {
				jTextFieldMatrizUno[k][l].setText(matrizOut[k][l]);
			}
		}
		
	}
	
	public void crearTablaDos(int filas, int columnas) {

		panelMatrizDos.removeAll();
		GridLayout grid = new GridLayout(filas, columnas);
		panelMatrizDos.setLayout(grid);
		jTextFieldMatrizDos = new JTextField[filas][columnas];
		for (int i = 0; i < jTextFieldMatrizDos.length; i++) {
			for (int j = 0; j < jTextFieldMatrizDos[0].length; j++) {
				JTextField jTextField = new JTextField();
				jTextFieldMatrizDos[i][j] = jTextField;

				if (i == 0 || j == 0) {
					jTextField.setFont(new Font("Tahoma", Font.BOLD
							| Font.ITALIC, 14));
				} else {
					jTextField.setFont(new Font("Dialog", Font.PLAIN, 18));
				}
				jTextField.setHorizontalAlignment(SwingConstants.CENTER);
				panelMatrizDos.add(jTextField);
			}
		}
	}

	public void importarMatrizDos() {
		Logica logica = new Logica();
		String[][] matrizOut = logica
				.importarMatriz("/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/zachman.txt");
		crearTablaDos(matrizOut.length, matrizOut[0].length);
		llenarTablaDos(matrizOut);

	}

	public void llenarTablaDos(String matrizOut[][]) {

		for (int k = 0; k < matrizOut.length; k++) {
			for (int l = 0; l < matrizOut[0].length; l++) {
				jTextFieldMatrizDos[k][l].setText(matrizOut[k][l]);
			}
		}
		
	}

	/**
	 * Create the frame.
	 */
	public VentanaComparar(final VentanaIngresarMatriz ventanaIngresarMatriz) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMatrizUno = new JPanel();
		panelMatrizUno.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMatrizUno.setBounds(19, 27, 446, 300);
		contentPane.add(panelMatrizUno);
		panelMatrizUno.setLayout(new GridLayout(1, 0, 0, 0));

		panelMatrizDos = new JPanel();
		panelMatrizDos.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMatrizDos.setBounds(477, 27, 446, 300);
		contentPane.add(panelMatrizDos);
		panelMatrizDos.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnComparar = new JButton("Comparar");
		btnComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[][] matrizUno = convertirJTexField(jTextFieldMatrizUno);
				String[][] matrizDos = convertirJTexField(jTextFieldMatrizDos);
				
				Logica logica = new Logica();
				String[][] matriz = logica.compararMatrices(matrizUno, matrizDos);
				ventanaIngresarMatriz.setTipoPintar(1);
				ventanaIngresarMatriz.crearTabla(matriz.length, matriz[0].length);
				ventanaIngresarMatriz.llenarTabla(matriz);
				ventanaIngresarMatriz.btnCrearGrafo.setVisible(true);
				
				
				System.out.println("entro");
				
			
				
				
			}
		});
		btnComparar.setBounds(391, 335, 154, 27);
		contentPane.add(btnComparar);
		importarMatrizUno();
		importarMatrizDos();

	}
	public String[][] convertirJTexField(JTextField[][] matriz){
		String[][] matrizAux = new String[matriz.length][matriz[0].length];
		for (int i = 0; i < matrizAux.length; i++) {
			for (int j = 0; j < matrizAux[0].length; j++) {
				matrizAux[i][j] = matriz[i][j].getText();
			}
		}
		return matrizAux;
	}
}
