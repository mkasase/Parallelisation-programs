/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudoping;

/**
 *
 * @author up744652
 */
import java.io.*;
import java.net.*;

public class PseudoPing {
  public static void main(String args[]) {
    try {
      Socket t = new Socket(args[0], 7);
      DataInputStream dis = new DataInputStream(t.getInputStream());
      PrintStream ps = new PrintStream(t.getOutputStream());
      ps.println("Hello");
      String str = dis.readLine();
      if (str.equals("Hello"))
        System.out.println("Alive!") ;
      else
        System.out.println("Dead or echo port not responding");              
      t.close();
    }
    catch (IOException e) {
      e.printStackTrace();}
    }
  }

