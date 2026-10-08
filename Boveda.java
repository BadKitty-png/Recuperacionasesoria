/**
 * Boveda<T>: guarda objetos de tipo T y los entrega en orden inverso
 * al que entraron (el último que se guarda es el primero que sale).
 */
public interface Boveda<T> {

    /** Agrega un elemento a la bóveda. */
    void guardar(T elemento);

    /** Quita y devuelve el último elemento que se guardó. */
    T sacar();

    /** Indica si la bóveda no tiene ningún elemento. */
    boolean estaVacia();

    /** Devuelve cuántos elementos hay guardados en este momento. */
    int tamanio();
}
