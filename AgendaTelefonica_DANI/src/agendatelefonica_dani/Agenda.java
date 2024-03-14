/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendatelefonica_dani;

/**
 *
 * @author Medac
 */
public class Agenda {
    String [] Agenda = new String [20];

    public Agenda(String [] Agenda) {
        this.Agenda = Agenda;
    }

    public String[] getAgenda() {
        return Agenda;
    }

    @Override
    public String toString() {
        return "Agenda{" + "Agenda=" + Agenda + '}';
    }
    
    
    public void Mostrar_todo(){
        for(int i = 0; i < Agenda.length; i++){
            if(Agenda[i] != null){
                String [] division = Agenda[i].split(":");
                System.out.print("Nombre: " + division[0]+" || ");
                System.out.print("Número de teléfono: "+ division[1]);
                System.out.println("");
            }
        }
    }
    
    public void Buscar_por_Nombre(String nombre){
        for(int i = 0; i < Agenda.length; i++){
            if(Agenda[i] != null){
                String [] division = Agenda[i].split(":");
                if(division[0].equalsIgnoreCase(nombre)){
                   System.out.print("Nombre: " + division[0]+" || ");
                   System.out.print("Número de teléfono: "+ division[1]);
                   System.out.println(""); 
                }else{
                    continue;
                }
            }
        }
    }
    
    public void Agregar_Contacto(){
        
    }
}
