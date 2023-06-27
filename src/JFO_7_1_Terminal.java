public class JFO_7_1_Terminal {
    
    private JFO_7_1_Card cartao;
    private JFO_7_1_Category[] categoriasPremio;

    public JFO_7_1_Terminal(){
        cartao = null;
        categoriasPremio = new JFO_7_1_Category[3];
        categoriasPremio[0] = new JFO_7_1_Category("Categoria 1", 5, 10);
        categoriasPremio[1] = new JFO_7_1_Category("Categoria 2", 10, 5);
        categoriasPremio[2] = new JFO_7_1_Category("Categoria 3", 15, 3);
    
    }
    public void inserirCartao(JFO_7_1_Card cartao) {
        this.cartao = cartao;
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " inserido no terminal.");
    }

    public void carregarCreditos(int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarTickets(creditos);
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " - Créditos carregados: " + creditos);
        cartao.MostrarSaldos();
    }

public void transferSaldo(JFO_7_1_Card cartaoorigem, JFO_7_1_Card cartaodestino){
    int creditosTransferidos = cartaoorigem.getSaldoCredito();
        int ticketsTransferidos = cartaodestino.getSaldoTickets();

        cartaoorigem.retirarCreditos(creditosTransferidos);
        cartaoorigem.subtrairTickets(ticketsTransferidos);
        cartaodestino.adicionarcreditos(creditosTransferidos);
        cartaodestino.adicionarTickets(ticketsTransferidos);
    
        System.out.println("Transferência de saldo do Cartão - " + cartaoorigem.getnumeroIdentificacao() +
        " para o Cartão - " + cartaodestino.getnumeroIdentificacao());
    System.out.println("Créditos transferidos: " + creditosTransferidos);
    System.out.println("Tíquetes transferidos: " + ticketsTransferidos);
    System.out.println();
    
    cartaoorigem.MostrarSaldos();
    cartaodestino.MostrarSaldos();
    }
    
    public void trocarTicketsPorPremios(int categoria) {
        if (categoria >= 0 && categoria < categoriasPremio.length) {
            JFO_7_1_Category categoriaPremio = categoriasPremio[categoria];
            categoriaPremio.solicitarPremio(cartao);
        } else {
            System.out.println("Categoria inválida.");
        }
    }  
    public void jogandoJogo(JFO_7_1_Game jogo) {
        jogo.jogandoJogo(cartao);
    }
}