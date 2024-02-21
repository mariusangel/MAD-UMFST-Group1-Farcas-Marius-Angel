package Ex5;

class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;


    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color); 
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9; 
        } else {
            return super.getSalePrice() * 0.8; 
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount; //scadem discountul oferit de producator
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95; //reducere de 5%
        } else {
            return super.getSalePrice() * 0.9; //reducere de 10%
        }
    }
}
