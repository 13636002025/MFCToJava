package com.huaji;

public abstract class APiece {
    protected String inKind;

    public APiece(String inKind) {
        this.inKind = inKind;
    }
    //棋子落子位置
    public abstract void play(int x,int y);
}
