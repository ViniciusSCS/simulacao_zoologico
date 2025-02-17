public class Leao extends Mamifero{
    private boolean juba;

    public Leao(String nome, int idade, boolean juba) {
        super(nome, idade, true);
        this.juba = juba;
    }

    @Override
    public void comer() {
        System.out.println("Alimentando-se de uma zebra!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Possui Juba: " + (juba ? "Sim" : "Não"));
    }
}
