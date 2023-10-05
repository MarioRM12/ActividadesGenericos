package org.iesvdm.test;

import org.iesvdm.clases.PilaGenerica;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testPila {
    @Test
    public void testVacía() {

        //creamos la pila vacia
        PilaGenerica<Integer> pila = new PilaGenerica<>();

        //Comprobamos que esta vacía
        assertTrue(pila.estaVacia());

        //Añadimos un elemento para ver que da false al no estar vacio
        pila.aniadir(1);
        assertFalse(pila.estaVacia());
    }

    @Test
    public void testExtraer() {

        //Creamos la pila vacía
        PilaGenerica<Integer> pila = new PilaGenerica<>();

        //Comprobamos que esta vacía
        assertTrue(pila.estaVacia());

        //Añadimos un elemento a la pila;
        pila.aniadir(2);

        //Extraemos el elemento
        pila.extraer();

        //Comprobamos que esta vacía
        assertTrue(pila.estaVacia());

    }

    @Test
    public void testPrimero() {

        //Creamos la pila vacía
        PilaGenerica<Integer> pila = new PilaGenerica<>();

        //Añadimos varios elementos a la pila;
        pila.aniadir(2);
        pila.aniadir(3);
        pila.aniadir(1);
        pila.aniadir(3);

        //Comprobamos que el primero es el 2
        assertTrue(pila.primero().equals(2));

    }

    @Test
    public void testAniadir() {

        //Creamos la pila vacía
        PilaGenerica<Integer> pila = new PilaGenerica<>();

        //Añadimos numeros a la pila;
        pila.aniadir(2233);
        pila.aniadir(3);
        pila.aniadir(4);

        //Comprobamos que esta al menos el primero y que se ha añadido correctamente
        assertTrue(pila.primero().equals(2233));

    }

    @Test
    public void testToString() {

        //Creamos la pila vacía
        PilaGenerica<Integer> pila = new PilaGenerica<>();

        //Añadimos un elemento a la pila;
        pila.aniadir(2);
        pila.aniadir(23);

        //Comprobamos que esta vacía
        assertEquals("[2, 23]",pila.toString());

    }

}