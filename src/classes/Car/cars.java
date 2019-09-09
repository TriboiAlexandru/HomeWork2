package classes.Car;

class cars {
    public static final String TYPE_OF_CARS = "Automobile";
    private String make;
    private String model;
    private int yearsOfManufacture;
    private String color;
    private String fuelType;
    private String vechicleType;

    {
        System.out.println("find a car");
    }

    public cars() {
        this("Ford", "Focus", 2009, "Blue", "Petrol", "EstateCar");
    }

    public cars(String make, String color, int yearsOfManufacture) {
        this.make= make;
        this.color=color;
        this.yearsOfManufacture = yearsOfManufacture;
    }

    public cars(String make, String model, int yearsOfManufacture, String color, String fuelType, String vechicleType) {
        this.make = make;
        this.model = model;
        if (yearsOfManufacture >2018)
            System.out.println("New Car");
        else if (yearsOfManufacture < 1995)
            System.out.println("Old Timer Car");
        else
            this.yearsOfManufacture = yearsOfManufacture;
        this.color= color;
        this. fuelType=fuelType;
        this.vechicleType=vechicleType;
    }

    public void setMake() {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getmodel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public int getYearsOfManufacture() {
        return yearsOfManufacture;
    }

    public void setYearsOfManufacture(int yearsOfManufacture) {
        this.yearsOfManufacture = yearsOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType() {
        this.fuelType = fuelType;
    }

    public String getVechicleType() {
        return vechicleType;
    }

    public void setVechicleType() {
        this.vechicleType = vechicleType;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + yearsOfManufacture + " " + color + " " + fuelType + " " + vechicleType;
    }
}


