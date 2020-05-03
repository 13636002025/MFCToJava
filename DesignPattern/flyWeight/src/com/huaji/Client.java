package com.huaji;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        PieceFactory pieceFactory=new PieceFactory();
        Random random=new Random();
        for (int i=0;i<19;i++){
            for (int j=0;j<19;j++){
                APiece piece;
                if (random.nextInt()%2==0){
                    piece=pieceFactory.getPiece("白棋");
                }else {
                    piece=pieceFactory.getPiece("黑棋");
                }
                piece.play(random.nextInt(19),random.nextInt(19));
            }
        }
        System.out.println("总共的棋子数是："+pieceFactory.getPieceCount());
    }
}
