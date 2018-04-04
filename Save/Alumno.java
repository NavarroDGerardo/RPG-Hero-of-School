public abstract class Alumno extends Mob{
	
	private int xP;

	public Alumno(int promedio, int defensa, int ataque){
		super(promedio, ataque, defensa);
	}

	public void setXP(int XP){
		this.xP=xP;
	}

	public int getXP(){
		return xP;
	}

	/*public void printXP(){
		System.out.println("XP: "+xP);
	}*/

	public abstract void atacar(Mob mob);

	public void printAction(){
		System.out.println("Un nuevo alumno ha sido creado");
	}
}