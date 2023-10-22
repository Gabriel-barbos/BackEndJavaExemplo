public class Manutencao extends Servicos {
    
    public Manutencao(String placa, String chassi, String endereco, String tipoDispositivo, String status) {
        super(placa, chassi, endereco, tipoDispositivo, status);
        //TODO Auto-generated constructor stub
    }
    

    
    @Override
public String toString() {
return( "PLACA: " + getPlaca() + "\n CHASSI: " + getChassi()  + "\n ENDEREÇO: " + getEndereco() + " \n TIPO DO EQUIPAMENTO: " + getTipoDispositivo() + "\n STATUS ATUAL: " + getStatus());
}
}
