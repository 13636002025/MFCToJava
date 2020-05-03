package com.huaji;

public class Client {
    public static void main(String[] args) {
        IShowPic iShowPic=new CRemoPic();
        CLocalPicShow cLocalPicShow=new CLocalPicShow(iShowPic);
        IShowPic localPicShow=(IShowPic) cLocalPicShow.getProxyInstance();

        localPicShow.ShowPic("AAA");
    }
}
