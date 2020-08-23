# 利用SpringBoot框架，支持内嵌Tomcat运行，并同时支持JSP文件

## 目标
- 使用SpringBoot框架打包
- 支持JSP格式文件（项目移植需要）
- 不依赖外部Tomcat容器运行
- 使用内嵌Tomcat容器运行，独立的执行程序包
- （独立的执行程序包，也可以作为contos的service程序运行，支援start，stop，status指令）

## 思路
- 由于需要支持JSP格式，那么文件最终只能打包为WAR格式
- 新的1.3.0版本开始，SpringBoot已经可以支持WAR直接运行了

## 运行服务器
- 下载代码，进入到项目目录
- mvn package，生成最终TestWar-1.0-SNAPSHOT.war文件
- cd target
- java -jar TestWar-1.0-SNAPSHOT.war
- 可以看到程序跑了起来，最终显示：Started Application in xxx seconds ...

## 测试方法
- 访问: http://localhost:8080/index.html，显示JSP内容
  - 对应文件在：/src/main/java/com/test/Application.java
  - 对应JSP在：/src/main/webapp/WEB-INF/jsp/index.jsp
- 访问：http://localhost:8080/test.html，显示JSP内容
  - 对应文件在：/src/main/java/com/test/Application.java
  - 对应JSP在：/src/main/webapp/WEB-INF/jsp/test.jsp
- 访问：http://localhost:8080/run.html，显示静态html内容
  - 对应文件在：/src/main/webapp/run.html
- 访问：http://localhost:8080/cover.html，显示静态html内容
  - 对应文件在：/src/main/resources/static/cover.html
