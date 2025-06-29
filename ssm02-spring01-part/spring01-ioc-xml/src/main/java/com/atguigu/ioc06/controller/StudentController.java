package com.atguigu.ioc06.controller;

import com.atguigu.ioc06.pojo.Student;
import com.atguigu.ioc06.service.StudentService;

import java.util.List;

/**
 * projectName: com.atguigu.controller
 *
 * @author: 赵伟风
 * description:
 */
public class StudentController {

    private StudentService studentService;


    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("最终学员数据:"+all);
    }

}
