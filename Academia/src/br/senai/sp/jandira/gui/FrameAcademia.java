package br.senai.sp.jandira.gui;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameAcademia {
	///////////////////////////////////
	////  M�TODO PARA CRIAR A TELA  ///
	///////////////////////////////////
	
	public void criarTela(){
		
		//  Tela 
		JFrame tela = new JFrame();
		tela.setTitle("Registro Academia");
		tela.setSize(1200, 700);
		tela.setDefaultCloseOperation(3);
		tela.setLayout(null);
		
		// JLabel nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(30, 40, 50, 30);
		
		//JTextFild nome
		JTextField textNome = new JTextField();
		textNome.setBounds(75, 40, 300, 30);
		
		
		// JLabel Sexo
			JLabel labelSexo = new JLabel();
			labelSexo.setText("Sexo: ");
			labelSexo.setBounds(30, 90, 50, 30);
			
		//JTextFild Sexo
			JTextField textSexo = new JTextField();
			textSexo.setBounds(75, 90, 130, 30);
			
		// JLabel Data
			JLabel labelData = new JLabel();
			labelData.setText("Data De Nascimento: ");
			labelData.setBounds(480, 40, 130, 30);
						
		//JTextFild Data
			JTextField textData = new JTextField();
			textData.setBounds(610, 40, 100, 30);
			
		// JLabel Peso
			JLabel labelPeso = new JLabel();
			labelPeso.setText("Peso: ");
			labelPeso.setBounds(30, 160, 130, 30);
									
		//JTextFild Peso
			JTextField textPeso = new JTextField();
			textPeso.setBounds(75, 160, 100, 30);
			
		// JLabel Altura
			JLabel labelAltura = new JLabel();
			labelAltura.setText("altura: ");
			labelAltura.setBounds(30, 200, 130, 30);
									
		//JTextFild Altura
			JTextField textAltura = new JTextField();
			textAltura.setBounds(75, 200, 100, 30);
			
			
			
		// JLabel Atiidade
			JLabel labelAtividade = new JLabel();
			labelAtividade.setText("Nivel De Atividade: ");
			labelAtividade.setBounds(480, 90, 130, 30);
			
			String niveisDeAtividade[] = {"Nunhema", 
					"Leve", 
					"Moderada", 
					"Intensa"};
			JComboBox<String> combo = new JComboBox<String>(niveisDeAtividade);
			combo.setBounds(610, 90, 130, 30);

			
			
			
			
			
//		//JTextFild Atividade
//			JTextField textAtividade = new JTextField();
//			textAtividade.setBounds(610, 40, 100, 30);
			
			
		tela.getContentPane().add(textNome);
		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textSexo);
		tela.getContentPane().add(labelSexo);
		tela.getContentPane().add(textData);
		tela.getContentPane().add(labelData);
		tela.getContentPane().add(textPeso);
		tela.getContentPane().add(labelPeso);
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelAltura);
//		tela.getContentPane().add(textAtividade);
		tela.getContentPane().add(labelAtividade);
		tela.getContentPane().add(combo);
		
		
		tela.setVisible(true);
	}
	
}
