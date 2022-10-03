import java.io.IOException;
/*
 * Colección que se encarga de el HashMap de los Cursos
 */
import java.util.HashMap;

public class MapaCurso {
	private HashMap<Integer,Curso> mapaCursos;
	
	public MapaCurso() {
		this.mapaCursos=new HashMap();
	}
	
	public void agregarAlCurso(int key, Curso value) {
		mapaCursos.put(key,value);
	}
	
	public String obtenerCurso(int key) {
		Curso mapaBuscado= mapaCursos.get(key);
		//System.out.println(mapaBuscado.toString());
		if (mapaBuscado!=null){
			System.out.println(mapaBuscado.toString());
			return (mapaBuscado.toString());
		}
		return null;
	}
	
	public String obtenerCurso(){
		int i=1;
		while (i <= mapaCursos.size()) {
		Curso mapaBuscado= mapaCursos.get(i); i++;
		if (mapaBuscado!=null){
			System.out.println(mapaBuscado.toString());
			}
		}
		return null;
	}
	
	public boolean contieneClave(int key) {
		return mapaCursos.containsKey(key);
	}
	
	public void cargarCSV() throws IOException {
        CSV acceso = new CSV("Cursos");
        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
        	Curso cursinho = new Curso(null,0,null,null);
        	//System.out.println(acceso.get_csvField(linea,0));
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0: {
                    	cursinho.setnombreProfesor(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 1: {
                    	cursinho.setidCurso(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 2: {
                    	cursinho.setasignaturas(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                    	cursinho.setrecursosDigitales(acceso.get_csvField(linea, i));
                        break;
                    }
                }
            }
            mapaCursos.put(cursinho.getidCurso(),cursinho);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
	
}
