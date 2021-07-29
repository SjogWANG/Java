/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaikeba.service;

import com.kaikeba.bean.Data;
import com.kaikeba.dao.BaseLinkDao;
import com.kaikeba.dao.LinkDao;
import java.util.List;

/**
 *
 * @author Shan
 */
public class LinkService {
    private static BaseLinkDao dao = new LinkDao();
    
    public static List<Data> findAll(){
        return dao.findAll();
    }
    
    public static String findById(int id){
        return dao.findById(id);
    }
    
}
