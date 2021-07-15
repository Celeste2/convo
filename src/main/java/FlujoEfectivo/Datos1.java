/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlujoEfectivo;

/**
 *
 * @author JADPA26
 */
public class Datos1 {
    int inversion;
    int plazo;
    float tasa;
    int Valorsalvamento;

    public Datos1() {
    }

    public Datos1(int inversion, int plazo, float tasa, int Valorsalvamento) {
        this.inversion = inversion;
        this.plazo = plazo;
        this.tasa = tasa;
        this.Valorsalvamento = Valorsalvamento;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public int getValorsalvamento() {
        return Valorsalvamento;
    }

    public void setValorsalvamento(int Valorsalvamento) {
        this.Valorsalvamento = Valorsalvamento;
    }
    
}
