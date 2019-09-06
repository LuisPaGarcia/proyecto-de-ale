package clase;

public class Salario {

    private float SalarioBase;
    private float Bonificacion;

    public Salario(float SalarioBase, float Bonificacion) {
        this.SalarioBase = SalarioBase;
        this.Bonificacion = Bonificacion;
    }

    public float getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(float SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public float getBonificacion() {
        return Bonificacion;
    }

    public void setBonificacion(float Bonificacion) {
        this.Bonificacion = Bonificacion;
    }

    public float CalcularIGSS() {
        return (float) (SalarioBase * 4.83 / 100);
    }

    public float CalcularISR() {
        return (float) (SalarioBase * 5 / 100);
    }

    public float CalcularMonto_Pagar() {
        return SalarioBase + Bonificacion - CalcularIGSS() - CalcularISR();

    }

}
