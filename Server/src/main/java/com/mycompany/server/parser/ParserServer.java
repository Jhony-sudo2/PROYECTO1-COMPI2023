/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.server.parser;

import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author jhony
 */
public class ParserServer {
     Lexer lexer;
     Parser parser;
    
   public void Parsear(String Text){
       Reader reader = new StringReader(Text);
       lexer = new Lexer(reader);
       parser = new Parser(lexer);
      
       try{
           parser.parse();
       }catch(Exception e){
           e.printStackTrace();
       }
       
   }
   
   
    
    
}
