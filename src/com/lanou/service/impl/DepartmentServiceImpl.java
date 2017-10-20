package com.lanou.service.impl;

import com.lanou.dao.DepartmentDao;
import com.lanou.dao.impl.DepartmentDaoImpl;
import com.lanou.domain.Department;
import com.lanou.service.DepartmentService;

import java.util.List;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    public DepartmentServiceImpl() {
        departmentDao = new DepartmentDaoImpl();
    }

    @Override
    public List<Department> findAll() {
        String hql = "from Department";
        return departmentDao.findAll(hql);
    }

    @Override
    public Department findById(int departId) {
        return departmentDao.findById(departId);
    }

    @Override
    public List<Department> find(String hql, Map<String, Object> param) {
        return departmentDao.find(hql, param);
    }
}
