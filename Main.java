import java.util.Random;

public class Main {

    static Random rand = new Random();

    static String[] genders = {"male", "female", "non-binary"};
    static String[] races = {"human", "elf", "half-elf", "dwarf", "dragonborn", "gnome", "halfling", "half-orc", "tiefling", "aarakocra", "genasi", "goliath", "aasimar", "bugbear", "firbolg", "goblin", "hobgoblin", "kenku", "kobold", "lizardfolk", "orc", "tabaxi", "triton", "yuan-ti"};
    static String[] gameClasses = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "warlock", "wizard", "artificer"};

    static String gender = genders[rand.nextInt(genders.length)];
    static String race = races[rand.nextInt(races.length)];
    static String gameClass= gameClasses[rand.nextInt(gameClasses.length)];
    public static void main(String[] args) {
        System.out.println("A " + gender + " " + race + " " + gameClass);
    }

}
