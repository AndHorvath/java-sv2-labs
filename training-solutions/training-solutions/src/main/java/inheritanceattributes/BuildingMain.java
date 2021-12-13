package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Building", 400.1d, 2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("SchoolBuilding", 800.2d, 3, 12);

        System.out.println(building.name + ", " + building.area + ", " + building.getFloors());
        System.out.println(
                schoolBuilding.name + ", " + schoolBuilding.area + ", " +
                schoolBuilding.getFloors() + ", " + schoolBuilding.getNumberOfClassRooms());
    }
}