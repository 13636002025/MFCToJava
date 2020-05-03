public class AFactory implements Factory{
    @Override
    public Fruit CreateFruit() {
        return new Apple();
    }
}
