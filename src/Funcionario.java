public class Funcionario {


         private String nombre;
         private int documento;
         private double salario;
         private int tipo;


         // Si tipo = 1 es gerente
         // Si tipo = 0 es funcionario
         public double getBonificacion(){
             if(this.tipo == 0) {
                 return this.salario * 0.1;
             } else if (this.tipo == 1) {
                return this.salario;
             }

             return 0;
         }
    public Funcionario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
