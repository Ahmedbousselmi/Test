package tn.esprit.alternance;

public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;
    private boolean isBroken;
    private String assignedTo;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = false;
        this.isBroken = false;
        this.assignedTo = null;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void start() {
        if (!isRunning) {
            if (!isBroken) {
                this.isRunning = true;
                System.out.println("Car started!");
            } else {
                System.out.println("Car is broken, please fix it before starting.");
            }
        } else {
            System.out.println("Car is already running");
        }
    }

    public void stop() {
        if (isRunning) {
            this.isRunning = false;
            System.out.println("Car stopped!");
        } else {
            System.out.println("Car is already stopped.");
        }
    }

    public void assign(String name) {
        if (this.assignedTo == null) {
            this.assignedTo = name;
            System.out.println("Car assigned to " + name + ".");
        } else {
            System.out.println("Car is already assigned to " + this.assignedTo + ".");
        }
    }

    public void markBroken() {
        if (!isBroken) {
            this.isBroken = true;
            System.out.println("Car marked as broken.");
        } else {
            System.out.println("Car is already marked as broken.");
        }
    }

    public void fix() {
        if (isBroken) {
            this.isBroken = false;
            System.out.println("Car fixed.");
        } else {
            System.out.println("Car is not broken, no need to fix.");
        }
    }
}