package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.ColaboradorController;
import controller.VeiculoController;
import model.Colaborador;
import model.Veiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroColaboradoresUI extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCpf;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JTextField txtTelefone;
	private Colaborador colaborador;
	private JCheckBox cbxChnb;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroColaboradoresUI frame = new CadastroColaboradoresUI();
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
	public CadastroColaboradoresUI() {
		setTitle("Cadastro de Colaboradores");
		setClosable(true);
		setBounds(100, 100, 827, 315);
		
		JPanel jpCadastroColaboradores = new JPanel();
		jpCadastroColaboradores.setBorder(new TitledBorder(null, "Colaborador", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		
		
		JLabel jlNome = new JLabel("Nome:");
		
		JLabel jlEndereco = new JLabel("Endere\u00E7o:");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		JLabel jlCpf = new JLabel("CPF:");
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		
		JLabel jlCargo = new JLabel("Cargo:");
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		
		JLabel jlSalario = new JLabel("Sal\u00E1rio:");
		
		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		
		JLabel jlTelefone = new JLabel("Telefone:");
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		
		cbxChnb = new JCheckBox("Possui CNH B");
		GroupLayout gl_jpCadastroColaboradores = new GroupLayout(jpCadastroColaboradores);
		gl_jpCadastroColaboradores.setHorizontalGroup(
			gl_jpCadastroColaboradores.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_jpCadastroColaboradores.createSequentialGroup()
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
									.addComponent(jlEndereco, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
									.addComponent(jlNome, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addGap(9)
									.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)))
							.addGap(23)
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.LEADING)
								.addComponent(jlCargo, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
								.addComponent(jlCpf, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
							.addGap(141))
						.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
							.addComponent(jlSalario, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(jlTelefone, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(cbxChnb, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_jpCadastroColaboradores.setVerticalGroup(
			gl_jpCadastroColaboradores.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(cbxChnb)
							.addComponent(jlTelefone))
						.addGroup(gl_jpCadastroColaboradores.createSequentialGroup()
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.BASELINE)
								.addComponent(jlNome)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jlCpf)
								.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.BASELINE)
								.addComponent(jlEndereco)
								.addComponent(jlCargo)
								.addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(35)
							.addGroup(gl_jpCadastroColaboradores.createParallelGroup(Alignment.BASELINE)
								.addComponent(jlSalario)
								.addComponent(txtSalario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		jpCadastroColaboradores.setLayout(gl_jpCadastroColaboradores);
		getContentPane().setLayout(groupLayout);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					char cnhBDisponivel;
					
					if (colaborador != null && colaborador.getId() > 0) {
						colaborador.setNome(txtNome.getText());
						colaborador.setEndereco(txtEndereco.getText());
						colaborador.setCpf(txtCpf.getText());
						colaborador.setCargo(txtCargo.getText());
						colaborador.setSalario(Double.parseDouble(txtSalario.getText()));
						colaborador.setTelefone(txtTelefone.getText());
						
						if (cbxChnb.isSelected()) {
							cnhBDisponivel = 'S';
						} else {
							cnhBDisponivel = 'N';
						}
						new ColaboradorController().atualizar(colaborador);
						JOptionPane.showMessageDialog(null, "Colaborador atualizado com sucesso");
						dispose();
					} else {
						String nome = txtNome.getText();
						String endereco = txtEndereco.getText();
						String cpf = txtCpf.getText();
						String cargo = txtCargo.getText();
						Double salario = Double.parseDouble(txtSalario.getText());
						String telefone = txtTelefone.getText();
						
						if (cbxChnb.isSelected()) {
							cnhBDisponivel = 'S';
						} else {
							cnhBDisponivel = 'N';
						}
						
						Colaborador colaborador = new Colaborador(nome, endereco, cpf, cargo, salario, telefone, cnhBDisponivel);
						new ColaboradorController().salvar(colaborador);
						JOptionPane.showMessageDialog(null, "Colaborador cadastrado com sucesso");
						dispose();
					}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao efetuar a operação");
				}
			}
		});
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGap(18)
								.addComponent(jpCadastroColaboradores, GroupLayout.PREFERRED_SIZE, 786, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnSalvar)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnCancelar)
								.addGap(8)))
						.addGap(83))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(19)
						.addComponent(jpCadastroColaboradores, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnSalvar)
							.addComponent(btnCancelar))
						.addContainerGap(14, Short.MAX_VALUE))
			);

	}
	
	public void setColaboradoresEdicao(Colaborador colaborador) {
		this.colaborador = colaborador;
		preencheFormulario();
	}
	
	private void preencheFormulario() {
		if(colaborador != null) {
			txtNome.setText(colaborador.getNome());
			txtEndereco.setText(colaborador.getEndereco());
			txtCpf.setText(colaborador.getCpf());
			txtCargo.setText(colaborador.getCargo());
			txtSalario.setText(Double.toString(colaborador.getSalario()));
			txtTelefone.setText(colaborador.getTelefone());
			
			if (colaborador.getCnhB() == 'S') {
				cbxChnb.setSelected(true);
			} else {
				cbxChnb.setSelected(false);
			}
			
		}
	}
}
