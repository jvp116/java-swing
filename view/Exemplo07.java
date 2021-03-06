package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe responsável por demonstrar a utilização de campo de senha
 * 
 * @author João Victor
 * @since 02/03/2021
 */
public class Exemplo07 {

	// declarando os atributos da tela
	private JFrame janela;
	// label para exibir rótulo Senha na tela
	private JLabel lbSenha;
	// campo para digitar a senha e não exibir o conteúdo
	private JPasswordField pfSenha;
	// painel para organização dos componentes
	private JPanel painel;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de PasswordField");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(300, 150);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do JLabel
		 */
		lbSenha = new JLabel();
		// configurando tezto inicial
		lbSenha.setText("Senha");
		// configurando a posição e tmaanho do componente
		lbSenha.setBounds(10, 40, 40, 20);

		/*
		 * configurações do JPasswordField
		 */
		pfSenha = new JPasswordField();
		// configurando a posiçã e tamanho
		pfSenha.setBounds(60, 40, 200, 20);

		/*
		 * configurações do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbSenha);
		painel.add(pfSenha);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo07().iniciaGui();
	}
} // fim da classe