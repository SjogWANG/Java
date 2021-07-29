package com.kaikeba.bean; 

import com.alibaba.fastjson.JSON;

public class Message{
    public Object data;
    public String msg;
    public int status;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    /**
     * convert java object into JSON format characters
     * @return 
     */
    public String toJSON(){
        
        return JSON.toJSONString(this);
    }
    
}
