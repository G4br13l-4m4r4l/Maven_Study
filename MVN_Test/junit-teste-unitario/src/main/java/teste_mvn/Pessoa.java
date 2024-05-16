package teste_mvn;

public class Pessoa {
    private String name;
    private int conta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Pessoa(String name, int conta){
        this.name = name;
        this.conta = conta;
    }

    public boolean temConta(){
        if(getConta() > 0){
            return true;
        }else{
            return false;
        }
    }

    
}
