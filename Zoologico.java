import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal adicionado com sucesso");
    }
}
