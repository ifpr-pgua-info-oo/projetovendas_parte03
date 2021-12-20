package ifpr.pgua.eic.projetovendas.repositorios;

import java.sql.SQLException;
import java.util.ArrayList;

import ifpr.pgua.eic.projetovendas.daos.interfaces.ProdutoDAO;
import ifpr.pgua.eic.projetovendas.models.Produto;

public class RepositorioProdutos {
    
    private ArrayList<Produto> produtos;

    public RepositorioProdutos(){
        produtos = new ArrayList<>();
    }

    public boolean cadastrarProduto(String nome, String descricao, int quantidadeEstoque, double valor) throws SQLException{

        return false;
    }

    public Produto buscarProduto(String nome){
        return null;
    }

    public ArrayList<Produto> listarProdutos() throws Exception{
        return null;
    }
    
}
