public void Relatorio {
    System.out.println("Funcionários do Departamento " + this.nome + ":");
    for (Funcionario funcionario : funcionarios) {
        System.out.println(funcionario.toString());
    }
}
