import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Entrar {

    private static List<Conta> c1 = new ArrayList<>();
    private static List<Servico> s1 = new ArrayList<>();
    private String data;

    public static void entrar(){

        JTextField campo1 = new JTextField();
        JTextField campo2 = new JTextField();
        boolean check = false;
        int opcao;
        String[] opcoes = {"Agendar Consulta", "Sair"};

        Object [] entrada = {
                "Nome", campo1,
                "Email", campo2
        };

        JOptionPane.showConfirmDialog(null,entrada,"Entrar",
                JOptionPane.OK_CANCEL_OPTION);
        String nome = campo1.getText();
        String email = campo2.getText();

        for(Conta conta : c1){
            if((nome!=null || !nome.isEmpty()) && (email!=null || !email.isEmpty())){
                if(conta.getNome().equals(nome) && conta.getEmail().equals(email)){
                    check = true;
                    break;
                }else{
                    check = false;
                }
            }else{
                check = false;
            }

        }
        if(check){
            JOptionPane.showMessageDialog(null,"Conta encontrada com sucesso" );
            do{
                opcao = JOptionPane.showOptionDialog(null, "Selecione:", "Operação",
                        0, 3, null, opcoes, opcoes[0]);
                switch(opcao){
                    case 0:
                        JOptionPane.showMessageDialog(null,"Você escolheu: "
                                + opcoes[0]);
                        agendarConsulta();
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,"Você escolheu: "
                                + opcoes[1]);
                        break;
                    default:

                        break;
                }
            }while(opcao!=1);
        }else{
            JOptionPane.showMessageDialog(null,"Conta não encontrada",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void preencherConta(Conta conta){
        c1.add(conta);
    }

    public static void preencherServico(Servico servico){
        s1.add(servico);
    }

    public static void agendarConsulta(){
        String[] lista = preencherVetor();
        try{
            Object selecao = JOptionPane.showInputDialog(null,"Escolha o serviço:",
                    "Serviços",JOptionPane.QUESTION_MESSAGE,null,lista,lista[0]);
            System.out.println(selecao);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Sem serviços cadastrados.",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }

    }

    public static String[] preencherVetor(){
        int cont=0;
            for(int i=0;i<s1.size();i++)cont++;
            String[] lista = new String[cont];
            for(Servico servico : s1){
                for(int i=0;i<s1.size();i++){
                    try{
                        if(lista[i] == null || lista[i] == ""){
                            lista[i] = servico.getNome();
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                        System.out.println(Arrays.toString(lista));
                        System.out.println("erro " + e);
                    }
                }
            }
        return lista;
    }

}