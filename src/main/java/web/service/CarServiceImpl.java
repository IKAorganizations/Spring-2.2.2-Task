package web.service;
import web.model.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 6, 2));
        cars.add(new Car("VOLVO", 1, 4));
        cars.add(new Car("FIAT", 3, 5));
        cars.add(new Car("ROLLS", 7, 9));
        cars.add(new Car("VOLGA", 9, 9));

    }


    public List<Car> getCarListCount (Integer count) {
        List<Car> list = new ArrayList<>();

        if (count != null && count >= 1 && count <= 4) {
            for (int i = 0; i < count; i++) {
                list.add(cars.get(i));
            }
        }else {
            list = cars;
        }

        return list;
    }

}
