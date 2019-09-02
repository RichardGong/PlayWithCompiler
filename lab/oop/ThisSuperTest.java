package play;

public class ThisSuperTest {

    public static void main(String args[]){
        Cow cow = new Cow();
        System.out.println();
        cow.speak();
    }
}


/**
 this-and-super.play 面向对象的this和super特性。
 */
class Mammal{
    int weight;

    public Mammal(){
        System.out.println("Mammal() called");
        this.weight = 100;
    }

    Mammal(int weight){
        this();                   //调用另一个构造函数
        System.out.println("Mammal(int weight) called");
        this.weight = weight;
        this.speak();             //这里多态仍然会生效，实际调用的是Cow的speak方法
    }

    void speak(){
        System.out.println("Mammal speaking...");
    }
}


class Cow extends Mammal{
    int weight = 300;

    public Cow(){
        super(200);   //调用父类的构造函数
    }

    void speak(){
        System.out.println("in Cow.speak");

        System.out.println("super.weight : "  + super.weight);
        System.out.println("this.weight : "  + this.weight);

        System.out.println("call super.speak() : " );
        super.speak();

        System.out.println("Cow speak is : moo~~ moo~~");
    }
}

