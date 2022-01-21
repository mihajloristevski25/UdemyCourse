package com.mihajlo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.channels.Pipe;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\File1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last Modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath , BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last Modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is Directory = " + attrs.isDirectory());
            System.out.println("Is Regular File = " + attrs.isRegularFile());



            //Create Files
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "File2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples" , "Dir4");
//            Files.createDirectory(dirToCreate);
//
            //Create Directories
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7\\Dir8");
//            Files.createDirectories(dirToCreate);

//            Delete Files
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","File1Copy.txt");
//            Files.deleteIfExists(fileToDelete);

//              Move Files
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "File1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","File2.txt");
//            Files.move(fileToMove, destination, StandardCopyOption.REPLACE_EXISTING);

//              Move Files
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "File1Copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1", "File1Copy.txt");
//            Files.move(fileToMove, destination, StandardCopyOption.REPLACE_EXISTING);

//               Copy Files
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "File1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "File1Copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//              Copy Files
//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples" , "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e) {
            e.printStackTrace();
        }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//      //  Path filePath = FileSystems.getDefault().getPath("files\\File1.txt");
//        Path filePath = Paths.get(".","files","File1.txt");
//        printFile(filePath);
//        filePath = Paths.get("C:\\Users\\Mihajlo\\Desktop\\UdemyCourse\\OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath("." , "files" , ".." , "files","File1.txt");
//        System.out.println(path2.toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesntExist.txr");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("C:\\Users\\Mihajlo\\Test\\abcd\\whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
//    }
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while ((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }
}
