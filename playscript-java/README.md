# playscript（java版本）
playscript是在准备《编译原理之美》课程期间开发的一门脚本语言。主要用来展示编译器的前端技术。   
这门语言目前实现的特征是：   
* 语法特征总体上比较像java，因为这一版本的词法和语法规则文件都是借鉴java语言的规则。
* 静态类型：支持int、long、float、double等基础数据类型。
* 支持函数，并且函数是一等公民，可以嵌套声明函数，支持闭包。 
* 支持面向对象特性。  
* Coming soon: 很快将添加更多的脚本用例，展示playscript的功能。

### 构建和开发
从代码库中克隆下代码以后，可以基于源代码构建一个项目。或者使用里面原来带的idea项目文件。后面我将提供Maven的项目文件。  
本项目依赖Antlr的运行库。相应的jar包已经包含在了[lib目录](lib)下。  
在idea项目中，我设置了一个PlayScript scratch任务，可以解析执行examples目录中的scratch.play文件。你可以在这个文件里随意写一些脚本，并编译执行，或者跟踪调试。

### 运行playscript
在运行之前：
* 要设置好本机的java环境；
* 设置好CLASSPATH,让java能够找到play包中的类。    
     
命令行工具 java play.PlayScript     
>usage: java play.PlayScript [-h | --help | -o outputfile | -S | -v | -ast-dump] [scriptfile]  
>	-h or --help : print this help information  
>	-v verbose mode : dump AST and symbols   
>	-ast-dump : dump AST in lisp style   
>	-o outputfile : file pathname used to save generated code, eg. assembly code   
>	-S : compile to assembly code   
>	scriptfile : file contains playscript code   

举例:   
>java play.PlayScript    
>这将启动一个REPL界面，在里面输入脚本，并解释执行。   

>java play.PlayScript -v   
>REPL模式，并打印AST和符号表   

>java play.PlayScript scratch.play   
>编译和执行scratch.play脚本   

>java play.PlayScript -v scratch.play   
>编译和执行scratch.play脚本，并输出AST和符号表   

设置你的bash命令，可以使用起来更方便，比如，我在.bash_profile文件中添加了：    
>alias play='java play.PlayScript'   
这样，运行一个.play脚本的时候，可以很简单：  
>play scratch.play

### examples目录中的示例脚本
添加了一些示例脚本，来演示playscript的功能，大家可以玩一玩！    
* [expressions.play](src/examples/expressions.play) 各种表达式功能。
* [BlockScope.play](src/examples/BlockScope.play) 块作用域。
* [loop.play](src/examples/loop.play) for和while循环，以及break语句。
* [function.play](src/examples/function.play) 基本的函数功能。
* [regression.play](src/examples/regression.play) 递归函数功能。递归函数对语义分析有一定要求，要在函数定义完毕之前就能引用它。这个例子用递归方式显现了斐波那契数列的计算。
* [FirstClassFunction.play](src/examples/FirstClassFunction.play) 作为一等公民的函数，可以像数值一样给变量赋值，或者作为函数参数和返回值。
* [LinkedList.play](src/examples/LinkedList.play) 实现了一个简单的链表，并且演示了高阶函数功能，有点像javascript的map函数。
* [closure.play](src/examples/closure.play) 基础的闭包特性。
* [closure-fibonacci.play](src/examples/closure-fibonacci.play) 用闭包特性实现了斐波那契数列的计算。
* [closure-mammal.play](src/examples/closure-mammal.play) 用闭包特性实现了斐波那契数列。这个闭包特性还比普通的函数闭包更强。它能让多个函数共享一个闭包，就像对象的多个方法可以共享对象属性一样。
* [UseBeforeDeclare.play](src/examples/UseBeforeDeclare.play) 对于各种自定义类型和类的成员，可以在声明之前就使用。语义分析时能正确的解析出来。
* [ClassTest.play](src/examples/ClassTest.play) 面向对象的基本特性，包括构造函数、缺省构造函数、访问对象属性和方法。
* [mammal.play](src/examples/mammal.play) 演示面向对象功能，比如继承和多态。
* 

### 项目中主要的示例代码
* [PlayScript.java](src/main/play/PlayScript.java) 程序入口。
* [PlayScriptCompiler.java](src/main/play/PlayScriptCompiler.java) 将语法分析器和词法分析器进行了封装。
* [AnnotatedTree.java](src/main/play/AnnotatedTree.java) 对AST所做的属性标注，语义分析的结果都放在这里。
* [ASTEvaluator.java](src/main/play/ASTEvaluator.java) 解释器，对AST遍历求值。
* [TypeAndScopeScanner.java](src/main/play/TypeAndScopeScanner.java) 语义分析-1：检测所有的自定义类型，包括函数；同时建立起Scope树。
* [TypeResolver.java](src/main/play/TypeResolver.java) 语义分析-2：类型消解，包括变量声明、函数返回值、类的父类。
* [RefResolver.java](src/main/play/RefResolver.java) 语义分析-3：引用消解，包括变量引用、函数调用。同时做自下而上的类型推断。
* [TypeChecker.java](src/main/play/TypeChecker.java) 语义分析-4：类型检查。
* [SematicValidator.java](src/main/play/SematicValidator.java) 语义分析-5：剩余所有的语义分析。

---
## 注意
该目录下的代码会随时更新。
