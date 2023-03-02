/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.server;
import com.mycompany.server.parser.ParserServer;
import com.mycompany.server.ventana.PRUEBAS;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;



/**
 *
 * @author jhony
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        /*
        Scanner n = new Scanner(System.in);
        String Text;
        Text = n.nextLine();
        ParserServer P = new ParserServer();
        P.Parsear(Text);
        */
        PRUEBAS A = new PRUEBAS();
        A.setVisible(true);
        
    }
}
