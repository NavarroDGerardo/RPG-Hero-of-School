public class Main{
	public static void main(String args[]){
		Alumno n=new Normal(5, 1, 2, 1, "Genos");
		n.printAction();
		n.printName();
		n.printStats();
		n.printXP();

		Inventario i=new Inventario();
		ItemDefensa cuaderno= new ItemDefensa(10);
		ItemDefensa carpeta= new ItemDefensa(20);
		ItemDefensa lonchera= new ItemDefensa(30);
		ItemDefensa mochila= new ItemDefensa(40);
		i.addItemDefensa(cuaderno, 0);
		i.addItemDefensa(carpeta, 1);
		i.addItemDefensa(lonchera, 2);
		i.addItemDefensa(mochila, 3);
		ItemArma lapiz= new ItemArma(10);
		ItemArma pluma= new ItemArma(20);
		ItemArma plumaFuente= new ItemArma(30);
		ItemArma plumon=new ItemArma(40);
		ItemArma regla= new ItemArma(50);
		i.addItemArma(lapiz, 1);
		i.addItemArma(pluma, 2);
		i.addItemArma(plumaFuente, 3);
		i.addItemArma(plumon, 4);
		i.addItemArma(regla, 5);
		

		Enemigo t=new Tarea(1,0,15);
		t.printAction();
		t.printStats();
		/*n.printXP();*/

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