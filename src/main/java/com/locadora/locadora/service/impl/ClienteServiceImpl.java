/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locadora.locadora.service.impl;

import com.locadora.locadora.models.Cliente;
import com.locadora.locadora.service.ClienteService;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author judok
 */
public class ClienteServiceImpl implements ClienteService{

    @Override
    public Cliente salvar(Cliente cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Cliente cliente) throws Exception {
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
    public Optional<Cliente> buscarPorCpf(String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void validarCliente(Cliente c) throws Exception{
        if(c.getCpf() == null || c.getCpf().isBlank()){
            throw new Exception("O CPF deve ser informado");
        }
        
        if(c.getCpf().length() < 11){
            
        }
    }
    
}
