/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locadora.locadora.dao.impl;

import com.locadora.locadora.dao.ClienteDao;
import com.locadora.locadora.dao.JdbcDao;
import com.locadora.locadora.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author judok
 */
public class ClienteJdbcDao extends JdbcDao implements ClienteDao {

    @Override
    public Cliente buscarPorCpf(String cpf) throws Exception {
        String sql = "SELECT * FROM clientes WHERE cpf = ?";
        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Cliente cli = mapearLinhas(rs);
                return cli;
            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public Cliente salvar(Cliente entity) throws Exception {
        String sql = "INSERT INTO clientes "
                + "(nome, cpf, telefone, email) "
                + "VALUES(?,?,?,?)";
        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, entity.getNome());
            ps.setString(2, entity.getCpf());
            ps.setString(3, entity.getTelefone());
            ps.setString(4, entity.getEmail());
            ps.executeUpdate();
            return entity;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void atualizar(Cliente entity) throws Exception {
        String sql = "UPDATE clientes SET "
                + "nome = ?, "
                + "cpf = ?, "
                + "telefone = ?, "
                + "email = ? "
                + "WHERE id = ?";

        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, entity.getNome());
            ps.setString(2, entity.getCpf());
            ps.setString(3, entity.getTelefone());
            ps.setString(4, entity.getEmail());
            ps.setInt(5, entity.getId());
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void excluir(Integer id) throws Exception {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Optional<Cliente> buscarPorId(Integer id) throws Exception {
        String sql = "SELECT nome, cpf, telefone, email "
                + "FROM clientes WHERE id = ?";
        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente cli = (mapearLinhas(rs));
                return Optional.of(cli);
            }
            return Optional.empty();
        } catch (Exception ex) {
            ex.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        String sql = "SELECT nome, cpf, telefone, email "
                + "FROM clientes ORDER BY nome";
        try {
            Connection conexao = getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Cliente> clientes = new ArrayList<>();
            
            while(rs.next()){
                clientes.add(mapearLinhas(rs));
            }
            return clientes;
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    private Cliente mapearLinhas(ResultSet rs) throws SQLException{
        Cliente cli = new Cliente();
        cli.setNome(rs.getString("nome"));
        cli.setCpf(rs.getString("cpf"));
        cli.setTelefone(rs.getString("telefone"));
        cli.setEmail(rs.getString("email"));
        return cli;
    }
}
