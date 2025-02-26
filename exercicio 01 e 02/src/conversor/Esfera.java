package conversor;

public class Esfera {

    private float raio;
    
    private static final float PI = (float) Math.PI; 

    public Esfera(float r) {
        raio = r;
    }

    public void setRaio(float r) {
        raio = r;
    }

    public float calcularVolume() {
        return (4.0f / 3.0f) * PI * raio * raio * raio; 
    }

    public float calcularArea() {
        return 4 * PI * raio * raio;
    }
}
