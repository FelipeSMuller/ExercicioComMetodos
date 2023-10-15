package exercicioPOO;

import java.util.ArrayList;
import java.util.Collections;

public class PraticandoMetodos {

	// Método que ordena uma coleção de valores

	public static void ordenaVetor(ArrayList<Integer> numeros) {

		// Ordena a lista
		Collections.sort(numeros);

		// Inverte a lista que foi ordenada anteriormente
		Collections.reverse(numeros);

		// itera sobre um array através de um loop
		for (int i = 0; i < numeros.size(); i++) {

			// Imprime no prompt os valores armazenados
			System.out.print(numeros.get(i) + "  ");
		}

	}
}
