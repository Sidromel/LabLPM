package Testes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Classes.Aeroporto;

public class TesteAeroporto
{
    private Aeroporto aeroporto;

    @Before
    public void setUp(){
        aeroporto = new Aeroporto("Aeroporto Internacional", "Brasil", "INT", "São Paulo", "SP");
    }

    @Test
    public void testGetNome(){
        assertEquals("Aeroporto Internacional", aeroporto.getNome());
    }

    @Test
    public void testSetNome()
    {
        aeroporto.setNome("Aeroporto Nacional");
        assertEquals("Aeroporto Nacional", aeroporto.getNome());
    }

    @Test
    public void testGetSigla(){
        assertEquals("INT", aeroporto.getSigla());
    }

    @Test
    public void testSetSigla()
    {
        aeroporto.setSigla("NAT");
        assertEquals("NAT", aeroporto.getSigla());
    }

    @Test
    public void testGetCidade(){
        assertEquals("São Paulo", aeroporto.getCidade());
    }

    @Test
    public void testSetCidade()
    {
        aeroporto.setCidade("Rio de Janeiro");
        assertEquals("Rio de Janeiro", aeroporto.getCidade());
    }

    @Test
    public void testGetEstado(){
        assertEquals("SP", aeroporto.getEstado());
    }

    @Test
    public void testSetEstado()
    {
        aeroporto.setEstado("RJ");
        assertEquals("RJ", aeroporto.getEstado());
    }

    @Test
    public void testGetPais(){
        assertEquals("Brasil", aeroporto.getPaís());
    }

    @Test
    public void testSetPais()
    {
        aeroporto.setPaís("Argentina");
        assertEquals("Argentina", aeroporto.getPaís());
    }
}