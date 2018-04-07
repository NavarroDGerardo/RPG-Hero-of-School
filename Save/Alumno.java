public abstract class Alumno extends Mob{
	
	private int xP;
	public String nombre;

	public Alumno(int promedio, int defensa, int ataque, int xP, String nombre){
		super(promedio, ataque, defensa);
		this.xP=xP;
		this.nombre=nombre;
		
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setXP(int XP){
		this.xP=xP;
	}

	public int getXP(){
		return xP;
	}

	public abstract void atacar(Mob mob);

	public abstract void printAction();

	public void printName(){
		System.out.println("Su nombre es: " + nombre);
	}

	public void printXP(){
		System.out.println("xp: "+xP);
		System.out.println("");
	}
}