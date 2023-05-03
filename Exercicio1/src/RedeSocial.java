import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao, nomeUsuario, dataNascimento, senha;
    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    void imprimePublicacoes() {

        System.out.println("Total de publicações:" + Publicacao.getContadorPublicacao());
        for ( int i=0; i < publicacoes.size(); i++) ;
        {
            System.out.println("Data da Publicação: " + publicacoes.get(i).getDataPublicacao());
            System.out.println("Texto da publicação: " + publicacoes.get(i).getTextoPublicacao());

        }
    }

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }
}



