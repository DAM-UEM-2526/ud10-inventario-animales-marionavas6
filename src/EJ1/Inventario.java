package EJ1;

import java.util.ArrayList;

public class Inventario {
//Primero hago los atributos
	private ArrayList<Mascotas> listaMascotas=new ArrayList<>();

	// Ahora voy hacer el motodo vacio que es el qeu me pide
	public void vaciar() {
		listaMascotas.clear();
	}

	// Ahora voy hacer el metodo para meter animales
	public void insertarMascota(Mascotas a) {
		listaMascotas.add(a);
	}

	// Ahora voy hacer otro metodo para eliminar animales
	public void eliminarMascota(String nombrel) {
		listaMascotas.remove(nombrel);
	}

//Ahora voy hacer otro metodo para que imprima todos los animales
	public void imprimirTodos() {
		for (Mascotas mascotas : listaMascotas) {
			System.out.println(mascotas.getNombrel());

		}
	}

	// Ahora voy hacer otro metodo para que imprima el nombre de todos los perros
	public void imprimirPerros() {
		for (Mascotas m : listaMascotas) {
			if (m instanceof Perro) {
				System.out.println(m.getNombrel());
			}
		}

	}
}
