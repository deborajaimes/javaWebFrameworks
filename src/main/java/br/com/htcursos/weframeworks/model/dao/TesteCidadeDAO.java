package br.com.htcursos.weframeworks.model.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.htcursos.weframeworks.model.entidade.Cidade;
import br.com.htcursos.weframeworks.model.entidade.Estado;

public class TesteCidadeDAO {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new
				ClassPathXmlApplicationContext(
						"file:src/main/webapp/WEB-INF/springbeans.xml");
		CidadeDAO cidadeDAO = (CidadeDAO) ctx.getBean("cidadeDAO");
		
		Estado ms = new Estado("Mato Grosso do Sul", "MS");
		Cidade campoGrande = new Cidade("Campo Grande", ms);
		
		cidadeDAO.salvar(campoGrande);
		cidadeDAO.buscarPorId(campoGrande);
		System.out.println(campoGrande.getEstado().getNome());
	}
}
