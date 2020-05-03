package com.huaji;

public class OrderCommand implements Command {

    private Operator receiver;
    private Order order;
    //放两个参数，一个是执行者，一个是执行目标
    public OrderCommand(Operator receiver,Order order) {
        this.receiver=receiver;
        this.order=order;
    }

    @Override
    public void execute() {
        System.out.println(order.getId()+"号顾客成品");
        receiver.MarkFruit(order);
    }
}
