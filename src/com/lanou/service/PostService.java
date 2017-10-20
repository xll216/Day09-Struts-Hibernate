package com.lanou.service;

import com.lanou.domain.Post;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface PostService {
    List<Post> findAll();

    Post findById(int pid);
}
