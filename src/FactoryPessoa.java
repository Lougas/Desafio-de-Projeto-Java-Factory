class FactoryPessoa {

    public void getPessoa (String nome, String sexo) {
        if (sexo.equals("M"))
            return new Homem(nome);
        if (sexo.equals("F"))
            return new Mulher(nome);
    }
}
