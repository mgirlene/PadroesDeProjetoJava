package ExemploPrototype;

/**
 *
 * @author mgirl
 */
public class Nissan extends Carro {

    public Nissan(String modeloNissan) {
        modelo = modeloNissan;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Nissan) super.clone();
    }

}
