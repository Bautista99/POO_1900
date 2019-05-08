class Equipo {
    private String nombre;
    private int juegosJugados;
    private int juegosGanados;
    private int juegosEmpatados;
    private int juegosPerdidos;
    private int golesFavor;
    private int golesEnContra;

    public int calcularPuntos() {
        return juegosJugados * 3 + juegosEmpatados;
    }
    public int calcularBono() {
        return calcularPuntos() * 100
        + golesFavor * 500
        - juegosPerdidos * 500
        + (juegosJugados % 2 == 0 ? 5000 : 0);
    }