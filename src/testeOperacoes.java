import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class testeOperacoes {

	@Test
	public void test() {
		
		calculadora Calculadora = new calculadora(); // cria uma calculadora (nao visivel)
		Random random = new Random(); //para gerar valores aleatórios pro teste
		
		//gera double aleatorios ate 10^6
		double num1 = ((double) random.nextInt(1000000))*(random.nextDouble());
		double num2 = ((double) random.nextInt(1000000))*(random.nextDouble());
		
		Calculadora.numero1.setText(Double.toString(num1)); //seta o valor do numero 1
		Calculadora.numero2.setText(Double.toString(num2)); //seta o valor do numero 2
		
		//Testando a operacao "somar"
		Calculadora.jButton1.doClick(100); //simula um click de 100ms no botao "somar"
		
		String valorteste = Calculadora.txtresultado.getText(); //anota o resultado da calculadora
		String valoresperado = String.valueOf(num1 + num2); //calcula o valor esperado
		
		assertEquals(valoresperado, valorteste);
		System.out.println("Teste soma:\nValor esperado = " + valoresperado + "\nValor teste = " + valorteste + "\n");
		//Termino do teste de "somar"
		
		
		//Testando operacao "subtrair"
		Calculadora.jButton2.doClick(100); //simula um click de 100ms no botao "subtrair"
		
		valorteste = Calculadora.txtresultado.getText(); //anota o resultado da calculadora
		valoresperado = String.valueOf(num1 - num2); //calcula o valor esperado
		
		assertEquals(valoresperado, valorteste); //checa se a calculadora funciona
		System.out.println("Teste subtração:\nValor esperado = " + valoresperado + "\nValor teste = " + valorteste + "\n");
		//Termino do teste de "subtrair"
		
		//Testando operacao "multiplicar"
			Calculadora.jButton3.doClick(100); //simula um click de 100ms no botao "multiplicar"
				
			valorteste = Calculadora.txtresultado.getText(); //anota o resultado da calculadora
			valoresperado = String.valueOf(num1*num2); //calcula o valor esperado
				
			assertEquals(valoresperado, valorteste); //checa se a calculadora funciona
			System.out.println("Teste multiplicação:\nValor esperado = " + valoresperado + "\nValor teste = " + valorteste + "\n");
		//Termino do teste de "multiplicar"
			
		//Testanto operacao "dividir"
		Calculadora.jButton4.doClick(100); //simula um click de 100ms no botao "dividir"
			
		valorteste = Calculadora.txtresultado.getText(); //anota o resultado da calculadora
		valoresperado = String.valueOf(num1/num2); //calcula o valor esperado
			
		assertEquals(valoresperado, valorteste); //checa se a calculadora funciona
		System.out.println("Teste divisão:\nValor esperado = " + valoresperado + "\nValor teste = " + valorteste + "\n");
		//Termino do teste de "dividir"
		
		
	}

}

