package controller;

import java.util.List;

import dao.ChamadoDao;
import dao.ColaboradorDao;
import model.Chamado;
import model.Colaborador;

public class ChamadoController {

	public void registrarChamado(Chamado chamado) throws Exception {
		if (chamado.getDataChamado() == null) {
			throw new Exception("Data Inv�lida!");
		}
		if (chamado.getColaborador() == null) {
			throw new Exception("Colaborador Inv�lido!");
		}
		ChamadoDao.getInstance().registrarChamado(chamado);
	}
}