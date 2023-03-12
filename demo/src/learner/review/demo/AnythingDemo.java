package learner.review.demo;

public class AnythingDemo {


    static class Building{};

    static class House extends Building{};

    public static void main(String[] args){
        Building building = new House();
        Class<House> houseType = House.class;
        House house = houseType.cast(building);
        house = (House) building;
    }

}