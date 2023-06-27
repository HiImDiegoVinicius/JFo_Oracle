public class JFO_7_1_Test {
    public static void main(String[] args) {
    JFO_7_1_Card cartao1 = new JFO_7_1_Card(1);
    JFO_7_1_Card cartao2 = new JFO_7_1_Card(2);

    cartao1.adicionarcreditos(100);
    cartao2.adicionarcreditos(50);

    JFO_7_1_Terminal terminal = new JFO_7_1_Terminal();

    terminal.inserirCartao(cartao1);

    terminal.carregarCreditos(5);

    terminal.transferSaldo(cartao1, cartao2);

    terminal.inserirCartao(cartao2);

    terminal.trocarTicketsPorPremios(0);


    JFO_7_1_Game jogo = new JFO_7_1_Game("Jogo Aleatórios!", 3, 5);
    terminal.jogandoJogo(jogo);
    }

}