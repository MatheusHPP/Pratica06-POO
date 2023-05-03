import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        String dataCriacao, nomeUsuario, dataNascimento, senha;
        String dataPublicacao, textoPublicacao, LinkMidia;

        dataCriacao = JOptionPane.showInputDialog("Digite a data de criação da rede social: ");
        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuario: ");
        dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        senha = JOptionPane.showInputDialog("Digite a senha: ");
        RedeSocial redesocial1 = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
        Publicacao publi1; //variavel do tipo publicação
        ArrayList<Publicacao> publi = new ArrayList<>();
        for (int i=0; i<3; i++){
            dataPublicacao = JOptionPane.showInputDialog("Digite a data de publicação: ");
            textoPublicacao = JOptionPane.showInputDialog("Digite o texto: ");
            LinkMidia = JOptionPane.showInputDialog("Digite o link: ");
            publi1 = new Publicacao(dataPublicacao, textoPublicacao, LinkMidia);
            publi.add(publi1); //adiciona o objeto no ArrayList
            redesocial1.inserePublicacao(publi1);//adiciona o objeto na redesocial
        }
        redesocial1.imprimePublicacoes();
    }







}
