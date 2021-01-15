package cl.extras.benefits;

import cl.extras.utility.RandomSales;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraComplejaTest {

    RandomSales randomSales;
    CalculadoraCompleja calculadoraCompleja;

    @BeforeEach
    void setUp() {
        randomSales = new RandomSales();
        calculadoraCompleja = new CalculadoraCompleja();
    }

    @Test
    void testNormalCases() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(300, 500, 700, 1600, 50, 244, 444, 123, 446, 2300));
        assertEquals(376, calculadoraCompleja.calcular(list));
    }

    @Test
    void testMoreCases() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(300, 500, 700, 1600, 50, 244, 444, 123, 446, 2300, 11, 23, 222));
        assertEquals(378, calculadoraCompleja.calcular(list));
    }

    @Test
    void testZeroCases() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0));
        assertEquals(0, calculadoraCompleja.calcular(list));
    }

    @Test
    void testNoCases() throws Exception {
        List<Integer> list = new ArrayList<>(Arrays.asList());
        assertEquals(0, calculadoraCompleja.calcular(list));
    }
}