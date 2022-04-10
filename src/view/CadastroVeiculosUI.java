package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.VeiculoController;
import model.Veiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroVeiculosUI extends JInternalFrame {
	private JTextField txtPlaca;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField txtConsumoKmLitro;
	private Veiculo veiculo;
	private JCheckBox cbxVeiculoDisponivel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculosUI frame = new CadastroVeiculosUI();
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
	public CadastroVeiculosUI() {
		
		setClosable(true);
		setTitle("Cadastro de Ve\u00EDculos");
		setBounds(100, 100, 733, 252);
		
		JPanel jpCadastroVeiculos = new JPanel();
		jpCadastroVeiculos.setBorder(new TitledBorder(null, "Ve\u00EDculo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel jlPlaca = new JLabel("Placa:");
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		
		JLabel jlModelo = new JLabel("Modelo:");
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		JLabel jlAno = new JLabel("Ano: ");
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		JLabel jlConsumoKmLitro = new JLabel("Consumo (km/l):");
		
		txtConsumoKmLitro = new JTextField();
		txtConsumoKmLitro.setColumns(10);
		
		cbxVeiculoDisponivel = new JCheckBox("Ve\u00EDculo dispon\u00EDvel?");
		GroupLayout gl_jpCadastroVeiculos = new GroupLayout(jpCadastroVeiculos);
		gl_jpCadastroVeiculos.setHorizontalGroup(
			gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroVeiculos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING)
						.addComponent(jlAno)
						.addComponent(jlPlaca, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroVeiculos.createSequentialGroup()
							.addGap(27)
							.addComponent(jlConsumoKmLitro))
						.addGroup(gl_jpCadastroVeiculos.createSequentialGroup()
							.addGap(59)
							.addComponent(jlModelo, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_jpCadastroVeiculos.createSequentialGroup()
							.addComponent(txtConsumoKmLitro, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(cbxVeiculoDisponivel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(211, Short.MAX_VALUE))
		);
		gl_jpCadastroVeiculos.setVerticalGroup(
			gl_jpCadastroVeiculos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroVeiculos.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPlaca)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlModelo))
					.addGap(34)
					.addGroup(gl_jpCadastroVeiculos.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlAno)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlConsumoKmLitro)
						.addComponent(txtConsumoKmLitro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxVeiculoDisponivel))
					.addContainerGap(227, Short.MAX_VALUE))
		);
		jpCadastroVeiculos.setLayout(gl_jpCadastroVeiculos);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					char veiculoDisponivel;
					
					if(veiculo != null && veiculo.getId() > 0) {
						veiculo.setPlaca(txtPlaca.getText());
						veiculo.setModelo(txtModelo.getText());
						veiculo.setAno(Integer.parseInt(txtAno.getText()));
			
						if (cbxVeiculoDisponivel.isSelected()) {
							veiculoDisponivel = 'S';
						} else {
							veiculoDisponivel = 'N';
						}
						veiculo.setVeiculoDisponivel(veiculoDisponivel);
						veiculo.setConsumoKmLitro(txtConsumoKmLitro.getText());
						new VeiculoController().atualizar(veiculo);
						JOptionPane.showMessageDialog(null, "Veículo atualizado com sucesso");
						dispose();
					} else {
						String placa = txtPlaca.getText();
						String modelo = txtModelo.getText();
						int ano = Integer.parseInt(txtAno.getText());
						if (cbxVeiculoDisponivel.isSelected()) {
							veiculoDisponivel = 'S';
						} else {
							veiculoDisponivel = 'N';
						}
						String consumo = txtConsumoKmLitro.getText();
						
						Veiculo veiculo = new Veiculo(placa, modelo, ano, veiculoDisponivel, consumo);
						
						new VeiculoController().salvar(veiculo);
						
						JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");
						dispose();
					}
				
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao efetuar a operação");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar)
							.addGap(208))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(jpCadastroVeiculos, GroupLayout.PREFERRED_SIZE, 695, GroupLayout.PREFERRED_SIZE)
							.addGap(197))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(jpCadastroVeiculos, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
		
	public void setVeiculoEdicao(Veiculo veiculo) {
		this.veiculo = veiculo;
		preencheFormulario();
	}
	
	private void preencheFormulario() {
		if(veiculo != null) {
			txtPlaca.setText(veiculo.getPlaca());
			txtModelo.setText(veiculo.getModelo());
			txtAno.setText(Integer.toString(veiculo.getAno()));
			if (veiculo.getVeiculoDisponivel() == 'S') {
				cbxVeiculoDisponivel.setSelected(true);
			} else {
				cbxVeiculoDisponivel.setSelected(false);
			}
			txtConsumoKmLitro.setText(veiculo.getConsumoKmLitro());
			
			
		}
	}
}
