/**
 * Classe representando um usuário do sistema.
 */
public abstract class Usuario {

    protected String nome;
    protected static int idAuxiliar = 1;
    protected int id;

    /**
     * Retorna o departamento associado ao usuário.
     */
    public abstract Departamento getDepartamento();

    /**
     * Retorna o ID do usuário.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Obtém as iniciais do nome do usuário.
     * Retorna uma String com as duas primeiras letras do nome do usuário, em maiúsculas.
     */
    public String iniciais() {
        if (nome == null) return null;
        String iniciais = "" + this.nome.charAt(0) + this.nome.charAt(1);
        return iniciais.toUpperCase();
    }

    /**
     * Retorna o nome do usuário.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Define um novo nome para o usuário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o tipo de usuário com base no ID.
     * false se o usuário for funcionário; true se o usuário for administrador.
     */
    public boolean tipo() {
        return this.id <= 5000;
    }

    /**
     * Retorna o tipo de usuário como uma String.
     * "Administrador" se o usuário for administrador; "Funcionário" se for funcionário.
     */
    public String tipoString() {
        return tipo() ? "Administrador" : "Funcionário";
    }

    /**
     * Retorna uma String representando o usuário com nome, ID e iniciais.
     */
    @Override
    public String toString() {
        return nome + "| ID: " + this.id + "-" + iniciais();
    }
}
