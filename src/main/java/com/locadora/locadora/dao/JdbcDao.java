/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locadora.locadora.dao;

import com.locadora.locadora.db.DBConnection;
import java.sql.Connection;

/**
 *
 * @author judok
 */
public abstract class JdbcDao {
    protected Connection getConnection() throws Exception{
        return DBConnection.getConnection();
    }
}
