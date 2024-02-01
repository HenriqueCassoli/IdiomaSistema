/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idiomasistema;

import java.util.Locale;
/**
 *
 * @author Pessoal
 */
public class IdiomaSistema {
   
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println ("Seu sistema está em "+loc.getDisplayLanguage()); // imprime "Português"
        System.out.println ("Seu sistema está em "+loc.getLanguage()); // imprime "pt"
    }

}
