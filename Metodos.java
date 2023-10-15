package exercicioPOO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodos {

	public static void main(String[] args) {

		// Array dinãmico, sem um tamanho pré definido
		ArrayList<Integer> numerosInteiros = new ArrayList<>();

		// Variaveis do código
		int contagem = 0;

		int insereNumero = 0;

		do {

			try {

				// Entrada de dados
				insereNumero = Integer

						.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (contagem+1) + "° número"));

				if (insereNumero <= 0) {

					/* Mostra no prompt uma mensagem de erro com um ícone intuitivo e sai do loop */
					JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero ",

							null, JOptionPane.WARNING_MESSAGE);

					break;
				}

				else {

					contagem++;
					// Caso contrário adiciona o número no array dinâmico
					numerosInteiros.add(insereNumero);

				}

			} catch (NumberFormatException | NullPointerException erro) {

				/*
				 * Mostra no prompt uma mensagem caso seja inserido um valor não númerico , gera
				 * erro com um ícone intuitivo e sai do loop
				 */
				JOptionPane.showMessageDialog(null,

						"Dados não númericos foram inseridos ou o programa foi fechado incorretamente!!", null,

						JOptionPane.ERROR_MESSAGE);

				break;
			}

		} while (contagem <= 20);

		// Método sem retorno recebe o array preenchido com os valores inteiros como
		// argumento, o método é responsável por receber o array como argumento, ordenar
		// e inverter o array respectivamente
		PraticandoMetodos.ordenaVetor(numerosInteiros);
	}

}
