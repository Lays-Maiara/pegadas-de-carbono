package controller;

import dao.ChamadoDao;
import model.Chamado;

public class ChamadoController {

	public void registrarChamado(Chamado chamado) throws Exception {
		if (chamado.getDataChamado() == null) {
			throw new Exception("Data Inválida!");
		}
		if (chamado.getColaborador() == null) {
			throw new Exception("Colaborador Inválido!");
		}
		ChamadoDao.getInstance().registrarChamado(chamado);
	}
}