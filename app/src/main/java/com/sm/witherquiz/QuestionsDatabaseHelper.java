package com.sm.witherquiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




public class QuestionsDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Iq Questions";
    private static final int DB_VERSION = 1;
    private static final int UPDATE_VERSION = 7;

    public static int getDbVersion() {
        return UPDATE_VERSION;
    }

    public QuestionsDatabaseHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        updateMyDatabase(db,oldVersion, newVersion);
    }


    public static void insertQuestionSerialS1(SQLiteDatabase db, String Question,
                                              int ResourceId, String answer1, String answer2,
                                              String answer3, String answer4, int goodAnswer, int score)
    {
        ContentValues  questionValues = new ContentValues();
        questionValues.put("QUESTION", Question);
        questionValues.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValues.put("ANSWER1", answer1);
        questionValues.put("ANSWER2", answer2);
        questionValues.put("ANSWER3", answer3);
        questionValues.put("ANSWER4", answer4);
        questionValues.put("GOOD_ANSWER", goodAnswer);
        questionValues.put("SCORE", score);
        db.insert("QUESTIONS", null, questionValues);

    }

    public static void insertQuestionGame1(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesGame1 = new ContentValues();
        questionValuesGame1.put("QUESTION", Question);
        questionValuesGame1.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesGame1.put("ANSWER1", answer1);
        questionValuesGame1.put("ANSWER2", answer2);
        questionValuesGame1.put("ANSWER3", answer3);
        questionValuesGame1.put("GOOD_ANSWER", goodAnswer);
        questionValuesGame1.put("SCORE", score);

        db.insert("QUESTIONSGAME1", null, questionValuesGame1);

    }

    public static void insertQuestionGame2(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesGame2 = new ContentValues();
        questionValuesGame2.put("QUESTION", Question);
        questionValuesGame2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesGame2.put("ANSWER1", answer1);
        questionValuesGame2.put("ANSWER2", answer2);
        questionValuesGame2.put("ANSWER3", answer3);
        questionValuesGame2.put("GOOD_ANSWER", goodAnswer);
        questionValuesGame2.put("SCORE", score);

        db.insert("QUESTIONSGAME2", null, questionValuesGame2);

    }

    public static void insertQuestionGame3(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesGame3 = new ContentValues();
        questionValuesGame3.put("QUESTION", Question);
        questionValuesGame3.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesGame3.put("ANSWER1", answer1);
        questionValuesGame3.put("ANSWER2", answer2);
        questionValuesGame3.put("ANSWER3", answer3);
        questionValuesGame3.put("GOOD_ANSWER", goodAnswer);
        questionValuesGame3.put("SCORE", score);

        db.insert("QUESTIONSGAME3", null, questionValuesGame3);

    }

    public static void insertQuestionBook1(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook1 = new ContentValues();
        questionValuesBook1.put("QUESTION", Question);
        questionValuesBook1.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook1.put("ANSWER1", answer1);
        questionValuesBook1.put("ANSWER2", answer2);
        questionValuesBook1.put("ANSWER3", answer3);
        questionValuesBook1.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook1.put("SCORE", score);

        db.insert("QUESTIONSBOOK1", null, questionValuesBook1);

    }

    public static void insertQuestionBook2(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK2", null, questionValuesBook2);

    }

    public static void insertQuestionBook3(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK3", null, questionValuesBook2);

    }

    public static void insertQuestionBook4(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK4", null, questionValuesBook2);

    }

    public static void insertQuestionBook5(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK5", null, questionValuesBook2);

    }

    public static void insertQuestionBook6(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK6", null, questionValuesBook2);

    }

    public static void insertQuestionBook7(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK7", null, questionValuesBook2);

    }

    public static void insertQuestionBook8(SQLiteDatabase db, String Question,
                                           int ResourceId, String answer1, String answer2,
                                           String answer3, int goodAnswer, int score)
    {
        ContentValues  questionValuesBook2 = new ContentValues();
        questionValuesBook2.put("QUESTION", Question);
        questionValuesBook2.put("IMAGE_RESOURCE_ID", ResourceId);
        questionValuesBook2.put("ANSWER1", answer1);
        questionValuesBook2.put("ANSWER2", answer2);
        questionValuesBook2.put("ANSWER3", answer3);
        questionValuesBook2.put("GOOD_ANSWER", goodAnswer);
        questionValuesBook2.put("SCORE", score);

        db.insert("QUESTIONSBOOK8", null, questionValuesBook2);

    }


    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion)
    {
            db.execSQL("CREATE TABLE QUESTIONS (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "ANSWER4 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSGAME1 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSGAME2 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSGAME3 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK1 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK2 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK3 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK4 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK5 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK6 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK7 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");

            db.execSQL("CREATE TABLE QUESTIONSBOOK8 (_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "QUESTION TEXT,"
                    + "IMAGE_RESOURCE_ID INTEGER,"
                    + "ANSWER1 TEXT,"
                    + "ANSWER2 TEXT,"
                    + "ANSWER3 TEXT,"
                    + "GOOD_ANSWER INTEGER,"
                    + "SCORE INTEGER);");
            //Created By Szymon Moń

            //SERIAL S1

            insertQuestionSerialS1(db, "Jakiego potwora zabił Geralt w Blaviken?", 0, "Kikimorę", "Archespora", "Skolopendromorfa", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto według serialu zaprowadził Geralta do Stregobora?", 0, "Marilka", "Strażnik", "Wójt", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak naprawdę miał na imię Czarodziej, który podszywał się pod 'Mistrza Iriona'?", 0, "Stregobor", "Detmold", "Mistrz Irion", "0", 0, 0);
            insertQuestionSerialS1(db, "Z kim w serialu pił Geralt w knajpie po przybyciu do Blaviken?", 0, "Z Renfrii", "Z Wójtem", "Z dziwkami", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wypowiada Słowa 'Zło to zło Stregoborze...mniejsze...większe...średnie..wszystko jedno.'?", 0, "Geralt", "Caldemeyn", "Renfrii", "0", 0, 0);
            insertQuestionSerialS1(db, "O jakim przekleństwie mówił Stregobor do Geralta?", 0, "Czarnego Słońca", "Wilczej Zamieci", "Białego Zimna", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki tytuł posiada Renfri?", 0, "Księżniczka Creyden", "Falka", "Czarna Rayla", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zabrał Geralt Renfri po jej śmierci?", 0, "Brożkę", "Miecz", "Kolczyki", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakie ultimatum zastosować chciała Renfri wobec Stregobora?", 0, "Tridamskie", "Tetriandoch", "Cintryjskie", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaką nagrodę otrzymał Geralt za uratowanie ludzi w Blaviken?", 0, "Ukamieniowanie", "Pieniądze", "Brawa", "0", 0, 0);
//10
            insertQuestionSerialS1(db, "Jaki tytuł otrzymał Geralt po pobycie w Braviken?", 0, "Rzeźnik z Blaviken", "Biały wilk", "Bohater z Blaviken", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki był pierwszy zabity przez Geralta potwór?", 0, "Człowiek", "Strzyga", "Utopiec", "0", 0, 0);
            insertQuestionSerialS1(db, "Czyje to słowa 'Gdy się przetnę w palec - krwawię, gdy się przejem - boli mnie brzuch, a gdy kogoś nienawidzę, bo zabrał mi całe życie - zabijam go.'?", 0, "Renfri", "Yennefer", "Foltest", "0", 0, 0);
            insertQuestionSerialS1(db, "W co grała Ciri z dziećmi na rynku?", 0, "w Hacele", "w Karty", "w Chowanego", "0", 0, 0);
            insertQuestionSerialS1(db, "W kogo wcielił się w serialu Maciek Musiał?", 0, "Lazlo", "Ostrita", "Egana", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto grał Geralta?", 0, "Henry Cavill", "Joaquin Phoenix", "Chris Pratt", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto grał Cirillę?", 0, "Freya Allan", "Marta Bitner", "Anna Shaffer", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak umarła Calanthe?", 0, "Upadek z okna", "Od Miecza", "Od strzały", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak umarł Eist?", 0, "Od strzały", "Od miecza", "Od topora", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto próbował porwać Cirillę z Cintry?", 0, "Cahir", "Shirru", "Lazlo", "0", 0, 0);
//20
            insertQuestionSerialS1(db, "Kto wypowiada słowa 'Wynoś się z Blaviken Geralt i nigdy nie wracaj'?", 0, "Marilka", "Stregobor", "Caldemeyn", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak ma na imię koń Geralta?", 0, "Płotka", "Angus", "Baldur", "0", 0, 0);
            insertQuestionSerialS1(db, "Skąd pseudonim Dzieżba?", 0, "Nabijania na pal", "Od wyglądu", "Herbu", "0", 0, 0);
            insertQuestionSerialS1(db, "Do kogo Stregobor porównywał Dzieżbę?", 0, "Falki", "Toruviel", "Czarnej Rayli", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto jest Showrunnerem pierwszego sezonu wiedźmina?", 0, "S. Hissrich", "T. Morrison", "D. Lessing", "0", 0, 0);
            insertQuestionSerialS1(db, "Według serialu kto zabił szczura widelcem?", 0, "Marilka", "Geralt", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo poznała Yennefer, gdy pierwszy raz użyła Magii?", 0, "Istredda", "Fringillę", "Filippę", "0", 0, 0);
            insertQuestionSerialS1(db, "Za ile sprzedano Yenefer?", 0, "4 Marki", "3 Marki", "2 Marki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto grał Yennefer?", 0, "Anya Chalotra", "Anna Buring", "Freya Allan", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto grał Jaskra?", 0, "Joey Batey", "Adam Levy", "Jodhi May", "0", 0, 0);
//30
            insertQuestionSerialS1(db, "Gdzie Geralt poznał Jaskra?", 0, "W knajpie", "Na rozdrożu", "W lesie", "0", 0, 0);
            insertQuestionSerialS1(db, "Na kogo miał polować Geralt na krańcu swiata?", 0, "Diabła", "Matikorę", "Kikimorę", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak Jaskier nazwał Geralta, przed tym jak dostał od niego w brzuch?", 0, "Rzeźnikiem z Blaviken", "Białym Wilkiem", "Mutantem", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie szkoliła się Yennefer?", 0, "W Aretuzie", "W Ban Ard", "W Vengerbergu", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaka była pierwsza lekcja Yennefer?", 0, "Telekineza", "Alchemia", "Uzdrawianie", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto był rektorką Aretuzy?", 0, "Tissaia", "Filippa", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakim potworem był Diabeł?", 0, "Silvanem", "Sukkubem", "Elfem", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto nauczył Yennefer wymiany myśli?", 0, "Istredd", "Tissaia", "Fringilla", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym Yennefer zaatakowała Sabrinę Glevissig podczas próby w Aretuzie?", 0, "Błyskawicą", "Ogniem", "Wodą", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki elf skopał Jaskra i złamał mu lutnię?", 0, "Toruviel", "Isengrim", "Riordain", "0", 0, 0);

            insertQuestionSerialS1(db, "Dokąd chciała udać się Cirilla, po opuszczeniu Brokilonu?", 0, "Do Skellige ", "Do Temerii", "Do Redanii", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wysłał na Geralta skrytobójców?", 0, "Calanthe", "Duny", "Pavetta", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zniszczył okręty ze Skellige?", 0, "Fringilla", "Cahir", "Vilgefortz", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo zobaczyła Cirilla w uktrytym przejsciu, kiedy grała w Hacele?", 0, "Geralta ", "Lazlo", "Cahira", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto uwięził Geralta w lochu?", 0, "Eist", "Calanthe", "Duny", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym zajmował się Istredd po ukończeniu nauki?", 0, "Archeologią", "Politką", "Uzdrowicielstwem", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Yennefer spotkała się z Istreddem po latach?", 0, "W Nazairze", "W Temerii", "W Attre", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przekonał Yennefer, aby powrociła po latach do Aretuzy?", 0, "Vilgefortz", "Tissaia", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Yennefer zabrała młode adeptki, gdy odwiedziła Aretuzę?", 0, "Do Oranżerii", "Do Tissai", "Do Biblioteki", "0", 0, 0);
            insertQuestionSerialS1(db, "Po kogo wołała Calanthe, gdy lezała ranna po bitwnie, jednak nie było go już w strażnicy?", 0, "Geralta", "Eista", "Myszowora", "0", 0, 0);
//50 a
            insertQuestionSerialS1(db, "Jak na imię ma król elfów z krańca świata?", 0, "Yaevinn", "Filavandrel", "Lorweth", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiego powodu elfy z krańca swiata głodowały?", 0, "Potworów", "Nieżyznych gleb", "Ludzi", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto podarował Jaskrowi nową lutnię?", 0, "Yaevinn", "Filavandrel", "Żywia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki był sekret Yennefer, gdy ta przebywała w Aretuzie?", 0, "Lesbijstwo", "Pół-elfia krew", "Zakazana magia", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wybudował Aretuzę?", 0, "Ludzie", "Elfy", "Krasnoludy", "0", 0, 0);
            insertQuestionSerialS1(db, "W co Tissaia zmieniała swoje uczennice?", 0, "Ślimaki", "Węgorze", "Kraby", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaka jest sławna piosenka Jaskra?", 0, "Wilcza zamieć", "Toss a coin to the witcher", "Elfi pogrom", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak miał na imię elf z którym zaprzyjazniła się Ciri?", 0, "Torq", "Dara", "Lazlo", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt zrobił z zapłatą od chłopów z Dol Blathanna?", 0, "Kupił alkohol", "Oddał elfom", "Oddał chłopom", "0", 0, 0);
            insertQuestionSerialS1(db, "Od kogo Geralt dowiedział się o potworze w Temerii?", 0, "Velerada", "Dziwki", "Foltesta", "0", 0, 0);
//60
            insertQuestionSerialS1(db, "Co się stało z wiedźminem, który chciał przed Geraltem zapolować na strzygę?", 0, "Uciekł", "Zabiła go strzyga", "Powieszono go", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak nazywał się syn górnika podrzegającego do buntu w Temerii?", 0, "Edan", "Mikal", "Chewan", "0", 0, 0);
            insertQuestionSerialS1(db, "Która czarodziejka pomagała Geraltowi w historii ze strzygą?", 0, "Yennefer", "Triss", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt miał zrobić ze strzyga?", 0, "Zabić", "Odczarować", "Nic", "0", 0, 0);
            insertQuestionSerialS1(db, "Kim była strzyga?", 0, "Nikim", "Córką króla", "Królową", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto był ojcem Addy?", 0, "Demawend", "Foltest", "Ostritt", "0", 0, 0);
            insertQuestionSerialS1(db, "Co musiał zrobić ze strzygą Geralt w celu odczarowania jej?", 0, "Wypić jej krew", "Spędzić z nią noc", "Przestraszyć", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiej szkoły magii pochodził Istredd?", 0, "Aretuzy", "Ban Ard", "Gredlyn", "0", 0, 0);
            insertQuestionSerialS1(db, "Na jaki tron udała sie Yennefer po opuszczeniu Aretuzy?", 0, "Temerri", "Aedirn", "Redanii", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto był królem Aedirn, kiedy Yenner opuszczała Aretuzę?", 0, "Demawend", "Virfuril", "Stennis", "0", 0, 0);
//70
            insertQuestionSerialS1(db, "Co musiała poswięcić Yennefer w celu przemiany?", 0, "Rodzinę", "Płodność", "Węch", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak nazywała się siostra Foltesta?", 0, "Verena", "Adda", "Meve", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zdradził sekret Yennefer dotyczący jej elfiego pochodzenia?", 0, "Sabrina", "Istredd", "Fringilla", "0", 0, 0);
            insertQuestionSerialS1(db, "Do jakiego królestwa chcieli wysłać Yennefer, nim ta powędrowała do Aedirn?", 0, "Redanii", "Nilfgardu", "Aedirn", "0", 0, 0);
            insertQuestionSerialS1(db, "Co pomogło Geraltowi ominąć straż Segerina przed Dworzyszczem?", 0, "Miecz", "Kamień", "Magia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak miała na imię matka Foltesta?", 0, "Sivney", "Sancia", "Zuleyka", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto rzucił klątwę na Addę?", 0, "Sancia", "Ostritt", "Foltest", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt ofiarował Foltestowi przed walką ze strzygą?", 0, "Dwimerytowy pierścień", "Brożkę Renfrii", "Amulet", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zrobiła Geraltowi Adda po trzecim pijaniu koguta?", 0, "Ugryzła go", "Zadrapała go", "Nic", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zamiast Yennefer udał się do Nilfgardu?", 0, "Sabrina", "Fringilla", "Sheala", "0", 0, 0);
//80
            insertQuestionSerialS1(db, "Kto wręczył Geraltowi zapłatę za Srzygę?", 0, "Foltest", "Triss", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak się nazywał las w którym Ciri spotkała driady?", 0, "Maribor", "Brokilon", "Saska", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak Ciri ma na drugie imię?", 0, "Evra", "Fiona", "Cecilia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki potwór połknął Geralta w całości, przez co Jaskier musiał oddać jego ubrania do pralni?", 0, "Mantikora", "Selkimora", "Kraken", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto namówil Geralta do tego, aby ten udał się na zaślubiny Pavetty?", 0, "Yennefer", "Jaskier", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak  naprawdę miał na imie Jeż z Erlenwaldu?", 0, "Regan", "Duny", "Paulie", "0", 0, 0);
            insertQuestionSerialS1(db, "Dla kogo miała pierwotnie zostać przeznaczona Pavetta, zgodnie z planami Calanthe?", 0, "Eista", "Cracha", "Lugosa", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo ocalił Duny przed niechybną śmiercią?", 0, "Calanthe", "Króla Regnera", "Pavettę", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto był matką Cirilli?", 0, "Calanthe", "Pavetta", "Egvera", "0", 0, 0);
            insertQuestionSerialS1(db, "Co sie stało z Cirillą po wypiciu wody Brokilonu?", 0, "Zemdlała", "Nic", "Nic", "0", 0, 0);

            insertQuestionSerialS1(db, "Gdzie Cirilla wypowiedziała przepowiednię Itliny?", 0, "W Cintrze ", "Na Bagnie", "W Brokilonie", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie odbyła się bitwa o wolność Północy?", 0, "W Cintrze ", "Pod Chocieborzem", "Pod Sodden", "0", 0, 0);
            insertQuestionSerialS1(db, "Który król północy stanął do bitwy pod Sodden?", 0, "Radowid", "Foltest", "Stennis", "0", 0, 0);
            insertQuestionSerialS1(db, "Ilu czarodziejów brało udział w Bitwie o Sodden?", 0, "13 ", "22", "17", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak ma na imię matka Geralta z Rivii?", 0, "Margarita", "Visenna", "Nie wiadomo", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto dowodził czarodziejami podczas bitwy pod Sodden?", 0, "Yennefer", "Vilgefortz", "Tissaia", "0", 0, 0);
            insertQuestionSerialS1(db, "Który z tych czarodziejów oddał życie w bitwie pod Sodden?", 0, "Triss", "Koral", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto odrzucił kogo, podczas próby zjednania się po latach. Istredd Yennefer, Yennefer Istredda czy nie było takiego spotkania?", 0, "2", "1", "3", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym zajmowała się matka Geralta?", 0, "Nie wiadomo", "Uzdrowicielstwem", "Archeologią", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zabijało górników i mieszkańców Temerii?", 0, "Vukodlak", "Strzyga", "Wilkołak", "0", 0, 0);
//100 b
            insertQuestionSerialS1(db, "Podczas zaślubin Pavetty dwóch mężczyzn kłóciło się o to, kto zabił konkretnego potwora. Jakiego?", 0, "Smoka", "Gryfa", "Mantikorę", "0", 0, 0);
            insertQuestionSerialS1(db, "Calanthe nalegała, żeby Geralt wykonał dla niej konkretne zlecenie, na kogo miało być?", 0, "Gryfa", "Mantikorę", "Jeża z Erlenwaldu", "0", 0, 0);
            insertQuestionSerialS1(db, "Skąd pochodził Lord Pelegrin?", 0, "Redanii", "Cintry", "Nilfgardu", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zdjeło klątwę z 'Jeża z Erlenwaldu'?", 0, "Medalion", "Rytuał", "Prawo Niespodzianki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto uratował życie Dunego?", 0, "Eist", "Calanthe", "Geralt", "0", 0, 0);
            insertQuestionSerialS1(db, "W jakim miasteczku przebywała Yennefer, gdy pierwszy raz spotkała Geralta?", 0, "Vengerbergu", "Toussaint", "Rinde", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto został opiekunem Pavetty, aby nauczyć ją kontroli nad swoimi zdolnościami?", 0, "Yennefer", "Stregobor", "Myszowór", "0", 0, 0);
            insertQuestionSerialS1(db, "Kiedy Duny posiadał ludzką twarz?", 0, "Po 22", "Po 23", "Po 24", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego Geralt zażądał jako zapłaty od Jeża z Erlenwaldu?", 0, "Złota", "Niczego", "Prawa niespodzianki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo poślubiła Calanthe po królu Regnerze?", 0, "Vilfuira", "Cracha", "Eista", "0", 0, 0);

            insertQuestionSerialS1(db, "Gdzie Yennefer pochowała dziecko, którego nie udało jej się ocalic przed zamachowcem?", 0, "Na Pustyni", "W lesie", "Na plaży", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo wynajął Cahir, w celu wydostania Cirilli z Brokilonu?", 0, "Myszowora", "Cynthie", "Dopplera", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego pragneła Yennefer najbardziej na świecie?", 0, "Miłości", "Pieniędzy", "Potomstwa", "0", 0, 0);
            insertQuestionSerialS1(db, "Co wyłowił Geralt z jeziora w czasie 'bezsenności'?", 0, "Pstrąga", "Amulet", "Dżina", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Geralt poznał Yennefer?", 0, "u Istredda", "u Caydemana", "u Berrana", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zobaczył Geralt, kiedy pierwszy raz wszedł do tego samego pomieszczenia, w którym przebywała Yennefer?", 0, "Istredda", "Nagą Yenn", "Orgię", "0", 0, 0);
            insertQuestionSerialS1(db, "Czyje to słowa - 'Jakbym kupił w karczmie pierogi i odkrył, że nie mają farszu'?", 0, "Jaskra", "Boholta", "Geralta", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakie było pierwsze życzenie Geralta?", 0, "'Egzorcyzm'", "Lekarstwo dla Jaskra", "Swięty spokój", "0", 0, 0);
            insertQuestionSerialS1(db, "'Żebyś pękł skurwysynu' - które z kolei to było życzenie Geralta?", 0, "Trzecie", "Pierwsze", "Drugie", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przejął tron Aedirn po śmierci króla Virfurila?", 0, "Stennis", "Videmont", "Demawend", "0", 0, 0);

            insertQuestionSerialS1(db, "Jakie było ostatnie życzenie Geralta?", 0, "Zdrowie Jaskra", "Swięty spokój", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Przez kogo Geralt wylądował w lochu?", 0, "Berrana", "Jaskra", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo Geralt zlał paskiem po tyłku, zanim trafił do lochu?", 0, "Ślusarza", "Stajennego", "Aptekarza", "0", 0, 0);
            insertQuestionSerialS1(db, "Co ujrzał Chireadan po spojrzeniu przez połamane okno?", 0, "Śmierć", "Jaskra", "Sex", "0", 0, 0);
            insertQuestionSerialS1(db, "Tea i Vea to imiona?", 0, "Dziwek", "Czarodziejek", "Zerrikanek", "0", 0, 0);
            insertQuestionSerialS1(db, "Na jakiego potwora polował Geralt, gdy uznano go za zmarłego i próbowano okraść?", 0, "Sukkuba", "Viwernę", "Bazyliszka", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiego powodu Geralt zdecydował się dołączyć do polowania na smoka?", 0, "Borha", "Pieniędzy", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak na prawde miał na imię Borch 3 kawki?", 0, "Villentratanmerth", "Villentretem", " Villentretenmerth", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak miał na imię Rycerz bez skazy, który miał upolować smoka", 0, "Eikh", "Eyck", "Eieck", "0", 0, 0);
            insertQuestionSerialS1(db, "Podczas jakiej czynnośći został zabity Eyck?", 0, "Jedzenia", "Spania", "Srania", "0", 0, 0);

            insertQuestionSerialS1(db, "Jakiego potwora zabił Eyck?", 0, "Ghula", "Nekkera", "Hirrikę", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przeprowadził Geralta skrótem, podczas polowania na smoka?", 0, "Yennefer", "Rębacze", "Krasnoludy", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zrzucił lawinę na polujących na smoka?", 0, "Yennefer", "Geralt", "Borch", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego pilnował smok?", 0, "Wioski", "Skarbu", "Jaja", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto kogo zostawił w Rinde? Geralt Yennefer, Yennefer Geralta czy rozstali się w innym mieście?", 0, "3", "2", "1", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego szukała Yennefer, gdy chciała upolować smoka?", 0, "Bogactwa", "Geralta", "Lekarstwa", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zdradziło Dopplera, który podszywał się pod Myszorowa?", 0, "Akcent", "Szal", "Artretyzm", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zabił Boholta?", 0, "Geralt ", "Borch", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Borch 3 kawki podarował krasnoludom?", 0, "Łuski", "Serce", "Zęby", "0", 0, 0);
            insertQuestionSerialS1(db, "Do kogo Geralt wypowiedział słowa 'Gdybym mógl prosić los jedną łąskę, chciałbym żeby mnie od Ciebie mnie uwolnił'?", 0, "Stregobora", "Yennefer", "Jaskra", "0", 0, 0);

//140 c

// GAME 1
            insertQuestionGame1(db, "Ile lat mineło od czasu pogromu w Rivii do znalezienia Geralta ledwie żywego pod Kaer Morhen?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame1(db, "Jak miał na imię wiedźmin, który nie przeszedł mutacji, zabity przez Magistra?", 0, "Coen", "Leo", "Berengar", 0, 0);
            insertQuestionGame1(db, "Jaki potwór zaatakował Kaer Morhen?", 0, "Mantikora", "Kikimora", "Przeraza", 0, 0);
            insertQuestionGame1(db, "Calcium equum, biała mewa, pazur przerazy, jaskółcze zielę, to składniki na?", 0, "Lekarstwo dla Triss", " Mutagen z przerazy", "Jaskółkę", 0, 0);
            insertQuestionGame1(db, "Jak miał na imię magik z którym zmierzył się Geralt w Kaer Morhen?", 0, "Azar Javed", "Savolla ", "Magister", 0, 0);
            insertQuestionGame1(db, "Który ze znanych wiedźminów szkoły wilka był nieobecny podczas obrony Kaer Morhen?", 0, "Letho", "Coen", "Berengar", 0, 0);
            insertQuestionGame1(db, "Z kim Geralt mógł stoczyć swoją pierwsza walkę na pięści?", 0, "Eskelem", "Lambertem", "Vesemirem", 0, 0);
            insertQuestionGame1(db, "Jak miał na imię strażnik bramy do Wyzimy?", 0, "Brogg", "Mikul", "Ostritt", 0, 0);
            insertQuestionGame1(db, "Ile mózgów utopców gracz musi dostarczyć Wielebnemu?", 0, "5", "10", "3", 0, 0);
            insertQuestionGame1(db, "Ile krwii ghuli gracz musi dostarczyć Kalksteinowi?", 0, "3", "5", "10", 0, 0);

            insertQuestionGame1(db, "Wielki łowczy zleca graczowi na podgodziu zabicie 2 wielkich potworów. Nadir był?", 0, "Ghulem", "Topielcem", "Barghestem", 0, 0);
            insertQuestionGame1(db, "Kto jako pierwszy jest w stanie zapoznać gracza z grą w kości?", 0, "Haren Brogg", "Mikul", "Zoltan", 0, 0);
            insertQuestionGame1(db, "Wielki łowczy zleca graczowi na podgodziu zabicie 2 wielkich potworów. Ozzrel był?", 0, "Alghulem", "Ghulem", "Topielcem", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt po raz pierwszy w grze może spotkać króla dzikiego gonu?", 0, "U Aldersberga", "U Wielebnego", "W Kaer Morhen", 0, 0);
            insertQuestionGame1(db, "Jak ma na imię kobieta, którą Geralt w zamian za pomoc może zaprosić na sex do młyna?", 0, "Carmen", "Abigail", "Vesna", 0, 0);
            insertQuestionGame1(db, "Na pogrodziu możemy spotkać kupca, który daje nam za darmo oreny, spłacając stary dług. Ile ich dostajemy?", 0, "100", "150", "200", 0, 0);
            insertQuestionGame1(db, "Kto wysyła wiedźmina do jaskini koło bramy Mariborskiej, w celu odnalezienia przyjaciela?", 0, "Haren Brogg", "Leuvaarden", "Mikul", 0, 0);
            insertQuestionGame1(db, "Ghe'vrath, Kezath i Y'esath to nazwy?", 0, "Zaklęć", "Mieczy", "Obelisków", 0, 0);
            insertQuestionGame1(db, "W którym rozdziale możemy spotkać później Abigail, jeśli uratujemy ją w rozdziale I?", 0, "IV", "III", "V", 0, 0);
            insertQuestionGame1(db, "Kto z wymienionych pomagał Salamandrze?", 0, "Abigail ", "Wielebny", "Leuvaarden", 0, 0);

            insertQuestionGame1(db, "Kto zawiadomił strażników Wyzimy, przez co Geralt trafił do lochu?", 0, "Wielebny", "Meis", "Mikul", 0, 0);
            insertQuestionGame1(db, "W lochu Geralt spotkał więźnia, który nie był zadowolony ze swoich współwięźniów. Gardził on:", 0, "Politycznymi", "Złodziejami", "Narkomanami", 0, 0);
            insertQuestionGame1(db, "Zlecenie na jakiego potwora dało Geraltowi wolność?", 0, "Topielca", "Kuroliszka", "Vivernę", 0, 0);
            insertQuestionGame1(db, "Skąd pochodził Zygfryd?", 0, "z Wyzimy", "z Lyrii", "z Denesle", 0, 0);
            insertQuestionGame1(db, "Z kim był możliwy pierwszy łóżkowy romans Geralta, nie wliczając Triss?", 0, "Vesna", "Shani", "Abigail", 0, 0);
            insertQuestionGame1(db, "Kto podszywał się pod Raymonda Maarloeve?", 0, "Magister", "Azar Javed", "Jakub", 0, 0);
            insertQuestionGame1(db, "W którym roku wyszedł Wiedźmin I?", 0, "2006", "2008", "2007", 0, 0);
            insertQuestionGame1(db, "Ile w grze jest rodzajów pancerza?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame1(db, "Jaką nazwę ma najlepszy srebrny miecz w grze?", 0, "Addan Deith", "Aerondight", "Deithwen", 0, 0);
            insertQuestionGame1(db, "Jaką nazwę ma najlepszy stalowy miecz w grze?", 0, "Deithwen", "D'yaebl", "G'valchir", 0, 0);

            insertQuestionGame1(db, "Gdzie gracz zdobywa swój pierwszy srebrny miecz?", 0, "W lochu", "w Kaer Morhen", "Na Podgrodziu", 0, 0);
            insertQuestionGame1(db, "Ile rodzajów potworów występuje w grze?", 0, "39", "47", "53", 0, 0);
            insertQuestionGame1(db, "Jaki jest maksymalny poziom w grze?", 0, "55", "35", "50", 0, 0);
            insertQuestionGame1(db, "Kto dubbingował Geralta w grze?", 0, "Rozenek", "Żebrowski", "Zamachowski", 0, 0);
            insertQuestionGame1(db, "Kto został prywatnym detektywem wiedźmina?", 0, "Meis", "Maarloeve", "Talar", 0, 0);
            insertQuestionGame1(db, "Jakie kwiaty należy dostarczyc dla Yarena Bolta?", 0, "Tojad", "Sporysz", "Dwugrot", 0, 0);
            insertQuestionGame1(db, "Geralt w wiedźminie I nie może posługiwać sie?", 0, "Halabardą", "Sztyletem", "Toporem", 0, 0);
            insertQuestionGame1(db, "W II rozdziale możemy spotkać pod bramą cmentarną kobietę, którą nawiedza duch. Jednak możemy ją spotkać tylko pomiędzy?", 0, "23:0 - 01:00", "12:00 - 13:00", "18:00 - 22:00", 0, 0);
            insertQuestionGame1(db, "Do kogo należał srebrny miecz, który Geralt dostaje na początku II rozdzialu?", 0, "Berengara", "Lamberta", "Coena", 0, 0);
            insertQuestionGame1(db, "Stara przywódczyni duchowa, społeczności ceglarskiej zamieszkującej wioskę w lesie na bagnach to?", 0, "Vaska", "Babka", "Kvena", 0, 0);

            insertQuestionGame1(db, "Ile obeliskow wystepuje na bagnach?", 0, "12", "8", "10", 0, 0);
            insertQuestionGame1(db, "Czym został zabity świadek w szpitalu Lebiody?", 0, "Trucizną", "Sztyletem", "Larwami", 0, 0);
            insertQuestionGame1(db, "Od kogo Geralt może się dowiedzieć o zerrikańskich muchach tse-tse?", 0, "Ogrodnika", "Shani", "Kalksteina", 0, 0);
            insertQuestionGame1(db, "Ile broszur salamandry musiał dostarczyć Geralt do Declana Leuvaardena?", 0, "5", "3", "6", 0, 0);
            insertQuestionGame1(db, "Ile kłączy echinopsów Geralt musiał dostarczyć ogrodnikowi?", 0, "5", "10", "3", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt poznał znak Ignii?", 0, "w Krypcie", "w Jaskini", "Na bagnie", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt poznał znak Yrden?", 0, "w Wieży", "u Druidów", "w Jaskini", 0, 0);
            insertQuestionGame1(db, "Od której godziny do której Geralt może spotkać pod kanałami 'Cwaniaczka', który zleca mu zadanie związane z pomocą odzyskania pierścienia rodowego?", 0, "12:00 - 18:00", "06:00 - 12:00", "06:30 - 9:00", 0, 0);
            insertQuestionGame1(db, "Kto wywiesił 'zlecenie na topielce'?", 0, "Zygfryd", "Meis", "Kalkstein", 0, 0);
            insertQuestionGame1(db, "Kto wywiesił \"zlecenia na wilki\"?", 0, "Meis", "Jean Pierre", "Zygfryd", 0, 0);

            insertQuestionGame1(db, "Vincent Meis zleca graczowi na Wyzimie Klasztornej zabicie 2 wielkich potworów. Coccacidium był?", 0, "Kuroliszkiem", "Echinopsem", "Archesporem", 0, 0);
            insertQuestionGame1(db, "Jakie zaklęcie może rzucić Triss ne Geralta, jeśli dostarczymy jej księge z wieży?", 0, "Tarczę Alzura", "Piorun Alzura", "Mutację Alzura", 0, 0);
            insertQuestionGame1(db, "Zygfryd zleca zadanie ze zmarłymi na cmentarzu. Kiedy dostaniemy największą nagrodę? Kiedy zabijemy potwora, pobiegniemy za elfami czy uratujemy ludzi?", 0, "1", "3", "2", 0, 0);
            insertQuestionGame1(db, "W III rozdziale wielki łowczy królewski zleca wiedźminowi zabicie 2 wielkich bestii. Moa to?", 0, "Kuroliszek", "Kikimora", "Viverna", 0, 0);
            insertQuestionGame1(db, "Kto ratuje Geralta, gdy ten zostaje obezwładniony na bagnach?", 0, "Triss", "Talar", "Meis", 0, 0);
            insertQuestionGame1(db, "Jaka jest ulubiona potrawa Addy?", 0, "Maliny", "Katoblefasy", "Przepiórka", 0, 0);
            insertQuestionGame1(db, "Zahin Schmartz to?", 0, "Strażnik", "Alchemik", "Dentysta", 0, 0);
            insertQuestionGame1(db, "Od czego uzależniony jest Siemko?", 0, "Fistechu", "Hazardu", "Alkoholu", 0, 0);
            insertQuestionGame1(db, "Kto przetrzymywał lutnię Jaskra?", 0, "Visenna", "Rozalinda", "Carmen", 0, 0);
            insertQuestionGame1(db, "Kto był ukochanym prostytutki z portu \"Carmen\"?", 0, "Talar", "Baranina", "Meis", 0, 0);

            insertQuestionGame1(db, "W III rozdziale wielki łowczy królewski zleca wiedźminowi zabicie 2 wielkich bestii. Voref to?", 0, "Wilk", "Viverna", "Kikimora", 0, 0);
            insertQuestionGame1(db, "W III rozdziale jedna z sanitariuszek prosi Geralta o pomoc. Okazuje się w trakcie misji, ze jej babcia została opętana. Przez kogo?", 0, "Demona", "Fleedera", "Alpe", 0, 0);
            insertQuestionGame1(db, "Talar to?", 0, "Zdrajca", "Złodziej", "Szpieg", 0, 0);
            insertQuestionGame1(db, "Jak nazywał się diler Salamandry?", 0, "Angus", "Baranina", "Gellert", 0, 0);
            insertQuestionGame1(db, "Kto zajmował się kontrolą produkcji Fishtechu?", 0, "Baranina", "Gellert", "Roland", 0, 0);
            insertQuestionGame1(db, "Kto zdradza Geralta dla salamandry?", 0, "Leuvaarden", "Talar", "Adda", 0, 0);
            insertQuestionGame1(db, "Kto zabił Leo?", 0, "Magister", "Savolla", "Azar Javed", 0, 0);
            insertQuestionGame1(db, "Komu udało się odbić bełt wystrzelony przez Magistra?", 0, "Vesemirowi", "Geraltowi", "Leo", 0, 0);
            insertQuestionGame1(db, "Co było zródłem anomali w Wyzimie?", 0, "Azar Javed", "Medalion", "Alvin", 0, 0);
            insertQuestionGame1(db, "Ile pazurów kikimor nalezało dostarczyć Veleradowi?", 0, "10", "5", "3", 0, 0);

            insertQuestionGame1(db, "Kto wystawił zlecenie na kuroliszki w III rozdziale?", 0, "Meis", "Skryba", "Velerad", 0, 0);
            insertQuestionGame1(db, "Ile mięs Viverny nalezało dostarczyć karczmarzowi w III rozdziale?", 0, "10", "5", "3", 0, 0);
            insertQuestionGame1(db, "Jak brzmii \"wiedźmin\" w języku wodnych panów?", 0, "Wiedmolol'bul", "Wiedmolol", "Viedmolol", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale Tobias Hoffman płaci wiedźminowi za zabicie 2 wielkich bestii. Ureus to?", 0, "Zjadarka", "Cmentar", "Graveir", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale Tobias Hoffman płaci wiedźminowi za zabicie 2 wielkich bestii. Teyu to?", 0, "Cmentar", "Zjadarka", "Kapłan Vodyanoi", 0, 0);
            insertQuestionGame1(db, "Berengar wytyka Geraltowi lukę w walce. Jest to spowodowane uszkodzeniem pewnej części ciała Geratal. Jakiej?", 0, "Kolana", "Łokcia", "Stopy", 0, 0);
            insertQuestionGame1(db, "Kto zabił kogo? Alina Celinę, Celina Alinę, czy to żadne z nich?", 0, "1", "2", "3", 0, 0);
            insertQuestionGame1(db, "Jak się nazywa miecz, który Geralt dostaje od Pani Jeziora?", 0, "Ard'aenye", "Deithwen", "Aerondight", 0, 0);
            insertQuestionGame1(db, "Na jakiej wiosce wylądował Geralt?", 0, "Odmęty", "Zamęty", "Odręgi", 0, 0);
            insertQuestionGame1(db, "Berengar szukał pewnej zbroji. Czyjej?", 0, "Coena", "Kruka", "Eycka", 0, 0);

            insertQuestionGame1(db, "Jak nazywał się złodziej, który po śmierci został \"Topielcem złodziejem\"?", 0, "Teyu", "Gellert", "Zefir", 0, 0);
            insertQuestionGame1(db, "Co musimy dostarczyć żonie kowala, który zdradzał ją z Sukkubem aby ta mogła się pozbyć demonicy?", 0, "Świetlisty pył", "Cenisty pył", "Biały Mirt", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir pozwalał na wykrywanie niewidzialnych istot?", 0, "Pełnia", "Wywar de Vrie", "Wilga", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwieksza odporność na krwiawienie?", 0, "Wilga ", "Czarna krew", "Pocałunek", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zapewnia odporność na kwas?", 0, "Powój", "Zamieć", "Pełnia", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwiększa refleks?", 0, "Powój", "Zamieć", "Wywar de Vries", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwiększa regenerację energii?", 0, "Jaskółka", "Pełnia", "Puszczyk", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir uodparnia na trucizny?", 0, "Wilga", "Powój", "Pocałunek", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwieksza natężenie znaków?", 0, "Puszczyk", "Filtr Petriego", "Dzierzba", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zadaje ból przeciwnikom, którzy zranią Geralta?", 0, "Wilga", "Zamieć", "Dzierzba", 0, 0);

            insertQuestionGame1(db, "Który eliksir zwiększa odporność na ogłuszenia?", 0, "Wierzba", "Dzierzba", "Wilga", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwiększa szansę na zadanie krytycznych ran?", 0, "Dzierzba", "Wilk", "Grom", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwiększa zadawane obrażenia, ale tylko gdy postać posiada mniej niz 50% zdrowia?", 0, "Grom", "Wilk", "Rosomak", 0, 0);
            insertQuestionGame1(db, "Jaki Eliksir zwieksza regenerację zdrowia?", 0, "Jaskółka", "Pełnia", "Rosomak", 0, 0);
            insertQuestionGame1(db, "Jeden z eliksirów znacznie zwiększa maksymalną ilość energii, jest to?", 0, "Wilga", "Las Maroborski", "Puszczyk", 0, 0);
            insertQuestionGame1(db, "Który z tych eliksirów cechuje sie niską toksycznością?", 0, "Powój", "Jaskółka", "Kot", 0, 0);
            insertQuestionGame1(db, "Który z tych eliksirów cechuje sie srednią toksycznościa?", 0, "Jaskółka", "Grom", "Czarna Krew", 0, 0);
            insertQuestionGame1(db, "Który z tych eliksirów cechuje sie wysoką toksycznościa?", 0, "Las Mariborski", "Jean Wierzba", "Rosomak", 0, 0);
            insertQuestionGame1(db, " Który z tych eliksirów cechuje sie bardzo wysoką toksycznościa?", 0, "Grom", "Zamieć", "Pełnia", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale, w zależności od podjętych przez nas decyzji Abigail lub Guślarka zlecają nam zabicie zjadark. Ile zębów mamy dostarczyć??", 0, "10", "5", "3", 0, 0);

            insertQuestionGame1(db, "Ile kłów Alp mamy dostarczyć dla Tobiasa Hoffmana?", 0, "10", "5", "3", 0, 0);
            insertQuestionGame1(db, "Kto zabił Celinę?", 0, "Alina", "Tobias", "Julian", 0, 0);
            insertQuestionGame1(db, "Ile punktów daje eliksir z upiornego psa?", 0, "3x brązowe", "1x srebrny", "1x brązowy", 0, 0);
            insertQuestionGame1(db, "Ile punktów daje eliksir z serca kościeja?", 0, "x3 srebrne", "x1 złoty", "x2 srebrne", 0, 0);
            insertQuestionGame1(db, "Ile punktów daje eliksir z serca strzygi?", 0, "x1 złoty", "x2 srebrne", "x1 brąz, x1 srebrny", 0, 0);
            insertQuestionGame1(db, "Która wersja zbroi kruka była przeznaczona dla gracza, który posługuje się znakami?", 0, "Elfia", "Neutralna", "Zakonna", 0, 0);
            insertQuestionGame1(db, "W zadaniu \"Litania św. Grzegorza\" musimy uruchomić tajne przejscie specjalną sekwencją znaków. Jaką?", 0, "x3 Igni", "x2 Ard,Igni", "x3 Aard", 0, 0);
            insertQuestionGame1(db, "W zadaniu \"Wynalazek gnomów\" musimy uruchomić tajne przejście specjalną sekwencją znaków. Jaką?", 0, "Aard,Igni,Aard", "Igni,Aard,Igni ", "x2 Igni,Aard", 0, 0);
            insertQuestionGame1(db, "Kim był Jakub De Aldersberg?", 0, "Alvinem", "Zygfrydem", "Javedem", 0, 0);
            insertQuestionGame1(db, "Kto rzucił klątwę na strzygę?", 0, "Ostritt", "De Wett", "Javed", 0, 0);

            insertQuestionGame1(db, "Czyj duch pojawia się po zabiciu Jakuba De Aldersberga?", 0, "Leo", "Javeda", "Eredina", 0, 0);
            insertQuestionGame1(db, "Za jaką sumę pieniędzy Geralt zgadza się zabić Jakuba De Aldersberga?", 0, "10 000", "5 000", "7 000", 0, 0);
            insertQuestionGame1(db, "Jakie zwierzę posiadał Foltest?", 0, "Psa", "Kota", "Jaszczurkę", 0, 0);
            insertQuestionGame1(db, "Kto zaatakował Foltesta po tym, jak Geralt odebrał od niego nagrodę?", 0, "Elf", "Zakonnik", "Wiedźmin", 0, 0);
            insertQuestionGame1(db, "W V rozdziale wielki łowczy królewski zleca zabicie 2 wielkich potworów. Vesper to?", 0, "Garkain", "Bruxa", "Zeugl", 0, 0);
            insertQuestionGame1(db, "W V rozdziale wielki łowczy królewski zleca zabicie 2 wielkich potworów. Lilly to?", 0, "Alpa", "Bruxa", "Zeugl", 0, 0);
            insertQuestionGame1(db, "W epilogu, w kanałach zabijamy potęznego potwora. Był nim?", 0, "Kraken", "Bruxa", "Zeugl", 0, 0);

//117

//WIEDZMIN 2
            insertQuestionGame2(db, "Czy w grze wiedźmin 2 również występuje \"Aerondight\" - miecz od Pani Jeziora?", 0, "Czasami ", "Zawsze", "Nigdy", 0, 0);
            insertQuestionGame2(db, "Czy w grze wiedźmin 2 również występuje Mahakamski Sihil?", 0, "Zawsze", "Czasami", "Nigdy", 0, 0);
            insertQuestionGame2(db, "Czy w grze wiedźmin 2 również występuje Zbroja Kruka?", 0, "Zawsze", "Nigdy", "Czasami", 0, 0);
            insertQuestionGame2(db, "Jaka jest najlepsza zbroja w grze?", 0, "Bratobójcy", "Kruka", "Vranów", 0, 0);
            insertQuestionGame2(db, "Schemat na który z tych pancerzy można zdobyć jedynie w I akcie?", 0, "Wiarołomcy", "Świętokradcy", "Bratobójcy", 0, 0);
            insertQuestionGame2(db, "Schemat na który z tych pancerzy można zdobyć jedynie w II akcie?", 0, "Świętokradcy", "Bratobójcy", "Wiarołomcy", 0, 0);
            insertQuestionGame2(db, "Schemat na który z tych pancerzy można zdobyć jedynie w III akcie?", 0, "Bratobójcy", "Świętokradcy", "Wiarołomcy", 0, 0);
            insertQuestionGame2(db, "Jaki poziom toksyczności posiada Dekokt Raffarda Białego?", 0, "60", "50", "40", 0, 0);
            insertQuestionGame2(db, "Jaki poziom toksyczności posiada  Filtr Petriego?", 0, "60", "40", "50", 0, 0);
            insertQuestionGame2(db, "Ile trwa kot?", 0, "5 min", "7 min", "10 min", 0, 0);

            insertQuestionGame2(db, "Który z tych eliksirów posiada 25 pkt toksyczności?", 0, "Jaźwiec", "Jaskółka", "Czajka", 0, 0);
            insertQuestionGame2(db, "Vitriol, Aether i Caelum to składniki potrzebne do przygotowania?", 0, "Kota", "Gromu", "Jaskółki", 0, 0);
            insertQuestionGame2(db, "Pierwszy raz możemy siłować się z kimś na rękę w?", 0, "Pod namiotem", "We Flotsam", "W lochu", 0, 0);
            insertQuestionGame2(db, "Jak miał na imię syn baronowej La Valette?", 0, "Edgar", "Arjan", "Busy", 0, 0);
            insertQuestionGame2(db, "Gdzie po raz pierwszy możemy spotkać Arjana La Vallete, po tym jak uratujemy jego życie na wieży?", 0, "Flotsam", "Loc Muinne", "Lochy", 0, 0);
            insertQuestionGame2(db, "Gdzie mieszka Anezka?", 0, "Binduga", "Flotsam", "Vergen", 0, 0);
            insertQuestionGame2(db, "Jak ma na imię szlachcić w twierdzy La Valette, któremu możemy podczas rozmowy przywalić w twarz?", 0, "Kreon", "Tales", "Hugon", 0, 0);
            insertQuestionGame2(db, "Iloma znakami może się posługiwać Geralt w wiedźminie 2?", 0, "4", "5", "6", 0, 0);
            insertQuestionGame2(db, "Który znak powoduje spowolnienie czasu?", 0, "Heliotrop", "Yrdenn", "Quenn", 0, 0);
            insertQuestionGame2(db, "Jaki był powód utraty przez Geralta srebrnego miecza w prologu?", 0, "Loch", "Saskia", "Letho", 0, 0);

            insertQuestionGame2(db, "Podczas pobytu Geralta w Temerskim lochu 2 strażników grało w kości. Ile orenów wygrał jeden z nich?", 0, "50", "25", "20", 0, 0);
            insertQuestionGame2(db, "Jaki kolor miał piuropusz Chrabiego Etcheverry?", 0, "Czerwony", "Niebieski", "Zielony", 0, 0);
            insertQuestionGame2(db, "Czyi żołnierze udali się z Foltesem po Arjana La Valetta?", 0, "Lorda Souxien", "Lorda Swanna", "Rocha", 0, 0);
            insertQuestionGame2(db, "Gdzie Letho zabił Demawenda?", 0, "W zamku", "W lesie", "Na łodzi", 0, 0);
            insertQuestionGame2(db, "Za kogo podał się Vernon Roche we Flotsam?", 0, "Emchyra", "Zygfryda", "Siebie", 0, 0);
            insertQuestionGame2(db, "Co zrobił Jaskier, że został skazany na śmierc przez Bernarda Loredo?", 0, "Kradzież", "Podpalenie", "Cudzołóstwo", 0, 0);
            insertQuestionGame2(db, "Kto był mistrzem Flotsam w siłowaniu na rękę?", 0, "Maćko", "Joźwik", "Szkuta", 0, 0);
            insertQuestionGame2(db, "Kto był mistrzem kościanego pokera we Flotsam?", 0, "Żegota", "Gauslem", "Szkuta", 0, 0);
            insertQuestionGame2(db, "Kto był mistrzem amatorskich pojedynków w karczmie we Flotsam?", 0, "Naizdup", "Dodo", "Maćko", 0, 0);
            insertQuestionGame2(db, "Jak nazywała się niedoszła narzeczona Zoltana?", 0, "Balbina", "Greta", "Eudora", 0, 0);

            insertQuestionGame2(db, "Jak miał na imię chłop, którego Kejran zaatakował w porcie?", 0, "Sosek", "Mścisław", "Gustaw", 0, 0);
            insertQuestionGame2(db, "Czyją doradczynią była Sheala De Tancarville? ", 0, "Radowida", "Zuleyki", "Demawenda", 0, 0);
            insertQuestionGame2(db, "Kto z Flotsam współpracował z Salamandra?", 0, "Ziggy", "Loredo", "Fogg", 0, 0);
            insertQuestionGame2(db, "Kto sprzedał głowę trollicy Szkucie?", 0, "Dymitr", "Pangrat", "Cedric", 0, 0);
            insertQuestionGame2(db, "Jak ma na imie elfka, która zdradziła Dymitra?", 0, "Eudora", "Malena", "Anezka", 0, 0);
            insertQuestionGame2(db, "Rebis, Aether i Cieniokost to składniki na?", 0, "Krakre", "Samum", "Manguste", 0, 0);
            insertQuestionGame2(db, "Ile królowych Endriag było we Flotsam?", 0, "2", "3", "1", 0, 0);
            insertQuestionGame2(db, "Ile było gniazd Nekkerów we Flotsam?", 0, "3", "4", "5", 0, 0);
            insertQuestionGame2(db, "Kto byl mistrzem podziemnego kręgu we Flotsam?", 0, "Naizdup", "Mitko", "Zdenek", 0, 0);
            insertQuestionGame2(db, "Kto organizował podziemny krąg we Flotsam?", 0, "Loredo", "Ziggy", "Merc", 0, 0);

            insertQuestionGame2(db, "Kto był Elfim szpiegiem we Flotsam?", 0, "Jaskier", "Garwena", "Cedric", 0, 0);
            insertQuestionGame2(db, "Kto jest sołtysem Bindugi?", 0, "Maćko", "Szkuta", "Chorab", 0, 0);
            insertQuestionGame2(db, "Kto był prawą reką Iorwetha?", 0, "Ciaran", "Saskia", "Cedric ", 0, 0);
            insertQuestionGame2(db, "Jaką elfią kobietę porwał Loredo?", 0, "Malene", "Moril", "Milene", 0, 0);
            insertQuestionGame2(db, "Z kim kontaktowała się Yennefer przez megaskop Sheali, gdy pomogliśmy schwytać Iorwetha?", 0, "Filippą", "Saskią", "Deatmoldem", 0, 0);
            insertQuestionGame2(db, "Jak miał na imię szpieg z Keadwen? ", 0, "Malliger", "Bernard", "Dymitr", 0, 0);
            insertQuestionGame2(db, "Dla jakiego kraju Loredo dokonał aktu zdrady?", 0, "Aedirn", "Keadwen", "Redanii", 0, 0);
            insertQuestionGame2(db, "Kto przygarnął dziecko Moril?", 0, "Chorab", "Garwena", "Seheril", 0, 0);
            insertQuestionGame2(db, "Do kogo należy Dolina Pontaru?", 0, "Aedirn", "Kaewen", "Temerii ", 0, 0);
            insertQuestionGame2(db, "Jakie trofeum dawało statystyki: 3 pancerza, 5 obrażeń, 50 zdrowia?", 0, "Elthona", "Kejrana", "Drauga", 0, 0);

            insertQuestionGame2(db, "Ile Macek Kejrana \"najmniej\" trzeba uciąć, żeby dało się go zabić?", 0, "2", "4", "3", 0, 0);
            insertQuestionGame2(db, "Kto umiera podczas negocjacji, jeśli staniemy po stronie Rocha?", 0, "Stennis", "Saskia", "Nikt", 0, 0);
            insertQuestionGame2(db, "Który z tych 3 czarodziejów nigdy nie czaruje magicznej osłony dla Geralta?", 0, "Filippa", "Sheala", "Deatmold", 0, 0);
            insertQuestionGame2(db, "Do czego Henselt przybił Sabrinę Glevissig?", 0, "Drzewa", "Pali", "Koła", 0, 0);
            insertQuestionGame2(db, "Kto dowodził wojskami Henselta podczas bitwy, którą przedwcześnie zakończyła Sabrina Glevissig?", 0, "Vandergrift", "Seltkirk", "Detmold", 0, 0);
            insertQuestionGame2(db, "Kto dowodził wojskami Aedirn podczas bitwy, którą przedwcześnie zakończyła Sabrina Glevissig?", 0, "Vandergrift", "Seltkirk", "Detmold", 0, 0);
            insertQuestionGame2(db, "Komu należało zanieść kwadratową monetę, w celu dostania się do kryjówki spiskowców?", 0, "Karoll", "Sheali", "Zośce", 0, 0);
            insertQuestionGame2(db, "Który spiskowiec dzierżył pancerz Seltkirka?", 0, "Trauta", "Aveta", "Swan", 0, 0);
            insertQuestionGame2(db, "Skąd pochodził Letande'a Aveta - \"Rzeźnik\"", 0, "z Gulety", "z Cidaris", "z Blaviken", 0, 0);
            insertQuestionGame2(db, "Kto był organizatorem walk na arenie w obozie Henselta?", 0, "Aveta", "Trauta", "Proximo", 0, 0);

            insertQuestionGame2(db, "Kto jest mistrzem obozu Kaedwen w siłowaniu na rękę?", 0, "Pangratt", "Mangus", "Numa", 0, 0);
            insertQuestionGame2(db, "Kto był najsilniejszym przeciwnikiem w turnieju Rycerskim?", 0, "Proximo", "Ves", "Aveta", 0, 0);
            insertQuestionGame2(db, "Jak ma na imię natchniony?", 0, "Mangus", "Konrad", "Yahon", 0, 0);
            insertQuestionGame2(db, "Kto jest mistrzem kościanego pokera w obozie Henselta?", 0, "Lasota", "Karoll", "Zyvik", 0, 0);
            insertQuestionGame2(db, "Kto przebił Sabrinę Glevissig??", 0, "Zyvik", "Yahon", "Henselt", 0, 0);
            insertQuestionGame2(db, "Ile zwłok należy spalić w 2 akcie, aby pozbyć się zgnilców?", 0, "3", "5", "9", 0, 0);
            insertQuestionGame2(db, "Kto posiadał sztandar Burej Chorągwi?", 0, "Hennessy", "Yarpen", "Coohorn", 0, 0);
            insertQuestionGame2(db, "Kto posiadał grot z włóczni Yahona?", 0, "Iorweth", "Skalen", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Kto wywiesił \"zlecenie na zgnilce\"?", 0, "Zyvik", "Mangus", "Proximo", 0, 0);
            insertQuestionGame2(db, "Jaki eliksir należało wypic przed rytuałem nekromancji?", 0, "Krakwe", "Jaskółke", "Puszczyk", 0, 0);

            insertQuestionGame2(db, "Kto opiekował się dziecmi Foltesta?", 0, "Natalis", "Brygida", "Meis", 0, 0);
            insertQuestionGame2(db, "Kto był dowódcą spisku przeciwko Henseltowi?", 0, "Attre", "Zyvik", "Roche", 0, 0);
            insertQuestionGame2(db, "Jak ma na imię królobójca zabity przez Sheale?", 0, "Serrit", "Egan", "Letho", 0, 0);
            insertQuestionGame2(db, "Kto może zabić Henselta?", 0, "Letho", "Roche", "Serrit", 0, 0);
            insertQuestionGame2(db, "Kto zgwałcił Ves?", 0, "Detmold", "Loredo", "Henselt", 0, 0);
            insertQuestionGame2(db, "Kto porwał Anais?", 0, "Detmold", "Henselt", "Radowid", 0, 0);
            insertQuestionGame2(db, "Kto planował zamordować dzieci Foltesta?", 0, "Maravel", "Kimbolt", "Henselt", 0, 0);
            insertQuestionGame2(db, "Kto planował zdradę Temerii dla Nilfgardu?", 0, "Kimbolt", "Natalis", "Maravel", 0, 0);
            insertQuestionGame2(db, "Skąd pochodzą rośliny z których zrobiony jest anabolik dla Mocarnego Numy?", 0, "Ellander", "Povis", "Toussaint", 0, 0);
            insertQuestionGame2(db, "Kto jest najlepszym pokerzystą w Loc Muinne?", 0, "Lenner", "Lockhart", "Hadrian", 0, 0);

            insertQuestionGame2(db, "Podczas jakiego zadania, możemy zdobyć rękawice, spodnie i buty starszej krwii?", 0, "Rzeka Tajemnic", "Zaszyfrowany Man.", "Zl. na Gargulce", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji możemy zdobyć zbroję Vranów?", 0, "Rzeka Tajemnic", "Zaszyfrowany Man.", "Lilie i żmije", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji można zdobyć miecz Vranów w scieżce Rocha?", 0, "Lilie i żmije", "Kość z kości", "W imie Temerii!", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji można zdobyć miecz Vranów w scieżce Iorwetha?", 0, "W imię W. Racji", "Łamacz Czarów", "Tajemnice L. M.", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem wiary?", 0, "Medalion Cresta", "Miecz Saski", "Sztandar", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem śmierci?", 0, "Miecz Saski", "Sztandar", "Medalion", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem nienawiści?", 0, "Sztandar", "Medalion", "Miecz Saski", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem odwagi?", 0, "Zbr. Seltkirka", "Miecz Saski", "Sztandar", 0, 0);
            insertQuestionGame2(db, "Kto otruł Saskię?", 0, "Szlachta", "Stennis", "Chłopi", 0, 0);
            insertQuestionGame2(db, "Co jest wystarczającym źródłem magii, które pomoże wyleczyć Saskie?", 0, "Pierścień", "Medalion", "Kryształ snu", 0, 0);

            insertQuestionGame2(db, "Z jakiego materiału była statuetka, w którą zmieniono Triss?", 0, "Nefryt", "Brąz", "Mosiądz", 0, 0);
            insertQuestionGame2(db, "Kto zamienił Triss Merigold w statuetkę?", 0, "Filippa", "Cynthia", "Sheala", 0, 0);
            insertQuestionGame2(db, "Który czarodziej zmieniał się w sowę?", 0, "Sheala", "Deatmold", "Filippa", 0, 0);
            insertQuestionGame2(db, "Kto był starostą Vergen?", 0, "Cecil", "Skalen", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Kto jest zleceniodawcą zabicia królowej harpii?", 0, "Skalen", "Cecil", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Jak nazywał się szlachcic z Vergen rzucający wiedźminowi wyzwanie w walce na pięści dwukrotnie?", 0, "Burton", "Swen", "Silgrat", 0, 0);
            insertQuestionGame2(db, "Kto zabił Baltimora?", 0, "Thorak", "Ele'yas", "Nie wiadomo", 0, 0);
            insertQuestionGame2(db, "Kto jest mistrzem kościanego pokera w Vergen?", 0, "Cecil", "Hagar", "Skalen", 0, 0);
            insertQuestionGame2(db, "Kto jest najwiekszym siłaczem w Vergen?", 0, "Sheldon", "Yarpen", "Skalen", 0, 0);
            insertQuestionGame2(db, "Kto zabijał ludzi z Vergen?", 0, "Ele'yas", "Sukkub", "Demon", 0, 0);


            insertQuestionGame2(db, "Ile gniazd Harpii należy zniszczyć w celu wykonania zlecenia?", 0, "5", "7", "10", 0, 0);
            insertQuestionGame2(db, "Zi, Uddu-ya, Ia Ia, Gat, Exa, Nibbit, Kanpa, Gat, Uddu-Zi. To słowa z języka?", 0, "Elfów", "Krasnoludów", "Vranów", 0, 0);
            insertQuestionGame2(db, "W jakiej misji możemy zdobyć Artefakt Operatora?", 0, "Sprzed Stuleci", "Tajemnice L.M.", "Zaszyfrowany Man.", 0, 0);
            insertQuestionGame2(db, "Jaki jest najsilniejszy srebrny miecz w grze?", 0, "Aerondight", "Addan Deith", "Gynvael Aedd", 0, 0);
            insertQuestionGame2(db, "Ile toksyczności posiada Eliksir Siły Mocarnego Numy?", 0, "25", "75", "50", 0, 0);


/////105


            insertQuestionGame3(db, "Jaką książkę czytała Ciri w śnie Geralta?", 0, "O Ghulach i Alghulach", "O Wilkołakach", "O Potowarch latających", 0, 0);
            insertQuestionGame3(db, "Kto podpalił kuźnię krasnoluda w Białym Sadzie?", 0, "Niepełka", "Willy", "Derwan", 0, 0);
            insertQuestionGame3(db, "Ile korców ziarna zarekwirował dowódca garnizonu w Białym Sadzie?", 0, "30", "40", "50", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię myśliwy z Białego Sadu?", 0, "Mysław", "Dieter", "Peter", 0, 0);
            insertQuestionGame3(db, "Gryf atakujący gniazdo był?", 0, "Samcem", "Samicą", "Nie wiadomo", 0, 0);
            insertQuestionGame3(db, "Jak miała na imię zielarka z Białego Sadu?", 0, "Tamara", "Lenka", "Dieter", 0, 0);
            insertQuestionGame3(db, "Ile batów wymierzył dowódca garnizonu za przyniesienie wadliwego ziarna?", 0, "10", "15", "20", 0, 0);
            insertQuestionGame3(db, "Schematy jakich wiedźmińskich mieczy możemy znaleść w Białym Sadzie?", 0, "Żmiji", "Kota", "Gryfa", 0, 0);
            insertQuestionGame3(db, "Jak miałą na imię ukochana Niellena?", 0, "Hanna", "Anna", "Małgorzata", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Velen w Gwinta?", 0,"Hadka", "Krwawy Baron", "Szkutnik", 0,0);

            insertQuestionGame3(db, "Jakie zwierzę ratuję Keira wieśniakom ze wsi Podgaje?", 0, "Krowe", "Świenie", "Konia", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się miecz Ciri?", 0, "Zirael", "Gvall'ach", "Aerondight", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się koń Ciri?", 0, "Kelpie", "Scylla", "Kujira", 0, 0);
            insertQuestionGame3(db, "Który wojonik dzikiego gonu walczy z Geraltem w kryjówce Crevana?", 0, "Nithral", "Imlerith", "Caranthir", 0, 0);
            insertQuestionGame3(db, "Kto wskazał Geraltowi trop Crevana?", 0, "Keira Metz", "Notatki Hendrika", "Baron", 0, 0);
            insertQuestionGame3(db, "Czego bała się Keira?", 0, "Szczurów", "Ogarów Gonu", "Eredina", 0, 0);
            insertQuestionGame3(db, "Kto był ukochanym Anabelle?", 0, "Graham", "Myszor", "Wojciech", 0, 0);
            insertQuestionGame3(db, "Jakim potworem była Anabelle", 0, "Morową Dziewicą", "Południcą", "Północnicą", 0, 0);
            insertQuestionGame3(db, "Jak miałą na imię żona Barona?", 0, "Anna", "Hanna", "Tamara", 0, 0);
            insertQuestionGame3(db, "Kto udzielił schronienia rodzinie barona?", 0, "Wojciech", "Graham", "Myszor", 0, 0);

            insertQuestionGame3(db, "Jak miał na imię czarodziej z mysiej wieży?", 0, "Aleksander", "Albrich", "Artorius", 0, 0);
            insertQuestionGame3(db, "Jaką chorobą zajmował się Aleksander?", 0, "Catrioną", "Ospą", "Dżumą", 0, 0);
            insertQuestionGame3(db, "Jakie zwierzę miał guślarz?", 0, "Kozę", "Owcę", "Barana", 0, 0);
            insertQuestionGame3(db, "Które z tych dzieci nie przebywało u wiedźm?", 0, "Wojtek", "Karola", "Arek", 0, 0);
            insertQuestionGame3(db, "Co było zapłatą od sołtysa Sztygarów dla Pań?", 0, "Ucho", "Nos", "Palec", 0, 0);
            insertQuestionGame3(db, "Który dzieciak przyjaźnił się z Jankiem?", 0, "Arek", "Gniewko", "Wojtek", 0, 0);
            insertQuestionGame3(db, "Który wojownik gonu zjawił się u wiedźm po Cirillę?", 0, "Imlerith", "Eredin", "Nithral", 0, 0);
            insertQuestionGame3(db, "Jakie jest hasło do Zgniłego Gaju?", 0, "Stara locha powiła warchlaki", "Ku chwale wiecznego ognia", "Sztuka nade wszystko", 0, 0);
            insertQuestionGame3(db, "Jakim przedmiotem można odczarować żonę barona?", 0, "Lalka z Malwą", "Lalka z Włosami", "Lalka z Paciorkiem", 0, 0);
            insertQuestionGame3(db, "Jak miała na imię śniączka z Novigradu?", 0, "Corine", "Condwiramurs", "Felicja", 0, 0);

            insertQuestionGame3(db, "Jak ma na imię pokojówka Baronowej La Valette?", 0, "Molly", "Marabella", "Rose", 0, 0);
            insertQuestionGame3(db, "Co obezwładniło trolla Dijkstry?", 0, "Pleśń Popsa", "Wybuch", "Magia", 0, 0);
            insertQuestionGame3(db, "Gdzie umarł Henckel", 0, "W Burdelu", "W kanałach", "W swoim domu", 0, 0);
            insertQuestionGame3(db, "Ile deserów zaserwowano na przyjęciu u Vegelbudów", 0, "85", "87", "92", 0, 0);
            insertQuestionGame3(db, "Ile Triss ma w talii?", 0, "22 cale", "22,5 cala", "23 cale", 0, 0);
            insertQuestionGame3(db, "Kto zaprowadza Geralta do Radowida?", 0, "Roche", "Jamurlak", "Dijkstra", 0, 0);
            insertQuestionGame3(db, "W jakim banku jest ukryty skarb Dijkstry?", 0, "Kovirskim", "Novigradzkim", "Oxenfurckim", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się łącznik Radowida i Menge? ", 0, "Jamurlak", "Albert", "Rejk", 0, 0);
            insertQuestionGame3(db, "Do której wsi Ves pobiegła z odsieczą?", 0, "Jawornik", "Zalipie", "Konary", 0, 0);
            insertQuestionGame3(db, "Co się stanie, jeśli odbierzemy Iris von Ever różę?", 0, "Umiera", "Nic", "Dopada ją demon", 0, 0);
//   40

            insertQuestionGame3(db, "Jakie było drugie imię  Syanny?", 0, "Rhenawedd", "Marta", "Karolina", 0, 0);
            insertQuestionGame3(db, "Czym zostaje zamordowana Xiężna Anarietta?", 0, "Szpilą", "Bełtem", "Trucizną", 0, 0);
            insertQuestionGame3(db, "Z czego powstawał bimber Regisa?", 0, "Mandragory", "Ranoga", "Pogłosu", 0, 0);
            insertQuestionGame3(db, "1 ofiara Dettlaffa to?", 0, "Crespi", "Ramon du Lac", "Louis de la Croix", 0, 0);
            insertQuestionGame3(db, "Kto prowadził sierociniec w Toussaint?", 0, "Oriana", "Henrietta", "Crespi", 0, 0);
            insertQuestionGame3(db, "Gdzie przetrzymywano Sylvię Annę? ", 0, "Dun Tynne", "Caed Myrkvid", "Vendelle", 0, 0);
            insertQuestionGame3(db, "W jakiej winnicy powstawał Sangreal?", 0, "Castel Ravello", "Pomerol", "Sancerre", 0, 0);
            insertQuestionGame3(db, "Jaki potwór przybył po ręke Dettlaffa do Corvo Bianco?", 0, "Bruxa", "Alpha", "Mula", 0, 0);
            insertQuestionGame3(db, "Zbroja kota jest pancerzem?", 0, "Lekkim", "Średnim", "Ciężkim", 0, 0);
            insertQuestionGame3(db, "Kto malował pod pseudonimem Van Rogh?", 0, "Iris von Everec", "Auguste Benoire", "Henri de Toulouse", 0, 0);
//50
            insertQuestionGame3(db, "Jakie było pierwsze życzenie Olgierda von Everec?", 0, "Dom Borsodych", "Róża Iris", "Uciechy Witolda", 0, 0);
            insertQuestionGame3(db, "Czyje słowa wypowiada Olgierd von Everec przed pojedynkiem z Geraltem?", 0, "Wołodejowskiego", "Kmicica", "Zagłoby", 0, 0);
            insertQuestionGame3(db, "W jakim miejscu rozegrał się finał Serca z Kamienia?", 0, "Św. Lilwani", "Św. Hindar", "Św. Dagona", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się czarodziej koronny Koviru?", 0, "Aamad", "Radeyah", "Maraal", 0, 0);
            insertQuestionGame3(db, "Co jest rozwiązaniem zagadki Gaunter o'Dima?", 0, "Odbicie", "Czas", "Wspomnienia", 0, 0);
            insertQuestionGame3(db, "Kto polował na braci Grossbart?", 0, "Djengo Frett", "Halbjorn", "Hjort ", 0, 0);
            insertQuestionGame3(db, "Jak miała na imię wojowniczka, która nie mogła oddać dziewictwa bedąć niepokonaną?", 0, "Jutta", "Artis", "Cerys", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię przyjaciel Hjalmara, który został uwięziony w klatce podczas polowania na giganta?", 0, "Vigo", "Hjort", "Artes", 0, 0);
            insertQuestionGame3(db, "Kto posiadał kartę z Isengrimem w misji \"Niebezpieczna gra\"?", 0, "Zed", "Ravik", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Kto zostaje ukochanym Keiry?", 0, "Lambert", "Letho", "Eskel", 0, 0);
//60 a
            insertQuestionGame3(db, "Jak ma na imię wilkołak, który pomaga Geraltowi zabić ostatnią wiedźmę?", 0, "Otto", "Berem", "Lilly", 0, 0);
            insertQuestionGame3(db, "Jaka choroba doskwierała krasnoludowi z Wyspy Mgieł?", 0, "Narkolepsja", "Ankylostomoza", "Filarioza", 0, 0);
            insertQuestionGame3(db, "Którą czarodziejke więził Emhyr?", 0, "Margarite Laux-Antille", "Fringillę Vigo", "Scheale De Tancarville", 0, 0);
            insertQuestionGame3(db, "Jaką przykrywkę miał Talar?", 0, "Paser", "Szefc", "Kupiec", 0, 0);
            insertQuestionGame3(db, "Kto uciekł łowcą z więzienia?", 0, "Bilzen", "Abbé Faria", "Ferenc", 0, 0);
            insertQuestionGame3(db, "Który jarl zdradził podczas wojny z Nilfgardem?", 0, "Holger", "Lugos", "Halard", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię przyjaciel Ciri, który jej pomagał w Novigradzie?", 0, "Ferenc", "Valdo", "Ivo", 0, 0);
            insertQuestionGame3(db, "Jak miała na imię przyjaciółka Ciri, która jej pomagała w Novigradzie?", 0, "Vea", "Bea", "Tea", 0, 0);
            insertQuestionGame3(db, "Który z krasnulodów przeżył wyprawę na Wyspę Mgieł?", 0, "Ivo", "Gaspar", "Ferenc", 0, 0);
            insertQuestionGame3(db, "Z kim Geralt negocjował dostawy dla Hattoriego?", 0, "Tasakiem", "Cyną", "Bilzenem", 0, 0);

            insertQuestionGame3(db, "Która wiedźma uciekłą z sabatu?", 0, "Kuchta", "Prządka", "Szepciucha", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się miecz, który Geralt dostaje od Cracha An Craite?", 0, "Ostrze mrozu", "Ostrze zimy", "Ostrze zamieci", 0, 0);
            insertQuestionGame3(db, "Kto przeprowadzał selekcję na Łysej Górze?", 0, "Lilith", "Tekla", "Verna", 0, 0);
            insertQuestionGame3(db, "Kto był zdrajcą na Kaer Trolde?", 0, "Artis", "Arnvald", "Halard", 0, 0);
            insertQuestionGame3(db, "Kto zabił przyjaciela Lamberta?", 0, "Vester", "Tauler", "Ludvik", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię przyjaciel Geralta ze szkoły kota?", 0, "Wolter", "Aiden", "Bjorn", 0, 0);
            insertQuestionGame3(db, "Kto zdradził kryjówkę Letho?", 0, "Vester", "Ludvik", "Tauler", 0, 0);
            insertQuestionGame3(db, "Kto polował na Letho?", 0, "Ludvik", "Vester", "Tauler", 0, 0);
            insertQuestionGame3(db, "Jak ma na imię Avallach?", 0, "Bréacc", "Crevan", "Auberon", 0, 0);
            insertQuestionGame3(db, "Co wytatuowała sobie Ciri?", 0, "Mistle", "Różę", "Jaskółkę", 0, 0);

            insertQuestionGame3(db, "Co wywołało szał bersekerów?", 0, "Siężygron", "Mardroeme", "Kortinarius", 0, 0);
            insertQuestionGame3(db, "Kto rzucił klątwę na Morgvarka?", 0, "Myrrha", "Ulve", "Eurneid", 0, 0);
            insertQuestionGame3(db, "Gdzie Triss chciała zamieszkać z Geraltem?", 0, "w Mariborze", "w Kovirze", "w Nazairze", 0, 0);
            insertQuestionGame3(db, "Kto posiadał kartę z Janem Natalisem w misji \"Niebezpieczna gra\"?", 0, "Ravik", "Zed", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Kto zabija Radowida?", 0, "Roche", "Filippa", "Dijkstra", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się miecz rodowy Udalryka?", 0, "Ashrune", "Brokvar", "Inis", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się brat Udalryka?", 0, "Holgier", "Aki", "Bjorn", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię Skurwiel Junior?", 0, "Cyprian", "Bedlam", "Tauler", 0, 0);
            insertQuestionGame3(db, "Kto poszedł z Geraltem napełniać filakterium?", 0, "Eskel", "Lambert", "Vesemir", 0, 0);
            insertQuestionGame3(db, "Kto chciał się ścigać z Geraltem do topora?", 0, "Hjalmar", "Cerys", "Lugos Siny", 0, 0);

            insertQuestionGame3(db, "Jaka była druga ofiara Dettlaffa?", 0, "Vladimir Crespi", "Ramon du Lac","Louis de la Croix", 0, 0);
            insertQuestionGame3(db, "Jaka była trzecia ofiara Dettlaffa?", 0, "Ramon du Lac", "Louis de la Croix", "Vladimir Crespi", 0, 0);
            insertQuestionGame3(db, "Z którego rocznika pochodził Sangreal ukradziony przez Sylvię Annę?", 0, "1267", "1269", "1271", 0, 0);
            insertQuestionGame3(db, "Kto przybył po Geralta do Velen?", 0, "Milton i Crespi", "Palmerin i Milton", "Palmerin i Crespi", 0, 0);
            insertQuestionGame3(db, "Jakie potwory strzegły domu Wichta?", 0, "Upiory", "Barghesty", "Trupojady", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się Arcymistrz kowalstwa?", 0, "Cresp", "Zdravko", "Willy", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się Bohater Narodowy Toussaint?", 0, "Toricello", "Reginald", "Vitis Vinifera", 0, 0);
            insertQuestionGame3(db, "Jak miał na imię Wicht?", 0, "Vinifera", "Marlena", "Romuald", 0, 0);
            insertQuestionGame3(db, "Jaką toksyczność posiada eliksir kot?", 0, "10", "15", "20", 0, 0);
            insertQuestionGame3(db, "Jaką toksyczność posiada eliksir jaskółka?", 0, "15", "20", "25", 0, 0);
//100
            insertQuestionGame3(db, "Jakie było drugie życzenie Olgierda?", 0, "Dom Borsodych", "Uciechy Olgierda", "Róża Iris", 0, 0);
            insertQuestionGame3(db, "Jak nazywała się miłość Guillaume de Launfala?", 0, "Pinastri", "Vivienne de Tabris", "Matylda de Vermentino", 0, 0);
            insertQuestionGame3(db, "Jaką toksyczność posiadają odwary?", 0, "65", "70", "75", 0, 0);
            insertQuestionGame3(db, "Kto nałożył klątwę \"Nithilu\" na Lobarta?", 0, "Jutta", "Jona", "Julia", 0, 0);
            insertQuestionGame3(db, "Kogo ratujemy w kasynie Skurwiela Juniora?", 0, "Augusta", "Rico", "Williama", 0, 0);
            insertQuestionGame3(db, "Kto groził Zoltanowi podczas gdy ten zbierał kolekcję kart?", 0, "August", "Diuk", "Cyna", 0, 0);
            insertQuestionGame3(db, "Kto jest właścicielem trupy teatralnej z Novigradu?", 0, "Maxim Boliere", "Irina Renarde", "Abelard Rizza", 0, 0);
            insertQuestionGame3(db, "Nieopodal jakiej wsi Gascoigne okrada Geralta?", 0, "Rudnik", "Jantra", "Dobrowa", 0, 0);
            insertQuestionGame3(db, "Kto wyciera Yennefer z wymiocin, gdy Geralt związał się z Triss?", 0, "Lambert", "Eskel", "Vesemir", 0, 0);
            insertQuestionGame3(db, "Z jakiego plemienia pochodzi Regis?", 0, "Tdet", "Gharasham", "Ammurun", 0, 0);
//110

            insertQuestionGame3(db, "Co oznacza skrót D.L.C?", 0, "Data Link Control", "De La Croix", "Digital Loop Carrier", 0, 0);
            insertQuestionGame3(db, "Zbroja Gryfa to pancerz?", 0, "Lekki", "Średni", "Ciężki", 0, 0);
            insertQuestionGame3(db, "Jaki bank występuje w Toussaint", 0, "Kovirski", "Chaintanellich", "Vivaldich", 0, 0);
            insertQuestionGame3(db, "Jak nazywa się miecz od Pani Jeziora?", 0, "An'ferthe", "Aerondight", "Addan Deith", 0, 0);
            insertQuestionGame3(db, "Który odwar pomaga w walce z upiorami?", 0, "z Upiora", "Łagodziciela", "z Południcy", 0, 0);
            insertQuestionGame3(db, "Który odwar zwiększa siłę ataku?", 0, "z Nekkera", "z Sukkuba", "z Gryfa", 0, 0);
            insertQuestionGame3(db, "Który odwar zwiększa czasowo maksymalną żywotnosc po zabójstwie?", 0, "z Gryfa", "z Północnicy", "z Upiora", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Novigradu w Gwinta?", 0, "Dijkstra", "Elf", "Vivaldi", 0, 0);
            insertQuestionGame3(db, "Jaką toksysyczność posiada Filtr Petriego?", 0, "20", "25", "30", 0, 0);
            insertQuestionGame3(db, "Ile Emhyr zapłacił Geraltowi za przyprowadzewnie Cirilli, nie wliczając w to wekslu?", 0, "2000 florenów", "4000 florenów", "5000 florenów", 0, 0);
//120 b

            insertQuestionGame3(db, "Kogo ratowała Triss podczas balu?", 0, "Luka", "Patricka", "Alberta", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się okręt Wolverstona?", 0, "Velos", "Esmeralda", "Atropos", 0, 0);
            insertQuestionGame3(db, "Z kim Geralt pobił się na przyjęciu u Cracha?", 0, "Eyvindem", "Hjalborem", "Lugosem", 0, 0);
            insertQuestionGame3(db, "Co otwierało przejście do pracowni Myszowora?", 0, "Szyszka", "Czaszka", "Kielich", 0, 0);
            insertQuestionGame3(db, "Na której wyspie pojawił się gigant?", 0, "Faroe", "Spikeroog", "Undvik", 0, 0);
            insertQuestionGame3(db, "Gdzie na skellige nie pojawił się dziki gon?", 0, "Hindersfall", "Ard Skellige", "Faroe", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się koń Eskela?", 0, "Pegaz", "Cantarella", "Wojsiłek", 0, 0);
            insertQuestionGame3(db, "Kto polował z Geraltem na Widłogony?", 0, "Lambert", "Vesemir", "Eskel", 0, 0);
            insertQuestionGame3(db, "Co dręczyło Udalryka?", 0, "Brat Aki", "Upiór", "Him", 0, 0);
            insertQuestionGame3(db, "Kto wyczekiwał na białego wieloryba?", 0, "Egil", "Hjalbor", "Eyvind", 0, 0);

            insertQuestionGame3(db, "Gdzie można było znaleść notatki Berengara?", 0, "Kuchnia", "Dormitoria", "Zachodnia część dziedzińca", 0, 0);
            insertQuestionGame3(db, "Kto był mistrzem kowalstwa?", 0, "Yoana", "Zdravko", "Hattori", 0, 0);
            insertQuestionGame3(db, "Kto był mistrzem płatnerstwa?", 0, "Zdravko", "Hattori", "Yoana", 0, 0);
            insertQuestionGame3(db, "Jaki potwór nie występował zadaniu \"Najgroźniejszy potwór na Skellige\"?", 0, "Doppler", "Bożątko", "Sukkub", 0, 0);
            insertQuestionGame3(db, "U jakiego druida zdajemy \"Egzamin z alchemii\"?", 0, "Egila", "Eyvida", "Gremisty", 0, 0);
            insertQuestionGame3(db, "Kogo prześladował pokutnik? ", 0, "Jorunda", "Egila", "Mikkjala", 0, 0);
            insertQuestionGame3(db, "Czym musiał zjeść posiłek wicht, aby zdjąć klątwę?", 0, "Widelcem", "Łyżką", "Bez niczego", 0, 0);
            insertQuestionGame3(db, "Kogo uratował Geralt przed ożywionymi rzeźbami, zadaniu pt. \"Rekonstrukcja\"?", 0, "Maxima", "Gastoma", "Duranda", 0, 0);
            insertQuestionGame3(db, "Gdzie miałą miejsce kryjówka Regisa?", 0, "w Mont Crane", "w Termes", "w Mere Lachaise", 0, 0);
            insertQuestionGame3(db, "Gdzie uwięziono Khagmara?", 0, "w Termes", "w Mere Lachaise", "w Tesham Mutna", 0, 0);

            insertQuestionGame3(db, "Kto nie walczył z Szarleyem?", 0, "Palmerin", "Milton", "Guillaume", 0, 0);
            insertQuestionGame3(db, "Kto walczył z Goliatem?", 0, "Dejmien", "Crespi", "Guillaume de Launfal", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się majordomus w Corvo Bianco?", 0, "Clemente-Basile", "Ademar-Basile", "Barnabe-Basile", 0, 0);
            insertQuestionGame3(db, "Kto jest twórcą Pogłosu?", 0, "Szezlock", "Moreau", "Covinarius", 0, 0);
            insertQuestionGame3(db, "Kto stworzył maszynę wzmacniającą wiedźmińskie mutacje?", 0, "Covinarius", "Szezlock", "Moreau", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się uczony, ktory odkrył sekret Pana Lusterko?", 0, "Ademar-Basile", "Covinarius", "Szezlock", 0, 0);
            insertQuestionGame3(db, "Z jakiego materiału był wykonany dar dla Ukrytego?", 0, "Szmaragdu", "Nefrytu", "Haaklandzkiego aragonitu", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Skellige w Gwinta?", 0, "Crach an Craite ", "Lugos", "Sjusta", 0, 0);
            insertQuestionGame3(db, "Zbroja niedźwiedzia to pancerz?", 0, "Lekki", "Średni", "Cieżki", 0, 0);
            insertQuestionGame3(db, "Który eliksir poprawia refleks?", 0, "Wilga", "Wierzba", "Zamieć", 0, 0);

            insertQuestionGame3(db, "Gdzie przebywał Hendrik?", 0, "Konary", "Podlipie", "Wrzosowa", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się druid ślubujący milczenie?", 0, "Eyvind", "Hjalbor", "Egil", 0, 0);
            insertQuestionGame3(db, "4 ofiara Dettlaffa to?", 0, "Ramon du Lac", "Louis de la Croix", "Milton de Peyrac-Peyran ", 0, 0);
            insertQuestionGame3(db, "5 ofiara Dettlaffa z listy to?", 0, "Vladimir Crespi", "Ramon du Lac", "Xiężna Anarietta", 0, 0);
            insertQuestionGame3(db, "Kto posiadał kartę Fringilli Vigo w misji pt. \"Niebezpieczna gra\"??", 0, "Ravik", "Zed", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Na jakiej wyspie Ulle jest mistrzem areny?", 0, "Faroe", "Ard Skellige", "Spikeroog", 0, 0);
            insertQuestionGame3(db, "Jaki potwór zalągł się w misji pt. \"Przeklęty magazyn\"?", 0, "Sukkub", "Upiór", "Nekker", 0, 0);
            insertQuestionGame3(db, "Jaki potwór zalągł się w misji pt. \"Nawiedzony dom\"?", 0, "Sukkub", "Nekker", "Bożątko", 0, 0);
            insertQuestionGame3(db, "Do kogo należał Folwark, na którym skrywał się Letho?", 0, "Vestera", "Ludvika", "Dolores", 0, 0);
            insertQuestionGame3(db, "Kto podkładał głos pod Cirillę?", 0, "Beata Jewiarz", "Agnieszka Kunikowska", "Anna Cieślak", 0, 0);
//160
            insertQuestionGame3(db, "Kto podkładał głos pod Geralta?", 0, "Grzegorz Kwiecień", "Lesław Żurek", "Jacek Rozenek", 0, 0);
            insertQuestionGame3(db, "Jaka jest data premiery gry?", 0, "13 Marca 2015", "27 Kwietnia 2015", "18 maja 2015", 0, 0);
            insertQuestionGame3(db, "Dla kogo poszukiwaliśmy czarnej perły?", 0, "Zed", "Ravik", "Nidas", 0, 0);
            insertQuestionGame3(db, "Który odwar regeneruje żywotność?", 0, "z Południcy", "z Gryfa", "z Ekimmy", 0, 0);
            insertQuestionGame3(db, "Który odwar odbija część obrażeń?", 0, "z Gryfa", "z Ekimmy", "z Leszego", 0, 0);
            insertQuestionGame3(db, "Który odwar zwiększa szansę na krytyczne uderzenie?", 0, "z Ekimmy", "z Leszego", "z Katakana", 0, 0);
            insertQuestionGame3(db, "Który eliksir zwiększa odporność na zatrucia?", 0, "Orka", "Wierzba", "Wilga", 0, 0);
            insertQuestionGame3(db, "Który eliksir zwiększa ilość tlenu w płucach?", 0, "Wilga", "Północ", "Orka", 0, 0);
            insertQuestionGame3(db, "Ile występuje \"stopni\" eliksirów?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame3(db, "Ile wynosi toksyczność Dekoktu Raffarda Białego?", 0, "20", "25", "30", 0, 0);

            insertQuestionGame3(db, "Kto posyła Geralta do jaskini snów?", 0, "Jorund", "Eyvind", "Lugos", 0, 0);
            insertQuestionGame3(db, "Kto był seryjnym mordercą z Novigradu?", 0, " Joris Aquinus", "Nataniel", "Hubert Rejk", 0, 0);
            insertQuestionGame3(db, "Komu na skradziono \"Bardzo cenny róg\"?", 0, "Jorundowi", "Rejkowi", "Mathiosowi", 0, 0);
            insertQuestionGame3(db, "W jakiej wiosce występuje zadanie pt \"Nieproszeni goście\"?", 0, "Sztygary", "Konary", "Carsten", 0, 0);
            insertQuestionGame3(db, "Gdzie Yennefer chce się spotkać w Geraltem po wizycie na Hindersfall?", 0, "Kaer Trolde", "Lofoten", "Larvik", 0, 0);
            insertQuestionGame3(db, "Czym instruktorem szermierki zostaje Geralt?", 0, "Henrego", "Edny", "Rosy", 0, 0);
            insertQuestionGame3(db, "Gdzie za młodu więziono Syjanę?", 0, "W lochu", "W komnacie", "W krainie czarów", 0, 0);
            insertQuestionGame3(db, "Co było trzecim życzeniem Olgierda?", 0, "Dom Bordodych", "Uciechy Witolda", "Róża Iris", 0, 0);
            insertQuestionGame3(db, "Kto pomaga Geraltowi w skoku na Borsodych?", 0, "Maksymilian", "Horst", "Ewald", 0, 0);
            insertQuestionGame3(db, "Co wylewał pucybut, aby przyciągnąć do siebie więcej klientów?", 0, "Ścieki", "Szczochy", "Pomyje", 0, 0);

            insertQuestionGame3(db, "Vivienne przemieniała się w ludzkich rozmiarów?", 0, "Kormorana", "Surykatkę", "Wilgę", 0, 0);
            insertQuestionGame3(db, "Jak nazywał się wiedźmin ze szkoł kota, który wymordował całą wieś?", 0, "Brehen", "Merten", "Gaetan", 0, 0);
            insertQuestionGame3(db, "W jakiej wsi można było postkac \"fałszywego wiedźmina\"?", 0, "Dobrowo", "Rudnik", "Zalipie", 0, 0);
            insertQuestionGame3(db, "Jaką toksyczność posiada Las Mariborski?", 0, "30", "25", "20", 0, 0);




//184


            insertQuestionBook1(db, "Kto był zdrajcą na tronie Foltesta?", 0, "Ostrit", "Tailles", "Anais", 0, 0);
            insertQuestionBook1(db, "Kim była Adda?", 0, "Córką Foltesta", "Kochanką Geralta", "Czarodziejką", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobił Addzie, zanim zemdlał?", 0, "Ugryzł", "Uderzył", "Kopnął", 0, 0);
            insertQuestionBook1(db, "Kim był Velerad?", 0, "Grododzierżcą", "Doradcą króla", "Kupcem", 0, 0);
            insertQuestionBook1(db, "Ilu ludzi zabił Geralt w karczmie w opowiadaniu pt. \"Wiedźmin\"?", 0, "3", "4", "5", 0, 0);
            insertQuestionBook1(db, "W jakim miejscu zazwyczaj leczył się Geralt, między innymi po walce ze Strzygą?", 0, "W Św. Melitelle", "U uzdrowicieli",  "W szpitalu", 0, 0);
            insertQuestionBook1(db, "Ile wynosiła nagroda za odczarowanie strzygi według królewskiego orędzia?", 0, "3000 orenów ", "3500 orenów", "4000 orenów", 0, 0);
            insertQuestionBook1(db, "Co było przyczyną klątwy Addy?", 0, "Kazirodztwo", "Cudzołóstwo", "Krzywoprzysięstwo", 0, 0);
            insertQuestionBook1(db, "Na jakim zamku królowała Strzyga?", 0, "Dworzyszcze", "Attre", "Starogrodź", 0, 0);
            insertQuestionBook1(db, "Jakim pańswem rządzi Foltest?", 0, "Temerią", "Keadwen", "Redanią", 0, 0);
// Wiedzmin - a

            insertQuestionBook1(db, "Przez ilę lat strzyga zabijała niewinnych?", 0, "6", "9", "2", 0, 0);
            insertQuestionBook1(db, "Kto przeżył atak strzygi?", 0, "Młynarz", "Kupiec", "Kowal", 0, 0);
            insertQuestionBook1(db, "Dlaczego ludzie nie lubią Rivów? Według nich \"Każdy Riv to...\"?", 0, "Złodziej", "Ćpun", "Kłamca", 0, 0);
            insertQuestionBook1(db, "W jakich okolicznościach poznali się Geralt i Velerad?", 0, "Geralt zabił ludzi", "W Brokilonie", "Na rozdrożu", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobił z nagrodą za strzygę?", 0, "Oddał Yennefer", "Kupił miecz", "Kupił konia", 0, 0);
            insertQuestionBook1(db, "Kogo Geralt wykorzystał jako przynętę na strzyge?", 0, "Ostrita", "Eista", "Tailles'a ", 0, 0);
            insertQuestionBook1(db, "Do jakiej karczmy nie chciał udać się Geralt w opowiadaniu pt. \"Wiedźmin\"?", 0, "Stary Narakort", "Nowy Narakort", "Pod Lisem", 0, 0);
            insertQuestionBook1(db, "Kto chciał przepędzić Geralta ze świątyni Melitelle?", 0, "Tailles i Falwick", "Tailles i Jarre", "Falwick i Regner", 0, 0);
            insertQuestionBook1(db, "Jak nazywa się kapłanka ze świątyni Melitelle, która ślubowała milczenie?", 0, "Iola Pierwsza", "Eurneid", "Myrrha", 0, 0);
            insertQuestionBook1(db, "Co groziło Geraltowi za zabicie strzygi?", 0, "Nic", "Śmierć", "Wygnanie", 0, 0);

            insertQuestionBook1(db, "Jak nazywała się \"prawdziwa miłość\" Nivellena?", 0, "Vereena", "Asse", "Reef", 0, 0);
            insertQuestionBook1(db, "Dlaczego kupcy oddawali swoje córki Nivellenowi?", 0, "Dla bogactw", "Ze strachu", "Porywał je", 0, 0);
            insertQuestionBook1(db, "Jaką moc posiadał Nivellen?", 0, "Kontrola domu", "Niewidzialność", "Latał", 0, 0);
            insertQuestionBook1(db, "Dlaczego Nivellen został przeklęty?", 0, "Za gwałt", "Za kradzież", "Za Morderstwo", 0, 0);
            insertQuestionBook1(db, "Kapłankę jakiej świątni zgwałcił Nivellen?", 0, "Coram Agh Tera", "Addan Deith", "Deithwen", 0, 0);
            insertQuestionBook1(db, "Kim okazała się ostatnia kochanka Nivellena?", 0, "Bruxą", "Alpą", "Rusałką", 0, 0);
            insertQuestionBook1(db, "Co spowodało zdjęcie klątwy z Nivellena?", 0, "Wyznanie miłości", "Śmierć Bruxy", "Rytuał Geralta", 0, 0);
            insertQuestionBook1(db, "Jakie kwiaty Nivellen chodował pod domem?", 0, "Róże z Nazairu", "Płatki zimejki", "Owoce balissy", 0, 0);
            insertQuestionBook1(db, "Komu Nivellen zawdzięczał ratunek?", 0, "Geraltowi", "Veerenie", "Ojcu", 0, 0);
            insertQuestionBook1(db, "Co spododowało, że Geralt odwiedził Nivellena?", 0, "Zwłoki", "Medalion drgał", "Zabłądził", 0, 0);
// Ziarno prawdy - a

            insertQuestionBook1(db, "Jak nazywał się wójt Blaviken?", 0, "Kayleigh", "Caldemeyn", "Fercart", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobił, że Libusze sie go bała?", 0, "Zabił ludzi", "Zabił szczura", "Był wiedźminem", 0, 0);
            insertQuestionBook1(db, "Co zrobił Tales podczas rozmowy z Geraltem i Nenneke?", 0, "Uderzył Nenneke", "Rzucił rękawicą", "Zranił się", 0, 0);
            insertQuestionBook1(db, "Jak na prawdę nazywał się mistrz Irion z opowiadania pt \"Mniejsze zło\"?", 0, "Radcliffe", "Stregobor", "Irion", 0, 0);
            insertQuestionBook1(db, "Jak ma na imię dzierzba?", 0, "Falka", "Renfri", "Reef", 0, 0);
            insertQuestionBook1(db, "Kto polował na dzieci dotknięte \"klątwą czarnego słońca\"?", 0, "Falka", "Stregobor", "Renfri", 0, 0);
            insertQuestionBook1(db, "Jakiego potwora zabił Geralt w Blaviken?", 0, "Kuroliszka", "Kikimorę", "Vivernę", 0, 0);
            insertQuestionBook1(db, "Jak nazywał się mag, który wymyślił przekleństwo czarnego słońca?", 0, "Stregobor", "Eldibald", "Radcliffe", 0, 0);
            insertQuestionBook1(db, "Kogo miały sprowadzic kobiety z przeklęnstwa czarnego słońca?", 0, "Tamiela", "Lilit", "Berith", 0, 0);
            insertQuestionBook1(db, "Kim była Marilka?", 0, "Rybaczką", "Córką Caldemeyna", "Handlarką", 0, 0);

            insertQuestionBook1(db, "Jaki tytuł nadano Geraltowi w opowiadaniu pt. \"Mniejsze zło\"?", 0, "Biały Wilk", "Rzeźnik z Blaviken", "Gwynbleidd", 0, 0);
            insertQuestionBook1(db, "Jaki był pierwszy zabity przez Geralta potwór?", 0, "Topielec", "Człowiek", "Mantikora", 0, 0);
            insertQuestionBook1(db, "Jakie ultimatum chciała zastosować Renfri?", 0, "Mizozeńskie", "Tridamskie", "Vergeńskie", 0, 0);
            insertQuestionBook1(db, "Jaką nagrodę otrzymał Geralt za uratowanie mieszkańców Blaviken?", 0, "Złoto", "Kamień w łeb", "Miecz", 0, 0);
            insertQuestionBook1(db, "Jak miała na imię macocha Renfrii?", 0, "Dorren", "Aridea", "Asse", 0, 0);
            insertQuestionBook1(db, "Czy istnieje wiedźmiński kodeks?", 0, " Zależy od szkoły", "Nie", "Tak ", 0, 0);
            insertQuestionBook1(db, "Jak Geralt zareagował na próbe zabrania zwłok Renfri?", 0, "Nie było go", "Zabronił", "Pozwolił", 0, 0);
            insertQuestionBook1(db, "Gdzie Geralt nocował w Blaviken?", 0, "W knajpie", "U wójta", "W lesie", 0, 0);
            insertQuestionBook1(db, "Kto przygarnął Renfri, gdy ta uciekła z domu?", 0, "Elfy", "Gnomy", "Krasnoludy", 0, 0);
            insertQuestionBook1(db, "Jaki tytuł szlachecki nosi Renfri?", 0, "Markiza", "Księżniczka", "Baronowa", 0, 0);
//mniejsze zło - b

            insertQuestionBook1(db, "Jaki przydomek ma Calanthe?", 0, "Pazur", "Lwica", "Lwiątko", 0, 0);
            insertQuestionBook1(db, "Czyje zaślubiny odbyły się w Cintrze, gdy Geralt był gościem?", 0, "Calanthe", "Pavetty", "Adalii", 0, 0);
            insertQuestionBook1(db, "Jak przedstawiał się Geralt na zaślubinach w Cintrze?", 0, "Geralt z Rivii", "Ravix z 4-rogu", "Cahir", 0, 0);
            insertQuestionBook1(db, "Jak ma na imię Jeż z Erlenwaldu?", 0, "Regner", "Duny", "Draig", 0, 0);
            insertQuestionBook1(db, "Po co Geralt został wezwany na ucztę w Cintrze? Aby?", 0, "Zabić potwora", "Zabić Jeża", "Chronić Calanthe", 0, 0);
            insertQuestionBook1(db, "Na czyje zlecenie Geralt miał dokonać zabójstwa podczas zaślubin?", 0, "Myszowora", "Calanthe", "Regnera", 0, 0);
            insertQuestionBook1(db, "Co spowodowało odczarowanie klątwy Jeża z Erlenwaldu?", 0, "Eliksir", "Wydanie Pavetty", "Rytuał wiedźmina", 0, 0);
            insertQuestionBook1(db, "Kim jest Pavetta?", 0, "Matką Calanthe", "Córką Calanthe", " Babcią Cirilli", 0, 0);
            insertQuestionBook1(db, "Kogo poślubiła Calanthe?", 0, "Cracha", "Eista", "Dunego", 0, 0);
            insertQuestionBook1(db, "Jak nazywał się zmarły mąż Calanthe?", 0, "Eist", "Regner", "Vizimir", 0, 0);

            insertQuestionBook1(db, "Kogo uratował Jeż z Erlenwaldu?", 0, "Eista", "Regnera", "Calanthe", 0, 0);
            insertQuestionBook1(db, "Czego domagał się Dunny podczas zaślubin w Cintrze?", 0, "Złota", "Pavetty", "Ziem", 0, 0);
            insertQuestionBook1(db, "Pavetta potrafiła posługiwać się magią?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook1(db, "Kto grał podczas zaślubin w Cintrze?", 0, "Jaskier", "Drogodar", "Essi Daven", 0, 0);
            insertQuestionBook1(db, "Gdzie odbyła się 1 bitwa królowej Calanthe?", 0, "Pod Jarugą", "Chocieborz", "Sodden", 0, 0);
            insertQuestionBook1(db, "Jak nazywał się kasztelan z Cintry?", 0, "Myszowór", "Haxo", "Maćko", 0, 0);
            insertQuestionBook1(db, "Jak nazywał się druid ze Skellige, obecny podczas zaślubin Pavetty?", 0, "Draig Bon-Dhu", "Myszowór", "Drogodar", 0, 0);
            insertQuestionBook1(db, "Kiedy Duny tracił objawy klątwy?", 0, "Po 22:00", "Po 24:00", "Po 01:00", 0, 0);
            insertQuestionBook1(db, "Kto miał planowo poślubić Pavette?", 0, "Eist", "Crach", "Duny", 0, 0);
            insertQuestionBook1(db, "Czego zażądał Geralt jako zaplaty od Dunego?", 0, "Konia", "Prawa Niespodzianki", "Złota", 0, 0);
//Kwiestnia Ceny - b

            insertQuestionBook1(db, "Co ukrywał za atlasem Jaskier podczas nauki w Oxenfurcie?", 0, "Lutnię", "Brudnopis", "Alkohol", 0, 0);
            insertQuestionBook1(db, "Dlaczego Geralt pojechał na kraniec świata?", 0, "Szukał Jaskra", "Szukał Yennefer", "Szukać pracy", 0, 0);
            insertQuestionBook1(db, "Kto towarzyszył Geraltowi w Dol Blanthana?", 0, "Yennefer", "Zoltan", "Jaskier", 0, 0);
            insertQuestionBook1(db, "Kto wynajął Geralta w Dol Blanthana?", 0, "Maćko", "Dhun", "Pokrzywka", 0, 0);
            insertQuestionBook1(db, "Jak miał na imię Diaboł?", 0, "Galarr", "Dhun", "Torque", 0, 0);
            insertQuestionBook1(db, "Jakim potworem był tak na prawdę diaboł?", 0, "Trollem", "Demonem", "Silvanem", 0, 0);
            insertQuestionBook1(db, "Kto zniszczył lutnię Jaskra w Dolinie Kwiatów?", 0, "Torque", "Galarr", "Toruviel", 0, 0);
            insertQuestionBook1(db, "Gdzie przebywał diaboł? ", 0, "W lesie", "W górach", "W polu konopii", 0, 0);
            insertQuestionBook1(db, "Dlaczego Geralt nie zabił Silvana?", 0, "Przez elfy", "Zgubił miecz", "Był rozumny", 0, 0);
            insertQuestionBook1(db, "Skąd diaboł wziął żelazne kulki?", 0, "Ukradł", "Od elfów", "Od chłopów", 0, 0);

            insertQuestionBook1(db, "Kto umiał czytać starą księge z krańca świata?", 0, "Dhun", "Galarr", "Babka", 0, 0);
            insertQuestionBook1(db, "Kim była Lille?", 0, "Elfem", "Południcą", "Panną Polną", 0, 0);
            insertQuestionBook1(db, "Kto porwał i chciał zabić wiedźmina podczas Walki z Torque?", 0, "Żywia", "Najemnicy", "Elfy", 0, 0);
            insertQuestionBook1(db, "Kim był Fillavandrel?", 0, "Potworem", "Elfim posłańcem", "Królem elfów", 0, 0);
            insertQuestionBook1(db, "Kto uratował życie Geralta i Jaskra, przed egzekucją elfów?", 0, "Torque", "Chłopi", "Żywia", 0, 0);
            insertQuestionBook1(db, "Dlaczego torque kradł zboże?", 0, "Był głodny", "Był złośliwy", "Dla elfów", 0, 0);
            insertQuestionBook1(db, "Od kogo Jaskier otrzymał elfią lutnię?", 0, "Od Torque", "Od Galarra", "Od Filavandrela", 0, 0);
            insertQuestionBook1(db, "Co Geralt wziął jako nagrodę, za przepędzenie diaboła?", 0, "Tylko złoto", "Konia", "Księgę", 0, 0);
//Kraniec swiata - c
            insertQuestionBook1(db, "Co robili Geralt i Jaskier, gdy znaleźli Dżina?", 0, "Brali kąpiel", "Szukali Dżina", "Łowili Ryby", 0, 0);
            insertQuestionBook1(db, "Jak brzmiało pierwsze życzenie Geralta?", 0, "Yennefer", "Chcę spokoju", "\"Idź i wyr. się sam\"", 0, 0);

            insertQuestionBook1(db, "Jak brzmiało drugie życzenie Geralta?", 0, "\"Idź i wyr. się sam\"", "Spokój od Jaskra", "\"Żebyś pękł skur.\"", 0, 0);
            insertQuestionBook1(db, "Jak brzmiało ostatnie życzenie Geralta?", 0, "\"Idź i wyr. się sam\"", "\"Żebyś pękł skur.\"", "Yennefer", 0, 0);
            insertQuestionBook1(db, "Kto zaatakował Jaskra w opowiadaniu pt. \"Ostatnie życzenie\"?", 0, "Yennefer", "Utopiec", "D'jinni", 0, 0);
            insertQuestionBook1(db, "Jak nazywał się elfi medyk zakochany w Yennefer?", 0, "Nevile", "Errdil", "Chireadan", 0, 0);
            insertQuestionBook1(db, "W czyim domu mieszkała Yennefer, kiedy poznała się z Geraltem?", 0, "Chireadana", "Nevile", "Berranta", 0, 0);
            insertQuestionBook1(db, "Jakie jest niespełnione, największe marzenie Yennefer?", 0, "Potęga", "Sława", "Płodność", 0, 0);
            insertQuestionBook1(db, "W jakiej miejscowości Geralt poznał Yennefer?", 0, "W Wyzimie", "W Vengerbergu", "W Rinde", 0, 0);
            insertQuestionBook1(db, "Co przyniósł Geralt Yennefer podczas 1 spotkania?", 0, "Pieczęć dżina", "Pieniądze", "Sok jabłkowy", 0, 0);
            insertQuestionBook1(db, "Jaki zapach można było wyczuć od Yennefer?", 0, "Frezji i Morel", "Lilli i Fiołków", " Bzu i Agrestu", 0, 0);
            insertQuestionBook1(db, "Co zrobiła Yennefer po zobaczeniu Geralta  w swojej sypialni?", 0, "Wyprosiła gości", "Wysłała go po sok", "Zaatakowała go", 0, 0);

            insertQuestionBook1(db, "Za co Geralt trafił do lochu w Rinde?", 0, "Włamanie", "Kradzież", "Napaść na rajców", 0, 0);
            insertQuestionBook1(db, "Kto teleportował Geralta do mieszkania Yennefer w celu ratowania miasta?", 0, "Errdil", "Neville", "Krepp", 0, 0);
            insertQuestionBook1(db, "Dlaczego każdy wyśmiewał egzorcyzm Geralta?", 0, "Przekręcał go", "Był amatorski", "Był wulgarny", 0, 0);
            insertQuestionBook1(db, "Kogo Geralt sprał pasem po dupie?", 0, "Kupca", "Młynarza", "Aptekarza", 0, 0);
            insertQuestionBook1(db, "Dlaczego współ-więźniowie nie chcieli rozmawiać z Geraltem?", 0, "Był wiedźminem", "Pobił ich", "Był politycznym", 0, 0);
            insertQuestionBook1(db, "Kto nazwał Yennefer - \"Yen\", jako pierwszy w historii?", 0, "Istredd", "Triss", "Geralt", 0, 0);
            insertQuestionBook1(db, "Dlaczego Cranmer zlekceważył rozkazy Falwicka?", 0, "Miał innego szefa", "Bał się Geralta", "G. nie złamał umowy", 0, 0);

//107

// Miecz przeznaczenia

//Granica możliwości

            insertQuestionBook2(db, "Jak przedstawia sie ludziom Villentretenmerth?", 0, "Borch 3 Kawki", "Dorregaray", "Nohorn", 0, 0);
            insertQuestionBook2(db, "Jak miały na imię pomocniczki Villentretenmertha?", 0, "Tea i Vea", "Cori i Nori", "Nina i Ida", 0, 0);
            insertQuestionBook2(db, "Na jakiego potwora polował wiedźmin, gdy uznano go za zmarłego i próbowano go obrabować?", 0, "Bazyliszka", "Vivernę", "Kuroliszka", 0, 0);
            insertQuestionBook2(db, "Do jakiej oberży zaprosił Geralta Borh?", 0, "Pod Zadumanym Smokiem", "Pod Skrzydłami Viverny", "Pod Urokiem Bazyliszka", 0, 0);
            insertQuestionBook2(db, "Na jakie smoki Geralt nie poluje?", 0, "Żadne", "Złote", "Zielone", 0, 0);
            insertQuestionBook2(db, "Który król chciał upolować smoka?", 0, "Niedamir", "Gyllenstiern", "Vyzimir", 0, 0);
            insertQuestionBook2(db, "Gdzie odbyło się polowanie na smoka?", 0, "Koło Hołopola", "W górach Sodden", "W Dolinie Pontaru", 0, 0);
            insertQuestionBook2(db, "Kto otruł smoka?", 0, "Kozojed", "Pokrzywka", "Dhun", 0, 0);
            insertQuestionBook2(db, "Kto był przywódcą Rębaczy z Crinfrid?", 0, "Boholt", "Niszczuka", "Zdzieblarz", 0, 0);
            insertQuestionBook2(db, "Yannick Brass, Paulie Dahlberg i Lucas Corto to imiona?", 0, "Krasnoludów", "Rębaczy z Crinfrid", "Chłopów z Hołopola", 0, 0);

            insertQuestionBook2(db, "Jaki rycerz bez wady i skazy zmarł podczas starcia ze smokiem?", 0, "Eyck", "Brass", "Gyllenstiern", 0, 0);
            insertQuestionBook2(db, "Kto powiedział Geraltowi o tym, że Yennefer poluje na smoka?", 0, "Dorregaray", "Jaskier", "Borch", 0, 0);
            insertQuestionBook2(db, "Z jakiego powodu Geralt dołączył do polowania na smoka?", 0, "Yennefer", "Borcha", "Jaskra", 0, 0);
            insertQuestionBook2(db, "Kto związał Geralta i Yennefer w opowiadaniu pt. \"Granica możliwości\"?", 0, "Rębacze", "Krasnoludy", "Chłopi", 0, 0);
            insertQuestionBook2(db, "W jaki sposób Yennefer rzuciła zaklęcie, które uratowało ją i Geralta podczas polowania na smoka?", 0, "Stopą", "Łokciem", "Lewą reką", 0, 0);
            insertQuestionBook2(db, "Jaki smok stanął do obrony swojego pobratymca?", 0, "Villentretenmerth", "Ocvist", "Saesenthessis", 0, 0);
            insertQuestionBook2(db, "Z jakiego powodu Yennefer nie chciała rozmawiać z wiedźminem, podczas polowania na smoka?", 0, "Zostawił ją", "Wybrała Istredda", "Była jego życzeniem", 0, 0);
            insertQuestionBook2(db, "Jaki czarodziej rzeszył druidzkie postulaty o równowadze świata i ochronie wymierająych gatunkow?", 0, "Dorregaray", "Istredd", "Myszowór", 0, 0);
            insertQuestionBook2(db, "Kto spuścił lawinę na ludzi Niedamira?", 0, "Borch", "Dorregaray", "Natura", 0, 0);
            insertQuestionBook2(db, "\"Legendy sie nie zabija\" - czyje to słowa?", 0, "Dorregaraya", "Jaskra", "Geralta", 0, 0);

            insertQuestionBook2(db, "Kto rzucił linę Geraltowi nad przepaścią?", 0, "Eyck", "Rębacze", "Jaskier", 0, 0);
            insertQuestionBook2(db, "Kto gapił się związany na cycki Yennefer?", 0, "Jaskier", "Geralt", "Boholt", 0, 0);
            insertQuestionBook2(db, "Jak umarł Eyck z Denesle?", 0, "W boju", "Srając", "Śpiąc", 0, 0);
            insertQuestionBook2(db, "Jaką nagrodę dostał Borch od smoczycy, którą uratował?", 0, "Dziecko", "Skarb", "Lojalność", 0, 0);
            insertQuestionBook2(db, "Kto chciał zgwałcić Yennefer?", 0, "Boholt", "Ździeblarz", "Niszczuka", 0, 0);
//25 - a

//Okruch lodu
            insertQuestionBook2(db, "Jak brzmią pierwsze słowa wypowiadane przez Yennefer do Geralta w opowiadniu pt. \"Okruch lodu\"?", 0, "Śmierdzisz", "Chodź do mnie", "Spoźniłeś się", 0, 0);
            insertQuestionBook2(db, "Jakiego potwora Geralt zabił w Aedd Gynvael?", 0, "Zeugla", "Kikimorę", "Mantikorę", 0, 0);
            insertQuestionBook2(db, "Co Yennefer zawsze robiła przed pójściem do łóżka, co Geralt lubił obserwować?", 0, "Czesała się", "Myła się", "Balsamowała się", 0, 0);
            insertQuestionBook2(db, "Jakiego ptaka wyczarowała Yennefer w mieszkaniu w Aedd Gynvael?", 0, "Pustułkę", "Sowę", "Bociana", 0, 0);
            insertQuestionBook2(db, "Co oznacza Aedd Gynvael?", 0, "Okruch lodu", "Ziarno prawdy", "Białe zimno", 0, 0);

            insertQuestionBook2(db, "Co starosta Herbolth robił na rejwachu?", 0, "Przyjmował łapówki", "Egzekwował prawo", "Politykował", 0, 0);
            insertQuestionBook2(db, "Jaki pseudonim miał Ivo Mirce?", 0, "Cykada", "Dzieżba", "Piętnastka", 0, 0);
            insertQuestionBook2(db, "Kto był ochraniarzem Herboltha?", 0, "Cykada", "Civril", "Nohorn", 0, 0);
            insertQuestionBook2(db, "Ile Geralt dostał za zabicie Zeugla od Herboltha?", 0, "90 marek", "95 marek", "100 marek", 0, 0);
            insertQuestionBook2(db, "Gdzie najbardziej lubiła się kochać Yennefer?", 0, "Na jednorożcu", "W łóżku", "Na stole", 0, 0);
            insertQuestionBook2(db, "Czym w rytuałach magicznych różni się krew dziewicy od normalnej krwii?", 0, "Niczym", "Jakością", "Normalna nie działa", 0, 0);
            insertQuestionBook2(db, "Który czarodziej konkurował z Geraltem o względy Yennefer?", 0, "Istredd", "Radcliffe", "Cregennan", 0, 0);
            insertQuestionBook2(db, "Czy Yennefer w ciągu 24h kochała się z Geraltem i Istreddem?", 0, "Tak", "Nie", "Nie wiadomo", 0, 0);
            insertQuestionBook2(db, "Czy kiedykolwiek Yennefer spuściła wzrok przed Geraltem?", 0, "W Aedd Gynvael", "W Rinde", "Nigdy", 0, 0);
            insertQuestionBook2(db, "Gdzie Geralt i Istredd umówili się na pojedynek?", 0, "Pod studnią", "Na rynku", "Nie umawiali się", 0, 0);

            insertQuestionBook2(db, "Ile Herbolth oferował Geraltowi za zaprzestanie pojedynku z Istreddem?", 0, "100 marek", "150 marek", "200 marek", 0, 0);
            insertQuestionBook2(db, "Kto wygrał pojedynek Geralta i Istredda?", 0, "Geralt zrezygnował", "Geralt", "Istredd", 0, 0);
//42 - a
// Wieczny Ogien
            insertQuestionBook2(db, "Gdzie odbywa się opowiadanie pt. \"Wieczny Ogień\"?", 0, "w Oxenfurcie", "w Novigradzie", "w Aedd Gynvael", 0, 0);
            insertQuestionBook2(db, "Kto wyrzucał rzeczy Jaskra przez okno?", 0, "Vesna", "Vespula", "Sasha", 0, 0);
            insertQuestionBook2(db, "Do jakiej knajpy w Novigradzie udali się Jaskier i Geralt po kłótni z Vespulą?", 0, "Pod Udami Dziewicy", "Pod Grotem", "Pod Zadumanym Smokiem", 0, 0);
            insertQuestionBook2(db, "Jak tytuł nadał Jaskier balladzie, którą ułożył w Novigradzie?", 0, "Zima", "Wieczny Ogień", "Wilcza Zamieć", 0, 0);
            insertQuestionBook2(db, "Pod kogo podszywał się Dudu?", 0, "Drofussa", "Biberveldta", "Chappelle", 0, 0);
            insertQuestionBook2(db, "Jakie przychody udało się usiągnąć Dudu, gdy podszywał się pod Biberveldta?", 0, "Zerowe", "Dodatnie", "Ujemne", 0, 0);
            insertQuestionBook2(db, "Jak ma na imię Dudu?", 0, "Gibellini", "Tellico Lunngrevink", "Zammorto", 0, 0);
            insertQuestionBook2(db, "Ile koni ukradł Dudu?", 0, "7", "12", "10", 0, 0);

            insertQuestionBook2(db, "Kto był namiestnikiem do spraw bezpieczeństwa Novigradu?", 0, "Schwann", "Chappelle", "Hemmelfart", 0, 0);
            insertQuestionBook2(db, "Kim był Chappelle, gdy poznał go Geralt?", 0, "Człowiekiem", "Dopplerem", "Elfem", 0, 0);
            insertQuestionBook2(db, "Kto był znajomym bankierem Biberveldta?", 0, "Schwann", "Vimme Vivaldi", "Nino Cianfanelli", 0, 0);
            insertQuestionBook2(db, "Ile wynosił podatek Biberveldta nabity przez Dudu?", 0, "2000 koron", "1500 koron", "1800 koron", 0, 0);
            insertQuestionBook2(db, "Którego z tych towarów nie zakupił Dudu?", 0, "Kory Mimozowej", "Dratwy", "Olejków", 0, 0);
            insertQuestionBook2(db, "Kto był poborcą podatków w Novigradzie?", 0, "Vivaldi", "Schwann", "Drofuss", 0, 0);
            insertQuestionBook2(db, "W kogo z nich nie zmieniał się Dudu?", 0, "Jaskra", "Chappelle", "Geralta", 0, 0);
            insertQuestionBook2(db, "Kto dokończył Jaskrowi piosenkę pt. \"Wieczny ogień\"?", 0, "Marabella ", "Dudu", "Priscilla", 0, 0);
            insertQuestionBook2(db, "Kto pobił Dudu, przez co ten prawie został zdemaskowany?", 0, "Geralt", "Vespula", "Biberveldt", 0, 0);
            insertQuestionBook2(db, "Kim został Dudu?", 0, "Namiestnikiem", "Bankierem", "Factorem", 0, 0);

//60 - b
// Trochę poświęcenia
            insertQuestionBook2(db, "Geralt robił za tłumacza pomiędzy księciem, a?", 0, "Krasnoludami", "Syreną", "Elfami", 0, 0);
            insertQuestionBook2(db, "Jaki książę chciał poślubić syrenę?", 0, "Fletwick", "Agloval", "Drouhard", 0, 0);
            insertQuestionBook2(db, "Ile Agloval zapłacił Geraltowi za rolę tłumacza?", 0, "100 marek", "0 marek", "50 marek", 0, 0);
            insertQuestionBook2(db, "Dokończ ostatnie zdanie jednej z ballad Jaskra. \"Chcesz być nikim, bądź...\".", 0, "Druidem", "Leśniczym", "Strażnikiem", 0, 0);
            insertQuestionBook2(db, "Z jakim trubadurem Jaskier tworzył duet na zaślubinach we Bremervoord?", 0, "Priscillą", "Essi Daven", "Valdo Marx'em", 0, 0);
            insertQuestionBook2(db, "Jakiego pseudonimu nienawidziła Essi Daven?", 0, "Oczko", "Pacynka", "Gwieździstooka", 0, 0);
            insertQuestionBook2(db, "Dla kogo trubadurka Essie Davien śpiewała ze specjalną dedykacją, uwcześnie się całując z tą osobą?", 0, "Jaskra", "Geralta", "Valdo Marx'a", 0, 0);
            insertQuestionBook2(db, "Kto mieszkał w Ys?", 0, "Trytoni", "Vodyanoi", "Syreny", 0, 0);
            insertQuestionBook2(db, "Kto uratował Geralta i Jaskra przed mieszkańcami Ys?", 0, "Rybacy", "Sh'eenaz", "Drouhard", 0, 0);
            insertQuestionBook2(db, "Co Essi Daven otrzymała jako prezent urodzinowy?", 0, "Bursztyn", "Perłę", "Naszyjnik", 0, 0);

            insertQuestionBook2(db, "Kogo było stać na \"trochę poświęcenia\"?", 0, "Geralta", "Sh'eenaz", "Aglovala", 0, 0);
            insertQuestionBook2(db, "Czy Geralt ostatecznie przespał się z Essi Daven?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook2(db, "Na co umarła \"Oczko\"?", 0, "Grypę", "Ospę", "Katrionę", 0, 0);
            insertQuestionBook2(db, "Jaką pamiątkę po Geralcie nosiła Oczko?", 0, "Medalion Wilka", "Medalion z Perłą", "Różę pamięci", 0, 0);

//74 - b
// Miecz przeznaczenia
            insertQuestionBook2(db, "Jaki był znak ostrzegawczy przed wejściem do Brokilonu?", 0, "Tabliczka", "Powieszeni ludzie", "Strzała", 0, 0);
            insertQuestionBook2(db, "Gdzie po raz pierwszy spotkali się Geralt i Ciri?", 0, "w Cintrze", "w Novigradzie", "w Brokilonie", 0, 0);
            insertQuestionBook2(db, "Kogo postrzelonego przez driady spotkał Geralt pod lasem Brokilonu?", 0, "Drouharda", "Schwanna", "Freixeneta", 0, 0);
            insertQuestionBook2(db, "Jak miała na imię pół-driada, która prowadziła Geralta w środek brokilonu?", 0, "Morenn", "Aglais", "Braenn", 0, 0);
            insertQuestionBook2(db, "Jaki potwór zaatakował Geralta i Braenn?", 0, "Endriaga", "Wilkołak", "Skolopendromorf", 0, 0);
            insertQuestionBook2(db, "Skąd uciekła Cirilla przed wizytą w Brokilonie?", 0, "z Blaviken", "z Mirtu", "z Vergen", 0, 0);

            insertQuestionBook2(db, "Jaką bajkę opowiedział Geralt Cirilli przed snem?", 0, "o Wiedźminach", "o 2 Bardach", "o Kocie i Lisie", 0, 0);
            insertQuestionBook2(db, "Jak nazywa się stolica Brokilonu?", 0, "Craag An", "Col Serrai", "Duen Canell", 0, 0);
            insertQuestionBook2(db, "Która driada była panią Brokilonu?", 0, "Aglais", "Morenn", "Eithne", 0, 0);
            insertQuestionBook2(db, "Kim był Freixenet zanim Geralt zdjął z niego klątwę?", 0, "Łabędziem", "Wilkołakiem", "Kormoranem", 0, 0);
            insertQuestionBook2(db, "Co Geralt robił w Brokilonie?", 0, "Był w odwiedziny", "Był po Cirillę", "Niósł poselstwo", 0, 0);
            insertQuestionBook2(db, "Kim dla driad został Freixenet?", 0, "Trupem", "Dyplomatą", "Zapładniaczem", 0, 0);
            insertQuestionBook2(db, "Jak brzmi prawdziwe imię Braenn?", 0, "Fauve", "Dunca", "Mona", 0, 0);
            insertQuestionBook2(db, "Co się stało z Cirillą po wypiciu wody brokilonu?", 0, "Postradała rozum", "Zaczeła wieszczyć", "Nic", 0, 0);
            insertQuestionBook2(db, "Czy Geralt wypił wodę Brokilonu?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);
            insertQuestionBook2(db, "Gdzie Geralt chciał zabrać Cirillę z Brokilonu po tym, jak dowiedział się kim ona jest?", 0, "Do Kaer Morhen", "Do Vergen", "Do Cintry", 0, 0);

            insertQuestionBook2(db, "Kto uratował Geralta i Ciri przed bandytami w drodzę do Brugge?", 0, "Myszowór", "Najemnicy", "Driady", 0, 0);
            insertQuestionBook2(db, "Czyje poselstwo niosł Geralt do Eithne?", 0, "Ethaina", "Ervylla", "Venzlava", 0, 0);


//92 - c
// Coś więcej
            insertQuestionBook2(db, "Jak nazywał się kupiec, którego Geralt uratował w Temerii?", 0, "Dhun", "Haren", "Jurga", 0, 0);
            insertQuestionBook2(db, "Jak miała na imię żona Jurgi?", 0, "Celina", "Vesna", "Złotolitka", 0, 0);
            insertQuestionBook2(db, "Jakiej nagrody Geralt zażądał od Jurgi w zamian za ratunek?", 0, "Jadła", "Złota", "Prawa Niespodzianki", 0, 0);
            insertQuestionBook2(db, "Belleteyn przypadało na przełom?", 0, "Marca i Kwietnia", "Maja i Czerwca", "Kwietnia i Maja", 0, 0);
            insertQuestionBook2(db, "Jak miała na imię matka Geralta?", 0, "Adrianna", "Aurora", "Visenna", 0, 0);
            insertQuestionBook2(db, "Co było w halucynogennej wizji Geralta, gdy leżał w stanie agonalnym na wozie Jurgi?", 0, "Cirilla", "Brokilon", "Belleteyn i Yennefer", 0, 0);
            insertQuestionBook2(db, "Jak umarła Pavetta?", 0, "Zabili ją bandyci", "W masakrze Cintry", "Na morzu", 0, 0);
            insertQuestionBook2(db, "Czy Geralt udał się po 6 latach do Cintry i odbył rozmowę z Calanthe?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);

            insertQuestionBook2(db, "\"Czy jeśli przeznaczenie nie jest mitem, to czy może się zemścić?\" - czyje to słowa?", 0, "Yennefer", "Jaksra", "Calanthe", 0, 0);
            insertQuestionBook2(db, "Od kogo Geralt dowiedział się jak ma na imię jego matka?", 0, "Od Yennefer", "Od niej", "Od Vesemira", 0, 0);
            insertQuestionBook2(db, "Kto nadał Geraltowi jego imię?", 0, "On sam", "Vesemir", "Visenna", 0, 0);
            insertQuestionBook2(db, "Gdzie mieszka Jurga?", 0, "W Carcano", "W Velen", "W Dolnym Sodden", 0, 0);
            insertQuestionBook2(db, "Ile czarodziejów było wypisanych na Menhirze w Sodden?", 0, "13", "15", "14", 0, 0);
            insertQuestionBook2(db, "Ilu czarodziejów staneło w bitwie pod Sodden?", 0, "14", "17", "22", 0, 0);
            insertQuestionBook2(db, "Jakie było 14 nazwisko napisane na Menhirze w Sodden?", 0, "Triss Merigold", "Lytta Neyd", "Yoel Grethen", 0, 0);
            insertQuestionBook2(db, "Gdy Ciri zapytała Geralta, czy jest jej przeznaczeniem, co on jej odpowiedział?", 0, "Że ją kocha", "Że nim jest", "Że jest czymś więcej", 0, 0);
            insertQuestionBook2(db, "Od kogo Geralt dowiedział się o spaleniu Cintry?", 0, "Był tam", "Od Jurgi", "Od Jaskra", 0, 0);


            //109 - c


            // KREW ELFOW
            insertQuestionBook3(db, "Kto przepowiedział czas miecza i topora... czas pogardy?", 0, "Itlina", "Aglais", "Eithne", 0, 0);
            insertQuestionBook3(db, "Kto porwał Cirillę z Cintry?", 0, "Cahir", "Vilgefotrz", "Morvran Voorhis", 0, 0);
            insertQuestionBook3(db, "Czy Ciri pamiętała coś z tego, co zrobił jej Cahir?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook3(db, "Który czarodziej komplementował ballady Jaskra podczas występu pod dębem?", 0, "Radcliffe", "Lockhart", "Marcellus", 0, 0);
            insertQuestionBook3(db, "Który krasnolud walczył pod Sodden?", 0, "Sheldon Skaggs", "Yarpen Zigrin", "Zoltan Chiway", 0, 0);
            insertQuestionBook3(db, "Skąd pochodzi Czarna Rayla?", 0, "Lyrii", "Redanii", "Aedirn", 0, 0);
            insertQuestionBook3(db, "\"Każdy szermierz dupa, kiedy wrogów kupa\" - kto wypowiedzał te słowa?", 0, "Sheldon Skaggs", "Yarpen Zigrin", "Zoltan Chivay", 0, 0);
            insertQuestionBook3(db, "Kto próbował przekupić Jaskra, aby ten opowiedział mu o losach Cirilli z ballad? ", 0, "Rience", "Cahir", "Vilgefotrz", 0, 0);
            insertQuestionBook3(db, "Kto torturował Jaskra?", 0, "Rience", "Vilgefotrz", "Zdradzony mąż", 0, 0);
            insertQuestionBook3(db, "Jaskier powiedział Riencowi, ze gdzie się Geralt ukrywa?", 0, "Nic nie powiedział", "Kaern Morhen", "Vengerbergu", 0, 0);

            insertQuestionBook3(db, "Kto uratował Geralta przed Riencem?", 0, "Yennefer", "Shani", "Geralt", 0, 0);
            insertQuestionBook3(db, "Co nosiła na szyi Yennefer?", 0, "Gwiazdę z obsydianu", "Szmaragd", "Nefryt", 0, 0);
            insertQuestionBook3(db, " Czyim szpiegiem był Jaskier?", 0, "Redanii", "Temerii", "Kaedwen", 0, 0);
            insertQuestionBook3(db, "Kto przywitał Geralta i Ciri w Kaer Morhen?", 0, "Eskel", "Lambert", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Jaskier znał drogę do Kaer Morhen?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook3(db, "Kogo mylnie uważano za zmarłego spod Sodden?", 0, "Triss", "Yennefer", "Vilgefotrza", 0, 0);
            insertQuestionBook3(db, "Jak młodzi wiedźmini nazywali szlak służący do ćwiczeń kondycyjnych i biegowych?", 0, "Mordownia", "Szlak śmierci", "Gardziel", 0, 0);
            insertQuestionBook3(db, "Gdzie po raz pierwszy spotkały się Triss i Ciri?", 0, "Na Mordowni", "W jadalni", "Na placu ćwiczebnym", 0, 0);
            insertQuestionBook3(db, "Co zrobiła Triss dla Cirilli przy pierwszym spotkaniu?", 0, "Naprawiła jej kolano", "Naprawiła jej łokieć", "Dała lalkę", 0, 0);
            insertQuestionBook3(db, "O czym Ciri wieszczyła Triss przy pierwszym spotkaniu?", 0, "o Sodden i Kurhanach", "o Dzikim Gonie", "o Białym Zimnie", 0, 0);

            insertQuestionBook3(db, "Jak Vesemir nazywał Triss?", 0, "Dziecinką", "Małą Merigold", "Merigold", 0, 0);
            insertQuestionBook3(db, "Skąd pochodzi Coen?", 0, "z Poviss", "z Redanii", "z Temerii", 0, 0);
            insertQuestionBook3(db, "Triss nazwała jednego z nauczycieli Cirilli idiotą, którego?", 0, "Lamberta", "Coena", "Geralta", 0, 0);
            insertQuestionBook3(db, "Pierwszy raz Triss zeszła się z Geraltem w Kaer Morhen?", 0, "Tak", "Wcześniej", "Później", 0, 0);
            insertQuestionBook3(db, "Co dekorowało drzwii do komnaty Cirilli w Kaer Morhen?", 0, "Skóra szczura", "Skóra jelenia", "Skóra rosomaka", 0, 0);
            insertQuestionBook3(db, "Na czym Ciri uszkodziła biodra i udo?", 0, "Na wahadle", "Na mordowni", "Na wiatraku", 0, 0);
            insertQuestionBook3(db, "Na czym Ciri uszkodziła piszczel?", 0,  "Na wiatraku", "Na wahadle", "Na grzebieniu", 0, 0);
            insertQuestionBook3(db, "Czego bałą się Ciri w Kaer Morhen?", 0, "Długiej wagi", "Grzebienia", "Wiatraka", 0, 0);
            insertQuestionBook3(db, "Co najbardziej zdenerwowało Triss, a spowodowało największe zaniekłopotanie u wiedźminów?", 0, "Okres Ciri", "Ubrania Ciri", "Zbyt ciężki trening Ciri", 0, 0);
            insertQuestionBook3(db, "Gdzie Geralt zdecydował się zawieść Ciri w celu krztałcenia?", 0, "do Nenneke", "do Aretuzy", "do Ban Ard", 0, 0);

            insertQuestionBook3(db, "Jakie zwierzę upolował Geralt na wieczerzę w Kaer Morhen?", 0, "Koziołka", "Jelenia", "Dzika", 0, 0);
            insertQuestionBook3(db, "Czym jest Midinvaerne?", 0, "Przesileniem zimowym", "Przesileniem letnim", "Równonocą", 0, 0);
            insertQuestionBook3(db, "W co zazwyczaj grali Coen i Cirilla?", 0, "w Łapki", "w Hacele", "w Gwinta", 0, 0);
            insertQuestionBook3(db, "Czy Ciri potrafiła składać znaki wiedźmińskie?", 0, "Nie", "Tak", "tylko Aard i Ignii", 0, 0);
            insertQuestionBook3(db, "Dlaczego Geralt zaczerpnął pomocy Yennefer?", 0, "Triss nie potrafiła pomóc", "Pragnął jej pomocy", "Yennefer sama się narzuciłą", 0, 0);
            insertQuestionBook3(db, "Skąd pochodziła róża, którą Ciri ukuła się podczas zrywania?", 0, "Shaerrawedd", "Ellander", "Cintry", 0, 0);
            insertQuestionBook3(db, "Jak nazywał się specjalny wiedźmiński alkohol \"niehalucynogenny\"?", 0, "Biała Mewa", "Orka", "Czarna Mewa", 0, 0);
            insertQuestionBook3(db, "Kto według wróżby Cirilli miał umrzeć od \"2 zębów\"?", 0, "Coen", "Geralt", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Kto według wróżby Cirilli miał umrzeć od \"3 zębów\"?", 0, "Geralt", "Coen", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Kto podał Ciri białą mewę w celu wprowadzenia jej w trans?", 0, "Triss", "Eskel", "Geralt", 0, 0);
           // 40 -a

            insertQuestionBook3(db, "Czego Triss uczyła Ciri?", 0, "Magii", "Starszej mowy", "Makijażu", 0, 0);
            insertQuestionBook3(db, "Na co Ciri namawiała Triss, a ta sie na to zgodziła pod warunkiem, że odpowie na jej pytanie?", 0, "na pokaz magii", "na Sanki", "na Makijaż", 0, 0);
            insertQuestionBook3(db, "W książce zostałą przedstawiona scena, w której Vesemir uczył Ciri o potworach. Jakie potwory był wymienione w tym fragmencie?", 0, "Alghule i Zjadarki", "Ghule i Graveiry", "Mantikory i Viverny", 0, 0);
            insertQuestionBook3(db, "Kto uczył Ciri walki przy użyciu aż 3 wahadeł?", 0, "Vesemir", "Geralt", "Coen", 0, 0);
            insertQuestionBook3(db, "Kto razem z Triss zasiada w radzie Foltesta?", 0, "Scheala de Tancarville", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook3(db, "Gdzie mieszka Triss?", 0, "w Oxenfurcie", "w Mariborze", "w Tretogorze", 0, 0);
            insertQuestionBook3(db, "Co straciła Yennefer (z cego ją później wyleczono) w bitwie pod Sodden?", 0, "Głos", "Wzrok", "Włosy", 0, 0);
            insertQuestionBook3(db, "Dlaczego Geralt odmówił Ciri dalszego szkolenia w walce?", 0, "Przez rany", "Chciała zabić Cahira", "Przez Triss", 0, 0);
            insertQuestionBook3(db, "Dlaczego Triss nie wzieła eliksiru na chorobę?", 0, "Nie miała składników", "Jest uczulona", "Nie umiała go zrobić", 0, 0);
            insertQuestionBook3(db, "Kto rewirował towary transportowane przez krasnoludy?", 0, "Najemnicy Pangratta", "Bura Chorągiew", "Bandyci", 0, 0);

            insertQuestionBook3(db, "Gdzie była świątynia Melitelle?", 0, "w Brugge", "w Ellander", "w Metinie", 0, 0);
            insertQuestionBook3(db, "Jakie jest hasło Scoia'tael?", 0, "Ludzie do trumny", "Ludzie do wody", "Ludzie do piachu", 0, 0);
            insertQuestionBook3(db, "Kto napadł na posterunek przez który Geralt jechał do Świątyni Melitelle?", 0, "Bandyci", "Elfy", "Nilfgard", 0, 0);
            insertQuestionBook3(db, "Kto jechał z karawaną, którą próbował dogonić Geralt, żeby znaleść pomoc dla Merigold?", 0, "Freixenet", "Yarpen Zigrin", "Jaskier", 0, 0);
            insertQuestionBook3(db, "Który krasnolud wystąpił z kompani Yarpena Zigrina przez zaślubiny?", 0, "Yannick Brass", "Lucas Corto", "Xavier Moran", 0, 0);
            insertQuestionBook3(db, "Co transportował konwój Yarpena Zigrina?", 0, "Raporty wojskowe", "Nie wiadomo", "Jedzenie", 0, 0);
            insertQuestionBook3(db, "Kto niosł z rzeki wodę do mycia dla Triss?", 0, "Geralt", "Ciri", "Yarpen Zigrin", 0, 0);
            insertQuestionBook3(db, "Jakie ryby łowiły krasnoludy Yarpena?", 0, "Leszcze", "Pstrągi", "Sandacze", 0, 0);
            insertQuestionBook3(db, "Kto wyprowadził jako pierwszy elfią młodzież do walki o wolność, wskutek której prawie wszyscy umarli?", 0, "Iorweth", "Aelirenn", "Yaevinn", 0, 0);
            insertQuestionBook3(db, "Gdzie ubili babkę Yarpena?", 0, "w Mahakamie", "w Brugge", "w Vergen", 0, 0);

            insertQuestionBook3(db, "Które z tych miast nie jest zbudowane na elfich ruinach?", 0, "Tretogor", "Brugge", "Wyzima", 0, 0);
            insertQuestionBook3(db, "Czyja rzeźba jest w Shaerrawedd?", 0, "Ithlinne", "Aelirenn", "Ettariel", 0, 0);
            insertQuestionBook3(db, "Skąd pochodziła zbrojna pomoc, która uratowała transport krasnoludów od ataku Scoia'tael?", 0, "z Ard Carraigh", "z Ban Glean", "Asheberg", 0, 0);
            insertQuestionBook3(db, "Który krasnolud nie przeżył ataku Scoia'a tael?", 0, "Regan Dahlberg", "Paulie Dahlberg", "Yannick Brass", 0, 0);
            insertQuestionBook3(db, "Co oznacza po elficku \"Kaer Morhen\"?", 0, "Wiedźmińskie siedliszcze", "Warownia starego morza", "Ruiny zamku", 0, 0);
            insertQuestionBook3(db, "Co oznacza \"Zirael\"?", 0, "Starsza krew", "Jaskółka", "Lwiątko", 0, 0);
            insertQuestionBook3(db, "Czego Geralt żałował w liście do Yennefer?", 0, "Że powstał", "Nazwał Yen przyjaciółka", "Zbyt późno napisał", 0, 0);
            insertQuestionBook3(db, "Jakiego potwora Geralt wypatrywał na barcę?", 0, "Krakena", "Żagnicy", "Selkimorę", 0, 0);
            insertQuestionBook3(db, "Jak miał na imię naukowiec z Oxenfurtu, z którym Geralt rozprawiał o potworach?", 0, "Jean La Voisier", "Linus Pitt", "Aldert Geert", 0, 0);
            insertQuestionBook3(db, "Jak ma na imię przywódca Redańskich celników?", 0, "Tybalt", "Olsen", "Aldert Geert", 0, 0);

            insertQuestionBook3(db, "Gdzie chciał wstąpić Olsen?", 0, "Burej Chorągwi", "Służb specjalnych", "Tarczowników", 0, 0);
            insertQuestionBook3(db, "Na czyj rozkaz temerska straż pytała o Geralta?", 0, "Dymitra", "Rienca", "Velerada", 0, 0);
            insertQuestionBook3(db, "Jak początkowo Linus Pitt chciał nazwać Żagnice?", 0, "Pitterią", "Geraltią", "Everetią", 0, 0);
            insertQuestionBook3(db, "Kogo Jaskier poprosił o rozpoznanie 2 szpicli?", 0, "Yennefer", "Shani", "Geralta", 0, 0);
            insertQuestionBook3(db, "Z czego była zrobiona ulubiona biżuteria Filippy Eilhart?", 0, "Obsydianu", "Czarnego agatu", "Szmaragdów", 0, 0);
            insertQuestionBook3(db, "O co Dijkstra miał pretensję do Jaskra?", 0, "Zdemaskowanie szpiega", "Spłoszenie Rienca", "Kłamstwo", 0, 0);
            insertQuestionBook3(db, "Czego Dijkstra wymagał od Jaskra?", 0, "Informacji o Ciri", "Sprowadzenia Geralta", "Sprowadzenia Cirilli", 0, 0);
            insertQuestionBook3(db, "Z kim nakrył Geralta Jaskier w Oxenfurcie?", 0, "z Prostytutką", "z Shani", "z Triss", 0, 0);
            insertQuestionBook3(db, "Kto pomyślnie wyszpiegował Geralta i Jaskra w Oxenfurcie?", 0, "Dijkstra", "Filippa Eilhart", "Rience", 0, 0);
            insertQuestionBook3(db, "Co chciała Filippa od Geralta?", 0, "Szantażowała go", "Ostrzegała go", "Wymuszała oddanie Cirilli", 0, 0);

            // 80 -b

            insertQuestionBook3(db, "Co Emchyr zrobił z Marszałkami spod Sodden?", 0, "Nic", "Wychłostał ich", "Zabił ich", 0, 0);
            insertQuestionBook3(db, "Kto nie podpisał zawieszenia broni z Nilfgardem?", 0, "Eist Tuirseach", "Bran Tuirseach", "Crach an Craite", 0, 0);
            insertQuestionBook3(db, "Który król zobowiązał się wytępić Scoia'tael w 6 miesięcy?", 0, "Vizimir", "Isengrim Faoiltiarna", "Nilfgard", 0, 0);
            insertQuestionBook3(db, "Kto poruszył Scoia'tael do walki w obecnych czasach?", 0, "Iorweth", "Coen", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Gdzie odbyło się spotkanie władców północy?", 0, "Tretogorze", "Wyzimie", "Hagge", 0, 0);
            insertQuestionBook3(db, "Co królowie północy zdecydowali zrobić z Ciri, gdyby ją znaleźli?", 0, "Oddać Cintrijczykom", "Wydać za mąż", "Zabić", 0, 0);
            insertQuestionBook3(db, "Kto był namiestnikiem Cintry?", 0, "Vattier de Rideaux", "Jan Calveit", "Menno Coehoorn", 0, 0);
            insertQuestionBook3(db, " Jaki był rozkaz od Emhyra dla Rienca?", 0, "Porwać Geralta", "Porwać Yennefer", "Zabić wiedźmina", 0, 0);
            insertQuestionBook3(db, "Kogo wynajął Rience do zabicia Geralta?", 0, "Til Echrade", "Magistra", "Braci Michelet", 0, 0);
            insertQuestionBook3(db, "Od kogo Geralt dowiedział się, jak znaleść Rienca?", 0, "Filippy Eilhart", "Braci Michelet", "Myhrmana", 0, 0);

            insertQuestionBook3(db, "Skąd pochodził Vilgefortz?", 0, "Claremont", "Creyden", "Roggeveen", 0, 0);
            insertQuestionBook3(db, "Która czarodziejka szaleńczo była zakochana w Vilgefortzie?", 0, "Tissaia de Vries", "Assire var Anahid", "Lydia van Bredevoort", 0, 0);
            insertQuestionBook3(db, "Kto sparaliżował Geralta przez co Rience zdołał uciec?", 0, "Nieznany czarodziej", "Vilgefortz", "Filippa Eilhart", 0, 0);
            insertQuestionBook3(db, "Kto opowiadał Ciri o wojnie w świątyni Melitelle?", 0, "Yennefer", "Nenneke", "Jarre", 0, 0);
            insertQuestionBook3(db, "Kogo przedstawiała rycina, która wypadła z książki Jarre?", 0, "Yennefer", "Ciri", "To były nudesy", 0, 0);
            insertQuestionBook3(db, "Co chciała zrobić Ciri po pierwszym spotkaniu z Yennefer?", 0, "Krzyczeć na nią", "Poskarżyć się Geraltowi", "Uciec do Kaer Morhen", 0, 0);
            insertQuestionBook3(db, "Co odpowiedziała Yennefer Cirilli, po usłyszeniu pytania - \"Co łączy ją z Geraltem?\"?", 0, "Nic", "Przyjaźń", "Tęsknota", 0, 0);
            insertQuestionBook3(db, "Co miała zrobić Cirilla podczas testu Yennefer?", 0, "Przeczytać runy", "Złożyć znak", "Rysować", 0, 0);
            insertQuestionBook3(db, "Po czym Yennefer stwierdziła, że Ciri nadaje się na czarodziejkę?", 0, "Roztaczała magiczną aurę", "Czytała w myślach", "Zauważyła aurę obsydianu", 0, 0);
            insertQuestionBook3(db, "Skąd pochodzili druidzi, którzy opiekowali się Ciri?", 0, "Erlenwaldu", "Mariboru", "Angrenu", 0, 0);

            insertQuestionBook3(db, "W jakim wieku Yennefer została czarodziejką?", 0, "20", "15", "13", 0, 0);
            insertQuestionBook3(db, "Ile Yennefer miała lat, gdy straciła dziewictwo?", 0, "21", "17", "16", 0, 0);
            insertQuestionBook3(db, "Co zniszczyła Ciri podczas lekcji zaklęć?", 0, "Drzwii", "Stół", "Szopkę", 0, 0);
            insertQuestionBook3(db, "Jakie zwierzę lubi spać na intersekcjach?", 0, "Pies", "Koń", "Kot", 0, 0);
            insertQuestionBook3(db, "Jak Calanthe była nazywana na wyspach Skellige?", 0, "Gaes Muirre", "Lyarya Xintra", "Ard Rhena", 0, 0);
            insertQuestionBook3(db, "Jakim żywiołem pod żadnym pozorem nie wolno było bawić się Ciri?", 0, "Ziemią", "Powietrzem", "Ogniem", 0, 0);

            // 106 - c

            //CZAS POGARDY
            insertQuestionBook4(db, "Co palono w wigilię Saovine?", 0, "Kukłę Falki", "Marzannę", "Elfie kukły", 0, 0);
            insertQuestionBook4(db, "ak nazywał się goniec, który był świadkiem walki Wiedźmina z Profesorem?", 0, "Aplegatt", "Paulie Dahlberg", "Gorrett", 0, 0);
            insertQuestionBook4(db, "Jaka śmierć przewidziała Ciri dla gońca królewskiego?", 0, "Strzałę", "Miecz", "Topór", 0, 0);
            insertQuestionBook4(db, "Do kogo Aplegatt przekazywał wiadomości od Demawenda?", 0, "Foltesta", "Henselta", "Wyzimira", 0, 0);
            insertQuestionBook4(db, "Co zablokowało przejazd gońcowi królewskiemu?", 0, "Potwór", "Elfy", "Bandyci", 0, 0);
            insertQuestionBook4(db, "Jaki potwór zablokował trakt kupiecki?", 0, "Mantikora", "Oszluzg", "Gryf", 0, 0);
            insertQuestionBook4(db, "W jakim mieście stacjonowali Codringher i Fenn?", 0, "Dorian", "Anchor", "Gors Velen", 0, 0);
            insertQuestionBook4(db, "Kim był Codringher?", 0, "Człowiekiem", "Elfem", "Niziołkiem", 0, 0);
            insertQuestionBook4(db, "Kto zamordował Codringhera i Fenna?", 0, "Schirru", "Rience", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Na czyjej szmyczy był Rience?", 0, "Vilgefortza z Roggeveen", "Radcliffa", "Emhyra", 0, 0);

            insertQuestionBook4(db, "Dlaczego klienci nigdy nie widzieli Fenna?", 0, "Był kaleką", "Był elfem", "Nie isniał", 0, 0);
            insertQuestionBook4(db, "Skąd pochodził Regner?", 0, "Ebbing", "Brugge", "Nazairu", 0, 0);
            insertQuestionBook4(db, "Od kogo agenci dowiedzieli się o \"śmierci Ciri\"?", 0, "od Codringhera", "od Yennefer", "od Dijkstry", 0, 0);
            insertQuestionBook4(db, "Jaką bronią lubił bawić się Codringher?", 0, "Orionem", "Sztyletem", "Maczugą", 0, 0);
            insertQuestionBook4(db, "le kosztowała standardowa usługa Condringhera?", 0, "250 koron", "200 koron", "150 koron", 0, 0);
            insertQuestionBook4(db, "Jakie rozwiązanie zaproponował Condringher Geraltowi?", 0, "Fałszywą Cirillę", "Pułapkę na Rienca", "Zostawienie Ciri", 0, 0);
            insertQuestionBook4(db, "Kto polował na Yennefer i Ciri?", 0, "Profesor", "Xavier Moran", "Bracia Michelet", 0, 0);
            insertQuestionBook4(db, "Gdzie zostali zabici przez Geralta - Profesor, Krótki Yaxa i Heimem Kantor?", 0, "Anchor", "Dorian", "Gors Velen", 0, 0);
            insertQuestionBook4(db, "Do jakiego miasta pojechały Ciri i Yennefer?", 0, "Gors Velen", "Ebbing", "Anchor", 0, 0);
            insertQuestionBook4(db, "Czyj bank był w Gors Velen?", 0, "Molnara", "Cianfanellich", "Vivaldich", 0, 0);

            insertQuestionBook4(db, "Gdzie odbył się zjazd czarodziejów?", 0, "na Thanedd", "w Moc Muinne", "w Hagge", 0, 0);
            insertQuestionBook4(db, "Który kraj zamawiał masowo łodzie od szkutników?", 0, "Temeria", "Redania", "Kaedwen", 0, 0);
            insertQuestionBook4(db, "Ile Yennefer wpłaciła na Świątynie Melitelle?", 0, "1500 orenow", "2000 orenow", "1000 orenow", 0, 0);
            insertQuestionBook4(db, "Ile Yennefer wpłaciła do Aretuzy?", 0, "2000 koron", "1700 koron", "2200 koron", 0, 0);
            insertQuestionBook4(db, "Kto oprowadzał Ciri po Gors Velen?", 0, "Fabio", "Molnar", "Yennefer", 0, 0);
            insertQuestionBook4(db, "Gdzie Yennefer pomogła Molnarowi?", 0, "w Vengenbergu", "w Gors Velen", "w Dorian", 0, 0);
            insertQuestionBook4(db, "Gdzie leży Aretuza?", 0, "na Thanedd", "w Anchor", "w Dorian", 0, 0);
            insertQuestionBook4(db, " Kto zbudował Thanedd?", 0, "Elfy", "Ludzie", "Krasnoludy", 0, 0);
            insertQuestionBook4(db, "Co oznacza \"Tor Lara\"?", 0, "Wieża Mewy", "Wieża Jaskółki", "Wieża Przeznaczenia", 0, 0);
            insertQuestionBook4(db, "Co Fabio kupił Cirilli?", 0, "Pączki", "Winogrono", "Truskawki", 0, 0);

            insertQuestionBook4(db, "Czym na prawdę był \"bazyliszek\" zamknięty w klatce?", 0, "Viverną", "Oszluzgiem", "Skrzekaczem", 0, 0);
            insertQuestionBook4(db, "Kto złapał Ciri i zaprowadził do Yennefer?", 0, "Tissai De Vries", "Sheala De Tancraville", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Kto był oficerem wojsk specjalnych Demawenda?", 0, "Rayla", "Blaise", "Villis", 0, 0);
            insertQuestionBook4(db, "Kto był rektorem Aretuzy podczas pobytu Ciri na Thanedd?", 0, "Margarita Laux-Antille", "Tissai De Vries", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Gdzie przebywał Geralt, kiedy Ciri uciekła Yennefer po to, aby się z nim spotkać?", 0, "Hirundum", "Anchor", "Dorian", 0, 0);
            insertQuestionBook4(db, " Która czarodziejka chciała ujeżdzać Geralta na jeżu?", 0, "Marti Sodergren", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Która czarodziejka dałaby Geraltowi na kamieniu?", 0, "Sabrina Glevissig", "Marti Sodergren", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "W krztałcie jakiej litery była sala bankietowa na Thanedd?", 0, "T", "X", "H", 0, 0);
            insertQuestionBook4(db, "Kto towarzyszył Filippie Eilhart podczas bankietu?", 0, "Dijkstra", "Cynthia", "Radcliffe", 0, 0);
            insertQuestionBook4(db, "Kto z wymienionych czarodziejów nie należał do kapituły?", 0, "Filippa Eilhart", "Francesca Findabair", "Vilgefortz z Roggeveen", 0, 0);

            //40 a

            insertQuestionBook4(db, "O co Yennefer nakrzyczała na Triss?", 0, "o Ciri", "o Geralta", "o Aretuzę", 0, 0);
            insertQuestionBook4(db, "\"Mylisz niebo z gwiazdami odbitymi nocą na powierzchni stawu\" - Czyj to cytat? ", 0, "Radcliffa", "Vilgefotrza", "Filippy Eilhart", 0, 0);
            insertQuestionBook4(db, "Który czarodziej oburzał się i wymieniał z jakich wymierajacych gatunków ludzie noszą odzienie?", 0, "Jan Bekker", "Dorregaray", "Radcliff", 0, 0);
            insertQuestionBook4(db, "Która czarodziejka oznajmiła Geraltowi, że umiała by wyczarować iluzję orgazmu?", 0, "Filippa Eilhart", "Marti Sodergren", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Która czarodziejka specjalizowała się w afrodyzjakach?", 0, "Filippa Eilhart", "Marti Sodergren", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Który czarodziej jako jedyny opanował do perfekcji moc 4 żywiołów?", 0, "Vilgefotrz", "Jan Bekker", "Tissai De Vries\n", 0, 0);
            insertQuestionBook4(db, "Co Vilgefotrz prezentował Geraltowi?", 0, "Swoją kolekcję", "Galerię Chwały", "Zbiory o Starszej Krwii", 0, 0);
            insertQuestionBook4(db, "W którym rynsztoku znaleziono w dzieciństwie Vilgefotrza?", 0, "w Maecht", "w Lan Exeter", "w Povis", 0, 0);
            insertQuestionBook4(db, "Jak nazywany jest portal Tor Lara?", 0, "Bekkera", "Benaventa", "Radcliffa", 0, 0);
            insertQuestionBook4(db, "Jaki materiał dławił zdolności czarodziejów?", 0, "Nefryt", "Dwimeryt", "Obsydian", 0, 0);

            insertQuestionBook4(db, "Kto zabił Lydie van Bredevoort?", 0, "Radcliffe", "Ona sama", "Filippa Eilhart", 0, 0);
            insertQuestionBook4(db, "Komu Geralt złamał noge na Thanned?", 0, "Riencowi", "Dijkstrze", "Vilgefotrzowi", 0, 0);
            insertQuestionBook4(db, "Gdzie trzymano spiskowców?", 0, "w Loxii", "w Garstangu", "w Gors Velen", 0, 0);
            insertQuestionBook4(db, "Kto zdjął tarczę antymagiczną z Garstangu?", 0, "Filippa Eilhart", "Tissai De Vries", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Kto spadł na Geralta pod Garstangiem wylatując przez okno?", 0, "Triss Merigold", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Kto wspierał Vilgefotrza?", 0, "Sabrina Glevissig", "Terranova", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Jak umarła Tissai De Vries?", 0, "Zabił ją Vilgefotrz", "Podcieła sobie żyły", "Zabiła ją Keira", 0, 0);
            insertQuestionBook4(db, "Kto zabił Terranowę?", 0, "Filippa Eilhart", "Geralt z Rivii", "Yennefer", 0, 0);
            insertQuestionBook4(db, " Kto ranił Cahira na Thanedd?", 0, "Geralt", "Ciri", "Yennefer", 0, 0);
            insertQuestionBook4(db, "Dlaczego Geralt nie dobił Cahira?", 0, "Nie zauważył go", "Za uratowanie Ciri w Cintrze", "Nie miał czasu", 0, 0);

            insertQuestionBook4(db, "Czym walczył Vilgefotrz pod Tor Lara?", 0, "Mieczem", "Kijem", "Czarami", 0, 0);
            insertQuestionBook4(db, "Jak na driady mówią ludzie?", 0, "Rusałki", "Dziwożony", "Wiły", 0, 0);
            insertQuestionBook4(db, "Jak miał na imię koń Jaskra?", 0, "Skoczka", "Pegaz", "Wojsiłek", 0, 0);
            insertQuestionBook4(db, "Która driada leczyła Geralta w Brokilonie?", 0, "Eithne", "Aglais", "Morenn", 0, 0);
            insertQuestionBook4(db, "Co driady kazały zrobić Jaskrowi, gdy ten próbował wejść do Brokilonu?", 0, "Przedstawić się", "Śpiewać", "Odejść", 0, 0);
            insertQuestionBook4(db, "Kto wydał rozkaz \"Wojna wszystkiemu co żyje\"?", 0, "Peter Evertsen", "Menno Coehoorn", "Vattier de Rideaux", 0, 0);
            insertQuestionBook4(db, "Kto był wielkim komorzym Nilfgardu?", 0, "Vattier de Rideaux", "Peter Evertsen", "Menno Coehoorn", 0, 0);
            insertQuestionBook4(db, "Jakie kraje najpierw spalili Nilfgardczycy?", 0, "Kaedwen i Temerie", "Lyrie i Aedirn", "Rivie i Temerie", 0, 0);
            insertQuestionBook4(db, "Kto bronił ludzi w Aedirn, gdy wojsko uciekło?", 0, "Seltkirk", "Czarna Rayla", "Królowa Meve", 0, 0);
            insertQuestionBook4(db, "W którym kraju zamordowano króla?", 0, "Aedirn", "Redanii", "Temerii", 0, 0);

            insertQuestionBook4(db, "Który król złożył hołd lenny Nilfgardowi?", 0, "Niedamir", "Ervyll", "Kistrin", 0, 0);
            insertQuestionBook4(db, " Który kaedweńczyk częstował alkoholem setnika?", 0, "Myron", "Zyvik", "Odrin", 0, 0);
            insertQuestionBook4(db, "Kto został królem Dol Blathanna?", 0, "Filavandrel", "Enid an Gleanna", "Galarr", 0, 0);
            insertQuestionBook4(db, "Gdzie udała się Triss po pogromie na Thanedd?", 0, "Temerii", "Redanii", "Kaedwen", 0, 0);
            insertQuestionBook4(db, "Jak miała na imię na prawdę Tissaia De Vries?", 0, "Cecylia", "Skowronek", "Stokrotka", 0, 0);
            insertQuestionBook4(db, "Z którym królem Nilfgard dokonał rozbioru Aedirn?", 0, "z Foltestem", "z Henseltem", "z Vyzimirem", 0, 0);
            insertQuestionBook4(db, "Jak miała na nazwisko Milva?", 0, "Wagner", "Barring", "Sivney", 0, 0);
            insertQuestionBook4(db, "Jak elfy nazywały Milve?", 0, "Córka", "Siostra", "Zbawicielka", 0, 0);
            insertQuestionBook4(db, "Kto podesłał Emhyrowi fałszywą Cirillę?", 0, "Puszczyk", "Vilgefotrz", "Vattier de Rideaux", 0, 0);
            insertQuestionBook4(db, "Z kim zerwał Emhyr dla fałszywej Cirilli?", 0, "Carthią", "Dervlą Tryffin", "Mawre Ceallach", 0, 0);

            //80 b

            insertQuestionBook4(db, "Gdzie Emhyr wysłał fałszywą Ciri?", 0, "Darn Ruach", "Loc Grim", "Darn Rowan", 0, 0);
            insertQuestionBook4(db, "Który czarodziej był wróżbitą Emhyra?", 0, "Assire var Anahid", "Fringilla Vigo", "Xarthisius", 0, 0);
            insertQuestionBook4(db, "Puszczyk to?", 0, "Joachim de Wett", "Vattier de Rideaux", "Stefan Skellen", 0, 0);
            insertQuestionBook4(db, "Gdzie trafiła Ciri pod wybuchu wieży mewy?", 0, "Deithwen", "Diddiwedh", "Korath", 0, 0);
            insertQuestionBook4(db, "Jakiego zaklęcia użyła Ciri na pustyni?", 0, "Portalu", "Ochłodzenia ciała", "Kuli światła", 0, 0);
            insertQuestionBook4(db, "Co pomogło Ciri napić się wody na pustyni?", 0, "Pudełko po maści", "Pudełko po perfumach", "Kordzik", 0, 0);
            insertQuestionBook4(db, "Czym głównie żywiła się Ciri na pustyni?", 0, "Skorpionami", "Jaszczukarmi", "Jajami", 0, 0);
            insertQuestionBook4(db, "Jak Ciri nazwała gwiazdę, która wskazywała jej drogę?", 0, "Drogowskazem", "Strzałką", "Okiem", 0, 0);
            insertQuestionBook4(db, "Kto uratował życie Ciri na pustyni?", 0, "\"Szczury\"", "Xarthisius", "Jednorożec", 0, 0);
            insertQuestionBook4(db, "Jakiego pokarmu Ciri nie jadła mimo wielkiego głodu?", 0, "Mrówek", "Pająków", "Skoprionów,", 0, 0);

            insertQuestionBook4(db, "Jakie zaklęcie pomogło Ciri w walce z pustynnym potworem?", 0, "Znak Ignii", "Znak Yrden", "Telekineza", 0, 0);
            insertQuestionBook4(db, "Czym żywiły się pustynne potwory z leja?", 0, "Mięsem", "Wodą", "Krwią", 0, 0);
            insertQuestionBook4(db, "Pobranie przez Ciri mocy z którego żywiołu pozwoliło jej uleczyć \"konika\"?", 0, "Ziemi", "Powietrza", "Ognia", 0, 0);
            insertQuestionBook4(db, "Jak miał na imię jednorożec?", 0, "Muircetach", "Nithral", "Ihuarraquax", 0, 0);
            insertQuestionBook4(db, "Kto porwał Cirillę z pustyni?", 0, "\"szczury\"", "Puszczyk", "Łapacze Skomlika", 0, 0);
            insertQuestionBook4(db, "Rycerz z jakiego rodu przewodził łapaczom Skomlika?", 0, "Varnhagen", "Dyffryn", "Sweers", 0, 0);
            insertQuestionBook4(db, "W jakim mieście szczury oswobodziły Ciri?", 0, "Zazdrość", "Murivel", "Glyswen", 0, 0);
            insertQuestionBook4(db, "Kogo pojmali Nissirowie?", 0, "Ciri", "Giselherta", "Kayleigha", 0, 0);
            insertQuestionBook4(db, "Kto zabił Skomlika", 0, "Giselhert", "Ciri", "Mistle", 0, 0);
            insertQuestionBook4(db, "Skąd Ciri wzieła nóż, którym uwolniła szczura?", 0, "Znalazła go w kącie", "Ukradła Nissirom", "Od karczmarza", 0, 0);

            insertQuestionBook4(db, "Kto był przywódcą szczurów?", 0, "Reef", "Kayleigh", "Giselhert", 0, 0);
            insertQuestionBook4(db, "Jak przedstawiała się Ciri w Nilfgardzie?", 0, "Fiona", "Zirael", "Falka", 0, 0);
            insertQuestionBook4(db, "Którego szczura Misatle przyłapała na próbie gwałtu Ciri?", 0, "Reefa", "Giselherta", "Kayleigha", 0, 0);
            insertQuestionBook4(db, "Który szczur był elfem?", 0, "Reef", "Mistle", "Iskra", 0, 0);
        //104 - c

            // Chrzest Ognia
            insertQuestionBook5(db, "Z jakich łuków uczyła się strzelać Milva?", 0, "Cisowych", "Elfich", "Dębowych", 0, 0);
            insertQuestionBook5(db, "Ile Milva zapłaciła za swój wymarzony łuk?", 0, "300 koron", "400 koron", "500 koron", 0, 0);
            insertQuestionBook5(db, "Jakiego łuku używała Milva, zanim kupiła swój wymarzony?", 0, "Zefhara", "Gynvael", "Deithne", 0, 0);
            insertQuestionBook5(db, "Co odpowiedziała Maria Barring, gdy została poproszona przez Aglais żeby zdobyła informację dla Geralta?", 0, "Żeby szedł do biesa", "Że mu pomoże", "Że nie ma czasu", 0, 0);
            insertQuestionBook5(db, "Kto dowodził elfom na Thanned?", 0, "Isengrim", "Iorweth", "Filavandrel", 0, 0);
            insertQuestionBook5(db, "Jak ma na imię sekretarz Dijkstry?", 0, "Ori", "Sanchs", "Galarr", 0, 0);
            insertQuestionBook5(db, "Co znaczy \"Milva\" w starszej mowie?", 0, "Kania", "Siostra", "Łowczyni", 0, 0);
            insertQuestionBook5(db, "Od kogo Geralt dowiedział się plotki o rzekomym małżeństwie Ciri i Emhyra?", 0, "Milvy", "Jaskra", "Eithne", 0, 0);
            insertQuestionBook5(db, "Kto był posłem Emhyra, który domagał się od Dijkstry wydania Nilfgardzkiego zdrajcy?", 0, "Shilard", "Moorlehem", "De Wett", 0, 0);
            insertQuestionBook5(db, "Wydanie jakiego więźnia domagał się od Dijkstry poseł Nilfgardu?", 0, "Cahir", "Geralta", "Rienca", 0, 0);

            insertQuestionBook5(db, "Na którego elfa Milva była wściekła o to, że wyprowadziła go rannego do Brokilonu, a on znowu poszedł na front?", 0, "Ciarana", "Isengrima", "Yaevinna", 0, 0);
            insertQuestionBook5(db, "Gdzie założono lożę czarodziejek?", 0, "w Montecalvo", "w Ard Carraigh", "w Tir na Lia", 0, 0);
            insertQuestionBook5(db, "Która z tych 3 czarodziejek nie należała do pomysłodawczyń założenia loży czarodziejek?", 0, "Sheala de Tancarville", "Triss Merigold", "Margarita Laux-Antille", 0, 0);
            insertQuestionBook5(db, "Ile osób planowo miała liczyć loża czarodziejek?", 0, "12", "13", "14", 0, 0);
            insertQuestionBook5(db, "Za kogo wzieli Geralta i Jaskra kupcy nieopodal Brokilonu?", 0, "Elfów", "Szpiegów", "Buntowników", 0, 0);
            insertQuestionBook5(db, "Kogo przewozili havekarzy nieopodal Brokilonu?", 0, "Cahira", "Toruviel", "Rienca", 0, 0);
            insertQuestionBook5(db, "Kto uratował wiedźmina od Nilfgardczyków podczas rozróby z havekarami?", 0, "Milva", "Cahir", "Driady", 0, 0);
            insertQuestionBook5(db, "Kto złapał Cahira?", 0, "Faolitarna", "Dijkstra", "Schirru", 0, 0);
            insertQuestionBook5(db, "Kto z tych grup nie najechał na Brugge?", 0, "Kreyden", "Verden", "Wiewórki", 0, 0);
            insertQuestionBook5(db, "Jaką plotką Jaskier zdenerował Milvę?", 0, "O cyckach", "O driadach", "O elfach", 0, 0);

            insertQuestionBook5(db, "O czym śnił Geralt w Brokilonie?", 0, "o szczurach", "O dzikim gonie", "O Bonharcie", 0, 0);
            insertQuestionBook5(db, "Ile lat miał Cahir?", 0, "20-30", "30-40", "40-50", 0, 0);
            insertQuestionBook5(db, "Skąd pochodzi Cahir?", 0, "Vicovaro", "Metinny", "Maecht", 0, 0);
            insertQuestionBook5(db, "Czyją spiewającą kompanie spotkali Jaskier, Milva i Geralt?", 0, "Zoltana", "Yarpena", "Pangratta", 0, 0);
            insertQuestionBook5(db, "Jakiego zwierzaka miał Zoltan?", 0, "Papugę", "Kota", "Sowę", 0, 0);
            insertQuestionBook5(db, "Jak nazywał się zwierzak Zoltana?", 0, "Duda", "Tenor", "Kenia", 0, 0);
            insertQuestionBook5(db, "Kto z ekipy Zoltana nie był krasnoludem?", 0, "Percival Schuttenbach", "Munro Bruys", "Caleb Stratton", 0, 0);
            insertQuestionBook5(db, "Skąd pochodziły kobiety, które przeprowadzała ekipa Zoltana?", 0, "Kernow", "Dillingen", "Carcano", 0, 0);
            insertQuestionBook5(db, "W co uwielbiały grać krasnoludy, które towarzyszyły Geraltowi?", 0, "w Gwinta", "w Pokera", "w Kości", 0, 0);
            insertQuestionBook5(db, "Co przerwało krasnoludom w graniu?", 0, "Okogłów", "Ghul", "Skolopendromorf", 0, 0);

            insertQuestionBook5(db, "Czym Geralt przegnał potwora, który zaniepokoił krasnoludzką ekipę?", 0, "Chochlą i pokrywką", "Znakiem Ignii", "Znakiem Aard", 0, 0);
            insertQuestionBook5(db, "Jak nazywał się miecz Zoltana?", 0, "Sihill", "Angivare", "Caerme", 0, 0);
            insertQuestionBook5(db, "Jaka zaraza prześladowała zabudowę, w której Geralt pierwszy raz miał okazję przetestować Mahakamski Sihill?", 0, "Czarna ospa", "Catriona", "Grypa", 0, 0);
            insertQuestionBook5(db, "Ile ludzi zabił Geralt używając pierwszy raz Mahakamskiego Sihilla?", 0, "8", "7", "5", 0, 0);
            insertQuestionBook5(db, "Co zabrał Geralt od jednego z maruderów, którego zabił na Puszczańskiej Porębie?", 0, "Buty", "Kurtkę", "Rękawice", 0, 0);

            //35 - a

            insertQuestionBook5(db, "Ludzie powieszeni na drzewie Wisielców, to byli?", 0, "Aedirnczycy", "\"Nilfgardczycy\"", "Temerczycy", 0, 0);
            insertQuestionBook5(db, "Przy jakiej rzece zepsuł się wóz krasnoludów?", 0, "A", "O", "Z", 0, 0);
            insertQuestionBook5(db, "Elfia wieszczka przewidziała Jaskrowi śmierć na?", 0, "w Burdelu", "na Rusztowaniu", "na Stryczku", 0, 0);
            insertQuestionBook5(db, "Gdzie Geralt poznał Regisa?", 0, "na Porębie", "w Fen Carn", "w Lesie", 0, 0);
            insertQuestionBook5(db, "Jaki napis widniał na mieczu Zoltana?", 0, "Na bękarcie skurwysyny", "Na pochybel skurwysynom", "Ku chwale Mahakamu", 0, 0);

            insertQuestionBook5(db, "Czym pachniał Regis?", 0, "Czosnkiem", "Ziołami", "Mandragorą", 0, 0);
            insertQuestionBook5(db, "Kim przedstawiał się Regis?", 0, "Balwierzem", "Cyrulikiem", "Podróżnikiem", 0, 0);
            insertQuestionBook5(db, "Z czego zrobiony był samogon Regisa?", 0, "Balissy", "Mandragory", "Dwugrotu", 0, 0);
            insertQuestionBook5(db, "Jaką wadę miał bimber Regisa?", 0, "Chwilowa ślepota", "Rozmowność", "Chwilowa drętwota", 0, 0);
            insertQuestionBook5(db, "O czym opowiadał Jaskier w chacie Regisa?", 0, "o Strzydze", "o D'jinni", "o Złotym smoku", 0, 0);
            insertQuestionBook5(db, "Z czyjego powodu Zoltan nie chciał wrócić do Mahakamu?", 0, "Addario Bacha", "Brouvera Hooga", "Eudory Breckenriggs", 0, 0);
            insertQuestionBook5(db, "W jakiej górze leży Mahakam?", 0, "Gorgota", "Carbon", "Sinej", 0, 0);
            insertQuestionBook5(db, "Gdzie kobiety z Kernow znalazły swoją rodzinę?", 0, "w Fen Carn", "nad Chotlą", "nad Oz", 0, 0);
            insertQuestionBook5(db, "Na co \"polowali\" chłopi na cmentarzysku?", 0, "Flekkera", "Wąpierza", "Ghule", 0, 0);
            insertQuestionBook5(db, "Czyjego konia chcieli ukraść chłopi na cmentarzysku?", 0, "Geralta", "Milvy", "Jaskra", 0, 0);

            insertQuestionBook5(db, "W jakich okolicznościach Geralt poznał Hectora Laabsa?", 0, "Ataku elfów", "Egzekucji", "Bitwy na moście", 0, 0);
            insertQuestionBook5(db, "Kto jako pierwszy sprzeciwił się publicznej egzekucji w obozie uchodźców?", 0, "Geralt", "Laabs", "Milva", 0, 0);
            insertQuestionBook5(db, "Kto zaproponował sąd boży w obronie \"wiedźmy\"?", 0, "Milva", "Geralt", "Regis", 0, 0);
            insertQuestionBook5(db, "Kto wyjął podkowę z ognia?", 0, "Zoltan", "Regis", "Geralt", 0, 0);
            insertQuestionBook5(db, "Kto wrzucił kapłanowi rozżarzoną podkowę za spodnie?", 0, "Geralt", "Zoltan", "Regis", 0, 0);
            insertQuestionBook5(db, "Kto wtrącił do lochu Geralta i Jaskra?", 0, "Nilfgardczycy", "Cintryjczycy", "Temerczycy", 0, 0);
            insertQuestionBook5(db, "Kto uratował Geralta i Jaskra z niewoli?", 0, "Milva", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, " Kto był łącznikiem Foltesta w korpusie Cintryjskim?", 0, "Vissegerd", "Etcheverry", "Laabs", 0, 0);
            insertQuestionBook5(db, "Kto skazał na śmierć Geralta i Jaskra?", 0, "Etcheverry", "Vissegerd", "Laabs", 0, 0);
            insertQuestionBook5(db, "Którego konia najpierw odbiła Milva?", 0, "Płotkę", "Pegaza", "Karą klacz", 0, 0);

            insertQuestionBook5(db, "Kto uratował Milvę przed wieśniakami?", 0, "Regis", "Cahir", "Zoltan", 0, 0);
            insertQuestionBook5(db, "Gdzie miał zostać porwany i przetransportowany Faoiltiarna?", 0, "do Vedette", "do Nastroga", "do Rozroga", 0, 0);
            insertQuestionBook5(db, "Kto kazał pojmać Isengrima Faoiltiarne?", 0, "Skellen", "Vattier de Rideaux", "Morvran Voorhis", 0, 0);
            insertQuestionBook5(db, "Kto uratował Cahira z Thanned?", 0, "Rience", "Faoiltiarna", "Vilgefotrz", 0, 0);
            insertQuestionBook5(db, "Od kogo wiedźmińska drużyna dowiedziała się, że Ciri nie ma u Emhyra?", 0, "od Regisa", "od Cahira", "od Vissegerda", 0, 0);
            insertQuestionBook5(db, "Jaką czarodziejkę zaprosiła Assire var Anahid do Nilfgardu?", 0, "Myre Baiss", "Fringillę Vigo", "Nine Vivero", 0, 0);
            insertQuestionBook5(db, "Co się stało z Xarthisiusem po tym, jak ten odkrył lokalizację Ciri?", 0, "Został baronem", "Trafił do lochu", "Został zamordowany", 0, 0);
            insertQuestionBook5(db, "Która brygada Nilfgardu starła się z Temerczykami nad Chotlą?", 0, "VII Daerlańska", "Nauzicaa", "Alba", 0, 0);
            insertQuestionBook5(db, "W którym forcie trzymano Geralta i Jaskra?", 0, "Darn Rowan", "Armenia", "Bodrog", 0, 0);
            insertQuestionBook5(db, "Co Regis zrobił ze strażnikami pod celą?", 0, "Zabił ich", "Uśpił ich", "Ogłuszył ich", 0, 0);

            // 70 - b

            insertQuestionBook5(db, "W jaką część ciała Jaskier dostał strzałą?", 0, "w Kolano", "w Ramię", "w Ucho", 0, 0);
            insertQuestionBook5(db, "Co podawano skazańcom przed egzekucją w Drakenborgu?", 0, "Fisstech", "Redańskie mocne", "\"Wytrawnego Dijkstrę\"", 0, 0);
            insertQuestionBook5(db, "Z jakiego komanda był jedyny nie świętujący elf z Drakenborgu?", 0, "Yaevinna", "Faoiltiarny", "Iorwetha", 0, 0);
            insertQuestionBook5(db, "Który z tych elfów nie uczestniczył w zabójstwie Condringhera i Fenna?", 0, "Nazarian", "Schirru", "Echel", 0, 0);
            insertQuestionBook5(db, "Kto stanął w obronie Cahira przed Geraltem?", 0, "Zoltan", "Regis", "Milva", 0, 0);
            insertQuestionBook5(db, "W jakiej wsi Ciri zamordowała człowieka, który naśmiewał się z niej i Mistle?", 0, "Malhoun", "Zazdrość", "Loredo", 0, 0);
            insertQuestionBook5(db, "Dokąd za radą Regisa udała się wiedźmińska drużyna?", 0, "Fano", "Tyffi", "Angrenu", 0, 0);
            insertQuestionBook5(db, "Kto złowił wielką rybę do zupy?", 0, "Geralt", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, "Kogo do loży czarodziejek zaprosiła stokrotka z dolin?", 0, "Francesce Findabair", "Asire var Anahid", "Ide Emean aep Sivney", 0, 0);
            insertQuestionBook5(db, "Kto był zaklęty w nefrytową statuetkę?", 0, "Ida Emean", "Rience", "Yennefer", 0, 0);

            insertQuestionBook5(db, "Kto użył dekompresji artefaktowej na swojej konfraterce?", 0, "Fiippa Eilhart", "Ida Emean aep Sivney", "Francesce Findabair", 0, 0);
            insertQuestionBook5(db, "Która czarodziejka była apolityczna?", 0, "Assire var Anahid", "Francesca Findabair", "Margarita Laux-Antille\n", 0, 0);
            insertQuestionBook5(db, "Na jakim tronie loża chciała posadzić Cirillę?", 0, "Wyzimy", "Tretogoru", "Koviru", 0, 0);
            insertQuestionBook5(db, "Co ukradła Ciri szlachciance z karety?", 0, "Szafir", "Brylant", "Gemme", 0, 0);
            insertQuestionBook5(db, "Ida Emean aep Sivney to?", 0, "Aen Elle", "Aen Seidhe", "Aen Saevherne", 0, 0);
            insertQuestionBook5(db, "Skąd pochodził ukochany Lary Dorren?", 0, "Bremervoord", "Creyden", "Lod", 0, 0);
            insertQuestionBook5(db, "Które z trzech dzieci było bękartem Falki", 0, "Fiona", "Amavet", "Adela", 0, 0);
            insertQuestionBook5(db, "Kto był pierwszym silnym nosicielem genu Lary po Rianon?", 0, "Ludvik", "Vester", "Tauler", 0, 0);
            insertQuestionBook5(db, "Która z tych czarodziejek nie brała udziału w manipulacji genu Lary?", 0, "Francesca Findabair", "Yennefer", "Triss Merigold", 0, 0);
            insertQuestionBook5(db, "Co znalazł Dijkstra w jednej z kryjówek Vilgefotrza?", 0, "Listy od Emhyra", "Rysunki Ciri", "Martwe dziewczynki", 0, 0);

            insertQuestionBook5(db, "Kto był koronerem Emhyra?", 0, "Vattier de Rideaux", "Morvran Voorhis", "Stefan Skellen", 0, 0);
            insertQuestionBook5(db, "Kto wynajął Bonharta w celu zabicia Falki?", 0, "Berengar Leuvaarden", "Nissirowie", "Stefan Skellen", 0, 0);
            insertQuestionBook5(db, "Kto pomógł uciec Yennefer ze spotkania loży czarodziejek?", 0, "Triss Merigold", "Keira Metz", "Fringilla Vigo", 0, 0);
            insertQuestionBook5(db, "Jak miał na imię bajarz opowiadający o przydodach Geralta, Ciri i Yennefer?", 0, "Jaskier", "Draig Bon-Dhu", "Pogwizd", 0, 0);
            insertQuestionBook5(db, "Co Geralt odpowiedział zapytany, czy dałby radę zabić Regisa?", 0, "Że da", "Że nie da", "Że nie wie", 0, 0);
            insertQuestionBook5(db, "Ile lat Regis leżał w grobie, ubity przez wieśniaków?", 0, "200", "100", "50", 0, 0);
            insertQuestionBook5(db, "Jak nazywa się bagnista depersja w meandrze Jarugi w Dolnym Angrenie?", 0, "Brann", "Jord", "Ysgith", 0, 0);
            insertQuestionBook5(db, "Który krasnolud z ekipy Zoltana umarł ubity przez Nilfgardczyków nad Iną?", 0, "Munro Bruy", "Figgis Merluzzo", "Caleb Stratton", 0, 0);
            insertQuestionBook5(db, "Który król północy prowadził rajdy na terenie Cesartwa Nilfgardu?", 0, "Foltest", "Henselt", "Meve", 0, 0);
            insertQuestionBook5(db, "Gdzie obrabowały kupca krasnoludy Zoltana?", 0, "Claremont", "Vengerbergu", "Dillingen", 0, 0);

            insertQuestionBook5(db, "Gdzie Zoltan podarował Sihilla Geraltowi?", 0, "w Obozie pod Chochlą", "na Porębie", "w Angrenie", 0, 0);
            insertQuestionBook5(db, "Jaki był powód rezygnacji Geraltaz podróży przez Ysgith?", 0, "Wojska Nilfgardu", "Potwory", "Ciąża Milvy", 0, 0);
            insertQuestionBook5(db, "Kto poprowadził razem z Geraltem wojska Lyrii i Rivii w zwycięskiej bitwie pod Czerwona Binduga?", 0, "Ludvik", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, "W jaki sposób Milva poroniła?", 0, "Od dekoktu Regisa", "Przez walkę na uroczysku", "Przez bitwę o most", 0, 0);
            insertQuestionBook5(db, "o było \"Chrzestem ognia\"?", 0, "Podkowa Regisa", "Bitwa pod Chochlą", "Bitwa o most", 0, 0);
            //105 - c

            // WIEŻĄ JASKÓLKI

            insertQuestionBook6(db, "Równonoc wiosenna to?", 0, "Birke", "Velen", "Midinvaerne", 0, 0);
            insertQuestionBook6(db, "Równonoc jesienna to?", 0, "Velen", "Birke", "Midaete", 0, 0);
            insertQuestionBook6(db, "Przesilenie zimowe to?", 0, "Midinvaerne", "Midaete", "Birke", 0, 0);
            insertQuestionBook6(db, "Przesilenie letnie to?", 0, "Midaete", "Midinvaerne", "Velen", 0, 0);
            insertQuestionBook6(db, "Na jakiej wyspie była świątynia Freyji?", 0, "Hindarsfjall", "Spikeroog", "Ard Skellig", 0, 0);
            insertQuestionBook6(db, "Ile dni po równonocy jesiennej Vysogota znalazł umierającą Ciri?", 0, "4", "5", "7", 0, 0);
            insertQuestionBook6(db, "Skąd pochodzi Vysogota?", 0, "Corvo", "Lan Exeter", "Gulety", 0, 0);
            insertQuestionBook6(db, "Jakie zwierzę posiadał Vysogota?", 0, "Kozę", "Kota", "Papugę", 0, 0);
            insertQuestionBook6(db, "Jak nazywał się koń Ciri?", 0, "Kelpie", "Cantarella", "Pegaz", 0, 0);
            insertQuestionBook6(db, "Jaki tatuaż zrobiła sobie Ciri?", 0, "Różę", "Mistle", "Kasjopeję", 0, 0);

            insertQuestionBook6(db, "Gdzie znajduje się chata Vysogoty?", 0, "w Ebbing", "w Attre", "w Vicovaro", 0, 0);
            insertQuestionBook6(db, "Bliznę na twarzy Ciri zostawił?", 0, "Skellen", "Vattier de Rideaux", "Bonhart", 0, 0);
            insertQuestionBook6(db, "Kto ostrzegł szczurów przed Bonhartem?", 0, "Hotsporn", "Almavera", "Pogwizd", 0, 0);
            insertQuestionBook6(db, "Kto wykonał tatuaże Ciri i Mistle?", 0, "Almavera", "Hotsporn", "Pogwizd", 0, 0);
            insertQuestionBook6(db, "Do kogo należała Kelpie?", 0, "Hotsporna", "Almavery", "Vysogoty", 0, 0);
            insertQuestionBook6(db, "Kto postrzelił Hotsporna?", 0, "Grasanci", "Scoia'tael", "Bonhart", 0, 0);
            insertQuestionBook6(db, "Czym Bonhart ucinał głowy szczurów?", 0, "Piłą", "Mieczem", "Nożem", 0, 0);
            insertQuestionBook6(db, "Który szczur umarł pierwszy?", 0, "Reef", "Mistle", "Giselhert", 0, 0);
            insertQuestionBook6(db, "Jakie oczy miał Bonahart?", 0, "Rybie", "Kocie", "Lwie", 0, 0);
            insertQuestionBook6(db, "Kto opowiadał o wydarzeniach po bitwie o most?", 0, "Jaskier", "Podgwizd", "Draig Bon-Dhu", 0, 0);

            insertQuestionBook6(db, "Czy ktoś poza Geraltem został pasowany na rycerza przez Meve?", 0, "Nikt", "Regis", "Cahir", 0, 0);
            insertQuestionBook6(db, "Kto ukradł muła z obozu Meve?", 0, "Regis", "Cahir", "Milva", 0, 0);
            insertQuestionBook6(db, "Jakie imię nadano wołowi?", 0, "Draakul", "Baldur", "Wierna", 0, 0);
            insertQuestionBook6(db, "Ile cali w talii ma Triss?", 0, "22", "23", "24", 0, 0);
            insertQuestionBook6(db, "Kto śnił o Yennefer?", 0, "Jaskier", "Regis", "Geralt", 0, 0);
            insertQuestionBook6(db, "Gdzie została wyrzucona Yennefer przez portal z Montecalvo?", 0, "Spikeroog", "Ard Skellige", "Hindarsfjall ", 0, 0);
            insertQuestionBook6(db, "Ile lat miał Jaskier, kiedy zaczął swoją przygodę z poecją dla kontessy De Stael?", 0, "19", "22", "24", 0, 0);
            insertQuestionBook6(db, "Kto był szefem Nilfgardzkich oddziałów specjalnych?", 0, "Vattier de Rideaux", "Stefan Skellen", "Shilard Fitz-Oesterlen", 0, 0);
            insertQuestionBook6(db, "Kto był kochanką Vattiera de Rideaux?", 0, "Carthia van Canten", "Fringilla Vigo", "Vreemde", 0, 0);
            insertQuestionBook6(db, "Dla kogo szpiegowała Cantarella?", 0, "Assire var Anahid", "Fringilli Vigo", "Filippy Eilhart", 0, 0);

            insertQuestionBook6(db, "Dokąd podróżowała wiedźmińska kompania, myśląc że znajdują się tam druidzi?", 0, "Caed Dhu", "Caed Myrkvid", "Corvo", 0, 0);
            insertQuestionBook6(db, "Dokąd przenieśli się druidzi przez wojnę?", 0, "Caed Myrkvid", "Caed Dhu", "Corvo", 0, 0);
            insertQuestionBook6(db, "Jakiego naczelnego świadka walki Bonharta ze szczurami pojmali ludzie Skellena?", 0, "Nycklara", "Hotsporna", "Pogwizda", 0, 0);
            insertQuestionBook6(db, "W jakiej karczmie jadł Bonhart, kiedy mierzył się ze szczurami?", 0, "Pod głową Himery", "Pod głową Viverny", "Pod głową Bazyliszka", 0, 0);
            insertQuestionBook6(db, "Kto dowodził grupie czujnej?", 0, "Neratin Czeka", "Nycklar", "Bonhart", 0, 0);

            //35 a
            insertQuestionBook6(db, "Jaki łowca nagród rządał wydania Ciri od Bonharta?", 0, "Nycklar", "Imbra", "Neratin Czeka", 0, 0);
            insertQuestionBook6(db, "Gdzie Bonhart kupił miecz dla Ciri?", 0, "w Claremont", "w Fano", "w Dillingen", 0, 0);
            insertQuestionBook6(db, "Kto wykonal miecz Ciri?", 0, "Imbra", "Eszter Hazy", "Neck", 0, 0);
            insertQuestionBook6(db, "Gdzie umarl Neratin Czeka?", 0, "Claremont", "Goworożec", "Geso", 0, 0);
            insertQuestionBook6(db, "Gdzie leżała arena?", 0, "w Fano", "w Claremont", "w Geso", 0, 0);

            insertQuestionBook6(db, "Jak nazywał się kuzyn Bonharta?", 0, "Leuvaarden", "Houvenaghel", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "Bonhart zmierzył się z Ciri na arenie?", 0, "Bonhart", "Stavro", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "Gdzie do wiedźmińskiej drużyny dołączyła Angoulême?", 0, "Amarillo", "Riedbrune", "Beauclair", 0, 0);
            insertQuestionBook6(db, "Kto pojmał Angoulême?", 0, "Słowik", "Fulko", "Almavera", 0, 0);
            insertQuestionBook6(db, "Kogo Geralt nie chciał wziąć do polowania na hanzę Słowika?", 0, "Milvy", "Cahira", "Angoulême", 0, 0);
            insertQuestionBook6(db, "Kto przerwał bijatykę Geralta i Cahira?", 0, "Regis", "Milva", "Jaskier", 0, 0);
            insertQuestionBook6(db, "Gdzie miała odbyć się zasadzka hanzy Słowika na wiedźmina?", 0, "Amarillo", "Belhaven", "Riedbrune", 0, 0);
            insertQuestionBook6(db, "Kto był informatorem Angoulême na wykopkach?", 0, "Homer Straggen", "Golan Drozdeck", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "W której kopalni przebywał Schirrú? ", 0, "Stara Ruda", "Rialto", "Fortunna dziurka", 0, 0);
            insertQuestionBook6(db, "Kto \"przejął\" medalion Geralta?", 0, "Słowik", "Schirrú", "Rience", 0, 0);

            insertQuestionBook6(db, "Dlaczego Cahir przyłączył się do Geralta?", 0, "Za uratowanie życia", "Kochał Ciri", "Chciał łaski cesarza", 0, 0);
            insertQuestionBook6(db, "Jaki tytuł nosiła przywódczyni druidzkiego kręgu?", 0, "Hierofantka", "Flaminika", "Bleobherise", 0, 0);
            insertQuestionBook6(db, "Który potwór zaatakował Geralta podczas jego próby w jaskini?", 0, "Barbegazi", "Pukacz", "Archespor", 0, 0);
            insertQuestionBook6(db, "Kogo Geralt spotkał w jaskini do której Regi kazał mu wejść bez broni?", 0, "Druidów", "Avallac'ha", "Schirrú", 0, 0);
            insertQuestionBook6(db, "Jak ma na imię Avallac'h?", 0, "Bréacc", "Crevan", "Auberon", 0, 0);
            insertQuestionBook6(db, "Jak nazywa się elfi cmentarz w jaskini pod Gorgoną?", 0, "Tir ná Muinne", "Tir ná Béa Arainne", "Tir ná Haemlet", 0, 0);
            insertQuestionBook6(db, "Kto zabił Schirrú?", 0, "Geralt", "Druidzi", "Cahir", 0, 0);
            insertQuestionBook6(db, "Jak miał na imię błędny rycerz, któremu Geralt uratował życie nieopodal druidzkiego kręgu?", 0, "Palmerin de Launfal", "Reynart de Bois-Fresnes", "Milton de Peyrac-Peyran", 0, 0);
            insertQuestionBook6(db, "Jaki tytuł szlachecki posiadał Julian Alfred Pankratz?", 0, "Hrabia", "Wicehrabia", "Baron", 0, 0);
            insertQuestionBook6(db, "Kto był kochanką Jaskra w Toussaint?", 0, "Baronowa", "Xiężna", "Szlachcianka", 0, 0);

            insertQuestionBook6(db, "Jak miała na imię królowa Koviru?", 0, "Heloiza", "Zuleyka", "Gaudemuda", 0, 0);
            insertQuestionBook6(db, "Ile lat trwało małżeństwo władców Koviru?", 0, "14", "29", "21", 0, 0);
            insertQuestionBook6(db, "Ile bizantów chciał pożyczyć Dijkstra od Esterada Thyssena?", 0, "100 000", "1 000 000", "500 000", 0, 0);
            insertQuestionBook6(db, "Po ilu dniach Nilfgard zerwał pakt z Temerią?", 0, "10", "16", "19", 0, 0);
            insertQuestionBook6(db, "Kto dowodził grupą operacyjną \"Verden\"?", 0, "Ardala aep Dahy", "Joachim de Wett", "Morvran Voorhis", 0, 0);
            insertQuestionBook6(db, "Kto dowodził grupą armii \"Środek\" w czasie II wojny Nilfgaardu z Nordlingami?", 0, "Morvran Voorhis", "Menno Coehoorn", "Joachim de Wett", 0, 0);
            insertQuestionBook6(db, "Kto dowodził grupą armii \"Wschód\"? ", 0, "Joachim de Wett", "Ardala aep Dahy", "Morvran Voorhis", 0, 0);
            insertQuestionBook6(db, "Adam Pangratt był więźniem?", 0, "Redanii", "Koviru", "Aedirn", 0, 0);
            insertQuestionBook6(db, "Jak miała na imię słodka trzpiotka?", 0, "Hanna", "Julia", "Cecylia", 0, 0);
            insertQuestionBook6(db, "Dla kogo szpiegowała królowa Zuleyka?", 0, "Filippy Eilhart", "Sheali de Tancarville", "Keiry Metz", 0, 0);

            //70 b

            insertQuestionBook6(db, "Po ilu latach wezwano Cracha an Craite do wypełnienia przysięgi którą złożył królowej Calanthe?", 0, "5", "7", "10", 0, 0);
            insertQuestionBook6(db, "Czy Yennefer wierzyła w to, że Geralt odnajdzie Ciri?", 0, "Nie mówiła", "Tak", "Nie", 0, 0);
            insertQuestionBook6(db, "Skąd Yennefer wzieła brylant potrzebny do budowy megaskopu?", 0, "Spikeroog", "Ard Skellige", "Hindarsfjall", 0, 0);
            insertQuestionBook6(db, "Jak nazywał się brylant z naszyjnika zdobiący szyję posągu Freyji?", 0, "Brisinger", "Brisingr", "Brisingamen", 0, 0);
            insertQuestionBook6(db, "Jak ma na imię Freyja?", 0, "Marita", "Mara", "Modron", 0, 0);
            insertQuestionBook6(db, "Kto był przewodniczącym komisji badającej ślady teleportacyjne po puczu na Thanned?", 0, "Immanuel Benavent", "Moritz Diefenthel", "Radcliffe", 0, 0);
            insertQuestionBook6(db, "Kto przybył na Skellige w poszukiwaniu Yennefer?", 0, "Filippa Eilhart", "Margarita Laux-Antille", "Triss Merigold", 0, 0);
            insertQuestionBook6(db, "Kto był \"narzeczonym\" Ciri z dzieciństwa?", 0, "Tankred Thyssen", "Windhalm", "Hjalmar an Craite", 0, 0);
            insertQuestionBook6(db, "W jakiej wsi puszczyk zdemaskował Rienca?", 0, "Claremont", "Riedbrune", "Goworożec", 0, 0);
            insertQuestionBook6(db, "Co Ciri zabrała z rzeczy córki Vysogoty?", 0, "Grzebień", "Lusterko", "Łyżwy", 0, 0);

            insertQuestionBook6(db, "Gdzie Ciri zabiła 4 bandytów o których opowiedział jej Vysogota?", 0, "Goworożecu", "Belhaven", "Dun Dare", 0, 0);
            insertQuestionBook6(db, "Kto był szpiegiem Vattiera de Rideaux w drużynie Puszczyka?", 0, "Dede Vargas", "Boreas Mun", "Neratin Ceka", 0, 0);
            insertQuestionBook6(db, "Jak nazywała się czujna służąca dla Stefana Skellena?", 0, "Jediah", "Dufficey", "Kenna", 0, 0);
            insertQuestionBook6(db, "Z jakiego powodu Jarre chciał walczyć z Nilfgardem?", 0, "Za ojczyznę", "Za honor", "Za Ciri", 0, 0);
            insertQuestionBook6(db, "Kto przywitał Yennefer jako pierwszy na zamku Stygga?", 0, "Vilgefotrz", "Shirru", "Rience", 0, 0);
            insertQuestionBook6(db, "Kogo wyskanowała podczas tortur Yennefer dla Vilgefotrza?", 0, "Ciri", "Lożę Carodziejek", "Geralta", 0, 0);
            insertQuestionBook6(db, "Który z ludzi puszczyka nie zdezerterował nieopodal wieży jaskółki?", 0, "Joanna Selborne", "Yuz Jannowitz", "Boreas Mun", 0, 0);


            // 87 - C


            // PANI JEZIORA
            insertQuestionBook7(db, "Gdzie udała się Ciri po pobycie w Rivii?", 0, "Camelotu", "Toussaint", "Nie wiadomo", 0, 0);
            insertQuestionBook7(db, "Który rycerz wziął Ciri za Panią Jeziora?", 0, "Galahad", "Malagant", "Parsifal", 0, 0);
            insertQuestionBook7(db, "Jak nazywała się Pani Jeziora, badaczka histori Cirilli i Geralta?", 0, "Nimue", "Mozaik", "Wyrwa", 0, 0);
            insertQuestionBook7(db, "Jak nazywała się orejnomantka zaproszona przez Panią Jeziora?", 0, "Condwiramurs Tilly", "Mozaik", "Nimue", 0, 0);
            insertQuestionBook7(db, "Jaki pseudonim posiadała Nimue?", 0, "Łokietek", "Corine", "Krzywoustna", 0, 0);
            insertQuestionBook7(db, "Jakiego obrazu nie posiadała w kolekcji Pani Jeziora?", 0, "Portretu Ciri", "Jaskra i Eithné", "Bitwy pod Brenną", 0, 0);
            insertQuestionBook7(db, "Skąd Nimue poznała historię Geralta i Ciri?", 0, "od Bajarza", "Kronik", "Książek ", 0, 0);
            insertQuestionBook7(db, "Podczas jakiej czynności Nimue ujrzała teleportującą się Ciri?", 0, "Sexu", "Czytania", "Posiłku", 0, 0);
            insertQuestionBook7(db, "\"Nikt od Jarugi po Buinę nie ma tak pięknego tyłka jak ty\" - czyje to słowa?", 0, "Geralta", "Jaskra", "Cahira", 0, 0);
            insertQuestionBook7(db, "Komu Bonhart jako pierwszemu pochwalił się swoją kolekcją wiedźmińskich medalionów?", 0, "Yennefer", "Ciri", "Vilgefotrzowi", 0, 0);

            insertQuestionBook7(db, "Kto próbował zgwałcić Yennefer na zamku Stygga?", 0, "Bonhart", "Rience", "Vilgefortz", 0, 0);
            insertQuestionBook7(db, "Na jakiego potwora Geralt polował dla rządcy Vermentino?", 0, "Kuroliszka", "Gryfa", "Oszluzga", 0, 0);
            insertQuestionBook7(db, "Jak nazywał się koń Reynarta de Bois-Fresnes?", 0, "Bucał", "Mara", "Skoczka", 0, 0);
            insertQuestionBook7(db, "Co było powodem śmierci ksiącia Rajmunda?", 0, "Apopleksja", "Trucizna ", "Bandyci", 0, 0);
            insertQuestionBook7(db, "W jakiej okoliczności poznali się Geralt i Fringilla Vigo?", 0, "Święto kadzi", "Prywatna audiencja", "Bal", 0, 0);
            insertQuestionBook7(db, "Jaki zapach charakteryzował Fringillę Vigo?", 0, "Ambra i Róże", "Frezje i Morele", "Piżmo i Olejki", 0, 0);
            insertQuestionBook7(db, "Kto był kuzynem Anny Henrietty?", 0, "Emchyr", "Ethain z Cidaris", "Foltest", 0, 0);
            insertQuestionBook7(db, "Który rycerz zaoferował Geraltowi pieniądze za nie zabijanie sukkuba?", 0, "Palmerin de Launfal", "Grégoire z Gorgon", "Reynart de Bois-Fresnes", 0, 0);
            insertQuestionBook7(db, "Kto pomagał Geraltowi w wertowaniu księgozbiorów Anny Henrietty?", 0, "Fringilla", "Regis", "Jaskier", 0, 0);
            insertQuestionBook7(db, "Gdzie Geralt i Fringilla pierwszy raz się kochali?", 0, "w Bibliotece", "Na święcie kadzi", "w Sypialni", 0, 0);

            insertQuestionBook7(db, "Jak Jaskier nazywał Anne Henriettę?", 0, "Łasiczką", "Anarietką", "Cyraneczką", 0, 0);
            insertQuestionBook7(db, "Kto oświadczył się Milvie w Toussaint?", 0, "Amadis de Trastamara", "Reynart de Bois-Fresnes", "Palmerina de Launfal", 0, 0);
            insertQuestionBook7(db, "Od kogo Geralt otrzymał nowy medalion?", 0, "Fringilli Vigo", "Reynarta de Bois-Fresnes", "Palmerina de Launfal", 0, 0);
            insertQuestionBook7(db, "Gdzie odbyło się spotkanie spiskowców przeciwko Emchyrowi?", 0, "w Toussaint", "w Attre", "w Nastrogu", 0, 0);
            insertQuestionBook7(db, "Jak miał na imię Korred, który złapał Geralta w pułapkę?", 0, "Szwajcer", "Garred", "Skoffin", 0, 0);
            insertQuestionBook7(db, "Co kazały Geraltowi zrobić potwory z podziemi Toussaint, żeby te \"puściły go wolno\"?", 0, "Złamać miecz", "Oddać medalion", "Jedno i drugie", 0, 0);
            insertQuestionBook7(db, "Fringilla zapytała Geralta gdzie przebywa Vilgefotrz. Co jej odpowiedział?", 0, "Rhys-Rhun", "Stygga", "Montecalvo", 0, 0);
            insertQuestionBook7(db, "Jaka rasa była niewolnikami dla Aen Elle?", 0, "Ludzie", "Krasnoludy", "Gnomy", 0, 0);
            insertQuestionBook7(db, "Jak miał na imię król dzikiego gonu?", 0, "Auberon Muircetach", "Eredin", "Nithral", 0, 0);
            insertQuestionBook7(db, "Czego chciał dziki gon od Ciri?", 0, "Dziecka", "Krwii", "Ukraść moc", 0, 0);

            insertQuestionBook7(db, "Kto był śmiertelnym wrogiem ludu olch?", 0, "Jednorożce", "Ludzie", "Gnomy", 0, 0);
            insertQuestionBook7(db, "Kto miał być ojcem dziecka Cirilli?", 0, "Auberon Muircetach", "Eredin", "Crevan Espane", 0, 0);
            insertQuestionBook7(db, "Który Aen Elle grał na flecie?", 0, "Crevan Espane", "Nithral", "Eredin", 0, 0);
            insertQuestionBook7(db, "Jak Vysogota nazywał Ciri?", 0, "Gwiazdooka", "Zirael", "Uroboros", 0, 0);
            insertQuestionBook7(db, "Kto powiedział Ciri prawdę o tym, że nigdy nie opuści lud Aen Elle?", 0, "Eredin", "Crevan Espane", "Imlerith", 0, 0);
            //35 - a

            insertQuestionBook7(db, "Co miało być dla Ciri alternatywą, gdyby Auberon \"nie podołał\"?", 0, "Eredin", "Laboratorium Crevana", "Caranthir", 0, 0);
            insertQuestionBook7(db, "Kto pomógł Ciri uciec z krainy Aen Elle?", 0, "Avallac'h", "Ihuarraquax", "Shiadhal", 0, 0);
            insertQuestionBook7(db, "Kto otruł króla olch?", 0, "Nithral", "Eredin", "Imlerith", 0, 0);
            insertQuestionBook7(db, "Kto stanął na drodze Ciri, gdy ta próbawała uciec z krainy Aen Elle?", 0, "Caranthir", "Eredin", "Imlerith", 0, 0);
            insertQuestionBook7(db, "Jaką chorobę Ciri sprowadziła skacząc między wymiarami?", 0, "Malarię", "Catrionę", "Grypę", 0, 0);

            insertQuestionBook7(db, "Jak nazywał się stary \"druch\" Jarrego z Ellander, który uratował go od napaści?", 0, "Ograbek", "Melfi", "Klaproth", 0, 0);
            insertQuestionBook7(db, "Co oznacza skrót BPP?", 0, "Bezczelna Pierdolona Piechota", "Biedna Pierdolona Piechota", "Beznadziejna Pierdolona Piechota", 0, 0);
            insertQuestionBook7(db, "Kto był dowówdcą BPP?", 0, "Okultich", "Bronibor", "Milten", 0, 0);
            insertQuestionBook7(db, "tóry krasnolud przyłapał Jarrego w wyzimie?", 0, "Zoltan Chivay", "Dennis Cranmer", "Yarpenem Zigrin", 0, 0);
            insertQuestionBook7(db, "Od jakiej broni umarł Coen?", 0, "Halabardy", "Gizarmy", "Włóczni", 0, 0);
            insertQuestionBook7(db, "Kto ostatecznie wskazał Cirilli właściwe miejsce i czas?", 0, "Yennefer", "Nimue", "Konik", 0, 0);
            insertQuestionBook7(db, "Czy Ciri przeniosła się do Geralta, ale przez pomyłkę uznała że to złe miejsce i czas?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook7(db, "Kim był leśny dziadek, na którego natrafiła Ciri?", 0, "Druidem", "Kanibalem", "Myśliwym", 0, 0);
            insertQuestionBook7(db, "Jak początkowo mówiono o Bitwie pod Brenną?", 0, "Pod Chochlą", "Pod Starymi Pupami", "Pod Bindugą", 0, 0);
            insertQuestionBook7(db, "Jak miała na imię Słodka Trzpiotka?", 0, "Anna", "Julia", "Maria", 0, 0);

            insertQuestionBook7(db, "Który wiedźmin wziął udział w Bitwie pod Brenną?", 0, "Lambert", "Coen", "Letho", 0, 0);
            insertQuestionBook7(db, "Jak miał na imię legendarny lekarz, który ratował rannych pod Brenną?", 0, "Shani", "Rusty", "Finn", 0, 0);
            insertQuestionBook7(db, "Kto był głównodowodzącym Nordlingów podczas bitwy pod Brenną?", 0, "Foltest", "Jan Natalis", "Daniel Etcheverry", 0, 0);
            insertQuestionBook7(db, "Kto był głównodowodzącym Cesarstwa podczas bitwy pod Brenną?", 0, "Joachim de Wett", "Menno Coehoorn", "Morvran Voorhis", 0, 0);
            insertQuestionBook7(db, "Kto dowodził krasnoludzkim hufcem pod Brenną?", 0, "Sheldon Skaggs", "Barclay Els", "Yarpen Zigrin", 0, 0);
            insertQuestionBook7(db, "Która czarodziejka leczyła rannych pod Brenną?", 0, "Lytta Neyd", "Marti Sodergren", "Triss Merigold", 0, 0);
            insertQuestionBook7(db, "Kto dowodził brygadą Vrihedd?", 0, "Iorweth", "Isengrim Faoiltiarna", "Yaevinn", 0, 0);
            insertQuestionBook7(db, "Który elf mordował rannych w szpitalu?", 0, "Iorweth", "Yaevinn", "Isengrim Faoiltiarna", 0, 0);
            insertQuestionBook7(db, "Co zabiło Menno Coehoorna?", 0, "Stryczek", "Bełt z kuszy", "Końskie kopyto", 0, 0);
            insertQuestionBook7(db, "Jaką część ciała stracił Jarre podczas Bitwy pod Brenna?", 0, "Oko", "Rękę", "Nogę", 0, 0);

            // 60 - b

            insertQuestionBook7(db, "Jak miała na imię żona Jarre?", 0, "Julia", "Marylka", "Lucienne", 0, 0);
            insertQuestionBook7(db, "Skąd Ciri znalazła się u Vilgefotrza?", 0, "Puszczyk ją złapał", "Bonhart ją złapał", "Sama przyszła", 0, 0);
            insertQuestionBook7(db, "Kto zasugerował żeby Yennefer patrzyła się na operację, która Vilgefotrz chciał poddać Ciri?", 0, "Rience", "Puszczyk", "Bonhart", 0, 0);
            insertQuestionBook7(db, "Kto przywitał Ciri pierwszy na Stygga?", 0, "Bonhart", "Vilgefortz", "Boreas Mun", 0, 0);
            insertQuestionBook7(db, "Kto wyzwolił Yennefer w Stygga?", 0, "Regis", "Ciri", "Geralt", 0, 0);
            insertQuestionBook7(db, "Jak umarła Milva?", 0, "Od miecza", "Od Vilgefotrza", "Od Strzały", 0, 0);
            insertQuestionBook7(db, "Kto zabił Cahira?", 0, "Vilgefortz", "Skellen", "Bonhart", 0, 0);
            insertQuestionBook7(db, "Kto zabił Regisa?", 0, "Skellen", "Bonhart", "Vilgefortz", 0, 0);
            insertQuestionBook7(db, "Kogo wsparł ostatecznie Puszczyk na Stygga?", 0, "Geralta", "Vilgefotrza", "Nikogo", 0, 0);
            insertQuestionBook7(db, "Jaki plan na życie miała Angouleme?", 0, "Kupiectwo", "Gildię ochroniarzy", "Burdel", 0, 0);


            insertQuestionBook7(db, "Kto zabił Bonharta?", 0, "Geralt", "Alchemik", "Ciri", 0, 0);
            insertQuestionBook7(db, "Za co Geralt miał pretensję do Ciri na Stygga?", 0, "Brak manier", "Morderczy szał", "Obicie bełtu", 0, 0);
            insertQuestionBook7(db, "Jak miał na imię na prawdę Emhyr?", 0, "Roderick", "Patrick", "Duny", 0, 0);
            insertQuestionBook7(db, "Kto powiedział Emhyrowi, żeby ratunku szukał na północy?", 0, "Vilgefotrz", "Ojciec", "Xarthisius", 0, 0);
            insertQuestionBook7(db, "Która czarodziejka nie brała udziału w zniszczeniu zamku Stygga?", 0, "Keira Metz", "Sabrina Glevissig", "Filippa Eilhart", 0, 0);
            insertQuestionBook7(db, "Który król zajął dolną marchię Aedirn i nie chciał jej oddać?", 0, "Foltest", "Radowid", "Henselt", 0, 0);
            insertQuestionBook7(db, "Ilu elfich oficerów wydano Nordlingom po wojnie?", 0, "47", "39", "32", 0, 0);
            insertQuestionBook7(db, "Który elf przyjał pokarm od ludzi ze łzami w oczach?", 0, "Isengrim", "Yaevinn", "Toruviel", 0, 0);
            insertQuestionBook7(db, " Czym było \"wieczyste ruchadło\"?", 0, "Płaskorzeźbą", "Starodawną księgą", "Perpetuum mobile", 0, 0);
            insertQuestionBook7(db, "Komu Geralt chciał przedstawić Ciri wToussaint?", 0, "Palmerinowi", "Miltenowi", "Reynartowi", 0, 0);

            insertQuestionBook7(db, "Kogo wieszano w Toussaint podczas wizyty Geralta i Ciri?", 0, "Sebastiana Le Goff", "Charlesa Lanzano", "Jaskra", 0, 0);
            insertQuestionBook7(db, "Za co Henrietta skazała Jaskra?", 0, "Krzywoprzysięstwo", "Złodziejstwo", "Kurwiarstwo", 0, 0);
            insertQuestionBook7(db, "Gdzie Geralt szykował niespodziankę dla Zoltana i Ciri?", 0, "w Kaer Morhen", "w Verden", "w Rivii", 0, 0);
            insertQuestionBook7(db, "Czyj głos przeważył w głosowaniu o to, czy Ciri spotka się z Geraltem?", 0, "Yennefer", "Keiry Metz", "Filippy Eilhart", 0, 0);
            insertQuestionBook7(db, "Jaka kobieta była odpowiedzialna za bezpośrednią przyczynę wybuchu pogromu w Rivii?", 0, "Anna", "Eliza", "Nadia", 0, 0);
            insertQuestionBook7(db, "Jak się nazywa przyszła małżonka Zoltana?", 0, "Breckesrick", "Breckenrek", "Breckenriggs", 0, 0);
            insertQuestionBook7(db, "Jak nazwano knajpę w Rivii, w której spotkali się Geralt, Zoltan, Yarpen i Jaskier?", 0, "Wiedźmiński obrońca", "Ku pamięci Geralta", "Pod wiedźmińskim mieczem", 0, 0);
            insertQuestionBook7(db, "Udało się komuś kiedykolwiek powtórzyć zaklęcie o nazwie \"Gradobicie Merigold\"?", 0, "Tak", "Brak danych", "Nie", 0, 0);
            insertQuestionBook7(db, "Kogo z umarłych nie było podczas wsiadania Ciri, Geralta i Yennefer na łódź?", 0, "Cahira", "Angouleme", "Regisa", 0, 0);

            // 89 - c

            insertQuestionBook8(db, "Sezon Burz dzieje się po czy przed sagą wiedźmińska?", 0, "Przed", "Po", "Nie wiadomo", 0, 0);
            insertQuestionBook8(db, "My tu jeśteśmy po to żeby potworom przyłomocić\" - czyje to słowa?", 0, "Vesemira", "Geralta", "Lamberta", 0, 0);
            insertQuestionBook8(db, "\"Egzystował nie po to, by jeść i podtrzymywać gatunek. Nie po to go stworzono. Żył po to, by zabijać.\" - jakiego potwora jest to opis?", 0, "Idra", "Gryfa", "Viverny", 0, 0);
            insertQuestionBook8(db, "Geralt podpisał sfałszowane papiery w sprawie wysykości wynagrodzenia. Na ile koron podpisał rachunek?", 0, "80", "70", "60", 0, 0);
            insertQuestionBook8(db, "W jakich klejnotach zdobiła się Koral?", 0, "Rubinach", "Szmaragdach", "Obsydianie", 0, 0);
            insertQuestionBook8(db, "Jaki zapach charakteryzował Lytte Neid?", 0, "Frezji i Morel", "Ambra i Róże", "Piżmo i Olejki", 0, 0);
            insertQuestionBook8(db, "Jak miał na imię władca Kerack?", 0, "Belohun", "Xander", "Elmer", 0, 0);
            insertQuestionBook8(db, "Przez kogo Geralt trafił do lochu?", 0, "Koral", "Egmunda", "Ildiko", 0, 0);
            insertQuestionBook8(db, "Kto nie był synem Belohuna?", 0, "Osmyk", "Xander", "Edmund", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt zostawił swoje miecze?", 0, "w Kordegardzie", "w Karczmie", "u Koral", 0, 0);

            insertQuestionBook8(db, "Kto wstawił się za Geraltem, dzięki czemu udało mu się wejść do ekskluzywnej knajpy?", 0, "Febus Ravenga", "Koral", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt zabił Leukrotę?", 0, "w Cizmar", "w Kerrack", "w Ansegis", 0, 0);
            insertQuestionBook8(db, "Jak nazywa się elegancki lokal z Kerrack?", 0, "Natura Rerum", "Zgraggen", "Tiberghien", 0, 0);
            insertQuestionBook8(db, "Na jakie danie zdecydował się Geralt tuż przed zamknięcemw celi?", 0, "Turbota", "Jagnię", "Wieprzowinę", 0, 0);
            insertQuestionBook8(db, "Ile wynosiła kaucja ustalona za wolność Geralta?", 0, "500 koron", "500 florenów", "500 orenów", 0, 0);
            insertQuestionBook8(db, "Czego Geraltowi nie zarekwirowano po uwolneniu z lochu?", 0, "Płotki", "Gotówki", "Weksli", 0, 0);
            insertQuestionBook8(db, "Co strażniczki chciały odciąć Geraltowi?", 0, "Kuśkę", "Palce", "Język", 0, 0);
            insertQuestionBook8(db, "Kto uratował Geralta przed strażniczkami?", 0, "Jaskier", "Antea Derris", "Febus Ravenga", 0, 0);
            insertQuestionBook8(db, "Kto prowadził sprawę kradzieży mieczy?", 0, "Ferrant de Lettenhove", "Febus Ravenga", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "to wpłacił kaucję za Geralta?", 0, "Koral", "Jaskier", "Yenneer", 0, 0);

            insertQuestionBook8(db, "Od kogo Geralt wie, kto wpłacił za niego kaucję?", 0, "od Jaskra", "od Ferranta", "od Antea", 0, 0);
            insertQuestionBook8(db, "22. Czym Geralt bronił się przed 3 zbirami, którzy napadli jego i Jaskra?", 0, "Klepką", "Kijem", "Sztachetą", 0, 0);
            insertQuestionBook8(db, "Czy Geralt pasował do stereotypowych poglądów Koral?", 0, "trochę", "tak", "nie", 0, 0);
            insertQuestionBook8(db, "Jak miała na imię uczennica Koral?", 0, "Mozaik", "Felicja", "Nina", 0, 0);
            insertQuestionBook8(db, "W jaką suknię ubrała się Koral na 1 spotkanie z Geraltem?", 0, "Białą", "Czarną", "Czerwoną", 0, 0);
            insertQuestionBook8(db, "Co chciała zaproponować Geraltowi Koral za wygranie zakładu?", 0, "Fundusz w knajpie", "Pieniądze", "Swoje towarzystwo", 0, 0);
            insertQuestionBook8(db, "Co Koral zrobiła Mozaice przez drwiny Geralta?", 0, "Wykręciła rękę", "Połamała paznokcie", "Odebrała mowę", 0, 0);
            insertQuestionBook8(db, "akim znakiem Geralt obronił się przed wyzywającym go na pojedynek Rethariusem?", 0, "Aard", "Aksji", "Quen", 0, 0);
            insertQuestionBook8(db, "Jaki kwiat dostała Koral od Geralta?", 0, "Frezje", "Fiołek", "Turkusa", 0, 0);
            insertQuestionBook8(db, "Jaki tatuaż miała Koral?", 0, "Rybę", "Orła", "Rózę", 0, 0);

            insertQuestionBook8(db, "Jak brzmi prawdziwe imię Koral?", 0, "Astrid", "Lytta", "Aik", 0, 0);
            insertQuestionBook8(db, "Który statek jest z Lan Exeter?", 0, "Vertigo", "Albatros", "Echo", 0, 0);
            insertQuestionBook8(db, "Który statek jest z Redanii?", 0, "Albatros", "Tettyda", "Alke", 0, 0);
            insertQuestionBook8(db, "Skąd pochodzi Koral?", 0, "ze Skellige", "z Temerii", "z Povis", 0, 0);
            insertQuestionBook8(db, "Co Geralt ujrzał jako pierwsze w fontannie Lytty?", 0, "Yennefer", "Dziki Gon", "Cintre", 0, 0);
            insertQuestionBook8(db, "Jakiej magii użyła Koral w celu znalezenia mieczy Geralta?", 0, "Dywinacji", "Onejromancji", "Piromancji ", 0, 0);
            insertQuestionBook8(db, "Gdzie udali się Jaskier i Geralt po \"czarach Koral\"?", 0, "Ravelinu", "Alke", "do Cizmar", 0, 0);
            insertQuestionBook8(db, "Jak nazywał się strażnik Wielebnego?", 0, "Mikita", "Astrid", "Irid", 0, 0);
            insertQuestionBook8(db, "Jak miał na imię Wielebny?", 0, "Pyral Pratt", "Zgraggen", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "\"O tym że nie jesteś zbyt mądry już rozmawialiśmy, ale żeby spróbować teraz wyjść.. jesteś za mądry\" - to słowa?", 0, "Wielebnego", "Geralta", "Koral", 0, 0);

            // 40 a

            insertQuestionBook8(db, "Gdzie znaleziono miecze Geralta?", 0, "w Castel Ravello", "w Domu Borsodyc", "w Rissbergu", 0, 0);
            insertQuestionBook8(db, "Z jakim potworem Geralt walczył na arenie?", 0, "Viverną", "Wigilozaurem", "Endriagą", 0, 0);
            insertQuestionBook8(db, "Kto razem z Ferrantem nabrał Geralta udająć swojego brata?", 0, "Xavier", "Egmund", "Viraxas", 0, 0);
            insertQuestionBook8(db, "Ile Geralt dostał rzekomo za wampira?", 0, "1250 orenow", "1000 orenow", "750 orenow", 0, 0);
            insertQuestionBook8(db, "Kto sprzedał Jaskrowi tandetny miecz?", 0, "Aik", "Etna", "Nikefor", 0, 0);
            insertQuestionBook8(db, "Jest ktokolwiek w Rissbergu, kogo do siebie nie zraził Geralt podczas 1 spotkania?", 0, "Ortolan", "Nikt", "Sorel Degerlund", 0, 0);
            insertQuestionBook8(db, "Kto pisał listy do Koral?", 0, "Ortolan", "Pinety", "Dagobert", 0, 0);
            insertQuestionBook8(db, "Głowa jakiego potwora była przedstawiona na tympanomie w Rissbergu?", 0, "Viverny",  "Harpii", "Gryfa", 0, 0);
            insertQuestionBook8(db, "Kto przywitał Geralta na Rissbergu?", 0, "Ortolan", "Pinety", "Sorel", 0, 0);
            insertQuestionBook8(db, "Dlaczego wynalazki Ortolana nie wyszły nigdy z Rissbergu?", 0, "Były prywatne", "Były sabotowane", "Były nieudane", 0, 0);

            insertQuestionBook8(db, "Gdzie stworzono Wigilozaura?", 0, "w Ravelinie", "w Rissbergu", "w Kerack", 0, 0);
            insertQuestionBook8(db, "Kto stworzył wiedźminów?", 0, "Amos var Ypsis", "Alzur", "Bekker", 0, 0);
            insertQuestionBook8(db, "Kto udzielił Geraltowi audiencji w swojej prywatnej komnacie w Rissbergu?", 0, "Ortolan", "Pinety", "Xsara", 0, 0);
            insertQuestionBook8(db, "Jak nazywa się magia przywoływania demonów?", 0, "Demonologia", "Geodecja", "Xardisius", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt patrolował?", 0, "w Ansegis", "Na Pogórzu", "w Ravelinie", 0, 0);
            insertQuestionBook8(db, "Co kazali wiedźminom zrobić ze strachem?", 0, "Pozbyć się go", "Uczyć się od niego", "Ulec mu", 0, 0);
            insertQuestionBook8(db, "Jak miał na imię konetabl z Gorns Velen?", 0, "Tarvix Sandoval", "Frans Torquil", "Stucco Zangenis", 0, 0);
            insertQuestionBook8(db, "W której osiadze Geralt przyłapał sprawcę masakr?", 0, "Nowa Smolarnia", "Sośnica", "Jaworek", 0, 0);
            insertQuestionBook8(db, "Kto był sprawcą masakr?", 0, "Tarvix Sandoval", "Sorel Degerlund", "Ortolan", 0, 0);
            insertQuestionBook8(db, "Jakiej orientacji był Ortolan?", 0, "Obojętnej", "Homoseksualnej", "Heteroseksualnej", 0, 0);

            insertQuestionBook8(db, "Co na prawdę zabijało ludzi na wsiach?", 0, "Potwory", "Hybrydy", "Demon", 0, 0);
            insertQuestionBook8(db, "Czy Ortonal wiedział, kto morduje ludzi?", 0, "Źle wiedział", "Tak", "Nie", 0, 0);
            insertQuestionBook8(db, "Jaką toksyną z jakiego jadu poczęstowano Geralta w niewoli?", 0, "z Mantikory", "z Białych skorpionów", "z Barbegazi", 0, 0);
            insertQuestionBook8(db, "Koło jakiej wsi Geralt uratował wieśniaków przed żołdakami?", 0, "Dębowiec", "Poręby", "Jaworek", 0, 0);
            insertQuestionBook8(db, "Jak miał na imię towarzysz podróży do Novigradu Geralta?", 0, "Roegner de Salm", "Addarion Bach", "Hedwig z Malleore", 0, 0);
            insertQuestionBook8(db, "Kto był właścicielem \"Proroka Liebiody\"?", 0, "Addario Bach", "Kevenard van Vliet", "Pudłorak", 0, 0);
            insertQuestionBook8(db, "Kogo porwała Aguara?", 0, "Vandelle", "Xymene", "Briane", 0, 0);
            insertQuestionBook8(db, "Ile lat miała porwana przez Aguarę dziewczynka? ( Ta poprawna ).", 0, "12", "7", "9", 0, 0);
            insertQuestionBook8(db, "Aguary kradły dzieci jakiej rasy?", 0, "Ludzkiej", "Elfiej", "Mieszanej", 0, 0);
            insertQuestionBook8(db, "Kto \"zabił\" dziecko lisicy?", 0, "Addario Bach", "Parlagi", "Kevenard van Vliet", 0, 0);

            insertQuestionBook8(db, "Po ilu latach odbyło się spotkanie Geralta i Nimue?", 0, "77", "127", "133", 0, 0);
            insertQuestionBook8(db, "Jaka była magiczna moc Aguary?", 0, "Pirokineza", "Iluzja", "Uśpienie", 0, 0);
            insertQuestionBook8(db, "Kto wpadł na pomysł oddania Aguarze \"zaboójcy\"  jej dziecka?", 0, "Parlagi", "Petru Cobbin", "Kevenard van Vliet", 0, 0);
            insertQuestionBook8(db, "Kogo nasłała Aguara na statek porywaczy?", 0, "Selkimore", "Vodyanoi ", "Topielce", 0, 0);
            insertQuestionBook8(db, "Ile razy w roku odbywały się aukcje w domu Borsodych?", 0, "2", "4", "6", 0, 0);
            insertQuestionBook8(db, "Aukcje w  domu Borsodych odbywały się tradycyjnie w?", 0, "Środy", "Piątki", "Niedzielę", 0, 0);
            insertQuestionBook8(db, "Za ilę koron Vivaldi wylicytował bluźnierczą księgę?", 0, "200 0Koron", "2500 Koron", "2700 Koron", 0, 0);
            insertQuestionBook8(db, "Którą z kolei aukcją były miecze Geralta?", 0, "7", "10", "12", 0, 0);
            insertQuestionBook8(db, "Za ile wylicotowany miecz Geralta?", 0, "5000 Koron", "4000 Koron", "4500 Koron", 0, 0);
            insertQuestionBook8(db, "Kto wylicytował miecze Geralta?", 0, "Vivaldi", "Giancardi", "Cianfanelli", 0, 0);


            // 80 b

            insertQuestionBook8(db, "Kto ukradł miecze Geralta?", 0, "Xander", "Pyral Pratt", "Nikefor Muus", 0, 0);
            insertQuestionBook8(db, "Jakk nazywał się wilkołak ocalony przez Geralta?", 0, "Berem", "Niellen", "Otto", 0, 0);
            insertQuestionBook8(db, "Kto uszkodził nogę Torquila?", 0, "Grasanci", "Geralt", "Degerlund", 0, 0);
            insertQuestionBook8(db, "Ile Geralt zapłacił lekarzowi by ten odszedł i nie leczył Torquila?", 0, "50 koron", "40 koron", "30 koron", 0, 0);
            insertQuestionBook8(db, "Kto wręczył Geraltowi świetny miecz?", 0, "Jaskier", "Koral", "Pinety", 0, 0);
            insertQuestionBook8(db, "Gdzie udał się Pinety  po wygnaniu z Rissbergu?", 0, "do Povis", "do Mariboru", "do Nilfgardu", 0, 0);
            insertQuestionBook8(db, "Jak magowie ukarali Degerlunda?", 0, "Śmiercią", "Wygnaniem", "Izolacją", 0, 0);
            insertQuestionBook8(db, "Kto złapał Degerlunda i doprowadził przed sąd czarodziejów?", 0, "Geralt", "Torquil", "Pinety", 0, 0);
            insertQuestionBook8(db, "Kto sfabrykował dowody przeciwko Geraltowi?", 0, "Xander", "Pyral Pratt", "Ferrant", 0, 0);
            insertQuestionBook8(db, " Kto oddał Geraltowi Płotkę?", 0, "Torquil", "Jaskier", "Pinety", 0, 0);

            insertQuestionBook8(db, "Kto rzucił klątwę na złodzieja mieczy Geralta?", 0, "Koral", "Mozaik", "Yennefer", 0, 0);
            insertQuestionBook8(db, "Kto miał zostać królową i żoną Belohunda?", 0, "Lilly", "Edwine", "Ildiko", 0, 0);
            insertQuestionBook8(db,  "Kto porwał Jaskra?", 0, "Ferrant", "Xander", "Edmund", 0, 0);
            insertQuestionBook8(db, "Kto odkrył spisek synów Belohunda?", 0, "Ferrant", "Geralt", "Belohund", 0, 0);
            insertQuestionBook8(db, "Jak nazywał się statek który przybył do Kerrack z najemnikami?", 0, "Gwiazda Południa", "Ringhorn", "Acherontia", 0, 0);
            insertQuestionBook8(db, "Który syn chciał otruć Belohunda dzięki pogrzebaczowi?", 0, "Xander", "Viraxas", "Egmund", 0, 0);
            insertQuestionBook8(db, "Co zabiło Belohunda?", 0, "Apopleksja", "Trucizna", "Medalion", 0, 0);
            insertQuestionBook8(db, "Kto po śmierci Belohunda objął tron w Kerrack?", 0, "Egmund", "Xander", "Vitraxas", 0, 0);
            insertQuestionBook8(db, "Z jaką partnerką Geralt opuścił Kerack?", 0, "Koral", "Yennefer", "Mozaik", 0, 0);
            insertQuestionBook8(db, "Co zakłóciło spokój mieszkańców Kerack?", 0, "Pogrom", "Aguara", "Sztorm", 0, 0);

            insertQuestionBook8(db, "Kto/co zabił/zabiło córkę Pyrala Pratta?", 0, "Geralt", "Degerlund", "Sztorm", 0, 0);
            insertQuestionBook8(db, "Co się stało z nowym wyśmienitym mieczem Geralta?", 0, "Nic", "Zgubił go", "Też mu ukradli", 0, 0);
            insertQuestionBook8(db, "Co zostawił Geralt dla Mozaik na pożegnanie?", 0, "Pieniądze", "Nic", "Kwiaty i Liścik", 0, 0);
            insertQuestionBook8(db, "Jak miał na imię wiedźmin szkoły Kota, od którego Geralt dowiedział się o strzydze?", 0, "Aiden", "Kolgrim", "Brehen", 0, 0);
            insertQuestionBook8(db, "Gdzie Brehen dokonał rzezi?", 0, "w Lyrii", "w Cidaris", "w Lello", 0, 0);
            insertQuestionBook8(db, "Co jest napisane na mieczu Geralta? ", 0, "\"Warownia Starego Morza\"", "\"Biały Wilk\" ", "\"Mój błysk przebije ciemnosci\"", 0, 0);
            insertQuestionBook8(db, "Kto oddał Geraltowi jego miecze na polecenie Yennefer?", 0, "Mozaik", "Nie wiadomo", "Tiziana Frevi", 0, 0);
            insertQuestionBook8(db, "Czy Geralt dowiedział się, że odzyskanie mieczy zawdzięcza Yennefer?", 0, "Nie", "Nie wiadomo", "Tak", 0, 0);
            insertQuestionBook8(db, "Czy córka aguary ostatecznie przeżyła?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);
            insertQuestionBook8(db, " W co zmieniła się Aguara przy ponownym spotkaniu z Geraltem?", 0, "w Cirii", "w Koral", "w Yennefer", 0, 0);

            insertQuestionBook8(db, "Jakiego znaku Geralt uzył na Nimue?", 0, "Aksji", "Heliotropu", "Somne", 0, 0);
            //111


    }
}


