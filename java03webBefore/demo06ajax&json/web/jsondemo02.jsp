<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<%--		JSON 值可以是：
			§ 数字（整数或浮点数）
			§ 字符串（在双引号中）
			§ 逻辑值（true 或 false）
			§ 数组（在方括号中）{”person“:[{},{}]}
			§ 对象（在花括号中）{"address":{"p":"sfd"}}
            null--%>
<script>
    var person={"name":"zhangsan",'age':20,sex:true};

    //遍历获取值
    /*for (let oo in person) {
        alert(oo+":"+person[oo]);
    }*/
    var per=
        [
            {one:"tianjing"},{two:"nanjing"},{three:"shanghai"}
        ]
    //遍历获取
    for (var i=0;i<per.length;i++)
    {
        var p=per[i];
        for (let x in p) {
            alert(x+","+p[x]);
        }
    }

</script>
<body>

</body>
</html>