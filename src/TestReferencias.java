public class TestReferencias {

    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado al elemento mas especifico
        // Elemento generico = Funcionario
        // Elemento especifico = Gerente
        // Polimorfismo
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Ximena");


        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        if (gerente.iniciarSesion("1253")){
            System.out.println("Inicio de sesión exitosa");
        }else{
            System.out.println("Error al iniciar sesión");
        }



    }
}
