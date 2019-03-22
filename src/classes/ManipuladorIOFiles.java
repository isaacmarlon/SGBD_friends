/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author  paulo
 * @author  isaac
 * @author  douglas
 */
public class ManipuladorIOFiles {
    public static void criarArquivo(String nomeArquivo){
        gravarArquivo(nomeArquivo, new ArrayList<Tabela>(), true);
    }
    public static void gravarArquivo(String nome, ArrayList<Tabela> tabelas, boolean trunca){
        try{
            FileOutputStream fos = new FileOutputStream(nome, trunca);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(tabelas);
            
            oos.close();
            fos.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível salvar o arquivo");
        }
    }
    
    public static ArrayList<Tabela> lerArquivoTabela(String nome){
        try{
            FileInputStream fis = new FileInputStream(nome);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Tabela> tabelas = (ArrayList<Tabela>) ois.readObject();
            
            ois.close();
            fis.close();
            
            return tabelas;
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        return null;
        
    }
    
    
}