public class Normal extends Alumno{
	
	public Normal(int promedio, int defensa, int ataque){
		super(promedio, ataque, defensa);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

	public void printAction(){
		System.out.println("Un nuevo alumno Normal ha sido creado");
	}
}