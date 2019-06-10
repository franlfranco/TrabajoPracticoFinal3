package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.List;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraficaMain extends JFrame {

	///ELEMENTOS QUE UTILIZAMOS PARA PARTIDA
	private JPanel contentPane;
	private static JLabel resultado;
	private static HiloCronometro cronometro;
	private static JLabel timer;
	private static List list1;
	private static List list2;
	private static Partida partida;
	private static Mezcladora mezcladora;
	private static JLabel personajeObjetivo;
	private static JLabel cover;
	
	///GRAFICA
	public GraficaMain() {
		setResizable(false);
		setTitle("Trabajo practico laboratorio III");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPartida = new JMenu("Partida");
		menuBar.add(mnPartida);
		
		JMenuItem mntmNuevaPartida = new JMenuItem("Nueva Partida");
		mntmNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficaNuevaPartida nuevaPartida = new GraficaNuevaPartida();
				nuevaPartida.setVisible(true);
				if(nuevaPartida.getNombreJugador()!=null) {
					partida.setNombreJugador(nuevaPartida.getNombreJugador());
					System.out.println(partida.getNombreJugador());
					cover.setVisible(false);
					Thread cronometroSwin = new Thread(new CronometroInterfaz(cronometro,timer));
					cronometroSwin.start();
				}
			}
		});
		mnPartida.add(mntmNuevaPartida);
		
		JMenu mnTop = new JMenu("TOP");
		menuBar.add(mnTop);
		
		JMenu mnAcercaDe = new JMenu("?");
		menuBar.add(mnAcercaDe);
		
		JMenuItem mntmComoJugar = new JMenuItem("Como jugar?");
		mnAcercaDe.add(mntmComoJugar);
		
		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mnAcercaDe.add(mntmAcercaDe);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cover = new JLabel("");
		cover.setIcon(new ImageIcon(GraficaMain.class.getResource("/appInterfazGrafica/20190601_132522_0000.png")));
		cover.setBounds(0, 0, 694, 440);
		contentPane.add(cover);
		
		JLabel lblObjetivo = new JLabel("Objetivo: ");
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObjetivo.setBounds(10, 11, 56, 14);
		contentPane.add(lblObjetivo);
		
		personajeObjetivo = new JLabel();
		personajeObjetivo.setFont(new Font("Tahoma", Font.BOLD, 13));
		personajeObjetivo.setForeground(Color.RED);
		personajeObjetivo.setBounds(61, 11, 92, 14);
		contentPane.add(personajeObjetivo);
		
		list1 = new List();
		list1.setBounds(10, 283, 110, 137);
		for(Elemento e : partida.getColeccionDisponibles()) {
			list1.add(e.getNombreElemento());
		}
		contentPane.add(list1);
		
		list2 = new List();
		list2.setBounds(574, 283, 110, 137);
		for(Elemento e : partida.getColeccionDisponibles()) {
			list2.add(e.getNombreElemento());
		}
		contentPane.add(list2);
		
		timer = new JLabel("00 : 00 : 00");
		timer.setFont(new Font("Tahoma", Font.BOLD, 20));
		timer.setBounds(547, 11, 127, 32);
		contentPane.add(timer);
		
		JLabel iconFondoCronometro = new JLabel("");
		iconFondoCronometro.setIcon(new ImageIcon(GraficaMain.class.getResource("/appInterfazGrafica/fondo cronometro.png")));
		iconFondoCronometro.setBounds(540, 0, 130, 52);
		contentPane.add(iconFondoCronometro);
		
		JLabel lblElementoA = new JLabel("Elemento");
		lblElementoA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElementoA.setBounds(10, 136, 109, 24);
		contentPane.add(lblElementoA);
		
		JLabel label = new JLabel("Elemento");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(574, 136, 88, 24);
		contentPane.add(label);
		
		resultado = new JLabel("Resultado");
		resultado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		resultado.setBounds(209, 320, 306, 46);
		contentPane.add(resultado);
		
		JLabel elemento1 = new JLabel("Elemento 1");
		elemento1.setFont(new Font("Tahoma", Font.BOLD, 18));
		elemento1.setBounds(10, 225, 110, 52);
		contentPane.add(elemento1);
		
		JLabel elemento2 = new JLabel("Elemento 2");
		elemento2.setFont(new Font("Tahoma", Font.BOLD, 18));
		elemento2.setBounds(574, 225, 110, 52);
		contentPane.add(elemento2);
		
		JButton btnCombinar = new JButton("Combinar");
		btnCombinar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Elemento temp1 = null;
				if(list1.getSelectedIndex()!=-1)
				temp1 = partida.getElementoDeDisponibles(list1.getSelectedIndex());
				Elemento temp2 = null;
				if(list2.getSelectedIndex()!=-1)
				temp2 = partida.getElementoDeDisponibles(list2.getSelectedIndex());
				Elemento temp3 = null;
				if(temp1!=null && temp2!=null) {
					temp3=mezcladora.mezclar(temp1, temp2);
				}
				if(temp3 != null) {
					if(!partida.elementoYaDisponible(temp3)) {
						partida.agregarElementoDisponible(temp3);
						resultado.setText("Desbloqueaste a: "+temp3.getNombreElemento());
						actualizarListados();
					}else {
						resultado.setText("Elemento ya desbloqueado");
					}
				}else if(temp3 == null) {
					resultado.setText("Nada surge de la combinación");
				}
				
			}
		});
		btnCombinar.setBounds(286, 372, 89, 23);
		contentPane.add(btnCombinar);
		
		JLabel iconFondo = new JLabel("");
		iconFondo.setIcon(new ImageIcon(GraficaMain.class.getResource("/appInterfazGrafica/20190601_132522_0000.png")));
		iconFondo.setBounds(0, 0, 694, 440);
		contentPane.add(iconFondo);
	}
	
	
	///MAIN
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personaje objetivo = new Personaje("test","test","test");
					partida = new Partida(objetivo,"Probando");
					ListaDeElementos listaDeElementos= new ListaDeElementos();
					mezcladora = new Mezcladora(listaDeElementos);
					GraficaMain frame = new GraficaMain();
					frame.setVisible(true);
					//Thread cronometroSwin = new Thread(new CronometroInterfaz(cronometro,timer));
					//cronometroSwin.start();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	///ACTUALIZA LOS LISTADOS
	public static void actualizarListados() {
		list1.removeAll();
		list2.removeAll();
		for(Elemento e : partida.getColeccionDisponibles()) {
			list1.add(e.getNombreElemento());
			list2.add(e.getNombreElemento());
		}
	}
}
