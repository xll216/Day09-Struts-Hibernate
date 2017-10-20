package com.lanou.test;

import com.lanou.dao.DepartmentDao;
import com.lanou.dao.PostDao;
import com.lanou.dao.StaffDao;
import com.lanou.dao.impl.DepartmentDaoImpl;
import com.lanou.dao.impl.PostDaoImpl;
import com.lanou.dao.impl.StaffDaoImpl;
import com.lanou.domain.Department;
import com.lanou.domain.Post;
import com.lanou.domain.Staff;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class MainTest {
    SessionFactory sessionFactory;

    @Before
    public void init() {
        sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
    }

    /**
     * 插入原始数据
     **/
    @Test
    public void save() {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //创建数据
        Department department = new Department("教学部");
        Post post = new Post("教学总监");
        Post post1 = new Post("Java主管");
        Post post2 = new Post("Java讲师");

        department.getPosts().add(post);
        department.getPosts().add(post1);
        department.getPosts().add(post2);

        session.save(department);//保存教学部

        Department department1 = new Department("职规部");
        Post post3 = new Post("职规主管");
        Post post4 = new Post("班主任");

        department1.getPosts().add(post3);
        department1.getPosts().add(post4);

        session.save(department1);//保存职规部

        Staff staff = new Staff("大表姐");
        staff.setPost(post2);//java讲师
        staff.setDepartment(department);//教学部

        session.save(staff);//保存大表姐

        Staff staff1 = new Staff("欣欣姐");
        staff1.setPost(post4);//班主任
        staff1.setDepartment(department1);//职规部

        session.save(staff1);//保存欣欣姐

        transaction.commit();
    }

    /**
     * dao层的单元测试
     **/
    @Test
    public void testDao() {
        //查询部门集合
        DepartmentDao departDao = new DepartmentDaoImpl();

        List<Department> departments = departDao
                .findAll("from Department");

        for (Department de : departments) {
            System.out.println(de);
        }

        //查询职务表中的所有数据
        PostDao postDao = new PostDaoImpl();
        List<Post> posts = postDao.find(
                "from Post", null);

        for (Post post : posts) {
            System.out.println(post);
        }

        //查询员工表中的所有数据
        StaffDao staffDao = new StaffDaoImpl();
        List<Staff> staffs = staffDao.find(
                "from Staff", null);
        for (Staff staff : staffs) {
            System.out.println(staff + " " + staff.getDepartment()
                    + "  " + staff.getPost());
        }

        //查询名字叫大表姐的员工
        String hql = "from Staff where sname=:name";
        Map<String, Object> params = new HashMap<>();
        params.put("name", "大表姐");

        Staff staff = staffDao.findSingle(hql, params);
        System.out.println(staff);
    }
}
