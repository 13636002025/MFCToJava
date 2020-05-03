public class BFactory implements Factory{
    @Override
    public Fruit CreateFruit() {
        return new Banana();
    }
}
