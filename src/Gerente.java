public class Gerente extends Funcionario {

    private String clave;

    // La palabra SUPER me da acceso a los metodos de la clase padre
    // Diferencias entre Super y This (?)

    // Tanto el getBonificacion tanto de funcionario y Gerente es sobreescritura de metodo
    public double getBonificacion(){
        System.out.println("EJECUTANDO DESDE EXTENDS GERENTE");
        return super.getSalario() + super.getBonificacion();
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "123";
    }

}