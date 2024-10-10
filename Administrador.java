/**
 * Classe que representa um Administrador.
 */
public class Administrador extends Usuario {

    /**
     * Método construtor para criar um novo administrador.
     * @param nome Nome do novo administrador.
     */
    public Administrador(String nome) {
        super.nome = nome;
        super.id = 1000 + Usuario.idAuxiliar;
        Usuario.idAuxiliar++;
    }

    /**
     * O administrador não pertence a nenhum departamento.
     * @return null, pois o administrador não tem departamento.
     */
    @Override
    public Departamento getDepartamento() {
        return null;
    }
}
