import java.util.Random;
import java.lang.System;

public class Main {

    static Random rand = new Random();

    //arrays that apply to all characters
    static String[] genders = {"male", "female", "non-binary"};
    static String[] races = {"aarakocra", "aasimar", "bugbear", "centaur", "changeling", "dragonborn", "dwarf", "elf", "firbolg", "genasi", "gnome", "goblin", "goliath", "half-elf", "half-orc", "halfling", "hobgoblin", "human", "kalashtar", "kenku", "kobold", "leonin", "lizardfolk", "loxodon", "minotaur", "orc", "satyr", "shifter", "simic hybrid", "tabaxi", "tiefling", "triton", "verkalken", "verdan", "warforged", "Yuan-ti"};
    static String[] gameClasses = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "warlock", "wizard", "artificer"};
    static String[] backgrounds = {"acolyte", "anthropologist", "archaeologist", "athlete", "celebrity adventurer's scion", "charlatan", "city watch", "clan crafter", "cloistered scholar", "courtier", "criminal", "entertainer", "faceless", "faction agent", "failed merchant", "far traveler", "fisher", "folk hero", "gambler", "guild artisan", "haunted one", "hermit", "inheritor", "knight of the order", "marine", "mercenary veteran", "noble", "outlander", "plaintiff", "rival intern", "sage", "sailor", "shipwright", "smuggler", "soldier", "urban bounty hunter", "urchin"};

    //class-specific arrays
    static String[] barbarianPaths = {"Path of the Ancestral Guardian", "Path of the Battlerager", "Path of the Beast", "Path of the Berserker", "Path of the Storm Herald", "Path of the Totem Warrior", "Path of the Wild Soul", "Path of the Zealot", "Path of Wild Magic"};
    static String[] artificerSpecialties = {"n alchemist", "n armorer", "n artillerist", " battle smith"};
    static String[] bardColleges = {"College of Creation", "College of Eloquence", "College of Lore", "College of Satire", "College of Spirits", "College of Swords", "College of Valor", "College of Whispers"};
    static String[] clericDomains = {"Ambition Domain", "Arcana Domain", "City Domain", "Death Domain", "Forge Domain", "Grave Domain", "Knowledge Domain", "Life Domain", "Light Domain", "Nature Domain", "Order Domain", "Peace Domain", "Protection Domain", "Solidarity Domain", "Strength Domain", "Tempest Domain", "Trickery Domain", "Twilight Domain", "Unity Domain", "War Domain", "Zeal Domain"};
    static String[] druidCircles = {"Circle of Dreams", "Circle of Spores", "Circle of Stars", "Circle of the Land", "Circle of the Moon", "Circle of the Shepherd", "Circle of Twilight", "Circle of Wildfire"};
    static String[] fighterArchetypes = {"Arcane Archer", "Battle Master", "Brute", "Cavalier", "Champion", "Echo Knight", "Eldritch Knight", "Knight", "Monster Hunter", "Psi Warrior", "Purple Dragon Knight", "Rune Knight", "Samurai", "Scout", "Sharpshooter"};
    static String[] monkTraditions = {"Way of Mercy", "Way of Shadow", "Way of the Ascendant Dragon", "Way of the Astral Self", "Way of the Drunken Master", "Way of the Four Elements", "Way of the Kensei", "Way of the Long Death", "Way of the Open Hand", "Way of the Sun Soul", "Way of Tranquility"};
    static String[] paladinOaths = {"Oath of Conquest", "Oath of Devotion", "Oath of Glory", "Oath of Heroism", "Oath of Redemption", "Oath of the Ancients", "Oath of the Crown", "Oath of the Watchers", "Oath of Treachery"};
    static String[] rangerArchetypes = {"Beast Master", "Deep Stalker", "Drakewarden", "Fey Wanderer", "Gloom Stalker", "Horizon Walker", "Hunter", "Monster Slayer", "Primeval Guardian", "Swarmkeeper"};
    static String[] rogueArchetypes = {"Arcane Trickster", "Assassin", "Inquisitive", "Mastermind", "Phantom", "Scout", "Soulknife", "Swashbuckler", "The Revived", "Thief"};
    static String[] sorcererOrigins = {"aberrant mind", "clockwork soul", "divine soul", "draconic bloodline", "favored soul", "giant soul", "phoenix soul", "psionic soul", "pyromancy", "sea sorcery", "shadow magic", "storm sorcery", "wild magic"};
    static String[] warlockPatrons = {"a Ghost in the Machine", "an Archfey", "Celestial", "Fathomless", "a Fiend", "a Genie", "a Great Old One", "a Hexblade", "a Lurker in the Deep", "the Raven Queen", "a Seeker", "Undead", "Undying"};
    static String[] wizardTraditions = {"Artificer", "Bladesinging", "Chronurgy", "Graviturgy", "Lore Mastery", "Onomancy", "the Order of Scribes", "Psionics", "Abjuration", "Conjuration", "Divination", "Enchantment", "Evocation", "Illusion", "Invention", "Necromancy", "Transmutation", "Technomancy", "Theurgy", "War Magic"};
    
    //race-specific arrays
    static String[] aaracokraNames = {"Aera", "Aial", "Aur", "Deekek", "Errk", "Heehk", "Ikki", "Kleeck", "Oorr", "Ouss", "Quaf", "Quierk", "Salleek", "Urreek", "Zeed"};
    static String[] maleCentaurNames = {"Bonmod", "Boruvo", "Chodi", "Drozan", "Kozim", "Milosh", "Ninos", "Oleksi", "Orval", "Radovas", "Radom", "Rostis", "Svetyos", "Tomis", "Trijiro", "Volim", "Vlodim", "Yarog"};
    static String[] femaleCentaurNames = {"Daiva", "Dunja", "Elnaya", "Galisnya", "Irinya", "Kotyali", "Lalya", "Litisia", "Madya", "Mira", "Nedja", "Nikya", "Ostani", "Pinya", "Rada", "Raisya", "Stasolya", "Tatna", "Zhendoya", "Zoria"};
    static String[] allCentaurNames = new String[maleCentaurNames.length + femaleCentaurNames.length];
    static String[] changelingNames = {"Aunn", "Bin", "Cas", "Dox", "Fie", "Hars", "Jin", "Lam", "Mas", "Nix", "Ot", "Paik", "Ruz", "Sim", "Toox", "Vil", "Yug"};
    static String[] maleDragonbornNames = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Hesken", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"};
    static String[] femaleDragonbornNames = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"};
    static String[] allDragonbornNames = new String[maleDragonbornNames.length + femaleDragonbornNames.length];
    static String[] maleDwarfNames = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"};
    static String[] femaleDwarfNames = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};
    static String[] allDwarfNames = new String[maleDwarfNames.length + femaleDwarfNames.length];
    static String[] maleElfNames = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"};
    static String[] femaleElfNames = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
    static String[] allElfNames = new String[maleElfNames.length + femaleElfNames.length];

    public static void main(String[] args) {

        
        String gender = genders[rand.nextInt(genders.length)];
        String race = races[rand.nextInt(races.length)];
        String gameClass= gameClasses[rand.nextInt(gameClasses.length)];
        String background = backgrounds[rand.nextInt(backgrounds.length)];
        String archetype = "archetype";
        String name = "name";

        switch (race) {
            case "aarakocra":
                name = aaracokraNames[rand.nextInt(aaracokraNames.length)];
                break;
            case "aasimar":
                break;
            case "bugbear":
                break;
            case "centaur":
                if (gender == "male") {
                    name = maleCentaurNames[rand.nextInt(maleCentaurNames.length)];
                }
                else if (gender == "female") {
                    name = femaleCentaurNames[rand.nextInt(femaleCentaurNames.length)];
                }
                else {
                    //fill allCentaurNames with both male and female centaur names
                    System.arraycopy(maleCentaurNames, 0, allCentaurNames, 0, maleCentaurNames.length);
                    System.arraycopy(femaleCentaurNames, 0, allCentaurNames, maleCentaurNames.length, femaleCentaurNames.length);
                    name = allCentaurNames[rand.nextInt(allCentaurNames.length)];
                }
                break;
            case "changeling":
                name = changelingNames[rand.nextInt(changelingNames.length)];
                break;
            case "dragonborn":
                if (gender == "male") {
                    name = maleDragonbornNames[rand.nextInt(maleDragonbornNames.length)];
                }
                else if (gender == "female") {
                    name = femaleDragonbornNames[rand.nextInt(femaleDragonbornNames.length)];
                }
                else {
                    //fill allDragonbornNames with both male and female dragonborn names
                    System.arraycopy(maleDragonbornNames, 0, allDragonbornNames, 0, maleDragonbornNames.length);
                    System.arraycopy(femaleDragonbornNames, 0, allDragonbornNames, maleDragonbornNames.length, femaleDragonbornNames.length);
                    name = allDragonbornNames[rand.nextInt(allDragonbornNames.length)];
                }
                break;
            case "dwarf":
                if (gender == "male") {
                    name = maleDwarfNames[rand.nextInt(maleDwarfNames.length)];
                }
                else if (gender == "female") {
                    name = femaleDwarfNames[rand.nextInt(femaleDwarfNames.length)];
                }
                else {
                    //fill allDwarfNames with both male and female dwarf names, then pick one
                    System.arraycopy(maleDwarfNames, 0, allDwarfNames, 0, maleDwarfNames.length);
                    System.arraycopy(femaleDwarfNames, 0, allDwarfNames, maleDwarfNames.length, femaleDwarfNames.length);
                    name = allDwarfNames[rand.nextInt(allDwarfNames.length)];
                }
                break;
            case "elf":
                if (gender == "male") {
                    name = maleElfNames[rand.nextInt(maleElfNames.length)];
                }
                else if (gender == "female") {
                    name = femaleElfNames[rand.nextInt(femaleElfNames.length)];
                }
                else {
                    //fill allElfNames with both male and female elf names, then pick one
                    System.arraycopy(maleElfNames, 0, allElfNames, 0, maleElfNames.length);
                    System.arraycopy(femaleElfNames, 0, allElfNames, maleElfNames.length, femaleElfNames.length);
                    name = allElfNames[rand.nextInt(allElfNames.length)];
                }
                break;
            case "firbolg":
                if (gender == "male") {
                    name = maleElfNames[rand.nextInt(maleElfNames.length)];
                }
                else if (gender == "female") {
                    name = femaleElfNames[rand.nextInt(femaleElfNames.length)];
                }
                else {
                    //fill allElfNames with both male and female elf names, then pick one
                    System.arraycopy(maleElfNames, 0, allElfNames, 0, maleElfNames.length);
                    System.arraycopy(femaleElfNames, 0, allElfNames, maleElfNames.length, femaleElfNames.length);
                    name = allElfNames[rand.nextInt(allElfNames.length)];
                }
                break;
            case "genasi":
                break;
            case "gnome":
                break;
            case "goblin":
                break;
            case "goliath":
                break;
            case "half-elf":
                break;
            case "half-orc":
                break;
            case "halfling":
                break;
            case "hobgoblin":
                break;
            case "human":
                break;
            case "kalashtar":
                break;
            case "kenku":
                break;
            case "kobold":
                break;
            case "leonin":
                break;
            case "lizardfolk":
                break;
            case "loxodon":
                break;
            case "minotaur":
                break;
            case "orc":
                break;
            case "satyr":
                break;
            case "shifter":
                break;
            case "simic hybrid":
                break;
            case "tabaxi":
                break;
            case "tiefling":
                break;
            case "triton":
                break;
            case "verkalken":
                break;
            case "verdan":
                break;
            case "warforged":
                break;
            case "Yuan-ti":
                break;
        }

        switch (gameClass) {
            case "barbarian":
                archetype = "This barbarian follows the " + barbarianPaths[rand.nextInt(barbarianPaths.length)] + ".";
                break;
            case "bard":
                archetype = "This bard is a member of the " + bardColleges[rand.nextInt(bardColleges.length)] + ".";
                break;
            case "cleric":
                archetype = "This cleric serves a deity of the " + clericDomains[rand.nextInt(clericDomains.length)] + ".";
                break;
            case "druid":
                archetype = "This druid is a member of the " + druidCircles[rand.nextInt(druidCircles.length)] + ".";
                break;
            case "fighter":
                archetype = "This fighter's archetype is the " + fighterArchetypes[rand.nextInt(fighterArchetypes.length)] + ".";
                break;
            case "monk":
                archetype = "This monk follows the " + monkTraditions[rand.nextInt(monkTraditions.length)] + ".";
                break;
            case "paladin":
                archetype = "This paladin has taken an " + paladinOaths[rand.nextInt(paladinOaths.length)] + ".";
                break;
            case "ranger":
                archetype = "This ranger's archetype is the " + rangerArchetypes[rand.nextInt(rangerArchetypes.length)] + ".";
                break;
            case "rogue":
                archetype = "This rogue's archetype is the " + rogueArchetypes[rand.nextInt(rogueArchetypes.length)] + ".";
                break;
            case "sorcerer":
                archetype = "This sorcerer's power comes from their " + sorcererOrigins[rand.nextInt(sorcererOrigins.length)] + ".";
                break;
            case "warlock":
                archetype = "This warlock's patron is " + warlockPatrons[rand.nextInt(warlockPatrons.length)] + ".";
                break;
            case "wizard":
                archetype = "This wizard follows the traditions of " + wizardTraditions[rand.nextInt(wizardTraditions.length)] + ".";
                break;
            case "artificer":
                archetype = "This artificer specializes as a" + artificerSpecialties[rand.nextInt(artificerSpecialties.length)] + ".";
                break;
        }

        System.out.println(name + ", a " + gender + " " + race + " " + gameClass + " with the " + background + " background. " + archetype);
    }

}
