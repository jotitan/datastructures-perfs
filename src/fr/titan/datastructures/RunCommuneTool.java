package fr.titan.datastructures;

import java.io.File;

public class RunCommuneTool {

    /**
     * Objectif : verifier rapidement si des elements existent pour continuer un traitement
     * Exemple : validation d'un courrier en s'assurant que l'adresse existe
     * On verifie dans une liste moyenne (40K frequemment)
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        String path = new File("resources/communes-departement-region.csv").getAbsolutePath();
        Communes communes = new CommuneLoader().load(path);
        long begin = System.currentTimeMillis();
        int test = 100000;
        for(int i = 0 ; i < test ; i++){
            communes.contains("Chelles");
        }
        System.out.println(String.format("TIME : %d ms",System.currentTimeMillis() - begin));
    }
}
