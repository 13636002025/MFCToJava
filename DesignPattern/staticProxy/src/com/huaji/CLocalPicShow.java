package com.huaji;

public class CLocalPicShow implements IShowPic,Runnable {
    private IShowPic pic;
    private String picname;
    @Override
    public void ShowPic(String name) {
        pic=new CRemoPic();
        this.picname=name;
        System.out.println("准备载入图片"+picname);
        Thread thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        pic.ShowPic(picname);
        System.out.println(picname+"图片调用完成!");
    }
}
