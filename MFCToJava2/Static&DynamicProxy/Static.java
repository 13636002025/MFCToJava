
public class Static {
	public static void main(String args[]) {
		Cat cat = new Cat();
		CatProxy catProxy = new CatProxy(cat);
		catProxy.action();
		catProxy.breath();
	}

}

interface Animal {
	
	public void action();
	public void breath();
}

class Cat implements Animal{
	
	public void action() {
		System.out.println("喵喵喵");
	}

	@Override
	public void breath() {
		System.out.println("猫的呼吸");
	}
}

class CatProxy implements Animal{
	
	Cat cat;
	
	CatProxy(Cat cat) {
		this.cat=cat;
	}

	@Override
	public void action() {
		System.out.println("@代理类开始工作@");
		cat.action();
		System.out.println("@代理类结束工作@");
	}

	@Override
	public void breath() {
		System.out.println("@代理类开始工作@");
		cat.breath();
		System.out.println("@代理类结束工作@");
	}
	
}