package br.jus.trf2.siga.app.vraptor;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.gov.jfrj.siga.vraptor.SigaObjects;

@Resource
public class PrincipalController  extends AppController{
	public PrincipalController(HttpServletRequest request, Result result, SigaObjects so, EntityManager em) {
        super(request, result, so, em);
    }
	@Path("/app/principal")
	public void principal() throws Exception {
	}
}