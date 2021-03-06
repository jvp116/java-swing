package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe responsável por demonstrar a utilização de janela (JFrame), botões,
 * rótulo e campo de texto
 * 
 * @author João Victor
 * @since 01/03/2021
 */
public class Exemplo02 {

	// responsável por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * definindo a tela e suas configurações
		 */
		JFrame janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de campo de texto");
		// configurando o tamanho da tela
		janela.setSize(300, 200);
		// definir o layout como nulo da janela
		janela.getContentPane().setLayout(null);
		// configurando a centralização do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * definindo o rótulo e suas configurações JLabel
		 */
		JLabel lbNome = new JLabel();
		// configurando um texto a ser exibido na Label
		lbNome.setText("Nome:");
		// configurando o tamanho e local da label
		// primeiro argumento - posição x - do ponto zero para a direita
		// segundo argumento - posição y - do ponto zero para a baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * definindo o campo de texto (digitação para o usuário)
		 */
		JTextField tfNome = new JTextField();
		// configurando o tamanho e local do campo de texto
		tfNome.setBounds(60, 10, 150, 20);

		/*
		 * definindo o botão e suas configurações
		 */
		JButton botao = new JButton();
		// configurando o título do botão
		botao.setText("Clique aqui");
		// configurando o tamanho e local do botão
		botao.setBounds(10, 60, 100, 20);

		/*
		 * adicionando os componentes na tela
		 */
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);

		/*
		 * configurando a visibilidade da tela
		 */
		janela.setVisible(true);

	} // fim do método

	/*
	 * 
	 */
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}

} // fim da classe