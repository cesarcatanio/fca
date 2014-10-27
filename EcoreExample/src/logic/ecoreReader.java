package logic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ecoreReader extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecoreReader frame = new ecoreReader();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ecoreReader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEcore = new JButton("Ecore");
		btnEcore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ruta="";
				JFileChooser chooser = new JFileChooser();
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					 ruta=chooser.getSelectedFile().getAbsolutePath();
					 leerEcore(ruta);
				}
				else{
					JOptionPane.showMessageDialog(null, "Debe especificar una ruta");
				}
			}
		});
		btnEcore.setBounds(120, 81, 117, 25);
		contentPane.add(btnEcore);
	}
	
	public void leerEcore(String ruta) {

		
		File archivo;
		FileReader lector;
		BufferedReader buffer;
		
		try {

			archivo = new File(ruta);
			lector = new FileReader(archivo);
			buffer = new BufferedReader(lector);
			String lineaUno = buffer.readLine();
			String div[];

			

			while (lineaUno != null) {
				if (lineaUno.contains("<eClassifiers"))
				{
					div=lineaUno.split(" ");
					System.out.println(backMetaItem(div));
				}
				lineaUno = buffer.readLine();
			}
			buffer.close();
			lector.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Seleccionar un archivo...!");
		}
	}
	
	public String backMetaItem(String arreglo[]){
		
		String metaItem="";
		
		if(arreglo[4].toString().endsWith(">")){
			metaItem=arreglo[4].substring(6, arreglo[4].length()-2);
		}
		else{
			metaItem=arreglo[4].substring(6, arreglo[4].length()-1);
		}
		
		return metaItem;
	}
			

}
