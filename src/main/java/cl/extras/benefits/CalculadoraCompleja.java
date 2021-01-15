package cl.extras.benefits;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraBeneficios {

    @Override
    public Integer calcular(List<Integer> ventas) {
        int totalVenta = 0;
        int bono = 0;

        for (int i = 0; i < ventas.size(); i++) {
            int venta = ventas.get(i);
            totalVenta += venta;

            if (venta > 1000) {
                bono += venta * 0.05f;
            } else if (venta > 500 && venta < 1000) {
                bono += venta * 0.02f;
            }
        }

        if (totalVenta > 5000) bono += 100;

        return (int) (totalVenta * 0.01f) + bono;
    }
}
