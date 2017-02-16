/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseniotarea02;

/**
 *
 * @author cervanteshernandez
 */


interface Camara {
    public void fotografiar( );
    public double getMegapixeles();
}

interface SoportaVideo
{
    public void grabar();
}

interface Plug
{
    public void conectar();
}

interface Conector
{
    public void cargar();
}


class ConectorAdapatador implements Conector
{
    Plug plug;
    public ConectorAdapatador(Plug _plug) {
        plug = _plug;
    }

    @Override
    public void cargar() {
        this.cargar();
    }

    public Plug getPlug() {
        return plug;
    }

    public void setPlug(Plug plug) {
        this.plug = plug;
    }
    
    
}

abstract class Disposito implements Camara
{
    final String color;
    final int precio;
    final double megapixeles;

    public Disposito(String color, int precio, double megapixeles) {
        this.color = color;
        this.precio = precio;
        this.megapixeles = megapixeles;
    }
    
    public abstract void encender();

    public String getColor() {
        return color;
    }
    
    public int getPrecio() {
        return precio;
    }
    @Override
    public void fotografiar() {
        System.out.println("Fotografiando"); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public double getMegapixeles()
    {
        return megapixeles;
    }
    
}




class SamsungGalaxy extends Disposito implements SoportaVideo
{

    public SamsungGalaxy(String color, int precio, double megapixeles) {
        super(color, precio, megapixeles);
    }

    @Override
    public void encender() {
        System.out.println("Encendido"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void grabar() {
        System.out.println("Grabar");
   }
    
}

public class DisenioTarea02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SamsungGalaxy sg = new SamsungGalaxy("rojo",10,12.3);
       
       System.out.println(sg.getColor());
               
    }
    
}
