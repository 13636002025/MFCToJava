public class Factory {
    //构造工厂
    public Fruit CreateFruit(String Kind){
        if (Kind.equals("A"))
            return new Apple();
        if (Kind.equals("B"))
            return new Banana();
        return null;
    }
}
