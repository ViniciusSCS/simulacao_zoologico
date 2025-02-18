//Classe Abstrata
public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Início do Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Fim do Encapsulamento

    //Método Abstrato
    public abstract void comer();

    //Método de Retorno
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
