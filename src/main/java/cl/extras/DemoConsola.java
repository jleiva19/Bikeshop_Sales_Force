package cl.extras;

import cl.extras.benefits.CalculadoraBeneficios;
import cl.extras.benefits.CalculadoraCompleja;
import cl.extras.benefits.CalculadoraSimple;
import cl.extras.utility.RandomSales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoConsola {

    static CalculadoraBeneficios complexCalc = new CalculadoraCompleja();
    static CalculadoraBeneficios basicCalc = new CalculadoraSimple();
    static RandomSales randomSales = new RandomSales();

    public static void main(String[] args) {
        logPresentation();
        List<Integer> sales = pickValues();
        logSales(sales);
        logBasic(sales);
        logComplex(sales);
    }

    public static List<Integer> pickValues(){
        return randomSales.getSalesNumbers(10);
    }

    public static void logSales(List<Integer> sales)
    {
        System.out.println("Tomando 10 valores de ventas aleatorios...");
        System.out.println(sales);
        System.out.println();
    }

    public static void logBasic(List<Integer> sales){
        System.out.println("Beneficio con Algoritmo Simple: " + basicCalc.calcular(sales) + " US$");
    }

    public static void logComplex(List<Integer> sales){
        System.out.println("Beneficio con Algoritmo Complejo: " + complexCalc.calcular(sales) + " US$");
    }

    public static void logPresentation(){
        System.out.println("------------------------------------------------");
        System.out.println("Demostración Calculo Beneficios para Vendedores");
        System.out.println("------------------------------------------------");
    }
}

