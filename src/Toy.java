public class Toy {
    int idToy;
    String nameToy;
    int quantity;
    float drop;

    public Toy(int idToy, String nameToy, int quantity, float drop) {
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

    public float getDrop() {
        return drop;
    }

    public void setDrop(float drop) {
        this.drop = drop;
    }

    public void addToy(){

    }
}
