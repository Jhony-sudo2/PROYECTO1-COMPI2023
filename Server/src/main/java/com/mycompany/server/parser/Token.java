/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.server.parser;

/**
 *
 * @author jhony
 */
public class Token {
    String Value;
    int Line;
    int Colum;
    int Type;
    Token(String Value,int Line, int Column,int Type){
        this.Value = Value;
        this.Type = Type;
        this.Colum = Column;
        this.Line = Line;
    }
   
    Token(int Line,int Column,int Type){
        this.Type = Type;
        this.Colum = Column;
        this.Line = Line;
    }
    
    public String getValue(){
        return Value;
    }
    
    public int getLine(){
        return Line;
    }
    
    public int getColumn(){
        return Colum;
    }
    
    public int getType(){
        return Type;
    }
    
}
