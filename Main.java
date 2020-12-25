import java.util.Random;

public class Main {

    static Random rand = new Random();

    static String[] genders = {"male", "female", "non-binary"};
    static String[] races = {"aarakocra", "aasimar", "bugbear", "centaur", "changeling", "dragonborn", "dwarf", "elf", "firbolg", "genasi", "gith", "gnome", "goblin", "goliath", "half-elf", "half-orc", "halfling", "hobgoblin", "human", "kalashtar", "kenku", "kobold", "leonin", "lizardfolk", "loxodon", "minotaur", "orc", "satyr", "shifter", "simic hybrid", "tabaxi", "tiefling", "triton", "verkalken", "verdan", "warforged", "Yuan-ti"};
    static String[] gameClasses = {"barbarian", "bard", "cleric", "druid", "fighter", "monk", "paladin", "ranger", "rogue", "sorcerer", "warlock", "wizard", "artificer"};
    static String[] backgrounds = {"acolyte", "anthropologist", "archaeologist", "athlete", "celebrity adventurer's scion", "charlatan", "city watch", "clan crafter", "cloistered scholar", "courtier", "criminal", "entertainer", "faceless", "faction agent", "failed merchant", "far traveler", "fisher", "folk hero", "gambler", "guild artisan", "haunted one", "hermit", "inheritor", "knight of the order", "marine", "mercenary veteran", "noble", "outlander", "plaintiff", "rival intern", "sage", "sailor", "shipwright", "smuggler", "soldier", "urban bounty hunter", "urchin"};
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

    static String gender = genders[rand.nextInt(genders.length)];
    static String race = races[rand.nextInt(races.length)];
    static String gameClass= gameClasses[rand.nextInt(gameClasses.length)];
    static String background = backgrounds[rand.nextInt(backgrounds.length)];
    public static void main(String[] args) {

        String archetype = "archetype";

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

        System.out.println("A " + gender + " " + race + " " + gameClass + " with the " + background + " background. " + archetype);
    }

}
