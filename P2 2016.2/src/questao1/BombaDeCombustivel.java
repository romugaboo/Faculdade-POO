package questao1;

import java.util.*;

public class BombaDeCombustivel {
	private static double qtdeCombustivelUtilizado;

	public void abastecerVeiculos(List x) {
		Iterator it = x.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof VeiculoAutomotor) {
				VeiculoAutomotor v = (VeiculoAutomotor) o;
				VeiculoAutomotor.completarTanque(v);
			}
		}
	}

	public double getQtdeCombustivelUtilizado() {
		return qtdeCombustivelUtilizado;
	}

	public void setQtdeCombustivelUtilizado(double qtdeCombustivelUtilizado) {
		this.qtdeCombustivelUtilizado = qtdeCombustivelUtilizado;
	}
}