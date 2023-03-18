public class TesteApp {
    public static void main (String args[]){
        FactoryPessoa factory = new FactoryPessoa();
        String nome = "Lougas";
        String sexo = "M";
        factory.getPessoa(nome, sexo);
    }
}
