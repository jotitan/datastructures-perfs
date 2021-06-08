package fr.titan.datastructures;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommuneLoader {

    public Communes load(String path)throws Exception{
        LineNumberReader reader = new LineNumberReader(new FileReader(path));
        reader.readLine();
        Communes communes = new Communes();
        do{
            String line = reader.readLine();
            if(line == null){
                break;
            }
            communes.add(parseLine(line));
        }while(true);
        return communes;
    }

    private Commune parseLine(String line){
        String[] columns = line.split(",");
        return new Commune(columns[3],columns[0],columns[1],columns[2]);
    }
}
