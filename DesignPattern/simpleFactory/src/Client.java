public class Client {
    public static void main(String[] args) {
        Factory factory=new Factory();

        Fruit fruit=factory.CreateFruit("A");
        fruit.eat();

        Fruit fruit1=factory.CreateFruit("B");
        fruit1.eat();
    }
}
