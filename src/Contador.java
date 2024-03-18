public class Contador extends Funcionario {

    @Override
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE EXTENDS CONTADOR");
        return 800;
    }
}
