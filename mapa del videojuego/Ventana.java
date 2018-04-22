import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ventana extends JFrame{

	private JPanel panelHistoria, panelMapa, panelBotones, panelStats, panelContenedorMapa;
	private JButton bFlechaArriba, bFlechaDerecha, bFlechaIzquierda, bFlechaAbajo;
	private JLabel lStats, lPromedio, lDefensa, lAtaque;
	private Mapa mapa;
	private Alumno alumno;

	public Ventana(){
		super("VideoGame");
		mapa= new Mapa(12,12);
		alumno= new Alumno();
		crearMapa();
		initComponents();
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,1000);
		setVisible(true);
	}

	public void initComponents(){
		panelContenedorMapa= new JPanel();
		panelContenedorMapa.setLayout(new FlowLayout());
		add(panelContenedorMapa);
		pintarMapa();

		panelHistoria= new JPanel();
		add(panelHistoria);

		panelBotones=new JPanel();
		panelBotones.setLayout(new GridLayout(2,2));

		bFlechaArriba= new JButton("Arriba");
		bFlechaArriba.addActionListener(new BotonArribaListener());
		panelBotones.add(bFlechaArriba);
		bFlechaDerecha= new JButton("Derecha");
		bFlechaDerecha.addActionListener(new BotonDerechaListener());
		panelBotones.add(bFlechaDerecha);
		bFlechaAbajo=new JButton("Abajo");
		bFlechaAbajo.addActionListener(new BotonAbajoListener());
		panelBotones.add(bFlechaAbajo);
		bFlechaIzquierda=new JButton("Izquierda");
		bFlechaIzquierda.addActionListener(new BotonIzquierdaListener());
		panelBotones.add(bFlechaIzquierda);

		add(panelBotones);

		panelStats=new JPanel();
		panelStats.setLayout(new GridLayout(4,1));
		
		lStats=new JLabel("Stats");
		panelStats.add(lStats);
		lPromedio=new JLabel("Promedio: ");
		panelStats.add(lPromedio);
		lAtaque=new JLabel("Ataque: ");
		panelStats.add(lAtaque);
		lDefensa=new JLabel("Defensa: ");
		panelStats.add(lDefensa);

		add(panelStats);
	}

	public void crearMapa(){
		for(int i=0;i<mapa.casillas.length;i++){
			for(int j=0;j<mapa.casillas[i].length;j++){
				mapa.casillas[i][j]= new Casilla();
			}
		}
		mapa.casillas[6][6].alumno=alumno;
		alumno.x=6;
		alumno.y=6;
	}

	public void pintarMapa(){
		panelMapa= new JPanel();
		panelMapa.setLayout(new GridLayout(mapa.casillas.length,mapa.casillas[0].length));
		for(int i=0;i<mapa.casillas.length;i++){
			for(int j=0;j<mapa.casillas[i].length;j++){
				if(mapa.casillas[i][j].alumno==null){
					panelMapa.add(new JLabel("*"));
				}else{
					panelMapa.add(new JLabel("Alumno"));
				}
			}
		}

		panelContenedorMapa.add(panelMapa);
		panelContenedorMapa.revalidate();
		panelContenedorMapa.repaint();
	}

	public class BotonArribaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(alumno.x>=1){
				mapa.casillas[alumno.x][alumno.y].alumno=null;
				alumno.x= alumno.x-1;

				mapa.casillas[alumno.x][alumno.y].alumno=alumno;
				panelContenedorMapa.remove(panelMapa);
				panelContenedorMapa.revalidate();
				panelContenedorMapa.repaint();
				pintarMapa();
			}else{
				System.out.println("Ya no se puede subir mas");
			}
		}
	}

	public class BotonIzquierdaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(alumno.y>=1){
				mapa.casillas[alumno.x][alumno.y].alumno=null;
				alumno.y= alumno.y-1;

				mapa.casillas[alumno.x][alumno.y].alumno=alumno;
				panelContenedorMapa.remove(panelMapa);
				panelContenedorMapa.revalidate();
				panelContenedorMapa.repaint();
				pintarMapa();
			}else{
				System.out.println("Ya no se puede ir mas para la Izquierda");
			}
		}
	}

	public class BotonAbajoListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(alumno.x<=10){
				mapa.casillas[alumno.x][alumno.y].alumno=null;
				alumno.x= alumno.x+1;

				mapa.casillas[alumno.x][alumno.y].alumno=alumno;
				panelContenedorMapa.remove(panelMapa);
				panelContenedorMapa.revalidate();
				panelContenedorMapa.repaint();
				pintarMapa();
			}else{
				System.out.println("Ya no se puede bajar mas");
			}
		}
	}

	public class BotonDerechaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(alumno.y<=10){
				mapa.casillas[alumno.x][alumno.y].alumno=null;
				alumno.y= alumno.y+1;

				mapa.casillas[alumno.x][alumno.y].alumno=alumno;
				panelContenedorMapa.remove(panelMapa);
				panelContenedorMapa.revalidate();
				panelContenedorMapa.repaint();
				pintarMapa();
			}else{
				System.out.println("Ya no se puede ir mas para la derecha");
			}
		}
	}

}