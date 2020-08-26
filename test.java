import java.util.*;
import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.LinkedList;
//package Actors;
//package Movies;

public class test{
    public static void main(String args[]) {
        String firstName="";
        String lastName="";
        String year="";
        String gender="";
        String movieYear="";
        String movieName="";
        String[]storage=new String[10];
        String[]storage2=new String[10];
        LinkedList<Actors> list1=new LinkedList<Actors>();
        LinkedList<Movies> list2=new LinkedList<Movies>();
        try {
            System.out.println("hello");
            String pathname = "a2q1.txt";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            line = br.readLine();
            while (line != null) {
                //System.out.println("123");
                line = br.readLine(); // 一次读入一行数据
                //System.out.println(line);
                storage=line.split(" ");
                try{


               //     System.out.println(storage[3]);
                    firstName=storage[0];
                    lastName=storage[1];
                    year=storage[2];
                    gender=storage[3];
                    Actors actor=new Actors(firstName,lastName,year,gender);
                    list1.add(actor);
                }catch(ArrayIndexOutOfBoundsException o){
                    o.printStackTrace();
                    System.out.println("222");

                }

                if(line.length()==0){
                    break;
                }
            }
            System.out.println("space");
            while (line!=null){


                    line=br.readLine();
                    movieName=line;
                    //System.out.println(line);
                    line=br.readLine();
                    //System.out.println(line);
                    storage2=line.split(" ");
                    movieYear=storage2[0];
                    firstName=storage2[1];
                    lastName=storage2[2];
                    Movies movie=new Movies(movieName,movieYear,firstName,lastName);
                    list2.add(movie);




            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("123");
        }
    }
}