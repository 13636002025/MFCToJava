import com.sun.javaws.jnl.XMLUtils;

public class Client {
    public static void main(String[] args) {
        Factory factory=(Factory) XMLUtil.createFactory();
        Factory factory1=new BFactory();

        Fruit fruit=factory.CreateFruit();
        fruit.eat();

        Fruit fruit1=factory1.CreateFruit();
        fruit1.eat();
    }
}
