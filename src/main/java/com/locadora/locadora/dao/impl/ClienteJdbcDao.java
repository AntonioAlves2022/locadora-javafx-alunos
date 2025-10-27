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
import java.util.List;
import java.util.Optional;

/**
 *
 * @author judok
 */
public class ClienteJdbcDao extends JdbcDao implements ClienteDao{

    @Override
    public Cliente buscarPorCpf(String cpf) throws Exception {
         String sql = "SELECT * FROM clientes WHERE cpf = ?";      
         try{
             Connection conexao = getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             if(rs.next()){
                 Cliente cli = new Cliente();
                 cli.setNome(rs.getString("nome"));
                 cli.setCpf(rs.getString("cpf"));
                 cli.setTelefone(rs.getString("telefone"));
                 cli.setEmail(rs.getString("email"));
                 return cli;
             }else{
                 return null;
             }
         }catch(Exception ex){
             ex.printStackTrace();
             return null;
         }

    }

    @Override
    public Cliente salvar(Cliente entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Cliente entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Cliente> buscarPorId(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
