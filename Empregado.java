public class Empregado {

    public String nome;
    protected float salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public String toString(){
        return "Nome do funcionário: " + getNome() + "\n" + "Salário: " + salario;
    }

    public Empregado() {

    }

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
}