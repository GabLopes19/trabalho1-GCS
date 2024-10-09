/**
 * Classe Funcionario
 */
public class Funcionario extends Usuario {

    private Departamento departamento;

    /**
     * Método construtor para um novo funcionário.
     * Nota: O parâmetro departamento é um objeto. Deve ser corretamente implementado no App para funcionar adequadamente.
     */
    public Funcionario(String nome, Departamento departamento) {
        super.nome = nome;
        this.departamento = departamento;
        super.id = 5000 + Usuario.idAuxiliar;
        Usuario.idAuxiliar++;
    }

    /**
     * Retorna o departamento do funcionário.
     * Nota: Retorna um objeto 'Departamento'; para retornar como String, use o método 'toString()'.
     */
    @Override
    public Departamento getDepartamento() {
        return this.departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Departamento: " + this.departamento.getNome();
    }
}
