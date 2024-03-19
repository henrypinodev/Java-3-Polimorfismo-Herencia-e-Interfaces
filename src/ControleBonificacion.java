public class ControleBonificacion {

    private double suma;

    public double getSuma() {
        return this.suma;
    }


    public void registrar(Funcionario e){

        this.suma = this.suma + e.getBonificacion();
    }


}
