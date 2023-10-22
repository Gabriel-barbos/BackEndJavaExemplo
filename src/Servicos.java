public class Servicos {
    

//ATRIBUTOS
private String placa;
private String chassi;
private String endereco;
private String tipoDispositivo;
private String status;

//CONTADOR DE SERVIÇOS 

private static int cont = 0;

public static int getCont() {
    return cont;
}


private final int numero;

public int getNumero() {
    return numero;
}

//CONSTRUTORES

//COM PLACA
public Servicos (String placa, String chassi, String endereco, String tipoDispositivo, String status){
    this.placa = placa;
    this.chassi = chassi;
    this.endereco = endereco;
    this.tipoDispositivo = tipoDispositivo;
    this.status = status;
    cont++;
    numero = cont;
}

//SEM PLACA
public Servicos ( String chassi, String endereco, String tipoDispositivo, String status){
    
    this.chassi = chassi;
    this.endereco = endereco;
    this.tipoDispositivo = tipoDispositivo;
    this.status = status;
    cont++;
    numero = cont;
}




//METODOS GETTERS E SETTERS 

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getChassi() {
    return chassi;
}

public void setChassi(String chassi) {
    this.chassi = chassi;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTipoDispositivo() {
    return tipoDispositivo;
}

public void setTipoDispositivo(String tipoDispositivo) {
    this.tipoDispositivo = tipoDispositivo;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}





}
