/*
package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InterfazGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField tf_1;
	private JTextField tf_2;
	private Elemento temp1;
	private Elemento temp2;
	private static ListaDisponibles disponibles;
	private static ListaDeElementos listaTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					disponibles = new ListaDisponibles();
					///HARDCODEO
					listaTotal = new ListaDeElementos ();
					listaTotal.agregarElemento("PT", new Elemento("Di","Dinero"));
					listaTotal.agregarElemento("CF", new Elemento ("Ga","Gato"));
					listaTotal.agregarElemento("Pp", new Elemento("Be","Benoffi"));
					listaTotal.agregarElemento("AC", new Elemento("Squirtle","Squirtle de Benoffi"));
					listaTotal.agregarElemento("DiGa", new Elemento("Macri","Macri"));
					listaTotal.agregarElemento("BeGa", new Elemento("Benoffi","Gato de Benoffi"));
					listaTotal.agregarElemento("Gac", new Elemento("Tuvieja","Tu vieja"));
					InterfazGrafica frame = new InterfazGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
										
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		List list = new List();
		list.setBounds(10, 10, 110, 212);
		for(Elemento elem : disponibles.retornarColeccion()) {
			list.add(elem.getNombreElemento());
		}
		contentPane.add(list);
		
		tf_1 = new JTextField();
		tf_1.setEditable(false);
		tf_1.setBounds(136, 53, 86, 20);
		contentPane.add(tf_1);
		tf_1.setColumns(10);
		
		tf_2 = new JTextField();
		tf_2.setEditable(false);
		tf_2.setBounds(136, 143, 86, 20);
		contentPane.add(tf_2);
		tf_2.setColumns(10);
		
		JLabel lblElemento = new JLabel("Elemento 1");
		lblElemento.setBounds(136, 36, 64, 14);
		contentPane.add(lblElemento);
		
		JLabel lblElemento_1 = new JLabel("Elemento 2");
		lblElemento_1.setBounds(136, 121, 64, 14);
		contentPane.add(lblElemento_1);
		
		
		JLabel imagen = new JLabel("consola");
		imagen.setBounds(56, 228, 166, 23);
		contentPane.add(imagen);
		
		JButton get_1 = new JButton("Get 1");
		get_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(list.getSelectedItem()!=null) {
					tf_1.setText(list.getSelectedItem());
					temp1 = disponibles.retornarElemento(list.getSelectedIndex()) ;
					System.out.println("Temp 1 = "+temp1.getNombreElemento());
				}
					
			}
		});
		get_1.setBounds(146, 76, 89, 23);
		contentPane.add(get_1);
		
		JButton get_2 = new JButton("Get 2");
		get_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedItem()!=null)
					tf_2.setText(list.getSelectedItem());
					temp2 = disponibles.retornarElemento(list.getSelectedIndex()) ;
					System.out.println("Temp 2 = "+temp2.getNombreElemento());
			}
		});
		get_2.setBounds(146, 165, 89, 23);
		contentPane.add(get_2);
		
		JButton combinar = new JButton("Combinar");
		combinar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temp1 != null && temp2 != null) {
					String codigoCombinado = temp1.combinarAlfabeticamenteCon(temp2);
					if(listaTotal.codigoExistente(codigoCombinado)) {
						Elemento nuevo = listaTotal.retornarElemento(codigoCombinado);
						System.out.println("Exito");
						if(!disponibles.elementoYaDisponible(nuevo))						{
							disponibles.agregarADisponible(listaTotal.retornarElemento(temp1.combinarAlfabeticamenteCon(temp2)));
							imagen.setText("Desbloqueaste "+nuevo.getNombreElemento());
							///Actualizar lista
							list.removeAll();
							for(Elemento elem : disponibles.retornarColeccion()) {
								list.add(elem.getNombreElemento());
							}
						}
						else
							imagen.setText(""+nuevo.getNombreElemento()+" ya desbloqueado");
					}
				}
			}
		});
		combinar.setBounds(307, 228, 89, 23);
		contentPane.add(combinar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(InterfazGrafica.class.getResource("/ideaDeMesas/index2.jpg")));
		lblNewLabel.setBounds(66, -8, 504, 273);
		contentPane.add(lblNewLabel);
		

	}
}
*/