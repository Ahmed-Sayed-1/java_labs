import java.util.SortedMap;
import java.util.TreeMap;

public class data 
{
    public static void displayAll (SortedMap<Character, SortedMap<String, String>> dic)
    {
        for (Character c : dic.keySet()) 
        {
            for(String s :dic.get(c).keySet())
            {
                System.out.println(c + ": "+s );
            }
        }
    }
    public static void displaybyletter (char c,SortedMap<Character, SortedMap<String, String>> dic)
    {
        
        for(String s :dic.get(c).keySet())
        {
            System.out.println(c + ": "+s );
        }
        
    }
    public void insertDate(String word, String definition, SortedMap<Character, SortedMap<String, String>> dic) 
    {
        if (word == null || word.isEmpty()) 
        {
            System.out.println("Word cannot be null or empty.");
            return;
        }

        char firstChar = Character.toUpperCase(word.charAt(0));
        SortedMap<String, String> wordMap = dic.computeIfAbsent(firstChar, k -> new TreeMap<>());
        wordMap.put(word, definition);
    }
    public void getData(SortedMap<Character, SortedMap<String, String>> dic)
    {
        SortedMap<String, String> aWords = new TreeMap<>();
        aWords.put("Apple", "A fruit that is red, green, or yellow.");
        aWords.put("Ant", "A small insect that lives in colonies.");
        aWords.put("Axe", "A tool used for chopping wood.");
        aWords.put("Airplane", "A powered flying vehicle with wings.");
        aWords.put("Anchor", "A heavy object used to moor a vessel.");
        aWords.put("Arrow", "A projectile shot from a bow.");
        aWords.put("Artist", "A person who creates art.");
        dic.put('A', aWords);

        SortedMap<String, String> bWords = new TreeMap<>();
        bWords.put("Banana", "A long yellow fruit that is sweet and soft inside.");
        bWords.put("Ball", "A round object used in various sports.");
        bWords.put("Bird", "A warm-blooded egg-laying vertebrate with feathers and wings.");
        bWords.put("Boat", "A small vessel for traveling over water.");
        bWords.put("Book", "A set of written or printed pages bound together.");
        bWords.put("Bridge", "A structure carrying a road or path over a river or obstacle.");
        bWords.put("Bottle", "A container with a neck for storing liquids.");
        dic.put('B', bWords);

        SortedMap<String, String> cWords = new TreeMap<>();
        cWords.put("Cat", "A small domesticated carnivorous mammal.");
        cWords.put("Car", "A road vehicle, typically with four wheels, powered by an engine.");
        cWords.put("Cake", "A sweet baked dessert.");
        cWords.put("Chair", "A seat for one person, typically with a back and four legs.");
        cWords.put("Camera", "A device used to capture photographs or videos.");
        cWords.put("Computer", "An electronic device for storing and processing data.");
        cWords.put("Clock", "An instrument used to measure and display time.");
        dic.put('C', cWords);

        SortedMap<String, String> dWords = new TreeMap<>();
        dWords.put("Dog", "A domesticated carnivorous mammal that typically has a long snout.");
        dWords.put("Drum", "A percussion instrument that is hit to make sound.");
        dWords.put("Desk", "A piece of furniture for writing or working on.");
        dWords.put("Door", "A hinged or sliding barrier used to close an opening in a wall.");
        dWords.put("Duck", "A waterbird with a broad blunt bill.");
        dWords.put("Dolphin", "A highly intelligent marine mammal.");
        dWords.put("Desert", "A barren area of land where little precipitation occurs.");
        dic.put('D', dWords);

        SortedMap<String, String> eWords = new TreeMap<>();
        eWords.put("Elephant", "A large mammal with a trunk and tusks.");
        eWords.put("Eagle", "A bird of prey with a strong beak and excellent eyesight.");
        eWords.put("Engine", "A machine that converts energy into motion.");
        eWords.put("Earth", "The planet we live on.");
        eWords.put("Envelope", "A flat paper container for letters.");
        eWords.put("Energy", "The capacity to do work or produce change.");
        eWords.put("Egg", "A round or oval object laid by a female bird or reptile.");
        dic.put('E', eWords);

        SortedMap<String, String> fWords = new TreeMap<>();
        fWords.put("Fish", "An aquatic animal that has gills and fins.");
        fWords.put("Fan", "A device for creating a current of air.");
        fWords.put("Fire", "The burning of something that produces heat and light.");
        fWords.put("Flower", "The reproductive structure in flowering plants.");
        fWords.put("Frog", "An amphibian with smooth skin and long hind legs.");
        fWords.put("Forest", "A large area covered chiefly with trees and undergrowth.");
        fWords.put("Fence", "A barrier enclosing or bordering an area.");
        dic.put('F', fWords);

        SortedMap<String, String> gWords = new TreeMap<>();
        gWords.put("Giraffe", "A tall African mammal with a very long neck.");
        gWords.put("Garden", "A piece of ground used for growing plants or flowers.");
        gWords.put("Glove", "A covering for the hand with separate sections for each finger.");
        gWords.put("Guitar", "A stringed musical instrument played by plucking.");
        gWords.put("Gold", "A yellow precious metal highly valued for its use in jewelry.");
        gWords.put("Glass", "A hard, brittle material often used for windows.");
        gWords.put("Goat", "A hardy domesticated ruminant animal.");
        dic.put('G', gWords);
    }
    
}