import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Entrar {

    List<Conta> c1 = new ArrayList<>();

    public void entrar(){
        //ERRO AQUI PARA ARRUMAR
        for (Conta conta : c1) {
            System.out.println(conta.getNome());
            JOptionPane.showMessageDialog(null, conta.getNome());
        }
    }

    public void preencher(ArrayList<Conta> contas){

        this.c1 = contas;
        for (Conta conta : c1) {
            JOptionPane.showMessageDialog(null, conta.getNome());
        }
    }

    public void AgendarConsulta(){

    }

}
