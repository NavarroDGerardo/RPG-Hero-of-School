public class Alumno{
	private String nombre;
	private int x;
	private int y;

	public Alumno(String nombre, int x, int y){
		this.nombre=nombre;
		this.x=x;
		this.y=y;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setX(int x){
		this.x=x;
	}

	public int getX(){
		return x;
	}

	public void setY(int y){
		this.y=y;
	}

	public int getY(){
		return y;
	}
}