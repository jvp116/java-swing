package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import util.Valida;

/**
 * Classe responsável por representar a utilização do componente de tabela -
 * JTable
 * 
 * @author João Victor
 * @since 03/03/2021
 * @version 1.0
 */
public class Exemplo11 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando as labels para exibir os rótulos na tela
	private JLabel lbIncluirUF;
	private JLabel lbIncluirNome;
	// declarar os campos de textos para o usuário digitar as informações
	private JTextField tfIncluirUF;
	private JTextField tfIncluirNome;
	// declarando a tabela para armazenar os daos inputado pelo usuário
	private JTable tabela;
	// declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;
	// declarando os botões para incluir e excluir registros na tabela
	private JButton btIncluir;
	private JButton btExcluir;
	// declarando o painel para organizar os componentes de tela
	private JPanel painel;

	// vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "UF", "Estado" };
	// matriz auxiliar para armazenar os dados exibidos na tabela
	private String linhas[][] = { { "SP", "São Paulo" }, { "PR", "Paraná" }, { "SC", "Santa Catarina" },
			{ "RS", "Rio Grande do Sul" } };

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de Tabela");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(400, 300);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do componente JLabel UF
		 */
		lbIncluirUF = new JLabel();
		// configurar o texto inicial
		lbIncluirUF.setText("Informe UF:");
		// configurar a posição e o tamanho
		lbIncluirUF.setBounds(15, 20, 70, 25);

		/*
		 * configurações do componente JLabel Nome
		 */
		lbIncluirNome = new JLabel();
		// configurar o texto inicial
		lbIncluirNome.setText("Informe Estado:");
		// configurar a posição e o tamanho
		lbIncluirNome.setBounds(15, 55, 90, 25);

		/*
		 * configurações do componente JTextField UF
		 */
		tfIncluirUF = new JTextField();
		// configurar a posição e o tamanho
		tfIncluirUF.setBounds(110, 20, 50, 25);

		/*
		 * configurações do componente JTextField Nome
		 */
		tfIncluirNome = new JTextField();
		// configurar a posição e o tamanho
		tfIncluirNome.setBounds(110, 55, 260, 25);

		/*
		 * configurações do componente JTable - tabela de dados
		 */
		// definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);
		// configurar a posição e tamanho
		tabela.setBounds(19, 30, 300, 95);
		// configurar a ação do usuário quando clica no registro armazena
		tabela.setEnabled(true);

		/*
		 * configurações do componente JScrollPane
		 */
		scroll = new JScrollPane(tabela);
		// configurar local de exibição do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// configurar a posição e tamanho
		scroll.setBounds(10, 100, 360, 95);

		/*
		 * configurações do componente JButton incluir
		 */
		btIncluir = new JButton();
		// configurar o texto inicial
		btIncluir.setText("Incluir");
		// configurar a posição e tamanho
		btIncluir.setBounds(75, 200, 100, 50);
		// configurar a ação do botão
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				incluirLinha();
			}
		});

		/*
		 * configurações do componente JButton excluir
		 */
		btExcluir = new JButton();
		// configurar o texto inicial
		btExcluir.setText("Excluir");
		// configurar a posição e tamanho
		btExcluir.setBounds(195, 200, 100, 50);
		// configurar a ação do botão
		btExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				excluirLinha();
			}
		});

		/*
		 * configurações do painel pirncipal da tela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbIncluirUF);
		painel.add(lbIncluirNome);
		painel.add(tfIncluirUF);
		painel.add(tfIncluirNome);
		painel.add(scroll);
		painel.add(btIncluir);
		painel.add(btExcluir);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método para incluir registro na tabela
	 */
	private void incluirLinha() {

		// validar os dados digitados pelo usuário
		if (validarDados()) {
			// obtendo o módelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// adicionando a linha na tabela
			modelo.addRow(new String[] { tfIncluirUF.getText(), tfIncluirNome.getText() });
			// limpando os dados digitados
			tfIncluirUF.setText("");
			tfIncluirNome.setText("");
			// exibindo a mensagem de sucesso ao usuário
			JOptionPane.showMessageDialog(null, "Registro incluído com sucesso", "Cadastro de Estado", 1);
		}
	}

	// método auxiliar para validar os dados digitados
	private boolean validarDados() {
		// verificando se o conteúdo da UF está válido
		if (Valida.isEmptyOrNull(tfIncluirUF.getText())) {
			// exibindo a mensagem de erro para o usuário
			JOptionPane.showMessageDialog(null, "Informe UF, campo obrigatório", "Cadastro de UF", 0);
			// retornando valor falso para o método
			return false;
		}

		// verificando se o conteúdo da nome está válido
		if (Valida.isEmptyOrNull(tfIncluirNome.getText())) {
			// exibindo a mensagem de erro para o usuário
			JOptionPane.showMessageDialog(null, "Informe o Estado, campo obrigatório", "Cadastro de Estado", 0);
			// retornando valor falso para o método
			return false;
		}
		// se tudo estiver certo retorna true
		return true;
	}

	/*
	 * método para excluir registro na tabela
	 */
	private void excluirLinha() {

		// verificando se o usuário selecionou um registro
		if (tabela.getSelectedRow() == -1) {
			// exibindo a mensagem pro usuário
			JOptionPane.showMessageDialog(null, "Selecione um registo", "Excluir Estado", 0);
		} else if (tabela.getSelectedRowCount() > 1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas um registo", "Excluir Estado", 0);
		} else {
			// obter o modelo da tabela atual
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// excluir o registro selecionado pelo usuário
			modelo.removeRow(tabela.getSelectedRow());
			// exibindo a mensagem de sucesso pro usuário
			JOptionPane.showMessageDialog(null, "Registro excluido com sucesso", "Excluir Estado", 1);
		}
	}

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo11().iniciaGui();
	}

} // fim da classe