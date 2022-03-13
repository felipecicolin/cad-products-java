

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pjCadProdutos.Produto;

/**
 * Servlet implementation class svlCadastrarProdutos
 */
@WebServlet("/svlCadastrarProdutos")
public class svlCadastrarProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public svlCadastrarProdutos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Produto produto = new Produto();
				
		produto.setCodigo(request.getParameter("cod_produto"));
		produto.setDescricao(request.getParameter("descricao_produto"));
		produto.setUnidadeMedida(request.getParameter("unidade_medida"));
		produto.setLocalizacao(request.getParameter("localizacao"));
		produto.setPreco(request.getParameter("preco_aquisicao"));
		produto.setFabricante(request.getParameter("fabricante"));
		produto.setDataCadastro(request.getParameter("data_cadastro"));
		produto.setDepartamento(request.getParameter("departamento"));
		
		response.getWriter().append("Cadastro do produto realizado com sucesso! <br/>");	
		
		response.getWriter().append(produto.getCodigo() + "<br/>");		
		response.getWriter().append(produto.getDescricao() + "<br/>");
		response.getWriter().append(produto.getUnidadeMedida() + "<br/>");
		response.getWriter().append(produto.getLocalizacao() + "<br/>");
		response.getWriter().append(produto.getPreco() + "<br/>");
		response.getWriter().append(produto.getFabricante() + "<br/>");
		response.getWriter().append(produto.getDataCadastro() + "<br/>");
		response.getWriter().append(produto.getDepartamento() + "<br/>");		
	}

}
