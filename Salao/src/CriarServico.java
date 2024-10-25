import javax.swing.*;
import java.util.ArrayList;

public class CriarServico {

    private ArrayList<Servico> servicos = new ArrayList<>();

    public void criarServico(){
        Servico servico = new Servico();
        Validadora valida = new Validadora();
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ",
                "Nome",3);
        boolean nameEmpty = valida.isFieldEmpty(nome);
        if (!nameEmpty) servico.setNome(nome);

        while(nameEmpty){
            if (!nameEmpty) {
                servico.setNome(nome);
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Nome não pode ser vazio",
                        "Erro",JOptionPane.ERROR_MESSAGE);
                nome = JOptionPane.showInputDialog(null, "Digite o nome: ",
                        "Nome",3);
                nameEmpty = valida.isFieldEmpty(nome);
            }
        }

        String descricao = JOptionPane.showInputDialog(null,
                "Digite a descrição do serviço: ","Descrição",3);
        boolean descEmpty = valida.isFieldEmpty(descricao);
        boolean descLenght = servico.verificaDescricao(descricao);

        if (!descEmpty && descLenght) servico.setDescricao(descricao);

        while(descEmpty || !descLenght){
            if (!nameEmpty && descLenght) {
                servico.setDescricao(descricao);
                break;
            }else{
                if(descEmpty){
                    JOptionPane.showMessageDialog(null,"Descrição não pode ser vazia",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                    descricao = JOptionPane.showInputDialog(null, "Digite a descrição: ",
                            "Descrição",3);
                    descEmpty = valida.isFieldEmpty(descricao);
                }

                if(!descLenght){
                    JOptionPane.showMessageDialog(null,"Descrição não pode ser " +
                                    "menor que 30 caracteres",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                    descricao = JOptionPane.showInputDialog(null, "Digite a descrição: ",
                            "Descrição",3);
                    descLenght = servico.verificaDescricao(descricao);
                }
            }
        }
        boolean check = true;
        try{
            float valor = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Digite o valor do serviço: ","Valor",3));
            boolean valorZero = servico.verificaValorZero(valor);

            if(!valorZero) servico.setValor(valor);

            while(valorZero){
                if(!valorZero){
                    servico.setValor(valor);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,"Valor não pode ser 0.0",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                    valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor: ",
                            "Descrição",3));
                    valorZero = servico.verificaValorZero(valor);
                }
            }

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Valor não pode ser " +
                            "nulo",
                    "Erro",JOptionPane.ERROR_MESSAGE);
            check = false;
        }



        if(check){
            servicos.add(servico);
            Entrar.preencherServico(servico);
            JOptionPane.showMessageDialog(null,"Serviço adicionado com sucesso.");
        }else{
            JOptionPane.showMessageDialog(null,"Serviço não adicionado.",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }

}