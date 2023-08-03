public class Toy {
    int idToy;
    String nameToy;
    int quantity;
    double drop;

    public Toy(int idToy, String nameToy, int quantity, double drop) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantity = quantity;
        this.drop = drop;
    }

    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDrop() {
        return drop;
    }

    public void setDrop(double drop) {
        this.drop = drop;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "idToy=" + idToy +
                ", nameToy='" + nameToy + '\'' +
                ", quantity=" + quantity +
                ", drop=" + drop +
                '}';
    }
}
