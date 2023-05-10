public class Gerente {
    
    public String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String toString() {
        return "O departamento é: " + getDepartamento();
    }

}