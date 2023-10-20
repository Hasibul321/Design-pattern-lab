import java.util.ArrayList;
import java.util.List;

class ApartmentBuilding implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public ApartmentBuilding(String name) {
        this.name = name;
    }

    @Override
    public void add(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void remove(HousingStructure structure) {
        structures.remove(structure);
    }

    @Override
    public void display() {
        System.out.println("Apartment Building: " + name);
        System.out.println("Contained Structures:");
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}