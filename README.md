# Play With Complier
本项目是极客时间的[《编译原理之美》](https://time.geekbang.org/column/intro/219)课程的示例代码。

课程Web网址：https://time.geekbang.org/column/intro/219

或者下载“极客时间”APP，查找《编译原理之美》课程。

## 目录内容
### [lab](lab)
课程实验和资料。
* lab/01 ：第1讲的资料，包含一个pdf文档，是第一课中提到的自动生成parser的工具。
* lab/craft : 第2-5讲的资料。手工实现的简单的词法分析器、语法分析器、计算器、脚本解释器。
  + SimpleLexer.java：一个简单的词法分析器。
  + SimpleCalculator.java：一个简单的计算器，提供了基础的语法分析功能。对表达式的解析会有结合性问题。
  + SimpleParser.java: 一个更好的语法解析器。在左递归、优先级和结合性方面都没有问题。
  + SimpleScript.java：一个简单的脚本解释器。它提供了一个REPL界面，输入命令并执行。   
     比如，输入： java SimpleScript  
     或：java SimpleScript -v  
     -v 参数会让解释器打印AST和求值过程。  
* lab/antlrtest : 第6讲的示例代码。
  + Hello.g4 一个简单的词法规则文件
  + CommonLexer.g4 参考https://github.com/antlr/grammars-v4/blob/master/java/JavaLexer.g4 形成的一个词法文件。
  + PlayScript.g4 参考https://github.com/antlr/grammars-v4/blob/master/java/JavaParser.g4 形成的一个语法文件。
  + ASTEvaluator.java 实现了visitor模式的一个类，对AST遍历，实现表达式求值。
  + PlayScript.java 一个简单的测试程序
  + 其他文件：都是由Antlr解析规则文件后生成的  
  
### [playscript-java](playscript-java)
这是一个java版本的脚本语言的参考实现，课程第7讲之后的示例以该项目为核心。   
详细介绍，参见[playscript-java的说明](playscript-java/README.md)。

### 注意
随着课程进度，会不断更新资料内容和本文档的内容。   
本项目的代码也会处在不断的变化中。
