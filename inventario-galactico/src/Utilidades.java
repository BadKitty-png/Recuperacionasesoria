/**Autor: Jan Carlo Martinez
 * Misión 3: Las herramientas.
 * Métodos estáticos genéricos que funcionan con arreglos de cualquier tipo.
 */
public class Utilidades {

    // Cambia de lugar los elementos de las posiciones i y j
    public static <T> void intercambiar(T[] arr, int i, int j) {
        T temporal = arr[i];
        arr[i] = arr[j];
        arr[j] = temporal;
    }

	//T extra
    public static <T> int contar(T[] arr, T elemento) {
        int veces = 0;
        for (T actual : arr) {
            if (actual.equals(elemento)) {    // Cuenta cuántas veces aparece "elemento" dentro del mismo arreglo
                veces++;
            }
        }
        return veces;//Regresamos la fkain variable <3
    }

    
    public static <T extends Comparable<T>> T maximo(T[] arr) {
        T mayor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(mayor) > 0) {
                mayor = arr[i];
            }// Devuelve el elemento mayor mientra el tipo deba ser comparable
        }
        return mayor;//Regresamos varibale donde se almacena
    }
}