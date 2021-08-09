package com.controller;

import com.alibaba.fastjson.JSON;
import com.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "LayuiServlet",urlPatterns = "/LayuiServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utu-8");
        resp.setCharacterEncoding("utf-8");

        //去创建一个layui 后台的json格式
        List<Student> students = new ArrayList<>();
        //创建15条学生数据
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("学生1");
        s1.setAge(18);
        students.add(s1);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("学生2");
        s2.setAge(17);
        students.add(s2);

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("学生3");
        s3.setAge(16);
        students.add(s3);

        Student s4 = new Student();
        s4.setId(4);
        s4.setName("学生4");
        s4.setAge(15);
        students.add(s4);


        Student s5 = new Student();
        s5.setId(5);
        s5.setName("学生5");
        s5.setAge(15);
        students.add(s5);

        Student s6 = new Student();
        s6.setId(6);
        s6.setName("学生6");
        s6.setAge(14);
        students.add(s6);

        Student s7 = new Student();
        s7.setId(7);
        s7.setName("学生7");
        s7.setAge(13);
        students.add(s7);

        Student s8 = new Student();
        s8.setId(8);
        s8.setName("学生8");
        s8.setAge(12);
        students.add(s8);

        Student s9 = new Student();
        s9.setId(9);
        s9.setName("学生9");
        s9.setAge(11);
        students.add(s9);


        Student s10 = new Student();
        s10.setId(10);
        s10.setName("学生10");
        s10.setAge(10);
        students.add(s10);

        Student s11 = new Student();
        s11.setId(01);
        s11.setName("学生11");
        s11.setAge(9);
        students.add(s11);

        Student s12 = new Student();
        s12.setId(12);
        s12.setName("学生12");
        s12.setAge(8);
        students.add(s12);

        Student s13 = new Student();
        s8.setId(13);
        s8.setName("学生13");
        s8.setAge(7);
        students.add(s8);

        Student s14 = new Student();
        s14.setId(14);
        s14.setName("学生14");
        s14.setAge(6);
        students.add(s14);


        Student s15 = new Student();
        s15.setId(15);
        s15.setName("学生15");
        s15.setAge(5);
        students.add(s15);


        Map map = new HashMap<>();
        map.put("code",0);//默认必须是0 不然不显示
        map.put("msg","写啥都行");
        map.put("count",15);
        map.put("data",students);

        String s = JSON.toJSONString(map);//使用alibaba的转换
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }

}
