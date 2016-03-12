/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curltest;

import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;



/**
 *
 * @author Anthony
 */

public class LoadFeatures {
    
    features[] featArray = new features[130];
    private int ArrayIndex = 0;
    public LoadFeatures(){
        
    }
    void LoadData(String Line){
        features feat = new features();
        StringTokenizer st = new StringTokenizer(Line);
        //System.out.println("The line is ---->   " + Line);
            feat.setUNICODE(st.nextToken());
            feat.setSOUND(st.nextToken());
            feat.setSYLLABIC(st.nextToken());
            feat.setSTRESS((st.nextToken()));
            feat.setLONG((st.nextToken()));
            feat.setCONSONANTAL((st.nextToken()));
            feat.setSONORANT((st.nextToken()));
            feat.setCONTINUANT((st.nextToken()));
            feat.setDELAYED((st.nextToken()));
            feat.setRELEASE((st.nextToken()));
            feat.setAPPROXIMANT((st.nextToken()));
            feat.setTAP((st.nextToken()));
            feat.setTRILL((st.nextToken()));
            feat.setNASAL((st.nextToken()));
            feat.setVOICE((st.nextToken()));
            feat.setSPREAD_GL((st.nextToken()));
            feat.setCONSTR_GL((st.nextToken()));
            feat.setLABIAL((st.nextToken()));
            feat.setROUND(st.nextToken());
            feat.setLABIODENTAL(st.nextToken());
            feat.setCORONAL((st.nextToken()));
            feat.setANTERIOR((st.nextToken()));
            feat.setDISTRIBUTED((st.nextToken()));
            feat.setSTRIDENT((st.nextToken()));
            feat.setLATERAL((st.nextToken()));
            feat.setDORSAL((st.nextToken()));
            feat.setHIGH((st.nextToken()));
            feat.setLOW((st.nextToken()));
            feat.setFRONT((st.nextToken()));
            feat.setBACK((st.nextToken()));
            feat.setTENSE((st.nextToken()));
            
            System.out.print(ArrayIndex + " ");
            System.out.print(feat.getUNICODE() + " ");
            System.out.print(feat.getSOUND() + " ");
            System.out.print(feat.getSYLLABIC() + " ");
            System.out.print(feat.getSTRESS() + " ");
            System.out.print(feat.getLONG() + " ");
            System.out.print(feat.getCONSONANTAL()+ " ");
            System.out.print(feat.getSONORANT()+ " ");
            System.out.print(feat.getCONTINUANT()+ " ");
            System.out.print(feat.getDELAYED()+ " ");
            System.out.print(feat.getRELEASE()+ " ");
            System.out.print(feat.getAPPROXIMANT()+ " ");
            System.out.print(feat.getTAP() + " ");
            System.out.print(feat.getTRILL() + " ");
            System.out.print(feat.getNASAL()+ " ");
            System.out.print(feat.getVOICE() + " ");
            System.out.print(feat.getSPREAD_GL()+ " ");
            System.out.print(feat.getCONSTR_GL()+ " ");
            System.out.print(feat.getLABIAL()+ " ");
            System.out.print(feat.getROUND()+ " ");
            System.out.print(feat.getLABIODENTAL()+ " ");
            System.out.print(feat.getCORONAL()+ " ");
            System.out.print(feat.getANTERIOR()+ " ");
            System.out.print(feat.getDISTRIBUTED()+ " ");
            System.out.print(feat.getSTRIDENT()+ " ");
            System.out.print(feat.getLATERAL()+ " ");
            System.out.print(feat.getDORSAL()+ " ");
            System.out.print(feat.getHIGH()+ " ");
            System.out.print(feat.getLOW()+ " ");
            System.out.print(feat.getFRONT()+ " ");
            System.out.print(feat.getBACK()+ " ");
            System.out.print(feat.getTENSE()+ " ");
            System.out.println();
        featArray[ArrayIndex] = feat;
        ArrayIndex++;
        
    }
    
     void ValueSEARCH(String input){
        System.out.println("Searching for " + input + " in database...");
        for(features itemToCompare: featArray){
      
            if(itemToCompare.getUNICODE().equals(input)){
                System.out.println("Unicode Sound syllabic stress long consonantal sonorant continuant delayed release approximant tap trill nasal voice spread_gl constr_gl labial round labiodental coronal anterior distributed strident lateral dorsal high low front back tense");
                System.out.println(
            itemToCompare.getUNICODE() + " " +
            itemToCompare.getSOUND() + " " +
            itemToCompare.getSYLLABIC() + " " +
            itemToCompare.getSTRESS() + " " +
            itemToCompare.getLONG() + " " +
            itemToCompare.getCONSONANTAL()+ " " +
            itemToCompare.getSONORANT()+ " " +
            itemToCompare.getCONTINUANT()+ " " +
            itemToCompare.getDELAYED()+ " " +
            itemToCompare.getRELEASE()+ " " +
            itemToCompare.getAPPROXIMANT()+ " " +
            itemToCompare.getTAP() + " " +
            itemToCompare.getTRILL() + " " +
            itemToCompare.getNASAL()+ " " +
            itemToCompare.getVOICE() + " " +
            itemToCompare.getSPREAD_GL()+ " " +
            itemToCompare.getCONSTR_GL()+ " " +
            itemToCompare.getLABIAL()+ " " +
            itemToCompare.getROUND()+ " " +
            itemToCompare.getLABIODENTAL()+ " " +
            itemToCompare.getCORONAL()+ " " +
            itemToCompare.getANTERIOR()+ " " +
            itemToCompare.getDISTRIBUTED()+ " " +
            itemToCompare.getSTRIDENT()+ " " +
            itemToCompare.getLATERAL()+ " " +
            itemToCompare.getDORSAL()+ " " +
            itemToCompare.getHIGH()+ " " +
            itemToCompare.getLOW()+ " " +
            itemToCompare.getFRONT()+ " " +
            itemToCompare.getBACK()+ " " +
            itemToCompare.getTENSE()    );
                
            }
        }
        
    }
    
}
