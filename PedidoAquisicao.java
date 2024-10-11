public class PedidoAquisicao {
    private static int idCounter = 1;
    private int id;
    private double valor;
    private String status;
    private Departamento departamento;

    public PedidoAquisicao(double valor, Departamento departamento) {
        this.id = idCounter++;
        this.valor = valor;
        this.departamento = departamento;
        this.status = "Pendente";
    }

    public void aprovar() {
        this.status = "Aprovado";
    }

    public void rejeitar() {
        this.status = "Rejeitado";
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " | Valor: " + valor + " | Status: " + status + " | Departamento: " + departamento.getNome();
    }
}
