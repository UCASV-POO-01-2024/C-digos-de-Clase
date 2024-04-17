package Empleado;

import Persona.Persona;

public class ETiempoCompleto extends Empleado {
    public ETiempoCompleto() {}

    public ETiempoCompleto(Persona persona, String carnet, float salarioBase) {
        guardarDatosPersonales(persona);
        setCarnet(carnet);
        setSalarioBase(salarioBase);
    }

    public float obtenerSalario() {
        return super.salarioBase;
    }
}
