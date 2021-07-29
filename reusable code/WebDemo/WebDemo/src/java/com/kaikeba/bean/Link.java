package com.kaikeba.bean; 
public class Link{
    public String content;
    public int count;
    public String description;
    public int icon;
    public int id;
    public int sort;
    public String title;
    public int typeId;

    public void setContent(String content) {
        this.content = content;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "Link{" + "content=" + content + ", count=" + count + ", description=" + description + ", icon=" + icon + ", id=" + id + ", sort=" + sort + ", title=" + title + ", typeId=" + typeId + '}';
    }
    
    
    
}
