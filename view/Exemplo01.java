package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe responsável por demonstrar a utilização de janela (JFrame) e botão
 * (JButton)
 * 
 * @author João Victor
 * @since 01/03/2021
 */
public class Exemplo01 {

	// método para exibir uma janela swing com o componente botão
	public void iniciaGui() {// início do método

		// criando o componente JFrame = janela e adicionando seu título
		JFrame janela = new JFrame("Exemplo tela e botão");

		// criando o componente JButton = botão e adicionando o seu título
		JButton botao = new JButton("Clique aqui");

		// configurar o tamanho do objeto janela
		// primeiro parâmetro - largura da tela
		// segundo parâmetro - altura da tela
		janela.setSize(500, 300);

		// adicionando o botão no objeto janela (dentro do seu content pane)
		janela.getContentPane().add(botao);

		// configurando a visibilidade da tela
		janela.setVisible(true);

		// informando que a tela não tem layout pré-definido
		janela.getContentPane().setLayout(null);
	} // fim do método

	// método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}

} // fim da classe