import javax.swing.*;
public class Controle {

    public Controle(){
        int opcao;
        String[] opcoes = {"Entrar", "Registrar conta", "Cadastrar serviço", "Sair"};

        do{
        opcao = JOptionPane.showOptionDialog(null, "Selecione:", "Operação",
                0, 3, null, opcoes, opcoes[0]);
        switch(opcao){
            case 0:
                JOptionPane.showMessageDialog(null,"Você escolheu: " + opcoes[0]);

                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Você escolheu: " + opcoes[1]);

                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Você escolheu: " + opcoes[2]);

                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Você escolheu: " + opcoes[3]);
                break;
            default:
                break;
        }}while(opcao!=3);
    }

}
