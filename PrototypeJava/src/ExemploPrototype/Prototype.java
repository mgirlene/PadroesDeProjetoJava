package ExemploPrototype;

/**
 *
 * @author mgirl
 */
public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        Carro nissan = new Nissan("Sentra");
        nissan.preco = 80000;

        Carro ford = new Ford("Focus");
        ford.preco = 600000;

        Carro c1;

        c1 = nissan.clone();

        c1.preco = nissan.preco + Carro.setPreco();
        System.out.println("Nome do carro: " + c1.getModelo() + " \nPreço: " + c1.preco);

        c1 = ford.clone();
        c1.preco = ford.preco + Carro.setPreco();
        System.out.println("Nome do carro: " + c1.getModelo() + " \nPreço: " + c1.preco);

    }
}
