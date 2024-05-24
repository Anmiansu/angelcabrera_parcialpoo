package biblioteca;

public class Biblioteca {
	  public static void main(String[] args) {
	        // Crear instancias de Alumno y Profesor
	        Alumno alumno1 = new Alumno(123456789, "Angel Cabrera", "Angel@example.com", "0972143563", 1001);
	        Profesor profesor1 = new Profesor(987654321, "Damian Susula", "Damian@example.com", "0982345896", "Programación");

	        // Crear instancias de Libro y RevistaCientifica
	        Libro libro1 = new Libro(101, "Liu XiCin", "El Bosque Oscuro", 2004, "Disponible", "NewRecord");
	        RevistaCientifica revista1 = new RevistaCientifica(201, "Angeline Smith", "Hidrógeno: Potencial de Energía", 2018, "Prestado", "Ciencia");

	        // Realizar préstamos
	        Prestamo prestamo1 = new Prestamo(libro1, alumno1, "2024-05-24", "2024-06-24");
	        Prestamo prestamo2 = new Prestamo(revista1, profesor1, "2024-05-24", "2024-06-24");

	        // Mostrar información de los préstamos
	        System.out.println("Prestamo 1:\n" + prestamo1 + "\n");
	        System.out.println("Prestamo 2:\n" + prestamo2);	
	  }
}