public class Main{
	public static void main(String args[]){
		Alumno n=new Normal(2, 1, 1, 1, "Genos");
		n.printAction();
		n.printName();
		n.printStats();
		n.printXP();

		Enemigo t=new Tarea(1,3,1);
		t.printAction();
		t.printStats();
		n.printXP();

		while(n.getPromedio()>0 && t.getPromedio()>0){
			n.atacar(t);
			t.atacar(n);
			System.out.println(n.getNombre()+" a causado: "+n.getAtaque()+ " de danio al enemigo");
			System.out.println("la vida del enemigo es: "+t.getPromedio());
			System.out.println("");
			System.out.println("El Enemigo a causado: "+t.getAtaque()+ " de danio al Alumno");
			System.out.println("la vida del Alumno es: "+n.getPromedio());
			System.out.println("");
		}


	}
}