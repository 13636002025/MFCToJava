package com.huaji;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order();
        order1.setId(1);
        order1.setFruitmap("橙子",1);
        order1.setFruitmap("梨子",2);
        order1.setFruitmap("苹果",3);

        Order order2=new Order();
        order2.setId(2);
        order2.setFruitmap("香蕉",4);
        order2.setFruitmap("葡萄",2);
        order2.setFruitmap("西红柿",3);

        Operator operator=new Operator();
        OrderCommand cmd1=new OrderCommand(operator,order1);
        OrderCommand cmd2=new OrderCommand(operator,order2);

        WaitorInvoker waitor=new WaitorInvoker();
        waitor.SetCommand(cmd1);
        waitor.SetCommand(cmd2);
        waitor.OrderUp();
    }
}
