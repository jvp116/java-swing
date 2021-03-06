package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe responsável por demonstrar a utilização do componente JComboBox
 * 
 * @author João Victor
 * @since 02/03/2021
 */
public class Exemplo06 {

	// declarando os atributos da tela
	private JFrame janela;
	private JComboBox cbxEstados;
	private JPanel painel;

	// vetor auxiliar para armazenar os estados
	private String estados[] = { "São Paulo", "Paraná", "Santa Catarina", "Rio Grande do Sul" };

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() { // início do método

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de Combo Box");
		// configurando o tamanho da tela
		janela.setSize(390, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(10, 10, 300, 20);

		/*
		 * configurações do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo06().iniciaGui();
	}

} // fim da classe