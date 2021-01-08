package dao;

import model.Veiculos;
import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DaoVeiculos extends ConnectionFactory {
    
      public void salvarVeiculo(Veiculos veiculo) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO veiculos (marca, modelo, ano, placa, tipo, uf_emplacado)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setInt(3, veiculo.getAno());
            stmt.setString(4, veiculo.getPlaca());
            stmt.setString(5, veiculo.getTipo());
            stmt.setString(6, veiculo.getUf());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirVeiculo(Veiculos veiculo) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM veiculos WHERE id = ?");
            stmt.setInt(1, veiculo.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void alterarVeiculo(Veiculos veiculo) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE veiculos SET marca = ? , modelo = ?, ano = ?, placa = ?, tipo = ?, uf_emplacado = ? WHERE id = ?");
            stmt.setString(1, veiculo.getMarca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setInt(3, veiculo.getAno());
            stmt.setString(4, veiculo.getPlaca());
            stmt.setString(5, veiculo.getTipo());
            stmt.setString(6, veiculo.getUf());
            stmt.setInt(7, veiculo.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Veiculos> getVeiculosByName(String nome) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Veiculos> veiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculos v = new Veiculos();

                v.setId(rs.getInt("id"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("endereco"));
                v.setAno(rs.getInt("ano"));
                v.setPlaca(rs.getString("placa"));
                veiculos.add(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return veiculos;

    }

    public ArrayList<Veiculos> getVeiculos() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Veiculos> listaVeiculos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculos ORDER BY marca, modelo");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Veiculos v = new Veiculos();

                v.setId(rs.getInt("id"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setAno(rs.getInt("ano"));
                v.setPlaca(rs.getString("placa"));
                v.setTipo(rs.getString("tipo"));
                v.setUf(rs.getString("uf_emplacado"));
                listaVeiculos.add(v);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaVeiculos;
    }

    /*ADD */
    public Veiculos getVeiculoById(int id) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Veiculos v = new Veiculos();

        try {
            stmt = con.prepareStatement("SELECT * FROM veiculos WHERE id = '" + id + "'");
            rs = stmt.executeQuery();
            while (rs.next()) {

                v.setId(this.getResultSet().getInt(1));
                v.setMarca(this.getResultSet().getString(2));
                v.setModelo(this.getResultSet().getString(3));
                v.setAno(this.getResultSet().getInt(4));
                v.setPlaca(this.getResultSet().getString(5));
                v.setTipo(this.getResultSet().getString(6));
                v.setUf(this.getResultSet().getString(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return v;
    }
    
}
