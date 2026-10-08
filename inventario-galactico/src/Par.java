/*Autor: Jan Carlo Mtz Mtz 
*Mision 1: El manifiest.
*
*Para edu bb<3
*
*/
package src;

public class Par<K, V> {
    private K clave;//Declaramos las fkain variableeeees
    private V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }//Inicializamos 

    public K getClave() {
        return clave;//Clase for obtener clave y regresar
    }

    public V getValor() {
        return valor;//Obtenemos regresamos valor
    }

    @Override //Retirnamos el string ya con lo previamente obtenido
    public String toString() {
        return "Par{clave=" + clave + ", valor=" + valor + "}";
    }
}