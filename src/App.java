import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema online!");

        Instalacao i1 = new Instalacao("gay2424", "iyogheb509t", "rua dos bananna - jardim amazonia - numero 45", "GV-50p", null);
        Instalacao i2 = new Instalacao("CHIFRE4", "1234567890", "rua dos caqui - jardim amazonia - numero 55", "GV-50p", "disp enviado dia 15/10");
        Instalacao i3 = new Instalacao("CORNO56", "0987654321", "rua dos jaca - jardim amazonia - numero 85", "GV-50p", "atrasado pois não tinha disp");
        Instalacao i4 = new Instalacao("ABC5777", "1111111111", "rua dos pobre - jardim amazonia - numero 945", "teltonika", "finalizado");

        Manutencao m1 = new Manutencao("VIA7585","H845H90GHBNG053", "times squares", "GV-50P", "AGENDADO");
        Manutencao m2 = new Manutencao("VKTU464","NUIORTN4ET45GF4", "Casa do lula", "GV-50P", "FEITO");
        Manutencao m3 = new Manutencao("AZZZHNT","VB97845H0VE5455", "SABESP", "Mhub", "susbstiução necessaria");

        Remocao r1 = new Remocao("5G54723FF", "VO3HJNVPB8QWCW", "Longe pra kct", "iphone 4s", "removido");
        Remocao r2 = new Remocao("5G54RTHDR", "GEGEGEGERGREGR", "Perto pra kct", "iphone 5s", "veiculo vendido - contatar proprietario");

        int menu = 0;
        ArrayList<Instalacao> listaDeInstalacoes = new ArrayList<>();
        ArrayList<Manutencao> listaDeManutencao = new ArrayList<>();
        ArrayList<Remocao> listaDeRemocao = new ArrayList<>();

        listaDeInstalacoes.add(i1);
        listaDeInstalacoes.add(i2);
        listaDeInstalacoes.add(i3);
        listaDeInstalacoes.add(i4);

        listaDeManutencao.add(m1);
        listaDeManutencao.add(m2);
        listaDeManutencao.add(m3);

        listaDeRemocao.add(r1);        
        listaDeRemocao.add(r2);



        do{
            String  str_menu = JOptionPane.showInputDialog("Bem vindo ! \n Qual ação deseja executar ? \n 1- Cadastrar nova instalação \n 2 - Cadastrar nova manutencão  \n 3- Cadastrar nova remoção  \n 4- visualizar todos os serviços \n 5- atualizar status de um serviço \n 6- editar um serviço \n 0- sair");
            menu = Integer.parseInt(str_menu);

            switch(menu){

                case 1:{
                    String placa; 
                    String chassi; 
                    String endereco; 
                    String tipoDispositivo; 
                    String status; // ADD OUTROS TIPOS DE STATUS


              String str_placaAuth = JOptionPane.showInputDialog("possui placa ? \n 1 - NAO \n 2 - sim ");
                int  placaAuth = Integer.parseInt(str_placaAuth);
                //SUBSTITUIR LOGICA POR BOOLEAN E USAR CHECKBOX NO FRONT

                if(placaAuth == 2){
                     placa = JOptionPane.showInputDialog("insira a placa do veiculo ");
                    chassi = JOptionPane.showInputDialog("insira o  chassi do veiculo");
                    endereco = JOptionPane.showInputDialog("insira o endereco que o veiculo está");
                    tipoDispositivo = JOptionPane.showInputDialog("insira o tipo de dispositivo");
                   status  = JOptionPane.showInputDialog("insira o status");
                   listaDeInstalacoes.add(new Instalacao(placa, chassi, endereco, tipoDispositivo, status));
                }
                else{
                    chassi = JOptionPane.showInputDialog("insira o  chassi do veiculo");
                    endereco = JOptionPane.showInputDialog("insira o endereco que o veiculo está");
                    tipoDispositivo = JOptionPane.showInputDialog("insira o tipo de dispositivo");
                    status = JOptionPane.showInputDialog("insira o status");
                    listaDeInstalacoes.add(new Instalacao(chassi, endereco, tipoDispositivo, status));
                }
                 
                JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO ");
                break;
                }


                case 2:{
                    String placa;
                    String chassi;
                    String endereco;
                    String tipoDispositivo;
                    String status; // ADD OUTROS TIPOS DE STATUS

                    placa = JOptionPane.showInputDialog("insira a placa do veiculo ");
                    chassi = JOptionPane.showInputDialog("insira o  chassi do veiculo");
                    endereco = JOptionPane.showInputDialog("insira o endereco que o veiculo está");
                    tipoDispositivo = JOptionPane.showInputDialog("insira o tipo de dispositivo");
                    status = JOptionPane.showInputDialog("insira o status");
                    listaDeManutencao.add(new Manutencao(placa, chassi, endereco, tipoDispositivo, status));

                    JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO ");

                    break;
                }

                case 3:{
                    String placa;
                    String chassi;
                    String endereco;
                    String tipoDispositivo;
                    String status; // ADD OUTROS TIPOS DE STATUS

                    placa = JOptionPane.showInputDialog("insira a placa do veiculo ");
                    chassi = JOptionPane.showInputDialog("insira o  chassi do veiculo");
                    endereco = JOptionPane.showInputDialog("insira o endereco que o veiculo está");
                    tipoDispositivo = JOptionPane.showInputDialog("insira o tipo de dispositivo");
                    status = JOptionPane.showInputDialog("insira o status");
                    listaDeRemocao.add(new Remocao(placa, chassi, endereco, tipoDispositivo, status));

                    JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO ");

                    break;
                }

                case 4:{
                    int cont = 1;
                    System.out.println("LISTA DE INSTALAÇÕES :");

                    for (Instalacao instalacao : listaDeInstalacoes){
                        System.out.println("instalação " + cont + "\n" + instalacao.toString() + "\n");
                        cont++;
                    }

                    System.out.println("LISTA DE MANUTENÇÕES :");

                    for (Manutencao manutencao : listaDeManutencao){
                        System.out.println("manutenção " + cont + "\n" + manutencao.toString() + "\n");
                        cont++;
                    }

                    System.out.println("LISTA DE REMOÇÕES : ");

                    for (Remocao remocao : listaDeRemocao){
                        System.out.println("remocão " + cont + "\n" + remocao.toString() + "\n");
                        cont++;
                    }
                    break;
                }

                case 5: {
                    //busca de serviços 
                    String  str_opcao = JOptionPane.showInputDialog("Qual serviço deseja atribuir um status ? \n 1 - instalações , 2 - manutencões, 3 - remocões");
                    int  opcao = Integer.parseInt(str_opcao);

                    switch(opcao){
                        case 1: {
                        String chassiBusca = JOptionPane.showInputDialog("digite o chassi do carro que deseja procurar ?");
                            Instalacao carroEncontrado = null;
                            for(Instalacao carro: listaDeInstalacoes){
                                if(carro.getChassi().equals(chassiBusca)){
                                    carroEncontrado = carro;
                                    break;
                                } 
                            }
                            if(carroEncontrado != null) {
                                JOptionPane.showMessageDialog(null,"CARRO ENCONTRADO: " + carroEncontrado);
                                String novoStatus = JOptionPane.showInputDialog("digite o novo status: ");
                                carroEncontrado.setStatus(novoStatus);
                                JOptionPane.showMessageDialog(null,"Status atualizado" + carroEncontrado);
                            }else {
                            JOptionPane.showMessageDialog(null,"CARRO NÃO ENCONTRADO :( ");
                            }
                            break;
                        }

                         case 2: {
                        String chassiBusca = JOptionPane.showInputDialog("digite o chassi do carro que deseja procurar ?");
                            Manutencao carroEncontrado = null;
                            for(Manutencao carro: listaDeManutencao){
                                if(carro.getChassi().equals(chassiBusca)){
                                    carroEncontrado = carro;
                                    break;
                                } 
                            }
                            if(carroEncontrado != null) {
                                JOptionPane.showMessageDialog(null,"CARRO ENCONTRADO: " + carroEncontrado);
                                String novoStatus = JOptionPane.showInputDialog("digite o novo status: ");
                                carroEncontrado.setStatus(novoStatus);
                                JOptionPane.showMessageDialog(null,"Status atualizado" + carroEncontrado);
                            }else {
                            JOptionPane.showMessageDialog(null,"CARRO NÃO ENCONTRADO :( ");
                            }
                            break;
                        }

                         case 3: {
                        String chassiBusca = JOptionPane.showInputDialog("digite o chassi do carro que deseja procurar ?");
                            Remocao carroEncontrado = null;
                            for(Remocao carro: listaDeRemocao){
                                if(carro.getChassi().equals(chassiBusca)){
                                    carroEncontrado = carro;
                                    break;
                                } 
                            }
                            if(carroEncontrado != null) {
                                JOptionPane.showMessageDialog(null,"CARRO ENCONTRADO: " + carroEncontrado);
                                String novoStatus = JOptionPane.showInputDialog("digite o novo status: ");
                                carroEncontrado.setStatus(novoStatus);
                                JOptionPane.showMessageDialog(null,"Status atualizado" + carroEncontrado);
                            }else {
                            JOptionPane.showMessageDialog(null,"CARRO NÃO ENCONTRADO :( ");
                            }
                            break;
                        }
                    }
            }

                           case 6: {
                String str_opcao = JOptionPane.showInputDialog(
                        "Qual serviço deseja editar? \n 1 - instalações , 2 - manutencões, 3 - remocões");
                int opcao = Integer.parseInt(str_opcao);

                switch (opcao) {
                    case 1: {
                        String chassiBusca = JOptionPane
                                .showInputDialog("digite o chassi do carro que deseja procurar ?");
                        Instalacao carroEncontrado = null;
                        for (Instalacao carro : listaDeInstalacoes) {
                            if (carro.getChassi().equals(chassiBusca)) {
                                carroEncontrado = carro;
                                break;
                            }
                        }
                        if (carroEncontrado != null) {
                            JOptionPane.showMessageDialog(null, "CARRO ENCONTRADO: " + carroEncontrado);
                            String novaPlaca = JOptionPane.showInputDialog("digite a nova placa: ");
                            carroEncontrado.setStatus(novaPlaca);
                            
                            String novoChassi = JOptionPane.showInputDialog("digite o novo chassi: ");
                            carroEncontrado.setChassi(novoChassi);

                             String novoEndereco= JOptionPane.showInputDialog("digite o novo endereço: ");
                            carroEncontrado.setEndereco(novoEndereco);

                             String novoEquip = JOptionPane.showInputDialog("digite o novo equipamento: ");
                            carroEncontrado.setTipoDispositivo(novoEquip);

                            

                            JOptionPane.showMessageDialog(null, "Serviço atualizado" + carroEncontrado);
                        } else {
                            JOptionPane.showMessageDialog(null, "CARRO NÃO ENCONTRADO :( ");
                        }
                        break;
                    }

                    case 2: {
                        String chassiBusca = JOptionPane
                                .showInputDialog("digite o chassi do carro que deseja procurar ?");
                        Manutencao carroEncontrado = null;
                        for (Manutencao carro : listaDeManutencao) {
                            if (carro.getChassi().equals(chassiBusca)) {
                                carroEncontrado = carro;
                                break;
                            }
                        }
                        if (carroEncontrado != null) {
                             JOptionPane.showMessageDialog(null, "CARRO ENCONTRADO: " + carroEncontrado);
                            String novaPlaca = JOptionPane.showInputDialog("digite a nova placa: ");
                            carroEncontrado.setStatus(novaPlaca);
                            
                            String novoChassi = JOptionPane.showInputDialog("digite o novo chassi: ");
                            carroEncontrado.setChassi(novoChassi);

                             String novoEndereco= JOptionPane.showInputDialog("digite o novo endereço: ");
                            carroEncontrado.setEndereco(novoEndereco);

                             String novoEquip = JOptionPane.showInputDialog("digite o novo equipamento: ");
                            carroEncontrado.setTipoDispositivo(novoEquip);

                            

                            JOptionPane.showMessageDialog(null, "Serviço atualizado" + carroEncontrado);
                        } else {
                            JOptionPane.showMessageDialog(null, "CARRO NÃO ENCONTRADO :( ");
                        }
                        break;
                    }

                    case 3: {
                        String chassiBusca = JOptionPane
                                .showInputDialog("digite o chassi do carro que deseja procurar ?");
                        Remocao carroEncontrado = null;
                        for (Remocao carro : listaDeRemocao) {
                            if (carro.getChassi().equals(chassiBusca)) {
                                carroEncontrado = carro;
                                break;
                            }
                        }
                        if (carroEncontrado != null) {
                       JOptionPane.showMessageDialog(null, "CARRO ENCONTRADO: " + carroEncontrado);
                            String novaPlaca = JOptionPane.showInputDialog("digite a nova placa: ");
                            carroEncontrado.setStatus(novaPlaca);
                            
                            String novoChassi = JOptionPane.showInputDialog("digite o novo chassi: ");
                            carroEncontrado.setChassi(novoChassi);

                             String novoEndereco= JOptionPane.showInputDialog("digite o novo endereço: ");
                            carroEncontrado.setEndereco(novoEndereco);

                             String novoEquip = JOptionPane.showInputDialog("digite o novo equipamento: ");
                            carroEncontrado.setTipoDispositivo(novoEquip);

                            

                        } else {
                            JOptionPane.showMessageDialog(null, "CARRO NÃO ENCONTRADO :( ");
                        }
                        break;
                    }
                }

            }
        }

    }while(menu != 0);
             
    }
}
