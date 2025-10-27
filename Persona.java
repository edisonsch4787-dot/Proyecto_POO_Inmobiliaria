/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo_inmobiliaria;

/**
 *
 * @author Mafer
 */
abstract class Persona {
    private String id;
    private String nombre;
    private String ci;
    private String telf;
    private String email;
    
    public Persona(String id, String n, String ci, String telf, String email){
        this.id=id;
        this.nombre=n;
        this.ci=ci;
        this.telf=telf;
        this.email=email;
    }
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCi(){
        return ci;
    }
    public String getTelf(){
        return telf;
    }
    public String getEmail(){
        return email;
    }
    public void setId(String i){
        id=i;
    }
    public void setNombre(String n){
        nombre=n;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    public void setEmail(String user){
        if(user.contains("@outlook.com")){
            email=user;
        }
        else{
            email=user+"@outlook.com";
        }
        System.out.printf("Correo: %s\n",email);
    }
    @Override
    public String toString(){
        return nombre+"| id: "+id+"| Ci: "+ci;
    }
    
}
