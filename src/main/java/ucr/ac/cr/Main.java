package ucr.ac.cr;

import java.util.List;
import java.util.Comparator;

public class ShellSort<T> {

    // Método para ordenar una lista utilizando el algoritmo Shell Sort
    public void shellSort(List<T> lista, Comparator<T> comparator) {
        int salto, i; // Variables para controlar el tamaño de los saltos y las iteraciones
        T aux; //para intercambiar elementos
        boolean cambios; // Variable para controlar si se realizan cambios en la lista
        int cont = lista.size(); //longitud

        // reduce el tamaño de los saltos a la mitad en cada iteración
        for (salto = cont / 2; salto != 0; salto /= 2) {
            cambios = true; // Inicializar cambios como verdadero al inicio de cada iteración
            //  mientras haya cambios en la lista
            while (cambios) {
                cambios = false; // Inicializar cambios como falso al inicio de cada iteración
                // Bucle que recorre la lista y realiza comparaciones entre elementos
                for (i = salto; i < cont; i++) {
                    // Si el elemento en la posición actual es mayor que el elemento en la posición actual - salto,
                    // se intercambian los elementos y se marca cambios como verdadero
                    if (comparator.compare(lista.get(i - salto), lista.get(i)) < 0) {
                        aux = lista.get(i); // Almacenar el elemento en la posición actual en la variable auxiliar
                        lista.set(i, lista.get(i - salto)); // Establecer el elemento en la posición actual - salto en la posición actual
                        lista.set(i - salto, aux); // Establecer el elemento almacenado en la variable auxiliar en la posición actual - salto
                        cambios = true; // Marcar cambios como verdadero
                    }
                }
            }
        }
    }
}
