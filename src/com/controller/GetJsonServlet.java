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
import java.util.List;

//  和web.xml  <servlet              -------注意 有 /
@WebServlet(name = "GetJsonServlet",urlPatterns = "/GetJsonServlet")
public class GetJsonServlet extends HttpServlet {
    //service 可以接受get 也可以接受 post 请求
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        //web , controller 是提供json 数据的，那么 我们需要一个 处理 josn 的lib包
        //这个lib包叫做 fastjson ，阿里巴巴出品，很厉害

        //学习json和fastjson

        //使用fastjson 把 对象 转换成 json 数据
        List<Student> students = new ArrayList<>();
        Student s1 = new Student();
                s1.setId(1);
                s1.setAge(21);
                s1.setName("滴滴");
                students.add(s1);

        Student s2 = new Student();
                s2.setId(2);
                s2.setAge(18);
                s2.setName("哒哒");
                students.add(s2);

        Student s3 = new Student();
                s3.setId(3);
                s3.setAge(20);
                s3.setName("刘刘");
                students.add(s3);

        String string = JSON.toJSONString(students);
        System.out.println("string = " + string);//把对象转换成了json格式的字符串

        //输出到前端
        //1.解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        //2.开始输出
        PrintWriter writer = resp.getWriter();
        writer.println(string);
        writer.close();
    }
}
