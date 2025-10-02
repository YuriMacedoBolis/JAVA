package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class Visao extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup btgSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	private JRadioButton optNaoBinario = new JRadioButton("Não Binário");
	
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Enviar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	//METODO PRINCIPAL DA CLASSE//
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	public Visao() {
		//CONFIGURAÇÃO DA JANELA//
		
		setTitle("Cadastro Pessoa");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//CONFIGURAÇÃO DO MENU//
		
		//NOME//
		lblNome.setBounds(10,10,200,20);
		add(lblNome);
		txtNome.setBounds(10,30,325,25);
		add(txtNome);
		
		//SEXO//
		lblSexo.setBounds(10,60 , 200 , 20);
		add(lblSexo);
		
		optMasculino.setBounds(10,80,100,20);
		optFeminino.setBounds(110 , 80 , 100 , 20);
		optNaoBinario.setBounds(210,80,100,20);
		add(optMasculino);
		add(optFeminino);
		add(optNaoBinario);
		btgSexo.add(optMasculino);
		btgSexo.add(optFeminino);
		btgSexo.add(optNaoBinario);
		optMasculino.setSelected(true);
		
		//ENDEREÇO//
		lblEndereco.setBounds(10,110,100,25);
		add(lblEndereco);
		txtEndereco.setBounds(10,130,325,25);
		add(txtEndereco);
		
		//CONFIGURAÇÃO DA UF//
		lblUf.setBounds(10,160,200,20);
		add(lblUf);
		cboUf.setBounds(10,180,80,20);
		add(cboUf);
		cboUf.addItem("");
		try {
			for(Uf objUf: Uf.getTodos()) {
				cboUf.addItem(objUf.getSigla());
			}
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//BOTOES//
		btnGravar.setBounds(250,300,100,50);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome , optMasculino, optFeminino , txtEndereco,cboUf));
		
		btnLimpar.setBounds(360,300,100,50);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome , optMasculino,txtEndereco,cboUf));
		
		
		btnSair.setBounds(470,300,100,50);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		
	}
	
}
