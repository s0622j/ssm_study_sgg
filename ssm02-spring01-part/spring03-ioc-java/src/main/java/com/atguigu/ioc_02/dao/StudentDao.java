package com.atguigu.ioc_02.dao;


import com.atguigu.ioc_02.pojo.Student;

import java.util.List;

/**
 * projectName: com.atgguigu.dao
 *
 * @author: 赵伟风
 * description: 学员持久层访问接口
 */
public interface StudentDao {

    List<Student> queryAll();
}
