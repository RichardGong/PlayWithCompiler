# Antlr的安装、配置和使用

在学习[《编译原理之美》](https://time.geekbang.org/column/intro/100034101)的过程中，很多同学在使用antlr的时候遇到了一些障碍。这些障碍基本都是环境配置的问题，所以这里把Antlr的安装、配置和使用的要点整理一下，供大家参考。

### 安装Antlr
Antlr是用java写的。所以，使用antlr，只需要下载它的jar文件(当前版本是[antlr-4.7.2-complete.jar](https://www.antlr.org/download/antlr-4.7.2-complete.jar))就可以了。    
下载完毕呢，最好设置一下CLASSPATH环境变量。比如，在MacOs和Linux下，你可以这样设置：   
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"   
在windows平台，你要在系统属性对话框中的“环境变量”界面来设置CLASSPATH
  
这样，你就可以在命令行里使用下面的命令来编译Antlr规则文件：   
$ java -jar /usr/local/lib/antlr-4.7.2-complete.jar PlayScript.g4   
其中，PlayScript.g4是一个规则文件。   
  
但这样的话，命令会有点长。所以，我们可以配置两个别名来减少打字的工作量：  
$ alias antlr='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'   
$ alias grun='java org.antlr.v4.gui.TestRig'  
这样，你就可以把前面的命令简化成：  
$ antlr PlayScript.g4   
  
其实，如果你是用MacOs的话，用HomeBrew来安装会更简单：  
$ brew install antlr   
它会自动添加两个命令antlr和grun。如果你追根溯源，看看这两个命令是怎么回事，就会发现这是两个Shell脚本文件。   

在Windows平台上，你也可以制作antlr.bat和grun.bat两个批处理文件，放在可执行目录下，达到简化命令的目的。    
antlr4.bat: java org.antlr.v4.Tool %*   
grun.bat:   java org.antlr.v4.gui.TestRig %*   

### 运行Antlr
1.编译规则文件   
$ antlr PlayScript.g4
还可以带上一些参数，比如：    
-visitor：生成与visitor模式有关的类。   
-nolistener：不生成listener类。  
-package:指定生成的java类的package。  

2.测试语法规则   
使用grun命令，可以用生成的编译器来解析你写的程序，比如：   
$ grun antlrtest.PlayScript expression -gui   
其中:    
-gui参数告诉grun，用图形化的方式来显示生成的AST。否则，它会在终端用lisp的括号嵌套括号的方式显示。  
expression参数是.g4文件中的一条语法规则，所生成的AST的根节点就是代表这个规则的节点。   

特别注意：  
使用grun是同学们遇到问题最多的地方。最重要的问题，就是目录不对，找不到生成的编译器。
假设你生成的java类在/Users/richard/antlr/play目录下，其中play是package的名称，你应该在/Users/richard/antlr目录下运行grun命令，并且让CLASSPATH包含这个目录。否则，就会报找不到lexer或parser的错误。

### 在IDE里使用Antlr  
很多IDE现在都支持Antlr，包括自动下载依赖项、g4文件语法加亮、错误检测、代码跳转等。   
具体说明可以参见[这个链接](https://www.antlr.org/tools.html)。



