/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LYKAN
 */
public class Usuarios {
    private String nombre;
    private String nickname;
    private String clave;
    private static ArrayList<Usuarios> listaUsuario = new ArrayList<>();

    public Usuarios(String nombre, String nickname, String clave) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.clave = clave;
    }

    public Usuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
     
 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
 public  void guardarUsuario(){
        listaUsuario.add(this);
 }
 public static void listado(){
     System.out.println("numero de usuarios");
     StringBuilder sb = new StringBuilder();
        for(Usuarios usuario:listaUsuario){
        sb.append("nombre:").append(usuario.getNombre()).append(",usuario:").append(usuario.getNickname()).append(",clave:").append(usuario.getClave()).append("\n");  
     }
     JOptionPane.showMessageDialog(null,sb.toString(),"listado de usuarios", JOptionPane.INFORMATION_MESSAGE);
 }
}
    
  
   
