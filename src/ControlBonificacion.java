public class ControlBonificacion {

    private double suma;

    /*Cuando tienes el mismo metodo pero diferente argumento se le conoce como
    Sobrecarga de metodo */
    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
      //Si elimino los metodos hijos como gerente y contador, sigue funcionando ya que son extends de la clase principal
    // que es funcionario por lo tanto

    /*
    public double registrarSalario(Gerente gerente){
        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }

    public double registrarSalario(Contador contador){
        this.suma = contador.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
    */

}
