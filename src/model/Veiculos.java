/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lcluc
 */
public class Veiculos {
    
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String tipo;
    private String uf;
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public String getPlaca()
    {
        return placa;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public void setUf(String uf)
    {
        this.uf = uf;
    }
    
    public String getUf()
    {
        return uf;
    }
    
}
