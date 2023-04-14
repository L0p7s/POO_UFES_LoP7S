import java.util.Scanner;
import java.util.Locale;

public class Empresa {
    private String nome;
    private String cnpj;
    Departamento[]departamentos;
    
    public void CriaEmpresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }
    public void CriaVetDepartamentos (int tam){
        this.departamentos = new Departamento[tam];
    }
    public void Aumento(){
        this.departamentos[0].AumentoDepartamento();
    }

    public void LeDepartamentos (Scanner scanner){
        int j=0;
        scanner.nextLine();
        for(int i = 0; i < this.departamentos.length;i++) {
             this.departamentos[i]=new Departamento();
             this.departamentos[i].setNomeD(scanner.next());
             this.departamentos[i].criaVetFUncionarios(scanner.nextInt());
             scanner.nextLine();
             this.departamentos[i].LenomesF(scanner);
        }
    }
    public void Transferencia(){
        this.departamentos[0].transfereFuncionario(this.departamentos[1]);
    }

    public void ImprimeDeps(){
        new Locale("pt", "BR");
        for(int i = 0; i < this.departamentos.length;i++){
            System.out.printf("%s R$ %.2f\n", this.departamentos[i].getNomeD(), this.departamentos[i].retornaSalarioDep());
        }
    }
    public String getnNomeE(){
        return this.nome;
    }
    public String getCNPJ(){
        return this.cnpj;
    }
    public Departamento[] getDepartamentos(){
        return this.departamentos;
    }
    public void setNomeE(String nome){
        this.nome = nome;
    }
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
    public void setDepartamentos(Departamento[] departamentos){
        this.departamentos = departamentos;
    }

}
