<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Freemarker页面</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <table class="table table-primary table-hover">
        <tr>
            <td>id</td>
            <td>作者</td>
            <td>标题</td>
        </tr>


        <#list articles as article>
            <tr>
                <td>${article.id}</td>
                <td>${article.author}</td>
                <td>${article.title}</td>
            </tr>
        </#list>
    </table>
</div>


<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>