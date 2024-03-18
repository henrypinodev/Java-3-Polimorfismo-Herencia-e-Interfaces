public class TestControlBonificacion {

    public static void main(String[] args) {

        Funcionario diego = new Funcionario();
        diego.setSalario(2000);

        Gerente ximena = new Gerente();
        ximena.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(ximena);
        controlBonificacion.registrarSalario(alexis);

    }
}
