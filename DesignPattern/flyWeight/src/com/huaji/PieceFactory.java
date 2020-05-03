package com.huaji;

import java.util.HashMap;

public class PieceFactory {
    private HashMap piecePool=new HashMap();
    public APiece getPiece(String key){
        if (!piecePool.containsKey(key)){
            APiece piece=new OnePiece(key);
            piecePool.put(key,piece);
            return piece;
        }
        return (APiece) piecePool.get(key);
    }
    public int getPieceCount(){
        return piecePool.size();
    }
}
