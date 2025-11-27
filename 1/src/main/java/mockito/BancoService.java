package mockito;

public class BancoService {
    private ContaRepository contaRepository;

    public BancoService(ContaRepository contaRepository) {
        // implemente aqui
    }

    public double consultarSaldo(String numeroConta) {
        // implemente aqui
    }

    public void depositar(String numeroConta, double valor) {
        // implemente aqui
    }
}