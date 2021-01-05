import java.util.Random;
import java.lang.System;
import java.util.HashMap;

public class Main {

    static Random rand = new Random();
    static HashMap<String, String[]> nameMap = new HashMap<String, String[]>();

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
    // static String[] aaracokraNames = {"Aera", "Aial", "Aur", "Deekek", "Errk", "Heehk", "Ikki", "Kleeck", "Oorr", "Ouss", "Quaf", "Quierk", "Salleek", "Urreek", "Zeed"};
    // static String[] maleCentaurNames = {"Bonmod", "Boruvo", "Chodi", "Drozan", "Kozim", "Milosh", "Ninos", "Oleksi", "Orval", "Radovas", "Radom", "Rostis", "Svetyos", "Tomis", "Trijiro", "Volim", "Vlodim", "Yarog"};
    // static String[] femaleCentaurNames = {"Daiva", "Dunja", "Elnaya", "Galisnya", "Irinya", "Kotyali", "Lalya", "Litisia", "Madya", "Mira", "Nedja", "Nikya", "Ostani", "Pinya", "Rada", "Raisya", "Stasolya", "Tatna", "Zhendoya", "Zoria"};
    // static String[] allCentaurNames = new String[maleCentaurNames.length + femaleCentaurNames.length];
    // static String[] changelingNames = {"Aunn", "Bin", "Cas", "Dox", "Fie", "Hars", "Jin", "Lam", "Mas", "Nix", "Ot", "Paik", "Ruz", "Sim", "Toox", "Vil", "Yug"};
    // static String[] maleDragonbornNames = {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Hesken", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"};
    // static String[] femaleDragonbornNames = {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"};
    // static String[] allDragonbornNames = new String[maleDragonbornNames.length + femaleDragonbornNames.length];
    // static String[] maleDwarfNames = {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"};
    // static String[] femaleDwarfNames = {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"};
    // static String[] allDwarfNames = new String[maleDwarfNames.length + femaleDwarfNames.length];
    // static String[] maleElfNames = {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"};
    // static String[] femaleElfNames = {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"};
    // static String[] allElfNames = new String[maleElfNames.length + femaleElfNames.length];
    // static String[] maleGnomeNames = {"Alston", "Alvyn", "Boddynock", "Brocc", "Ettrgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar", "Seebo", "Warryn", "Wrenn", "Zook"};
    // static String[] femaleGnomeNames = {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"};
    // static String[] allGnomeNames = new String[maleGnomeNames.length + femaleGnomeNames.length];
    // static String[] goblinNames = {"Azzinax", "Babolax", "Blixanix", "Crixizix", "Dazzaz", "Estrix", "Finizix", "Juzba", "Kaluzax", "Lyzaxa", "Mizzix", "Myznar", "Nixispix", "Paxizaz", "Ravixiz", "Stixil", "Sunnix", "Tozinox", "Uxivozi", "Vazozav", "Wexiny", "Zizzix"};
    // static String[] goliathNames = {"Aukan", "Eglath", "Gae-Al", "Gauthak", "Ilikan", "Keothi", "Kuori", "Lo-Kag", "Manneo", "Maveith", "Nalla", "Orilo", "Paavu", "Pethani", "Thalai", "Thotham", "Uthal", "Vaenea", "Vimak"};
    // static String[] maleHalflingNames = {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby"};
    // static String[] femaleHalflingNames = {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"};
    // static String[] allHalflingNames = new String[maleHalflingNames.length + femaleHalflingNames.length];
    // static String[] maleHumanNames = {"Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen", "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Stedd", "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival", "Orel", "Pavel", "Sergor", "Ander", "Blath", "Bran", "Frath", "Geth", "Lander", "Luth", "Malcer", "Stor", "Taman", "Urth", "Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas", "So-Kehur", "Thazar-De", "Urhur", "Borivik", "Faurgar", "Jandar", "Kanithat", "Madislak", "Ralmevik", "Shaumar", "Vladislak", "An", "Chen", "Chi", "Fai", "Jiang", "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen", "Anton", "Diero", "Marcon", "Pieron", "Rimardo", "Romero", "Salazar", "Umbero"};
    // static String[] femaleHumanNames = {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Chessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Olga", "Silifrey", "Westra", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra", "Bai", "Chao", "Lia", "Lei", "Mei", "Qiao", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda"};
    // static String[] allHumanNames = new String[maleHumanNames.length + femaleHumanNames.length];
    // static String[] kalashtarNames = {"Coratash", "Dalavash", "Dolishara", "Halakosh", "Khoratari", "Koratana", "Lanhareth", "Molavakri", "Nevitash", "Sorashana", "Torashtai", "Valakhad", "Vishara"};
    // static String[] kenkuNames = {"Smasher", "Clanger", "Slicer", "Basher", "Rat Scratch", "Whistler", "Mouser", "Growler", "Sail Snap", "Hammerer", "Cutter"};
    // static String[] maleLeoninNames = {"Apto", "Athoz", "Baragon", "Bryguz", "Eremoz", "Gorioz", "Grexes", "Oriz", "Pyxathor", "Teoz", "Xemnon", "Xior"};
    // static String[] femaleLeoninNames = {"Aletha", "Atagone", "Demne", "Doxia", "Ecate", "Eriz", "Gragonde", "Iadma", "Koila", "Oramne", "Seza", "Ziore"};
    // static String[] allLeoninNames = new String[maleLeoninNames.length + femaleLeoninNames.length];
    // static String[] lizardfolkNames = {"Achuak", "Aryte", "Baeshra", "Darastrix", "Garurt", "Irhtos", "Jhank", "Kepesk", "Kethend", "Korth", "Kosj", "Kothar", "Litrix", "Mirik", "Othokent", "Sauriv", "Throden", "Thurkear", "Usk", "Valignat", "Vargach", "Verthica", "Vutha", "Vyth"};
    // static String[] maleLoxodonNames = {"Bayul", "Berov", "Brooj", "Chedumov", "Dobrun", "Droozh", "Golomov", "Heruj", "Ilromov", "Kel", "Nikoom", "Ondros", "Radomov", "Svetel", "Tamuj", "Throom", "Vasool"};
    // static String[] femaleLoxodonNames = {"Ajj", "Boja", "Dancu", "Dooja", "Elyuja", "Fanoor", "Irij", "Jasoo", "Katrun", "Lyooda", "Mayja", "Radu", "Shuja", "Soofya", "Totoor", "Verij", "Vesmova", "Yoolna", "Zarij", "Zoorja"};
    // static String[] allLoxodonNames = new String[maleLoxodonNames.length + femaleLoxodonNames.length];
    // static String[] maleMinotaurNames = {"Alovnek", "Brogmir", "Brozhdar", "Dornik", "Drakmir", "Drazhan", "Grozdan", "Kalazmir", "Klattic", "Melislek", "Nirikov", "Prezhlek", "Radolak", "Rugilar", "Sarovnek", "Svarakov", "Trovik", "Vraslak", "Yarvem"};
    // static String[] femaleMinotaurNames = {"Akra", "Bolsa", "Cica", "Dakka", "Drakisla", "Eleska", "Enka", "Irnaya", "Jaska", "Kalka", "Makla", "Noraka", "Pesha", "Raisha", "Sokali", "Takyat", "Vrokya", "Veska", "Yelka", "Zarka", "Zoka"};
    // static String[] allMinotaurNames = new String[maleMinotaurNames.length + femaleMinotaurNames.length];
    // static String[] maleOrcNames = {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk"};
    // static String[] femaleOrcNames = {"Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Vola", "Volen", "Yevelda"};
    // static String[] allOrcNames = new String[maleOrcNames.length + femaleOrcNames.length];
    // static String[] maleSatyrNames = {"Alekos", "Dimi", "Filippos", "Ilias", "Kyriakos", "Neofytos", "Omiros", "Pantelis", "Spyro", "Takis", "Zenon"};
    // static String[] femaleSatyrNames = {"Aliki", "Avra", "Chara", "Dafni", "Eirini", "Elpida", "Irini", "Kaiti", "Lia", "Niki", "Tasia", "Xeni", "Yanna", "Zoi"};
    // static String[] allSatyrNames = new String[maleSatyrNames.length + femaleSatyrNames.length];
    // static String[] shifterNames = {"Badger", "Bear", "Cat", "Fang", "Grace", "Grim", "Moon", "Rain", "Red", "Scar", "Stripe", "Swift", "Talon", "Wolf"};
    // static String[] tabaxiNames = {"Cloud", "Timber", "Jade", "Bird", "Thunder", "Snake", "Smoke"};
    // static String[] maleTieflingNames = {"Akmenos", "Amnon", "Harahas", "Ekernon", "Tados", "Kairon", "Leucis", "Melech", "Morthos", "Pelaios", "Skamos", "Therai"};
    // static String[] femaleTieflingNames = {"Akra", "Anakis", "Bryseis", "Criella", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Pheleia", "Rieta"};
    // static String[] allTieflingNames = new String[maleTieflingNames.length + femaleTieflingNames.length];
    // static String[] maleTritonNames = {"Corus", "Delnis", "Jhimas", "Keros", "Molos", "Nalos", "Vodos", "Zunis"};
    // static String[] femaleTritonNames = {"Aryn", "Belthyn", "Duthyn", "Feloren", "Otanyn", "Shalryn", "Vlaryn", "Wolyn"};
    // static String[] allTritonNames = new String[maleTritonNames.length + femaleTritonNames.length];
    // static String[] maleVedalkenNames = {"Aglar", "Bellin", "Dallid", "Firellan", "Kavin", "Koplony", "Lomar", "Mathvan", "Modar", "Nebun", "Nhillosh", "Nitt", "Otrovac", "Ovlan", "Pelener", "Rill", "Trivaz", "Uldin", "Yolov", "Zataz"};
    // static String[] femaleVedalkenNames = {"Azi", "Barvisa", "Brazia", "Direll", "Fainn", "Griya", "Hallia", "Katrille", "Kovel", "Lilla", "Mirela", "Morai", "Nedress", "Ossya", "Pierenn", "Roya", "Sestri", "Triel", "Uzana", "Yaraghiya", "Zlovol"};
    // static String[] allVedalkenNames = new String[maleVedalkenNames.length + femaleVedalkenNames.length];
    // static String[] verdanNames = {"Bronn", "Crahma", "Dolar", "Dreeda", "Duglee", "Gruvald", "Hulm", "Jeal", "Kalo", "Klesh", "Korm", "Lathi", "Ovlig", "Paracii", "Pils", "Praet", "Promul", "Reezni", "Rin", "Shylk", "Slyr", "Sollo", "Stalsii", "Stromvo", "Stussa", "Syrkart", "Takat", "Toit", "Tubyna", "Varr", "Veriga", "Wraq", "Wural", "Wurxee"};
    // static String[] warforgedNames = {"Anchor", "Banner", "Bastion", "Blade", "Blue", "Bow", "Cart", "Church", "Crunch", "Crystal", "Dagger", "Dent", "Five", "Glaive", "Hammer", "Iron", "Lucky", "Mace", "Oak", "Onyx", "Pants", "Pierce", "Red", "Rod", "Rusty", "Scout", "Seven", "Shield", "Slash", "Smith", "Spike", "Temple", "Vault", "Wall"};


    public static String giveUnisexName(String race) {
        String nameList = race + "Names";
        return nameMap.get(nameList)[rand.nextInt(nameMap.get(nameList).length)];
    }

    public static void main(String[] args) {

        nameMap.put("aaracokraNames", new String[] {"Aera", "Aial", "Aur", "Deekek", "Errk", "Heehk", "Ikki", "Kleeck", "Oorr", "Ouss", "Quaf", "Quierk", "Salleek", "Urreek", "Zeed"});
        nameMap.put("maleCentaurNames", new String[] {"Bonmod", "Boruvo", "Chodi", "Drozan", "Kozim", "Milosh", "Ninos", "Oleksi", "Orval", "Radovas", "Radom", "Rostis", "Svetyos", "Tomis", "Trijiro", "Volim", "Vlodim", "Yarog"});
        nameMap.put("femaleCentaurNames", new String[] {"Daiva", "Dunja", "Elnaya", "Galisnya", "Irinya", "Kotyali", "Lalya", "Litisia", "Madya", "Mira", "Nedja", "Nikya", "Ostani", "Pinya", "Rada", "Raisya", "Stasolya", "Tatna", "Zhendoya", "Zoria"});
        nameMap.put("allCentaurNames", new String[nameMap.get("maleCentaurNames").length + nameMap.get("femaleCentaurNames").length]);
        nameMap.put("changelingNames", new String[] {"Aunn", "Bin", "Cas", "Dox", "Fie", "Hars", "Jin", "Lam", "Mas", "Nix", "Ot", "Paik", "Ruz", "Sim", "Toox", "Vil", "Yug"});
        nameMap.put("maleDragonbornNames", new String[] {"Arjhan", "Balasar", "Bharash", "Donaar", "Ghesh", "Hesken", "Kriv", "Medrash", "Mehen", "Nadarr", "Pandjed", "Patrin", "Rhogar", "Shamash", "Shedinn", "Tarhun", "Torinn"});
        nameMap.put("femaleDragonbornNames", new String[] {"Akra", "Biri", "Daar", "Farideh", "Harann", "Havilar", "Jheri", "Kava", "Korinn", "Mishann", "Nala", "Perra", "Raiann", "Sora", "Surina", "Thava", "Uadjit"});
        nameMap.put("allDragonbornNames", new String[nameMap.get("maleDragonbornNames").length + nameMap.get("femaleDragonbornNames").length]);
        nameMap.put("maleDwarfNames", new String[] {"Adrik", "Alberich", "Baern", "Barendd", "Brottor", "Bruenor", "Dain", "Darrak", "Delg", "Eberk", "Einkil", "Fargrim", "Flint", "Gardain", "Harbek", "Kildrak", "Morgran", "Orsik", "Oskar", "Rangrim", "Rurik", "Taklinn", "Thoradin", "Thorin", "Tordek", "Traubon", "Travok", "Ulfgar", "Veit", "Vondal"});
        nameMap.put("femaleDwarfNames", new String[] {"Amber", "Artin", "Audhild", "Bardryn", "Dagnal", "Diesa", "Eldeth", "Falkrunn", "Finellen", "Gunnloda", "Gurdis", "Helja", "Hlin", "Kathra", "Kristryd", "Ilde", "Liftrasa", "Mardred", "Riswynn", "Sannl", "Torbera", "Torgga", "Vistra"});
        nameMap.put("allDwarfNames", new String[nameMap.get("maleDwarfNames").length + nameMap.get("femaleDwarfNames").length]);
        nameMap.put("maleElfNames", new String[] {"Adran", "Aelar", "Aramil", "Arannis", "Aust", "Beiro", "Berrian", "Carric", "Enialis", "Erdan", "Erevan", "Galinndan", "Hadarai", "Heian", "Himo", "Immeral", "Ivellios", "Laucian", "Mindartis", "Paelias", "Peren", "Quarion", "Riardon", "Rolen", "Soveliss", "Thamior", "Tharivol", "Theren", "Varis"});
        nameMap.put("femaleElfNames", new String[] {"Adrie", "Althaea", "Anastrianna", "Andraste", "Antinua", "Bethrynna", "Birel", "Caelynn", "Drusilia", "Enna", "Felosial", "Ielenia", "Jelenneth", "Keyleth", "Leshanna", "Lia", "Meriele", "Mialee", "Naivara", "Quelenna", "Quillathe", "Sariel", "Shanairra", "Shava", "Silaqui", "Theirastra", "Thia", "Vadania", "Valanthe", "Xanaphia"});
        nameMap.put("allElfNames",  new String[nameMap.get("maleElfNames").length + nameMap.get("femaleElfNames").length]);
        nameMap.put("maleGnomeNames", new String[] {"Alston", "Alvyn", "Boddynock", "Brocc", "Ettrgell", "Dimble", "Eldon", "Erky", "Fonkin", "Frug", "Gerbo", "Gimble", "Glim", "Jebeddo", "Kellen", "Namfoodle", "Orryn", "Roondar", "Seebo", "Warryn", "Wrenn", "Zook"});
        nameMap.put("femaleGnomeNames", new String[] {"Bimpnottin", "Breena", "Caramip", "Carlin", "Donella", "Duvamil", "Ella", "Ellyjobell", "Ellywick", "Lilli", "Loopmottin", "Lorilla", "Mardnab", "Nissa", "Nyx", "Oda", "Orla", "Roywyn", "Shamil", "Tana", "Waywocket", "Zanna"});
        nameMap.put("allGnomeNames", new String[nameMap.get("maleGnomeNames").length + nameMap.get("femaleGnomeNames").length]);
        nameMap.put("goblinNames", new String[] {"Azzinax", "Babolax", "Blixanix", "Crixizix", "Dazzaz", "Estrix", "Finizix", "Juzba", "Kaluzax", "Lyzaxa", "Mizzix", "Myznar", "Nixispix", "Paxizaz", "Ravixiz", "Stixil", "Sunnix", "Tozinox", "Uxivozi", "Vazozav", "Wexiny", "Zizzix"});
        nameMap.put("goliathNames", new String[] {"Aukan", "Eglath", "Gae-Al", "Gauthak", "Ilikan", "Keothi", "Kuori", "Lo-Kag", "Manneo", "Maveith", "Nalla", "Orilo", "Paavu", "Pethani", "Thalai", "Thotham", "Uthal", "Vaenea", "Vimak"});
        nameMap.put("maleHalflingNames", new String[] {"Alton", "Ander", "Cade", "Corrin", "Eldon", "Errich", "Finnan", "Garret", "Lindal", "Lyle", "Merric", "Milo", "Osborn", "Perrin", "Reed", "Roscoe", "Wellby"});
        nameMap.put("femaleHalflingNames", new String[] {"Andry", "Bree", "Callie", "Cora", "Euphemia", "Jillian", "Kithri", "Lavinia", "Lidda", "Merla", "Nedda", "Paela", "Portia", "Seraphina", "Shaena", "Trym", "Vani", "Verna"});
        nameMap.put("allHalflingNames", new String[nameMap.get("maleHalflingNames").length + nameMap.get("femaleHalflingNames").length]);
        nameMap.put("maleHumanNames", new String[] {"Aseir", "Bardeid", "Haseid", "Khemed", "Mehmen", "Sudeiman", "Zasheir", "Darvin", "Dorn", "Evendur", "Gorstag", "Grim", "Helm", "Malark", "Morn", "Randal", "Stedd", "Bor", "Fodel", "Glar", "Grigor", "Igan", "Ivor", "Kosef", "Mival", "Orel", "Pavel", "Sergor", "Ander", "Blath", "Bran", "Frath", "Geth", "Lander", "Luth", "Malcer", "Stor", "Taman", "Urth", "Aoth", "Bareris", "Ehput-Ki", "Kethoth", "Mumed", "Ramas", "So-Kehur", "Thazar-De", "Urhur", "Borivik", "Faurgar", "Jandar", "Kanithat", "Madislak", "Ralmevik", "Shaumar", "Vladislak", "An", "Chen", "Chi", "Fai", "Jiang", "Jun", "Lian", "Long", "Meng", "On", "Shan", "Shui", "Wen", "Anton", "Diero", "Marcon", "Pieron", "Rimardo", "Romero", "Salazar", "Umbero"});
        nameMap.put("femaleHumanNames", new String[] {"Atala", "Ceidil", "Hama", "Jasmal", "Meilil", "Seipora", "Yasheira", "Zasheida", "Arveene", "Esvele", "Chessail", "Kerri", "Lureene", "Miri", "Rowan", "Shandri", "Tessele", "Alethra", "Kara", "Katernin", "Mara", "Natali", "Olma", "Tana", "Zora", "Amafrey", "Betha", "Cefrey", "Kethra", "Olga", "Silifrey", "Westra", "Arizima", "Chathi", "Nephis", "Nulara", "Murithi", "Sefris", "Thola", "Umara", "Zolis", "Fyevarra", "Hulmarra", "Immith", "Imzel", "Navarra", "Shevarra", "Tammith", "Yuldra", "Bai", "Chao", "Lia", "Lei", "Mei", "Qiao", "Shui", "Tai", "Balama", "Dona", "Faila", "Jalana", "Luisa", "Marta", "Quara", "Selise", "Vonda"});
        nameMap.put("allHumanNames", new String[nameMap.get("maleHumanNames").length + nameMap.get("femaleHumanNames").length]);
        nameMap.put("kalashtarNames", new String[] {"Coratash", "Dalavash", "Dolishara", "Halakosh", "Khoratari", "Koratana", "Lanhareth", "Molavakri", "Nevitash", "Sorashana", "Torashtai", "Valakhad", "Vishara"});
        nameMap.put("kenkuNames", new String[] {"Smasher", "Clanger", "Slicer", "Basher", "Rat Scratch", "Whistler", "Mouser", "Growler", "Sail Snap", "Hammerer", "Cutter"});
        nameMap.put("maleLeoninNames", new String[] {"Apto", "Athoz", "Baragon", "Bryguz", "Eremoz", "Gorioz", "Grexes", "Oriz", "Pyxathor", "Teoz", "Xemnon", "Xior"});
        nameMap.put("femaleLeoninNames", new String[] {"Aletha", "Atagone", "Demne", "Doxia", "Ecate", "Eriz", "Gragonde", "Iadma", "Koila", "Oramne", "Seza", "Ziore"});
        nameMap.put("allLeoninNames", new String[nameMap.get("maleLeoninNames").length + nameMap.get("femaleLeoninNames").length]);
        nameMap.put("lizardfolkNames", new String[] {"Achuak", "Aryte", "Baeshra", "Darastrix", "Garurt", "Irhtos", "Jhank", "Kepesk", "Kethend", "Korth", "Kosj", "Kothar", "Litrix", "Mirik", "Othokent", "Sauriv", "Throden", "Thurkear", "Usk", "Valignat", "Vargach", "Verthica", "Vutha", "Vyth"});
        nameMap.put("maleLoxodonNames", new String[] {"Bayul", "Berov", "Brooj", "Chedumov", "Dobrun", "Droozh", "Golomov", "Heruj", "Ilromov", "Kel", "Nikoom", "Ondros", "Radomov", "Svetel", "Tamuj", "Throom", "Vasool"});
        nameMap.put("femaleLoxodonNames", new String[] {"Ajj", "Boja", "Dancu", "Dooja", "Elyuja", "Fanoor", "Irij", "Jasoo", "Katrun", "Lyooda", "Mayja", "Radu", "Shuja", "Soofya", "Totoor", "Verij", "Vesmova", "Yoolna", "Zarij", "Zoorja"});
        nameMap.put("allLoxodonNames", new String[nameMap.get("maleLoxodonNames").length + nameMap.get("femaleLoxodonNames").length]);
        nameMap.put("maleMinotaurNames", new String[] {"Alovnek", "Brogmir", "Brozhdar", "Dornik", "Drakmir", "Drazhan", "Grozdan", "Kalazmir", "Klattic", "Melislek", "Nirikov", "Prezhlek", "Radolak", "Rugilar", "Sarovnek", "Svarakov", "Trovik", "Vraslak", "Yarvem"});
        nameMap.put("femaleMinotaurNames", new String[] {"Akra", "Bolsa", "Cica", "Dakka", "Drakisla", "Eleska", "Enka", "Irnaya", "Jaska", "Kalka", "Makla", "Noraka", "Pesha", "Raisha", "Sokali", "Takyat", "Vrokya", "Veska", "Yelka", "Zarka", "Zoka"});
        nameMap.put("allMinotaurNames", new String[nameMap.get("maleMinotaurNames").length + nameMap.get("femaleMinotaurNames").length]);
        nameMap.put("maleOrcNames", new String[] {"Dench", "Feng", "Gell", "Henk", "Holg", "Imsh", "Keth", "Krusk", "Mhurren", "Ront", "Shump", "Thokk"});
        nameMap.put("femaleOrcNames", new String[] {"Baggi", "Emen", "Engong", "Kansif", "Myev", "Neega", "Ovak", "Ownka", "Shautha", "Vola", "Volen", "Yevelda"});
        nameMap.put("allOrcNames", new String[nameMap.get("maleOrcNames").length + nameMap.get("femaleOrcNames").length]);
        nameMap.put("maleSatyrNames", new String[] {"Alekos", "Dimi", "Filippos", "Ilias", "Kyriakos", "Neofytos", "Omiros", "Pantelis", "Spyro", "Takis", "Zenon"});
        nameMap.put("femaleSatyrNames", new String[] {"Aliki", "Avra", "Chara", "Dafni", "Eirini", "Elpida", "Irini", "Kaiti", "Lia", "Niki", "Tasia", "Xeni", "Yanna", "Zoi"});
        nameMap.put("allSatyrNames",  new String[nameMap.get("maleSatyrNames").length + nameMap.get("femaleSatyrNames").length]);
        nameMap.put("shifterNames", new String[] {"Badger", "Bear", "Cat", "Fang", "Grace", "Grim", "Moon", "Rain", "Red", "Scar", "Stripe", "Swift", "Talon", "Wolf"});
        nameMap.put("tabaxiNames", new String[] {"Cloud", "Timber", "Jade", "Bird", "Thunder", "Snake", "Smoke"});
        nameMap.put("maleTieflingNames", new String[] {"Akmenos", "Amnon", "Harahas", "Ekernon", "Tados", "Kairon", "Leucis", "Melech", "Morthos", "Pelaios", "Skamos", "Therai"});
        nameMap.put("femaleTieflingNames", new String[] {"Akra", "Anakis", "Bryseis", "Criella", "Ea", "Kallista", "Lerissa", "Makaria", "Nemeia", "Pheleia", "Rieta"});
        nameMap.put("allTieflingNames", new String[nameMap.get("maleTieflingNames").length + nameMap.get("femaleTieflingNames").length]);
        nameMap.put("maleTritonNames", new String[] {"Corus", "Delnis", "Jhimas", "Keros", "Molos", "Nalos", "Vodos", "Zunis"});
        nameMap.put("femaleTritonNames", new String[] {"Aryn", "Belthyn", "Duthyn", "Feloren", "Otanyn", "Shalryn", "Vlaryn", "Wolyn"});
        nameMap.put("allTritonNames", new String[nameMap.get("maleTritonNames").length + nameMap.get("femaleTritonNames").length]);
        nameMap.put("maleVedalkenNames", new String[] {"Aglar", "Bellin", "Dallid", "Firellan", "Kavin", "Koplony", "Lomar", "Mathvan", "Modar", "Nebun", "Nhillosh", "Nitt", "Otrovac", "Ovlan", "Pelener", "Rill", "Trivaz", "Uldin", "Yolov", "Zataz"});
        nameMap.put("femaleVedalkenNames", new String[] {"Azi", "Barvisa", "Brazia", "Direll", "Fainn", "Griya", "Hallia", "Katrille", "Kovel", "Lilla", "Mirela", "Morai", "Nedress", "Ossya", "Pierenn", "Roya", "Sestri", "Triel", "Uzana", "Yaraghiya", "Zlovol"});
        nameMap.put("allVedalkenNames", new String[nameMap.get("maleVedalkenNames").length + nameMap.get("femaleVedalkenNames").length]);
        nameMap.put("verdanNames", new String[] {"Bronn", "Crahma", "Dolar", "Dreeda", "Duglee", "Gruvald", "Hulm", "Jeal", "Kalo", "Klesh", "Korm", "Lathi", "Ovlig", "Paracii", "Pils", "Praet", "Promul", "Reezni", "Rin", "Shylk", "Slyr", "Sollo", "Stalsii", "Stromvo", "Stussa", "Syrkart", "Takat", "Toit", "Tubyna", "Varr", "Veriga", "Wraq", "Wural", "Wurxee"});
        nameMap.put("warforgedNames", new String[] {"Anchor", "Banner", "Bastion", "Blade", "Blue", "Bow", "Cart", "Church", "Crunch", "Crystal", "Dagger", "Dent", "Five", "Glaive", "Hammer", "Iron", "Lucky", "Mace", "Oak", "Onyx", "Pants", "Pierce", "Red", "Rod", "Rusty", "Scout", "Seven", "Shield", "Slash", "Smith", "Spike", "Temple", "Vault", "Wall"});

        String gender = genders[rand.nextInt(genders.length)];
        String race = races[rand.nextInt(races.length)];
        String gameClass= gameClasses[rand.nextInt(gameClasses.length)];
        String background = backgrounds[rand.nextInt(backgrounds.length)];
        String archetype = "archetype";
        String name = "name"


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
