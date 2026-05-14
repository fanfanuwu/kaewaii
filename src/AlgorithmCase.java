/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 345341119
 */
public class AlgorithmCase extends EthicsCase {
    private String biasType;
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "Algorithm");
        this.biasType = biasType;
    }
    public String getbiasType(){ return biasType; }
    @Override
    public String toString(){
        return super.toString() + "\nBias Type: " + biasType;
    }
}
