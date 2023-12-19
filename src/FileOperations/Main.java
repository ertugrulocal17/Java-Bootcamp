package FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        createNewFile("student.txt");
//        getFileInfo("student.txt");
        readFile("student.txt");
        writeFile("student.txt");

    }
    public static void createNewFile(String fileName){
        File file = new File("/Users/ertugrulocal/IdeaProjects/JavaBootcamp/src/FileOperations/"+fileName);
        try{
            if (file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File is already declared");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void getFileInfo(String fileName){
        File file = new File("/Users/ertugrulocal/IdeaProjects/JavaBootcamp/src/FileOperations/"+fileName);
        if (file.exists()){
            System.out.println("Filename: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can file be written? " + file.canWrite());
            System.out.println("Can file be readable? " + file.canRead());
            System.out.println("File size (byte): " + file.length());
        }
    }

    public static void readFile(String fileName){
        File file = new File("/Users/ertugrulocal/IdeaProjects/JavaBootcamp/src/FileOperations/"+fileName);
        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeFile(String fileName){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/ertugrulocal/IdeaProjects/JavaBootcamp/src/FileOperations/"+fileName,true));
            bufferedWriter.newLine();
            bufferedWriter.write("Jane Doe\n");
            System.out.println("Written in the file");
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
