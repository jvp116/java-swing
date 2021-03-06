package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe responsável por representar a utilização do componente JPanel com abas
 * 
 * @author João Victor
 * @since 03/03/2021
 * @version 1.0
 */
public class Exemplo10 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando as labels auxiliares
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	// declarando os painéis
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	// declarando o componente para controle de abas
	private JTabbedPane painelAbas;
	// declarando o painel para organizar os componentes
	private JPanel painelPrincipal;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de Abas");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações da primeira JLabel
		 */
		lbAux1 = new JLabel();
		lbAux1.setText("Primeira aba");

		/*
		 * configurações da segunda JLabel
		 */
		lbAux2 = new JLabel();
		lbAux2.setText("Segunda aba");

		/*
		 * configurações da terceira JLabel
		 */
		lbAux3 = new JLabel();
		lbAux3.setText("Terceira aba");

		/*
		 * configurações da primeira aba
		 */
		aba1 = new JPanel();
		aba1.add(lbAux1);

		/*
		 * configurações da segunda aba
		 */
		aba2 = new JPanel();
		aba2.add(lbAux2);

		/*
		 * configurações da terceira aba
		 */
		aba3 = new JPanel();
		aba3.add(lbAux3);

		/*
		 * configurações do controlador de abas - componente JTabbedPane
		 */
		painelAbas = new JTabbedPane();
		// adicionar as abas(painéis) com o título
		painelAbas.add("Aba 1", aba1);
		painelAbas.add("Aba 2", aba2);
		painelAbas.add("Aba 3", aba3);
		// configurar a posição e tamanho
		painelAbas.setBounds(14, 21, 342, 200);
		/*
		 * configurações do painel principal da tela
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo10().iniciaGui();
	}

} // fim da classe