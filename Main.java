import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }
      
    catch(Exception e){
      System.out.println("file not found");
    }

    // stores all math scores
    ArrayList<Integer> totalMathScore = new ArrayList<Integer>();

    try{
      Scanner s = new Scanner(new File("math.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalMathScore.add(score);
      }
      s.close();
    }
        
    catch(Exception e){
      System.out.println("file not found");
    }

    // stores all reading scores
    ArrayList<Integer> totalReadingScore = new ArrayList<Integer>();

    try{
      Scanner s = new Scanner(new File("reading.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
          totalReadingScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }
    
    // make sure all data entered the ArrayList
    // System.out.println(totalScore);
    System.out.println(totalScore.size()+" students took the exam");
    
    int total=0;
    for(int score:totalScore){
      total+=score;
    }
    double average=(double)total/totalScore.size();
    System.out.println("average: "+average);

    
  }

}
