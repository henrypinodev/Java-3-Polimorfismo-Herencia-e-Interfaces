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
        System.out.println("----------------------------------------------------");
        Gerente g1 = new Gerente();
        g1.setNombre("Marcelo");
        g1.setSalario(5000.0);

        EditorVideo e = new EditorVideo();
        e.setNombre("Jorge");
        e.setSalario(2500.0);

        Designer d = new Designer();
        d.setNombre("Barbara");
        d.setSalario(2000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacion());
        System.out.println("--------------------------");
        System.out.println(e.getNombre());
        System.out.println(e.getSalario());
        System.out.println(e.getBonificacion());
        System.out.println("-------------------------");
        System.out.println(d.getNombre());
        System.out.println(d.getSalario());
        System.out.println(d.getBonificacion());


        ControleBonificacion controle = new ControleBonificacion();
        controle.registrar(g1);
        controle.registrar(e);
        controle.registrar(d);

        System.out.println(controle.getSuma());



    }
}
