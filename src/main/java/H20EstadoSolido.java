public class H20EstadoSolido implements H20Estado {
    private H20EstadoSolido() {};
    private static H20EstadoSolido instance = new H20EstadoSolido();
    public static H20EstadoSolido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Solido";
    }
}
