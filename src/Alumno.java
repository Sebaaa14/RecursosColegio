/*
 * Clase Hija de Persona
 */
public class Alumno extends Persona {
	//Variables de instancia
	private int rol;
	
	//Constructor
	public Alumno (int rut, String nombre, String correo, int rol) {
		super(rut,nombre,correo);
		this.rol=rol;
	}
	
	//Setters y Getters
	
    public int getrol() {
        return rol;
    }
	
    public void setrol(int rol) {
        this.rol = rol;
    }
    
  //Sobrecarga de metodo
    @Override
    public void identificarse() {
    	System.out.println("IDENTIFICACION »» Alumno: " + getnombre()+ ", " + getrut() + ", " + getcorreo() +  ", " + getrol() );
    }

}
