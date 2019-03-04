package cn.lollipop.mode.factory.factorymethod;

public class BydFactory {

    private BydFactory(){
    }

    public static Car createCar() {
        return new Byd();
    }
}
