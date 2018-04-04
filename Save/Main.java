public class Main{
	public static void main(String args[]){
		Alumno n=new Normal(50, 660, 805);
		n.printAction();
		n.printStats();

		Alumno c=new Cheater(50, 78, 50);
		c.printAction();
		c.printStats();

		Alumno a=new Aplicado(50, 50, 50);
		a.printAction();
		a.printStats();

		Enemigo t=new Tarea(25,1,300);
		t.printAction();
		t.printStats();

		Enemigo p=new Parcial(50, 70, 90);
		p.printAction();
		p.printStats();

		Enemigo f=new Final(50, 60, 70);
		f.printAction();
		f.printStats();




	}
}