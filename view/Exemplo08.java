package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Classe responsável por demonstrar a utilização do componente JList e o
 * JScrollPane
 * 
 * @author João Victor
 * @since 03/03/2021
 */
public class Exemplo08 {

	// declarando os atributos da tela
	private JFrame janela;

	// label auxiliar para exibir a seleção do usuário
	private JLabel lbAuxiliar;

	// atributo JLista para armazenar uma lista de opções
	private JList ltDiaSemana;

	// atributo auxiliar ScrollPane
	private JScrollPane scroll;

	// painel para organizar os componentes
	private JPanel painel;

	// vetor auxiliar para armazenar os dias da semana
	private String diasSemana[] = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o título da tela
		janela.setTitle("Exemplo de JList e JScrollPnae");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(330, 330);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configurações do JLabel
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto a ser exibido
		lbAuxiliar.setText("CTRL para multi-seleções");
		// configurações de estilos
		lbAuxiliar.setOpaque(true);
		lbAuxiliar.setBackground(Color.LIGHT_GRAY);
		lbAuxiliar.setForeground(Color.BLACK);
		// configurando a posição e tamanho do componente
		lbAuxiliar.setBounds(10, 10, 300, 30);

		/*
		 * configurações do JList - lista de opções
		 */
		ltDiaSemana = new JList(diasSemana);
		// configurando como o componente permitirá a seleção dos seus dados - único ou
		// múltiplo
		ltDiaSemana.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// atribuindo o texto selecionado na label auxiliar
				lbAuxiliar.setText((String) ltDiaSemana.getSelectedValue());
			}
		});

		/*
		 * configurações do JScrollPane
		 */
		scroll = new JScrollPane(ltDiaSemana);
		// configurando a posição e tamanho
		scroll.setBounds(10, 60, 300, 90);

		/*
		 * configurações do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(scroll);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo08().iniciaGui();
	}

} // fim da classe