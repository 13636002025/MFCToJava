package com.huaji.state;

public class ThreadContext {
    private ThreadState threadState;

    public ThreadContext() {
        threadState=new NewState();
    }

    public ThreadState getThreadState() {
        return threadState;
    }

    public void setThreadState(ThreadState threadState) {
        this.threadState = threadState;
    }
    //新建线程
    public void start(){
        ((NewState)threadState).start(this);
    }
    //线程就绪
    public void getCpu(){
        ((RunnableState)threadState).getCpu(this);
    }
    //线程运行
    public void suspend(){
        ((RunningState)threadState).suspend(this);
    }
    //线程停止
    public void stop(){
        ((RunningState)threadState).stop(this);
    }
    //线程阻塞
    public void resume(){
        ((BlockedState)threadState).resume(this);
    }
    //线程结束
    public void destory(){
        ((DeadState)threadState).destroy(this);
    }
}
