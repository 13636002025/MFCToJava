package com.huaji;

public class OnePiece extends APiece {

    public OnePiece(String inKind) {
        super(inKind);
    }

    @Override
    public void play(int x, int y) {
        System.out.println("把"+inKind+"子放在（"+x+"，"+y+"）的位置");
    }
}
