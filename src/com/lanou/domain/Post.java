package com.lanou.domain;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class Post {
    private int id;//主键id
    private String pname;//职务名称

    public Post() {
    }

    public Post(int id, String pname) {
        this.id = id;
        this.pname = pname;
    }

    public Post(String pname) {
        this.pname = pname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                '}';
    }
}
