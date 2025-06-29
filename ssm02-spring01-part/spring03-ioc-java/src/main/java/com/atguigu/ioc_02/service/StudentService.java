package com.atguigu.ioc_02.service;


import com.atguigu.ioc_02.pojo.Student;

import java.util.List;

/**
 * projectName: com.atguigu.service
 *
 * @author: 赵伟风
 * description: 学员的业务接口
 */
public interface StudentService {

    List<Student> findAll();
}
