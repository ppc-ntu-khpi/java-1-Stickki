package src.domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private double total;
    public void displayCustomerInfo() {
        System.out.println(ID + " " + isNew + " " + total);
    }

    public Customer(int ID, boolean isNew, double total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }
    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000.0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
