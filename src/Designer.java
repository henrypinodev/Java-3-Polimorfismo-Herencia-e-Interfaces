public class Designer extends Funcionario {

    public double getBonificacion() {
        System.out.println("Usando bonificacion de la clase controleBonificacion con parametros de 150");
        return super.getSalario() * 0.150;
    }
}
