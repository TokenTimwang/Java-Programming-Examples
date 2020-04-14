package com.timwang.environment;

/**
 * @ Author  : Tim Wang
 * @ FileName: JavaEnvironment.java
 * @ Time    : 2020/4/15 1:05
 */

/*
 * (如何编译一个java文件？)
 * */

// c:\jdk\demoapp> javac First.java

/*
 * 如何运行类文件？
 * */

// c:> java -classpath C:\java\MyClasse1; C:\java\MyClass2 utility.testapp.main

/*
* 如何调试Java文件？
* */

// c:> javac demo.java -g

/*
* 如何设置类路径？
* */

// C:> java -classpath C:\java\DemoClasses utility.demoapp.main

/*
* 如何查看当前的类路径？
* */

// C:> echo %CLASSPATH%

/*
* 如何设置类文件的目的地？
* */

// c:> javac demo.java -d c:\myclasses

/*
* 如何运行已编译的类文件？
* */

// c:\jdk\demoapp>java First

/*
* 如何检查系统上运行的Java版本？
* */

// java -version

/*
* 当类文件位于.jar文件中时，如何设置类路径？
* */

// c:> java -classpath C:\java\myclasses.jar utility.testapp.main