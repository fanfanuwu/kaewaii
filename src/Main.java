/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345341119
 */
public class Main {
    public static void main(String args[]) {
        PrivacyCase privacyCase = new PrivacyCase("Data Leak Case","Company exposed user emails publicly.","Personal Data.");
        System.out.println(privacyCase.getCaseTitle());
         AlgorithmCase algorithmCase = new AlgorithmCase("bias","there was bias","no bias");
          MisinformationCase misinformationCase = new MisinformationCase("cao","ni","ma");
           IntellectualPropertyCase intellectualPropertyCase = new IntellectualPropertyCase("ham","sup","lo");
           
    }
}
