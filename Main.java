import java.util.Random;

public class Main {

    static Random rand = new Random();

    static String[] genders = {"male", "female", "non-binary"};
    static String[] races = {"aarakocra", "aasimar", "bugbear", "centaur", "changeling", "dragonborn", "dwarf", "elf", "firbolg", "genasi", "gith", "gnome", "goblin", "goliath", "half-elf", "half-orc", "halfling", "hobgoblin", "human", "kalashtar", "kenku", "kobold", "leonin", "lizardfolk", "loxodon", "minotaur", "orc", "satyr", "shifter", "simic hybrid", "tabaxi", "tiefling", "triton", "verkalken", "verdan", "warforged", "Yuan-ti"};
    static String[] gameClasses = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "warlock", "wizard", "artificer"};
    static String[] backgrounds = {"acolyte", "anthropologist", "archaeologist", "athlete", "celebrity adventurer's scion", "charlatan", "city watch", "clan crafter", "cloistered scholar", "courtier", "criminal", "entertainer", "faceless", "faction agent", "failed merchant", "far traveler", "fisher", "folk hero", "gambler", "guild artisan", "haunted one", "hermit", "inheritor", "knight of the order", "marine", "mercenary veteran", "noble", "outlander", "plaintiff", "rival intern", "sage", "sailor", "shipwright", "smuggler", "soldier", "urban bounty hunter", "urchin"};

    static String gender = genders[rand.nextInt(genders.length)];
    static String race = races[rand.nextInt(races.length)];
    static String gameClass= gameClasses[rand.nextInt(gameClasses.length)];
    static String background = backgrounds[rand.nextInt(backgrounds.length)];
    public static void main(String[] args) {
        System.out.println("A " + gender + " " + race + " " + gameClass + " with the " + background + " background");
    }

}
