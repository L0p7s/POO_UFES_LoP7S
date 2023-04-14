public class Funcionario {
    private String nome;
    private double salario;
    private String admissao;

    public String getNomeF() {
        return nome;
    }

    public void daAumento (){
        double aumento=this.salario*0.1;
        this.salario=this.salario+aumento;
    }
    public void setNomeF(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getAdmissao() {
        return admissao;
    }   
    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    

}
