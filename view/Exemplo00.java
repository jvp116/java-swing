package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a utilização de Menu
 * 
 * @author João Victor
 * @since 04/03/2021
 * @version 1.0
 */
public class Exemplo00 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando o componente para a barrad e menu
	private JMenuBar barraMenu;
	// declarando o menu1, menu2 e menu3
	private JMenu menu1;
	private JMenu menu2;
	private JMenu menu3;
	// declarando os itens de menu
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JMenuItem itemMenu8;
	private JMenuItem itemMenu9;
	private JMenuItem itemMenu10;
	private JMenuItem itemMenu11;
	private JMenuItem itemMenu12;
	private JMenuItem itemMenu13;

	/*
	 * método para criar a tela
	 */
	public void iniciaGui() {

		/*
		 * criando as instâncias dos objetos
		 */
		janela = new JFrame();
		barraMenu = new JMenuBar();
		menu1 = new JMenu();
		menu2 = new JMenu();
		menu3 = new JMenu();
		itemMenu1 = new JMenuItem();
		itemMenu2 = new JMenuItem();
		itemMenu3 = new JMenuItem();
		itemMenu4 = new JMenuItem();
		itemMenu5 = new JMenuItem();
		itemMenu6 = new JMenuItem();
		itemMenu7 = new JMenuItem();
		itemMenu8 = new JMenuItem();
		itemMenu9 = new JMenuItem();
		itemMenu10 = new JMenuItem();
		itemMenu11 = new JMenuItem();
		itemMenu12 = new JMenuItem();
		itemMenu13 = new JMenuItem();

		/*
		 * configurações de texto do menu
		 */
		menu1.setText("MENU 1");
		menu2.setText("MENU 2");
		menu3.setText("SAIR");

		/*
		 * configurações de texto dos itens de menu
		 */
		itemMenu1.setText("Exemplo01");
		itemMenu2.setText("Exemplo02");
		itemMenu3.setText("Exemplo03");
		itemMenu4.setText("Exemplo04");
		itemMenu5.setText("Exemplo05");
		itemMenu6.setText("Exemplo06");
		itemMenu7.setText("Exemplo07");
		itemMenu8.setText("Exemplo08");
		itemMenu9.setText("Exemplo09");
		itemMenu10.setText("Exemplo010");
		itemMenu11.setText("Exemplo011");
		itemMenu12.setText("Exemplo012");
		itemMenu13.setText("Sair");

		/*
		 * adicionando o menu na barra de menus
		 */
		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);

		/*
		 * adicionando os itens de menu no menu 1
		 */
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);
		menu1.add(itemMenu5);
		menu1.add(itemMenu6);

		/*
		 * adicionando os itens de menu no menu 2
		 */
		menu2.add(itemMenu7);
		menu2.add(itemMenu8);
		menu2.add(itemMenu9);
		menu2.add(itemMenu10);
		menu2.add(itemMenu11);
		menu2.add(itemMenu12);

		/*
		 * adicionando os itens de menu no menu 3 - SAIR
		 */
		menu3.add(itemMenu13);

		/*
		 * adicionando as ações aos itens de menu
		 */
		itemMenu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo01().iniciaGui();
			}
		});

		itemMenu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo02().iniciaGui();
			}
		});

		itemMenu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo03().iniciaGui();
			}
		});

		itemMenu4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo04().iniciaGui();
			}
		});

		itemMenu5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo05().iniciaGui();
			}
		});

		itemMenu6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo06().iniciaGui();
			}
		});

		itemMenu7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo07().iniciaGui();
			}
		});

		itemMenu8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo08().iniciaGui();
			}
		});

		itemMenu9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo09().iniciaGui();
			}
		});

		itemMenu10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo10().iniciaGui();
			}
		});

		itemMenu11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Exemplo11().iniciaGui();
			}
		});

		itemMenu12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new Exemplo12().iniciaGui();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		itemMenu13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção",
						JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		/*
		 * configurações do JFrame - janela
		 */
		// adicionando a barra de menu a janela
		janela.setJMenuBar(barraMenu);
		// configurando o título do Menu
		janela.setTitle("Exemplo de Menu");
		// configurando a ação do X do JFrame
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// configurando o tamanho da tela maximizado - largura/altura
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		// configurando a visibilidade da tela
		janela.setVisible(true);

	} // fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo00().iniciaGui();
	}

} // fim do classe