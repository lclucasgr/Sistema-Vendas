package dao;

import model.Clientes;
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

public class DaoClientes extends ConnectionFactory {

    public void salvarCliente(Clientes cliente) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO clientes (nome, endereco, bairro, cidade, estado, cep, telefone)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getBairro());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());
            stmt.setString(6, cliente.getCep());
            stmt.setString(7, cliente.getTelefone());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void excluirCliente(Clientes cliente) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM clientes WHERE id = ?");
            stmt.setInt(1, cliente.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void alterarCliente(Clientes cliente) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE clientes SET nome = ? , endereco = ?, bairro = ?, cidade = ?, estado = ?, cep = ?, telefone = ? WHERE id = ?");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getBairro());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());
            stmt.setString(6, cliente.getCep());
            stmt.setString(7, cliente.getTelefone());
            stmt.setInt(8, cliente.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Clientes> getClientesByName(String nome) {

        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Clientes> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");

            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes c = new Clientes();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCep(rs.getString("cep"));
                clientes.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

    public ArrayList<Clientes> getClientes() {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Clientes> listaClientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes ORDER BY nome");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Clientes c = new Clientes();

                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setCep(rs.getString("cep"));
                c.setTelefone(rs.getString("telefone"));
                listaClientes.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaClientes;
    }

    /*ADD */
    public Clientes getClienteById(int id) {
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt = null;
        ResultSet rs = null;
        Clientes c = new Clientes();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE id = '" + id + "'");
            rs = stmt.executeQuery();
            while (rs.next()) {

                c.setId(this.getResultSet().getInt(1));
                c.setNome(this.getResultSet().getString(2));
                c.setEndereco(this.getResultSet().getString(3));
                c.setBairro(this.getResultSet().getString(4));
                c.setCidade(this.getResultSet().getString(5));
                c.setEstado(this.getResultSet().getString(6));
                c.setCep(this.getResultSet().getString(7));
                c.setTelefone(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return c;
    }

}
