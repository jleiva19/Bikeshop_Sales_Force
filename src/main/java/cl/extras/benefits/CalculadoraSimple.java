package cl.extras.benefits;

import java.util.List;

public class CalculadoraSimple implements CalculadoraBeneficios {

    @Override
    public Integer calcular(List<Integer> ventas) {
        int total = ventas.stream().mapToInt(Integer::intValue).sum();
        return (int) (total * 0.03f);
    }
}
