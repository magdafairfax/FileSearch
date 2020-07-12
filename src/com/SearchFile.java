package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Search for a file in a directory recursively.
 * Both methods are doing the same thing but one is implemented using lambda.
 */
public class SearchFile {
    public static void main(String[] args){
        //String foundFile = searchFileRecursively(new File("C:\\CollectNAVService"), "runNAV.bat");
        try {
            searchFileLambda(new File("C:\\CollectNAVService"), "bat");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String searchFileRecursively(File givenFile, String search ){
        String foundFilePath = "";

        if (givenFile.isDirectory()) {
            File[] files = givenFile.listFiles();
            for (File currentFile : files) {
                searchFileRecursively(currentFile, search);
            }
        } else if(givenFile.getName().equals(search)){
            foundFilePath = givenFile.getPath() + givenFile.getName();
            System.out.println(" The file is in the following location: " + givenFile.getPath());
        }
        return foundFilePath;
    }

    public static void searchFileLambda (File givenFile, String search) throws IOException
    {
        String foundFilePath = "";
        Files.walk(Paths.get(givenFile.toString()))
                .filter(Files::isRegularFile)
                .forEach((f)-> {
                    String file = f.toString();
                    if (file.endsWith(search)) {
                        System.out.println(f.toAbsolutePath().toString());
                    }
                });
    }
}
