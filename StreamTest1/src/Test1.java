import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1
{
    public static void main(String[] args)
    {
        List<Car> list = new ArrayList<>();
        Car car1 = new Car(1000, 2023, "BMW");
        Car car2 = new Car(1100, 2022, "Mersedes");
        Car car3 = new Car(1200, 2021, "Tesla");
        Car car4 = new Car(1300, 2020, "Lexus");
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
//        System.out.println(list);
//

//        -------------------------------------------------------------------------------------------------------------------

//        List length = list.stream().map(element->element.getPrice()).collect(Collectors.toList());
//        System.out.println(length);
//
//        -------------------------------------------------------------------------------------------------------------------


//        Set filter = list.stream().filter(element->element.getYear()>2020).collect(Collectors.toSet());
//        System.out.println(filter.toString());

//        -------------------------------------------------------------------------------------------------------------------

//        int[] array = {1, 2, 3, 4, 5};
//        for (int i: array)
//            System.out.print(i);
//        Arrays.stream(array).forEach(element->
//        {   element += 4;
//            System.out.print(element);
//        });

//        -------------------------------------------------------------------------------------------------------------------

//        int[] arr = {1,33,12,44,52,42,1,6,23,75,24,67,27};
////        Arrays.sort(arr);
////        for (int i: arr)
////            System.out.println(i);
//        arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(arr));

//        -------------------------------------------------------------------------------------------------------------------

        List<Car> newList = new ArrayList<>();
        newList = list.stream().sorted((x,y)-> x.getYear()-(y.getYear())).collect(Collectors.toList());
        System.out.println(newList);
    }
}
class Car
{
    int price;
    int year;
    String brand;

    public Car(int price, int year, String brand)
    {
        this.price = price;
        this.year = year;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +

                ", brand='" + brand + '\'' +
                '}';
    }
}