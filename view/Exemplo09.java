package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Classe responsável por demonstrar a utilização de painéis - JPanel
 * 
 * @author João Victor
 * @since 03/03/2021
 */
public class Exemplo09 {

	// declarando os atributos da tela
	private JFrame janela;
	// label auxiliar para demonstrar componentes dentro de painéis
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	private JLabel lbAux4;
	// painéis para organização dos componentes
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;
	// painel principal para armazenar os outros painéis
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
		janela.setTitle("Exemplo de JPanel");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(422, 246);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações da primeira JLabel
		 */
		lbAux1 = new JLabel();
		// configurando o texto incial
		lbAux1.setText("Painel 1");

		/*
		 * configurações da segunda JLabel
		 */
		lbAux2 = new JLabel();
		// configurando o texto incial
		lbAux2.setText("Painel 2");

		/*
		 * configurações da terceira JLabel
		 */
		lbAux3 = new JLabel();
		// configurando o texto incial
		lbAux3.setText("Painel 3");

		/*
		 * configurações da quarta JLabel
		 */
		lbAux4 = new JLabel();
		// configurando o texto incial
		lbAux4.setText("Painel 4");

		/*
		 * configurações do primeiro painel
		 */
		painel1 = new JPanel();
		// configurar posição e o tamanho
		painel1.setBounds(4, 6, 200, 100);
		// configurar o layout do painel
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// configurar a borda do painel
		painel1.setBorder(BorderFactory.createEtchedBorder());
		painel1.add(lbAux1);

		/*
		 * configurações do segundo painel
		 */
		painel2 = new JPanel();
		// configurar posição e o tamanho
		painel2.setBounds(208, 6, 200, 100);
		// configurar o layout do painel
		painel2.setLayout(new BorderLayout(0, 0));
		// configurar a borda do painel
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());
		painel2.add(lbAux2);

		/*
		 * configurações do terceiro painel
		 */
		painel3 = new JPanel();
		// configurar posição e o tamanho
		painel3.setBounds(3, 109, 200, 100);
		// configurar o layout do painel
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		// configurar a borda do painel
		painel3.setBorder(BorderFactory.createRaisedBevelBorder());
		painel3.add(lbAux3);

		/*
		 * configurações do quarto painel
		 */
		painel4 = new JPanel();
		// configurar posição e o tamanho
		painel4.setBounds(208, 110, 200, 100);
		// configurar o layout do painel
		painel4.setLayout(new GridLayout(1, 1, 0, 0));
		// configurar a borda do painel
		painel4.setBorder(new TitledBorder("Título"));
		painel4.add(lbAux4);

		/*
		 * configurações do painel principal da tela
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		// configurar o layout inicial
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painel1);
		painelPrincipal.add(painel2);
		painelPrincipal.add(painel3);
		painelPrincipal.add(painel4);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo09().iniciaGui();
	}

} // fim da classe