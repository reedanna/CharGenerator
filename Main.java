import java.util.Random;
import java.lang.System;
import java.util.HashMap;

public class Main {

    static Random rand = new Random();
    static HashMap<String, String[]> nameMap = new HashMap<String, String[]>();

    //arrays that apply to all characters
    static String[] genders = {"male", "female", "non-binary"};
    static String[] races = {"aarakocra", "aasimar", "bugbear", "centaur", "changeling", "dragonborn", "dwarf", "elf", "firbolg", "genasi", "gnome", "goblin", "goliath", "half-elf", "half-orc", "halfling", "hobgoblin", "human", "kalashtar", "kenku", "kobold", "leonin", "lizardfolk", "loxodon", "minotaur", "orc", "satyr", "shifter", "simic hybrid", "tabaxi", "tiefling", "triton", "vedalken", "verdan", "warforged", "Yuan-ti"};
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
    
    //randomly choose one of two strings
    public static String pickFromTwo(String x, String y) {
        String[] choiceArray = {x, y};
        return choiceArray[rand.nextInt(2)];
    }

    //randomly choose an element of an array
    public static String randomize(String[] randomArray) {
        return randomArray[rand.nextInt(randomArray.length)];
    }

    //capitalize first letter of string
    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    //choose a name
    public static String giveName(String race, String gender) {
        String nameList = race + "Names";
        //if race uses unisex names
        if (race == "aarakocra" || race == "changeling" || race == "goblin" || race == "goliath" || race == "kalashtar" || race == "kenku" || race == "lizardfolk" || race == "shifter" || race == "tabaxi" || race == "verdan" || race == "warforged") {
            return randomize(nameMap.get(nameList));
        }
        //if race uses gendered names
        else if (race == "centaur" || race == "dragonborn" || race == "dwarf" || race == "elf" || race == "gnome" || race == "halfling" || race == "human" || race == "leonin" || race == "loxodon" || race == "minotaur" || race == "orc" || race == "satyr" || race == "tiefling" || race == "triton" || race == "vedalken") {
            if (gender == "male" || gender == "female") {
                return randomize(nameMap.get(gender +  capitalize(nameList)));
            }
            else {
                //pick a name of a random gender for non-binary characters (functionally this just picks from all racial names)
                return giveName(race, pickFromTwo("male", "female"));
            }
        }
        //special races (that use other races' name tables, etc)
        else if (race == "aasimar") {
            return giveName("human", gender);
        }
        else if (race == "bugbear" || race == "hobgoblin" || race == "kobold") {
            return giveName("goblin", gender);
        }
        else if (race == "firbolg") {
            return giveName("elf", gender);
        }
        else if (race == "genasi") {
            return giveName(pickFromTwo(pickFromTwo("half-elf", "gnome"), pickFromTwo("dwarf", "halfling")), gender);
        }
        else if (race == "half-elf") {
            return giveName(pickFromTwo("human", "elf"), gender);
        }
        else if (race == "half-orc") {
            return giveName(pickFromTwo("human", "orc"), gender);
        }
        else if (race == "simic hybrid") {
            return giveName(pickFromTwo("half-elf", "vedalken"), gender);
        }
        else if (race == "Yuan-ti") {
            return giveName("human", gender);
        }
        else {
            return "name";
        }
    }

    //choose an archetype
    public static String giveArchetype(String gameClass) {
        switch (gameClass) {
            case "barbarian":
                return "This barbarian follows the " + randomize(barbarianPaths) + ".";
            case "bard":
                return "This bard is a member of the " + randomize(bardColleges) + ".";
            case "cleric":
                return "This cleric serves a deity of the " + randomize(clericDomains) + ".";
            case "druid":
                return "This druid is a member of the " + randomize(druidCircles) + ".";
            case "fighter":
                return "This fighter's archetype is the " + randomize(fighterArchetypes) + ".";
            case "monk":
                return "This monk follows the " + randomize(monkTraditions) + ".";
            case "paladin":
                return "This paladin has taken an " + randomize(paladinOaths) + ".";
            case "ranger":
                return "This ranger's archetype is the " + randomize(rangerArchetypes) + ".";
            case "rogue":
                return "This rogue's archetype is the " + randomize(rogueArchetypes) + ".";
            case "sorcerer":
                return "This sorcerer's power comes from their " + randomize(sorcererOrigins) + ".";
            case "warlock":
                return "This warlock's patron is " + randomize(warlockPatrons) + ".";
            case "wizard":
                return "This wizard follows the traditions of " + randomize(wizardTraditions) + ".";
            case "artificer":
                return "This artificer specializes as a" + randomize(artificerSpecialties) + ".";
        }
        return "archetype";
    }

    public static void main(String[] args) {

        nameMap.put("aaracokraNames", new String[] {"Aera", "Aial", "Aur", "Deekek", "Errk", "Heehk", "Ikki", "Kleeck", "Oorr", "Ouss", "Quaf", "Quierk", "Salleek", "Urreek", "Zeed"});
        nameMap.put("maleCentaurNames", new String[] {"Bonmod", "Boruvo", "Chodi", "Drozan", "Kozim", "Milosh", "Ninos", "Oleksi", "Orval", "Radovas", "Radom", "Rostis", "Svetyos", "Tomis", "Trijiro", "Volim", "Vlodim", "Yarog"});
        nameMap.put("femaleCentaurNames", new String[] {"Daiva", "Dunja", "Elnaya", "Galisnya", "Irinya", "Kotyali", "Lalya", "Litisia", "Madya", "Mira", "Nedja", "Nikya", "Ostani", "Pinya", "Rada", "Raisya", "Stasolya", "Tatna", "Zhendoya", "Zoria"});
        nameMap.put("changelingNames", new String[] {"Aunn", "Bin", "Cas", "Dox", "Fie", "Hars", "Jin", "Lam", "Mas", "Nix", "Ot", "Paik", "Ruz", "Sim", "Toox", "Vil", "Yug"});
        nameMap.put("maleDragonbornNames", new String[] {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Hesken", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"});
        nameMap.put("femaleDragonbornNames", new String[] {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"});
        nameMap.put("maleDwarfNames", new String[] {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"});
        nameMap.put("femaleDwarfNames", new String[] {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"});
        nameMap.put("maleElfNames", new String[] {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"});
        nameMap.put("femaleElfNames", new String[] {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"});
        nameMap.put("maleGnomeNames", new String[] {"Alston", "Alvyn", "Boddynock", "Brocc", "Ettrgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar", "Seebo", "Warryn", "Wrenn", "Zook"});
        nameMap.put("femaleGnomeNames", new String[] {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"});
        nameMap.put("goblinNames", new String[] {"Azzinax", "Babolax", "Blixanix", "Crixizix", "Dazzaz", "Estrix", "Finizix", "Juzba", "Kaluzax", "Lyzaxa", "Mizzix", "Myznar", "Nixispix", "Paxizaz", "Ravixiz", "Stixil", "Sunnix", "Tozinox", "Uxivozi", "Vazozav", "Wexiny", "Zizzix"});
        nameMap.put("goliathNames", new String[] {"Aukan", "Eglath", "Gae-Al", "Gauthak", "Ilikan", "Keothi", "Kuori", "Lo-Kag", "Manneo", "Maveith", "Nalla", "Orilo", "Paavu", "Pethani", "Thalai", "Thotham", "Uthal", "Vaenea", "Vimak"});
        nameMap.put("maleHalflingNames", new String[] {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby"});
        nameMap.put("femaleHalflingNames", new String[] {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"});
        nameMap.put("maleHumanNames", new String[] {"Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen", "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Stedd", "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival", "Orel", "Pavel", "Sergor", "Ander", "Blath", "Bran", "Frath", "Geth", "Lander", "Luth", "Malcer", "Stor", "Taman", "Urth", "Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas", "So-Kehur", "Thazar-De", "Urhur", "Borivik", "Faurgar", "Jandar", "Kanithat", "Madislak", "Ralmevik", "Shaumar", "Vladislak", "An", "Chen", "Chi", "Fai", "Jiang", "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen", "Anton", "Diero", "Marcon", "Pieron", "Rimardo", "Romero", "Salazar", "Umbero"});
        nameMap.put("femaleHumanNames", new String[] {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Chessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Olga", "Silifrey", "Westra", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra", "Bai", "Chao", "Lia", "Lei", "Mei", "Qiao", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda"});
        nameMap.put("kalashtarNames", new String[] {"Coratash", "Dalavash", "Dolishara", "Halakosh", "Khoratari", "Koratana", "Lanhareth", "Molavakri", "Nevitash", "Sorashana", "Torashtai", "Valakhad", "Vishara"});
        nameMap.put("kenkuNames", new String[] {"Smasher", "Clanger", "Slicer", "Basher", "Rat Scratch", "Whistler", "Mouser", "Growler", "Sail Snap", "Hammerer", "Cutter"});
        nameMap.put("maleLeoninNames", new String[] {"Apto", "Athoz", "Baragon", "Bryguz", "Eremoz", "Gorioz", "Grexes", "Oriz", "Pyxathor", "Teoz", "Xemnon", "Xior"});
        nameMap.put("femaleLeoninNames", new String[] {"Aletha", "Atagone", "Demne", "Doxia", "Ecate", "Eriz", "Gragonde", "Iadma", "Koila", "Oramne", "Seza", "Ziore"});
        nameMap.put("lizardfolkNames", new String[] {"Achuak", "Aryte", "Baeshra", "Darastrix", "Garurt", "Irhtos", "Jhank", "Kepesk", "Kethend", "Korth", "Kosj", "Kothar", "Litrix", "Mirik", "Othokent", "Sauriv", "Throden", "Thurkear", "Usk", "Valignat", "Vargach", "Verthica", "Vutha", "Vyth"});
        nameMap.put("maleLoxodonNames", new String[] {"Bayul", "Berov", "Brooj", "Chedumov", "Dobrun", "Droozh", "Golomov", "Heruj", "Ilromov", "Kel", "Nikoom", "Ondros", "Radomov", "Svetel", "Tamuj", "Throom", "Vasool"});
        nameMap.put("femaleLoxodonNames", new String[] {"Ajj", "Boja", "Dancu", "Dooja", "Elyuja", "Fanoor", "Irij", "Jasoo", "Katrun", "Lyooda", "Mayja", "Radu", "Shuja", "Soofya", "Totoor", "Verij", "Vesmova", "Yoolna", "Zarij", "Zoorja"});
        nameMap.put("maleMinotaurNames", new String[] {"Alovnek", "Brogmir", "Brozhdar", "Dornik", "Drakmir", "Drazhan", "Grozdan", "Kalazmir", "Klattic", "Melislek", "Nirikov", "Prezhlek", "Radolak", "Rugilar", "Sarovnek", "Svarakov", "Trovik", "Vraslak", "Yarvem"});
        nameMap.put("femaleMinotaurNames", new String[] {"Akra", "Bolsa", "Cica", "Dakka", "Drakisla", "Eleska", "Enka", "Irnaya", "Jaska", "Kalka", "Makla", "Noraka", "Pesha", "Raisha", "Sokali", "Takyat", "Vrokya", "Veska", "Yelka", "Zarka", "Zoka"});
        nameMap.put("maleOrcNames", new String[] {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk"});
        nameMap.put("femaleOrcNames", new String[] {"Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Vola", "Volen", "Yevelda"});
        nameMap.put("maleSatyrNames", new String[] {"Alekos", "Dimi", "Filippos", "Ilias", "Kyriakos", "Neofytos", "Omiros", "Pantelis", "Spyro", "Takis", "Zenon"});
        nameMap.put("femaleSatyrNames", new String[] {"Aliki", "Avra", "Chara", "Dafni", "Eirini", "Elpida", "Irini", "Kaiti", "Lia", "Niki", "Tasia", "Xeni", "Yanna", "Zoi"});
        nameMap.put("shifterNames", new String[] {"Badger", "Bear", "Cat", "Fang", "Grace", "Grim", "Moon", "Rain", "Red", "Scar", "Stripe", "Swift", "Talon", "Wolf"});
        nameMap.put("tabaxiNames", new String[] {"Cloud", "Timber", "Jade", "Bird", "Thunder", "Snake", "Smoke"});
        nameMap.put("maleTieflingNames", new String[] {"Akmenos", "Amnon", "Harahas", "Ekernon", "Tados", "Kairon", "Leucis", "Melech", "Morthos", "Pelaios", "Skamos", "Therai"});
        nameMap.put("femaleTieflingNames", new String[] {"Akra", "Anakis", "Bryseis", "Criella", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Pheleia", "Rieta"});
        nameMap.put("maleTritonNames", new String[] {"Corus", "Delnis", "Jhimas", "Keros", "Molos", "Nalos", "Vodos", "Zunis"});
        nameMap.put("femaleTritonNames", new String[] {"Aryn", "Belthyn", "Duthyn", "Feloren", "Otanyn", "Shalryn", "Vlaryn", "Wolyn"});
        nameMap.put("maleVedalkenNames", new String[] {"Aglar", "Bellin", "Dallid", "Firellan", "Kavin", "Koplony", "Lomar", "Mathvan", "Modar", "Nebun", "Nhillosh", "Nitt", "Otrovac", "Ovlan", "Pelener", "Rill", "Trivaz", "Uldin", "Yolov", "Zataz"});
        nameMap.put("femaleVedalkenNames", new String[] {"Azi", "Barvisa", "Brazia", "Direll", "Fainn", "Griya", "Hallia", "Katrille", "Kovel", "Lilla", "Mirela", "Morai", "Nedress", "Ossya", "Pierenn", "Roya", "Sestri", "Triel", "Uzana", "Yaraghiya", "Zlovol"});
        nameMap.put("verdanNames", new String[] {"Bronn", "Crahma", "Dolar", "Dreeda", "Duglee", "Gruvald", "Hulm", "Jeal", "Kalo", "Klesh", "Korm", "Lathi", "Ovlig", "Paracii", "Pils", "Praet", "Promul", "Reezni", "Rin", "Shylk", "Slyr", "Sollo", "Stalsii", "Stromvo", "Stussa", "Syrkart", "Takat", "Toit", "Tubyna", "Varr", "Veriga", "Wraq", "Wural", "Wurxee"});
        nameMap.put("warforgedNames", new String[] {"Anchor", "Banner", "Bastion", "Blade", "Blue", "Bow", "Cart", "Church", "Crunch", "Crystal", "Dagger", "Dent", "Five", "Glaive", "Hammer", "Iron", "Lucky", "Mace", "Oak", "Onyx", "Pants", "Pierce", "Red", "Rod", "Rusty", "Scout", "Seven", "Shield", "Slash", "Smith", "Spike", "Temple", "Vault", "Wall"});

        String gender = randomize(genders);
        String race = randomize(races);
        String gameClass= randomize(gameClasses);
        String background = randomize(backgrounds);
        String archetype = giveArchetype(gameClass);
        String name = giveName(race, gender);        

        System.out.println(name + ", a " + gender + " " + race + " " + gameClass + " with the " + background + " background. " + archetype);
    }

}
