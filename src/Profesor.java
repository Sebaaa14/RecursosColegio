/*
 * Clase Hija de Persona
 */
public class Profesor extends Persona {
	//Variables de instancia
	private String especialidad;
	//Constructor
	public Profesor (int rut,String nombre ,String correo, String especialidad){
		super(rut,nombre,correo);
		this.especialidad=especialidad;
	}
	
	//Setters y Getters
		public String getespecialidad() {
	        return especialidad;
	    }

	    public void setespecialidad(String especialidad) {
	        this.especialidad= especialidad;
	    }
	    
	  //Sobrecarga de metodo
	    @Override
	    public void identificarse() {
	    	System.out.println("IDENTIFICACION »» Profesor: " + getnombre()+ ", " + getrut() + ", " + getcorreo() +  ", " + getespecialidad() );
	    }
}
