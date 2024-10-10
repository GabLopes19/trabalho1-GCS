public class AppController {
    private Usuario usuarioAtual;
    public void setUsuarioAtual(Usuario usuario) {
        this.usuarioAtual = usuario;
        System.out.println("Usuário atual alterado para: " + usuario.getNome() + " | " + usuario.tipoString());
    }

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void exibirUsuarioAtual() {
        if (usuarioAtual != null) {
            System.out.println("Usuário atual: " + usuarioAtual.toString());
        } else {
            System.out.println("Nenhum usuário selecionado.");
        }
    }
}
