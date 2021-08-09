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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "LayuiServlet", urlPatterns = "/LayuiServlet")
public class LayuiServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        // 去自己 创建一个 layui 后台的json格式
        List<Student> students = new ArrayList<>();
        ;
        // 创建3个学生
        Student s1 = new Student();
        s1.setName("唐僧");
        s1.setAge(50);
        s1.setId(001);
        s1.setBirthday(new Date());
        s1.setShen(false);
        students.add(s1);
        Student s2 = new Student();
        s2.setName("猪头");
        s2.setAge(50);
        s2.setId(002);
        s2.setShen(true);
        String bdate="1980-09-07 23:12:45";
        SimpleDateFormat simpleDateFormat=
                new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date bDate = null;
        try {
            bDate = simpleDateFormat.parse(bdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        s2.setBirthday(bDate);
        students.add(s2);
        Student s3 = new Student();
        s3.setName("猴子");
        s3.setAge(24234);
        s3.setId(003);
        s3.setBirthday(new Date());
        s3.setShen(true);
        students.add(s3);
        Map map = new HashMap<>();
        map.put("code", 0);// 默认必须是0 不然 不显示
        map.put("msg", "写啥都行");
        map.put("count", 3);
        map.put("data", students);
        System.out.println("students = " + students);
        String s = JSON.toJSONString(map); // 使用alibaba 的 转换
        System.out.println("s = " + s);
        PrintWriter writer = resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
