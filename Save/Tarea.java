public class Tarea extends Enemigo{

	public Tarea(int promedio, int defensa, int ataque){
		super(promedio, defensa, ataque);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getAtaque());
	}

	public void printAction(){
		System.out.println("Una nueva tarea ha aparecido");
	}
}