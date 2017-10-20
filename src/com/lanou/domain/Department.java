package com.lanou.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class Department {
    private int id;//主键id
    private String dname;//部门名称
    //该部门下面的职务集合
    private Set<Post> posts = new HashSet<>();

    public Department() {
    }

    public Department(int id, String dname, Set<Post> posts) {
        this.id = id;
        this.dname = dname;
        this.posts = posts;
    }

    public Department(int id, String dname) {
        this.id = id;
        this.dname = dname;
    }

    public Department(String dname) {
        this.dname = dname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                '}';
    }
}
