import java.io.IOException;
import java.util.ArrayList;
/*
 * Colección que se encarga de la Lista de los profesores
 */
public class ColeccionProfesor {
	private ArrayList <Profesor> listaProfesores;
	
	public ColeccionProfesor () {
		this.listaProfesores= new ArrayList();
	}
	
	public boolean agregarProfesor(Profesor p) {
		for (Profesor profe : listaProfesores) {
			if (p.getrut()==profe.getrut()) {
				return false;
			}
		}
		listaProfesores.add(p);
		return true;
	}
	
	public ArrayList<Profesor> obtenerProfesor() {
		return listaProfesores;
	}
	
	public Profesor obtenerProfesor(int rut) {
		for (Profesor profe : listaProfesores) {
			if (rut==profe.getrut()) {
				return profe;
			}
		}
		return null;
	}
	
	public void cargarCSV() throws IOException {
        CSV acceso = new CSV("Profesores");
        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
        	Profesor profe= new Profesor(0, null, null,null);
        	//System.out.println(acceso.get_csvField(linea,0));
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0: {
                    	profe.setrut(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 1: {
                    	profe.setnombre(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                    	profe.setcorreo(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                    	profe.setespecialidad(acceso.get_csvField(linea, i));
                        break;
                    }
                }
            }
            listaProfesores.add(profe);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
}
