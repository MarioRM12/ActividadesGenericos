package org.iesvdm.clases;

import java.util.LinkedList;

public class PilaGenerica<T> {

    public PilaGenerica() {}

    private LinkedList<T> lista = new LinkedList<>();

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return lista.isEmpty();
    }

    // Método para extraer y eliminar el primer elemento de la pila
    public T extraer() {
        if (!estaVacia()) {
            return lista.removeFirst();
        } else {
            throw new IllegalStateException("La pila está vacía");
        }
    }

    // Método para obtener el primer elemento de la pila sin eliminarlo
    public T primero() {
        if (!estaVacia()) {
            return lista.getFirst();
        } else {
            throw new IllegalStateException("La pila está vacía");
        }
    }

    // Método para añadir un objeto al final de la pila
    public void aniadir(T elemento) {
        lista.add(elemento);
    }

    // Método para convertir la pila a una cadena de texto
    @Override
    public String toString() {
        return lista.toString();
    }

}
