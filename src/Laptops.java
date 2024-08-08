public class Laptops {
    int ram;
    int secondaryMemory;
    String os;
    String color;

    public Laptops(int ram, int secondaryMemory, String os, String color) {
        this.ram = ram;
        this.secondaryMemory = secondaryMemory;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getSecondaryMemory() {
        return secondaryMemory;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    private void setRam() {
        this.ram = ram;
    }

    private void setSecondaryMemory() {
        this.secondaryMemory = secondaryMemory;
    }

    private void setOs() {
        this.os = os;
    }

    private void setColor() {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "ram=" + ram +
                ", secondaryMemory=" + secondaryMemory +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
