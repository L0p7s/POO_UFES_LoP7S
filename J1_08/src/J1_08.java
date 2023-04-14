import java.util.Scanner;

public class J1_08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa=new Empresa();
        empresa.CriaEmpresa(scanner.next(), scanner.next());
        int al=scanner.nextInt();
        empresa.CriaVetDepartamentos(al);
        empresa.LeDepartamentos(scanner);
        empresa.Aumento();
        empresa.Transferencia();
        empresa.ImprimeDeps();
        scanner.close();    
    }

}
