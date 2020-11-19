package ExemploBuilder;

/**
 *
 * @author mgirl
 */
public class Pizza {

    private final int tamanho;
    private final boolean queijo;
    private final boolean calabresa;
    private final boolean cebola;

    public static class Builder {

        private int tamanho;
        private boolean queijo = false;
        private boolean calabresa = false;
        private boolean cebola = false;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            queijo = true;
            return this;
        }

        public Builder calabresa() {
            calabresa = true;
            return this;
        }

        public Builder cebola() {
            cebola = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijo = builder.queijo;
        this.calabresa = builder.calabresa;
        this.cebola = builder.cebola;
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(8).queijo().calabresa().cebola().build();
        System.out.println("Pizza feita!!!");
    }

}
