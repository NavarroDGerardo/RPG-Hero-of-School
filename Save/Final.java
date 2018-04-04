public class Final extends Enemigo{

	public Final(int promedio, int defensa, int ataque){
		super(promedio, defensa, ataque);
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

	public void printAction(){
		System.out.println("EXAMEN FINAL!!!!!!!!!!!!!!!!!!");
	}
}