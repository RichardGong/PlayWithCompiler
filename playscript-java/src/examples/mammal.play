/**
mammal.play 演示面向对象编程：继承和多态。
*/

class Mammal{
    boolean canSpeak(){
        return true;
    }

    void speak(){
        println("mammal speaking...");
    }
}

class Cow extends Mammal{
    void speak(){
        println("moo~~ moo~~");
    }
}

class Sheep extends Mammal{
    void speak(){
        println("mee~~ mee~~");
    }
}

//将子类的实例赋给父类的变量
Mammal a = Cow();
Mammal b = Sheep();

//canSpeak()方法是继承的
println("a.canSpeak() : " + a.canSpeak());
println("b.canSpeak() : " + b.canSpeak());

//下面两个的叫声会不同。在运行期动态绑定方法。
a.speak();  //会打印牛叫
b.speak();  //会打印羊叫


