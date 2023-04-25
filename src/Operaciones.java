public class Operaciones {
    private double valor, resultado;
    private int divisa, divisaConvertir;

    public double getValor() {
        return valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaConvertir() {
        return divisaConvertir;
    }

    public void setDivisaConvertir(int divisaConvertir) {
        this.divisaConvertir = divisaConvertir;
    }
    
    //Constructor

    public Operaciones() {
    }
    
    //Operaciones
    public double convertir(){
        if(divisa == 0 && divisaConvertir == 1){
            resultado = valor * 0.9;
        } else if(divisa == 0 && divisaConvertir == 2){
            resultado = valor * 3.75;
        } else if(divisa == 1 && divisaConvertir == 0){
            resultado = valor * 1.11;
        } else if(divisa == 1 && divisaConvertir == 2){
            resultado = valor * 4.15;
        } else if(divisa == 2 && divisaConvertir == 0){
            resultado = valor * 0.27;
        } else if(divisa == 2 && divisaConvertir == 1){
            resultado = valor * 0.24;
        } else if(divisa == 0 && divisaConvertir == 0 || divisa == 1 && divisaConvertir == 1 || divisa == 2 && divisaConvertir == 2 ){
            resultado = valor;
        }
        
        return resultado;
    }

}
