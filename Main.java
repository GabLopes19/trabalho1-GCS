import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Departamento departamento1 = new Departamento("Financeiro", 5000.00);
        Departamento departamento2 = new Departamento("Engenharia", 10000.00);

        Funcionario funcionario1 = new Funcionario("Ana", departamento1);
        Funcionario funcionario2 = new Funcionario("Carlos", departamento2);

        AppController appController = new AppController();

        appController.setUsuarioAtual(funcionario1);

        appController.exibirUsuarioAtual();

        appController.setUsuarioAtual(funcionario2);
        appController.exibirUsuarioAtual();

        List<Departamento> departamentos = inicializarDepartamentos();
        exibirDepartamentos(departamentos);
    }

    private static List<Departamento> inicializarDepartamentos() {
        List<Departamento> departamentos = new ArrayList<>();

        departamentos.add(new Departamento("Financeiro", 5000.00));
        departamentos.add(new Departamento("Engenharia", 10000.00));
        departamentos.add(new Departamento("RH", 4000.00));
        departamentos.add(new Departamento("Manutenção", 3000.00));
        departamentos.add(new Departamento("TI", 7000.00));

        return departamentos;
    }

    private static void exibirDepartamentos(List<Departamento> departamentos) {
        System.out.println("Departamentos iniciais:");
        for (Departamento dep : departamentos) {
            System.out.println("Nome: " + dep.getNome() + " | Valor Máximo: " + dep.getValorMaximo());
        }
    }
}

