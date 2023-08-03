

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(1, "Teddy Bear", 10, 10);
        toyStore.addToy(2, "Car", 5, 20);
        toyStore.addToy(3, "Doll", 7, 15);

        System.out.println("Available toys:");
        for (Toy toy : toyStore.getToys()) {
            System.out.println(toy.getNameToy() + " - " + toy.getQuantity() + " pcs");
        }

        toyStore.updateWeight(1, 5);

        String winnerToy = toyStore.drawToy();
        System.out.println("The winner is: " + winnerToy);

        System.out.println("Updated available toys:");
        for (Toy toy : toyStore.getToys()) {
        System.out.println(toy.getNameToy() + " - " + toy.getQuantity() + " pcs");
        }

    }
}