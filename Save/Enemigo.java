public abstract class Enemigo extends Mob{

	public Enemigo(int promedio, int defensa, int ataque){
		super(promedio, ataque, defensa);
	}

	public abstract void atacar(Mob mob);

	public void printAction(){
		System.out.println("Un nuevo Enemigo ha aparecido");
	}
}