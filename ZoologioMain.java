public class ZoologioMain {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        Animal leao = new Leao("Simba", 7, true);

        leao.comer();
        leao.imprimir();
        zoologico.adicionarAnimal(leao);
    }
}
