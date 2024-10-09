package Testes;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import java.util.List;
import Classes.Compra;
import Classes.Aeroporto;
import Classes.PassagemAerea;
import Classes.CompanhiaAerea;

public class CompraTest
{
    private Compra compra;
    private CompanhiaAerea companhia;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;
    private List<PassagemAerea> passagens;

    @Before
    public void criandoCompras()
    {
        aeroportoOrigem = new Aeroporto("Aeroporto Internacional de Guarulhos", "Brasil", "GRU", "São Paulo", "SP");
        aeroportoDestino = new Aeroporto("Aeroporto Internacional de Miami", "EUA", "MIA", "Miami", "FL");
        companhia = new CompanhiaAerea("Latam", "LA123", "Latam Airlines", "01.234.567/0001-89");
        passagens = new ArrayList<>();
        passagens.add(new PassagemAerea(aeroportoOrigem, aeroportoDestino, new Date(), "LA4567", companhia, 1200.0, 500.0, 300.0, 200.0, 100.0, "BRL", true));
        compra = new Compra(passagens, 0.1);
    }

    @Test
    public void testGetPassagens(){
        assertEquals(passagens, compra.getPassagens());
    }

    @Test
    public void testSetPassagens()
    {
        List<PassagemAerea> novasPassagens = new ArrayList<>();
        novasPassagens.add(new PassagemAerea(aeroportoDestino, aeroportoOrigem, new Date(), "LA9876", companhia, 1500.0, 600.0, 400.0, 250.0, 150.0, "BRL", false));
        compra.setPassagens(novasPassagens);
        assertEquals(novasPassagens, compra.getPassagens());
    }

    @Test
    public void testGetValorTotal()
    {
        double expectedTotal = 1200.0 + 500.0 + 300.0 + 200.0 + 100.0;
        assertEquals(expectedTotal, compra.getValorTotal(), 0.01);
    }

    @Test
    public void testCalcularRemuneracao()
    {
        double valorTotal = compra.getValorTotal();
        double remuneracaoEsperada = valorTotal * 0.1;
        assertEquals(remuneracaoEsperada, compra.CalcularRemuneracao(), 0.01);
    }

    @Test
    public void testRealizarCompra(){
        compra.RealizarCompra();
    }
}