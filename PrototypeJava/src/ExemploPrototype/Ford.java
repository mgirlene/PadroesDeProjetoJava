package ExemploPrototype;

/**
 *
 * @author mgirl
 */
public class Ford extends Carro {

    public Ford(String modeloFord) {
        modelo = modeloFord;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
