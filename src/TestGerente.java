public class TestGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        //gerente.setSalario(5000);
        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("123");
        System.out.println(gerente.getSalario()+ " Salario");
        System.out.println(gerente.getBonificacion()+ " Bonificacion");
        System.out.println(gerente.iniciarSesion("123"));


    }
}
