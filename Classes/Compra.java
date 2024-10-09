package Classes;
import java.util.List;

public class Compra
{
    private double valorTotal;
    private double remuneracaoAgencia;
    private List<PassagemAerea> passagens;

    //CONSTRUTOR:
    public Compra(List<PassagemAerea> passagens, double remuneracaoAgencia)
    {
        this.passagens          = passagens;
        this.valorTotal         = calcularValorTotal();
        this.remuneracaoAgencia = remuneracaoAgencia;
    }

    //SETTERES AND GETTERES:
    public List<PassagemAerea> getPassagens(){
        return passagens;
    }

    public void setPassagens(List<PassagemAerea> passagens){
        this.passagens=passagens;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    public void setValorTotal(double valorTotal){
        this.valorTotal=valorTotal;
    }

    public double getRemuneracaoAgencia(){
        return remuneracaoAgencia;
    }

    public void setRemuneracaoAgencia(double remuneracaoAgencia){
        this.remuneracaoAgencia=remuneracaoAgencia;
    }

    // Método para calcular o valor total da compra
    private double calcularValorTotal()
    {
        double total = 0;
        for(PassagemAerea passagem : passagens){
            total += passagem.CalcularTarifaTotal();
        }
        return total;
    }

    // Método para realizar a compra
    public void RealizarCompra(){
        System.out.println("Compra realizada com sucesso! Valor total: " + valorTotal);
    }

    // Método para calcular a remuneração da agência
    public double CalcularRemuneracao(){
        return valorTotal * remuneracaoAgencia;
    }
}