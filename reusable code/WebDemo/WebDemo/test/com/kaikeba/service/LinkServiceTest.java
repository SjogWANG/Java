/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaikeba.service;

import com.kaikeba.bean.Data;
import java.util.List;

/**
 *
 * @author Shan
 */
public class LinkServiceTest {
    
    public static void  findAll(){
        List<Data> data = LinkService.findAll();
        System.out.println(data);
    }
    
    public static void findById(){
        String link = LinkService.findById(100);
        System.out.println(link);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        findAll();
        findById();
    }
    
}
