# playscript（java版本）
playscript是在准备《编译原理之美》课程期间开发的一门脚本语言。主要用来展示编译器的前端技术。   
这门语言目前实现的特征是：   
* 语法特征总体上比较像java，因为这一版本的词法和语法规则文件都是借鉴java语言的规则。
* 静态类型：支持int、long、float、double等基础数据类型。
* 支持函数，并且函数是一等公民，可以嵌套声明函数，支持闭包。 
* 支持面向对象特性。  
* Coming soon: 很快将添加一些测试用例，展示脚本的功能。

## 构建和运行
从代码库中克隆下代码以后，可以基于源代码构建一个项目。或者使用里面原来带的idea项目文件。   
本项目依赖Antlr的运行库。相应的jar包已经包含在了lib目录下。   
其中主要的类：
* PlayScript.java 程序入口。你可以这样使用这个程序： 
  + java play.PlayScript 这将启动一个REPL界面，在里面输入脚本，并解释执行。
  + java play.PlayScript filename 这将解释执行一个脚本文件。
  + 如果你要跟踪调试程序，可以在PlayScript.java类的main方法中修改script的值，测试执行情况。
* PlayScriptCompiler.java 将语法分析器和词法分析器进行了封装。
* AnnotatedTree.java 对AST所做的属性标注，语义分析的结果都放在这里。
* AttributeEvaluator.java 语义分析程序。
* ASTEvaluator.java 解释器，对AST遍历求值。

---
## 注意
该目录下的代码会随时更新。
