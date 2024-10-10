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
    }
}

