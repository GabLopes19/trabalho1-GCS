import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa um departamento dentro da empresa, com uma lista de funcionários e um valor máximo permitido para pedidos de aquisição.
 */
public class Departamento {

    private final double valorMaximo;
    private final String nome;
    private final ArrayList<Funcionario> funcionarios;

    /**
     * Construtor da classe Departamento.
     * nome do departamento e valor máximo permitido para pedidos de aquisição neste departamento.
     */
    public Departamento(String nome, double valorMaximo) {
        this.funcionarios = new ArrayList<>();
        this.nome = nome;
        this.valorMaximo = valorMaximo;
    }

    /**
     * Adiciona um funcionário a este departamento.
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Retorna uma lista não modificável dos funcionários deste departamento.
     * Isso garante que a lista não possa ser modificada externamente.
     */
    public List<Funcionario> getFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    /**
     * Retorna o valor máximo permitido para pedidos de aquisição neste departamento.
     */
    public double getValorMaximo() {
        return valorMaximo;
    }

    /**
     * Retorna o nome do departamento.
     */
    public String getNome() {
        return nome;
    }
}
