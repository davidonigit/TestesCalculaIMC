import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import br.ufrn.imd.modelo.Mulher;
import br.ufrn.imd.modelo.Pessoa;

public class MulherTestLimite {
	@ParameterizedTest
	@CsvSource({
		"48.38, 1.60, IMC = 18.90 - Abaixo do peso ideal",
		"48.64, 1.60, IMC = 19.00 - Abaixo do peso ideal",
		"48.89, 1.60, IMC = 19.10 - Peso ideal",
		"65.79, 1.60, IMC = 25.70 - Peso ideal",
		"66.04, 1.60, IMC = 25.80 - Peso ideal",
		"66.30, 1.60, IMC = 25.90 - Acima do peso ideal"
	})
	
	public void limitesIMC(double peso, double altura, String esperado) {
		Pessoa m = new Mulher();
		m.setPeso(peso);
		m.setAltura(altura);
		assertEquals(esperado, m.calculaIMC());
	}
}
