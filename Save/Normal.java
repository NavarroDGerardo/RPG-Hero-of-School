public class Normal extends Alumno{

	public Normal(int promedio, int defensa, int ataque, int xP, String nombre){
		super(promedio, ataque, defensa, xP, nombre);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()- getAtaque());
	}

	public void printAction(){
		System.out.println("Un nuevo alumno Normal ha sido creado");
	}
}