package com.lanou.service.impl;

import com.lanou.dao.PostDao;
import com.lanou.dao.impl.PostDaoImpl;
import com.lanou.domain.Post;
import com.lanou.service.PostService;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class PostServiceImpl implements PostService {
    private PostDao postDao;

    public PostServiceImpl() {
        postDao = new PostDaoImpl();
    }

    @Override
    public List<Post> findAll() {
        String hql = "from Post";
        return postDao.findAll(hql);
    }

    @Override
    public Post findById(int pid) {
        return postDao.findById(pid, Post.class);
    }
}
