/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandelbrot;

/**
 *
 * @author up744652
 */
import java.awt.Color ;
  import java.awt.image.BufferedImage ;
  
  import javax.imageio.ImageIO;
  
  import java.io.File ;
  
  public class ParallelMandelbrot extends Thread {
  
      final static int N = 4096 ;
      final static int CUTOFF = 100 ; 
  
      static int [] [] set = new int [N] [N] ;
  
      public static void main(String [] args) throws Exception {
  
          // Calculate set
  
          long startTime = System.currentTimeMillis();
  
          ParallelMandelbrot thread0 = new ParallelMandelbrot(0) ;
          ParallelMandelbrot thread1 = new ParallelMandelbrot(1) ;
  
          thread0.start() ;
          thread1.start() ;

          thread0.join() ;
          thread1.join() ;
          
          long endTime = System.currentTimeMillis();
          System.out.println("Calculation completed in " +
                             (endTime - startTime) + " milliseconds");
          // Plot image
          BufferedImage img = new BufferedImage(N, N,
                                                BufferedImage.TYPE_INT_ARGB) ;
          // Draw pixels
          for (int i = 0 ; i < N ; i++) {
              for (int j = 0 ; j < N ; j++) {
                  int k = set [i] [j] ;
                  float level ;
                  if(k < CUTOFF) {
                      level = (float) k / CUTOFF ;
                  }
                  else {
                      level = 0 ;
                  }
                  Color c = new Color(0, level, 0) ;  // Green
                  img.setRGB(i, j, c.getRGB()) ;
              }
          }
          // Print file
          ImageIO.write(img, "PNG", new File("Mandelbrot.png"));
      }
      int me ;
      public ParallelMandelbrot(int me) {
          this.me = me ;
      }
      public void run() {
          int begin = 0, end = 0;
          
          for (begin = 0; end < N; begin++) {
              for(end = 0; end < N; end++) {
                  
                  begin
               
                  
              }
              
          }
              
/*           
          if (me == 0) {
              begin = 1;
              end = N/2 ;
          } else { // me == 1 
               begin = N/2;
               end = N;
          }
 */         //[... You fill in this code! ...]
      }
  
  }
