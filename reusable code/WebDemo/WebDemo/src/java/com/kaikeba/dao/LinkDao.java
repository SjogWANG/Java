/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaikeba.dao;

import com.kaikeba.bean.Data;
import com.kaikeba.bean.Link;
import com.kaikeba.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shan
 */
public class LinkDao implements BaseLinkDao {
    
    private static final String SQL_FIND_ALL = "SELECT * FROM kkb_type t, kkb_link l WHERE t.id = l.type_id ORDER BY t.sort, l.sort";
    private static final String SQL_FIND_BY_ID = "SELECT content FROM kkb_link WHERE id = ?";
    
    @Override
    public List<Data> findAll()
    {
        //1. declare variable to store information fetch from database table
        List<Data> data = new ArrayList<>();
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            //2. connect database
            conn = DBUtil.getConn();
            //3. prepare sql statement
            statement = conn.prepareStatement(SQL_FIND_ALL);
            //4. execute sql
            resultSet = statement.executeQuery();
            //5. fetch result
            int tempSort = 0;
            Data d1 = null;
            List<Link> links = null;
     
            while(resultSet.next()){
                //5.1 get "sort" value of current record
                int sort = resultSet.getInt("t.sort");
                //new "sort" 
                if(tempSort != sort){
                    
                    tempSort = sort;
                    //5.2 create new Data to store result
                    d1 = new Data();
                    String name = resultSet.getString("t.name");
                    //set Type name
                    d1.setType(name);
                    //5.3 craete new link list
                    links = new ArrayList<>();
                    d1.setLinks(links);
                    //add d1 into data list
                    data.add(d1);

                }
                //5.4 for each result, store into links
                Link link = new Link();
                link.setContent(resultSet.getString("l.content"));
                link.setCount(resultSet.getInt("l.count"));
                link.setDescription(resultSet.getString("l.description"));
                link.setIcon(resultSet.getInt("l.icon"));
                link.setId(resultSet.getInt("l.id"));
                link.setSort(resultSet.getInt("l.sort"));
                link.setTitle(resultSet.getString("l.title"));
                link.setTypeId(resultSet.getInt("l.type_id"));
                links.add(link);
                
            }
       
            
        }
        catch(SQLException throwables)
        {
            //6. close connection
            throwables.printStackTrace();
        }finally{
            DBUtil.close(conn, statement, resultSet);
        }
        return data;
    }

    @Override
    public String findById(int id) {
        
        //1.declare variables
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            //2. connect database
            conn = DBUtil.getConn();
            //3. prepare sql statement
            statement = conn.prepareStatement(SQL_FIND_BY_ID);
            statement.setInt(1, id);
            //4. execute sql
            resultSet = statement.executeQuery();
            //5. fetch result
            
            while(resultSet.next()){
                //5.1 get "sort" value of current record
                return resultSet.getString("content");

            }   
        }

        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }finally{
            DBUtil.close(conn, statement, resultSet);
        }
        return null;
    }
    
}
