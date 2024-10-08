import javax.swing.*;
import java.util.ArrayList;

public class CriarConta {

    private ArrayList<Conta> contas = new ArrayList<>();

    public void criarContas(){
        Conta conta = new Conta();
        conta.setNome(JOptionPane.showInputDialog(null, "Digite o nome: ",
                "Nome",3));
        conta.setEmail(JOptionPane.showInputDialog(null, "Digite o email: ",
                "Email",3));
        conta.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o telefone: ","Telefone",3)));
        conta.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço: ",
                "Endereço",3));
        contas.add(conta);
        Entrar.preencherConta(conta);
    }

}