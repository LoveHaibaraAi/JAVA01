public class main {
    public static void main(String[] args) {
        Car a1=new Car();
        a1.brand="小汽车";
        System.out.println(a1.brand);
        a1.color="红色";
        System.out.println(a1.color);
        System.out.println(a1.seats);
        a1.showCar();
        Truck a2=new Truck();
        a2.brand="卡车";
        System.out.println(a2.brand);
        a2.color="蓝色";
        System.out.println(a2.color);
        System.out.println(a2.load);
        a2.showTruck();
    }
}
