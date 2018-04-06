public class Cheater extends Alumno{
	
	public Cheater(int promedio, int defensa, int ataque, int xP, String nombre){
		super(promedio, ataque, defensa, xP, nombre);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

	public void printAction(){
		System.out.println("Un nuevo alumno Cheater ha sido creado");
	}
}