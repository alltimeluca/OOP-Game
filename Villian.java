import java.util.*;
import java.io.*;

public class Villian extends Character {

    public Villian(String nameAssigned){
        
        super(nameAssigned);
        species = chooseVillain();

    }

    protected String chooseVillain(){
        String[] speciesList = new String[4];
        int count = 0;
        Random rand = new Random();

        try {
            File speciesFile = new File("species.txt");
            Scanner myReader = new Scanner(speciesFile);

            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              speciesList[count] = data;
              count += 1;
            }

            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        String species = speciesList[rand.nextInt(speciesList.length)];
        return species;
    }
 
}