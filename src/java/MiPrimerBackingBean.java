/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author francis
 */
@Named(value = "backing")
@RequestScoped
public class MiPrimerBackingBean {
    
    private Integer numero;
    
    /**
     * Creates a new instance of MiPrimerBackingBean
     */
    public MiPrimerBackingBean() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public List<Integer> getDivisores() {
        if (numero == null) {
            return new ArrayList<>();
        }                
        
        List<Integer> divisores = new ArrayList<>();
        for (int i=1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
    
    public String accion() {
        if (numero != null) {
            numero *=2;
        }
        return null;
    }
        
}
