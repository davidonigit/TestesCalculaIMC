import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufrn.imd.modelo.Mulher;
import br.ufrn.imd.modelo.Pessoa;

public class MulherTest {
	
	@Test
	public void abaixoDoPesoTest() {
		Pessoa m = new Mulher();
		m.setPeso(50.2);
		m.setAltura(1.69);
		assertEquals("IMC = 17,58 - Abaixo do peso ideal", m.calculaIMC());
	}
	
	@Test
	public void pesoIdealTest() {
		Pessoa m = new Mulher();
		m.setPeso(70.2);
		m.setAltura(1.69);
		assertEquals("IMC = 24,58 - Peso ideal", m.calculaIMC());
	}
	
	@Test
	public void acimaDoPesoTest() {
		Pessoa m = new Mulher();
		m.setPeso(75.5);
		m.setAltura(1.64);
		assertEquals("IMC = 28,07 - Acima do peso ideal", m.calculaIMC());
	}
}
