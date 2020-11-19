package ExemploPrototype;

import java.util.Random;

/**
 *
 * @author mgirl
 */
public abstract class Carro implements Cloneable {

    public String modelo;
    public int preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int setPreco() {
        int preco = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        preco = p;
        return preco;
    }

    public Carro clone() throws CloneNotSupportedException {
        return (Carro) super.clone();
    }

}
