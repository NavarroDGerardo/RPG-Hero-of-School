public class Cheater extends Alumno{
	
	public Cheater(int promedio, int defensa, int ataque){
		super(promedio, ataque, defensa);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

	public void printAction(){
		System.out.println("Un nuevo alumno Cheater ha sido creado");
	}
}