/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locadora.locadora.service;

import com.locadora.locadora.models.Cliente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author judok
 */
public interface ClienteService {
    Cliente salvar(Cliente cliente) throws Exception;
    void atualizar(Cliente cliente) throws Exception;
    void excluir(Integer id) throws Exception;
    Optional<Cliente> buscarPorId(Integer id) throws Exception;
    Optional<Cliente> buscarPorCpf(String cpf) throws Exception;
    List<Cliente> buscarTodos() throws Exception;
}
