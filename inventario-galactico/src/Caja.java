/*Autor Juan Eduardo*/
package src;
public class Caja<T extends Comparable<T>> {
    private T[] elementos;
    private int cantidad;
	//se inicializan los elementos como tipo T
    @SuppressWarnings("unchecked")
    public Caja(int capacidad) {
        // T se "borra" a Comparable al compilar, por eso se crea así
        elementos = (T[]) new Comparable[capacidad];
        cantidad = 0;
    }
//se implementa el metodo de agregar donde la cantidad sera del tamaño del arreglo
    public void agregar(T elemento) {
        if (cantidad == elementos.length) {
            throw new IllegalStateException(
                "La caja está llena: capacidad máxima de " + elementos.length + " elementos.");
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }
//Se realiza la comparacion de valores y se obtiene el mayor
    public T obtenerMayor() {
        validarNoVacia();
        T mayor = elementos[0];
        for (int i = 1; i < cantidad; i++) {
            if (elementos[i].compareTo(mayor) > 0) {
                mayor = elementos[i];
            }
        }
        return mayor;
    }
//se realiza la operacion contraria donde aqui se obtiene el valor menor
    public T obtenerMenor() {
        validarNoVacia();
        T menor = elementos[0];
        for (int i = 1; i < cantidad; i++) {
            if (elementos[i].compareTo(menor) < 0) {
                menor = elementos[i];
            }
        }
        return menor;
    }

    private void validarNoVacia() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja está vacía: no hay elementos para comparar.");
        }
    }
}
