package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {

	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JRadioButton optFeminino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	
	//CONSTRUTOR CHEIO//
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JRadioButton optFeminino,
			JTextField txtEndereco, JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.optFeminino = optFeminino;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}

	public void actionPerformed(ActionEvent e) {
		//CRITICAS DE DADOS//
		
		if(txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo de Nome Obrigatório.");
			return;
		}
		
		if(txtEndereco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo de Endereço Obrigatório.");
			return;
		}
		
		if(cboUf.getSelectedIndex()== 0) {
			JOptionPane.showMessageDialog(null, "Campo UF obrigatório");
			return;
		}
		
		//GRAVAÇÃO DOS DADOS//
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setSexo(optMasculino.isSelected()?"Masculino":optFeminino.isSelected()?"Feminino":"Não Binário");
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new Uf(cboUf.getSelectedItem().toString()));
		
		JOptionPane.showMessageDialog(null,
				"Gravação realizada com sucesso!\n\n"+
				"Nome: "+ objPessoa.getNome() + "\n" + 
				"Sexo: " + objPessoa.getSexo() + "\n"+
				"Endereço: "+ objPessoa.getEndereco() + "\n" + 
				"UF: "+ objPessoa.getObjUf().getSigla());
		
		
	}

}
