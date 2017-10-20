package com.lanou.service;

import com.lanou.domain.Department;

import java.util.List;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface DepartmentService {
    List<Department> findAll();

    Department findById(int departId);

    List<Department> find(String hql, Map<String, Object> param);
}
