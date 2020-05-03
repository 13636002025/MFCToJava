package com.huaji;

public class Client {
    public static void main(String[] args) {
//        CLocalPicShow cLocalPicShow=new CLocalPicShow();
//        cLocalPicShow.ShowPic("photo");
        IShowPic showPic=new CLocalPicShow();
        showPic.ShowPic("photo");
    }
}
