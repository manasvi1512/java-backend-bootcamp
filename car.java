//encapsulation
class Car {
        private String colour;
        private String brand;
        private String model;
        private int year;
        private int speed;

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void accelerate(int inc){
            speed += inc;
        }
}
class Test{
    public static void main(String[] args) {
        Car car = new Car();
        
    }
}
