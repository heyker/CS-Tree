package cn.lollipop.mode.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SuperCar implements Car{
    private Car car;

    @Override
    public void move() {
        car.move();
    }
}
