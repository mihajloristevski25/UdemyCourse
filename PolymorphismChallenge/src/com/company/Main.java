package com.company;
class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;
    private int speed = 0;

    public Car(String name, int cylinders, int speed) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public void startEngine(boolean test) {
        if (test) {
            System.out.println("Engine started");
        } else {
            System.out.println("Engine stopped");
        }
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("You accelerated the car " + this.speed);
    }

    public void brake(int brake) {
        if (this.speed - brake <= 0) {
            System.out.println("You stopped the car");
        } else {
            int braking = this.speed - brake;
            System.out.println("You slowed the car with breaking at speed " + braking);
        }
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, int speed) {
        super("Porsche", cylinders, speed);
    }

    @Override
    public void startEngine(boolean test) {
        if (test) {
            System.out.println("Porsche started");
        } else {
            System.out.println("Porsche stopped");
        }
    }

    @Override
    public void accelerate(int speed) {
        int momentum = 0;
        momentum += speed;
        setSpeed(momentum);
        System.out.println("You accelerated the Porsche " + momentum);
    }

    @Override
    public void brake(int brake) {
        if (super.getSpeed() - brake <= 0) {
            System.out.println("You stopped the Porsche");
        } else {
            int braking = super.getSpeed() - brake;
            System.out.println("You slowed the Porsche with breaking at speed " + braking);
        }
    }
}

class Fiat extends Car {
    public Fiat( int cylinders, int speed) {
        super("Fiat", cylinders, speed);
    }

    @Override
    public void startEngine(boolean test) {
        if (test) {
            System.out.println("Fiat started");
        } else {
            System.out.println("Fiat stopped");
        }
    }

    @Override
    public void accelerate(int speed) {
        int momentum = 0;
        momentum += speed;
        setSpeed(momentum);
        System.out.println("You accelerated the Fiat " + momentum);
    }

    @Override
    public void brake(int brake) {
        if (super.getSpeed() - brake <= 0) {
            System.out.println("You stopped the Fiat");
        } else {
            int braking = super.getSpeed() - brake;
            System.out.println("You slowed the Fiat with breaking at speed " + braking);
        }
    }
}
class Citroen extends Car{
    public Citroen( int cylinders, int speed) {
        super("Citroen", cylinders, speed);
    }

    @Override
    public void startEngine(boolean test) {
        if (test) {
            System.out.println("Citroen started");
        } else {
            System.out.println("Citroen stopped");
        }
    }

    @Override
    public void accelerate(int speed) {
        int momentum = 0;
        momentum += speed;
        setSpeed(momentum);
        System.out.println("You accelerated the Citroen " + momentum);
    }

    @Override
    public void brake(int brake) {
        if (getSpeed() - brake <= 0) {
            System.out.println("You stopped the Citroen");
        } else {
            int braking = getSpeed() - brake;
            System.out.println("You slowed the Citroen with breaking at speed " + braking);
        }
    }
}




public class Main {

    public static void main(String[] args) {
    for(int i = 1; i < 10; i++){
            Car car = randomCar();
            car.startEngine(true);
            car.accelerate((int)(Math.random() * 10) + 10);
            int brake = (int)(Math.random() * 10) + 1;
            System.out.println("brake = " +brake);
            car.brake(brake);
            System.out.println();
        }

    }
    public static Car randomCar(){
        int random = (int)(Math.random()*3) + 1 ;
        switch (random){
            case 1:
                return new Porsche(8,0);
            case 2:
                return new Fiat(6,0);
            case 3:
                return new Citroen(6,0);

        }
        return null;
    }
}
