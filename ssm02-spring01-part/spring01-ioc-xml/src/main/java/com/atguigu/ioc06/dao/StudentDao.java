package com.atguigu.ioc06.dao;

import com.atguigu.ioc06.pojo.Student;

import java.util.List;

/**
 * projectName: com.atguigu.dao
 *
 * @author: 赵伟风
 * description: 数据层的接口
 */
public interface StudentDao {

    /**
     * 数据库查询全部学生数据
     * @return
     */
    List<Student> queryAll();
}
