package br.jus.trf2.siga.app.vraptor;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Result;
import br.gov.jfrj.siga.base.AplicacaoException;
import br.gov.jfrj.siga.dp.dao.CpDao;
import br.gov.jfrj.siga.vraptor.SigaController;
import br.gov.jfrj.siga.vraptor.SigaObjects;

public class AppController extends SigaController {

	String ACESSO_MODULO = ""; //Exemplo "GC:Módulo de Gestão de Conhecimento;"
	
	public AppController(HttpServletRequest request, Result result,
			SigaObjects so, EntityManager em) {
		super(request, result, CpDao.getInstance(), so, em);
	}

	public void assertAcesso(String pathServico) throws AplicacaoException {
		so.assertAcesso(ACESSO_MODULO + pathServico);
	}

	protected CpDao dao() {
		return CpDao.getInstance();
	}
}
