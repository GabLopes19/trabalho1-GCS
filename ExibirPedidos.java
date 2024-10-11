public void exibirPedidos(Departamento departamento) {
    for (PedidoAquisicao pedido : pedidos) {
        if (pedido.getDepartamento().equals(departamento)) {
            System.out.println(pedido.toString());
        }
    }
}
