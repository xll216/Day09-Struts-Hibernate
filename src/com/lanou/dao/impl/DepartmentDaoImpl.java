package com.lanou.dao.impl;

import com.lanou.dao.DepartmentDao;
import com.lanou.domain.Department;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class DepartmentDaoImpl extends BaseDaoImpl<Department>
        implements DepartmentDao {
    @Override
    public Department findById(int departId) {
        //查询语句
        String hql = "from Department where id=:id";

        //查询语句中的参数
        Map<String, Object> param = new HashMap<>();
        param.put("id", departId);

        return findSingle(hql, param);//单项查询
    }
}
