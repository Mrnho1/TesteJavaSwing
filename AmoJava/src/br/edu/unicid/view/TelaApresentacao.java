package br.edu.unicid.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaApresentacao extends JFrame {

	private JPanel contentPane;
	public final JLabel lblNewLabel = new JLabel("Nome");
	public final JLabel lblNewLabel_1 = new JLabel("Endereço");
	public final JLabel lblNewLabel_1_1 = new JLabel("Sexo");
	public final JLabel lblNewLabel_1_2 = new JLabel("Estado Civil");
	public final JButton Mostrar = new JButton("Mostrar");
	public final JButton btnLimpar = new JButton("Limpar");
	public final JTextField txtNome = new JTextField();
	public final JTextField txtEndereco = new JTextField();
	public final JComboBox cmbSexo = new JComboBox();
	public final JComboBox cmbEstado = new JComboBox();
	public final JTextArea txtArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApresentacao frame = new TelaApresentacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaApresentacao() {
		txtNome.setBounds(112, 9, 113, 15);
		txtNome.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(10, 10, 26, 13);
		
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setBounds(10, 33, 42, 13);
		
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1_1.setBounds(10, 56, 22, 13);
		
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_2.setBounds(10, 79, 52, 13);
		
		contentPane.add(lblNewLabel_1_2);
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtArea.append("Nome......."+txtNome.getText()+"\n");
				txtArea.append("Endereço......."+txtEndereco.getText()+"\n");
				txtArea.append("Sexo......."+cmbSexo.getSelectedIndex()+"\n");
				txtArea.append("Estado Civil......."+cmbEstado.getSelectedIndex()+"\n");
				
			}
		});
		Mostrar.setBounds(10, 102, 105, 21);
		
		contentPane.add(Mostrar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText(null);
				txtEndereco.setText(null);
				cmbSexo.setSelectedIndex(0);
				cmbEstado.setSelectedIndex(0);
			}
		});
		btnLimpar.setBounds(120, 102, 105, 21);
		
		contentPane.add(btnLimpar);
		
		contentPane.add(txtNome);
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(112, 30, 113, 15);
		
		contentPane.add(txtEndereco);
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione a opção", "Masculino", "Feminino"}));
		cmbSexo.setBounds(112, 52, 113, 21);
		
		contentPane.add(cmbSexo);
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"Selecione a opção", "Solteiro(a)", "Casado(a)", "Viuvo(a)"}));
		cmbEstado.setBounds(112, 75, 113, 21);
		
		contentPane.add(cmbEstado);
		txtArea.setBounds(20, 133, 205, 73);
		
		contentPane.add(txtArea);
	}
}
