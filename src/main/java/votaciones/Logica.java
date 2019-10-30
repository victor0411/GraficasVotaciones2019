/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaciones;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author victor
 */
@Named(value = "logica")
@Dependent
public class Logica {

    private int candidato1=0;
    private int candidato2=0;
    private int candidato3=0;
    
    public int contar1(){
    
        candidato1=candidato1+1;
        return candidato1;
        
    }
    
     public int contar2(){
    
        candidato2=candidato2+1;
        return candidato2;
        
    }
     
      public int contar3(){
    
        candidato3=candidato3+1;
        return candidato3;
        
    }

    public String devolverGanador(){
    
        String ganador="";
        if(candidato1>candidato2 && candidato1>candidato3){
            ganador="Ganador Carlos Galan";
        }else if(candidato2>candidato1 && candidato2>candidato3){
            ganador="Ganador Claudia Lopez";
        }else if(candidato3>candidato1 && candidato3>candidato2){
            ganador="Ganador Miguel Uribe";
        }else{
            ganador="Empate Tecnico habra segunda vuelta";
        }
        return ganador;
    }
      
    public Logica(int candidato1, int candidato2, int candidato3) {
        this.candidato1 = candidato1;
        this.candidato2 = candidato2;
        this.candidato3 = candidato3;
    }

    public int getCandidato1() {
        return candidato1;
    }

    public void setCandidato1(int candidato1) {
        this.candidato1 = candidato1;
    }

    public int getCandidato2() {
        return candidato2;
    }

    public void setCandidato2(int candidato2) {
        this.candidato2 = candidato2;
    }

    public int getCandidato3() {
        return candidato3;
    }

    public void setCandidato3(int candidato3) {
        this.candidato3 = candidato3;
    }

    
    
    public Logica() {
    }
    
}
