package Minterfaces.test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileloader = new FileLoader();

        databaseloader.load();
        databaseloader.remove();
        databaseloader.checkPermission();
        System.out.println("------------");
        fileloader.load();
        fileloader.remove();
        fileloader.checkPermission();
        System.out.println("---------");
        DataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
        


    }
}
