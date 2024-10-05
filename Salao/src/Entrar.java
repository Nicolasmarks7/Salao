import javax.swing.*;

public class Entrar {

    public Entrar(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ",
                "Nome",3);
        String email = JOptionPane.showInputDialog(null, "Digite o email: ",
                "Email",3);
        int telefone = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o telefone: ","Telefone",3));
        String endereco = JOptionPane.showInputDialog(null, "Digite o endereço: ",
                "Endereço",3);
    }

    public void AgendarConsulta(){

    }

}
