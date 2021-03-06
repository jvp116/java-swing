package view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/**
 * Classe responsável por representar a utilização do componente
 * JFormattedTextField
 * 
 * @author João Victor
 * @since 04/03/2021
 * @version 1.0
 */
public class Exemplo12 {

	// declarando os atributos da tela
	private JFrame janela;
	// labels auxiliares
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbTelefone;
	// declarando os campos formatados
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfDataNascimento;
	private JFormattedTextField tfTelefone;
	// declarando os atributos de formatação
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;
	// declarando o painel para organizar os componentes
	private JPanel painel;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() throws ParseException {

		/*
		 * configurações dos campos de formatação
		 */
		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ####-####");

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de Campos Formatados");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(400, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações da JLabel CPF
		 */
		lbCpf = new JLabel();
		lbCpf.setText("CPF:");
		// configurando a posição e tamanho
		lbCpf.setBounds(10, 10, 50, 20);

		/*
		 * configurações da JLabel RG
		 */
		lbRg = new JLabel();
		lbRg.setText("RG:");
		// configurando a posição e tamanho
		lbRg.setBounds(10, 40, 50, 20);

		/*
		 * configurações da JLabel Data de Nascimento
		 */
		lbDataNascimento = new JLabel();
		lbDataNascimento.setText("Data de Nascimento:");
		// configurando a posição e tamanho
		lbDataNascimento.setBounds(10, 70, 120, 20);

		/*
		 * configurações da JLabel Telefone
		 */
		lbTelefone = new JLabel();
		lbTelefone.setText("Telefone:");
		// configurando a posição e tamanho
		lbTelefone.setBounds(10, 100, 110, 20);

		/*
		 * configurações do JFormattedTextField Cpf
		 */
		tfCpf = new JFormattedTextField(fmtCpf);
		// configurando a posição e o tamanho
		tfCpf.setBounds(130, 10, 100, 20);

		/*
		 * configurações do JFormattedTextField Rg
		 */
		tfRg = new JFormattedTextField(fmtRg);
		// configurando a posição e o tamanho
		tfRg.setBounds(130, 40, 100, 20);

		/*
		 * configurações do JFormattedTextField Data de Nascimento
		 */
		tfDataNascimento = new JFormattedTextField(fmtDataNascimento);
		// configurando a posição e o tamanho
		tfDataNascimento.setBounds(130, 70, 100, 20);

		/*
		 * configurações do JFormattedTextField Telefone
		 */
		tfTelefone = new JFormattedTextField(fmtTelefone);
		// configurando a posição e o tamanho
		tfTelefone.setBounds(130, 100, 100, 20);

		/*
		 * configurações do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbCpf);
		painel.add(lbRg);
		painel.add(lbDataNascimento);
		painel.add(lbTelefone);
		painel.add(tfCpf);
		painel.add(tfRg);
		painel.add(tfDataNascimento);
		painel.add(tfTelefone);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		try {
			new Exemplo12().iniciaGui();
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

} // fim da classe