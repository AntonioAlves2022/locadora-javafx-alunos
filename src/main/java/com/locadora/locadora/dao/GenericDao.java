/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locadora.locadora.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author judok
 */
public interface GenericDao<T,ID> {
    T salvar(T entity) throws Exception;
    void atualizar(T entity)throws Exception;
    void excluir(ID id) throws Exception;
    Optional<T> buscarPorId(ID id) throws Exception;
    List<T> buscarTodos() throws Exception;
    
}
