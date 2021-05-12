package not.canon.testbench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

public class MyWonderfulFlatMapStuff {
    public static void main(String[] args) throws IOException {
        {
            System.out.println();
            Files
                    .lines(Path.of("c:\\lorem.txt"))
                    .flatMap(x -> Arrays.stream(x.split("\\s+")))
                    .distinct().sorted().forEach(System.out::print);
        }
        {
            System.out.println();
            Files
                    .lines(Path.of("c:\\lorem.txt"))
                    .map(x->x.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .distinct().sorted().forEach(System.out::print);
        }
        {

            // https://www.youtube.com/watch?v=gpinreATnng

            System.out.println();
            Person adam = new Person(new Address(new City("Erd")));

            Optional<Address> address = adam.getAddress();

            // Address::getCity returns Optional<City> has to be flattened
            Optional<Optional<City>> TooMuchOptionalsCity = address.map(Address::getCity);
            Optional<City> city = address.flatMap(Address::getCity);

            // City::getName returns String, no need to flatten it
            Optional<String> s = city.map(City::getName);
            s.ifPresent(System.out::println);

        }
    }



}
class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}

class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public Optional<City> getCity() {
        return Optional.ofNullable(city);
    }

}

class City {
    private String name;

    public String getName() {
        return name;
    }

    public City(String name) {
        this.name = name;
    }
}