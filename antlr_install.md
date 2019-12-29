# Antlr的安装、配置和使用

在《编译原理之美》课程中，很多同学在使用antlr的时候遇到了障碍。这里把安装、配置和使用整理一下，供大家参考。

### 安装Antlr
Antlr是用java写的。所以，使用antlr，只需要下载它的jar文件(当前版本是[antlr-4.7.2-complete.jar](https://www.antlr.org/download/antlr-4.7.2-complete.jar))就可以了。    
下载完毕呢，最好设置一下CLASSPATH环境变量。比如，在MacOs和Linux下，你可以这样设置：   
$ export CLASSPATH=".:/usr/local/lib/antlr-4.7.2-complete.jar:$CLASSPATH"
在windows平台，你要在系统属性对话框中的“环境变量”界面来设置CLASSPATH
  
这样，你就可以在命令行里使用下面的命令来编译Antlr规则文件：   
$ java -jar /usr/local/lib/antlr-4.7.2-complete.jar Expr.g4
其中，Expr.g4是一个规则文件。   
  
但这样的话，命令会有点长。所以，我们可以配置两个别名来减少打字的工作量：
$ alias antlr='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'  
这样，你就可以把前面的命令简化成：
$ antlr Expr.g4   
  
其实，如果你是用MacOs的话，用brew来安装会更简单：  
$ brew install antlr   
它会自动添加两个命令antlr和grun。如果你追根溯源，看看这两个命令是怎么回事，就会发现这是两个Shell脚本。   

在Windows平台上，你也可以做antlr.bat和grun.bat两个批处理文件，放在可执行目录下，达到简化命令的目的。    

### 运行Antlr
1.编译规则文件   
$ antlr Expr.g4
可以带上-visitor等
$ antlr Expr.g4
$ antl



### 在IDE里使用Antlr

