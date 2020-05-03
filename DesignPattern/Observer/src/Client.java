public class Client {
    public static void main(String[] args) {
        SubjectS subject=new ConcreteSubjectB();
        ObserverO observer1=new ConcreteObserver1();
        ObserverO observer2=new ConcreteObserver2();
        subject.Add(observer1);
        subject.Add(observer2);
        subject.notifyObserver();
    }
}
