public class H20EstadoGasoso implements H20Estado {
    private H20EstadoGasoso() {};
    private static H20EstadoGasoso instance = new H20EstadoGasoso();
    public static H20EstadoGasoso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Gasoso";
    }
}
