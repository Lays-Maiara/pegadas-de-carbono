
import java.time.LocalDate;

import controller.ColaboradorController;
import controller.VeiculoController;
import controller.ChamadoController;
import model.Colaborador;
import model.Veiculo;
import model.Chamado;

public class Principal {

	public static void main(String[] args) {

		testeColaborador();
		testeVeiculo();
		testeChamado();

	}

	public static void testeColaborador() {
		Colaborador c1 = new Colaborador("Ada Lovelace", "Rua dos Programadores - número 1010", "045888555-74", "Gerente", 15000.00,"48 95555-8888", 'S');


		Colaborador c2 = new Colaborador("Carolina Shaw", "Rua dos Sonhos - número 21", "035218555-43", "Coordenadora", 12000.00,"48 93575-8258", 'S');
		
		ColaboradorController controller = new ColaboradorController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for (Colaborador c : controller.listar()) {
			System.out.println(c.toString());
		}
	}

	public static void testeVeiculo() {
		Veiculo v1 = new Veiculo("LSN4582", "Toyota Corolla", 2020, 'S', "13.9 km/l");
		
		Veiculo v2 = new Veiculo("OXM2754", "Chevrolet Onix", 2021, 'S', "15.7 km/l");

		VeiculoController controller = new VeiculoController();

		try {
			controller.salvar(v1);
			controller.salvar(v2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Veiculo v : controller.listar()) {
			System.out.println(v.toString());
		}
	}

	public static void testeChamado() {

		Veiculo v1 = new Veiculo("LSN4582", "Toyota Corolla", 2020, 'S', "13.9 km/l");
		
		Colaborador c1 = new Colaborador("Ada Lovelace", "Rua dos Programadores - número 1010", "045888555-74", "Gerente", 15000.00,"48 95555-8888", 'S');

		Chamado ch1 = new Chamado(LocalDate.now(), "Rua das Acácias - número 35", 20.00, c1, v1 );
		
		ChamadoController controller = new ChamadoController();
		
		try {
			controller.registrarChamado(ch1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
