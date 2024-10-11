public void TransferirFuncionario(Funcionario funcionario, Departamento novoDepartamento) {
    Departamento departamentoAtual = funcionario.getDepartamento();
    if (departamentoAtual != null) {
        departamentoAtual.getFuncionarios().remove(funcionario);
    }
    novoDepartamento.adicionarFuncionario(funcionario);
    System.out.println("Funcionário " + funcionario.getNome() + " foi transferido para o departamento " + novoDepartamento.getNome());
}
