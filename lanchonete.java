import javax.swing.JOptionPane;

import java.io.IOException;
import java.text.NumberFormat;

public class lanchonete {

	public static void main(String[] args) throws IOException {

		Object[] lanches = { "Cachorro-Quente", "Hamburguer", "Pizza", "Tacos" };
		Object[] opcoes = { "Sim", "Não" };

		int carrinho = 0;
		String qntd;
		double preco;
		double precoDolar = 0;
		double cotacaoDolar = 0;
		int combo;

		
		cotacaoDolar = Double.valueOf(DolarAtual.getURLData("https://economia.awesomeapi.com.br/all/USD-BRL")); 
		
		NumberFormat nf = NumberFormat.getInstance();
		

		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);

		JOptionPane.showMessageDialog(null, "Bem-Vindo a lanchonete do Arthur.");

		JOptionPane.showMessageDialog(null,
				"Cardapio:\n" + "0 - R$ 5,90 - Cachorro-Quente\n" + "1 - R$ 9,90 - Hamburguer\n"
						+ "2 - R$ 5,50 - Pizza(Fatia)\n"
						+ "3 - R$ 4,00 - Tacos\n4 - R$ 10,00 - Combo (Fritas + Coca-Cola)");

		int pedido_l = JOptionPane.showOptionDialog(null, "Escolha seu lanche:", "Pedido:", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, lanches, lanches[2]);
		if (pedido_l == 0) {

			Integer.parseInt(qntd = JOptionPane.showInputDialog("Quantos 'cachorro-quente' voce deseja? "));
			JOptionPane.showMessageDialog(null, "Voce adicionou " + qntd + "x 'Cachorro-Quente' ao seu carrinho.");

			combo = JOptionPane.showOptionDialog(null, "Deseja adionar um combo Batata + Coca-Cola?", "Pedido:",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (combo == 0) {
				preco = (Integer.parseInt(qntd) * 5.9) + (Integer.parseInt(qntd) * 10);
				carrinho = Integer.parseInt(qntd) * 1 + 1;
				precoDolar = preco / cotacaoDolar;

			} else {
				preco = Integer.parseInt(qntd) * 5.9;
				carrinho = Integer.parseInt(qntd) * 1;
				precoDolar = preco / cotacaoDolar;
			}
			JOptionPane.showMessageDialog(null,
					"Total de Itens: " + carrinho + "\nTotal a pagar: R$ " + nf.format(preco) + "\nValor em Dolar [R$"+nf.format(cotacaoDolar)+"]: $ " 
							+ nf.format(precoDolar));
		} else if (pedido_l == 1) {

			Integer.parseInt(qntd = JOptionPane.showInputDialog("Quantos 'Hamburgues' voce deseja? "));
			JOptionPane.showMessageDialog(null, "Voce adicionou " + qntd + "x 'Hamburguer' ao seu carrinho.");

			combo = JOptionPane.showOptionDialog(null, "Deseja adionar um combo Batata + Coca-Cola?", "Pedido:",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (combo == 0) {
				preco = (Integer.parseInt(qntd) * 9.9) + (Integer.parseInt(qntd) * 10);
				carrinho = Integer.parseInt(qntd) * 1 + 1;
				precoDolar = preco / cotacaoDolar;

			} else {
				preco = Integer.parseInt(qntd) * 9.9;
				carrinho = Integer.parseInt(qntd) * 1;
				precoDolar = preco / cotacaoDolar;
				
				
			}
			JOptionPane.showMessageDialog(null,
					"Total de Itens: " + carrinho + "\nTotal a pagar: R$ " + nf.format(preco) + "\nValor em Dolar [R$"+nf.format(cotacaoDolar)+"]: $ " 
			+ nf.format(precoDolar));

		} else if (pedido_l == 2) {

			Integer.parseInt(qntd = JOptionPane.showInputDialog("Quantos 'Fatias de Pizza' voce deseja? "));
			JOptionPane.showMessageDialog(null, "Voce adicionou " + qntd + "x 'Pizza' ao seu carrinho.");

			combo = JOptionPane.showOptionDialog(null, "Deseja adionar um combo Batata + Coca-Cola?", "Pedido:",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (combo == 0) {
				preco = (Integer.parseInt(qntd) * 5.5) + (Integer.parseInt(qntd) * 10);
				carrinho = Integer.parseInt(qntd) * 1 + 1;
				precoDolar = preco / cotacaoDolar;

			} else {
				preco = Integer.parseInt(qntd) * 5.5;
				carrinho = Integer.parseInt(qntd) * 1;
				precoDolar = preco / cotacaoDolar;
			}
			JOptionPane.showMessageDialog(null,
					"Total de Itens: " + carrinho + "\nTotal a pagar: R$ " + nf.format(preco) + "\nValor em Dolar [R$"+nf.format(cotacaoDolar)+"]: $ " 
							+ nf.format(precoDolar));

		} else if (pedido_l == 3) {

			Integer.parseInt(qntd = JOptionPane.showInputDialog("Quantos 'Tacos' voce deseja? "));
			JOptionPane.showMessageDialog(null, "Voce adicionou " + qntd + "x 'Tacos' ao seu carrinho.");

			combo = JOptionPane.showOptionDialog(null, "Deseja adionar Coca-Cola?", "Pedido:",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
			if (combo == 0) {
				preco = (Integer.parseInt(qntd) * 4) + (Integer.parseInt(qntd) * 8);
				carrinho = Integer.parseInt(qntd) * 1 + 1;
				precoDolar = preco / cotacaoDolar;

			} else {
				preco = Integer.parseInt(qntd) * 4;
				precoDolar = preco / cotacaoDolar;
				carrinho = Integer.parseInt(qntd) * 1;
			}
			JOptionPane.showMessageDialog(null,
					"Total de Itens: " + carrinho + "\nTotal a pagar: R$ " + nf.format(preco) + "\nValor em Dolar [R$"+nf.format(cotacaoDolar)+"]: $ " 
							+ nf.format(precoDolar));

		} else {
			System.out.println("ERROR.");
		}

	}

}
