package com.lanou.dao;

import com.lanou.domain.Department;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface DepartmentDao extends BaseDao<Department> {
    /**
     * 根据id查询某个部门
     *
     * @param departId 查询的部门id
     **/
    Department findById(int departId);

}
