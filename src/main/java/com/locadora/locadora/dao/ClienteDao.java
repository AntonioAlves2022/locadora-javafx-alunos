/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locadora.locadora.dao;

import com.locadora.locadora.models.Cliente;

/**
 *
 * @author judok
 */
public interface ClienteDao extends GenericDao<Cliente, Integer> {
    Cliente buscarPorCpf(String cpf) throws Exception;
}
