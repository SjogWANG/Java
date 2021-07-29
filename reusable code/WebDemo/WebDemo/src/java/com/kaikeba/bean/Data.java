package com.kaikeba.bean; 
import java.util.List; 
public class Data{
    public List<Link> links;
    public String type;

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Data{" + "links=" + links + ", type=" + type + '}';
    }
    
    
    
}
