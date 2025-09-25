package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JMenuBar barraMenu = new JMenuBar();
	private JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniNovo = new JMenuItem("Novo");
	private JMenuItem mniAbrir = new JMenuItem("Abrir");
	private JMenuItem mniSair = new JMenuItem("Sair");
	private JMenuItem mniCopiar = new JMenuItem("Copiar");
	private JMenuItem mniColar = new JMenuItem("Colar");
	
	private JButton btnSair = new JButton("Sair");
	
	private JLabel lblCaixaDeTexto = new JLabel("Caixa de Texto");
	private JTextField txtCaixaDeTexto = new JTextField();
	
	private JLabel lblAreaDeTexto = new JLabel("Área de Texto");
	private JTextArea txtAreaDeTexto = new JTextArea();
	private JScrollPane jspAreaDeTexto = new JScrollPane();
	
	private JLabel txtComboBox = new JLabel("Caixa de seleção");
	private JComboBox<String> cboCaixaDeSelecao = new JComboBox<String>();
	
	private JCheckBox chkCaixaDeMarcacao = new JCheckBox("Caixa de Marcação");
	
	private ButtonGroup btgBotoesAlternativa = new ButtonGroup();
	private JRadioButton optAlternativa1 = new JRadioButton("Alternativa 1");
	private JRadioButton optAlternativa2 = new JRadioButton("Alternativa 2");
	private JRadioButton optAlternativa3 = new JRadioButton("Alternativa 3");
	private JRadioButton optAlternativa4 = new JRadioButton("Alternativa 4");
	
	private JLabel lblAreaDeSelecao = new JLabel("Caixa de Seleção");
	private JList<String> lstAreaDeSelecao = new JList<String>();
	private DefaultListModel<String> dlmAreaDeSelecao = new DefaultListModel<String>();
	private JScrollPane jspAreaDeSelecao = new JScrollPane(lstAreaDeSelecao);
	
	//metodo principal da classe //
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	//metodo construtor da classe//
	
	public Visao() {
		//configuração da janela //
		
		setTitle("Janela Modelo de Utilização de Controles Gráficos");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Configurando o Menu//
		
		setJMenuBar(barraMenu);
		barraMenu.add(mnuArquivo);
		barraMenu.add(mnuEditar);
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mnuArquivo.add(mniSair);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
		
		//isso é para ele conseguir ler os inputs ao clicar e fazer ação//
		mniNovo.addActionListener(new ControladorNovo());
		
		
		//Configuração do botão
		
		btnSair.setBounds(670,490,100,30);
		btnSair.addActionListener(new ControladorSair());
		add(btnSair);
		
		//Configuração da Label de texto // 
		
		lblCaixaDeTexto.setBounds(10,10,200,20);
		add(lblCaixaDeTexto);
		txtCaixaDeTexto.setBounds(10 , 30 , 200 , 20);
		add(txtCaixaDeTexto);
		
		
		//configuração da caixa de texto grande//
		lblAreaDeTexto.setBounds(10 , 60 , 200 , 20);
		add(lblAreaDeTexto);
		txtAreaDeTexto.setBounds(10 , 80 , 600 , 200);
		txtAreaDeTexto.setLineWrap(true);
		add(txtAreaDeTexto);
		
		
		//Configuração da Combobox//
		
		txtComboBox.setBounds(10 , 300 , 100 , 50);
		add(txtComboBox);
		
		cboCaixaDeSelecao.setBounds(10 , 360 , 200 , 20);
		add(cboCaixaDeSelecao);
		cboCaixaDeSelecao.addItem("Opção 1");
		cboCaixaDeSelecao.addItem("Opção 2");
		cboCaixaDeSelecao.addItem("Opção 3");
		cboCaixaDeSelecao.addItem("Opção 4");

		//Configurando a checkbox // 
		
		chkCaixaDeMarcacao.setBounds(10 , 360 , 200 , 20);
		add(chkCaixaDeMarcacao);
		
		
		//Configurando  o grupo de botoes//
		optAlternativa1.setBounds(210 , 360 , 100 , 20);
		optAlternativa2.setBounds(310 , 360 , 100 , 20);
		optAlternativa3.setBounds(410 , 360 , 100 , 20);
		optAlternativa4.setBounds(510 , 360 , 100 , 20);
		add(optAlternativa1);
		add(optAlternativa2);
		add(optAlternativa3);
		add(optAlternativa4);
		
		btgBotoesAlternativa.add(optAlternativa1);
		btgBotoesAlternativa.add(optAlternativa2);
		btgBotoesAlternativa.add(optAlternativa3);
		btgBotoesAlternativa.add(optAlternativa4);
		
		//Configurando uma tabela

		lblAreaDeSelecao.setBounds(10 , 390 , 200 , 20);
		add(lblAreaDeSelecao);
		jspAreaDeSelecao.setBounds(10,410,765,100);
		add(jspAreaDeSelecao);
		lstAreaDeSelecao.setModel(dlmAreaDeSelecao);
		dlmAreaDeSelecao.addElement("Opção 1");
		dlmAreaDeSelecao.addElement("Opção 2");
		dlmAreaDeSelecao.addElement("Opção 3");
		dlmAreaDeSelecao.addElement("Opção 4");

		
	}
	
	
}
