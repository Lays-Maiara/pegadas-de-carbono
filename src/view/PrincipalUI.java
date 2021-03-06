package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
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
	public PrincipalUI() {
		setTitle("Sistema de Registro - Chamados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 657);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu jmCadastros = new JMenu("Cadastros");
		jbPrincipal.add(jmCadastros);
		
		JMenuItem jmiVeiculos = new JMenuItem("Ve\u00EDculos");
		jmiVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroVeiculosUI cadVeiculo = new CadastroVeiculosUI();
				cadVeiculo.setVisible(true);
				contentPane.add(cadVeiculo, 0);
			}
		});
		jmCadastros.add(jmiVeiculos);
		
		JMenuItem jmiColaboradores = new JMenuItem("Colaboradores");
		jmiColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroColaboradoresUI cadColaborador = new CadastroColaboradoresUI();
				cadColaborador.setVisible(true);
				contentPane.add(cadColaborador, 0);
				
			}
		});
		jmCadastros.add(jmiColaboradores);
		
		JMenu jmConsultas = new JMenu("Consultas ");
		jbPrincipal.add(jmConsultas);
		
		JMenuItem jmiCosultaVeiculos = new JMenuItem("Ve\u00EDculos");
		jmiCosultaVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaVeiculosUI consultaVeiUI = new ConsultaVeiculosUI();
				consultaVeiUI.setVisible(true);
				contentPane.add(consultaVeiUI,0);
			}
		});
		jmConsultas.add(jmiCosultaVeiculos);
		
		JMenuItem jmiConsultaColaboradores = new JMenuItem("Colaboradores");
		jmiConsultaColaboradores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultaColaboradorUI consultaColUI = new ConsultaColaboradorUI();
				consultaColUI.setVisible(true);
				contentPane.add(consultaColUI,0);
			}
		});
		
		jmConsultas.add(jmiConsultaColaboradores);
		
		JMenu jmChamados = new JMenu("Chamados");
		jbPrincipal.add(jmChamados);
		
		JMenuItem jmiRegistrarChamados = new JMenuItem("Registrar Chamados");
		jmChamados.add(jmiRegistrarChamados);
		jmiRegistrarChamados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroChamadoUI registroChamadoUI = new RegistroChamadoUI();
				registroChamadoUI.setVisible(true);
				contentPane.add(registroChamadoUI,0);
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 426, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 253, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
