import java.io.IOException;
import java.util.ArrayList;
/*
 * Coleccion que se encarga de la lista relacionada a los alumnos
 */
public class ArrayListAlumno {
	private ArrayList <Alumno> listaAlumnos;
	
	public ArrayListAlumno () {
		this.listaAlumnos= new ArrayList();
	}
	
	public boolean agregarAlumno(Alumno a) {
		for (Alumno alum : listaAlumnos) {
			if (a.getrut()==alum.getrut()) {
				return false;
			}
		}
		listaAlumnos.add(a);
		return true;
	}
	
	public ArrayList<Alumno> obtenerAlumno() {
		return listaAlumnos;
	}
	
	public Alumno obtenerAlumno(int rut) {
		for (Alumno alum : listaAlumnos) {
			if (rut==alum.getrut()) {	
				return alum;
			}
		}
		return null;
	}
	
	public boolean eliminarAlumno(int rut) {
		for (Alumno alum : listaAlumnos) {
			if (rut==alum.getrut()) {
				listaAlumnos.remove(alum);
				return true;
			}
		}
		return false;
	}
	
	
	
	public void cargarCSV() throws IOException {
        CSV acceso = new CSV("Alumnos");
        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
        	Alumno alumnate = new Alumno(0, null, null,0);
        	//System.out.println(acceso.get_csvField(linea,0));
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0: {
                    	alumnate.setrut(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 1: {
                    	alumnate.setnombre(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                    	alumnate.setcorreo(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                    	alumnate.setrol(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                }
            }
            listaAlumnos.add(alumnate);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
	
	
	
}
