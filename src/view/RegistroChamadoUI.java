package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.*;
import model.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class RegistroChamadoUI extends JInternalFrame {
	private JTextField txtEndereco;
	private JTextField txtDataChamado;
	private JTextField txtDistancia;
	private JComboBox<Colaborador> cbColaborador;
	private JComboBox<Veiculo> cbVeiculo;
	private Chamado chamado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroChamadoUI frame = new RegistroChamadoUI();
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
	public RegistroChamadoUI() {
		
		setClosable(true);
		setTitle("Cadastro de Registro Chamado");
		setBounds(100, 100, 733, 252);
		
		JPanel jpRegistrarChamado = new JPanel();
		jpRegistrarChamado.setBorder(new TitledBorder(null, "Registrar Chamado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel jlModelo = new JLabel("Endere\u00E7o do atendimento:");
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		JLabel jlAno = new JLabel("Data Chamado:");
		
		txtDataChamado = new JTextField();
		txtDataChamado.setColumns(10);
		
		JLabel jlConsumoKmLitro = new JLabel("Dist\u00E2ncia a ser percorrida:");
		
		txtDistancia = new JTextField();
		txtDistancia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Colaborador:");
		
		cbColaborador = new JComboBox<Colaborador>();
		
		DefaultComboBoxModel<Colaborador> modelColaborador = new DefaultComboBoxModel<Colaborador>();
		for(Colaborador colaborador : new ColaboradorController().listar()) {
			modelColaborador.addElement(colaborador);
		}
		cbColaborador.setModel(modelColaborador);
		
		
		JLabel lblNewLabel_1 = new JLabel("Ve\u00EDculo:");
		
		cbVeiculo = new JComboBox<Veiculo>();
		
		DefaultComboBoxModel<Veiculo> modelVeiculo = new DefaultComboBoxModel<Veiculo>();
		for(Veiculo veiculo : new VeiculoController().listar()) {
			modelVeiculo.addElement(veiculo);
		}
		cbVeiculo.setModel(modelVeiculo);
		
		
		GroupLayout gl_jpRegistrarChamado = new GroupLayout(jpRegistrarChamado);
		gl_jpRegistrarChamado.setHorizontalGroup(
				gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
							.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
									.addComponent(jlModelo)
									.addGap(18)
									.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
											.addGap(28)
											.addComponent(txtDataChamado, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
											.addGap(25)
											.addComponent(jlConsumoKmLitro))
										.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
											.addGap(18)
											.addComponent(cbColaborador, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
											.addGap(4)
											.addComponent(cbVeiculo, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtDistancia, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(67, Short.MAX_VALUE))
						.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
							.addComponent(jlAno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(597))))
		);
		gl_jpRegistrarChamado.setVerticalGroup(
				gl_jpRegistrarChamado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpRegistrarChamado.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlModelo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlAno)
						.addComponent(txtDataChamado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlConsumoKmLitro)
						.addComponent(txtDistancia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpRegistrarChamado.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(cbVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbColaborador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		jpRegistrarChamado.setLayout(gl_jpRegistrarChamado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colaborador colaborador = (Colaborador) cbColaborador.getSelectedItem();
				Veiculo veiculo = (Veiculo) cbVeiculo.getSelectedItem();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
				
				try {
					LocalDate dataChamado = LocalDate.parse(txtDataChamado.getText(), formatter);
					String endereco = txtEndereco.getText();
					Double distancia = Double.valueOf(txtDistancia.getText());
					
					chamado = new Chamado(dataChamado, endereco, distancia, colaborador, veiculo);
					
					new ChamadoController().registrarChamado(chamado);
					
					JOptionPane.showMessageDialog(null, "Chamado registrado com sucesso");
					dispose();
					
					
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
							.addComponent(jpRegistrarChamado, GroupLayout.PREFERRED_SIZE, 695, GroupLayout.PREFERRED_SIZE)
							.addGap(197))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(jpRegistrarChamado, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnCancelar))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
		
	public void setVeiculoEdicao(Veiculo veiculo) {
		/*this.veiculo = veiculo;
		preencheFormulario();*/
	}
	
	private void preencheFormulario() {
		/*if(veiculo != null) {
			txtPlaca.setText(veiculo.getPlaca());
			txtModelo.setText(veiculo.getModelo());
			txtAno.setText(Integer.toString(veiculo.getAno()));
			if (veiculo.getVeiculoDisponivel() == 'S') {
				cbxVeiculoDisponivel.setSelected(true);
			} else {
				cbxVeiculoDisponivel.setSelected(false);
			}
			txtConsumoKmLitro.setText(veiculo.getConsumoKmLitro());
			
			
		}*/
	}
}
