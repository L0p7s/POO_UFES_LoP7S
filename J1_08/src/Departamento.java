import java.util.Scanner;

public class Departamento {

  private String nome;
  private Funcionario[] funcionarios;

  public void criaDepartamento(String nome) {
    this.nome = nome;
  }
  public void LenomesF(Scanner scanner){
    for(int i = 0; i < funcionarios.length; i++){
      this.funcionarios[i]=new Funcionario();
      if (i!=this.funcionarios.length-1){
      this.funcionarios[i].setNomeF(scanner.next());
      this.funcionarios[i].setSalario(scanner.nextDouble());
      this.funcionarios[i].setAdmissao(scanner.next());
      }
    }
  }
  public void AumentoDepartamento(){
    for (int i = 0; i < funcionarios.length; i++){
      this.funcionarios[i].daAumento();
    }
  }
  public void transfereFuncionario(Departamento dep2){
    dep2.funcionarios[dep2.funcionarios.length-1]=this.funcionarios[0];
    this.funcionarios[0]=null;
    
  }
  public double retornaSalarioDep(){
    double salario = 0;
    for (int i = 0; i < funcionarios.length; i++){
      if(funcionarios[i]!=null){
      salario+=funcionarios[i].getSalario();
      }
    }
    return salario;
  }

  public void criaVetFUncionarios(int tam) {
    this.funcionarios = new Funcionario[tam+1];
  }
  public String getNomeD() {
      return nome;
  }
  public Funcionario[] getFuncionarios() {
      return funcionarios;
  }
  public void setFuncionarios(Funcionario[] funcionarios) {
      this.funcionarios = funcionarios;
  }
  public void setNomeD(String nome) {
      this.nome = nome;
  }
}
