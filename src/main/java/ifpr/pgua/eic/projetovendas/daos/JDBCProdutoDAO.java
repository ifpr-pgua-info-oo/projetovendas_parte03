package ifpr.pgua.eic.projetovendas.daos;


import java.util.ArrayList;


import ifpr.pgua.eic.projetovendas.daos.interfaces.ProdutoDAO;
import ifpr.pgua.eic.projetovendas.models.Produto;

public class JDBCProdutoDAO implements ProdutoDAO {

    
    public JDBCProdutoDAO(){
    }


    @Override
    public boolean cadastrar(Produto p) throws Exception {
        
        return false;
    }

    @Override
    public boolean atualizar(int id, Produto p) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean remover(Produto p) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Produto> lista() throws Exception {
        return null;
    }

}
