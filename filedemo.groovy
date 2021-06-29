import java.io.File 
class Example { 
   static void main(String[] args) { 
      new File("Hello.csv").eachLine {  
         line -> println "$line"; 

    
      } 
   } 
}


 