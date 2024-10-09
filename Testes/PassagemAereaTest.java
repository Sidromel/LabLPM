package Testes;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import Classes.Aeroporto;
import Classes.PassagemAerea;
import Classes.CompanhiaAerea;

public class PassagemAereaTest
{
    private PassagemAerea passagem;
    private CompanhiaAerea companhia;
    private Aeroporto aeroportoOrigem;
    private Aeroporto aeroportoDestino;

    @Before
    public void criandoPassagem()
    {
        aeroportoOrigem = new Aeroporto("Aeroporto Internacional de Guarulhos", "Brasil", "GRU", "São Paulo", "SP");
        aeroportoDestino = new Aeroporto("Aeroporto Internacional de Miami", "EUA", "MIA", "Miami", "FL");
        companhia = new CompanhiaAerea("Latam", "LA123", "Latam Airlines", "01.234.567/0001-89");
        passagem = new PassagemAerea(aeroportoOrigem, aeroportoDestino, new Date(), "LA4567", companhia, 1200.0, 500.0, 300.0, 200.0, 100.0, "BRL", true);
    }

    @Test
    public void testGetAeroportoOrigem(){
        assertEquals(aeroportoOrigem, passagem.getAeroportoOrigem());
    }

    @Test
    public void testSetAeroportoOrigem()
    {
        Aeroporto novoAeroportoOrigem = new Aeroporto("Aeroporto Internacional de Lisboa", "Portugal", "LIS", "Lisboa", "");
        passagem.setAeroportoOrigem(novoAeroportoOrigem);
        assertEquals(novoAeroportoOrigem, passagem.getAeroportoOrigem());
    }

    @Test
    public void testGetCompanhiaAerea(){
        assertEquals(companhia, passagem.getCompanhiaAerea());
    }

    @Test
    public void testSetCompanhiaAerea()
    {
        CompanhiaAerea novaCompanhia = new CompanhiaAerea("Gol", "G123", "Gol Linhas Aéreas", "98.765.432/0001-88");
        passagem.setCompanhiaAerea(novaCompanhia);
        assertEquals(novaCompanhia, passagem.getCompanhiaAerea());
    }

    @Test
    public void testCalcularTarifaTotal()
    {
        double expectedTotal = 1200.0 + 500.0 + 300.0 + 200.0 + 100.0;
        assertEquals(expectedTotal, passagem.CalcularTarifaTotal(), 0.01);
    }

    @Test
    public void testConverterParaDolar()
    {
        double valorEmReais = 500.0;
        double valorEsperado = valorEmReais / 5.0;
        assertEquals(valorEsperado, passagem.converterParaDolar(valorEmReais), 0.01);
    }
}