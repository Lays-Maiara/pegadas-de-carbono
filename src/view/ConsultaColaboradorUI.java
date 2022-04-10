package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.ColaboradorController;
import model.Colaborador;
import view.tables.ColaboradorTableModel;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaColaboradorUI extends JInternalFrame {
	private JTable jtColaborador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaColaboradorUI frame = new ConsultaColaboradorUI();
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
	public ConsultaColaboradorUI() {
		
		setClosable(true);
		setTitle("Consulta de Colaborador");
		setBounds(100, 100, 831, 316);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colaborador colaborador = new ColaboradorTableModel(new ColaboradorController().listar()).get(jtColaborador.getSelectedRow());
				try {
					new ColaboradorController().excluir(colaborador.getId());
						JOptionPane.showMessageDialog(null, "Colaborador excluído com sucesso!");

					jtColaborador.setModel(new ColaboradorTableModel(new ColaboradorController().listar()));
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Erro ao excluir colaborador");
				}
			}
		});
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colaborador colaborador = new ColaboradorTableModel(new ColaboradorController().listar()).get(jtColaborador.getSelectedRow());
				CadastroColaboradoresUI cadColaboradoresUI = new CadastroColaboradoresUI();
				cadColaboradoresUI.setColaboradoresEdicao(colaborador);
				cadColaboradoresUI.setVisible(true);
				getParent().add(cadColaboradoresUI, 0);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnAtualizar = new JButton("Atualizar dados");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtColaborador.setModel(new ColaboradorTableModel(new ColaboradorController().listar()));
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAtualizar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEditar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnExcluir)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnCancelar)
							.addGap(53))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 801, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditar)
						.addComponent(btnExcluir)
						.addComponent(btnCancelar)
						.addComponent(btnAtualizar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		jtColaborador = new JTable();
		jtColaborador.setModel(new ColaboradorTableModel(new ColaboradorController().listar()));
		scrollPane.setViewportView(jtColaborador);
		getContentPane().setLayout(groupLayout);

	}
}
