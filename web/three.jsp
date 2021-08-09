<%--
  Created by IntelliJ IDEA.
  User: 刘顺顺
  Date: 2021/8/4
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>

        <select id="sheng">
            <option value="1">河南省</option>
        </select>
        <select id="city">
            <option value="1">郑州市</option>
        </select>
        <select id="qu">
            <%--<option value="1">管城区</option>--%>
        </select>


    <script>
        $(function () {
            //1.aiax 访问 后台
            $.ajax({
                url:'/AllCityServlet',
                type:'GET',
                data:'',
                dataType:'JSON',
                success:function (res) {
                    // console.log(res)
                    $.each(res.citylist,function (index,item) {
                        //console.log(index)

                        $("#sheng").empty();
                        $("#sheng").append("<option value="+item.p+">"+item.p+"</option>")


                        $.each(item.c,function (index,item) {

                            $("#city").empty();
                            $("#city").append("<option value="+item.n+">"+item.n+"</option>")

                            $.each(item.a,function (index,item) {
                                console.log(item)
                                console.log($(this))
                                //$("#quu").empty();
                                $("#qu").append("<option value="+item.s+">"+item.s+"</option>")

                            });
                        });

                    });
                }
            });
        });
    </script>

</body>
</html>
