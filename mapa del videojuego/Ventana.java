import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame{

	private JPanel panelHistoria, panelMapa, panelBotones, panelStats;
	private JButton bFlechaArriba, bFlechaDerecha, bFlechaIzquierda, bFlechaAbajo;
	private JLabel lStats, lPromedio, lDefensa, lAtaque;
	/*private Mapa mapa;
	private Alumno alumno;*/

	public Ventana(){
		super("VideoGame");
		initComponents();
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,800);
		setVisible(true);
		
		/*mapa = new Mapa(25, 25);*/
		/*alumno = new Alumno();*/
	}

	public void initComponents(){
		panelHistoria = new JPanel();
		panelMapa = new JPanel();
		panelBotones = new JPanel();
		panelStats = new JPanel();

		panelBotones.setLayout(new GridLayout(4,1));
		panelStats.setLayout(new GridLayout(4,1));

		bFlechaAbajo = new JButton("|");
		bFlechaDerecha = new JButton("-->");
		bFlechaAbajo = new JButton("|");
		bFlechaIzquierda = new JButton("<--");

		lStats = new JLabel("Stats: ");
		lPromedio = new JLabel("Promedio: ");
		lDefensa = new JLabel("Defensa: ");
		lAtaque = new JLabel("Ataque: ");

		add(panelHistoria);

		add(panelMapa);

		panelBotones.add(bFlechaArriba);
		panelBotones. add(bFlechaDerecha);
		panelBotones.add(bFlechaAbajo);
		panelBotones.add(bFlechaIzquierda);
		add(panelBotones);


		panelStats.add(lStats);
		panelStats.add(lPromedio);
		panelStats.add(lDefensa);
		panelStats.add(lAtaque);
		add(panelStats);
	}
}