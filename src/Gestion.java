import java.io.*;



public class Gestion {
	private MapaCurso mapaCursos = new MapaCurso();
	private ArrayListAlumno alumnos = new ArrayListAlumno();
	private ColeccionProfesor profesores = new ColeccionProfesor();
	private static Ventana1 vnt = new Ventana1();
	private static Ventana2 vnt2;
	private static Gestion instancia = null;
	//tengo que hacer un menu con opciones en la ventana
	private Gestion() {
	}
	public static Gestion getInstancia() {
		if(instancia==null) {
			instancia = new Gestion();
		}
		return instancia;
	}
	public static void mostrarVentana1() {
		vnt.setVisible(true);
	}
	public static void ocultarVentana1() {
		vnt.setVisible(false);
	}
	public static void mostrarVentana2(int tipo) {
		vnt2 = new Ventana2(tipo);
		vnt2.setVisible(true);
	}
	public static void ocultarVentana2() {
		vnt2.dispose();
	}
	public void cargarCursos() throws IOException {
		   mapaCursos.cargarCSV();
	}
	public void cargarAlumnos() throws IOException {
		   alumnos.cargarCSV();
	}
	public void cargarProfesores() throws IOException {
			profesores.cargarCSV();
	}
	public void agregarAlumno(Alumno al) {
		alumnos.agregarAlumno(al);
	}
	public void agregarProfesor(Profesor pr) {
		profesores.agregarProfesor(pr);
	}
	public void correrCodigo() throws NumberFormatException, IOException {
		//Inicializamos variables que utilizarems
		   boolean cicloMenu= true; int rut; String nombre; String correo; int rol; String especialidad;int key;int buscado;
		   BufferedReader lector = new BufferedReader (new InputStreamReader (System.in));	 
		   //Comenzamos con el menu
		   vnt.setVisible(true);
		   while (cicloMenu == true) {

			   System.out.println("(1)- Agregar Alumno");
			   System.out.println("(2)- Agregar Profesor");
			   System.out.println("(3)- Modificar Alumno");
			   System.out.println("(4)- Obtener todos los alumnos");
			   System.out.println("(5)- Obtener Alumno (Según su rut)");
			   System.out.println("(6)- Obtener curso (Según id)");
			   System.out.println("(7)- Obtener todos los cursos");
			   System.out.println("(8)- Obtener todos los profesores");
			   System.out.println("(9)- Obtener profesor (Según su rut)");
			   System.out.println("(10)- Eliminar Alumno (Según su rut)");
			   System.out.println("(11)- Mostrar Alumnos con rut mayor a 21 millones");
			   System.out.println("(12)- Salir");
			   int opcion = Integer.parseInt(lector.readLine());
			   
			   switch (opcion) {
			  
			   		//Agregar alumno
			   	case 1:
				   System.out.println("Ingrese el rut del alumno: "); rut=Integer.parseInt(lector.readLine()); 
				   System.out.println("Ingrese el nombre del alumno: "); nombre=lector.readLine();
				   System.out.println("Ingrese el correo del alumno: "); correo=lector.readLine();
				   System.out.println("Ingrese el rol del alumno: "); rol=Integer.parseInt(lector.readLine()); 
				   Alumno a = new Alumno (rut,nombre,correo,rol);
				   a.identificarse();
				   alumnos.agregarAlumno(a);
				   break;
				   
				 //Agregar profesor
			   	case 2:
				   System.out.println("Ingrese el rut del profesor: "); rut=Integer.parseInt(lector.readLine()); 
				   System.out.println("Ingrese el nombre del profesor: "); nombre=lector.readLine();
				   System.out.println("Ingrese el correo del profesor: "); correo=lector.readLine();
				   System.out.println("Ingrese la especialidad del alumno: "); especialidad=(lector.readLine()); 
				   Profesor f = new Profesor (rut,nombre,correo,especialidad);
				   f.identificarse();
				   profesores.agregarProfesor(f);
				   break;
				   
				   
				 //Modificar alumno 
				 case 3:  
					 System.out.println("Ingrese el rut del alumno a modificar");
					 buscado=Integer.parseInt(lector.readLine());;
					   if (alumnos.obtenerAlumno(buscado)!=null) {
						   System.out.println("Rut nuevo: ");rut=Integer.parseInt(lector.readLine()); 
						   System.out.println("Nombre nuevo: ");nombre=lector.readLine();
						   System.out.println("Correo nuevo: ");correo=lector.readLine();
						   System.out.println("Rol nuevo: ");rol=Integer.parseInt(lector.readLine()); 
						   alumnos.obtenerAlumno(buscado).setrut(rut);
						   alumnos.obtenerAlumno(rut).setnombre(nombre);
						   alumnos.obtenerAlumno(rut).setcorreo(correo);
						   alumnos.obtenerAlumno(rut).setrol(rol);
					   }
					   else System.out.println("Alumno no existe para modificar");
					   
					   break;
					   
				   
				   //Obtener alumnos   
			   	case 4 :
			   	   for (Alumno alum : alumnos.obtenerAlumno()) {
					   System.out.println("Alumno: " + alum.getnombre()+ ", " + alum.getrut() + ", " +alum.getcorreo() +  ", " + alum.getrol() );
				   }
				   break;
				   
				   //Obtener alumno según rut   
			   	case 5 :   
			   	   System.out.println("Ingrese el rut del alumno a buscar: "); rut=Integer.parseInt(lector.readLine());
			   	   alumnos.obtenerAlumno(rut);
				   System.out.println("Alumno: " + alumnos.obtenerAlumno(rut).getnombre() + ", " + alumnos.obtenerAlumno(rut).getrut() + ", " 
			   	   + alumnos.obtenerAlumno(rut).getcorreo() + ", "+ alumnos.obtenerAlumno(rut).getrol());
				   break;
			   
				   //Obtener curso según su clave
			   	case 6:
				    System.out.println("Ingrese la clave del curso");
				    key=Integer.parseInt(lector.readLine());
				    mapaCursos.obtenerCurso(key);
				    break;
				    
				    //Obtener todos los cursos
			   	case 7: 
			   		mapaCursos.obtenerCurso();
				    break;
				    
				    //Obtener todos los profesores   
			   	case 8 :
			   	   for (Profesor profe : profesores.obtenerProfesor()) {
					   System.out.println("Profesor: " + profe.getnombre()+ ", " + profe.getrut() + ", " +profe.getcorreo() + ", "+ profe.getespecialidad());
				   }
				   break;  
				   
				   //Obtener profesor según su rut 
			   	case 9 :
			   		
			   	   System.out.println("Ingrese el rut del profesor a buscar: "); rut=Integer.parseInt(lector.readLine());
			   	   profesores.obtenerProfesor(rut).identificarse();;
				   break;
				   
				   //Eliminar Alumno
			   	case 10:
			   	 System.out.println("Ingrese el rut del alumno a borrar");
				 buscado=Integer.parseInt(lector.readLine());;
				 alumnos.eliminarAlumno(buscado);
				   
				   break;
			   		
				   //Mostrar Alumnos rut mayor a 21.000.000
				case 11 : 
				 for (Alumno alum : alumnos.obtenerAlumno()) {
					 if (alum.getrut()>=210000000)
					 System.out.println("Alumno: " + alum.getnombre()+ ", " + alum.getrut() + ", " +alum.getcorreo() +  ", " + alum.getrol() );
					 }
			     break;
					   
			   case 12 :
				  cicloMenu = false;
	
		   }

	   }
		   //Crear archivo txt
		   System.out.println("Generando archivo txt...");
		   try {
	            String ruta = "./RecursosDelAula.txt";
	            String contenido = "Falto mandar al txt toda la informacion :CCC";
	            File file = new File(ruta);
	            // Si el archivo no existe es creado
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.write(contenido);
	            bw.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		   System.exit(0);
	}
}
