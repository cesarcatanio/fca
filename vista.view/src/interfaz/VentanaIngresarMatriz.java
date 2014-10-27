package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import logica.Logica;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaIngresarMatriz extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFilas;
	private JTextField textField_Col;
	private JTextField[][] jTextFieldTabla;
	private JPanel panel;
	private Logica logica = new Logica();
	JPanel panelCaracteristicas;
	VentanaIngresarMatriz ventanaIngresarMatriz = this;
	JMenuItem mntmNuevaMatriz;
	JButton btnCrearGrafo;
	int tipoPintar = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresarMatriz frame = new VentanaIngresarMatriz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public String[][] recolectarDatos(){
		String datos[][]= new String[jTextFieldTabla.length][jTextFieldTabla[0].length];
		
		for (int i = 0; i < jTextFieldTabla.length; i++) {
			for (int j = 0; j < jTextFieldTabla[0].length; j++) {
				datos[i][j]= jTextFieldTabla[i][j].getText();
			}
		}
		
		return datos;
	}
	public void llenarTabla(String matrizOut[][]){
		for (int k = 0; k < matrizOut.length; k++) {
			for (int l = 0; l < matrizOut[0].length; l++) {
				jTextFieldTabla[k][l].setText(matrizOut[k][l]);
			}
		}
	}
	public void crearTabla(int filas, int columnas) {

		panel.removeAll();
		GridLayout grid = new GridLayout(filas, columnas);
		panel.setLayout(grid);
		jTextFieldTabla = new JTextField[filas][columnas];
		for (int i = 0; i < jTextFieldTabla.length; i++) {
			for (int j = 0; j < jTextFieldTabla[0].length; j++) {
				JTextField jTextField = new JTextField();
				jTextFieldTabla[i][j] = jTextField;
				
				if(i==0 || j==0){
					jTextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				}
				else{
					jTextField.setFont(new Font("Dialog", Font.PLAIN, 18));
				}
				jTextField.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(jTextField);
			}
		}
		
		textFieldFilas.setFont(new Font("Dialog", Font.BOLD, 12));
		textField_Col.setFont(new Font("Dialog", Font.BOLD, 12));
		
		jTextFieldTabla[0][0].setText("0");
		jTextFieldTabla[0][0].setVisible(false);
		panel.updateUI();
	}
	
	

	/**
	 * Create the frame.
	 */
	public VentanaIngresarMatriz() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("An�lisis Formal de Conceptos FCA");
		setBounds(100, 100, 548, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNmeroDeFilas = new JLabel("N\u00FAmero de Filas");
		lblNmeroDeFilas.setBounds(12, 83, 190, 14);
		contentPane.add(lblNmeroDeFilas);
		
		final JLabel lblIngresoDeLa = new JLabel("Ingreso de la Matriz Conceptos/Atributos");
		lblIngresoDeLa.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIngresoDeLa.setBounds(118, 35, 330, 16);
		contentPane.add(lblIngresoDeLa);
		
		textFieldFilas = new JTextField();
		textFieldFilas.setFont(new Font("Dialog", Font.PLAIN, 12));
		textFieldFilas.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFilas.setBounds(206, 81, 114, 20);
		contentPane.add(textFieldFilas);
		textFieldFilas.setColumns(10);
		textFieldFilas.setVisible(false);
		
		final JLabel lblNmeroDeColumnas = new JLabel("N\u00FAmero de Columnas");
		lblNmeroDeColumnas.setBounds(12, 114, 190, 14);
		contentPane.add(lblNmeroDeColumnas);
		
		textField_Col = new JTextField();
		textField_Col.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Col.setBounds(206, 112, 114, 20);
		contentPane.add(textField_Col);
		textField_Col.setColumns(10);
		
		final JButton btnCrearMatriz = new JButton("Crear Matriz");
		btnCrearMatriz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int filas = Integer.parseInt(textFieldFilas.getText());
					int columnas = Integer.parseInt(textField_Col.getText());
					crearTabla(filas, columnas);
					panel.setVisible(true);
				} catch (NumberFormatException exception ) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
				}
				
				
			}
		});
		btnCrearMatriz.setBounds(368, 79, 125, 23);
		contentPane.add(btnCrearMatriz);
		
		btnCrearGrafo = new JButton("Crear Grafo");
		btnCrearGrafo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String[][] matriz = recolectarDatos();
				//Instanciamos la logica
//				logica = new Logica();
				logica.ejecutarLogica(matriz);
				//Generamos el grafo		
				logica.crearGrafo(tipoPintar);
				tipoPintar = 0;
				JOptionPane.showMessageDialog(null, "Se ha generado el Diagrama");
				
			}
		});
		btnCrearGrafo.setBounds(368, 111, 125, 23);
		contentPane.add(btnCrearGrafo);
		
		panel = new JPanel();
		panel.setBounds(12, 160, 508, 240);
		contentPane.add(panel);

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 291, 23);
		contentPane.add(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mntmExportar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				logica= new Logica();
				String ruta="";
				JFileChooser chooser = new JFileChooser();
				if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
					 ruta=chooser.getSelectedFile().getAbsolutePath();
					 logica.exportarMatriz(recolectarDatos(),ruta);
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe especificar una ruta");
				}
				
				
			}
		});
		{
			btnCrearGrafo.setVisible(false);
			btnCrearMatriz.setVisible(false);
			textField_Col.setVisible(false);
			lblNmeroDeColumnas.setVisible(false);
			lblNmeroDeFilas.setVisible(false);
			lblIngresoDeLa.setVisible(false);
		}
		{	
			panelCaracteristicas = new JPanel();
			panelCaracteristicas.setBounds(0, 24, 548, 417);
			contentPane.add(panelCaracteristicas);
			panelCaracteristicas.setLayout(null);
			
			final JComboBox comboBoxUsuario = new JComboBox();
			comboBoxUsuario.setBounds(31, 30, 225, 24);
			comboBoxUsuario.addItem("Usuario del lenguaje");
			comboBoxUsuario.addItem("Experto del lenguaje");
			panelCaracteristicas.add(comboBoxUsuario);
			
			final JComboBox comboBoxSintasix = new JComboBox();
			comboBoxSintasix.setBounds(302, 30, 217, 24);
			comboBoxSintasix.addItem("Sintaxis Abstracta");
			comboBoxSintasix.addItem("Sintaxis Concreta");
			comboBoxSintasix.addItem("Herramienta");
			panelCaracteristicas.add(comboBoxSintasix);
			
			JButton btnOk = new JButton("Ok");
			btnOk.setBounds(214, 105, 118, 25);
			panelCaracteristicas.add(btnOk);
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelCaracteristicas.setVisible(false);
					
					btnCrearGrafo.setVisible(true);
					btnCrearMatriz.setVisible(true);
					textField_Col.setVisible(true);
					textFieldFilas.setVisible(true);
					lblNmeroDeColumnas.setVisible(true);
					lblNmeroDeFilas.setVisible(true);
					
					int itemCountUsuario = comboBoxUsuario.getSelectedIndex();
					int itemCountSintasix = comboBoxSintasix.getSelectedIndex();
					Logica logica = new Logica();
					String ruta = "";
					
					//Usuario
					if (itemCountUsuario == 0 && itemCountSintasix == 0) {
						
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/00.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
						
					}
					if (itemCountUsuario == 0 && itemCountSintasix == 1) {
						
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/01.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
					}
					if (itemCountUsuario == 0 && itemCountSintasix == 2) {
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/02.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
					}
					
					//Experto
					if (itemCountUsuario == 1 && itemCountSintasix == 0) {
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/10.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
					}
					if (itemCountUsuario == 1 && itemCountSintasix == 1) {
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/11.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
					}
					if (itemCountUsuario == 1 && itemCountSintasix == 2) {
						ruta = "/home/u/Documentos/proyecto/proyecto/workspace/vista.view/src/matrices/12.txt";
						String matrizOut[][]  = logica.importarMatriz(ruta);
						crearTabla(matrizOut.length, matrizOut[0].length);
						llenarTabla(matrizOut);
					}
					
					
					
					
				}
			});
			panelCaracteristicas.setVisible(false);
		}
		
		
		
		mntmNuevaMatriz = new JMenuItem("Nueva Matriz");
		mntmNuevaMatriz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelCaracteristicas.setVisible(false);
				
				panel.setVisible(true);
				btnCrearGrafo.setVisible(true);
				btnCrearMatriz.setVisible(true);
				textField_Col.setVisible(true);
				textFieldFilas.setVisible(true);
				lblNmeroDeColumnas.setVisible(true);
				lblNmeroDeFilas.setVisible(true);
				lblIngresoDeLa.setVisible(true);
				
				
				
				if (jTextFieldTabla != null) {
					for (int i = 0; i < jTextFieldTabla.length; i++) {
						for (int j = 0; j < jTextFieldTabla[0].length; j++) {
							jTextFieldTabla[i][j].setText("");
						}
					}
				}
				
				
				
//				VentanaIngresarMatriz ventanaIngresarMatriz = new VentanaIngresarMatriz();
//				ventanaIngresarMatriz.setVisible(true);
////				Logica logica = new Logica();
//				int serie = logica.getSerie() + 1;
//				logica.setSerie(serie);
			}
		});
		mnArchivo.add(mntmNuevaMatriz);
		mnArchivo.add(mntmExportar);
		
		
		
		JMenuItem mntmImportar = new JMenuItem("Importar");
		mntmImportar.addActionListener(new ActionListener() {
			
						
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					logica= new Logica();
					String ruta="";
					JFileChooser chooser = new JFileChooser();
					if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
						 ruta=chooser.getSelectedFile().getAbsolutePath();
						 
						 String matrizOut[][]=logica.importarMatriz(ruta);
							crearTabla(matrizOut.length, matrizOut[0].length);
							
							for (int k = 0; k < matrizOut.length; k++) {
								for (int l = 0; l < matrizOut[0].length; l++) {
									jTextFieldTabla[k][l].setText(matrizOut[k][l]);
								}
							}
					}
					else{
						JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo");
					}
					
					
					
				}
		});
		mnArchivo.add(mntmImportar);
		
		JMenuItem mntmExpXml = new JMenuItem("Exp. XML");
		mntmExpXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				logica= new Logica();
				String ruta="";
				JFileChooser chooser = new JFileChooser();
						
				try {
					if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
						 ruta=chooser.getSelectedFile().getAbsolutePath();
						 System.out.println("FC: "+ruta);
						 logica.ejecutarLogica(recolectarDatos());
						 logica.exportarXML(ruta, tipoPintar);
						 JOptionPane.showMessageDialog(null, "XML exportado");
					}
					else{
						JOptionPane.showMessageDialog(null, "Debe especificar una ruta");
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
				
				
			}
		
		});
		mnArchivo.add(mntmExpXml);
		
	
		
		
		JMenuItem mntmCaracteristicas = new JMenuItem("caracteristicas");
		mntmCaracteristicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCaracteristicas.setVisible(true);
				
				btnCrearGrafo.setVisible(false);
				btnCrearMatriz.setVisible(false);
				textField_Col.setVisible(false);
				textFieldFilas.setVisible(false);
				lblNmeroDeColumnas.setVisible(false);
				lblNmeroDeFilas.setVisible(false);
				lblIngresoDeLa.setVisible(false);
				
			}
		});
		mnArchivo.add(mntmCaracteristicas);
		
		JMenu mnComparar = new JMenu("Comparar");
		menuBar.add(mnComparar);
		
		JMenuItem mntmCompararModelos = new JMenuItem("Comparar modelos");
		mntmCompararModelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaComparar vComparar= new VentanaComparar(ventanaIngresarMatriz);
				vComparar.setVisible(true);
			}
		});
		mnComparar.add(mntmCompararModelos);
		
		
		
		
		
	}
	public JMenuItem nuevaMatriz(){
		return mntmNuevaMatriz;
	}
	public void setTipoPintar(int tipoPintar){
		this.tipoPintar = tipoPintar;
	}
}
