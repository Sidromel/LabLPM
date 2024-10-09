package Testes;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Classes.CompanhiaAerea;

public class CompanhiaAereaTest
{
    private CompanhiaAerea companhia;

    @Before
    public void criandoCompanhia(){
        companhia = new CompanhiaAerea("Azul", "AZ123", "Azul Linhas Aéreas", "12.345.678/0001-99");
    }

    @Test
    public void testGetNome(){
        assertEquals("Azul", companhia.getNome());
    }

    @Test
    public void testSetNome()
    {
        companhia.setNome("Gol");
        assertEquals("Gol", companhia.getNome());
    }

    @Test
    public void testGetCodigo(){
        assertEquals("AZ123", companhia.getCodigo());
    }

    @Test
    public void testSetCodigo()
    {
        companhia.setCodigo("GOL456");
        assertEquals("GOL456", companhia.getCodigo());
    }

    @Test
    public void testGetRazaoSocial(){
        assertEquals("Azul Linhas Aéreas", companhia.getRazao_social());
    }

    @Test
    public void testSetRazaoSocial()
    {
        companhia.setRazao_social("Gol Linhas Aéreas");
        assertEquals("Gol Linhas Aéreas", companhia.getRazao_social());
    }

    @Test
    public void testGetCnpj(){
        assertEquals("12.345.678/0001-99", companhia.getCnpj());
    }

    @Test
    public void testSetCnpj()
    {
        companhia.setCnpj("98.765.432/0001-88");
        assertEquals("98.765.432/0001-88", companhia.getCnpj());
    }
}