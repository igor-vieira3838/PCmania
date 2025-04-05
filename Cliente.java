public class Cliente {
    String nome;
    long cpf;
    Computador[] comp = new Computador[3];

    public float calculaTotalCompra(){
        float soma = 0;
        for(Computador i:comp){
            if(i == null)
                break;
            soma += i.preco;
        }
        return soma;
    }
}
