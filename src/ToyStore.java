import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyStore {
    public List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void addToy(int toyId, String name, int quantity, double weight) {
        Toy toy = new Toy(toyId, name, quantity, weight);
        toys.add(toy);
    }
    public void updateWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getIdToy() == toyId) {
                toy.setDrop(newWeight);
                break;
            }
        }
    }

    public String drawToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getDrop();
        }
        Random random = new Random();
        double randomNum = random.nextDouble() * totalWeight;
        double currentWeight = 0;
        for (Toy toy : toys) {
            currentWeight += toy.getDrop();
            if (currentWeight >= randomNum) {
                if (toy.getQuantity() > 0) {
                    toy.setQuantity(toy.getQuantity() - 1);
                    saveWinnerToy(toy);
                    return toy.getNameToy();
                } else {
                    return "No more toys left";
                }
            }
        }
        return "No toys available";
    }

    private void saveWinnerToy(Toy toy) {
        try (FileWriter fileWriter = new FileWriter("winners.txt", true)) {
            fileWriter.write("Winner: " + toy.getNameToy() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
