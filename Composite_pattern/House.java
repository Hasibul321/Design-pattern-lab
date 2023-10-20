
class House implements HousingStructure {
    private String name;

    public House(String name) {
        this.name = name;
    }

    @Override
    public void add(HousingStructure structure) {
        // Houses cannot contain substructures, so this method is not applicable.
    }

    @Override
    public void remove(HousingStructure structure) {
        // Houses cannot contain substructures, so this method is not applicable.
    }

    @Override
    public void display() {
        System.out.println("House: " + name);
    }
}

 