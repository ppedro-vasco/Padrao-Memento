public class H20EstadoLiquido implements H20Estado {
    private H20EstadoLiquido() {};
    private static H20EstadoLiquido instance = new H20EstadoLiquido();
    public static H20EstadoLiquido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Líquido";
    }
}
