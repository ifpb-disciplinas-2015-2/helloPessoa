package service;


import Interface.IPessoa;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Izabel Silva
 */

@Stateless
@Remote(IPessoa.class)
public class Service implements IPessoa{

    @Override
    public String helloPessoa(String nome) {
        return "Olá, " + nome ; 
    }
    
    
}
