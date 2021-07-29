/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaikeba.dao;

import com.kaikeba.bean.Data;
import java.util.List;

/**
 *
 * @author Shan
 */
public interface BaseLinkDao {
   
    /**
     * get all the link information
     * @return 
     */
    public List<Data> findAll();
   
    /**
     * get link by id
     * @param id
     * @return 
     */
    String findById(int id);


}
