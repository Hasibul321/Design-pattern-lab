
import java.util.ArrayList;
import java.util.List;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Create leaf housing structures
        HousingStructure house1 = new House("Small House");
        HousingStructure house2 = new House("Medium House");

        // Create a composite structure (an apartment building)
        ApartmentBuilding building = new ApartmentBuilding("Luxury Apartments");

        // Add leaf structures to the composite
        building.add(house1);
        building.add(house2);

        // Display the composite structure
        building.display();
    }
}