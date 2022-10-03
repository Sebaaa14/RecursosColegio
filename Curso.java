//	-Registro de alumnos, profesores, asignaturas y recursos digitales para cada curso(tipo aula virtual)
public class Curso {
	//Variables de instancia
	private String nombreProfesor;
	private int idCurso;
	private String asignaturas;
	private String recursosDigitales;
	
	//Constructor
	public Curso (String nombreProfesor, int idCurso, String asignaturas, String recursosDigitales){
		this.nombreProfesor=nombreProfesor;
		this.idCurso=idCurso;
		this.asignaturas=asignaturas;
		this.recursosDigitales=recursosDigitales;
	}
	
	//Setters y Getters
	public String getnombreProfesor() {
        return nombreProfesor;
    }

    public void setnombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getidCurso() {
        return idCurso;
    }

    public void setidCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getasignaturas() {
        return asignaturas;
    }

    public void setasignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getrecursosDigitales() {
        return recursosDigitales;
    }

    public void setrecursosDigitales(String recursosDigitales) {
        this.recursosDigitales = recursosDigitales;
    }
    
    // Methods
  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso ").append(idCurso); sb.append(" » ");
        sb.append("Profesor : ").append(nombreProfesor);
        sb.append(" || IdCurso : ").append(idCurso);
        sb.append(" || Asignaturas : ").append(asignaturas);
        sb.append(" || Recursos Digitales : ").append(recursosDigitales);
        return sb.toString();
    }
}

