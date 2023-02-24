/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.server;

import com.mycompany.server.parser.ParserServer;
import java.util.Scanner;



/**
 *
 * @author jhony
 */
public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String Text;
        Text = n.nextLine();
        ParserServer P = new ParserServer();
        P.Parsear(Text);
        String Numero = "12.5";
        Double N = Math.floor(Double.valueOf(Numero));
        
    }
}
