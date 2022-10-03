
public class Persona {
	//Variables de instancia
	private int rut;
	private String nombre;
	private String correo;
	
	//Constructor
	public Persona (int rut, String nombre, String correo) {
		this.rut=rut;
		this.nombre=nombre;
		this.correo=correo;
	}

	//Setters y Getters
	public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre =nombre;
    }
    
    public int getrut() {
        return rut;
    }

    public void setrut(int rut) {
        this.rut = rut;
    }
    
    public String getcorreo() {
        return correo;
    }
	
    public void setcorreo(String correo) {
        this.correo = correo;
    }
    
    //Sobrecarga de metodo
    public void identificarse() {
    	System.out.println("IDENTIFICACION »» Alumno: " + getnombre()+ ", " + getrut() + ", " + getcorreo());
    }
  

    
}
