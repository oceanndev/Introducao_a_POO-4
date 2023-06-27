package entities;


public class info {
    public String name;
    public double salary;
    public double tax;
    public double net(){
        return salary - tax;
    }
    public void increase(double percentage){
        salary += salary * percentage/100.0;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", net());
    }
}
