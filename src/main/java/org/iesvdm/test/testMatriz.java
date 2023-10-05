package org.iesvdm.test;

import org.iesvdm.clases.Matriz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testMatriz {
    @Test
    public void testMatriz() {
        Matriz<Integer> matriz = new Matriz<>(3, 3);
        matriz.set(0, 0, 1);
        matriz.set(0, 1, 2);
        matriz.set(0, 2, 3);
        matriz.set(1, 0, 4);
        matriz.set(1, 1, 5);
        matriz.set(1, 2, 6);
        matriz.set(2, 0, 7);
        matriz.set(2, 1, 8);
        matriz.set(2, 2, 9);

        assertEquals(Integer.valueOf(1), matriz.get(0, 0));
        assertEquals(Integer.valueOf(2), matriz.get(0, 1));
        assertEquals(Integer.valueOf(3), matriz.get(0, 2));
        assertEquals(Integer.valueOf(4), matriz.get(1, 0));
        assertEquals(Integer.valueOf(5), matriz.get(1, 1));
        assertEquals(Integer.valueOf(6), matriz.get(1, 2));
        assertEquals(Integer.valueOf(7), matriz.get(2, 0));
        assertEquals(Integer.valueOf(8), matriz.get(2, 1));
        assertEquals(Integer.valueOf(9), matriz.get(2, 2));

        assertEquals(matriz.filas(),3);
        assertEquals(matriz.columnas(),3);

        String expected = "1 2 3 \n4 5 6 \n7 8 9 \n";
        assertEquals(matriz.toString(),expected);
    }
}
