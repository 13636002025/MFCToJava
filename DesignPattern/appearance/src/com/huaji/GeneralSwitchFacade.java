package com.huaji;

public class GeneralSwitchFacade {
    private Light lights[]=new Light[4];
    private Fan fan;
    private AirConditioner airConditioner;
    private Television television;

    public GeneralSwitchFacade() {
        lights[0]=new Light("左前");
        lights[1]=new Light("右前");
        lights[2]=new Light("左后");
        lights[3]=new Light("右后");
        fan=new Fan();
        airConditioner=new AirConditioner();
        television=new Television();
    }

    public void on(){
        for (Light light:lights){
            light.on();
        }
        fan.on();
        airConditioner.on();
        television.on();
    }
    public void off(){
        for (Light light:lights){
            light.off();
        }
        fan.off();
        airConditioner.off();
        television.off();
    }
}
