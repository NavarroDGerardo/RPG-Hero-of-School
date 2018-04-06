public class Aplicado extends Alumno{
	
	public Aplicado(int promedio, int defensa, int ataque, int xP, String nombre){
		super(promedio, ataque, defensa, xP, nombre);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

	public void printAction(){
		System.out.println("Un nuevo alumno aplicado ha sido creado");
	}
}