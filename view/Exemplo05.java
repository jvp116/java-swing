package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe responsável por demonstrar a utilização do componente JCheckBox
 * 
 * @author João Victor
 * @since 02/03/2021
 */
public class Exemplo05 {

	// declarando os componentes da tela
	private JFrame janela;
	// label auxiliar para exibir mensagem na tela
	private JLabel lbAuxiliar;
	// componente checkbox que permite a seleção de mais de uma opção
	private JCheckBox cbBoleto;
	private JCheckBox cbCartao;
	private JCheckBox cbCobranca;
	// botão auxiliar para retornar a escolha do usuário
	private JButton btVerificar;
	// painel para organizar os componentes
	private JPanel painel;

	/*
	 * método para configurações da tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de Check BOX");
		// configurando o tamanho da tela
		janela.setSize(390, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do JLabel
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto a ser exibido
		lbAuxiliar.setText("Selecione a forma de pagamento: ");
		// configurando a posição e tamanho do componente
		lbAuxiliar.setBounds(40, 15, 210, 20);

		/*
		 * configurações do JCheckBox
		 */
		cbBoleto = new JCheckBox();
		cbCartao = new JCheckBox();
		cbCobranca = new JCheckBox();
		// configurando o texto exibido no componente
		cbBoleto.setText("Boleto");
		cbCartao.setText("Cartão de Crédito");
		cbCobranca.setText("Cobrança Bancária");
		// configurando a posição e tamanho do componente
		cbBoleto.setBounds(45, 60, 145, 20);
		cbCartao.setBounds(45, 80, 145, 20);
		cbCobranca.setBounds(45, 100, 145, 20);

		/*
		 * configurações do JButton
		 */
		btVerificar = new JButton();
		// configurando o texto inicial
		btVerificar.setText("Verificar");
		// configurando a posição e tamanho do componente
		btVerificar.setBounds(145, 196, 120, 28);
		// configurando a ação do botão
		btVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaCheckBox();
			}
		});

		/*
		 * configurações do painel da janela - JPanel
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(cbBoleto);
		painel.add(cbCartao);
		painel.add(cbCobranca);
		painel.add(btVerificar);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método para verificar a seleção do componente JCheckBox
	 */
	private void verificaCheckBox() {
		// variável auxiliar para exibir as formas de pagamento
		String aux = "";

		// verificando boletos selecionados
		if (cbBoleto.isSelected()) {
			aux += cbBoleto.getText() + "\n";
		}
		// verificando cartão selecionado
		if (cbCartao.isSelected()) {
			aux += cbCartao.getText() + "\n";
		}
		// verificando cobrança selecionado
		if (cbCobranca.isSelected()) {
			aux += cbCobranca.getText() + "\n";
		}

		// exibindo o resultado para o usuário
		if (!aux.equals("")) {
			JOptionPane.showMessageDialog(null, aux, "Formas de Pagamento", 1);
		}
	}

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo05().iniciaGui();
	}

} // fim da classe