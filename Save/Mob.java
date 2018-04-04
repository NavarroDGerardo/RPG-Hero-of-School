public abstract class Mob implements ActionMob{
	
	private int promedio;
	private int defensa;
	private int ataque;

	public Mob(int promedio, int defensa, int ataque){
		this.promedio=promedio;
		this.defensa=defensa;
		this.ataque=ataque;
	}

	public void setPromedio(int promedio){
		this.promedio=promedio;
	}

	public int getPromedio(){
			return promedio;
		}

	public void setDefensa(int defensa){
		this.defensa=defensa;
	}

	public int getDefensa(){
		return defensa;
	}

	public void setAtaque(int ataque){
		this.ataque=ataque;
	}
	
	public int getAtaque(){
		return ataque;
	}
	
	public void printStats(){
		System.out.println("Promedio: "+promedio);
		System.out.println("Defensa: "+defensa);
		System.out.println("Ataque: "+ataque);
		System.out.println("");
	}

	public void atacar(Mob mob){
		mob.setPromedio(mob.getPromedio()-mob.getDefensa());
	}

}