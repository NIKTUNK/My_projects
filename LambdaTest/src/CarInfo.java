import java.util.ArrayList;

public class CarInfo
{
    public static class Car
    {
        String brand;
        int year;
        String colour;
        int price;
        boolean used;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public Car (String brand, int year, String colour, int price, boolean used)
        {
            this.brand = brand;
            this.year = year;
            this.colour = colour;
            this.price = price;
            this.used = used;
        }
        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", year=" + year +
                    ", colour='" + colour + '\'' +
                    ", price=" + price +
                    ", used=" + used +
                    '}';
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////

//    void CarsUnderYear (ArrayList<Car> a, int year)
//    {
//        for (Car el: a)
//        {
//            if(el.getYear() < year)
//                System.out.println(el);
//        }
//    }
//
//    void CarsMixedConditions (ArrayList<Car> a, int year, int price)
//    {
//        for(Car el: a)
//        {
//            if (el.getYear()>year && el.getPrice()<price)
//            {
//                System.out.println(el);
//            }
//        }
//    }

    /////////////////////////////////////////////////////////////////////////////////////////

     interface CarCheck
    {
        boolean check(Car c);
    }

    void Check (ArrayList<Car> al, CarCheck ch)
    {
        for (Car el: al)
        {
            if(ch.check(el))
                System.out.println(el);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    interface InterfacePrice
    {
        boolean price(Car b);
    }

    void PriceCheck (ArrayList<Car> a, InterfacePrice p)
    {
        for (Car c:a)
        {
            if(p.price(c))
                System.out.println(c);
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        Car car1 = new Car ("BMW", 2020, "Green", 1000,true );
        Car car2 = new Car ("Mercedes", 2023, "Black", 1200,false );
        Car car3 = new Car ("Tesla", 2018, "Blue", 800,true );
        Car car4 = new Car ("Bugatti", 2021, "White", 2000,true );
        Car car5 = new Car ("Lada", 2021, "Green", 300,true );
        Car car6 = new Car ("Toyota", 2023, "Yellow", 1100,false );
        ArrayList <Car> garage= new ArrayList();
        garage.add(car1);
        garage.add(car2);
        garage.add(car3);
        garage.add(car4);
        garage.add(car5);
        garage.add(car6);
        System.out.println("All cars:\n");

        for (Car el: garage)
            System.out.println(el);

        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Cars that are older than 2021:\n");


        CarInfo info1 = new CarInfo();
        info1.Check(garage, p-> p.getYear()<2021);

        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Cars that are more expensive than 1000:\n");


        CarInfo info2 = new CarInfo();
        info2.PriceCheck(garage, element ->
        {
            return element.getPrice()>1000;
        });


//        System.out.println("Cars that are older than 2021:\n");
//        CarInfo info = new CarInfo();
//        info.CarsUnderYear(garage, 2021);
//
//        System.out.println("\n---------------------------------------------------------------\n");
//        System.out.println("Cars that are newer than 2021 and cheaper than 1200:\n");
//        info.CarsMixedConditions(garage, 2021, 1200);
    }
}