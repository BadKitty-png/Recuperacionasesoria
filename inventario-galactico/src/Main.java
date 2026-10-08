<<<<<<< HEAD
/**
 * Misión 4: El Despegue.
 * Integramos todas las funciones.
 *Autoria de Eduardo
 */
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Añadimos los datos para el arreglo de productos
        Par<String, Integer>[] productos = (Par<String, Integer>[]) new Par[4];
        productos[0] = new Par<>("Agua", 200);
        productos[1] = new Par<>("Combustible", 500);
        productos[2] = new Par<>("Alimentos", 350);
        productos[3] = new Par<>("Repuestos", 120);

        // Metemos solo las cantidades en una Caja y en un arreglo
        Caja<Integer> caja = new Caja<>(productos.length);
        Integer[] cantidades = new Integer[productos.length];
        for (int i = 0; i < productos.length; i++) {
            caja.agregar(productos[i].getValor());
            cantidades[i] = productos[i].getValor();
        }

        // Dos formas de sacar la mayor cantidad (ambas deben coincidir)
        Integer mayorCaja = caja.obtenerMayor();
        Integer mayorUtil = Utilidades.maximo(cantidades);

        // Buscamos qué producto tiene esa cantidad
        for (Par<String, Integer> p : productos) {
            if (p.getValor().equals(mayorCaja) && mayorCaja.equals(mayorUtil)) {
                System.out.println("Producto con mayor cantidad: " + p);
            }
        }
    }
}
=======
/**
 * Misión 4: El Despegue.
 * Integramos todas las funciones.
 *Autoria de Eduardo
 */
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Añadimos los datos para el arreglo de productos
        Par<String, Integer>[] productos = (Par<String, Integer>[]) new Par[4];
        productos[0] = new Par<>("Agua", 200);
        productos[1] = new Par<>("Combustible", 500);
        productos[2] = new Par<>("Alimentos", 350);
        productos[3] = new Par<>("Repuestos", 120);

        // Metemos solo las cantidades en una Caja y en un arreglo
        Caja<Integer> caja = new Caja<>(productos.length);
        Integer[] cantidades = new Integer[productos.length];
        for (int i = 0; i < productos.length; i++) {
            caja.agregar(productos[i].getValor());
            cantidades[i] = productos[i].getValor();
        }

        // Dos formas de sacar la mayor cantidad (ambas deben coincidir)
        Integer mayorCaja = caja.obtenerMayor();
        Integer mayorUtil = Utilidades.maximo(cantidades);

        // Buscamos qué producto tiene esa cantidad
        for (Par<String, Integer> p : productos) {
            if (p.getValor().equals(mayorCaja) && mayorCaja.equals(mayorUtil)) {
                System.out.println("Producto con mayor cantidad: " + p);
            }
        }
    }
}
>>>>>>> 69bcc113688a9c760741afe0bed27883f4f69e4d
