package com.huaji.state;

public class DeadState extends ThreadState {
    public DeadState() {
        state=StateSet.DEAD;
        System.out.println("结束状态");
    }
    public void destroy(ThreadContext tc){
        System.out.println("调用了destroy方法");
        if (state==StateSet.DEAD)
            System.out.println("进程结束");
        else
            System.out.println("当前不是结束状态");
    }
}
