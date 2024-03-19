public class EditorVideo extends Funcionario {


    public double getBonificacion() {
        System.out.println("Usando bonificacion de la clase controleBonificacion con parametros de 200");
        return super.getSalario() * 0.200;
    }
}
