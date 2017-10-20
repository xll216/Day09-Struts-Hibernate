package com.lanou.service;

import com.lanou.domain.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface StaffService {
    /**
     * 查询所有
     **/
    List<Staff> findAll();

    /**
     * 根据查询条件进行模糊查询
     *
     * @param hql   查询语句
     * @param param 查询语句中包含的参数
     **/
    List<Staff> find(String hql, Map<String, Object> param);
}
