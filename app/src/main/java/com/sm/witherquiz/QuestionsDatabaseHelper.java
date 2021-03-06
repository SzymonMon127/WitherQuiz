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
            //Created By Szymon Mo??

            //SERIAL S1

            insertQuestionSerialS1(db, "Jakiego potwora zabi?? Geralt w Blaviken?", 0, "Kikimor??", "Archespora", "Skolopendromorfa", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wed??ug serialu zaprowadzi?? Geralta do Stregobora?", 0, "Marilka", "Stra??nik", "W??jt", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak naprawd?? mia?? na imi?? Czarodziej, kt??ry podszywa?? si?? pod 'Mistrza Iriona'?", 0, "Stregobor", "Detmold", "Mistrz Irion", "0", 0, 0);
            insertQuestionSerialS1(db, "Z kim w serialu pi?? Geralt w knajpie po przybyciu do Blaviken?", 0, "Z Renfrii", "Z W??jtem", "Z dziwkami", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wypowiada S??owa 'Z??o to z??o Stregoborze...mniejsze...wi??ksze...??rednie..wszystko jedno.'?", 0, "Geralt", "Caldemeyn", "Renfrii", "0", 0, 0);
            insertQuestionSerialS1(db, "O jakim przekle??stwie m??wi?? Stregobor do Geralta?", 0, "Czarnego S??o??ca", "Wilczej Zamieci", "Bia??ego Zimna", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki tytu?? posiada Renfri?", 0, "Ksi????niczka Creyden", "Falka", "Czarna Rayla", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zabra?? Geralt Renfri po jej ??mierci?", 0, "Bro??k??", "Miecz", "Kolczyki", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakie ultimatum zastosowa?? chcia??a Renfri wobec Stregobora?", 0, "Tridamskie", "Tetriandoch", "Cintryjskie", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak?? nagrod?? otrzyma?? Geralt za uratowanie ludzi w Blaviken?", 0, "Ukamieniowanie", "Pieni??dze", "Brawa", "0", 0, 0);
//10
            insertQuestionSerialS1(db, "Jaki tytu?? otrzyma?? Geralt po pobycie w Braviken?", 0, "Rze??nik z Blaviken", "Bia??y wilk", "Bohater z Blaviken", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki by?? pierwszy zabity przez Geralta potw??r?", 0, "Cz??owiek", "Strzyga", "Utopiec", "0", 0, 0);
            insertQuestionSerialS1(db, "Czyje to s??owa 'Gdy si?? przetn?? w palec - krwawi??, gdy si?? przejem - boli mnie brzuch, a gdy kogo?? nienawidz??, bo zabra?? mi ca??e ??ycie - zabijam go.'?", 0, "Renfri", "Yennefer", "Foltest", "0", 0, 0);
            insertQuestionSerialS1(db, "W co gra??a Ciri z dzie??mi na rynku?", 0, "w Hacele", "w Karty", "w Chowanego", "0", 0, 0);
            insertQuestionSerialS1(db, "W kogo wcieli?? si?? w serialu Maciek Musia???", 0, "Lazlo", "Ostrita", "Egana", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto gra?? Geralta?", 0, "Henry Cavill", "Joaquin Phoenix", "Chris Pratt", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto gra?? Cirill???", 0, "Freya Allan", "Marta Bitner", "Anna Shaffer", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak umar??a Calanthe?", 0, "Upadek z okna", "Od Miecza", "Od strza??y", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak umar?? Eist?", 0, "Od strza??y", "Od miecza", "Od topora", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto pr??bowa?? porwa?? Cirill?? z Cintry?", 0, "Cahir", "Shirru", "Lazlo", "0", 0, 0);
//20
            insertQuestionSerialS1(db, "Kto wypowiada s??owa 'Wyno?? si?? z Blaviken Geralt i nigdy nie wracaj'?", 0, "Marilka", "Stregobor", "Caldemeyn", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak ma na imi?? ko?? Geralta?", 0, "P??otka", "Angus", "Baldur", "0", 0, 0);
            insertQuestionSerialS1(db, "Sk??d pseudonim Dzie??ba?", 0, "Nabijania na pal", "Od wygl??du", "Herbu", "0", 0, 0);
            insertQuestionSerialS1(db, "Do kogo Stregobor por??wnywa?? Dzie??b???", 0, "Falki", "Toruviel", "Czarnej Rayli", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto jest Showrunnerem pierwszego sezonu wied??mina?", 0, "S. Hissrich", "T. Morrison", "D. Lessing", "0", 0, 0);
            insertQuestionSerialS1(db, "Wed??ug serialu kto zabi?? szczura widelcem?", 0, "Marilka", "Geralt", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo pozna??a Yennefer, gdy pierwszy raz u??y??a Magii?", 0, "Istredda", "Fringill??", "Filipp??", "0", 0, 0);
            insertQuestionSerialS1(db, "Za ile sprzedano Yenefer?", 0, "4 Marki", "3 Marki", "2 Marki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto gra?? Yennefer?", 0, "Anya Chalotra", "Anna Buring", "Freya Allan", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto gra?? Jaskra?", 0, "Joey Batey", "Adam Levy", "Jodhi May", "0", 0, 0);
//30
            insertQuestionSerialS1(db, "Gdzie Geralt pozna?? Jaskra?", 0, "W knajpie", "Na rozdro??u", "W lesie", "0", 0, 0);
            insertQuestionSerialS1(db, "Na kogo mia?? polowa?? Geralt na kra??cu swiata?", 0, "Diab??a", "Matikor??", "Kikimor??", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak Jaskier nazwa?? Geralta, przed tym jak dosta?? od niego w brzuch?", 0, "Rze??nikiem z Blaviken", "Bia??ym Wilkiem", "Mutantem", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie szkoli??a si?? Yennefer?", 0, "W Aretuzie", "W Ban Ard", "W Vengerbergu", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaka by??a pierwsza lekcja Yennefer?", 0, "Telekineza", "Alchemia", "Uzdrawianie", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto by?? rektork?? Aretuzy?", 0, "Tissaia", "Filippa", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakim potworem by?? Diabe???", 0, "Silvanem", "Sukkubem", "Elfem", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto nauczy?? Yennefer wymiany my??li?", 0, "Istredd", "Tissaia", "Fringilla", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym Yennefer zaatakowa??a Sabrin?? Glevissig podczas pr??by w Aretuzie?", 0, "B??yskawic??", "Ogniem", "Wod??", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki elf skopa?? Jaskra i z??ama?? mu lutni???", 0, "Toruviel", "Isengrim", "Riordain", "0", 0, 0);

            insertQuestionSerialS1(db, "Dok??d chcia??a uda?? si?? Cirilla, po opuszczeniu Brokilonu?", 0, "Do Skellige ", "Do Temerii", "Do Redanii", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wys??a?? na Geralta skrytob??jc??w?", 0, "Calanthe", "Duny", "Pavetta", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zniszczy?? okr??ty ze Skellige?", 0, "Fringilla", "Cahir", "Vilgefortz", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo zobaczy??a Cirilla w uktrytym przejsciu, kiedy gra??a w Hacele?", 0, "Geralta ", "Lazlo", "Cahira", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto uwi??zi?? Geralta w lochu?", 0, "Eist", "Calanthe", "Duny", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym zajmowa?? si?? Istredd po uko??czeniu nauki?", 0, "Archeologi??", "Politk??", "Uzdrowicielstwem", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Yennefer spotka??a si?? z Istreddem po latach?", 0, "W Nazairze", "W Temerii", "W Attre", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przekona?? Yennefer, aby powroci??a po latach do Aretuzy?", 0, "Vilgefortz", "Tissaia", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Yennefer zabra??a m??ode adeptki, gdy odwiedzi??a Aretuz???", 0, "Do Oran??erii", "Do Tissai", "Do Biblioteki", "0", 0, 0);
            insertQuestionSerialS1(db, "Po kogo wo??a??a Calanthe, gdy leza??a ranna po bitwnie, jednak nie by??o go ju?? w stra??nicy?", 0, "Geralta", "Eista", "Myszowora", "0", 0, 0);
//50 a
            insertQuestionSerialS1(db, "Jak na imi?? ma kr??l elf??w z kra??ca ??wiata?", 0, "Yaevinn", "Filavandrel", "Lorweth", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiego powodu elfy z kra??ca swiata g??odowa??y?", 0, "Potwor??w", "Nie??yznych gleb", "Ludzi", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto podarowa?? Jaskrowi now?? lutni???", 0, "Yaevinn", "Filavandrel", "??ywia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki by?? sekret Yennefer, gdy ta przebywa??a w Aretuzie?", 0, "Lesbijstwo", "P????-elfia krew", "Zakazana magia", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto wybudowa?? Aretuz???", 0, "Ludzie", "Elfy", "Krasnoludy", "0", 0, 0);
            insertQuestionSerialS1(db, "W co Tissaia zmienia??a swoje uczennice?", 0, "??limaki", "W??gorze", "Kraby", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaka jest s??awna piosenka Jaskra?", 0, "Wilcza zamie??", "Toss a coin to the witcher", "Elfi pogrom", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak mia?? na imi?? elf z kt??rym zaprzyjazni??a si?? Ciri?", 0, "Torq", "Dara", "Lazlo", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt zrobi?? z zap??at?? od ch??op??w z Dol Blathanna?", 0, "Kupi?? alkohol", "Odda?? elfom", "Odda?? ch??opom", "0", 0, 0);
            insertQuestionSerialS1(db, "Od kogo Geralt dowiedzia?? si?? o potworze w Temerii?", 0, "Velerada", "Dziwki", "Foltesta", "0", 0, 0);
//60
            insertQuestionSerialS1(db, "Co si?? sta??o z wied??minem, kt??ry chcia?? przed Geraltem zapolowa?? na strzyg???", 0, "Uciek??", "Zabi??a go strzyga", "Powieszono go", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak nazywa?? si?? syn g??rnika podrzegaj??cego do buntu w Temerii?", 0, "Edan", "Mikal", "Chewan", "0", 0, 0);
            insertQuestionSerialS1(db, "Kt??ra czarodziejka pomaga??a Geraltowi w historii ze strzyg???", 0, "Yennefer", "Triss", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt mia?? zrobi?? ze strzyga?", 0, "Zabi??", "Odczarowa??", "Nic", "0", 0, 0);
            insertQuestionSerialS1(db, "Kim by??a strzyga?", 0, "Nikim", "C??rk?? kr??la", "Kr??low??", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto by?? ojcem Addy?", 0, "Demawend", "Foltest", "Ostritt", "0", 0, 0);
            insertQuestionSerialS1(db, "Co musia?? zrobi?? ze strzyg?? Geralt w celu odczarowania jej?", 0, "Wypi?? jej krew", "Sp??dzi?? z ni?? noc", "Przestraszy??", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiej szko??y magii pochodzi?? Istredd?", 0, "Aretuzy", "Ban Ard", "Gredlyn", "0", 0, 0);
            insertQuestionSerialS1(db, "Na jaki tron uda??a sie Yennefer po opuszczeniu Aretuzy?", 0, "Temerri", "Aedirn", "Redanii", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto by?? kr??lem Aedirn, kiedy Yenner opuszcza??a Aretuz???", 0, "Demawend", "Virfuril", "Stennis", "0", 0, 0);
//70
            insertQuestionSerialS1(db, "Co musia??a poswi??ci?? Yennefer w celu przemiany?", 0, "Rodzin??", "P??odno????", "W??ch", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak nazywa??a si?? siostra Foltesta?", 0, "Verena", "Adda", "Meve", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zdradzi?? sekret Yennefer dotycz??cy jej elfiego pochodzenia?", 0, "Sabrina", "Istredd", "Fringilla", "0", 0, 0);
            insertQuestionSerialS1(db, "Do jakiego kr??lestwa chcieli wys??a?? Yennefer, nim ta pow??drowa??a do Aedirn?", 0, "Redanii", "Nilfgardu", "Aedirn", "0", 0, 0);
            insertQuestionSerialS1(db, "Co pomog??o Geraltowi omin???? stra?? Segerina przed Dworzyszczem?", 0, "Miecz", "Kamie??", "Magia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak mia??a na imi?? matka Foltesta?", 0, "Sivney", "Sancia", "Zuleyka", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto rzuci?? kl??tw?? na Add???", 0, "Sancia", "Ostritt", "Foltest", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Geralt ofiarowa?? Foltestowi przed walk?? ze strzyg???", 0, "Dwimerytowy pier??cie??", "Bro??k?? Renfrii", "Amulet", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zrobi??a Geraltowi Adda po trzecim pijaniu koguta?", 0, "Ugryz??a go", "Zadrapa??a go", "Nic", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zamiast Yennefer uda?? si?? do Nilfgardu?", 0, "Sabrina", "Fringilla", "Sheala", "0", 0, 0);
//80
            insertQuestionSerialS1(db, "Kto wr??czy?? Geraltowi zap??at?? za Srzyg???", 0, "Foltest", "Triss", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak si?? nazywa?? las w kt??rym Ciri spotka??a driady?", 0, "Maribor", "Brokilon", "Saska", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak Ciri ma na drugie imi???", 0, "Evra", "Fiona", "Cecilia", "0", 0, 0);
            insertQuestionSerialS1(db, "Jaki potw??r po??kn???? Geralta w ca??o??ci, przez co Jaskier musia?? odda?? jego ubrania do pralni?", 0, "Mantikora", "Selkimora", "Kraken", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto nam??wil Geralta do tego, aby ten uda?? si?? na za??lubiny Pavetty?", 0, "Yennefer", "Jaskier", "Triss", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak  naprawd?? mia?? na imie Je?? z Erlenwaldu?", 0, "Regan", "Duny", "Paulie", "0", 0, 0);
            insertQuestionSerialS1(db, "Dla kogo mia??a pierwotnie zosta?? przeznaczona Pavetta, zgodnie z planami Calanthe?", 0, "Eista", "Cracha", "Lugosa", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo ocali?? Duny przed niechybn?? ??mierci???", 0, "Calanthe", "Kr??la Regnera", "Pavett??", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto by?? matk?? Cirilli?", 0, "Calanthe", "Pavetta", "Egvera", "0", 0, 0);
            insertQuestionSerialS1(db, "Co sie sta??o z Cirill?? po wypiciu wody Brokilonu?", 0, "Zemdla??a", "Nic", "Nic", "0", 0, 0);

            insertQuestionSerialS1(db, "Gdzie Cirilla wypowiedzia??a przepowiedni?? Itliny?", 0, "W Cintrze ", "Na Bagnie", "W Brokilonie", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie odby??a si?? bitwa o wolno???? P????nocy?", 0, "W Cintrze ", "Pod Chocieborzem", "Pod Sodden", "0", 0, 0);
            insertQuestionSerialS1(db, "Kt??ry kr??l p????nocy stan???? do bitwy pod Sodden?", 0, "Radowid", "Foltest", "Stennis", "0", 0, 0);
            insertQuestionSerialS1(db, "Ilu czarodziej??w bra??o udzia?? w Bitwie o Sodden?", 0, "13 ", "22", "17", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak ma na imi?? matka Geralta z Rivii?", 0, "Margarita", "Visenna", "Nie wiadomo", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto dowodzi?? czarodziejami podczas bitwy pod Sodden?", 0, "Yennefer", "Vilgefortz", "Tissaia", "0", 0, 0);
            insertQuestionSerialS1(db, "Kt??ry z tych czarodziej??w odda?? ??ycie w bitwie pod Sodden?", 0, "Triss", "Koral", "Sabrina", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto odrzuci?? kogo, podczas pr??by zjednania si?? po latach. Istredd Yennefer, Yennefer Istredda czy nie by??o takiego spotkania?", 0, "2", "1", "3", "0", 0, 0);
            insertQuestionSerialS1(db, "Czym zajmowa??a si?? matka Geralta?", 0, "Nie wiadomo", "Uzdrowicielstwem", "Archeologi??", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zabija??o g??rnik??w i mieszka??c??w Temerii?", 0, "Vukodlak", "Strzyga", "Wilko??ak", "0", 0, 0);
//100 b
            insertQuestionSerialS1(db, "Podczas za??lubin Pavetty dw??ch m????czyzn k????ci??o si?? o to, kto zabi?? konkretnego potwora. Jakiego?", 0, "Smoka", "Gryfa", "Mantikor??", "0", 0, 0);
            insertQuestionSerialS1(db, "Calanthe nalega??a, ??eby Geralt wykona?? dla niej konkretne zlecenie, na kogo mia??o by???", 0, "Gryfa", "Mantikor??", "Je??a z Erlenwaldu", "0", 0, 0);
            insertQuestionSerialS1(db, "Sk??d pochodzi?? Lord Pelegrin?", 0, "Redanii", "Cintry", "Nilfgardu", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zdje??o kl??tw?? z 'Je??a z Erlenwaldu'?", 0, "Medalion", "Rytua??", "Prawo Niespodzianki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto uratowa?? ??ycie Dunego?", 0, "Eist", "Calanthe", "Geralt", "0", 0, 0);
            insertQuestionSerialS1(db, "W jakim miasteczku przebywa??a Yennefer, gdy pierwszy raz spotka??a Geralta?", 0, "Vengerbergu", "Toussaint", "Rinde", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zosta?? opiekunem Pavetty, aby nauczy?? j?? kontroli nad swoimi zdolno??ciami?", 0, "Yennefer", "Stregobor", "Myszow??r", "0", 0, 0);
            insertQuestionSerialS1(db, "Kiedy Duny posiada?? ludzk?? twarz?", 0, "Po 22", "Po 23", "Po 24", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego Geralt za????da?? jako zap??aty od Je??a z Erlenwaldu?", 0, "Z??ota", "Niczego", "Prawa niespodzianki", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo po??lubi??a Calanthe po kr??lu Regnerze?", 0, "Vilfuira", "Cracha", "Eista", "0", 0, 0);

            insertQuestionSerialS1(db, "Gdzie Yennefer pochowa??a dziecko, kt??rego nie uda??o jej si?? ocalic przed zamachowcem?", 0, "Na Pustyni", "W lesie", "Na pla??y", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo wynaj???? Cahir, w celu wydostania Cirilli z Brokilonu?", 0, "Myszowora", "Cynthie", "Dopplera", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego pragne??a Yennefer najbardziej na ??wiecie?", 0, "Mi??o??ci", "Pieni??dzy", "Potomstwa", "0", 0, 0);
            insertQuestionSerialS1(db, "Co wy??owi?? Geralt z jeziora w czasie 'bezsenno??ci'?", 0, "Pstr??ga", "Amulet", "D??ina", "0", 0, 0);
            insertQuestionSerialS1(db, "Gdzie Geralt pozna?? Yennefer?", 0, "u Istredda", "u Caydemana", "u Berrana", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zobaczy?? Geralt, kiedy pierwszy raz wszed?? do tego samego pomieszczenia, w kt??rym przebywa??a Yennefer?", 0, "Istredda", "Nag?? Yenn", "Orgi??", "0", 0, 0);
            insertQuestionSerialS1(db, "Czyje to s??owa - 'Jakbym kupi?? w karczmie pierogi i odkry??, ??e nie maj?? farszu'?", 0, "Jaskra", "Boholta", "Geralta", "0", 0, 0);
            insertQuestionSerialS1(db, "Jakie by??o pierwsze ??yczenie Geralta?", 0, "'Egzorcyzm'", "Lekarstwo dla Jaskra", "Swi??ty spok??j", "0", 0, 0);
            insertQuestionSerialS1(db, "'??eby?? p??k?? skurwysynu' - kt??re z kolei to by??o ??yczenie Geralta?", 0, "Trzecie", "Pierwsze", "Drugie", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przej???? tron Aedirn po ??mierci kr??la Virfurila?", 0, "Stennis", "Videmont", "Demawend", "0", 0, 0);

            insertQuestionSerialS1(db, "Jakie by??o ostatnie ??yczenie Geralta?", 0, "Zdrowie Jaskra", "Swi??ty spok??j", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Przez kogo Geralt wyl??dowa?? w lochu?", 0, "Berrana", "Jaskra", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Kogo Geralt zla?? paskiem po ty??ku, zanim trafi?? do lochu?", 0, "??lusarza", "Stajennego", "Aptekarza", "0", 0, 0);
            insertQuestionSerialS1(db, "Co ujrza?? Chireadan po spojrzeniu przez po??amane okno?", 0, "??mier??", "Jaskra", "Sex", "0", 0, 0);
            insertQuestionSerialS1(db, "Tea i Vea to imiona?", 0, "Dziwek", "Czarodziejek", "Zerrikanek", "0", 0, 0);
            insertQuestionSerialS1(db, "Na jakiego potwora polowa?? Geralt, gdy uznano go za zmar??ego i pr??bowano okra?????", 0, "Sukkuba", "Viwern??", "Bazyliszka", "0", 0, 0);
            insertQuestionSerialS1(db, "Z jakiego powodu Geralt zdecydowa?? si?? do????czy?? do polowania na smoka?", 0, "Borha", "Pieni??dzy", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak na prawde mia?? na imi?? Borch 3 kawki?", 0, "Villentratanmerth", "Villentretem", " Villentretenmerth", "0", 0, 0);
            insertQuestionSerialS1(db, "Jak mia?? na imi?? Rycerz bez skazy, kt??ry mia?? upolowa?? smoka", 0, "Eikh", "Eyck", "Eieck", "0", 0, 0);
            insertQuestionSerialS1(db, "Podczas jakiej czynno????i zosta?? zabity Eyck?", 0, "Jedzenia", "Spania", "Srania", "0", 0, 0);

            insertQuestionSerialS1(db, "Jakiego potwora zabi?? Eyck?", 0, "Ghula", "Nekkera", "Hirrik??", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto przeprowadzi?? Geralta skr??tem, podczas polowania na smoka?", 0, "Yennefer", "R??bacze", "Krasnoludy", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zrzuci?? lawin?? na poluj??cych na smoka?", 0, "Yennefer", "Geralt", "Borch", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego pilnowa?? smok?", 0, "Wioski", "Skarbu", "Jaja", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto kogo zostawi?? w Rinde? Geralt Yennefer, Yennefer Geralta czy rozstali si?? w innym mie??cie?", 0, "3", "2", "1", "0", 0, 0);
            insertQuestionSerialS1(db, "Czego szuka??a Yennefer, gdy chcia??a upolowa?? smoka?", 0, "Bogactwa", "Geralta", "Lekarstwa", "0", 0, 0);
            insertQuestionSerialS1(db, "Co zdradzi??o Dopplera, kt??ry podszywa?? si?? pod Myszorowa?", 0, "Akcent", "Szal", "Artretyzm", "0", 0, 0);
            insertQuestionSerialS1(db, "Kto zabi?? Boholta?", 0, "Geralt ", "Borch", "Yennefer", "0", 0, 0);
            insertQuestionSerialS1(db, "Co Borch 3 kawki podarowa?? krasnoludom?", 0, "??uski", "Serce", "Z??by", "0", 0, 0);
            insertQuestionSerialS1(db, "Do kogo Geralt wypowiedzia?? s??owa 'Gdybym m??gl prosi?? los jedn?? ????sk??, chcia??bym ??eby mnie od Ciebie mnie uwolni??'?", 0, "Stregobora", "Yennefer", "Jaskra", "0", 0, 0);

//140 c

// GAME 1
            insertQuestionGame1(db, "Ile lat mine??o od czasu pogromu w Rivii do znalezienia Geralta ledwie ??ywego pod Kaer Morhen?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame1(db, "Jak mia?? na imi?? wied??min, kt??ry nie przeszed?? mutacji, zabity przez Magistra?", 0, "Coen", "Leo", "Berengar", 0, 0);
            insertQuestionGame1(db, "Jaki potw??r zaatakowa?? Kaer Morhen?", 0, "Mantikora", "Kikimora", "Przeraza", 0, 0);
            insertQuestionGame1(db, "Calcium equum, bia??a mewa, pazur przerazy, jask????cze ziel??, to sk??adniki na?", 0, "Lekarstwo dla Triss", " Mutagen z przerazy", "Jask????k??", 0, 0);
            insertQuestionGame1(db, "Jak mia?? na imi?? magik z kt??rym zmierzy?? si?? Geralt w Kaer Morhen?", 0, "Azar Javed", "Savolla ", "Magister", 0, 0);
            insertQuestionGame1(db, "Kt??ry ze znanych wied??min??w szko??y wilka by?? nieobecny podczas obrony Kaer Morhen?", 0, "Letho", "Coen", "Berengar", 0, 0);
            insertQuestionGame1(db, "Z kim Geralt m??g?? stoczy?? swoj?? pierwsza walk?? na pi????ci?", 0, "Eskelem", "Lambertem", "Vesemirem", 0, 0);
            insertQuestionGame1(db, "Jak mia?? na imi?? stra??nik bramy do Wyzimy?", 0, "Brogg", "Mikul", "Ostritt", 0, 0);
            insertQuestionGame1(db, "Ile m??zg??w utopc??w gracz musi dostarczy?? Wielebnemu?", 0, "5", "10", "3", 0, 0);
            insertQuestionGame1(db, "Ile krwii ghuli gracz musi dostarczy?? Kalksteinowi?", 0, "3", "5", "10", 0, 0);

            insertQuestionGame1(db, "Wielki ??owczy zleca graczowi na podgodziu zabicie 2 wielkich potwor??w. Nadir by???", 0, "Ghulem", "Topielcem", "Barghestem", 0, 0);
            insertQuestionGame1(db, "Kto jako pierwszy jest w stanie zapozna?? gracza z gr?? w ko??ci?", 0, "Haren Brogg", "Mikul", "Zoltan", 0, 0);
            insertQuestionGame1(db, "Wielki ??owczy zleca graczowi na podgodziu zabicie 2 wielkich potwor??w. Ozzrel by???", 0, "Alghulem", "Ghulem", "Topielcem", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt po raz pierwszy w grze mo??e spotka?? kr??la dzikiego gonu?", 0, "U Aldersberga", "U Wielebnego", "W Kaer Morhen", 0, 0);
            insertQuestionGame1(db, "Jak ma na imi?? kobieta, kt??r?? Geralt w zamian za pomoc mo??e zaprosi?? na sex do m??yna?", 0, "Carmen", "Abigail", "Vesna", 0, 0);
            insertQuestionGame1(db, "Na pogrodziu mo??emy spotka?? kupca, kt??ry daje nam za darmo oreny, sp??acaj??c stary d??ug. Ile ich dostajemy?", 0, "100", "150", "200", 0, 0);
            insertQuestionGame1(db, "Kto wysy??a wied??mina do jaskini ko??o bramy Mariborskiej, w celu odnalezienia przyjaciela?", 0, "Haren Brogg", "Leuvaarden", "Mikul", 0, 0);
            insertQuestionGame1(db, "Ghe'vrath, Kezath i Y'esath to nazwy?", 0, "Zakl????", "Mieczy", "Obelisk??w", 0, 0);
            insertQuestionGame1(db, "W kt??rym rozdziale mo??emy spotka?? p????niej Abigail, je??li uratujemy j?? w rozdziale I?", 0, "IV", "III", "V", 0, 0);
            insertQuestionGame1(db, "Kto z wymienionych pomaga?? Salamandrze?", 0, "Abigail ", "Wielebny", "Leuvaarden", 0, 0);

            insertQuestionGame1(db, "Kto zawiadomi?? stra??nik??w Wyzimy, przez co Geralt trafi?? do lochu?", 0, "Wielebny", "Meis", "Mikul", 0, 0);
            insertQuestionGame1(db, "W lochu Geralt spotka?? wi????nia, kt??ry nie by?? zadowolony ze swoich wsp????wi????ni??w. Gardzi?? on:", 0, "Politycznymi", "Z??odziejami", "Narkomanami", 0, 0);
            insertQuestionGame1(db, "Zlecenie na jakiego potwora da??o Geraltowi wolno?????", 0, "Topielca", "Kuroliszka", "Vivern??", 0, 0);
            insertQuestionGame1(db, "Sk??d pochodzi?? Zygfryd?", 0, "z Wyzimy", "z Lyrii", "z Denesle", 0, 0);
            insertQuestionGame1(db, "Z kim by?? mo??liwy pierwszy ??????kowy romans Geralta, nie wliczaj??c Triss?", 0, "Vesna", "Shani", "Abigail", 0, 0);
            insertQuestionGame1(db, "Kto podszywa?? si?? pod Raymonda Maarloeve?", 0, "Magister", "Azar Javed", "Jakub", 0, 0);
            insertQuestionGame1(db, "W kt??rym roku wyszed?? Wied??min I?", 0, "2006", "2008", "2007", 0, 0);
            insertQuestionGame1(db, "Ile w grze jest rodzaj??w pancerza?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame1(db, "Jak?? nazw?? ma najlepszy srebrny miecz w grze?", 0, "Addan Deith", "Aerondight", "Deithwen", 0, 0);
            insertQuestionGame1(db, "Jak?? nazw?? ma najlepszy stalowy miecz w grze?", 0, "Deithwen", "D'yaebl", "G'valchir", 0, 0);

            insertQuestionGame1(db, "Gdzie gracz zdobywa sw??j pierwszy srebrny miecz?", 0, "W lochu", "w Kaer Morhen", "Na Podgrodziu", 0, 0);
            insertQuestionGame1(db, "Ile rodzaj??w potwor??w wyst??puje w grze?", 0, "39", "47", "53", 0, 0);
            insertQuestionGame1(db, "Jaki jest maksymalny poziom w grze?", 0, "55", "35", "50", 0, 0);
            insertQuestionGame1(db, "Kto dubbingowa?? Geralta w grze?", 0, "Rozenek", "??ebrowski", "Zamachowski", 0, 0);
            insertQuestionGame1(db, "Kto zosta?? prywatnym detektywem wied??mina?", 0, "Meis", "Maarloeve", "Talar", 0, 0);
            insertQuestionGame1(db, "Jakie kwiaty nale??y dostarczyc dla Yarena Bolta?", 0, "Tojad", "Sporysz", "Dwugrot", 0, 0);
            insertQuestionGame1(db, "Geralt w wied??minie I nie mo??e pos??ugiwa?? sie?", 0, "Halabard??", "Sztyletem", "Toporem", 0, 0);
            insertQuestionGame1(db, "W II rozdziale mo??emy spotka?? pod bram?? cmentarn?? kobiet??, kt??r?? nawiedza duch. Jednak mo??emy j?? spotka?? tylko pomi??dzy?", 0, "23:0 - 01:00", "12:00 - 13:00", "18:00 - 22:00", 0, 0);
            insertQuestionGame1(db, "Do kogo nale??a?? srebrny miecz, kt??ry Geralt dostaje na pocz??tku II rozdzialu?", 0, "Berengara", "Lamberta", "Coena", 0, 0);
            insertQuestionGame1(db, "Stara przyw??dczyni duchowa, spo??eczno??ci ceglarskiej zamieszkuj??cej wiosk?? w lesie na bagnach to?", 0, "Vaska", "Babka", "Kvena", 0, 0);

            insertQuestionGame1(db, "Ile obeliskow wystepuje na bagnach?", 0, "12", "8", "10", 0, 0);
            insertQuestionGame1(db, "Czym zosta?? zabity ??wiadek w szpitalu Lebiody?", 0, "Trucizn??", "Sztyletem", "Larwami", 0, 0);
            insertQuestionGame1(db, "Od kogo Geralt mo??e si?? dowiedzie?? o zerrika??skich muchach tse-tse?", 0, "Ogrodnika", "Shani", "Kalksteina", 0, 0);
            insertQuestionGame1(db, "Ile broszur salamandry musia?? dostarczy?? Geralt do Declana Leuvaardena?", 0, "5", "3", "6", 0, 0);
            insertQuestionGame1(db, "Ile k????czy echinops??w Geralt musia?? dostarczy?? ogrodnikowi?", 0, "5", "10", "3", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt pozna?? znak Ignii?", 0, "w Krypcie", "w Jaskini", "Na bagnie", 0, 0);
            insertQuestionGame1(db, "Gdzie Geralt pozna?? znak Yrden?", 0, "w Wie??y", "u Druid??w", "w Jaskini", 0, 0);
            insertQuestionGame1(db, "Od kt??rej godziny do kt??rej Geralt mo??e spotka?? pod kana??ami 'Cwaniaczka', kt??ry zleca mu zadanie zwi??zane z pomoc?? odzyskania pier??cienia rodowego?", 0, "12:00 - 18:00", "06:00 - 12:00", "06:30 - 9:00", 0, 0);
            insertQuestionGame1(db, "Kto wywiesi?? 'zlecenie na topielce'?", 0, "Zygfryd", "Meis", "Kalkstein", 0, 0);
            insertQuestionGame1(db, "Kto wywiesi?? \"zlecenia na wilki\"?", 0, "Meis", "Jean Pierre", "Zygfryd", 0, 0);

            insertQuestionGame1(db, "Vincent Meis zleca graczowi na Wyzimie Klasztornej zabicie 2 wielkich potwor??w. Coccacidium by???", 0, "Kuroliszkiem", "Echinopsem", "Archesporem", 0, 0);
            insertQuestionGame1(db, "Jakie zakl??cie mo??e rzuci?? Triss ne Geralta, je??li dostarczymy jej ksi??ge z wie??y?", 0, "Tarcz?? Alzura", "Piorun Alzura", "Mutacj?? Alzura", 0, 0);
            insertQuestionGame1(db, "Zygfryd zleca zadanie ze zmar??ymi na cmentarzu. Kiedy dostaniemy najwi??ksz?? nagrod??? Kiedy zabijemy potwora, pobiegniemy za elfami czy uratujemy ludzi?", 0, "1", "3", "2", 0, 0);
            insertQuestionGame1(db, "W III rozdziale wielki ??owczy kr??lewski zleca wied??minowi zabicie 2 wielkich bestii. Moa to?", 0, "Kuroliszek", "Kikimora", "Viverna", 0, 0);
            insertQuestionGame1(db, "Kto ratuje Geralta, gdy ten zostaje obezw??adniony na bagnach?", 0, "Triss", "Talar", "Meis", 0, 0);
            insertQuestionGame1(db, "Jaka jest ulubiona potrawa Addy?", 0, "Maliny", "Katoblefasy", "Przepi??rka", 0, 0);
            insertQuestionGame1(db, "Zahin Schmartz to?", 0, "Stra??nik", "Alchemik", "Dentysta", 0, 0);
            insertQuestionGame1(db, "Od czego uzale??niony jest Siemko?", 0, "Fistechu", "Hazardu", "Alkoholu", 0, 0);
            insertQuestionGame1(db, "Kto przetrzymywa?? lutni?? Jaskra?", 0, "Visenna", "Rozalinda", "Carmen", 0, 0);
            insertQuestionGame1(db, "Kto by?? ukochanym prostytutki z portu \"Carmen\"?", 0, "Talar", "Baranina", "Meis", 0, 0);

            insertQuestionGame1(db, "W III rozdziale wielki ??owczy kr??lewski zleca wied??minowi zabicie 2 wielkich bestii. Voref to?", 0, "Wilk", "Viverna", "Kikimora", 0, 0);
            insertQuestionGame1(db, "W III rozdziale jedna z sanitariuszek prosi Geralta o pomoc. Okazuje si?? w trakcie misji, ze jej babcia zosta??a op??tana. Przez kogo?", 0, "Demona", "Fleedera", "Alpe", 0, 0);
            insertQuestionGame1(db, "Talar to?", 0, "Zdrajca", "Z??odziej", "Szpieg", 0, 0);
            insertQuestionGame1(db, "Jak nazywa?? si?? diler Salamandry?", 0, "Angus", "Baranina", "Gellert", 0, 0);
            insertQuestionGame1(db, "Kto zajmowa?? si?? kontrol?? produkcji Fishtechu?", 0, "Baranina", "Gellert", "Roland", 0, 0);
            insertQuestionGame1(db, "Kto zdradza Geralta dla salamandry?", 0, "Leuvaarden", "Talar", "Adda", 0, 0);
            insertQuestionGame1(db, "Kto zabi?? Leo?", 0, "Magister", "Savolla", "Azar Javed", 0, 0);
            insertQuestionGame1(db, "Komu uda??o si?? odbi?? be??t wystrzelony przez Magistra?", 0, "Vesemirowi", "Geraltowi", "Leo", 0, 0);
            insertQuestionGame1(db, "Co by??o zr??d??em anomali w Wyzimie?", 0, "Azar Javed", "Medalion", "Alvin", 0, 0);
            insertQuestionGame1(db, "Ile pazur??w kikimor naleza??o dostarczy?? Veleradowi?", 0, "10", "5", "3", 0, 0);

            insertQuestionGame1(db, "Kto wystawi?? zlecenie na kuroliszki w III rozdziale?", 0, "Meis", "Skryba", "Velerad", 0, 0);
            insertQuestionGame1(db, "Ile mi??s Viverny naleza??o dostarczy?? karczmarzowi w III rozdziale?", 0, "10", "5", "3", 0, 0);
            insertQuestionGame1(db, "Jak brzmii \"wied??min\" w j??zyku wodnych pan??w?", 0, "Wiedmolol'bul", "Wiedmolol", "Viedmolol", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale Tobias Hoffman p??aci wied??minowi za zabicie 2 wielkich bestii. Ureus to?", 0, "Zjadarka", "Cmentar", "Graveir", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale Tobias Hoffman p??aci wied??minowi za zabicie 2 wielkich bestii. Teyu to?", 0, "Cmentar", "Zjadarka", "Kap??an Vodyanoi", 0, 0);
            insertQuestionGame1(db, "Berengar wytyka Geraltowi luk?? w walce. Jest to spowodowane uszkodzeniem pewnej cz????ci cia??a Geratal. Jakiej?", 0, "Kolana", "??okcia", "Stopy", 0, 0);
            insertQuestionGame1(db, "Kto zabi?? kogo? Alina Celin??, Celina Alin??, czy to ??adne z nich?", 0, "1", "2", "3", 0, 0);
            insertQuestionGame1(db, "Jak si?? nazywa miecz, kt??ry Geralt dostaje od Pani Jeziora?", 0, "Ard'aenye", "Deithwen", "Aerondight", 0, 0);
            insertQuestionGame1(db, "Na jakiej wiosce wyl??dowa?? Geralt?", 0, "Odm??ty", "Zam??ty", "Odr??gi", 0, 0);
            insertQuestionGame1(db, "Berengar szuka?? pewnej zbroji. Czyjej?", 0, "Coena", "Kruka", "Eycka", 0, 0);

            insertQuestionGame1(db, "Jak nazywa?? si?? z??odziej, kt??ry po ??mierci zosta?? \"Topielcem z??odziejem\"?", 0, "Teyu", "Gellert", "Zefir", 0, 0);
            insertQuestionGame1(db, "Co musimy dostarczy?? ??onie kowala, kt??ry zdradza?? j?? z Sukkubem aby ta mog??a si?? pozby?? demonicy?", 0, "??wietlisty py??", "Cenisty py??", "Bia??y Mirt", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir pozwala?? na wykrywanie niewidzialnych istot?", 0, "Pe??nia", "Wywar de Vrie", "Wilga", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwieksza odporno???? na krwiawienie?", 0, "Wilga ", "Czarna krew", "Poca??unek", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zapewnia odporno???? na kwas?", 0, "Pow??j", "Zamie??", "Pe??nia", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwi??ksza refleks?", 0, "Pow??j", "Zamie??", "Wywar de Vries", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwi??ksza regeneracj?? energii?", 0, "Jask????ka", "Pe??nia", "Puszczyk", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir uodparnia na trucizny?", 0, "Wilga", "Pow??j", "Poca??unek", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwieksza nat????enie znak??w?", 0, "Puszczyk", "Filtr Petriego", "Dzierzba", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zadaje b??l przeciwnikom, kt??rzy zrani?? Geralta?", 0, "Wilga", "Zamie??", "Dzierzba", 0, 0);

            insertQuestionGame1(db, "Kt??ry eliksir zwi??ksza odporno???? na og??uszenia?", 0, "Wierzba", "Dzierzba", "Wilga", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwi??ksza szans?? na zadanie krytycznych ran?", 0, "Dzierzba", "Wilk", "Grom", 0, 0);
            insertQuestionGame1(db, "Jaki eliksir zwi??ksza zadawane obra??enia, ale tylko gdy posta?? posiada mniej niz 50% zdrowia?", 0, "Grom", "Wilk", "Rosomak", 0, 0);
            insertQuestionGame1(db, "Jaki Eliksir zwieksza regeneracj?? zdrowia?", 0, "Jask????ka", "Pe??nia", "Rosomak", 0, 0);
            insertQuestionGame1(db, "Jeden z eliksir??w znacznie zwi??ksza maksymaln?? ilo???? energii, jest to?", 0, "Wilga", "Las Maroborski", "Puszczyk", 0, 0);
            insertQuestionGame1(db, "Kt??ry z tych eliksir??w cechuje sie nisk?? toksyczno??ci???", 0, "Pow??j", "Jask????ka", "Kot", 0, 0);
            insertQuestionGame1(db, "Kt??ry z tych eliksir??w cechuje sie sredni?? toksyczno??cia?", 0, "Jask????ka", "Grom", "Czarna Krew", 0, 0);
            insertQuestionGame1(db, "Kt??ry z tych eliksir??w cechuje sie wysok?? toksyczno??cia?", 0, "Las Mariborski", "Jean Wierzba", "Rosomak", 0, 0);
            insertQuestionGame1(db, " Kt??ry z tych eliksir??w cechuje sie bardzo wysok?? toksyczno??cia?", 0, "Grom", "Zamie??", "Pe??nia", 0, 0);
            insertQuestionGame1(db, "W IV rozdziale, w zale??no??ci od podj??tych przez nas decyzji Abigail lub Gu??larka zlecaj?? nam zabicie zjadark. Ile z??b??w mamy dostarczy????", 0, "10", "5", "3", 0, 0);

            insertQuestionGame1(db, "Ile k????w Alp mamy dostarczy?? dla Tobiasa Hoffmana?", 0, "10", "5", "3", 0, 0);
            insertQuestionGame1(db, "Kto zabi?? Celin???", 0, "Alina", "Tobias", "Julian", 0, 0);
            insertQuestionGame1(db, "Ile punkt??w daje eliksir z upiornego psa?", 0, "3x br??zowe", "1x srebrny", "1x br??zowy", 0, 0);
            insertQuestionGame1(db, "Ile punkt??w daje eliksir z serca ko??cieja?", 0, "x3 srebrne", "x1 z??oty", "x2 srebrne", 0, 0);
            insertQuestionGame1(db, "Ile punkt??w daje eliksir z serca strzygi?", 0, "x1 z??oty", "x2 srebrne", "x1 br??z, x1 srebrny", 0, 0);
            insertQuestionGame1(db, "Kt??ra wersja zbroi kruka by??a przeznaczona dla gracza, kt??ry pos??uguje si?? znakami?", 0, "Elfia", "Neutralna", "Zakonna", 0, 0);
            insertQuestionGame1(db, "W zadaniu \"Litania ??w. Grzegorza\" musimy uruchomi?? tajne przejscie specjaln?? sekwencj?? znak??w. Jak???", 0, "x3 Igni", "x2 Ard,Igni", "x3 Aard", 0, 0);
            insertQuestionGame1(db, "W zadaniu \"Wynalazek gnom??w\" musimy uruchomi?? tajne przej??cie specjaln?? sekwencj?? znak??w. Jak???", 0, "Aard,Igni,Aard", "Igni,Aard,Igni ", "x2 Igni,Aard", 0, 0);
            insertQuestionGame1(db, "Kim by?? Jakub De Aldersberg?", 0, "Alvinem", "Zygfrydem", "Javedem", 0, 0);
            insertQuestionGame1(db, "Kto rzuci?? kl??tw?? na strzyg???", 0, "Ostritt", "De Wett", "Javed", 0, 0);

            insertQuestionGame1(db, "Czyj duch pojawia si?? po zabiciu Jakuba De Aldersberga?", 0, "Leo", "Javeda", "Eredina", 0, 0);
            insertQuestionGame1(db, "Za jak?? sum?? pieni??dzy Geralt zgadza si?? zabi?? Jakuba De Aldersberga?", 0, "10 000", "5 000", "7 000", 0, 0);
            insertQuestionGame1(db, "Jakie zwierz?? posiada?? Foltest?", 0, "Psa", "Kota", "Jaszczurk??", 0, 0);
            insertQuestionGame1(db, "Kto zaatakowa?? Foltesta po tym, jak Geralt odebra?? od niego nagrod???", 0, "Elf", "Zakonnik", "Wied??min", 0, 0);
            insertQuestionGame1(db, "W V rozdziale wielki ??owczy kr??lewski zleca zabicie 2 wielkich potwor??w. Vesper to?", 0, "Garkain", "Bruxa", "Zeugl", 0, 0);
            insertQuestionGame1(db, "W V rozdziale wielki ??owczy kr??lewski zleca zabicie 2 wielkich potwor??w. Lilly to?", 0, "Alpa", "Bruxa", "Zeugl", 0, 0);
            insertQuestionGame1(db, "W epilogu, w kana??ach zabijamy pot??znego potwora. By?? nim?", 0, "Kraken", "Bruxa", "Zeugl", 0, 0);

//117

//WIEDZMIN 2
            insertQuestionGame2(db, "Czy w grze wied??min 2 r??wnie?? wyst??puje \"Aerondight\" - miecz od Pani Jeziora?", 0, "Czasami ", "Zawsze", "Nigdy", 0, 0);
            insertQuestionGame2(db, "Czy w grze wied??min 2 r??wnie?? wyst??puje Mahakamski Sihil?", 0, "Zawsze", "Czasami", "Nigdy", 0, 0);
            insertQuestionGame2(db, "Czy w grze wied??min 2 r??wnie?? wyst??puje Zbroja Kruka?", 0, "Zawsze", "Nigdy", "Czasami", 0, 0);
            insertQuestionGame2(db, "Jaka jest najlepsza zbroja w grze?", 0, "Bratob??jcy", "Kruka", "Vran??w", 0, 0);
            insertQuestionGame2(db, "Schemat na kt??ry z tych pancerzy mo??na zdoby?? jedynie w I akcie?", 0, "Wiaro??omcy", "??wi??tokradcy", "Bratob??jcy", 0, 0);
            insertQuestionGame2(db, "Schemat na kt??ry z tych pancerzy mo??na zdoby?? jedynie w II akcie?", 0, "??wi??tokradcy", "Bratob??jcy", "Wiaro??omcy", 0, 0);
            insertQuestionGame2(db, "Schemat na kt??ry z tych pancerzy mo??na zdoby?? jedynie w III akcie?", 0, "Bratob??jcy", "??wi??tokradcy", "Wiaro??omcy", 0, 0);
            insertQuestionGame2(db, "Jaki poziom toksyczno??ci posiada Dekokt Raffarda Bia??ego?", 0, "60", "50", "40", 0, 0);
            insertQuestionGame2(db, "Jaki poziom toksyczno??ci posiada  Filtr Petriego?", 0, "60", "40", "50", 0, 0);
            insertQuestionGame2(db, "Ile trwa kot?", 0, "5 min", "7 min", "10 min", 0, 0);

            insertQuestionGame2(db, "Kt??ry z tych eliksir??w posiada 25 pkt toksyczno??ci?", 0, "Ja??wiec", "Jask????ka", "Czajka", 0, 0);
            insertQuestionGame2(db, "Vitriol, Aether i Caelum to sk??adniki potrzebne do przygotowania?", 0, "Kota", "Gromu", "Jask????ki", 0, 0);
            insertQuestionGame2(db, "Pierwszy raz mo??emy si??owa?? si?? z kim?? na r??k?? w?", 0, "Pod namiotem", "We Flotsam", "W lochu", 0, 0);
            insertQuestionGame2(db, "Jak mia?? na imi?? syn baronowej La Valette?", 0, "Edgar", "Arjan", "Busy", 0, 0);
            insertQuestionGame2(db, "Gdzie po raz pierwszy mo??emy spotka?? Arjana La Vallete, po tym jak uratujemy jego ??ycie na wie??y?", 0, "Flotsam", "Loc Muinne", "Lochy", 0, 0);
            insertQuestionGame2(db, "Gdzie mieszka Anezka?", 0, "Binduga", "Flotsam", "Vergen", 0, 0);
            insertQuestionGame2(db, "Jak ma na imi?? szlachci?? w twierdzy La Valette, kt??remu mo??emy podczas rozmowy przywali?? w twarz?", 0, "Kreon", "Tales", "Hugon", 0, 0);
            insertQuestionGame2(db, "Iloma znakami mo??e si?? pos??ugiwa?? Geralt w wied??minie 2?", 0, "4", "5", "6", 0, 0);
            insertQuestionGame2(db, "Kt??ry znak powoduje spowolnienie czasu?", 0, "Heliotrop", "Yrdenn", "Quenn", 0, 0);
            insertQuestionGame2(db, "Jaki by?? pow??d utraty przez Geralta srebrnego miecza w prologu?", 0, "Loch", "Saskia", "Letho", 0, 0);

            insertQuestionGame2(db, "Podczas pobytu Geralta w Temerskim lochu 2 stra??nik??w gra??o w ko??ci. Ile oren??w wygra?? jeden z nich?", 0, "50", "25", "20", 0, 0);
            insertQuestionGame2(db, "Jaki kolor mia?? piuropusz Chrabiego Etcheverry?", 0, "Czerwony", "Niebieski", "Zielony", 0, 0);
            insertQuestionGame2(db, "Czyi ??o??nierze udali si?? z Foltesem po Arjana La Valetta?", 0, "Lorda Souxien", "Lorda Swanna", "Rocha", 0, 0);
            insertQuestionGame2(db, "Gdzie Letho zabi?? Demawenda?", 0, "W zamku", "W lesie", "Na ??odzi", 0, 0);
            insertQuestionGame2(db, "Za kogo poda?? si?? Vernon Roche we Flotsam?", 0, "Emchyra", "Zygfryda", "Siebie", 0, 0);
            insertQuestionGame2(db, "Co zrobi?? Jaskier, ??e zosta?? skazany na ??mierc przez Bernarda Loredo?", 0, "Kradzie??", "Podpalenie", "Cudzo????stwo", 0, 0);
            insertQuestionGame2(db, "Kto by?? mistrzem Flotsam w si??owaniu na r??k???", 0, "Ma??ko", "Jo??wik", "Szkuta", 0, 0);
            insertQuestionGame2(db, "Kto by?? mistrzem ko??cianego pokera we Flotsam?", 0, "??egota", "Gauslem", "Szkuta", 0, 0);
            insertQuestionGame2(db, "Kto by?? mistrzem amatorskich pojedynk??w w karczmie we Flotsam?", 0, "Naizdup", "Dodo", "Ma??ko", 0, 0);
            insertQuestionGame2(db, "Jak nazywa??a si?? niedosz??a narzeczona Zoltana?", 0, "Balbina", "Greta", "Eudora", 0, 0);

            insertQuestionGame2(db, "Jak mia?? na imi?? ch??op, kt??rego Kejran zaatakowa?? w porcie?", 0, "Sosek", "M??cis??aw", "Gustaw", 0, 0);
            insertQuestionGame2(db, "Czyj?? doradczyni?? by??a Sheala De Tancarville? ", 0, "Radowida", "Zuleyki", "Demawenda", 0, 0);
            insertQuestionGame2(db, "Kto z Flotsam wsp????pracowa?? z Salamandra?", 0, "Ziggy", "Loredo", "Fogg", 0, 0);
            insertQuestionGame2(db, "Kto sprzeda?? g??ow?? trollicy Szkucie?", 0, "Dymitr", "Pangrat", "Cedric", 0, 0);
            insertQuestionGame2(db, "Jak ma na imie elfka, kt??ra zdradzi??a Dymitra?", 0, "Eudora", "Malena", "Anezka", 0, 0);
            insertQuestionGame2(db, "Rebis, Aether i Cieniokost to sk??adniki na?", 0, "Krakre", "Samum", "Manguste", 0, 0);
            insertQuestionGame2(db, "Ile kr??lowych Endriag by??o we Flotsam?", 0, "2", "3", "1", 0, 0);
            insertQuestionGame2(db, "Ile by??o gniazd Nekker??w we Flotsam?", 0, "3", "4", "5", 0, 0);
            insertQuestionGame2(db, "Kto byl mistrzem podziemnego kr??gu we Flotsam?", 0, "Naizdup", "Mitko", "Zdenek", 0, 0);
            insertQuestionGame2(db, "Kto organizowa?? podziemny kr??g we Flotsam?", 0, "Loredo", "Ziggy", "Merc", 0, 0);

            insertQuestionGame2(db, "Kto by?? Elfim szpiegiem we Flotsam?", 0, "Jaskier", "Garwena", "Cedric", 0, 0);
            insertQuestionGame2(db, "Kto jest so??tysem Bindugi?", 0, "Ma??ko", "Szkuta", "Chorab", 0, 0);
            insertQuestionGame2(db, "Kto by?? praw?? rek?? Iorwetha?", 0, "Ciaran", "Saskia", "Cedric ", 0, 0);
            insertQuestionGame2(db, "Jak?? elfi?? kobiet?? porwa?? Loredo?", 0, "Malene", "Moril", "Milene", 0, 0);
            insertQuestionGame2(db, "Z kim kontaktowa??a si?? Yennefer przez megaskop Sheali, gdy pomogli??my schwyta?? Iorwetha?", 0, "Filipp??", "Saski??", "Deatmoldem", 0, 0);
            insertQuestionGame2(db, "Jak mia?? na imi?? szpieg z Keadwen? ", 0, "Malliger", "Bernard", "Dymitr", 0, 0);
            insertQuestionGame2(db, "Dla jakiego kraju Loredo dokona?? aktu zdrady?", 0, "Aedirn", "Keadwen", "Redanii", 0, 0);
            insertQuestionGame2(db, "Kto przygarn???? dziecko Moril?", 0, "Chorab", "Garwena", "Seheril", 0, 0);
            insertQuestionGame2(db, "Do kogo nale??y Dolina Pontaru?", 0, "Aedirn", "Kaewen", "Temerii ", 0, 0);
            insertQuestionGame2(db, "Jakie trofeum dawa??o statystyki: 3 pancerza, 5 obra??e??, 50 zdrowia?", 0, "Elthona", "Kejrana", "Drauga", 0, 0);

            insertQuestionGame2(db, "Ile Macek Kejrana \"najmniej\" trzeba uci????, ??eby da??o si?? go zabi???", 0, "2", "4", "3", 0, 0);
            insertQuestionGame2(db, "Kto umiera podczas negocjacji, je??li staniemy po stronie Rocha?", 0, "Stennis", "Saskia", "Nikt", 0, 0);
            insertQuestionGame2(db, "Kt??ry z tych 3 czarodziej??w nigdy nie czaruje magicznej os??ony dla Geralta?", 0, "Filippa", "Sheala", "Deatmold", 0, 0);
            insertQuestionGame2(db, "Do czego Henselt przybi?? Sabrin?? Glevissig?", 0, "Drzewa", "Pali", "Ko??a", 0, 0);
            insertQuestionGame2(db, "Kto dowodzi?? wojskami Henselta podczas bitwy, kt??r?? przedwcze??nie zako??czy??a Sabrina Glevissig?", 0, "Vandergrift", "Seltkirk", "Detmold", 0, 0);
            insertQuestionGame2(db, "Kto dowodzi?? wojskami Aedirn podczas bitwy, kt??r?? przedwcze??nie zako??czy??a Sabrina Glevissig?", 0, "Vandergrift", "Seltkirk", "Detmold", 0, 0);
            insertQuestionGame2(db, "Komu nale??a??o zanie???? kwadratow?? monet??, w celu dostania si?? do kryj??wki spiskowc??w?", 0, "Karoll", "Sheali", "Zo??ce", 0, 0);
            insertQuestionGame2(db, "Kt??ry spiskowiec dzier??y?? pancerz Seltkirka?", 0, "Trauta", "Aveta", "Swan", 0, 0);
            insertQuestionGame2(db, "Sk??d pochodzi?? Letande'a Aveta - \"Rze??nik\"", 0, "z Gulety", "z Cidaris", "z Blaviken", 0, 0);
            insertQuestionGame2(db, "Kto by?? organizatorem walk na arenie w obozie Henselta?", 0, "Aveta", "Trauta", "Proximo", 0, 0);

            insertQuestionGame2(db, "Kto jest mistrzem obozu Kaedwen w si??owaniu na r??k???", 0, "Pangratt", "Mangus", "Numa", 0, 0);
            insertQuestionGame2(db, "Kto by?? najsilniejszym przeciwnikiem w turnieju Rycerskim?", 0, "Proximo", "Ves", "Aveta", 0, 0);
            insertQuestionGame2(db, "Jak ma na imi?? natchniony?", 0, "Mangus", "Konrad", "Yahon", 0, 0);
            insertQuestionGame2(db, "Kto jest mistrzem ko??cianego pokera w obozie Henselta?", 0, "Lasota", "Karoll", "Zyvik", 0, 0);
            insertQuestionGame2(db, "Kto przebi?? Sabrin?? Glevissig??", 0, "Zyvik", "Yahon", "Henselt", 0, 0);
            insertQuestionGame2(db, "Ile zw??ok nale??y spali?? w 2 akcie, aby pozby?? si?? zgnilc??w?", 0, "3", "5", "9", 0, 0);
            insertQuestionGame2(db, "Kto posiada?? sztandar Burej Chor??gwi?", 0, "Hennessy", "Yarpen", "Coohorn", 0, 0);
            insertQuestionGame2(db, "Kto posiada?? grot z w????czni Yahona?", 0, "Iorweth", "Skalen", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Kto wywiesi?? \"zlecenie na zgnilce\"?", 0, "Zyvik", "Mangus", "Proximo", 0, 0);
            insertQuestionGame2(db, "Jaki eliksir nale??a??o wypic przed rytua??em nekromancji?", 0, "Krakwe", "Jask????ke", "Puszczyk", 0, 0);

            insertQuestionGame2(db, "Kto opiekowa?? si?? dziecmi Foltesta?", 0, "Natalis", "Brygida", "Meis", 0, 0);
            insertQuestionGame2(db, "Kto by?? dow??dc?? spisku przeciwko Henseltowi?", 0, "Attre", "Zyvik", "Roche", 0, 0);
            insertQuestionGame2(db, "Jak ma na imi?? kr??lob??jca zabity przez Sheale?", 0, "Serrit", "Egan", "Letho", 0, 0);
            insertQuestionGame2(db, "Kto mo??e zabi?? Henselta?", 0, "Letho", "Roche", "Serrit", 0, 0);
            insertQuestionGame2(db, "Kto zgwa??ci?? Ves?", 0, "Detmold", "Loredo", "Henselt", 0, 0);
            insertQuestionGame2(db, "Kto porwa?? Anais?", 0, "Detmold", "Henselt", "Radowid", 0, 0);
            insertQuestionGame2(db, "Kto planowa?? zamordowa?? dzieci Foltesta?", 0, "Maravel", "Kimbolt", "Henselt", 0, 0);
            insertQuestionGame2(db, "Kto planowa?? zdrad?? Temerii dla Nilfgardu?", 0, "Kimbolt", "Natalis", "Maravel", 0, 0);
            insertQuestionGame2(db, "Sk??d pochodz?? ro??liny z kt??rych zrobiony jest anabolik dla Mocarnego Numy?", 0, "Ellander", "Povis", "Toussaint", 0, 0);
            insertQuestionGame2(db, "Kto jest najlepszym pokerzyst?? w Loc Muinne?", 0, "Lenner", "Lockhart", "Hadrian", 0, 0);

            insertQuestionGame2(db, "Podczas jakiego zadania, mo??emy zdoby?? r??kawice, spodnie i buty starszej krwii?", 0, "Rzeka Tajemnic", "Zaszyfrowany Man.", "Zl. na Gargulce", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji mo??emy zdoby?? zbroj?? Vran??w?", 0, "Rzeka Tajemnic", "Zaszyfrowany Man.", "Lilie i ??mije", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji mo??na zdoby?? miecz Vran??w w scie??ce Rocha?", 0, "Lilie i ??mije", "Ko???? z ko??ci", "W imie Temerii!", 0, 0);
            insertQuestionGame2(db, "Podczas jakiej misji mo??na zdoby?? miecz Vran??w w scie??ce Iorwetha?", 0, "W imi?? W. Racji", "??amacz Czar??w", "Tajemnice L. M.", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem wiary?", 0, "Medalion Cresta", "Miecz Saski", "Sztandar", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem ??mierci?", 0, "Miecz Saski", "Sztandar", "Medalion", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem nienawi??ci?", 0, "Sztandar", "Medalion", "Miecz Saski", 0, 0);
            insertQuestionGame2(db, "Co jest symbolem odwagi?", 0, "Zbr. Seltkirka", "Miecz Saski", "Sztandar", 0, 0);
            insertQuestionGame2(db, "Kto otru?? Saski???", 0, "Szlachta", "Stennis", "Ch??opi", 0, 0);
            insertQuestionGame2(db, "Co jest wystarczaj??cym ??r??d??em magii, kt??re pomo??e wyleczy?? Saskie?", 0, "Pier??cie??", "Medalion", "Kryszta?? snu", 0, 0);

            insertQuestionGame2(db, "Z jakiego materia??u by??a statuetka, w kt??r?? zmieniono Triss?", 0, "Nefryt", "Br??z", "Mosi??dz", 0, 0);
            insertQuestionGame2(db, "Kto zamieni?? Triss Merigold w statuetk???", 0, "Filippa", "Cynthia", "Sheala", 0, 0);
            insertQuestionGame2(db, "Kt??ry czarodziej zmienia?? si?? w sow???", 0, "Sheala", "Deatmold", "Filippa", 0, 0);
            insertQuestionGame2(db, "Kto by?? starost?? Vergen?", 0, "Cecil", "Skalen", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Kto jest zleceniodawc?? zabicia kr??lowej harpii?", 0, "Skalen", "Cecil", "Yarpen", 0, 0);
            insertQuestionGame2(db, "Jak nazywa?? si?? szlachcic z Vergen rzucaj??cy wied??minowi wyzwanie w walce na pi????ci dwukrotnie?", 0, "Burton", "Swen", "Silgrat", 0, 0);
            insertQuestionGame2(db, "Kto zabi?? Baltimora?", 0, "Thorak", "Ele'yas", "Nie wiadomo", 0, 0);
            insertQuestionGame2(db, "Kto jest mistrzem ko??cianego pokera w Vergen?", 0, "Cecil", "Hagar", "Skalen", 0, 0);
            insertQuestionGame2(db, "Kto jest najwiekszym si??aczem w Vergen?", 0, "Sheldon", "Yarpen", "Skalen", 0, 0);
            insertQuestionGame2(db, "Kto zabija?? ludzi z Vergen?", 0, "Ele'yas", "Sukkub", "Demon", 0, 0);


            insertQuestionGame2(db, "Ile gniazd Harpii nale??y zniszczy?? w celu wykonania zlecenia?", 0, "5", "7", "10", 0, 0);
            insertQuestionGame2(db, "Zi, Uddu-ya, Ia Ia, Gat, Exa, Nibbit, Kanpa, Gat, Uddu-Zi. To s??owa z j??zyka?", 0, "Elf??w", "Krasnolud??w", "Vran??w", 0, 0);
            insertQuestionGame2(db, "W jakiej misji mo??emy zdoby?? Artefakt Operatora?", 0, "Sprzed Stuleci", "Tajemnice L.M.", "Zaszyfrowany Man.", 0, 0);
            insertQuestionGame2(db, "Jaki jest najsilniejszy srebrny miecz w grze?", 0, "Aerondight", "Addan Deith", "Gynvael Aedd", 0, 0);
            insertQuestionGame2(db, "Ile toksyczno??ci posiada Eliksir Si??y Mocarnego Numy?", 0, "25", "75", "50", 0, 0);


/////105


            insertQuestionGame3(db, "Jak?? ksi????k?? czyta??a Ciri w ??nie Geralta?", 0, "O Ghulach i Alghulach", "O Wilko??akach", "O Potowarch lataj??cych", 0, 0);
            insertQuestionGame3(db, "Kto podpali?? ku??ni?? krasnoluda w Bia??ym Sadzie?", 0, "Niepe??ka", "Willy", "Derwan", 0, 0);
            insertQuestionGame3(db, "Ile korc??w ziarna zarekwirowa?? dow??dca garnizonu w Bia??ym Sadzie?", 0, "30", "40", "50", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? my??liwy z Bia??ego Sadu?", 0, "Mys??aw", "Dieter", "Peter", 0, 0);
            insertQuestionGame3(db, "Gryf atakuj??cy gniazdo by???", 0, "Samcem", "Samic??", "Nie wiadomo", 0, 0);
            insertQuestionGame3(db, "Jak mia??a na imi?? zielarka z Bia??ego Sadu?", 0, "Tamara", "Lenka", "Dieter", 0, 0);
            insertQuestionGame3(db, "Ile bat??w wymierzy?? dow??dca garnizonu za przyniesienie wadliwego ziarna?", 0, "10", "15", "20", 0, 0);
            insertQuestionGame3(db, "Schematy jakich wied??mi??skich mieczy mo??emy znale???? w Bia??ym Sadzie?", 0, "??miji", "Kota", "Gryfa", 0, 0);
            insertQuestionGame3(db, "Jak mia???? na imi?? ukochana Niellena?", 0, "Hanna", "Anna", "Ma??gorzata", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Velen w Gwinta?", 0,"Hadka", "Krwawy Baron", "Szkutnik", 0,0);

            insertQuestionGame3(db, "Jakie zwierz?? ratuj?? Keira wie??niakom ze wsi Podgaje?", 0, "Krowe", "??wienie", "Konia", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? miecz Ciri?", 0, "Zirael", "Gvall'ach", "Aerondight", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? ko?? Ciri?", 0, "Kelpie", "Scylla", "Kujira", 0, 0);
            insertQuestionGame3(db, "Kt??ry wojonik dzikiego gonu walczy z Geraltem w kryj??wce Crevana?", 0, "Nithral", "Imlerith", "Caranthir", 0, 0);
            insertQuestionGame3(db, "Kto wskaza?? Geraltowi trop Crevana?", 0, "Keira Metz", "Notatki Hendrika", "Baron", 0, 0);
            insertQuestionGame3(db, "Czego ba??a si?? Keira?", 0, "Szczur??w", "Ogar??w Gonu", "Eredina", 0, 0);
            insertQuestionGame3(db, "Kto by?? ukochanym Anabelle?", 0, "Graham", "Myszor", "Wojciech", 0, 0);
            insertQuestionGame3(db, "Jakim potworem by??a Anabelle", 0, "Morow?? Dziewic??", "Po??udnic??", "P????nocnic??", 0, 0);
            insertQuestionGame3(db, "Jak mia???? na imi?? ??ona Barona?", 0, "Anna", "Hanna", "Tamara", 0, 0);
            insertQuestionGame3(db, "Kto udzieli?? schronienia rodzinie barona?", 0, "Wojciech", "Graham", "Myszor", 0, 0);

            insertQuestionGame3(db, "Jak mia?? na imi?? czarodziej z mysiej wie??y?", 0, "Aleksander", "Albrich", "Artorius", 0, 0);
            insertQuestionGame3(db, "Jak?? chorob?? zajmowa?? si?? Aleksander?", 0, "Catrion??", "Osp??", "D??um??", 0, 0);
            insertQuestionGame3(db, "Jakie zwierz?? mia?? gu??larz?", 0, "Koz??", "Owc??", "Barana", 0, 0);
            insertQuestionGame3(db, "Kt??re z tych dzieci nie przebywa??o u wied??m?", 0, "Wojtek", "Karola", "Arek", 0, 0);
            insertQuestionGame3(db, "Co by??o zap??at?? od so??tysa Sztygar??w dla Pa???", 0, "Ucho", "Nos", "Palec", 0, 0);
            insertQuestionGame3(db, "Kt??ry dzieciak przyja??ni?? si?? z Jankiem?", 0, "Arek", "Gniewko", "Wojtek", 0, 0);
            insertQuestionGame3(db, "Kt??ry wojownik gonu zjawi?? si?? u wied??m po Cirill???", 0, "Imlerith", "Eredin", "Nithral", 0, 0);
            insertQuestionGame3(db, "Jakie jest has??o do Zgni??ego Gaju?", 0, "Stara locha powi??a warchlaki", "Ku chwale wiecznego ognia", "Sztuka nade wszystko", 0, 0);
            insertQuestionGame3(db, "Jakim przedmiotem mo??na odczarowa?? ??on?? barona?", 0, "Lalka z Malw??", "Lalka z W??osami", "Lalka z Paciorkiem", 0, 0);
            insertQuestionGame3(db, "Jak mia??a na imi?? ??ni??czka z Novigradu?", 0, "Corine", "Condwiramurs", "Felicja", 0, 0);

            insertQuestionGame3(db, "Jak ma na imi?? pokoj??wka Baronowej La Valette?", 0, "Molly", "Marabella", "Rose", 0, 0);
            insertQuestionGame3(db, "Co obezw??adni??o trolla Dijkstry?", 0, "Ple???? Popsa", "Wybuch", "Magia", 0, 0);
            insertQuestionGame3(db, "Gdzie umar?? Henckel", 0, "W Burdelu", "W kana??ach", "W swoim domu", 0, 0);
            insertQuestionGame3(db, "Ile deser??w zaserwowano na przyj??ciu u Vegelbud??w", 0, "85", "87", "92", 0, 0);
            insertQuestionGame3(db, "Ile Triss ma w talii?", 0, "22 cale", "22,5 cala", "23 cale", 0, 0);
            insertQuestionGame3(db, "Kto zaprowadza Geralta do Radowida?", 0, "Roche", "Jamurlak", "Dijkstra", 0, 0);
            insertQuestionGame3(db, "W jakim banku jest ukryty skarb Dijkstry?", 0, "Kovirskim", "Novigradzkim", "Oxenfurckim", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? ????cznik Radowida i Menge? ", 0, "Jamurlak", "Albert", "Rejk", 0, 0);
            insertQuestionGame3(db, "Do kt??rej wsi Ves pobieg??a z odsiecz???", 0, "Jawornik", "Zalipie", "Konary", 0, 0);
            insertQuestionGame3(db, "Co si?? stanie, je??li odbierzemy Iris von Ever r???????", 0, "Umiera", "Nic", "Dopada j?? demon", 0, 0);
//   40

            insertQuestionGame3(db, "Jakie by??o drugie imi??  Syanny?", 0, "Rhenawedd", "Marta", "Karolina", 0, 0);
            insertQuestionGame3(db, "Czym zostaje zamordowana Xi????na Anarietta?", 0, "Szpil??", "Be??tem", "Trucizn??", 0, 0);
            insertQuestionGame3(db, "Z czego powstawa?? bimber Regisa?", 0, "Mandragory", "Ranoga", "Pog??osu", 0, 0);
            insertQuestionGame3(db, "1 ofiara Dettlaffa to?", 0, "Crespi", "Ramon du Lac", "Louis de la Croix", 0, 0);
            insertQuestionGame3(db, "Kto prowadzi?? sierociniec w Toussaint?", 0, "Oriana", "Henrietta", "Crespi", 0, 0);
            insertQuestionGame3(db, "Gdzie przetrzymywano Sylvi?? Ann??? ", 0, "Dun Tynne", "Caed Myrkvid", "Vendelle", 0, 0);
            insertQuestionGame3(db, "W jakiej winnicy powstawa?? Sangreal?", 0, "Castel Ravello", "Pomerol", "Sancerre", 0, 0);
            insertQuestionGame3(db, "Jaki potw??r przyby?? po r??ke Dettlaffa do Corvo Bianco?", 0, "Bruxa", "Alpha", "Mula", 0, 0);
            insertQuestionGame3(db, "Zbroja kota jest pancerzem?", 0, "Lekkim", "??rednim", "Ci????kim", 0, 0);
            insertQuestionGame3(db, "Kto malowa?? pod pseudonimem Van Rogh?", 0, "Iris von Everec", "Auguste Benoire", "Henri de Toulouse", 0, 0);
//50
            insertQuestionGame3(db, "Jakie by??o pierwsze ??yczenie Olgierda von Everec?", 0, "Dom Borsodych", "R????a Iris", "Uciechy Witolda", 0, 0);
            insertQuestionGame3(db, "Czyje s??owa wypowiada Olgierd von Everec przed pojedynkiem z Geraltem?", 0, "Wo??odejowskiego", "Kmicica", "Zag??oby", 0, 0);
            insertQuestionGame3(db, "W jakim miejscu rozegra?? si?? fina?? Serca z Kamienia?", 0, "??w. Lilwani", "??w. Hindar", "??w. Dagona", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? czarodziej koronny Koviru?", 0, "Aamad", "Radeyah", "Maraal", 0, 0);
            insertQuestionGame3(db, "Co jest rozwi??zaniem zagadki Gaunter o'Dima?", 0, "Odbicie", "Czas", "Wspomnienia", 0, 0);
            insertQuestionGame3(db, "Kto polowa?? na braci Grossbart?", 0, "Djengo Frett", "Halbjorn", "Hjort ", 0, 0);
            insertQuestionGame3(db, "Jak mia??a na imi?? wojowniczka, kt??ra nie mog??a odda?? dziewictwa bed???? niepokonan???", 0, "Jutta", "Artis", "Cerys", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? przyjaciel Hjalmara, kt??ry zosta?? uwi??ziony w klatce podczas polowania na giganta?", 0, "Vigo", "Hjort", "Artes", 0, 0);
            insertQuestionGame3(db, "Kto posiada?? kart?? z Isengrimem w misji \"Niebezpieczna gra\"?", 0, "Zed", "Ravik", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Kto zostaje ukochanym Keiry?", 0, "Lambert", "Letho", "Eskel", 0, 0);
//60 a
            insertQuestionGame3(db, "Jak ma na imi?? wilko??ak, kt??ry pomaga Geraltowi zabi?? ostatni?? wied??m???", 0, "Otto", "Berem", "Lilly", 0, 0);
            insertQuestionGame3(db, "Jaka choroba doskwiera??a krasnoludowi z Wyspy Mgie???", 0, "Narkolepsja", "Ankylostomoza", "Filarioza", 0, 0);
            insertQuestionGame3(db, "Kt??r?? czarodziejke wi??zi?? Emhyr?", 0, "Margarite Laux-Antille", "Fringill?? Vigo", "Scheale De Tancarville", 0, 0);
            insertQuestionGame3(db, "Jak?? przykrywk?? mia?? Talar?", 0, "Paser", "Szefc", "Kupiec", 0, 0);
            insertQuestionGame3(db, "Kto uciek?? ??owc?? z wi??zienia?", 0, "Bilzen", "Abb?? Faria", "Ferenc", 0, 0);
            insertQuestionGame3(db, "Kt??ry jarl zdradzi?? podczas wojny z Nilfgardem?", 0, "Holger", "Lugos", "Halard", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? przyjaciel Ciri, kt??ry jej pomaga?? w Novigradzie?", 0, "Ferenc", "Valdo", "Ivo", 0, 0);
            insertQuestionGame3(db, "Jak mia??a na imi?? przyjaci????ka Ciri, kt??ra jej pomaga??a w Novigradzie?", 0, "Vea", "Bea", "Tea", 0, 0);
            insertQuestionGame3(db, "Kt??ry z krasnulod??w prze??y?? wypraw?? na Wysp?? Mgie???", 0, "Ivo", "Gaspar", "Ferenc", 0, 0);
            insertQuestionGame3(db, "Z kim Geralt negocjowa?? dostawy dla Hattoriego?", 0, "Tasakiem", "Cyn??", "Bilzenem", 0, 0);

            insertQuestionGame3(db, "Kt??ra wied??ma uciek???? z sabatu?", 0, "Kuchta", "Prz??dka", "Szepciucha", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? miecz, kt??ry Geralt dostaje od Cracha An Craite?", 0, "Ostrze mrozu", "Ostrze zimy", "Ostrze zamieci", 0, 0);
            insertQuestionGame3(db, "Kto przeprowadza?? selekcj?? na ??ysej G??rze?", 0, "Lilith", "Tekla", "Verna", 0, 0);
            insertQuestionGame3(db, "Kto by?? zdrajc?? na Kaer Trolde?", 0, "Artis", "Arnvald", "Halard", 0, 0);
            insertQuestionGame3(db, "Kto zabi?? przyjaciela Lamberta?", 0, "Vester", "Tauler", "Ludvik", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? przyjaciel Geralta ze szko??y kota?", 0, "Wolter", "Aiden", "Bjorn", 0, 0);
            insertQuestionGame3(db, "Kto zdradzi?? kryj??wk?? Letho?", 0, "Vester", "Ludvik", "Tauler", 0, 0);
            insertQuestionGame3(db, "Kto polowa?? na Letho?", 0, "Ludvik", "Vester", "Tauler", 0, 0);
            insertQuestionGame3(db, "Jak ma na imi?? Avallach?", 0, "Br??acc", "Crevan", "Auberon", 0, 0);
            insertQuestionGame3(db, "Co wytatuowa??a sobie Ciri?", 0, "Mistle", "R??????", "Jask????k??", 0, 0);

            insertQuestionGame3(db, "Co wywo??a??o sza?? berseker??w?", 0, "Si????ygron", "Mardroeme", "Kortinarius", 0, 0);
            insertQuestionGame3(db, "Kto rzuci?? kl??tw?? na Morgvarka?", 0, "Myrrha", "Ulve", "Eurneid", 0, 0);
            insertQuestionGame3(db, "Gdzie Triss chcia??a zamieszka?? z Geraltem?", 0, "w Mariborze", "w Kovirze", "w Nazairze", 0, 0);
            insertQuestionGame3(db, "Kto posiada?? kart?? z Janem Natalisem w misji \"Niebezpieczna gra\"?", 0, "Ravik", "Zed", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Kto zabija Radowida?", 0, "Roche", "Filippa", "Dijkstra", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? miecz rodowy Udalryka?", 0, "Ashrune", "Brokvar", "Inis", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? brat Udalryka?", 0, "Holgier", "Aki", "Bjorn", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? Skurwiel Junior?", 0, "Cyprian", "Bedlam", "Tauler", 0, 0);
            insertQuestionGame3(db, "Kto poszed?? z Geraltem nape??nia?? filakterium?", 0, "Eskel", "Lambert", "Vesemir", 0, 0);
            insertQuestionGame3(db, "Kto chcia?? si?? ??ciga?? z Geraltem do topora?", 0, "Hjalmar", "Cerys", "Lugos Siny", 0, 0);

            insertQuestionGame3(db, "Jaka by??a druga ofiara Dettlaffa?", 0, "Vladimir Crespi", "Ramon du Lac","Louis de la Croix", 0, 0);
            insertQuestionGame3(db, "Jaka by??a trzecia ofiara Dettlaffa?", 0, "Ramon du Lac", "Louis de la Croix", "Vladimir Crespi", 0, 0);
            insertQuestionGame3(db, "Z kt??rego rocznika pochodzi?? Sangreal ukradziony przez Sylvi?? Ann???", 0, "1267", "1269", "1271", 0, 0);
            insertQuestionGame3(db, "Kto przyby?? po Geralta do Velen?", 0, "Milton i Crespi", "Palmerin i Milton", "Palmerin i Crespi", 0, 0);
            insertQuestionGame3(db, "Jakie potwory strzeg??y domu Wichta?", 0, "Upiory", "Barghesty", "Trupojady", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? Arcymistrz kowalstwa?", 0, "Cresp", "Zdravko", "Willy", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? Bohater Narodowy Toussaint?", 0, "Toricello", "Reginald", "Vitis Vinifera", 0, 0);
            insertQuestionGame3(db, "Jak mia?? na imi?? Wicht?", 0, "Vinifera", "Marlena", "Romuald", 0, 0);
            insertQuestionGame3(db, "Jak?? toksyczno???? posiada eliksir kot?", 0, "10", "15", "20", 0, 0);
            insertQuestionGame3(db, "Jak?? toksyczno???? posiada eliksir jask????ka?", 0, "15", "20", "25", 0, 0);
//100
            insertQuestionGame3(db, "Jakie by??o drugie ??yczenie Olgierda?", 0, "Dom Borsodych", "Uciechy Olgierda", "R????a Iris", 0, 0);
            insertQuestionGame3(db, "Jak nazywa??a si?? mi??o???? Guillaume de Launfala?", 0, "Pinastri", "Vivienne de Tabris", "Matylda de Vermentino", 0, 0);
            insertQuestionGame3(db, "Jak?? toksyczno???? posiadaj?? odwary?", 0, "65", "70", "75", 0, 0);
            insertQuestionGame3(db, "Kto na??o??y?? kl??tw?? \"Nithilu\" na Lobarta?", 0, "Jutta", "Jona", "Julia", 0, 0);
            insertQuestionGame3(db, "Kogo ratujemy w kasynie Skurwiela Juniora?", 0, "Augusta", "Rico", "Williama", 0, 0);
            insertQuestionGame3(db, "Kto grozi?? Zoltanowi podczas gdy ten zbiera?? kolekcj?? kart?", 0, "August", "Diuk", "Cyna", 0, 0);
            insertQuestionGame3(db, "Kto jest w??a??cicielem trupy teatralnej z Novigradu?", 0, "Maxim Boliere", "Irina Renarde", "Abelard Rizza", 0, 0);
            insertQuestionGame3(db, "Nieopodal jakiej wsi Gascoigne okrada Geralta?", 0, "Rudnik", "Jantra", "Dobrowa", 0, 0);
            insertQuestionGame3(db, "Kto wyciera Yennefer z wymiocin, gdy Geralt zwi??za?? si?? z Triss?", 0, "Lambert", "Eskel", "Vesemir", 0, 0);
            insertQuestionGame3(db, "Z jakiego plemienia pochodzi Regis?", 0, "Tdet", "Gharasham", "Ammurun", 0, 0);
//110

            insertQuestionGame3(db, "Co oznacza skr??t D.L.C?", 0, "Data Link Control", "De La Croix", "Digital Loop Carrier", 0, 0);
            insertQuestionGame3(db, "Zbroja Gryfa to pancerz?", 0, "Lekki", "??redni", "Ci????ki", 0, 0);
            insertQuestionGame3(db, "Jaki bank wyst??puje w Toussaint", 0, "Kovirski", "Chaintanellich", "Vivaldich", 0, 0);
            insertQuestionGame3(db, "Jak nazywa si?? miecz od Pani Jeziora?", 0, "An'ferthe", "Aerondight", "Addan Deith", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar pomaga w walce z upiorami?", 0, "z Upiora", "??agodziciela", "z Po??udnicy", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar zwi??ksza si???? ataku?", 0, "z Nekkera", "z Sukkuba", "z Gryfa", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar zwi??ksza czasowo maksymaln?? ??ywotnosc po zab??jstwie?", 0, "z Gryfa", "z P????nocnicy", "z Upiora", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Novigradu w Gwinta?", 0, "Dijkstra", "Elf", "Vivaldi", 0, 0);
            insertQuestionGame3(db, "Jak?? toksysyczno???? posiada Filtr Petriego?", 0, "20", "25", "30", 0, 0);
            insertQuestionGame3(db, "Ile Emhyr zap??aci?? Geraltowi za przyprowadzewnie Cirilli, nie wliczaj??c w to wekslu?", 0, "2000 floren??w", "4000 floren??w", "5000 floren??w", 0, 0);
//120 b

            insertQuestionGame3(db, "Kogo ratowa??a Triss podczas balu?", 0, "Luka", "Patricka", "Alberta", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? okr??t Wolverstona?", 0, "Velos", "Esmeralda", "Atropos", 0, 0);
            insertQuestionGame3(db, "Z kim Geralt pobi?? si?? na przyj??ciu u Cracha?", 0, "Eyvindem", "Hjalborem", "Lugosem", 0, 0);
            insertQuestionGame3(db, "Co otwiera??o przej??cie do pracowni Myszowora?", 0, "Szyszka", "Czaszka", "Kielich", 0, 0);
            insertQuestionGame3(db, "Na kt??rej wyspie pojawi?? si?? gigant?", 0, "Faroe", "Spikeroog", "Undvik", 0, 0);
            insertQuestionGame3(db, "Gdzie na skellige nie pojawi?? si?? dziki gon?", 0, "Hindersfall", "Ard Skellige", "Faroe", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? ko?? Eskela?", 0, "Pegaz", "Cantarella", "Wojsi??ek", 0, 0);
            insertQuestionGame3(db, "Kto polowa?? z Geraltem na Wid??ogony?", 0, "Lambert", "Vesemir", "Eskel", 0, 0);
            insertQuestionGame3(db, "Co dr??czy??o Udalryka?", 0, "Brat Aki", "Upi??r", "Him", 0, 0);
            insertQuestionGame3(db, "Kto wyczekiwa?? na bia??ego wieloryba?", 0, "Egil", "Hjalbor", "Eyvind", 0, 0);

            insertQuestionGame3(db, "Gdzie mo??na by??o znale???? notatki Berengara?", 0, "Kuchnia", "Dormitoria", "Zachodnia cz?????? dziedzi??ca", 0, 0);
            insertQuestionGame3(db, "Kto by?? mistrzem kowalstwa?", 0, "Yoana", "Zdravko", "Hattori", 0, 0);
            insertQuestionGame3(db, "Kto by?? mistrzem p??atnerstwa?", 0, "Zdravko", "Hattori", "Yoana", 0, 0);
            insertQuestionGame3(db, "Jaki potw??r nie wyst??powa?? zadaniu \"Najgro??niejszy potw??r na Skellige\"?", 0, "Doppler", "Bo????tko", "Sukkub", 0, 0);
            insertQuestionGame3(db, "U jakiego druida zdajemy \"Egzamin z alchemii\"?", 0, "Egila", "Eyvida", "Gremisty", 0, 0);
            insertQuestionGame3(db, "Kogo prze??ladowa?? pokutnik? ", 0, "Jorunda", "Egila", "Mikkjala", 0, 0);
            insertQuestionGame3(db, "Czym musia?? zje???? posi??ek wicht, aby zdj???? kl??tw???", 0, "Widelcem", "??y??k??", "Bez niczego", 0, 0);
            insertQuestionGame3(db, "Kogo uratowa?? Geralt przed o??ywionymi rze??bami, zadaniu pt. \"Rekonstrukcja\"?", 0, "Maxima", "Gastoma", "Duranda", 0, 0);
            insertQuestionGame3(db, "Gdzie mia???? miejsce kryj??wka Regisa?", 0, "w Mont Crane", "w Termes", "w Mere Lachaise", 0, 0);
            insertQuestionGame3(db, "Gdzie uwi??ziono Khagmara?", 0, "w Termes", "w Mere Lachaise", "w Tesham Mutna", 0, 0);

            insertQuestionGame3(db, "Kto nie walczy?? z Szarleyem?", 0, "Palmerin", "Milton", "Guillaume", 0, 0);
            insertQuestionGame3(db, "Kto walczy?? z Goliatem?", 0, "Dejmien", "Crespi", "Guillaume de Launfal", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? majordomus w Corvo Bianco?", 0, "Clemente-Basile", "Ademar-Basile", "Barnabe-Basile", 0, 0);
            insertQuestionGame3(db, "Kto jest tw??rc?? Pog??osu?", 0, "Szezlock", "Moreau", "Covinarius", 0, 0);
            insertQuestionGame3(db, "Kto stworzy?? maszyn?? wzmacniaj??c?? wied??mi??skie mutacje?", 0, "Covinarius", "Szezlock", "Moreau", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? uczony, ktory odkry?? sekret Pana Lusterko?", 0, "Ademar-Basile", "Covinarius", "Szezlock", 0, 0);
            insertQuestionGame3(db, "Z jakiego materia??u by?? wykonany dar dla Ukrytego?", 0, "Szmaragdu", "Nefrytu", "Haaklandzkiego aragonitu", 0, 0);
            insertQuestionGame3(db, "Kto jest mistrzem Skellige w Gwinta?", 0, "Crach an Craite ", "Lugos", "Sjusta", 0, 0);
            insertQuestionGame3(db, "Zbroja nied??wiedzia to pancerz?", 0, "Lekki", "??redni", "Cie??ki", 0, 0);
            insertQuestionGame3(db, "Kt??ry eliksir poprawia refleks?", 0, "Wilga", "Wierzba", "Zamie??", 0, 0);

            insertQuestionGame3(db, "Gdzie przebywa?? Hendrik?", 0, "Konary", "Podlipie", "Wrzosowa", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? druid ??lubuj??cy milczenie?", 0, "Eyvind", "Hjalbor", "Egil", 0, 0);
            insertQuestionGame3(db, "4 ofiara Dettlaffa to?", 0, "Ramon du Lac", "Louis de la Croix", "Milton de Peyrac-Peyran ", 0, 0);
            insertQuestionGame3(db, "5 ofiara Dettlaffa z listy to?", 0, "Vladimir Crespi", "Ramon du Lac", "Xi????na Anarietta", 0, 0);
            insertQuestionGame3(db, "Kto posiada?? kart?? Fringilli Vigo w misji pt. \"Niebezpieczna gra\"??", 0, "Ravik", "Zed", "Caesara Bilzen", 0, 0);
            insertQuestionGame3(db, "Na jakiej wyspie Ulle jest mistrzem areny?", 0, "Faroe", "Ard Skellige", "Spikeroog", 0, 0);
            insertQuestionGame3(db, "Jaki potw??r zal??g?? si?? w misji pt. \"Przekl??ty magazyn\"?", 0, "Sukkub", "Upi??r", "Nekker", 0, 0);
            insertQuestionGame3(db, "Jaki potw??r zal??g?? si?? w misji pt. \"Nawiedzony dom\"?", 0, "Sukkub", "Nekker", "Bo????tko", 0, 0);
            insertQuestionGame3(db, "Do kogo nale??a?? Folwark, na kt??rym skrywa?? si?? Letho?", 0, "Vestera", "Ludvika", "Dolores", 0, 0);
            insertQuestionGame3(db, "Kto podk??ada?? g??os pod Cirill???", 0, "Beata Jewiarz", "Agnieszka Kunikowska", "Anna Cie??lak", 0, 0);
//160
            insertQuestionGame3(db, "Kto podk??ada?? g??os pod Geralta?", 0, "Grzegorz Kwiecie??", "Les??aw ??urek", "Jacek Rozenek", 0, 0);
            insertQuestionGame3(db, "Jaka jest data premiery gry?", 0, "13 Marca 2015", "27 Kwietnia 2015", "18 maja 2015", 0, 0);
            insertQuestionGame3(db, "Dla kogo poszukiwali??my czarnej per??y?", 0, "Zed", "Ravik", "Nidas", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar regeneruje ??ywotno?????", 0, "z Po??udnicy", "z Gryfa", "z Ekimmy", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar odbija cz?????? obra??e???", 0, "z Gryfa", "z Ekimmy", "z Leszego", 0, 0);
            insertQuestionGame3(db, "Kt??ry odwar zwi??ksza szans?? na krytyczne uderzenie?", 0, "z Ekimmy", "z Leszego", "z Katakana", 0, 0);
            insertQuestionGame3(db, "Kt??ry eliksir zwi??ksza odporno???? na zatrucia?", 0, "Orka", "Wierzba", "Wilga", 0, 0);
            insertQuestionGame3(db, "Kt??ry eliksir zwi??ksza ilo???? tlenu w p??ucach?", 0, "Wilga", "P????noc", "Orka", 0, 0);
            insertQuestionGame3(db, "Ile wyst??puje \"stopni\" eliksir??w?", 0, "5", "4", "3", 0, 0);
            insertQuestionGame3(db, "Ile wynosi toksyczno???? Dekoktu Raffarda Bia??ego?", 0, "20", "25", "30", 0, 0);

            insertQuestionGame3(db, "Kto posy??a Geralta do jaskini sn??w?", 0, "Jorund", "Eyvind", "Lugos", 0, 0);
            insertQuestionGame3(db, "Kto by?? seryjnym morderc?? z Novigradu?", 0, " Joris Aquinus", "Nataniel", "Hubert Rejk", 0, 0);
            insertQuestionGame3(db, "Komu na skradziono \"Bardzo cenny r??g\"?", 0, "Jorundowi", "Rejkowi", "Mathiosowi", 0, 0);
            insertQuestionGame3(db, "W jakiej wiosce wyst??puje zadanie pt \"Nieproszeni go??cie\"?", 0, "Sztygary", "Konary", "Carsten", 0, 0);
            insertQuestionGame3(db, "Gdzie Yennefer chce si?? spotka?? w Geraltem po wizycie na Hindersfall?", 0, "Kaer Trolde", "Lofoten", "Larvik", 0, 0);
            insertQuestionGame3(db, "Czym instruktorem szermierki zostaje Geralt?", 0, "Henrego", "Edny", "Rosy", 0, 0);
            insertQuestionGame3(db, "Gdzie za m??odu wi??ziono Syjan???", 0, "W lochu", "W komnacie", "W krainie czar??w", 0, 0);
            insertQuestionGame3(db, "Co by??o trzecim ??yczeniem Olgierda?", 0, "Dom Bordodych", "Uciechy Witolda", "R????a Iris", 0, 0);
            insertQuestionGame3(db, "Kto pomaga Geraltowi w skoku na Borsodych?", 0, "Maksymilian", "Horst", "Ewald", 0, 0);
            insertQuestionGame3(db, "Co wylewa?? pucybut, aby przyci??gn???? do siebie wi??cej klient??w?", 0, "??cieki", "Szczochy", "Pomyje", 0, 0);

            insertQuestionGame3(db, "Vivienne przemienia??a si?? w ludzkich rozmiar??w?", 0, "Kormorana", "Surykatk??", "Wilg??", 0, 0);
            insertQuestionGame3(db, "Jak nazywa?? si?? wied??min ze szko?? kota, kt??ry wymordowa?? ca???? wie???", 0, "Brehen", "Merten", "Gaetan", 0, 0);
            insertQuestionGame3(db, "W jakiej wsi mo??na by??o postkac \"fa??szywego wied??mina\"?", 0, "Dobrowo", "Rudnik", "Zalipie", 0, 0);
            insertQuestionGame3(db, "Jak?? toksyczno???? posiada Las Mariborski?", 0, "30", "25", "20", 0, 0);




//184


            insertQuestionBook1(db, "Kto by?? zdrajc?? na tronie Foltesta?", 0, "Ostrit", "Tailles", "Anais", 0, 0);
            insertQuestionBook1(db, "Kim by??a Adda?", 0, "C??rk?? Foltesta", "Kochank?? Geralta", "Czarodziejk??", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobi?? Addzie, zanim zemdla???", 0, "Ugryz??", "Uderzy??", "Kopn????", 0, 0);
            insertQuestionBook1(db, "Kim by?? Velerad?", 0, "Grododzier??c??", "Doradc?? kr??la", "Kupcem", 0, 0);
            insertQuestionBook1(db, "Ilu ludzi zabi?? Geralt w karczmie w opowiadaniu pt. \"Wied??min\"?", 0, "3", "4", "5", 0, 0);
            insertQuestionBook1(db, "W jakim miejscu zazwyczaj leczy?? si?? Geralt, mi??dzy innymi po walce ze Strzyg???", 0, "W ??w. Melitelle", "U uzdrowicieli",  "W szpitalu", 0, 0);
            insertQuestionBook1(db, "Ile wynosi??a nagroda za odczarowanie strzygi wed??ug kr??lewskiego or??dzia?", 0, "3000 oren??w ", "3500 oren??w", "4000 oren??w", 0, 0);
            insertQuestionBook1(db, "Co by??o przyczyn?? kl??twy Addy?", 0, "Kazirodztwo", "Cudzo????stwo", "Krzywoprzysi??stwo", 0, 0);
            insertQuestionBook1(db, "Na jakim zamku kr??lowa??a Strzyga?", 0, "Dworzyszcze", "Attre", "Starogrod??", 0, 0);
            insertQuestionBook1(db, "Jakim pa??swem rz??dzi Foltest?", 0, "Temeri??", "Keadwen", "Redani??", 0, 0);
// Wiedzmin - a

            insertQuestionBook1(db, "Przez il?? lat strzyga zabija??a niewinnych?", 0, "6", "9", "2", 0, 0);
            insertQuestionBook1(db, "Kto prze??y?? atak strzygi?", 0, "M??ynarz", "Kupiec", "Kowal", 0, 0);
            insertQuestionBook1(db, "Dlaczego ludzie nie lubi?? Riv??w? Wed??ug nich \"Ka??dy Riv to...\"?", 0, "Z??odziej", "??pun", "K??amca", 0, 0);
            insertQuestionBook1(db, "W jakich okoliczno??ciach poznali si?? Geralt i Velerad?", 0, "Geralt zabi?? ludzi", "W Brokilonie", "Na rozdro??u", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobi?? z nagrod?? za strzyg???", 0, "Odda?? Yennefer", "Kupi?? miecz", "Kupi?? konia", 0, 0);
            insertQuestionBook1(db, "Kogo Geralt wykorzysta?? jako przyn??t?? na strzyge?", 0, "Ostrita", "Eista", "Tailles'a ", 0, 0);
            insertQuestionBook1(db, "Do jakiej karczmy nie chcia?? uda?? si?? Geralt w opowiadaniu pt. \"Wied??min\"?", 0, "Stary Narakort", "Nowy Narakort", "Pod Lisem", 0, 0);
            insertQuestionBook1(db, "Kto chcia?? przep??dzi?? Geralta ze ??wi??tyni Melitelle?", 0, "Tailles i Falwick", "Tailles i Jarre", "Falwick i Regner", 0, 0);
            insertQuestionBook1(db, "Jak nazywa si?? kap??anka ze ??wi??tyni Melitelle, kt??ra ??lubowa??a milczenie?", 0, "Iola Pierwsza", "Eurneid", "Myrrha", 0, 0);
            insertQuestionBook1(db, "Co grozi??o Geraltowi za zabicie strzygi?", 0, "Nic", "??mier??", "Wygnanie", 0, 0);

            insertQuestionBook1(db, "Jak nazywa??a si?? \"prawdziwa mi??o????\" Nivellena?", 0, "Vereena", "Asse", "Reef", 0, 0);
            insertQuestionBook1(db, "Dlaczego kupcy oddawali swoje c??rki Nivellenowi?", 0, "Dla bogactw", "Ze strachu", "Porywa?? je", 0, 0);
            insertQuestionBook1(db, "Jak?? moc posiada?? Nivellen?", 0, "Kontrola domu", "Niewidzialno????", "Lata??", 0, 0);
            insertQuestionBook1(db, "Dlaczego Nivellen zosta?? przekl??ty?", 0, "Za gwa??t", "Za kradzie??", "Za Morderstwo", 0, 0);
            insertQuestionBook1(db, "Kap??ank?? jakiej ??wi??tni zgwa??ci?? Nivellen?", 0, "Coram Agh Tera", "Addan Deith", "Deithwen", 0, 0);
            insertQuestionBook1(db, "Kim okaza??a si?? ostatnia kochanka Nivellena?", 0, "Brux??", "Alp??", "Rusa??k??", 0, 0);
            insertQuestionBook1(db, "Co spowoda??o zdj??cie kl??twy z Nivellena?", 0, "Wyznanie mi??o??ci", "??mier?? Bruxy", "Rytua?? Geralta", 0, 0);
            insertQuestionBook1(db, "Jakie kwiaty Nivellen chodowa?? pod domem?", 0, "R????e z Nazairu", "P??atki zimejki", "Owoce balissy", 0, 0);
            insertQuestionBook1(db, "Komu Nivellen zawdzi??cza?? ratunek?", 0, "Geraltowi", "Veerenie", "Ojcu", 0, 0);
            insertQuestionBook1(db, "Co spododowa??o, ??e Geralt odwiedzi?? Nivellena?", 0, "Zw??oki", "Medalion drga??", "Zab????dzi??", 0, 0);
// Ziarno prawdy - a

            insertQuestionBook1(db, "Jak nazywa?? si?? w??jt Blaviken?", 0, "Kayleigh", "Caldemeyn", "Fercart", 0, 0);
            insertQuestionBook1(db, "Co Geralt zrobi??, ??e Libusze sie go ba??a?", 0, "Zabi?? ludzi", "Zabi?? szczura", "By?? wied??minem", 0, 0);
            insertQuestionBook1(db, "Co zrobi?? Tales podczas rozmowy z Geraltem i Nenneke?", 0, "Uderzy?? Nenneke", "Rzuci?? r??kawic??", "Zrani?? si??", 0, 0);
            insertQuestionBook1(db, "Jak na prawd?? nazywa?? si?? mistrz Irion z opowiadania pt \"Mniejsze z??o\"?", 0, "Radcliffe", "Stregobor", "Irion", 0, 0);
            insertQuestionBook1(db, "Jak ma na imi?? dzierzba?", 0, "Falka", "Renfri", "Reef", 0, 0);
            insertQuestionBook1(db, "Kto polowa?? na dzieci dotkni??te \"kl??tw?? czarnego s??o??ca\"?", 0, "Falka", "Stregobor", "Renfri", 0, 0);
            insertQuestionBook1(db, "Jakiego potwora zabi?? Geralt w Blaviken?", 0, "Kuroliszka", "Kikimor??", "Vivern??", 0, 0);
            insertQuestionBook1(db, "Jak nazywa?? si?? mag, kt??ry wymy??li?? przekle??stwo czarnego s??o??ca?", 0, "Stregobor", "Eldibald", "Radcliffe", 0, 0);
            insertQuestionBook1(db, "Kogo mia??y sprowadzic kobiety z przekl??nstwa czarnego s??o??ca?", 0, "Tamiela", "Lilit", "Berith", 0, 0);
            insertQuestionBook1(db, "Kim by??a Marilka?", 0, "Rybaczk??", "C??rk?? Caldemeyna", "Handlark??", 0, 0);

            insertQuestionBook1(db, "Jaki tytu?? nadano Geraltowi w opowiadaniu pt. \"Mniejsze z??o\"?", 0, "Bia??y Wilk", "Rze??nik z Blaviken", "Gwynbleidd", 0, 0);
            insertQuestionBook1(db, "Jaki by?? pierwszy zabity przez Geralta potw??r?", 0, "Topielec", "Cz??owiek", "Mantikora", 0, 0);
            insertQuestionBook1(db, "Jakie ultimatum chcia??a zastosowa?? Renfri?", 0, "Mizoze??skie", "Tridamskie", "Verge??skie", 0, 0);
            insertQuestionBook1(db, "Jak?? nagrod?? otrzyma?? Geralt za uratowanie mieszka??c??w Blaviken?", 0, "Z??oto", "Kamie?? w ??eb", "Miecz", 0, 0);
            insertQuestionBook1(db, "Jak mia??a na imi?? macocha Renfrii?", 0, "Dorren", "Aridea", "Asse", 0, 0);
            insertQuestionBook1(db, "Czy istnieje wied??mi??ski kodeks?", 0, " Zale??y od szko??y", "Nie", "Tak ", 0, 0);
            insertQuestionBook1(db, "Jak Geralt zareagowa?? na pr??be zabrania zw??ok Renfri?", 0, "Nie by??o go", "Zabroni??", "Pozwoli??", 0, 0);
            insertQuestionBook1(db, "Gdzie Geralt nocowa?? w Blaviken?", 0, "W knajpie", "U w??jta", "W lesie", 0, 0);
            insertQuestionBook1(db, "Kto przygarn???? Renfri, gdy ta uciek??a z domu?", 0, "Elfy", "Gnomy", "Krasnoludy", 0, 0);
            insertQuestionBook1(db, "Jaki tytu?? szlachecki nosi Renfri?", 0, "Markiza", "Ksi????niczka", "Baronowa", 0, 0);
//mniejsze z??o - b

            insertQuestionBook1(db, "Jaki przydomek ma Calanthe?", 0, "Pazur", "Lwica", "Lwi??tko", 0, 0);
            insertQuestionBook1(db, "Czyje za??lubiny odby??y si?? w Cintrze, gdy Geralt by?? go??ciem?", 0, "Calanthe", "Pavetty", "Adalii", 0, 0);
            insertQuestionBook1(db, "Jak przedstawia?? si?? Geralt na za??lubinach w Cintrze?", 0, "Geralt z Rivii", "Ravix z 4-rogu", "Cahir", 0, 0);
            insertQuestionBook1(db, "Jak ma na imi?? Je?? z Erlenwaldu?", 0, "Regner", "Duny", "Draig", 0, 0);
            insertQuestionBook1(db, "Po co Geralt zosta?? wezwany na uczt?? w Cintrze? Aby?", 0, "Zabi?? potwora", "Zabi?? Je??a", "Chroni?? Calanthe", 0, 0);
            insertQuestionBook1(db, "Na czyje zlecenie Geralt mia?? dokona?? zab??jstwa podczas za??lubin?", 0, "Myszowora", "Calanthe", "Regnera", 0, 0);
            insertQuestionBook1(db, "Co spowodowa??o odczarowanie kl??twy Je??a z Erlenwaldu?", 0, "Eliksir", "Wydanie Pavetty", "Rytua?? wied??mina", 0, 0);
            insertQuestionBook1(db, "Kim jest Pavetta?", 0, "Matk?? Calanthe", "C??rk?? Calanthe", " Babci?? Cirilli", 0, 0);
            insertQuestionBook1(db, "Kogo po??lubi??a Calanthe?", 0, "Cracha", "Eista", "Dunego", 0, 0);
            insertQuestionBook1(db, "Jak nazywa?? si?? zmar??y m???? Calanthe?", 0, "Eist", "Regner", "Vizimir", 0, 0);

            insertQuestionBook1(db, "Kogo uratowa?? Je?? z Erlenwaldu?", 0, "Eista", "Regnera", "Calanthe", 0, 0);
            insertQuestionBook1(db, "Czego domaga?? si?? Dunny podczas za??lubin w Cintrze?", 0, "Z??ota", "Pavetty", "Ziem", 0, 0);
            insertQuestionBook1(db, "Pavetta potrafi??a pos??ugiwa?? si?? magi???", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook1(db, "Kto gra?? podczas za??lubin w Cintrze?", 0, "Jaskier", "Drogodar", "Essi Daven", 0, 0);
            insertQuestionBook1(db, "Gdzie odby??a si?? 1 bitwa kr??lowej Calanthe?", 0, "Pod Jarug??", "Chocieborz", "Sodden", 0, 0);
            insertQuestionBook1(db, "Jak nazywa?? si?? kasztelan z Cintry?", 0, "Myszow??r", "Haxo", "Ma??ko", 0, 0);
            insertQuestionBook1(db, "Jak nazywa?? si?? druid ze Skellige, obecny podczas za??lubin Pavetty?", 0, "Draig Bon-Dhu", "Myszow??r", "Drogodar", 0, 0);
            insertQuestionBook1(db, "Kiedy Duny traci?? objawy kl??twy?", 0, "Po 22:00", "Po 24:00", "Po 01:00", 0, 0);
            insertQuestionBook1(db, "Kto mia?? planowo po??lubi?? Pavette?", 0, "Eist", "Crach", "Duny", 0, 0);
            insertQuestionBook1(db, "Czego za????da?? Geralt jako zaplaty od Dunego?", 0, "Konia", "Prawa Niespodzianki", "Z??ota", 0, 0);
//Kwiestnia Ceny - b

            insertQuestionBook1(db, "Co ukrywa?? za atlasem Jaskier podczas nauki w Oxenfurcie?", 0, "Lutni??", "Brudnopis", "Alkohol", 0, 0);
            insertQuestionBook1(db, "Dlaczego Geralt pojecha?? na kraniec ??wiata?", 0, "Szuka?? Jaskra", "Szuka?? Yennefer", "Szuka?? pracy", 0, 0);
            insertQuestionBook1(db, "Kto towarzyszy?? Geraltowi w Dol Blanthana?", 0, "Yennefer", "Zoltan", "Jaskier", 0, 0);
            insertQuestionBook1(db, "Kto wynaj???? Geralta w Dol Blanthana?", 0, "Ma??ko", "Dhun", "Pokrzywka", 0, 0);
            insertQuestionBook1(db, "Jak mia?? na imi?? Diabo???", 0, "Galarr", "Dhun", "Torque", 0, 0);
            insertQuestionBook1(db, "Jakim potworem by?? tak na prawd?? diabo???", 0, "Trollem", "Demonem", "Silvanem", 0, 0);
            insertQuestionBook1(db, "Kto zniszczy?? lutni?? Jaskra w Dolinie Kwiat??w?", 0, "Torque", "Galarr", "Toruviel", 0, 0);
            insertQuestionBook1(db, "Gdzie przebywa?? diabo??? ", 0, "W lesie", "W g??rach", "W polu konopii", 0, 0);
            insertQuestionBook1(db, "Dlaczego Geralt nie zabi?? Silvana?", 0, "Przez elfy", "Zgubi?? miecz", "By?? rozumny", 0, 0);
            insertQuestionBook1(db, "Sk??d diabo?? wzi???? ??elazne kulki?", 0, "Ukrad??", "Od elf??w", "Od ch??op??w", 0, 0);

            insertQuestionBook1(db, "Kto umia?? czyta?? star?? ksi??ge z kra??ca ??wiata?", 0, "Dhun", "Galarr", "Babka", 0, 0);
            insertQuestionBook1(db, "Kim by??a Lille?", 0, "Elfem", "Po??udnic??", "Pann?? Poln??", 0, 0);
            insertQuestionBook1(db, "Kto porwa?? i chcia?? zabi?? wied??mina podczas Walki z Torque?", 0, "??ywia", "Najemnicy", "Elfy", 0, 0);
            insertQuestionBook1(db, "Kim by?? Fillavandrel?", 0, "Potworem", "Elfim pos??a??cem", "Kr??lem elf??w", 0, 0);
            insertQuestionBook1(db, "Kto uratowa?? ??ycie Geralta i Jaskra, przed egzekucj?? elf??w?", 0, "Torque", "Ch??opi", "??ywia", 0, 0);
            insertQuestionBook1(db, "Dlaczego torque krad?? zbo??e?", 0, "By?? g??odny", "By?? z??o??liwy", "Dla elf??w", 0, 0);
            insertQuestionBook1(db, "Od kogo Jaskier otrzyma?? elfi?? lutni???", 0, "Od Torque", "Od Galarra", "Od Filavandrela", 0, 0);
            insertQuestionBook1(db, "Co Geralt wzi???? jako nagrod??, za przep??dzenie diabo??a?", 0, "Tylko z??oto", "Konia", "Ksi??g??", 0, 0);
//Kraniec swiata - c
            insertQuestionBook1(db, "Co robili Geralt i Jaskier, gdy znale??li D??ina?", 0, "Brali k??piel", "Szukali D??ina", "??owili Ryby", 0, 0);
            insertQuestionBook1(db, "Jak brzmia??o pierwsze ??yczenie Geralta?", 0, "Yennefer", "Chc?? spokoju", "\"Id?? i wyr. si?? sam\"", 0, 0);

            insertQuestionBook1(db, "Jak brzmia??o drugie ??yczenie Geralta?", 0, "\"Id?? i wyr. si?? sam\"", "Spok??j od Jaskra", "\"??eby?? p??k?? skur.\"", 0, 0);
            insertQuestionBook1(db, "Jak brzmia??o ostatnie ??yczenie Geralta?", 0, "\"Id?? i wyr. si?? sam\"", "\"??eby?? p??k?? skur.\"", "Yennefer", 0, 0);
            insertQuestionBook1(db, "Kto zaatakowa?? Jaskra w opowiadaniu pt. \"Ostatnie ??yczenie\"?", 0, "Yennefer", "Utopiec", "D'jinni", 0, 0);
            insertQuestionBook1(db, "Jak nazywa?? si?? elfi medyk zakochany w Yennefer?", 0, "Nevile", "Errdil", "Chireadan", 0, 0);
            insertQuestionBook1(db, "W czyim domu mieszka??a Yennefer, kiedy pozna??a si?? z Geraltem?", 0, "Chireadana", "Nevile", "Berranta", 0, 0);
            insertQuestionBook1(db, "Jakie jest niespe??nione, najwi??ksze marzenie Yennefer?", 0, "Pot??ga", "S??awa", "P??odno????", 0, 0);
            insertQuestionBook1(db, "W jakiej miejscowo??ci Geralt pozna?? Yennefer?", 0, "W Wyzimie", "W Vengerbergu", "W Rinde", 0, 0);
            insertQuestionBook1(db, "Co przyni??s?? Geralt Yennefer podczas 1 spotkania?", 0, "Piecz???? d??ina", "Pieni??dze", "Sok jab??kowy", 0, 0);
            insertQuestionBook1(db, "Jaki zapach mo??na by??o wyczu?? od Yennefer?", 0, "Frezji i Morel", "Lilli i Fio??k??w", " Bzu i Agrestu", 0, 0);
            insertQuestionBook1(db, "Co zrobi??a Yennefer po zobaczeniu Geralta  w swojej sypialni?", 0, "Wyprosi??a go??ci", "Wys??a??a go po sok", "Zaatakowa??a go", 0, 0);

            insertQuestionBook1(db, "Za co Geralt trafi?? do lochu w Rinde?", 0, "W??amanie", "Kradzie??", "Napa???? na rajc??w", 0, 0);
            insertQuestionBook1(db, "Kto teleportowa?? Geralta do mieszkania Yennefer w celu ratowania miasta?", 0, "Errdil", "Neville", "Krepp", 0, 0);
            insertQuestionBook1(db, "Dlaczego ka??dy wy??miewa?? egzorcyzm Geralta?", 0, "Przekr??ca?? go", "By?? amatorski", "By?? wulgarny", 0, 0);
            insertQuestionBook1(db, "Kogo Geralt spra?? pasem po dupie?", 0, "Kupca", "M??ynarza", "Aptekarza", 0, 0);
            insertQuestionBook1(db, "Dlaczego wsp????-wi????niowie nie chcieli rozmawia?? z Geraltem?", 0, "By?? wied??minem", "Pobi?? ich", "By?? politycznym", 0, 0);
            insertQuestionBook1(db, "Kto nazwa?? Yennefer - \"Yen\", jako pierwszy w historii?", 0, "Istredd", "Triss", "Geralt", 0, 0);
            insertQuestionBook1(db, "Dlaczego Cranmer zlekcewa??y?? rozkazy Falwicka?", 0, "Mia?? innego szefa", "Ba?? si?? Geralta", "G. nie z??ama?? umowy", 0, 0);

//107

// Miecz przeznaczenia

//Granica mo??liwo??ci

            insertQuestionBook2(db, "Jak przedstawia sie ludziom Villentretenmerth?", 0, "Borch 3 Kawki", "Dorregaray", "Nohorn", 0, 0);
            insertQuestionBook2(db, "Jak mia??y na imi?? pomocniczki Villentretenmertha?", 0, "Tea i Vea", "Cori i Nori", "Nina i Ida", 0, 0);
            insertQuestionBook2(db, "Na jakiego potwora polowa?? wied??min, gdy uznano go za zmar??ego i pr??bowano go obrabowa???", 0, "Bazyliszka", "Vivern??", "Kuroliszka", 0, 0);
            insertQuestionBook2(db, "Do jakiej ober??y zaprosi?? Geralta Borh?", 0, "Pod Zadumanym Smokiem", "Pod Skrzyd??ami Viverny", "Pod Urokiem Bazyliszka", 0, 0);
            insertQuestionBook2(db, "Na jakie smoki Geralt nie poluje?", 0, "??adne", "Z??ote", "Zielone", 0, 0);
            insertQuestionBook2(db, "Kt??ry kr??l chcia?? upolowa?? smoka?", 0, "Niedamir", "Gyllenstiern", "Vyzimir", 0, 0);
            insertQuestionBook2(db, "Gdzie odby??o si?? polowanie na smoka?", 0, "Ko??o Ho??opola", "W g??rach Sodden", "W Dolinie Pontaru", 0, 0);
            insertQuestionBook2(db, "Kto otru?? smoka?", 0, "Kozojed", "Pokrzywka", "Dhun", 0, 0);
            insertQuestionBook2(db, "Kto by?? przyw??dc?? R??baczy z Crinfrid?", 0, "Boholt", "Niszczuka", "Zdzieblarz", 0, 0);
            insertQuestionBook2(db, "Yannick Brass, Paulie Dahlberg i Lucas Corto to imiona?", 0, "Krasnolud??w", "R??baczy z Crinfrid", "Ch??op??w z Ho??opola", 0, 0);

            insertQuestionBook2(db, "Jaki rycerz bez wady i skazy zmar?? podczas starcia ze smokiem?", 0, "Eyck", "Brass", "Gyllenstiern", 0, 0);
            insertQuestionBook2(db, "Kto powiedzia?? Geraltowi o tym, ??e Yennefer poluje na smoka?", 0, "Dorregaray", "Jaskier", "Borch", 0, 0);
            insertQuestionBook2(db, "Z jakiego powodu Geralt do????czy?? do polowania na smoka?", 0, "Yennefer", "Borcha", "Jaskra", 0, 0);
            insertQuestionBook2(db, "Kto zwi??za?? Geralta i Yennefer w opowiadaniu pt. \"Granica mo??liwo??ci\"?", 0, "R??bacze", "Krasnoludy", "Ch??opi", 0, 0);
            insertQuestionBook2(db, "W jaki spos??b Yennefer rzuci??a zakl??cie, kt??re uratowa??o j?? i Geralta podczas polowania na smoka?", 0, "Stop??", "??okciem", "Lew?? rek??", 0, 0);
            insertQuestionBook2(db, "Jaki smok stan???? do obrony swojego pobratymca?", 0, "Villentretenmerth", "Ocvist", "Saesenthessis", 0, 0);
            insertQuestionBook2(db, "Z jakiego powodu Yennefer nie chcia??a rozmawia?? z wied??minem, podczas polowania na smoka?", 0, "Zostawi?? j??", "Wybra??a Istredda", "By??a jego ??yczeniem", 0, 0);
            insertQuestionBook2(db, "Jaki czarodziej rzeszy?? druidzkie postulaty o r??wnowadze ??wiata i ochronie wymieraj??ych gatunkow?", 0, "Dorregaray", "Istredd", "Myszow??r", 0, 0);
            insertQuestionBook2(db, "Kto spu??ci?? lawin?? na ludzi Niedamira?", 0, "Borch", "Dorregaray", "Natura", 0, 0);
            insertQuestionBook2(db, "\"Legendy sie nie zabija\" - czyje to s??owa?", 0, "Dorregaraya", "Jaskra", "Geralta", 0, 0);

            insertQuestionBook2(db, "Kto rzuci?? lin?? Geraltowi nad przepa??ci???", 0, "Eyck", "R??bacze", "Jaskier", 0, 0);
            insertQuestionBook2(db, "Kto gapi?? si?? zwi??zany na cycki Yennefer?", 0, "Jaskier", "Geralt", "Boholt", 0, 0);
            insertQuestionBook2(db, "Jak umar?? Eyck z Denesle?", 0, "W boju", "Sraj??c", "??pi??c", 0, 0);
            insertQuestionBook2(db, "Jak?? nagrod?? dosta?? Borch od smoczycy, kt??r?? uratowa???", 0, "Dziecko", "Skarb", "Lojalno????", 0, 0);
            insertQuestionBook2(db, "Kto chcia?? zgwa??ci?? Yennefer?", 0, "Boholt", "??dzieblarz", "Niszczuka", 0, 0);
//25 - a

//Okruch lodu
            insertQuestionBook2(db, "Jak brzmi?? pierwsze s??owa wypowiadane przez Yennefer do Geralta w opowiadniu pt. \"Okruch lodu\"?", 0, "??mierdzisz", "Chod?? do mnie", "Spo??ni??e?? si??", 0, 0);
            insertQuestionBook2(db, "Jakiego potwora Geralt zabi?? w Aedd Gynvael?", 0, "Zeugla", "Kikimor??", "Mantikor??", 0, 0);
            insertQuestionBook2(db, "Co Yennefer zawsze robi??a przed p??j??ciem do ??????ka, co Geralt lubi?? obserwowa???", 0, "Czesa??a si??", "My??a si??", "Balsamowa??a si??", 0, 0);
            insertQuestionBook2(db, "Jakiego ptaka wyczarowa??a Yennefer w mieszkaniu w Aedd Gynvael?", 0, "Pustu??k??", "Sow??", "Bociana", 0, 0);
            insertQuestionBook2(db, "Co oznacza Aedd Gynvael?", 0, "Okruch lodu", "Ziarno prawdy", "Bia??e zimno", 0, 0);

            insertQuestionBook2(db, "Co starosta Herbolth robi?? na rejwachu?", 0, "Przyjmowa?? ??ap??wki", "Egzekwowa?? prawo", "Politykowa??", 0, 0);
            insertQuestionBook2(db, "Jaki pseudonim mia?? Ivo Mirce?", 0, "Cykada", "Dzie??ba", "Pi??tnastka", 0, 0);
            insertQuestionBook2(db, "Kto by?? ochraniarzem Herboltha?", 0, "Cykada", "Civril", "Nohorn", 0, 0);
            insertQuestionBook2(db, "Ile Geralt dosta?? za zabicie Zeugla od Herboltha?", 0, "90 marek", "95 marek", "100 marek", 0, 0);
            insertQuestionBook2(db, "Gdzie najbardziej lubi??a si?? kocha?? Yennefer?", 0, "Na jednoro??cu", "W ??????ku", "Na stole", 0, 0);
            insertQuestionBook2(db, "Czym w rytua??ach magicznych r????ni si?? krew dziewicy od normalnej krwii?", 0, "Niczym", "Jako??ci??", "Normalna nie dzia??a", 0, 0);
            insertQuestionBook2(db, "Kt??ry czarodziej konkurowa?? z Geraltem o wzgl??dy Yennefer?", 0, "Istredd", "Radcliffe", "Cregennan", 0, 0);
            insertQuestionBook2(db, "Czy Yennefer w ci??gu 24h kocha??a si?? z Geraltem i Istreddem?", 0, "Tak", "Nie", "Nie wiadomo", 0, 0);
            insertQuestionBook2(db, "Czy kiedykolwiek Yennefer spu??ci??a wzrok przed Geraltem?", 0, "W Aedd Gynvael", "W Rinde", "Nigdy", 0, 0);
            insertQuestionBook2(db, "Gdzie Geralt i Istredd um??wili si?? na pojedynek?", 0, "Pod studni??", "Na rynku", "Nie umawiali si??", 0, 0);

            insertQuestionBook2(db, "Ile Herbolth oferowa?? Geraltowi za zaprzestanie pojedynku z Istreddem?", 0, "100 marek", "150 marek", "200 marek", 0, 0);
            insertQuestionBook2(db, "Kto wygra?? pojedynek Geralta i Istredda?", 0, "Geralt zrezygnowa??", "Geralt", "Istredd", 0, 0);
//42 - a
// Wieczny Ogien
            insertQuestionBook2(db, "Gdzie odbywa si?? opowiadanie pt. \"Wieczny Ogie??\"?", 0, "w Oxenfurcie", "w Novigradzie", "w Aedd Gynvael", 0, 0);
            insertQuestionBook2(db, "Kto wyrzuca?? rzeczy Jaskra przez okno?", 0, "Vesna", "Vespula", "Sasha", 0, 0);
            insertQuestionBook2(db, "Do jakiej knajpy w Novigradzie udali si?? Jaskier i Geralt po k????tni z Vespul???", 0, "Pod Udami Dziewicy", "Pod Grotem", "Pod Zadumanym Smokiem", 0, 0);
            insertQuestionBook2(db, "Jak tytu?? nada?? Jaskier balladzie, kt??r?? u??o??y?? w Novigradzie?", 0, "Zima", "Wieczny Ogie??", "Wilcza Zamie??", 0, 0);
            insertQuestionBook2(db, "Pod kogo podszywa?? si?? Dudu?", 0, "Drofussa", "Biberveldta", "Chappelle", 0, 0);
            insertQuestionBook2(db, "Jakie przychody uda??o si?? usi??gn???? Dudu, gdy podszywa?? si?? pod Biberveldta?", 0, "Zerowe", "Dodatnie", "Ujemne", 0, 0);
            insertQuestionBook2(db, "Jak ma na imi?? Dudu?", 0, "Gibellini", "Tellico Lunngrevink", "Zammorto", 0, 0);
            insertQuestionBook2(db, "Ile koni ukrad?? Dudu?", 0, "7", "12", "10", 0, 0);

            insertQuestionBook2(db, "Kto by?? namiestnikiem do spraw bezpiecze??stwa Novigradu?", 0, "Schwann", "Chappelle", "Hemmelfart", 0, 0);
            insertQuestionBook2(db, "Kim by?? Chappelle, gdy pozna?? go Geralt?", 0, "Cz??owiekiem", "Dopplerem", "Elfem", 0, 0);
            insertQuestionBook2(db, "Kto by?? znajomym bankierem Biberveldta?", 0, "Schwann", "Vimme Vivaldi", "Nino Cianfanelli", 0, 0);
            insertQuestionBook2(db, "Ile wynosi?? podatek Biberveldta nabity przez Dudu?", 0, "2000 koron", "1500 koron", "1800 koron", 0, 0);
            insertQuestionBook2(db, "Kt??rego z tych towar??w nie zakupi?? Dudu?", 0, "Kory Mimozowej", "Dratwy", "Olejk??w", 0, 0);
            insertQuestionBook2(db, "Kto by?? poborc?? podatk??w w Novigradzie?", 0, "Vivaldi", "Schwann", "Drofuss", 0, 0);
            insertQuestionBook2(db, "W kogo z nich nie zmienia?? si?? Dudu?", 0, "Jaskra", "Chappelle", "Geralta", 0, 0);
            insertQuestionBook2(db, "Kto doko??czy?? Jaskrowi piosenk?? pt. \"Wieczny ogie??\"?", 0, "Marabella ", "Dudu", "Priscilla", 0, 0);
            insertQuestionBook2(db, "Kto pobi?? Dudu, przez co ten prawie zosta?? zdemaskowany?", 0, "Geralt", "Vespula", "Biberveldt", 0, 0);
            insertQuestionBook2(db, "Kim zosta?? Dudu?", 0, "Namiestnikiem", "Bankierem", "Factorem", 0, 0);

//60 - b
// Troch?? po??wi??cenia
            insertQuestionBook2(db, "Geralt robi?? za t??umacza pomi??dzy ksi??ciem, a?", 0, "Krasnoludami", "Syren??", "Elfami", 0, 0);
            insertQuestionBook2(db, "Jaki ksi?????? chcia?? po??lubi?? syren???", 0, "Fletwick", "Agloval", "Drouhard", 0, 0);
            insertQuestionBook2(db, "Ile Agloval zap??aci?? Geraltowi za rol?? t??umacza?", 0, "100 marek", "0 marek", "50 marek", 0, 0);
            insertQuestionBook2(db, "Doko??cz ostatnie zdanie jednej z ballad Jaskra. \"Chcesz by?? nikim, b??d??...\".", 0, "Druidem", "Le??niczym", "Stra??nikiem", 0, 0);
            insertQuestionBook2(db, "Z jakim trubadurem Jaskier tworzy?? duet na za??lubinach we Bremervoord?", 0, "Priscill??", "Essi Daven", "Valdo Marx'em", 0, 0);
            insertQuestionBook2(db, "Jakiego pseudonimu nienawidzi??a Essi Daven?", 0, "Oczko", "Pacynka", "Gwie??dzistooka", 0, 0);
            insertQuestionBook2(db, "Dla kogo trubadurka Essie Davien ??piewa??a ze specjaln?? dedykacj??, uwcze??nie si?? ca??uj??c z t?? osob???", 0, "Jaskra", "Geralta", "Valdo Marx'a", 0, 0);
            insertQuestionBook2(db, "Kto mieszka?? w Ys?", 0, "Trytoni", "Vodyanoi", "Syreny", 0, 0);
            insertQuestionBook2(db, "Kto uratowa?? Geralta i Jaskra przed mieszka??cami Ys?", 0, "Rybacy", "Sh'eenaz", "Drouhard", 0, 0);
            insertQuestionBook2(db, "Co Essi Daven otrzyma??a jako prezent urodzinowy?", 0, "Bursztyn", "Per????", "Naszyjnik", 0, 0);

            insertQuestionBook2(db, "Kogo by??o sta?? na \"troch?? po??wi??cenia\"?", 0, "Geralta", "Sh'eenaz", "Aglovala", 0, 0);
            insertQuestionBook2(db, "Czy Geralt ostatecznie przespa?? si?? z Essi Daven?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook2(db, "Na co umar??a \"Oczko\"?", 0, "Gryp??", "Osp??", "Katrion??", 0, 0);
            insertQuestionBook2(db, "Jak?? pami??tk?? po Geralcie nosi??a Oczko?", 0, "Medalion Wilka", "Medalion z Per????", "R?????? pami??ci", 0, 0);

//74 - b
// Miecz przeznaczenia
            insertQuestionBook2(db, "Jaki by?? znak ostrzegawczy przed wej??ciem do Brokilonu?", 0, "Tabliczka", "Powieszeni ludzie", "Strza??a", 0, 0);
            insertQuestionBook2(db, "Gdzie po raz pierwszy spotkali si?? Geralt i Ciri?", 0, "w Cintrze", "w Novigradzie", "w Brokilonie", 0, 0);
            insertQuestionBook2(db, "Kogo postrzelonego przez driady spotka?? Geralt pod lasem Brokilonu?", 0, "Drouharda", "Schwanna", "Freixeneta", 0, 0);
            insertQuestionBook2(db, "Jak mia??a na imi?? p????-driada, kt??ra prowadzi??a Geralta w ??rodek brokilonu?", 0, "Morenn", "Aglais", "Braenn", 0, 0);
            insertQuestionBook2(db, "Jaki potw??r zaatakowa?? Geralta i Braenn?", 0, "Endriaga", "Wilko??ak", "Skolopendromorf", 0, 0);
            insertQuestionBook2(db, "Sk??d uciek??a Cirilla przed wizyt?? w Brokilonie?", 0, "z Blaviken", "z Mirtu", "z Vergen", 0, 0);

            insertQuestionBook2(db, "Jak?? bajk?? opowiedzia?? Geralt Cirilli przed snem?", 0, "o Wied??minach", "o 2 Bardach", "o Kocie i Lisie", 0, 0);
            insertQuestionBook2(db, "Jak nazywa si?? stolica Brokilonu?", 0, "Craag An", "Col Serrai", "Duen Canell", 0, 0);
            insertQuestionBook2(db, "Kt??ra driada by??a pani?? Brokilonu?", 0, "Aglais", "Morenn", "Eithne", 0, 0);
            insertQuestionBook2(db, "Kim by?? Freixenet zanim Geralt zdj???? z niego kl??tw???", 0, "??ab??dziem", "Wilko??akiem", "Kormoranem", 0, 0);
            insertQuestionBook2(db, "Co Geralt robi?? w Brokilonie?", 0, "By?? w odwiedziny", "By?? po Cirill??", "Ni??s?? poselstwo", 0, 0);
            insertQuestionBook2(db, "Kim dla driad zosta?? Freixenet?", 0, "Trupem", "Dyplomat??", "Zap??adniaczem", 0, 0);
            insertQuestionBook2(db, "Jak brzmi prawdziwe imi?? Braenn?", 0, "Fauve", "Dunca", "Mona", 0, 0);
            insertQuestionBook2(db, "Co si?? sta??o z Cirill?? po wypiciu wody brokilonu?", 0, "Postrada??a rozum", "Zacze??a wieszczy??", "Nic", 0, 0);
            insertQuestionBook2(db, "Czy Geralt wypi?? wod?? Brokilonu?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);
            insertQuestionBook2(db, "Gdzie Geralt chcia?? zabra?? Cirill?? z Brokilonu po tym, jak dowiedzia?? si?? kim ona jest?", 0, "Do Kaer Morhen", "Do Vergen", "Do Cintry", 0, 0);

            insertQuestionBook2(db, "Kto uratowa?? Geralta i Ciri przed bandytami w drodz?? do Brugge?", 0, "Myszow??r", "Najemnicy", "Driady", 0, 0);
            insertQuestionBook2(db, "Czyje poselstwo nios?? Geralt do Eithne?", 0, "Ethaina", "Ervylla", "Venzlava", 0, 0);


//92 - c
// Co?? wi??cej
            insertQuestionBook2(db, "Jak nazywa?? si?? kupiec, kt??rego Geralt uratowa?? w Temerii?", 0, "Dhun", "Haren", "Jurga", 0, 0);
            insertQuestionBook2(db, "Jak mia??a na imi?? ??ona Jurgi?", 0, "Celina", "Vesna", "Z??otolitka", 0, 0);
            insertQuestionBook2(db, "Jakiej nagrody Geralt za????da?? od Jurgi w zamian za ratunek?", 0, "Jad??a", "Z??ota", "Prawa Niespodzianki", 0, 0);
            insertQuestionBook2(db, "Belleteyn przypada??o na prze??om?", 0, "Marca i Kwietnia", "Maja i Czerwca", "Kwietnia i Maja", 0, 0);
            insertQuestionBook2(db, "Jak mia??a na imi?? matka Geralta?", 0, "Adrianna", "Aurora", "Visenna", 0, 0);
            insertQuestionBook2(db, "Co by??o w halucynogennej wizji Geralta, gdy le??a?? w stanie agonalnym na wozie Jurgi?", 0, "Cirilla", "Brokilon", "Belleteyn i Yennefer", 0, 0);
            insertQuestionBook2(db, "Jak umar??a Pavetta?", 0, "Zabili j?? bandyci", "W masakrze Cintry", "Na morzu", 0, 0);
            insertQuestionBook2(db, "Czy Geralt uda?? si?? po 6 latach do Cintry i odby?? rozmow?? z Calanthe?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);

            insertQuestionBook2(db, "\"Czy je??li przeznaczenie nie jest mitem, to czy mo??e si?? zem??ci???\" - czyje to s??owa?", 0, "Yennefer", "Jaksra", "Calanthe", 0, 0);
            insertQuestionBook2(db, "Od kogo Geralt dowiedzia?? si?? jak ma na imi?? jego matka?", 0, "Od Yennefer", "Od niej", "Od Vesemira", 0, 0);
            insertQuestionBook2(db, "Kto nada?? Geraltowi jego imi???", 0, "On sam", "Vesemir", "Visenna", 0, 0);
            insertQuestionBook2(db, "Gdzie mieszka Jurga?", 0, "W Carcano", "W Velen", "W Dolnym Sodden", 0, 0);
            insertQuestionBook2(db, "Ile czarodziej??w by??o wypisanych na Menhirze w Sodden?", 0, "13", "15", "14", 0, 0);
            insertQuestionBook2(db, "Ilu czarodziej??w stane??o w bitwie pod Sodden?", 0, "14", "17", "22", 0, 0);
            insertQuestionBook2(db, "Jakie by??o 14 nazwisko napisane na Menhirze w Sodden?", 0, "Triss Merigold", "Lytta Neyd", "Yoel Grethen", 0, 0);
            insertQuestionBook2(db, "Gdy Ciri zapyta??a Geralta, czy jest jej przeznaczeniem, co on jej odpowiedzia???", 0, "??e j?? kocha", "??e nim jest", "??e jest czym?? wi??cej", 0, 0);
            insertQuestionBook2(db, "Od kogo Geralt dowiedzia?? si?? o spaleniu Cintry?", 0, "By?? tam", "Od Jurgi", "Od Jaskra", 0, 0);


            //109 - c


            // KREW ELFOW
            insertQuestionBook3(db, "Kto przepowiedzia?? czas miecza i topora... czas pogardy?", 0, "Itlina", "Aglais", "Eithne", 0, 0);
            insertQuestionBook3(db, "Kto porwa?? Cirill?? z Cintry?", 0, "Cahir", "Vilgefotrz", "Morvran Voorhis", 0, 0);
            insertQuestionBook3(db, "Czy Ciri pami??ta??a co?? z tego, co zrobi?? jej Cahir?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook3(db, "Kt??ry czarodziej komplementowa?? ballady Jaskra podczas wyst??pu pod d??bem?", 0, "Radcliffe", "Lockhart", "Marcellus", 0, 0);
            insertQuestionBook3(db, "Kt??ry krasnolud walczy?? pod Sodden?", 0, "Sheldon Skaggs", "Yarpen Zigrin", "Zoltan Chiway", 0, 0);
            insertQuestionBook3(db, "Sk??d pochodzi Czarna Rayla?", 0, "Lyrii", "Redanii", "Aedirn", 0, 0);
            insertQuestionBook3(db, "\"Ka??dy szermierz dupa, kiedy wrog??w kupa\" - kto wypowiedza?? te s??owa?", 0, "Sheldon Skaggs", "Yarpen Zigrin", "Zoltan Chivay", 0, 0);
            insertQuestionBook3(db, "Kto pr??bowa?? przekupi?? Jaskra, aby ten opowiedzia?? mu o losach Cirilli z ballad? ", 0, "Rience", "Cahir", "Vilgefotrz", 0, 0);
            insertQuestionBook3(db, "Kto torturowa?? Jaskra?", 0, "Rience", "Vilgefotrz", "Zdradzony m????", 0, 0);
            insertQuestionBook3(db, "Jaskier powiedzia?? Riencowi, ze gdzie si?? Geralt ukrywa?", 0, "Nic nie powiedzia??", "Kaern Morhen", "Vengerbergu", 0, 0);

            insertQuestionBook3(db, "Kto uratowa?? Geralta przed Riencem?", 0, "Yennefer", "Shani", "Geralt", 0, 0);
            insertQuestionBook3(db, "Co nosi??a na szyi Yennefer?", 0, "Gwiazd?? z obsydianu", "Szmaragd", "Nefryt", 0, 0);
            insertQuestionBook3(db, " Czyim szpiegiem by?? Jaskier?", 0, "Redanii", "Temerii", "Kaedwen", 0, 0);
            insertQuestionBook3(db, "Kto przywita?? Geralta i Ciri w Kaer Morhen?", 0, "Eskel", "Lambert", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Jaskier zna?? drog?? do Kaer Morhen?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook3(db, "Kogo mylnie uwa??ano za zmar??ego spod Sodden?", 0, "Triss", "Yennefer", "Vilgefotrza", 0, 0);
            insertQuestionBook3(db, "Jak m??odzi wied??mini nazywali szlak s??u????cy do ??wicze?? kondycyjnych i biegowych?", 0, "Mordownia", "Szlak ??mierci", "Gardziel", 0, 0);
            insertQuestionBook3(db, "Gdzie po raz pierwszy spotka??y si?? Triss i Ciri?", 0, "Na Mordowni", "W jadalni", "Na placu ??wiczebnym", 0, 0);
            insertQuestionBook3(db, "Co zrobi??a Triss dla Cirilli przy pierwszym spotkaniu?", 0, "Naprawi??a jej kolano", "Naprawi??a jej ??okie??", "Da??a lalk??", 0, 0);
            insertQuestionBook3(db, "O czym Ciri wieszczy??a Triss przy pierwszym spotkaniu?", 0, "o Sodden i Kurhanach", "o Dzikim Gonie", "o Bia??ym Zimnie", 0, 0);

            insertQuestionBook3(db, "Jak Vesemir nazywa?? Triss?", 0, "Dziecink??", "Ma???? Merigold", "Merigold", 0, 0);
            insertQuestionBook3(db, "Sk??d pochodzi Coen?", 0, "z Poviss", "z Redanii", "z Temerii", 0, 0);
            insertQuestionBook3(db, "Triss nazwa??a jednego z nauczycieli Cirilli idiot??, kt??rego?", 0, "Lamberta", "Coena", "Geralta", 0, 0);
            insertQuestionBook3(db, "Pierwszy raz Triss zesz??a si?? z Geraltem w Kaer Morhen?", 0, "Tak", "Wcze??niej", "P????niej", 0, 0);
            insertQuestionBook3(db, "Co dekorowa??o drzwii do komnaty Cirilli w Kaer Morhen?", 0, "Sk??ra szczura", "Sk??ra jelenia", "Sk??ra rosomaka", 0, 0);
            insertQuestionBook3(db, "Na czym Ciri uszkodzi??a biodra i udo?", 0, "Na wahadle", "Na mordowni", "Na wiatraku", 0, 0);
            insertQuestionBook3(db, "Na czym Ciri uszkodzi??a piszczel?", 0,  "Na wiatraku", "Na wahadle", "Na grzebieniu", 0, 0);
            insertQuestionBook3(db, "Czego ba???? si?? Ciri w Kaer Morhen?", 0, "D??ugiej wagi", "Grzebienia", "Wiatraka", 0, 0);
            insertQuestionBook3(db, "Co najbardziej zdenerwowa??o Triss, a spowodowa??o najwi??ksze zaniek??opotanie u wied??min??w?", 0, "Okres Ciri", "Ubrania Ciri", "Zbyt ci????ki trening Ciri", 0, 0);
            insertQuestionBook3(db, "Gdzie Geralt zdecydowa?? si?? zawie???? Ciri w celu krzta??cenia?", 0, "do Nenneke", "do Aretuzy", "do Ban Ard", 0, 0);

            insertQuestionBook3(db, "Jakie zwierz?? upolowa?? Geralt na wieczerz?? w Kaer Morhen?", 0, "Kozio??ka", "Jelenia", "Dzika", 0, 0);
            insertQuestionBook3(db, "Czym jest Midinvaerne?", 0, "Przesileniem zimowym", "Przesileniem letnim", "R??wnonoc??", 0, 0);
            insertQuestionBook3(db, "W co zazwyczaj grali Coen i Cirilla?", 0, "w ??apki", "w Hacele", "w Gwinta", 0, 0);
            insertQuestionBook3(db, "Czy Ciri potrafi??a sk??ada?? znaki wied??mi??skie?", 0, "Nie", "Tak", "tylko Aard i Ignii", 0, 0);
            insertQuestionBook3(db, "Dlaczego Geralt zaczerpn???? pomocy Yennefer?", 0, "Triss nie potrafi??a pom??c", "Pragn???? jej pomocy", "Yennefer sama si?? narzuci????", 0, 0);
            insertQuestionBook3(db, "Sk??d pochodzi??a r????a, kt??r?? Ciri uku??a si?? podczas zrywania?", 0, "Shaerrawedd", "Ellander", "Cintry", 0, 0);
            insertQuestionBook3(db, "Jak nazywa?? si?? specjalny wied??mi??ski alkohol \"niehalucynogenny\"?", 0, "Bia??a Mewa", "Orka", "Czarna Mewa", 0, 0);
            insertQuestionBook3(db, "Kto wed??ug wr????by Cirilli mia?? umrze?? od \"2 z??b??w\"?", 0, "Coen", "Geralt", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Kto wed??ug wr????by Cirilli mia?? umrze?? od \"3 z??b??w\"?", 0, "Geralt", "Coen", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Kto poda?? Ciri bia???? mew?? w celu wprowadzenia jej w trans?", 0, "Triss", "Eskel", "Geralt", 0, 0);
           // 40 -a

            insertQuestionBook3(db, "Czego Triss uczy??a Ciri?", 0, "Magii", "Starszej mowy", "Makija??u", 0, 0);
            insertQuestionBook3(db, "Na co Ciri namawia??a Triss, a ta sie na to zgodzi??a pod warunkiem, ??e odpowie na jej pytanie?", 0, "na pokaz magii", "na Sanki", "na Makija??", 0, 0);
            insertQuestionBook3(db, "W ksi????ce zosta???? przedstawiona scena, w kt??rej Vesemir uczy?? Ciri o potworach. Jakie potwory by?? wymienione w tym fragmencie?", 0, "Alghule i Zjadarki", "Ghule i Graveiry", "Mantikory i Viverny", 0, 0);
            insertQuestionBook3(db, "Kto uczy?? Ciri walki przy u??yciu a?? 3 wahade???", 0, "Vesemir", "Geralt", "Coen", 0, 0);
            insertQuestionBook3(db, "Kto razem z Triss zasiada w radzie Foltesta?", 0, "Scheala de Tancarville", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook3(db, "Gdzie mieszka Triss?", 0, "w Oxenfurcie", "w Mariborze", "w Tretogorze", 0, 0);
            insertQuestionBook3(db, "Co straci??a Yennefer (z cego j?? p????niej wyleczono) w bitwie pod Sodden?", 0, "G??os", "Wzrok", "W??osy", 0, 0);
            insertQuestionBook3(db, "Dlaczego Geralt odm??wi?? Ciri dalszego szkolenia w walce?", 0, "Przez rany", "Chcia??a zabi?? Cahira", "Przez Triss", 0, 0);
            insertQuestionBook3(db, "Dlaczego Triss nie wzie??a eliksiru na chorob???", 0, "Nie mia??a sk??adnik??w", "Jest uczulona", "Nie umia??a go zrobi??", 0, 0);
            insertQuestionBook3(db, "Kto rewirowa?? towary transportowane przez krasnoludy?", 0, "Najemnicy Pangratta", "Bura Chor??giew", "Bandyci", 0, 0);

            insertQuestionBook3(db, "Gdzie by??a ??wi??tynia Melitelle?", 0, "w Brugge", "w Ellander", "w Metinie", 0, 0);
            insertQuestionBook3(db, "Jakie jest has??o Scoia'tael?", 0, "Ludzie do trumny", "Ludzie do wody", "Ludzie do piachu", 0, 0);
            insertQuestionBook3(db, "Kto napad?? na posterunek przez kt??ry Geralt jecha?? do ??wi??tyni Melitelle?", 0, "Bandyci", "Elfy", "Nilfgard", 0, 0);
            insertQuestionBook3(db, "Kto jecha?? z karawan??, kt??r?? pr??bowa?? dogoni?? Geralt, ??eby znale???? pomoc dla Merigold?", 0, "Freixenet", "Yarpen Zigrin", "Jaskier", 0, 0);
            insertQuestionBook3(db, "Kt??ry krasnolud wyst??pi?? z kompani Yarpena Zigrina przez za??lubiny?", 0, "Yannick Brass", "Lucas Corto", "Xavier Moran", 0, 0);
            insertQuestionBook3(db, "Co transportowa?? konw??j Yarpena Zigrina?", 0, "Raporty wojskowe", "Nie wiadomo", "Jedzenie", 0, 0);
            insertQuestionBook3(db, "Kto nios?? z rzeki wod?? do mycia dla Triss?", 0, "Geralt", "Ciri", "Yarpen Zigrin", 0, 0);
            insertQuestionBook3(db, "Jakie ryby ??owi??y krasnoludy Yarpena?", 0, "Leszcze", "Pstr??gi", "Sandacze", 0, 0);
            insertQuestionBook3(db, "Kto wyprowadzi?? jako pierwszy elfi?? m??odzie?? do walki o wolno????, wskutek kt??rej prawie wszyscy umarli?", 0, "Iorweth", "Aelirenn", "Yaevinn", 0, 0);
            insertQuestionBook3(db, "Gdzie ubili babk?? Yarpena?", 0, "w Mahakamie", "w Brugge", "w Vergen", 0, 0);

            insertQuestionBook3(db, "Kt??re z tych miast nie jest zbudowane na elfich ruinach?", 0, "Tretogor", "Brugge", "Wyzima", 0, 0);
            insertQuestionBook3(db, "Czyja rze??ba jest w Shaerrawedd?", 0, "Ithlinne", "Aelirenn", "Ettariel", 0, 0);
            insertQuestionBook3(db, "Sk??d pochodzi??a zbrojna pomoc, kt??ra uratowa??a transport krasnolud??w od ataku Scoia'tael?", 0, "z Ard Carraigh", "z Ban Glean", "Asheberg", 0, 0);
            insertQuestionBook3(db, "Kt??ry krasnolud nie prze??y?? ataku Scoia'a tael?", 0, "Regan Dahlberg", "Paulie Dahlberg", "Yannick Brass", 0, 0);
            insertQuestionBook3(db, "Co oznacza po elficku \"Kaer Morhen\"?", 0, "Wied??mi??skie siedliszcze", "Warownia starego morza", "Ruiny zamku", 0, 0);
            insertQuestionBook3(db, "Co oznacza \"Zirael\"?", 0, "Starsza krew", "Jask????ka", "Lwi??tko", 0, 0);
            insertQuestionBook3(db, "Czego Geralt ??a??owa?? w li??cie do Yennefer?", 0, "??e powsta??", "Nazwa?? Yen przyjaci????ka", "Zbyt p????no napisa??", 0, 0);
            insertQuestionBook3(db, "Jakiego potwora Geralt wypatrywa?? na barc???", 0, "Krakena", "??agnicy", "Selkimor??", 0, 0);
            insertQuestionBook3(db, "Jak mia?? na imi?? naukowiec z Oxenfurtu, z kt??rym Geralt rozprawia?? o potworach?", 0, "Jean La Voisier", "Linus Pitt", "Aldert Geert", 0, 0);
            insertQuestionBook3(db, "Jak ma na imi?? przyw??dca Reda??skich celnik??w?", 0, "Tybalt", "Olsen", "Aldert Geert", 0, 0);

            insertQuestionBook3(db, "Gdzie chcia?? wst??pi?? Olsen?", 0, "Burej Chor??gwi", "S??u??b specjalnych", "Tarczownik??w", 0, 0);
            insertQuestionBook3(db, "Na czyj rozkaz temerska stra?? pyta??a o Geralta?", 0, "Dymitra", "Rienca", "Velerada", 0, 0);
            insertQuestionBook3(db, "Jak pocz??tkowo Linus Pitt chcia?? nazwa?? ??agnice?", 0, "Pitteri??", "Geralti??", "Evereti??", 0, 0);
            insertQuestionBook3(db, "Kogo Jaskier poprosi?? o rozpoznanie 2 szpicli?", 0, "Yennefer", "Shani", "Geralta", 0, 0);
            insertQuestionBook3(db, "Z czego by??a zrobiona ulubiona bi??uteria Filippy Eilhart?", 0, "Obsydianu", "Czarnego agatu", "Szmaragd??w", 0, 0);
            insertQuestionBook3(db, "O co Dijkstra mia?? pretensj?? do Jaskra?", 0, "Zdemaskowanie szpiega", "Sp??oszenie Rienca", "K??amstwo", 0, 0);
            insertQuestionBook3(db, "Czego Dijkstra wymaga?? od Jaskra?", 0, "Informacji o Ciri", "Sprowadzenia Geralta", "Sprowadzenia Cirilli", 0, 0);
            insertQuestionBook3(db, "Z kim nakry?? Geralta Jaskier w Oxenfurcie?", 0, "z Prostytutk??", "z Shani", "z Triss", 0, 0);
            insertQuestionBook3(db, "Kto pomy??lnie wyszpiegowa?? Geralta i Jaskra w Oxenfurcie?", 0, "Dijkstra", "Filippa Eilhart", "Rience", 0, 0);
            insertQuestionBook3(db, "Co chcia??a Filippa od Geralta?", 0, "Szanta??owa??a go", "Ostrzega??a go", "Wymusza??a oddanie Cirilli", 0, 0);

            // 80 -b

            insertQuestionBook3(db, "Co Emchyr zrobi?? z Marsza??kami spod Sodden?", 0, "Nic", "Wych??osta?? ich", "Zabi?? ich", 0, 0);
            insertQuestionBook3(db, "Kto nie podpisa?? zawieszenia broni z Nilfgardem?", 0, "Eist Tuirseach", "Bran Tuirseach", "Crach an Craite", 0, 0);
            insertQuestionBook3(db, "Kt??ry kr??l zobowi??za?? si?? wyt??pi?? Scoia'tael w 6 miesi??cy?", 0, "Vizimir", "Foltest", "Meve", 0, 0);
            insertQuestionBook3(db, "Kto poruszy?? Scoia'tael do walki w obecnych czasach?", 0, "Iorweth", "Coen", "Vesemir", 0, 0);
            insertQuestionBook3(db, "Gdzie odby??o si?? spotkanie w??adc??w p????nocy?", 0, "Tretogorze", "Wyzimie", "Hagge", 0, 0);
            insertQuestionBook3(db, "Co kr??lowie p????nocy zdecydowali zrobi?? z Ciri, gdyby j?? znale??li?", 0, "Odda?? Cintrijczykom", "Wyda?? za m????", "Zabi??", 0, 0);
            insertQuestionBook3(db, "Kto by?? namiestnikiem Cintry?", 0, "Vattier de Rideaux", "Jan Calveit", "Menno Coehoorn", 0, 0);
            insertQuestionBook3(db, " Jaki by?? rozkaz od Emhyra dla Rienca?", 0, "Porwa?? Geralta", "Porwa?? Yennefer", "Zabi?? wied??mina", 0, 0);
            insertQuestionBook3(db, "Kogo wynaj???? Rience do zabicia Geralta?", 0, "Til Echrade", "Magistra", "Braci Michelet", 0, 0);
            insertQuestionBook3(db, "Od kogo Geralt dowiedzia?? si??, jak znale???? Rienca?", 0, "Filippy Eilhart", "Braci Michelet", "Myhrmana", 0, 0);

            insertQuestionBook3(db, "Sk??d pochodzi?? Vilgefortz?", 0, "Claremont", "Creyden", "Roggeveen", 0, 0);
            insertQuestionBook3(db, "Kt??ra czarodziejka szale??czo by??a zakochana w Vilgefortzie?", 0, "Tissaia de Vries", "Assire var Anahid", "Lydia van Bredevoort", 0, 0);
            insertQuestionBook3(db, "Kto sparali??owa?? Geralta przez co Rience zdo??a?? uciec?", 0, "Nieznany czarodziej", "Vilgefortz", "Filippa Eilhart", 0, 0);
            insertQuestionBook3(db, "Kto opowiada?? Ciri o wojnie w ??wi??tyni Melitelle?", 0, "Yennefer", "Nenneke", "Jarre", 0, 0);
            insertQuestionBook3(db, "Kogo przedstawia??a rycina, kt??ra wypad??a z ksi????ki Jarre?", 0, "Yennefer", "Ciri", "To by??y nudesy", 0, 0);
            insertQuestionBook3(db, "Co chcia??a zrobi?? Ciri po pierwszym spotkaniu z Yennefer?", 0, "Krzycze?? na ni??", "Poskar??y?? si?? Geraltowi", "Uciec do Kaer Morhen", 0, 0);
            insertQuestionBook3(db, "Co odpowiedzia??a Yennefer Cirilli, po us??yszeniu pytania - \"Co ????czy j?? z Geraltem?\"?", 0, "Nic", "Przyja????", "T??sknota", 0, 0);
            insertQuestionBook3(db, "Co mia??a zrobi?? Cirilla podczas testu Yennefer?", 0, "Przeczyta?? runy", "Z??o??y?? znak", "Rysowa??", 0, 0);
            insertQuestionBook3(db, "Po czym Yennefer stwierdzi??a, ??e Ciri nadaje si?? na czarodziejk???", 0, "Roztacza??a magiczn?? aur??", "Czyta??a w my??lach", "Zauwa??y??a aur?? obsydianu", 0, 0);
            insertQuestionBook3(db, "Sk??d pochodzili druidzi, kt??rzy opiekowali si?? Ciri?", 0, "Erlenwaldu", "Mariboru", "Angrenu", 0, 0);

            insertQuestionBook3(db, "W jakim wieku Yennefer zosta??a czarodziejk???", 0, "20", "15", "13", 0, 0);
            insertQuestionBook3(db, "Ile Yennefer mia??a lat, gdy straci??a dziewictwo?", 0, "21", "17", "16", 0, 0);
            insertQuestionBook3(db, "Co zniszczy??a Ciri podczas lekcji zakl?????", 0, "Drzwii", "St????", "Szopk??", 0, 0);
            insertQuestionBook3(db, "Jakie zwierz?? lubi spa?? na intersekcjach?", 0, "Pies", "Ko??", "Kot", 0, 0);
            insertQuestionBook3(db, "Jak Calanthe by??a nazywana na wyspach Skellige?", 0, "Gaes Muirre", "Lyarya Xintra", "Ard Rhena", 0, 0);
            insertQuestionBook3(db, "Jakim ??ywio??em pod ??adnym pozorem nie wolno by??o bawi?? si?? Ciri?", 0, "Ziemi??", "Powietrzem", "Ogniem", 0, 0);

            // 106 - c

            //CZAS POGARDY
            insertQuestionBook4(db, "Co palono w wigili?? Saovine?", 0, "Kuk???? Falki", "Marzann??", "Elfie kuk??y", 0, 0);
            insertQuestionBook4(db, "ak nazywa?? si?? goniec, kt??ry by?? ??wiadkiem walki Wied??mina z Profesorem?", 0, "Aplegatt", "Paulie Dahlberg", "Gorrett", 0, 0);
            insertQuestionBook4(db, "Jaka ??mier?? przewidzia??a Ciri dla go??ca kr??lewskiego?", 0, "Strza????", "Miecz", "Top??r", 0, 0);
            insertQuestionBook4(db, "Do kogo Aplegatt przekazywa?? wiadomo??ci od Demawenda?", 0, "Foltesta", "Henselta", "Wyzimira", 0, 0);
            insertQuestionBook4(db, "Co zablokowa??o przejazd go??cowi kr??lewskiemu?", 0, "Potw??r", "Elfy", "Bandyci", 0, 0);
            insertQuestionBook4(db, "Jaki potw??r zablokowa?? trakt kupiecki?", 0, "Mantikora", "Oszluzg", "Gryf", 0, 0);
            insertQuestionBook4(db, "W jakim mie??cie stacjonowali Codringher i Fenn?", 0, "Dorian", "Anchor", "Gors Velen", 0, 0);
            insertQuestionBook4(db, "Kim by?? Codringher?", 0, "Cz??owiekiem", "Elfem", "Nizio??kiem", 0, 0);
            insertQuestionBook4(db, "Kto zamordowa?? Codringhera i Fenna?", 0, "Schirru", "Rience", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Na czyjej szmyczy by?? Rience?", 0, "Vilgefortza z Roggeveen", "Radcliffa", "Emhyra", 0, 0);

            insertQuestionBook4(db, "Dlaczego klienci nigdy nie widzieli Fenna?", 0, "By?? kalek??", "By?? elfem", "Nie isnia??", 0, 0);
            insertQuestionBook4(db, "Sk??d pochodzi?? Regner?", 0, "Ebbing", "Brugge", "Nazairu", 0, 0);
            insertQuestionBook4(db, "Od kogo agenci dowiedzieli si?? o \"??mierci Ciri\"?", 0, "od Codringhera", "od Yennefer", "od Dijkstry", 0, 0);
            insertQuestionBook4(db, "Jak?? broni?? lubi?? bawi?? si?? Codringher?", 0, "Orionem", "Sztyletem", "Maczug??", 0, 0);
            insertQuestionBook4(db, "le kosztowa??a standardowa us??uga Condringhera?", 0, "250 koron", "200 koron", "150 koron", 0, 0);
            insertQuestionBook4(db, "Jakie rozwi??zanie zaproponowa?? Condringher Geraltowi?", 0, "Fa??szyw?? Cirill??", "Pu??apk?? na Rienca", "Zostawienie Ciri", 0, 0);
            insertQuestionBook4(db, "Kto polowa?? na Yennefer i Ciri?", 0, "Profesor", "Xavier Moran", "Bracia Michelet", 0, 0);
            insertQuestionBook4(db, "Gdzie zostali zabici przez Geralta - Profesor, Kr??tki Yaxa i Heimem Kantor?", 0, "Anchor", "Dorian", "Gors Velen", 0, 0);
            insertQuestionBook4(db, "Do jakiego miasta pojecha??y Ciri i Yennefer?", 0, "Gors Velen", "Ebbing", "Anchor", 0, 0);
            insertQuestionBook4(db, "Czyj bank by?? w Gors Velen?", 0, "Molnara", "Cianfanellich", "Vivaldich", 0, 0);

            insertQuestionBook4(db, "Gdzie odby?? si?? zjazd czarodziej??w?", 0, "na Thanedd", "w Moc Muinne", "w Hagge", 0, 0);
            insertQuestionBook4(db, "Kt??ry kraj zamawia?? masowo ??odzie od szkutnik??w?", 0, "Temeria", "Redania", "Kaedwen", 0, 0);
            insertQuestionBook4(db, "Ile Yennefer wp??aci??a na ??wi??tynie Melitelle?", 0, "1500 orenow", "2000 orenow", "1000 orenow", 0, 0);
            insertQuestionBook4(db, "Ile Yennefer wp??aci??a do Aretuzy?", 0, "2000 koron", "1700 koron", "2200 koron", 0, 0);
            insertQuestionBook4(db, "Kto oprowadza?? Ciri po Gors Velen?", 0, "Fabio", "Molnar", "Yennefer", 0, 0);
            insertQuestionBook4(db, "Gdzie Yennefer pomog??a Molnarowi?", 0, "w Vengenbergu", "w Gors Velen", "w Dorian", 0, 0);
            insertQuestionBook4(db, "Gdzie le??y Aretuza?", 0, "na Thanedd", "w Anchor", "w Dorian", 0, 0);
            insertQuestionBook4(db, " Kto zbudowa?? Thanedd?", 0, "Elfy", "Ludzie", "Krasnoludy", 0, 0);
            insertQuestionBook4(db, "Co oznacza \"Tor Lara\"?", 0, "Wie??a Mewy", "Wie??a Jask????ki", "Wie??a Przeznaczenia", 0, 0);
            insertQuestionBook4(db, "Co Fabio kupi?? Cirilli?", 0, "P??czki", "Winogrono", "Truskawki", 0, 0);

            insertQuestionBook4(db, "Czym na prawd?? by?? \"bazyliszek\" zamkni??ty w klatce?", 0, "Vivern??", "Oszluzgiem", "Skrzekaczem", 0, 0);
            insertQuestionBook4(db, "Kto z??apa?? Ciri i zaprowadzi?? do Yennefer?", 0, "Tissai De Vries", "Sheala De Tancraville", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Kto by?? oficerem wojsk specjalnych Demawenda?", 0, "Rayla", "Blaise", "Villis", 0, 0);
            insertQuestionBook4(db, "Kto by?? rektorem Aretuzy podczas pobytu Ciri na Thanedd?", 0, "Margarita Laux-Antille", "Tissai De Vries", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Gdzie przebywa?? Geralt, kiedy Ciri uciek??a Yennefer po to, aby si?? z nim spotka???", 0, "Hirundum", "Anchor", "Dorian", 0, 0);
            insertQuestionBook4(db, " Kt??ra czarodziejka chcia??a uje??dza?? Geralta na je??u?", 0, "Marti Sodergren", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Kt??ra czarodziejka da??aby Geraltowi na kamieniu?", 0, "Sabrina Glevissig", "Marti Sodergren", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "W krzta??cie jakiej litery by??a sala bankietowa na Thanedd?", 0, "T", "X", "H", 0, 0);
            insertQuestionBook4(db, "Kto towarzyszy?? Filippie Eilhart podczas bankietu?", 0, "Dijkstra", "Cynthia", "Radcliffe", 0, 0);
            insertQuestionBook4(db, "Kto z wymienionych czarodziej??w nie nale??a?? do kapitu??y?", 0, "Filippa Eilhart", "Francesca Findabair", "Vilgefortz z Roggeveen", 0, 0);

            //40 a

            insertQuestionBook4(db, "O co Yennefer nakrzycza??a na Triss?", 0, "o Ciri", "o Geralta", "o Aretuz??", 0, 0);
            insertQuestionBook4(db, "\"Mylisz niebo z gwiazdami odbitymi noc?? na powierzchni stawu\" - Czyj to cytat? ", 0, "Radcliffa", "Vilgefotrza", "Filippy Eilhart", 0, 0);
            insertQuestionBook4(db, "Kt??ry czarodziej oburza?? si?? i wymienia?? z jakich wymierajacych gatunk??w ludzie nosz?? odzienie?", 0, "Jan Bekker", "Dorregaray", "Radcliff", 0, 0);
            insertQuestionBook4(db, "Kt??ra czarodziejka oznajmi??a Geraltowi, ??e umia??a by wyczarowa?? iluzj?? orgazmu?", 0, "Filippa Eilhart", "Marti Sodergren", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Kt??ra czarodziejka specjalizowa??a si?? w afrodyzjakach?", 0, "Filippa Eilhart", "Marti Sodergren", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Kt??ry czarodziej jako jedyny opanowa?? do perfekcji moc 4 ??ywio????w?", 0, "Vilgefotrz", "Jan Bekker", "Tissai De Vries\n", 0, 0);
            insertQuestionBook4(db, "Co Vilgefotrz prezentowa?? Geraltowi?", 0, "Swoj?? kolekcj??", "Galeri?? Chwa??y", "Zbiory o Starszej Krwii", 0, 0);
            insertQuestionBook4(db, "W kt??rym rynsztoku znaleziono w dzieci??stwie Vilgefotrza?", 0, "w Maecht", "w Lan Exeter", "w Povis", 0, 0);
            insertQuestionBook4(db, "Jak nazywany jest portal Tor Lara?", 0, "Bekkera", "Benaventa", "Radcliffa", 0, 0);
            insertQuestionBook4(db, "Jaki materia?? d??awi?? zdolno??ci czarodziej??w?", 0, "Nefryt", "Dwimeryt", "Obsydian", 0, 0);

            insertQuestionBook4(db, "Kto zabi?? Lydie van Bredevoort?", 0, "Radcliffe", "Ona sama", "Filippa Eilhart", 0, 0);
            insertQuestionBook4(db, "Komu Geralt z??ama?? noge na Thanned?", 0, "Riencowi", "Dijkstrze", "Vilgefotrzowi", 0, 0);
            insertQuestionBook4(db, "Gdzie trzymano spiskowc??w?", 0, "w Loxii", "w Garstangu", "w Gors Velen", 0, 0);
            insertQuestionBook4(db, "Kto zdj???? tarcz?? antymagiczn?? z Garstangu?", 0, "Filippa Eilhart", "Tissai De Vries", "Vilgefortz", 0, 0);
            insertQuestionBook4(db, "Kto spad?? na Geralta pod Garstangiem wylatuj??c przez okno?", 0, "Triss Merigold", "Keira Metz", "Sabrina Glevissig", 0, 0);
            insertQuestionBook4(db, "Kto wspiera?? Vilgefotrza?", 0, "Sabrina Glevissig", "Terranova", "Keira Metz", 0, 0);
            insertQuestionBook4(db, "Jak umar??a Tissai De Vries?", 0, "Zabi?? j?? Vilgefotrz", "Podcie??a sobie ??y??y", "Zabi??a j?? Keira", 0, 0);
            insertQuestionBook4(db, "Kto zabi?? Terranow???", 0, "Filippa Eilhart", "Geralt z Rivii", "Yennefer", 0, 0);
            insertQuestionBook4(db, " Kto rani?? Cahira na Thanedd?", 0, "Geralt", "Ciri", "Yennefer", 0, 0);
            insertQuestionBook4(db, "Dlaczego Geralt nie dobi?? Cahira?", 0, "Nie zauwa??y?? go", "Za uratowanie Ciri w Cintrze", "Nie mia?? czasu", 0, 0);

            insertQuestionBook4(db, "Czym walczy?? Vilgefotrz pod Tor Lara?", 0, "Mieczem", "Kijem", "Czarami", 0, 0);
            insertQuestionBook4(db, "Jak na driady m??wi?? ludzie?", 0, "Rusa??ki", "Dziwo??ony", "Wi??y", 0, 0);
            insertQuestionBook4(db, "Jak mia?? na imi?? ko?? Jaskra?", 0, "Skoczka", "Pegaz", "Wojsi??ek", 0, 0);
            insertQuestionBook4(db, "Kt??ra driada leczy??a Geralta w Brokilonie?", 0, "Eithne", "Aglais", "Morenn", 0, 0);
            insertQuestionBook4(db, "Co driady kaza??y zrobi?? Jaskrowi, gdy ten pr??bowa?? wej???? do Brokilonu?", 0, "Przedstawi?? si??", "??piewa??", "Odej????", 0, 0);
            insertQuestionBook4(db, "Kto wyda?? rozkaz \"Wojna wszystkiemu co ??yje\"?", 0, "Peter Evertsen", "Menno Coehoorn", "Vattier de Rideaux", 0, 0);
            insertQuestionBook4(db, "Kto by?? wielkim komorzym Nilfgardu?", 0, "Vattier de Rideaux", "Peter Evertsen", "Menno Coehoorn", 0, 0);
            insertQuestionBook4(db, "Jakie kraje najpierw spalili Nilfgardczycy?", 0, "Kaedwen i Temerie", "Lyrie i Aedirn", "Rivie i Temerie", 0, 0);
            insertQuestionBook4(db, "Kto broni?? ludzi w Aedirn, gdy wojsko uciek??o?", 0, "Seltkirk", "Czarna Rayla", "Kr??lowa Meve", 0, 0);
            insertQuestionBook4(db, "W kt??rym kraju zamordowano kr??la?", 0, "Aedirn", "Redanii", "Temerii", 0, 0);

            insertQuestionBook4(db, "Kt??ry kr??l z??o??y?? ho??d lenny Nilfgardowi?", 0, "Niedamir", "Ervyll", "Kistrin", 0, 0);
            insertQuestionBook4(db, " Kt??ry kaedwe??czyk cz??stowa?? alkoholem setnika?", 0, "Myron", "Zyvik", "Odrin", 0, 0);
            insertQuestionBook4(db, "Kto zosta?? kr??lem Dol Blathanna?", 0, "Filavandrel", "Enid an Gleanna", "Galarr", 0, 0);
            insertQuestionBook4(db, "Gdzie uda??a si?? Triss po pogromie na Thanedd?", 0, "Temerii", "Redanii", "Kaedwen", 0, 0);
            insertQuestionBook4(db, "Jak mia??a na imi?? na prawd?? Tissaia De Vries?", 0, "Cecylia", "Skowronek", "Stokrotka", 0, 0);
            insertQuestionBook4(db, "Z kt??rym kr??lem Nilfgard dokona?? rozbioru Aedirn?", 0, "z Foltestem", "z Henseltem", "z Vyzimirem", 0, 0);
            insertQuestionBook4(db, "Jak mia??a na nazwisko Milva?", 0, "Wagner", "Barring", "Sivney", 0, 0);
            insertQuestionBook4(db, "Jak elfy nazywa??y Milve?", 0, "C??rka", "Siostra", "Zbawicielka", 0, 0);
            insertQuestionBook4(db, "Kto podes??a?? Emhyrowi fa??szyw?? Cirill???", 0, "Puszczyk", "Vilgefotrz", "Vattier de Rideaux", 0, 0);
            insertQuestionBook4(db, "Z kim zerwa?? Emhyr dla fa??szywej Cirilli?", 0, "Carthi??", "Dervl?? Tryffin", "Mawre Ceallach", 0, 0);

            //80 b

            insertQuestionBook4(db, "Gdzie Emhyr wys??a?? fa??szyw?? Ciri?", 0, "Darn Ruach", "Loc Grim", "Darn Rowan", 0, 0);
            insertQuestionBook4(db, "Kt??ry czarodziej by?? wr????bit?? Emhyra?", 0, "Assire var Anahid", "Fringilla Vigo", "Xarthisius", 0, 0);
            insertQuestionBook4(db, "Puszczyk to?", 0, "Joachim de Wett", "Vattier de Rideaux", "Stefan Skellen", 0, 0);
            insertQuestionBook4(db, "Gdzie trafi??a Ciri pod wybuchu wie??y mewy?", 0, "Deithwen", "Diddiwedh", "Korath", 0, 0);
            insertQuestionBook4(db, "Jakiego zakl??cia u??y??a Ciri na pustyni?", 0, "Portalu", "Och??odzenia cia??a", "Kuli ??wiat??a", 0, 0);
            insertQuestionBook4(db, "Co pomog??o Ciri napi?? si?? wody na pustyni?", 0, "Pude??ko po ma??ci", "Pude??ko po perfumach", "Kordzik", 0, 0);
            insertQuestionBook4(db, "Czym g????wnie ??ywi??a si?? Ciri na pustyni?", 0, "Skorpionami", "Jaszczukarmi", "Jajami", 0, 0);
            insertQuestionBook4(db, "Jak Ciri nazwa??a gwiazd??, kt??ra wskazywa??a jej drog???", 0, "Drogowskazem", "Strza??k??", "Okiem", 0, 0);
            insertQuestionBook4(db, "Kto uratowa?? ??ycie Ciri na pustyni?", 0, "\"Szczury\"", "Xarthisius", "Jednoro??ec", 0, 0);
            insertQuestionBook4(db, "Jakiego pokarmu Ciri nie jad??a mimo wielkiego g??odu?", 0, "Mr??wek", "Paj??k??w", "Skoprion??w,", 0, 0);

            insertQuestionBook4(db, "Jakie zakl??cie pomog??o Ciri w walce z pustynnym potworem?", 0, "Znak Ignii", "Znak Yrden", "Telekineza", 0, 0);
            insertQuestionBook4(db, "Czym ??ywi??y si?? pustynne potwory z leja?", 0, "Mi??sem", "Wod??", "Krwi??", 0, 0);
            insertQuestionBook4(db, "Pobranie przez Ciri mocy z kt??rego ??ywio??u pozwoli??o jej uleczy?? \"konika\"?", 0, "Ziemi", "Powietrza", "Ognia", 0, 0);
            insertQuestionBook4(db, "Jak mia?? na imi?? jednoro??ec?", 0, "Muircetach", "Nithral", "Ihuarraquax", 0, 0);
            insertQuestionBook4(db, "Kto porwa?? Cirill?? z pustyni?", 0, "\"szczury\"", "Puszczyk", "??apacze Skomlika", 0, 0);
            insertQuestionBook4(db, "Rycerz z jakiego rodu przewodzi?? ??apaczom Skomlika?", 0, "Varnhagen", "Dyffryn", "Sweers", 0, 0);
            insertQuestionBook4(db, "W jakim mie??cie szczury oswobodzi??y Ciri?", 0, "Zazdro????", "Murivel", "Glyswen", 0, 0);
            insertQuestionBook4(db, "Kogo pojmali Nissirowie?", 0, "Ciri", "Giselherta", "Kayleigha", 0, 0);
            insertQuestionBook4(db, "Kto zabi?? Skomlika", 0, "Giselhert", "Ciri", "Mistle", 0, 0);
            insertQuestionBook4(db, "Sk??d Ciri wzie??a n????, kt??rym uwolni??a szczura?", 0, "Znalaz??a go w k??cie", "Ukrad??a Nissirom", "Od karczmarza", 0, 0);

            insertQuestionBook4(db, "Kto by?? przyw??dc?? szczur??w?", 0, "Reef", "Kayleigh", "Giselhert", 0, 0);
            insertQuestionBook4(db, "Jak przedstawia??a si?? Ciri w Nilfgardzie?", 0, "Fiona", "Zirael", "Falka", 0, 0);
            insertQuestionBook4(db, "Kt??rego szczura Misatle przy??apa??a na pr??bie gwa??tu Ciri?", 0, "Reefa", "Giselherta", "Kayleigha", 0, 0);
            insertQuestionBook4(db, "Kt??ry szczur by?? elfem?", 0, "Reef", "Mistle", "Iskra", 0, 0);
        //104 - c

            // Chrzest Ognia
            insertQuestionBook5(db, "Z jakich ??uk??w uczy??a si?? strzela?? Milva?", 0, "Cisowych", "Elfich", "D??bowych", 0, 0);
            insertQuestionBook5(db, "Ile Milva zap??aci??a za sw??j wymarzony ??uk?", 0, "300 koron", "400 koron", "500 koron", 0, 0);
            insertQuestionBook5(db, "Jakiego ??uku u??ywa??a Milva, zanim kupi??a sw??j wymarzony?", 0, "Zefhara", "Gynvael", "Deithne", 0, 0);
            insertQuestionBook5(db, "Co odpowiedzia??a Maria Barring, gdy zosta??a poproszona przez Aglais ??eby zdoby??a informacj?? dla Geralta?", 0, "??eby szed?? do biesa", "??e mu pomo??e", "??e nie ma czasu", 0, 0);
            insertQuestionBook5(db, "Kto dowodzi?? elfom na Thanned?", 0, "Isengrim", "Iorweth", "Filavandrel", 0, 0);
            insertQuestionBook5(db, "Jak ma na imi?? sekretarz Dijkstry?", 0, "Ori", "Sanchs", "Galarr", 0, 0);
            insertQuestionBook5(db, "Co znaczy \"Milva\" w starszej mowie?", 0, "Kania", "Siostra", "??owczyni", 0, 0);
            insertQuestionBook5(db, "Od kogo Geralt dowiedzia?? si?? plotki o rzekomym ma????e??stwie Ciri i Emhyra?", 0, "Milvy", "Jaskra", "Eithne", 0, 0);
            insertQuestionBook5(db, "Kto by?? pos??em Emhyra, kt??ry domaga?? si?? od Dijkstry wydania Nilfgardzkiego zdrajcy?", 0, "Shilard", "Moorlehem", "De Wett", 0, 0);
            insertQuestionBook5(db, "Wydanie jakiego wi????nia domaga?? si?? od Dijkstry pose?? Nilfgardu?", 0, "Cahir", "Geralta", "Rienca", 0, 0);

            insertQuestionBook5(db, "Na kt??rego elfa Milva by??a w??ciek??a o to, ??e wyprowadzi??a go rannego do Brokilonu, a on znowu poszed?? na front?", 0, "Ciarana", "Isengrima", "Yaevinna", 0, 0);
            insertQuestionBook5(db, "Gdzie za??o??ono lo???? czarodziejek?", 0, "w Montecalvo", "w Ard Carraigh", "w Tir na Lia", 0, 0);
            insertQuestionBook5(db, "Kt??ra z tych 3 czarodziejek nie nale??a??a do pomys??odawczy?? za??o??enia lo??y czarodziejek?", 0, "Sheala de Tancarville", "Triss Merigold", "Margarita Laux-Antille", 0, 0);
            insertQuestionBook5(db, "Ile os??b planowo mia??a liczy?? lo??a czarodziejek?", 0, "12", "13", "14", 0, 0);
            insertQuestionBook5(db, "Za kogo wzieli Geralta i Jaskra kupcy nieopodal Brokilonu?", 0, "Elf??w", "Szpieg??w", "Buntownik??w", 0, 0);
            insertQuestionBook5(db, "Kogo przewozili havekarzy nieopodal Brokilonu?", 0, "Cahira", "Toruviel", "Rienca", 0, 0);
            insertQuestionBook5(db, "Kto uratowa?? wied??mina od Nilfgardczyk??w podczas rozr??by z havekarami?", 0, "Milva", "Cahir", "Driady", 0, 0);
            insertQuestionBook5(db, "Kto z??apa?? Cahira?", 0, "Faolitarna", "Dijkstra", "Schirru", 0, 0);
            insertQuestionBook5(db, "Kto z tych grup nie najecha?? na Brugge?", 0, "Kreyden", "Verden", "Wiew??rki", 0, 0);
            insertQuestionBook5(db, "Jak?? plotk?? Jaskier zdenerowa?? Milv???", 0, "O cyckach", "O driadach", "O elfach", 0, 0);

            insertQuestionBook5(db, "O czym ??ni?? Geralt w Brokilonie?", 0, "o szczurach", "O dzikim gonie", "O Bonharcie", 0, 0);
            insertQuestionBook5(db, "Ile lat mia?? Cahir?", 0, "20-30", "30-40", "40-50", 0, 0);
            insertQuestionBook5(db, "Sk??d pochodzi Cahir?", 0, "Vicovaro", "Metinny", "Maecht", 0, 0);
            insertQuestionBook5(db, "Czyj?? spiewaj??c?? kompanie spotkali Jaskier, Milva i Geralt?", 0, "Zoltana", "Yarpena", "Pangratta", 0, 0);
            insertQuestionBook5(db, "Jakiego zwierzaka mia?? Zoltan?", 0, "Papug??", "Kota", "Sow??", 0, 0);
            insertQuestionBook5(db, "Jak nazywa?? si?? zwierzak Zoltana?", 0, "Duda", "Tenor", "Kenia", 0, 0);
            insertQuestionBook5(db, "Kto z ekipy Zoltana nie by?? krasnoludem?", 0, "Percival Schuttenbach", "Munro Bruys", "Caleb Stratton", 0, 0);
            insertQuestionBook5(db, "Sk??d pochodzi??y kobiety, kt??re przeprowadza??a ekipa Zoltana?", 0, "Kernow", "Dillingen", "Carcano", 0, 0);
            insertQuestionBook5(db, "W co uwielbia??y gra?? krasnoludy, kt??re towarzyszy??y Geraltowi?", 0, "w Gwinta", "w Pokera", "w Ko??ci", 0, 0);
            insertQuestionBook5(db, "Co przerwa??o krasnoludom w graniu?", 0, "Okog????w", "Ghul", "Skolopendromorf", 0, 0);

            insertQuestionBook5(db, "Czym Geralt przegna?? potwora, kt??ry zaniepokoi?? krasnoludzk?? ekip???", 0, "Chochl?? i pokrywk??", "Znakiem Ignii", "Znakiem Aard", 0, 0);
            insertQuestionBook5(db, "Jak nazywa?? si?? miecz Zoltana?", 0, "Sihill", "Angivare", "Caerme", 0, 0);
            insertQuestionBook5(db, "Jaka zaraza prze??ladowa??a zabudow??, w kt??rej Geralt pierwszy raz mia?? okazj?? przetestowa?? Mahakamski Sihill?", 0, "Czarna ospa", "Catriona", "Grypa", 0, 0);
            insertQuestionBook5(db, "Ile ludzi zabi?? Geralt u??ywaj??c pierwszy raz Mahakamskiego Sihilla?", 0, "8", "7", "5", 0, 0);
            insertQuestionBook5(db, "Co zabra?? Geralt od jednego z maruder??w, kt??rego zabi?? na Puszcza??skiej Por??bie?", 0, "Buty", "Kurtk??", "R??kawice", 0, 0);

            //35 - a

            insertQuestionBook5(db, "Ludzie powieszeni na drzewie Wisielc??w, to byli?", 0, "Aedirnczycy", "\"Nilfgardczycy\"", "Temerczycy", 0, 0);
            insertQuestionBook5(db, "Przy jakiej rzece zepsu?? si?? w??z krasnolud??w?", 0, "A", "O", "Z", 0, 0);
            insertQuestionBook5(db, "Elfia wieszczka przewidzia??a Jaskrowi ??mier?? na?", 0, "w Burdelu", "na Rusztowaniu", "na Stryczku", 0, 0);
            insertQuestionBook5(db, "Gdzie Geralt pozna?? Regisa?", 0, "na Por??bie", "w Fen Carn", "w Lesie", 0, 0);
            insertQuestionBook5(db, "Jaki napis widnia?? na mieczu Zoltana?", 0, "Na b??karcie skurwysyny", "Na pochybel skurwysynom", "Ku chwale Mahakamu", 0, 0);

            insertQuestionBook5(db, "Czym pachnia?? Regis?", 0, "Czosnkiem", "Zio??ami", "Mandragor??", 0, 0);
            insertQuestionBook5(db, "Kim przedstawia?? si?? Regis?", 0, "Balwierzem", "Cyrulikiem", "Podr????nikiem", 0, 0);
            insertQuestionBook5(db, "Z czego zrobiony by?? samogon Regisa?", 0, "Balissy", "Mandragory", "Dwugrotu", 0, 0);
            insertQuestionBook5(db, "Jak?? wad?? mia?? bimber Regisa?", 0, "Chwilowa ??lepota", "Rozmowno????", "Chwilowa dr??twota", 0, 0);
            insertQuestionBook5(db, "O czym opowiada?? Jaskier w chacie Regisa?", 0, "o Strzydze", "o D'jinni", "o Z??otym smoku", 0, 0);
            insertQuestionBook5(db, "Z czyjego powodu Zoltan nie chcia?? wr??ci?? do Mahakamu?", 0, "Addario Bacha", "Brouvera Hooga", "Eudory Breckenriggs", 0, 0);
            insertQuestionBook5(db, "W jakiej g??rze le??y Mahakam?", 0, "Gorgota", "Carbon", "Sinej", 0, 0);
            insertQuestionBook5(db, "Gdzie kobiety z Kernow znalaz??y swoj?? rodzin???", 0, "w Fen Carn", "nad Chotl??", "nad Oz", 0, 0);
            insertQuestionBook5(db, "Na co \"polowali\" ch??opi na cmentarzysku?", 0, "Flekkera", "W??pierza", "Ghule", 0, 0);
            insertQuestionBook5(db, "Czyjego konia chcieli ukra???? ch??opi na cmentarzysku?", 0, "Geralta", "Milvy", "Jaskra", 0, 0);

            insertQuestionBook5(db, "W jakich okoliczno??ciach Geralt pozna?? Hectora Laabsa?", 0, "Ataku elf??w", "Egzekucji", "Bitwy na mo??cie", 0, 0);
            insertQuestionBook5(db, "Kto jako pierwszy sprzeciwi?? si?? publicznej egzekucji w obozie uchod??c??w?", 0, "Geralt", "Laabs", "Milva", 0, 0);
            insertQuestionBook5(db, "Kto zaproponowa?? s??d bo??y w obronie \"wied??my\"?", 0, "Milva", "Geralt", "Regis", 0, 0);
            insertQuestionBook5(db, "Kto wyj???? podkow?? z ognia?", 0, "Zoltan", "Regis", "Geralt", 0, 0);
            insertQuestionBook5(db, "Kto wrzuci?? kap??anowi roz??arzon?? podkow?? za spodnie?", 0, "Geralt", "Zoltan", "Regis", 0, 0);
            insertQuestionBook5(db, "Kto wtr??ci?? do lochu Geralta i Jaskra?", 0, "Nilfgardczycy", "Cintryjczycy", "Temerczycy", 0, 0);
            insertQuestionBook5(db, "Kto uratowa?? Geralta i Jaskra z niewoli?", 0, "Milva", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, " Kto by?? ????cznikiem Foltesta w korpusie Cintryjskim?", 0, "Vissegerd", "Etcheverry", "Laabs", 0, 0);
            insertQuestionBook5(db, "Kto skaza?? na ??mier?? Geralta i Jaskra?", 0, "Etcheverry", "Vissegerd", "Laabs", 0, 0);
            insertQuestionBook5(db, "Kt??rego konia najpierw odbi??a Milva?", 0, "P??otk??", "Pegaza", "Kar?? klacz", 0, 0);

            insertQuestionBook5(db, "Kto uratowa?? Milv?? przed wie??niakami?", 0, "Regis", "Cahir", "Zoltan", 0, 0);
            insertQuestionBook5(db, "Gdzie mia?? zosta?? porwany i przetransportowany Faoiltiarna?", 0, "do Vedette", "do Nastroga", "do Rozroga", 0, 0);
            insertQuestionBook5(db, "Kto kaza?? pojma?? Isengrima Faoiltiarne?", 0, "Skellen", "Vattier de Rideaux", "Morvran Voorhis", 0, 0);
            insertQuestionBook5(db, "Kto uratowa?? Cahira z Thanned?", 0, "Rience", "Faoiltiarna", "Vilgefotrz", 0, 0);
            insertQuestionBook5(db, "Od kogo wied??mi??ska dru??yna dowiedzia??a si??, ??e Ciri nie ma u Emhyra?", 0, "od Regisa", "od Cahira", "od Vissegerda", 0, 0);
            insertQuestionBook5(db, "Jak?? czarodziejk?? zaprosi??a Assire var Anahid do Nilfgardu?", 0, "Myre Baiss", "Fringill?? Vigo", "Nine Vivero", 0, 0);
            insertQuestionBook5(db, "Co si?? sta??o z Xarthisiusem po tym, jak ten odkry?? lokalizacj?? Ciri?", 0, "Zosta?? baronem", "Trafi?? do lochu", "Zosta?? zamordowany", 0, 0);
            insertQuestionBook5(db, "Kt??ra brygada Nilfgardu star??a si?? z Temerczykami nad Chotl???", 0, "VII Daerla??ska", "Nauzicaa", "Alba", 0, 0);
            insertQuestionBook5(db, "W kt??rym forcie trzymano Geralta i Jaskra?", 0, "Darn Rowan", "Armenia", "Bodrog", 0, 0);
            insertQuestionBook5(db, "Co Regis zrobi?? ze stra??nikami pod cel???", 0, "Zabi?? ich", "U??pi?? ich", "Og??uszy?? ich", 0, 0);

            // 70 - b

            insertQuestionBook5(db, "W jak?? cz?????? cia??a Jaskier dosta?? strza?????", 0, "w Kolano", "w Rami??", "w Ucho", 0, 0);
            insertQuestionBook5(db, "Co podawano skaza??com przed egzekucj?? w Drakenborgu?", 0, "Fisstech", "Reda??skie mocne", "\"Wytrawnego Dijkstr??\"", 0, 0);
            insertQuestionBook5(db, "Z jakiego komanda by?? jedyny nie ??wi??tuj??cy elf z Drakenborgu?", 0, "Yaevinna", "Faoiltiarny", "Iorwetha", 0, 0);
            insertQuestionBook5(db, "Kt??ry z tych elf??w nie uczestniczy?? w zab??jstwie Condringhera i Fenna?", 0, "Nazarian", "Schirru", "Echel", 0, 0);
            insertQuestionBook5(db, "Kto stan???? w obronie Cahira przed Geraltem?", 0, "Zoltan", "Regis", "Milva", 0, 0);
            insertQuestionBook5(db, "W jakiej wsi Ciri zamordowa??a cz??owieka, kt??ry na??miewa?? si?? z niej i Mistle?", 0, "Malhoun", "Zazdro????", "Loredo", 0, 0);
            insertQuestionBook5(db, "Dok??d za rad?? Regisa uda??a si?? wied??mi??ska dru??yna?", 0, "Fano", "Tyffi", "Angrenu", 0, 0);
            insertQuestionBook5(db, "Kto z??owi?? wielk?? ryb?? do zupy?", 0, "Geralt", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, "Kogo do lo??y czarodziejek zaprosi??a stokrotka z dolin?", 0, "Francesce Findabair", "Asire var Anahid", "Ide Emean aep Sivney", 0, 0);
            insertQuestionBook5(db, "Kto by?? zakl??ty w nefrytow?? statuetk???", 0, "Ida Emean", "Rience", "Yennefer", 0, 0);

            insertQuestionBook5(db, "Kto u??y?? dekompresji artefaktowej na swojej konfraterce?", 0, "Fiippa Eilhart", "Ida Emean aep Sivney", "Francesce Findabair", 0, 0);
            insertQuestionBook5(db, "Kt??ra czarodziejka by??a apolityczna?", 0, "Assire var Anahid", "Francesca Findabair", "Margarita Laux-Antille\n", 0, 0);
            insertQuestionBook5(db, "Na jakim tronie lo??a chcia??a posadzi?? Cirill???", 0, "Wyzimy", "Tretogoru", "Koviru", 0, 0);
            insertQuestionBook5(db, "Co ukrad??a Ciri szlachciance z karety?", 0, "Szafir", "Brylant", "Gemme", 0, 0);
            insertQuestionBook5(db, "Ida Emean aep Sivney to?", 0, "Aen Elle", "Aen Seidhe", "Aen Saevherne", 0, 0);
            insertQuestionBook5(db, "Sk??d pochodzi?? ukochany Lary Dorren?", 0, "Bremervoord", "Creyden", "Lod", 0, 0);
            insertQuestionBook5(db, "Kt??re z trzech dzieci by??o b??kartem Falki", 0, "Fiona", "Amavet", "Adela", 0, 0);
            insertQuestionBook5(db, "Kto by?? pierwszym silnym nosicielem genu Lary po Rianon?", 0, "Ludvik", "Vester", "Tauler", 0, 0);
            insertQuestionBook5(db, "Kt??ra z tych czarodziejek nie bra??a udzia??u w manipulacji genu Lary?", 0, "Francesca Findabair", "Yennefer", "Triss Merigold", 0, 0);
            insertQuestionBook5(db, "Co znalaz?? Dijkstra w jednej z kryj??wek Vilgefotrza?", 0, "Listy od Emhyra", "Rysunki Ciri", "Martwe dziewczynki", 0, 0);

            insertQuestionBook5(db, "Kto by?? koronerem Emhyra?", 0, "Vattier de Rideaux", "Morvran Voorhis", "Stefan Skellen", 0, 0);
            insertQuestionBook5(db, "Kto wynaj???? Bonharta w celu zabicia Falki?", 0, "Berengar Leuvaarden", "Nissirowie", "Stefan Skellen", 0, 0);
            insertQuestionBook5(db, "Kto pom??g?? uciec Yennefer ze spotkania lo??y czarodziejek?", 0, "Triss Merigold", "Keira Metz", "Fringilla Vigo", 0, 0);
            insertQuestionBook5(db, "Jak mia?? na imi?? bajarz opowiadaj??cy o przydodach Geralta, Ciri i Yennefer?", 0, "Jaskier", "Draig Bon-Dhu", "Pogwizd", 0, 0);
            insertQuestionBook5(db, "Co Geralt odpowiedzia?? zapytany, czy da??by rad?? zabi?? Regisa?", 0, "??e da", "??e nie da", "??e nie wie", 0, 0);
            insertQuestionBook5(db, "Ile lat Regis le??a?? w grobie, ubity przez wie??niak??w?", 0, "200", "100", "50", 0, 0);
            insertQuestionBook5(db, "Jak nazywa si?? bagnista depersja w meandrze Jarugi w Dolnym Angrenie?", 0, "Brann", "Jord", "Ysgith", 0, 0);
            insertQuestionBook5(db, "Kt??ry krasnolud z ekipy Zoltana umar?? ubity przez Nilfgardczyk??w nad In???", 0, "Munro Bruy", "Figgis Merluzzo", "Caleb Stratton", 0, 0);
            insertQuestionBook5(db, "Kt??ry kr??l p????nocy prowadzi?? rajdy na terenie Cesartwa Nilfgardu?", 0, "Foltest", "Henselt", "Meve", 0, 0);
            insertQuestionBook5(db, "Gdzie obrabowa??y kupca krasnoludy Zoltana?", 0, "Claremont", "Vengerbergu", "Dillingen", 0, 0);

            insertQuestionBook5(db, "Gdzie Zoltan podarowa?? Sihilla Geraltowi?", 0, "w Obozie pod Chochl??", "na Por??bie", "w Angrenie", 0, 0);
            insertQuestionBook5(db, "Jaki by?? pow??d rezygnacji Geraltaz podr????y przez Ysgith?", 0, "Wojska Nilfgardu", "Potwory", "Ci????a Milvy", 0, 0);
            insertQuestionBook5(db, "Kto poprowadzi?? razem z Geraltem wojska Lyrii i Rivii w zwyci??skiej bitwie pod Czerwona Binduga?", 0, "Ludvik", "Regis", "Cahir", 0, 0);
            insertQuestionBook5(db, "W jaki spos??b Milva poroni??a?", 0, "Od dekoktu Regisa", "Przez walk?? na uroczysku", "Przez bitw?? o most", 0, 0);
            insertQuestionBook5(db, "o by??o \"Chrzestem ognia\"?", 0, "Podkowa Regisa", "Bitwa pod Chochl??", "Bitwa o most", 0, 0);
            //105 - c

            // WIE???? JASK??LKI

            insertQuestionBook6(db, "R??wnonoc wiosenna to?", 0, "Birke", "Velen", "Midinvaerne", 0, 0);
            insertQuestionBook6(db, "R??wnonoc jesienna to?", 0, "Velen", "Birke", "Midaete", 0, 0);
            insertQuestionBook6(db, "Przesilenie zimowe to?", 0, "Midinvaerne", "Midaete", "Birke", 0, 0);
            insertQuestionBook6(db, "Przesilenie letnie to?", 0, "Midaete", "Midinvaerne", "Velen", 0, 0);
            insertQuestionBook6(db, "Na jakiej wyspie by??a ??wi??tynia Freyji?", 0, "Hindarsfjall", "Spikeroog", "Ard Skellig", 0, 0);
            insertQuestionBook6(db, "Ile dni po r??wnonocy jesiennej Vysogota znalaz?? umieraj??c?? Ciri?", 0, "4", "5", "7", 0, 0);
            insertQuestionBook6(db, "Sk??d pochodzi Vysogota?", 0, "Corvo", "Lan Exeter", "Gulety", 0, 0);
            insertQuestionBook6(db, "Jakie zwierz?? posiada?? Vysogota?", 0, "Koz??", "Kota", "Papug??", 0, 0);
            insertQuestionBook6(db, "Jak nazywa?? si?? ko?? Ciri?", 0, "Kelpie", "Cantarella", "Pegaz", 0, 0);
            insertQuestionBook6(db, "Jaki tatua?? zrobi??a sobie Ciri?", 0, "R??????", "Mistle", "Kasjopej??", 0, 0);

            insertQuestionBook6(db, "Gdzie znajduje si?? chata Vysogoty?", 0, "w Ebbing", "w Attre", "w Vicovaro", 0, 0);
            insertQuestionBook6(db, "Blizn?? na twarzy Ciri zostawi???", 0, "Skellen", "Vattier de Rideaux", "Bonhart", 0, 0);
            insertQuestionBook6(db, "Kto ostrzeg?? szczur??w przed Bonhartem?", 0, "Hotsporn", "Almavera", "Pogwizd", 0, 0);
            insertQuestionBook6(db, "Kto wykona?? tatua??e Ciri i Mistle?", 0, "Almavera", "Hotsporn", "Pogwizd", 0, 0);
            insertQuestionBook6(db, "Do kogo nale??a??a Kelpie?", 0, "Hotsporna", "Almavery", "Vysogoty", 0, 0);
            insertQuestionBook6(db, "Kto postrzeli?? Hotsporna?", 0, "Grasanci", "Scoia'tael", "Bonhart", 0, 0);
            insertQuestionBook6(db, "Czym Bonhart ucina?? g??owy szczur??w?", 0, "Pi????", "Mieczem", "No??em", 0, 0);
            insertQuestionBook6(db, "Kt??ry szczur umar?? pierwszy?", 0, "Reef", "Mistle", "Giselhert", 0, 0);
            insertQuestionBook6(db, "Jakie oczy mia?? Bonahart?", 0, "Rybie", "Kocie", "Lwie", 0, 0);
            insertQuestionBook6(db, "Kto opowiada?? o wydarzeniach po bitwie o most?", 0, "Jaskier", "Podgwizd", "Draig Bon-Dhu", 0, 0);

            insertQuestionBook6(db, "Czy kto?? poza Geraltem zosta?? pasowany na rycerza przez Meve?", 0, "Nikt", "Regis", "Cahir", 0, 0);
            insertQuestionBook6(db, "Kto ukrad?? mu??a z obozu Meve?", 0, "Regis", "Cahir", "Milva", 0, 0);
            insertQuestionBook6(db, "Jakie imi?? nadano wo??owi?", 0, "Draakul", "Baldur", "Wierna", 0, 0);
            insertQuestionBook6(db, "Ile cali w talii ma Triss?", 0, "22", "23", "24", 0, 0);
            insertQuestionBook6(db, "Kto ??ni?? o Yennefer?", 0, "Jaskier", "Regis", "Geralt", 0, 0);
            insertQuestionBook6(db, "Gdzie zosta??a wyrzucona Yennefer przez portal z Montecalvo?", 0, "Spikeroog", "Ard Skellige", "Hindarsfjall ", 0, 0);
            insertQuestionBook6(db, "Ile lat mia?? Jaskier, kiedy zacz???? swoj?? przygod?? z poecj?? dla kontessy De Stael?", 0, "19", "22", "24", 0, 0);
            insertQuestionBook6(db, "Kto by?? szefem Nilfgardzkich oddzia????w specjalnych?", 0, "Vattier de Rideaux", "Stefan Skellen", "Shilard Fitz-Oesterlen", 0, 0);
            insertQuestionBook6(db, "Kto by?? kochank?? Vattiera de Rideaux?", 0, "Carthia van Canten", "Fringilla Vigo", "Vreemde", 0, 0);
            insertQuestionBook6(db, "Dla kogo szpiegowa??a Cantarella?", 0, "Assire var Anahid", "Fringilli Vigo", "Filippy Eilhart", 0, 0);

            insertQuestionBook6(db, "Dok??d podr????owa??a wied??mi??ska kompania, my??l??c ??e znajduj?? si?? tam druidzi?", 0, "Caed Dhu", "Caed Myrkvid", "Corvo", 0, 0);
            insertQuestionBook6(db, "Dok??d przenie??li si?? druidzi przez wojn???", 0, "Caed Myrkvid", "Caed Dhu", "Corvo", 0, 0);
            insertQuestionBook6(db, "Jakiego naczelnego ??wiadka walki Bonharta ze szczurami pojmali ludzie Skellena?", 0, "Nycklara", "Hotsporna", "Pogwizda", 0, 0);
            insertQuestionBook6(db, "W jakiej karczmie jad?? Bonhart, kiedy mierzy?? si?? ze szczurami?", 0, "Pod g??ow?? Himery", "Pod g??ow?? Viverny", "Pod g??ow?? Bazyliszka", 0, 0);
            insertQuestionBook6(db, "Kto dowodzi?? grupie czujnej?", 0, "Neratin Czeka", "Nycklar", "Bonhart", 0, 0);

            //35 a
            insertQuestionBook6(db, "Jaki ??owca nagr??d rz??da?? wydania Ciri od Bonharta?", 0, "Nycklar", "Imbra", "Neratin Czeka", 0, 0);
            insertQuestionBook6(db, "Gdzie Bonhart kupi?? miecz dla Ciri?", 0, "w Claremont", "w Fano", "w Dillingen", 0, 0);
            insertQuestionBook6(db, "Kto wykonal miecz Ciri?", 0, "Imbra", "Eszter Hazy", "Neck", 0, 0);
            insertQuestionBook6(db, "Gdzie umarl Neratin Czeka?", 0, "Claremont", "Goworo??ec", "Geso", 0, 0);
            insertQuestionBook6(db, "Gdzie le??a??a arena?", 0, "w Fano", "w Claremont", "w Geso", 0, 0);

            insertQuestionBook6(db, "Jak nazywa?? si?? kuzyn Bonharta?", 0, "Leuvaarden", "Houvenaghel", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "Bonhart zmierzy?? si?? z Ciri na arenie?", 0, "Bonhart", "Stavro", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "Gdzie do wied??mi??skiej dru??yny do????czy??a Angoul??me?", 0, "Amarillo", "Riedbrune", "Beauclair", 0, 0);
            insertQuestionBook6(db, "Kto pojma?? Angoul??me?", 0, "S??owik", "Fulko", "Almavera", 0, 0);
            insertQuestionBook6(db, "Kogo Geralt nie chcia?? wzi???? do polowania na hanz?? S??owika?", 0, "Milvy", "Cahira", "Angoul??me", 0, 0);
            insertQuestionBook6(db, "Kto przerwa?? bijatyk?? Geralta i Cahira?", 0, "Regis", "Milva", "Jaskier", 0, 0);
            insertQuestionBook6(db, "Gdzie mia??a odby?? si?? zasadzka hanzy S??owika na wied??mina?", 0, "Amarillo", "Belhaven", "Riedbrune", 0, 0);
            insertQuestionBook6(db, "Kto by?? informatorem Angoul??me na wykopkach?", 0, "Homer Straggen", "Golan Drozdeck", "Pennycuick", 0, 0);
            insertQuestionBook6(db, "W kt??rej kopalni przebywa?? Schirr??? ", 0, "Stara Ruda", "Rialto", "Fortunna dziurka", 0, 0);
            insertQuestionBook6(db, "Kto \"przej????\" medalion Geralta?", 0, "S??owik", "Schirr??", "Rience", 0, 0);

            insertQuestionBook6(db, "Dlaczego Cahir przy????czy?? si?? do Geralta?", 0, "Za uratowanie ??ycia", "Kocha?? Ciri", "Chcia?? ??aski cesarza", 0, 0);
            insertQuestionBook6(db, "Jaki tytu?? nosi??a przyw??dczyni druidzkiego kr??gu?", 0, "Hierofantka", "Flaminika", "Bleobherise", 0, 0);
            insertQuestionBook6(db, "Kt??ry potw??r zaatakowa?? Geralta podczas jego pr??by w jaskini?", 0, "Barbegazi", "Pukacz", "Archespor", 0, 0);
            insertQuestionBook6(db, "Kogo Geralt spotka?? w jaskini do kt??rej Regi kaza?? mu wej???? bez broni?", 0, "Druid??w", "Avallac'ha", "Schirr??", 0, 0);
            insertQuestionBook6(db, "Jak ma na imi?? Avallac'h?", 0, "Br??acc", "Crevan", "Auberon", 0, 0);
            insertQuestionBook6(db, "Jak nazywa si?? elfi cmentarz w jaskini pod Gorgon???", 0, "Tir n?? Muinne", "Tir n?? B??a Arainne", "Tir n?? Haemlet", 0, 0);
            insertQuestionBook6(db, "Kto zabi?? Schirr???", 0, "Geralt", "Druidzi", "Cahir", 0, 0);
            insertQuestionBook6(db, "Jak mia?? na imi?? b????dny rycerz, kt??remu Geralt uratowa?? ??ycie nieopodal druidzkiego kr??gu?", 0, "Palmerin de Launfal", "Reynart de Bois-Fresnes", "Milton de Peyrac-Peyran", 0, 0);
            insertQuestionBook6(db, "Jaki tytu?? szlachecki posiada?? Julian Alfred Pankratz?", 0, "Hrabia", "Wicehrabia", "Baron", 0, 0);
            insertQuestionBook6(db, "Kto by?? kochank?? Jaskra w Toussaint?", 0, "Baronowa", "Xi????na", "Szlachcianka", 0, 0);

            insertQuestionBook6(db, "Jak mia??a na imi?? kr??lowa Koviru?", 0, "Heloiza", "Zuleyka", "Gaudemuda", 0, 0);
            insertQuestionBook6(db, "Ile lat trwa??o ma????e??stwo w??adc??w Koviru?", 0, "14", "29", "21", 0, 0);
            insertQuestionBook6(db, "Ile bizant??w chcia?? po??yczy?? Dijkstra od Esterada Thyssena?", 0, "100 000", "1 000 000", "500 000", 0, 0);
            insertQuestionBook6(db, "Po ilu dniach Nilfgard zerwa?? pakt z Temeri???", 0, "10", "16", "19", 0, 0);
            insertQuestionBook6(db, "Kto dowodzi?? grup?? operacyjn?? \"Verden\"?", 0, "Ardala aep Dahy", "Joachim de Wett", "Morvran Voorhis", 0, 0);
            insertQuestionBook6(db, "Kto dowodzi?? grup?? armii \"??rodek\" w czasie II wojny Nilfgaardu z Nordlingami?", 0, "Morvran Voorhis", "Menno Coehoorn", "Joachim de Wett", 0, 0);
            insertQuestionBook6(db, "Kto dowodzi?? grup?? armii \"Wsch??d\"? ", 0, "Joachim de Wett", "Ardala aep Dahy", "Morvran Voorhis", 0, 0);
            insertQuestionBook6(db, "Adam Pangratt by?? wi????niem?", 0, "Redanii", "Koviru", "Aedirn", 0, 0);
            insertQuestionBook6(db, "Jak mia??a na imi?? s??odka trzpiotka?", 0, "Hanna", "Julia", "Cecylia", 0, 0);
            insertQuestionBook6(db, "Dla kogo szpiegowa??a kr??lowa Zuleyka?", 0, "Filippy Eilhart", "Sheali de Tancarville", "Keiry Metz", 0, 0);

            //70 b

            insertQuestionBook6(db, "Po ilu latach wezwano Cracha an Craite do wype??nienia przysi??gi kt??r?? z??o??y?? kr??lowej Calanthe?", 0, "5", "7", "10", 0, 0);
            insertQuestionBook6(db, "Czy Yennefer wierzy??a w to, ??e Geralt odnajdzie Ciri?", 0, "Nie m??wi??a", "Tak", "Nie", 0, 0);
            insertQuestionBook6(db, "Sk??d Yennefer wzie??a brylant potrzebny do budowy megaskopu?", 0, "Spikeroog", "Ard Skellige", "Hindarsfjall", 0, 0);
            insertQuestionBook6(db, "Jak nazywa?? si?? brylant z naszyjnika zdobi??cy szyj?? pos??gu Freyji?", 0, "Brisinger", "Brisingr", "Brisingamen", 0, 0);
            insertQuestionBook6(db, "Jak ma na imi?? Freyja?", 0, "Marita", "Mara", "Modron", 0, 0);
            insertQuestionBook6(db, "Kto by?? przewodnicz??cym komisji badaj??cej ??lady teleportacyjne po puczu na Thanned?", 0, "Immanuel Benavent", "Moritz Diefenthel", "Radcliffe", 0, 0);
            insertQuestionBook6(db, "Kto przyby?? na Skellige w poszukiwaniu Yennefer?", 0, "Filippa Eilhart", "Margarita Laux-Antille", "Triss Merigold", 0, 0);
            insertQuestionBook6(db, "Kto by?? \"narzeczonym\" Ciri z dzieci??stwa?", 0, "Tankred Thyssen", "Windhalm", "Hjalmar an Craite", 0, 0);
            insertQuestionBook6(db, "W jakiej wsi puszczyk zdemaskowa?? Rienca?", 0, "Claremont", "Riedbrune", "Goworo??ec", 0, 0);
            insertQuestionBook6(db, "Co Ciri zabra??a z rzeczy c??rki Vysogoty?", 0, "Grzebie??", "Lusterko", "??y??wy", 0, 0);

            insertQuestionBook6(db, "Gdzie Ciri zabi??a 4 bandyt??w o kt??rych opowiedzia?? jej Vysogota?", 0, "Goworo??ecu", "Belhaven", "Dun Dare", 0, 0);
            insertQuestionBook6(db, "Kto by?? szpiegiem Vattiera de Rideaux w dru??ynie Puszczyka?", 0, "Dede Vargas", "Boreas Mun", "Neratin Ceka", 0, 0);
            insertQuestionBook6(db, "Jak nazywa??a si?? czujna s??u????ca dla Stefana Skellena?", 0, "Jediah", "Dufficey", "Kenna", 0, 0);
            insertQuestionBook6(db, "Z jakiego powodu Jarre chcia?? walczy?? z Nilfgardem?", 0, "Za ojczyzn??", "Za honor", "Za Ciri", 0, 0);
            insertQuestionBook6(db, "Kto przywita?? Yennefer jako pierwszy na zamku Stygga?", 0, "Vilgefotrz", "Shirru", "Rience", 0, 0);
            insertQuestionBook6(db, "Kogo wyskanowa??a podczas tortur Yennefer dla Vilgefotrza?", 0, "Ciri", "Lo???? Carodziejek", "Geralta", 0, 0);
            insertQuestionBook6(db, "Kt??ry z ludzi puszczyka nie zdezerterowa?? nieopodal wie??y jask????ki?", 0, "Joanna Selborne", "Yuz Jannowitz", "Boreas Mun", 0, 0);


            // 87 - C


            // PANI JEZIORA
            insertQuestionBook7(db, "Gdzie uda??a si?? Ciri po pobycie w Rivii?", 0, "Camelotu", "Toussaint", "Nie wiadomo", 0, 0);
            insertQuestionBook7(db, "Kt??ry rycerz wzi???? Ciri za Pani?? Jeziora?", 0, "Galahad", "Malagant", "Parsifal", 0, 0);
            insertQuestionBook7(db, "Jak nazywa??a si?? Pani Jeziora, badaczka histori Cirilli i Geralta?", 0, "Nimue", "Mozaik", "Wyrwa", 0, 0);
            insertQuestionBook7(db, "Jak nazywa??a si?? orejnomantka zaproszona przez Pani?? Jeziora?", 0, "Condwiramurs Tilly", "Mozaik", "Nimue", 0, 0);
            insertQuestionBook7(db, "Jaki pseudonim posiada??a Nimue?", 0, "??okietek", "Corine", "Krzywoustna", 0, 0);
            insertQuestionBook7(db, "Jakiego obrazu nie posiada??a w kolekcji Pani Jeziora?", 0, "Portretu Ciri", "Jaskra i Eithn??", "Bitwy pod Brenn??", 0, 0);
            insertQuestionBook7(db, "Sk??d Nimue pozna??a histori?? Geralta i Ciri?", 0, "od Bajarza", "Kronik", "Ksi????ek ", 0, 0);
            insertQuestionBook7(db, "Podczas jakiej czynno??ci Nimue ujrza??a teleportuj??c?? si?? Ciri?", 0, "Sexu", "Czytania", "Posi??ku", 0, 0);
            insertQuestionBook7(db, "\"Nikt od Jarugi po Buin?? nie ma tak pi??knego ty??ka jak ty\" - czyje to s??owa?", 0, "Geralta", "Jaskra", "Cahira", 0, 0);
            insertQuestionBook7(db, "Komu Bonhart jako pierwszemu pochwali?? si?? swoj?? kolekcj?? wied??mi??skich medalion??w?", 0, "Yennefer", "Ciri", "Vilgefotrzowi", 0, 0);

            insertQuestionBook7(db, "Kto pr??bowa?? zgwa??ci?? Yennefer na zamku Stygga?", 0, "Bonhart", "Rience", "Vilgefortz", 0, 0);
            insertQuestionBook7(db, "Na jakiego potwora Geralt polowa?? dla rz??dcy Vermentino?", 0, "Kuroliszka", "Gryfa", "Oszluzga", 0, 0);
            insertQuestionBook7(db, "Jak nazywa?? si?? ko?? Reynarta de Bois-Fresnes?", 0, "Buca??", "Mara", "Skoczka", 0, 0);
            insertQuestionBook7(db, "Co by??o powodem ??mierci ksi??cia Rajmunda?", 0, "Apopleksja", "Trucizna ", "Bandyci", 0, 0);
            insertQuestionBook7(db, "W jakiej okoliczno??ci poznali si?? Geralt i Fringilla Vigo?", 0, "??wi??to kadzi", "Prywatna audiencja", "Bal", 0, 0);
            insertQuestionBook7(db, "Jaki zapach charakteryzowa?? Fringill?? Vigo?", 0, "Ambra i R????e", "Frezje i Morele", "Pi??mo i Olejki", 0, 0);
            insertQuestionBook7(db, "Kto by?? kuzynem Anny Henrietty?", 0, "Emchyr", "Ethain z Cidaris", "Foltest", 0, 0);
            insertQuestionBook7(db, "Kt??ry rycerz zaoferowa?? Geraltowi pieni??dze za nie zabijanie sukkuba?", 0, "Palmerin de Launfal", "Gr??goire z Gorgon", "Reynart de Bois-Fresnes", 0, 0);
            insertQuestionBook7(db, "Kto pomaga?? Geraltowi w wertowaniu ksi??gozbior??w Anny Henrietty?", 0, "Fringilla", "Regis", "Jaskier", 0, 0);
            insertQuestionBook7(db, "Gdzie Geralt i Fringilla pierwszy raz si?? kochali?", 0, "w Bibliotece", "Na ??wi??cie kadzi", "w Sypialni", 0, 0);

            insertQuestionBook7(db, "Jak Jaskier nazywa?? Anne Henriett???", 0, "??asiczk??", "Anarietk??", "Cyraneczk??", 0, 0);
            insertQuestionBook7(db, "Kto o??wiadczy?? si?? Milvie w Toussaint?", 0, "Amadis de Trastamara", "Reynart de Bois-Fresnes", "Palmerina de Launfal", 0, 0);
            insertQuestionBook7(db, "Od kogo Geralt otrzyma?? nowy medalion?", 0, "Fringilli Vigo", "Reynarta de Bois-Fresnes", "Palmerina de Launfal", 0, 0);
            insertQuestionBook7(db, "Gdzie odby??o si?? spotkanie spiskowc??w przeciwko Emchyrowi?", 0, "w Toussaint", "w Attre", "w Nastrogu", 0, 0);
            insertQuestionBook7(db, "Jak mia?? na imi?? Korred, kt??ry z??apa?? Geralta w pu??apk???", 0, "Szwajcer", "Garred", "Skoffin", 0, 0);
            insertQuestionBook7(db, "Co kaza??y Geraltowi zrobi?? potwory z podziemi Toussaint, ??eby te \"pu??ci??y go wolno\"?", 0, "Z??ama?? miecz", "Odda?? medalion", "Jedno i drugie", 0, 0);
            insertQuestionBook7(db, "Fringilla zapyta??a Geralta gdzie przebywa Vilgefotrz. Co jej odpowiedzia???", 0, "Rhys-Rhun", "Stygga", "Montecalvo", 0, 0);
            insertQuestionBook7(db, "Jaka rasa by??a niewolnikami dla Aen Elle?", 0, "Ludzie", "Krasnoludy", "Gnomy", 0, 0);
            insertQuestionBook7(db, "Jak mia?? na imi?? kr??l dzikiego gonu?", 0, "Auberon Muircetach", "Eredin", "Nithral", 0, 0);
            insertQuestionBook7(db, "Czego chcia?? dziki gon od Ciri?", 0, "Dziecka", "Krwii", "Ukra???? moc", 0, 0);

            insertQuestionBook7(db, "Kto by?? ??miertelnym wrogiem ludu olch?", 0, "Jednoro??ce", "Ludzie", "Gnomy", 0, 0);
            insertQuestionBook7(db, "Kto mia?? by?? ojcem dziecka Cirilli?", 0, "Auberon Muircetach", "Eredin", "Crevan Espane", 0, 0);
            insertQuestionBook7(db, "Kt??ry Aen Elle gra?? na flecie?", 0, "Crevan Espane", "Nithral", "Eredin", 0, 0);
            insertQuestionBook7(db, "Jak Vysogota nazywa?? Ciri?", 0, "Gwiazdooka", "Zirael", "Uroboros", 0, 0);
            insertQuestionBook7(db, "Kto powiedzia?? Ciri prawd?? o tym, ??e nigdy nie opu??ci lud Aen Elle?", 0, "Eredin", "Crevan Espane", "Imlerith", 0, 0);
            //35 - a

            insertQuestionBook7(db, "Co mia??o by?? dla Ciri alternatyw??, gdyby Auberon \"nie podo??a??\"?", 0, "Eredin", "Laboratorium Crevana", "Caranthir", 0, 0);
            insertQuestionBook7(db, "Kto pom??g?? Ciri uciec z krainy Aen Elle?", 0, "Avallac'h", "Ihuarraquax", "Shiadhal", 0, 0);
            insertQuestionBook7(db, "Kto otru?? kr??la olch?", 0, "Nithral", "Eredin", "Imlerith", 0, 0);
            insertQuestionBook7(db, "Kto stan???? na drodze Ciri, gdy ta pr??bawa??a uciec z krainy Aen Elle?", 0, "Caranthir", "Eredin", "Imlerith", 0, 0);
            insertQuestionBook7(db, "Jak?? chorob?? Ciri sprowadzi??a skacz??c mi??dzy wymiarami?", 0, "Malari??", "Catrion??", "Gryp??", 0, 0);

            insertQuestionBook7(db, "Jak nazywa?? si?? stary \"druch\" Jarrego z Ellander, kt??ry uratowa?? go od napa??ci?", 0, "Ograbek", "Melfi", "Klaproth", 0, 0);
            insertQuestionBook7(db, "Co oznacza skr??t BPP?", 0, "Bezczelna Pierdolona Piechota", "Biedna Pierdolona Piechota", "Beznadziejna Pierdolona Piechota", 0, 0);
            insertQuestionBook7(db, "Kto by?? dow??wdc?? BPP?", 0, "Okultich", "Bronibor", "Milten", 0, 0);
            insertQuestionBook7(db, "t??ry krasnolud przy??apa?? Jarrego w wyzimie?", 0, "Zoltan Chivay", "Dennis Cranmer", "Yarpenem Zigrin", 0, 0);
            insertQuestionBook7(db, "Od jakiej broni umar?? Coen?", 0, "Halabardy", "Gizarmy", "W????czni", 0, 0);
            insertQuestionBook7(db, "Kto ostatecznie wskaza?? Cirilli w??a??ciwe miejsce i czas?", 0, "Yennefer", "Nimue", "Konik", 0, 0);
            insertQuestionBook7(db, "Czy Ciri przenios??a si?? do Geralta, ale przez pomy??k?? uzna??a ??e to z??e miejsce i czas?", 0, "Nie", "Tak", "Nie wiadomo", 0, 0);
            insertQuestionBook7(db, "Kim by?? le??ny dziadek, na kt??rego natrafi??a Ciri?", 0, "Druidem", "Kanibalem", "My??liwym", 0, 0);
            insertQuestionBook7(db, "Jak pocz??tkowo m??wiono o Bitwie pod Brenn???", 0, "Pod Chochl??", "Pod Starymi Pupami", "Pod Bindug??", 0, 0);
            insertQuestionBook7(db, "Jak mia??a na imi?? S??odka Trzpiotka?", 0, "Anna", "Julia", "Maria", 0, 0);

            insertQuestionBook7(db, "Kt??ry wied??min wzi???? udzia?? w Bitwie pod Brenn???", 0, "Lambert", "Coen", "Letho", 0, 0);
            insertQuestionBook7(db, "Jak mia?? na imi?? legendarny lekarz, kt??ry ratowa?? rannych pod Brenn???", 0, "Shani", "Rusty", "Finn", 0, 0);
            insertQuestionBook7(db, "Kto by?? g????wnodowodz??cym Nordling??w podczas bitwy pod Brenn???", 0, "Foltest", "Jan Natalis", "Daniel Etcheverry", 0, 0);
            insertQuestionBook7(db, "Kto by?? g????wnodowodz??cym Cesarstwa podczas bitwy pod Brenn???", 0, "Joachim de Wett", "Menno Coehoorn", "Morvran Voorhis", 0, 0);
            insertQuestionBook7(db, "Kto dowodzi?? krasnoludzkim hufcem pod Brenn???", 0, "Sheldon Skaggs", "Barclay Els", "Yarpen Zigrin", 0, 0);
            insertQuestionBook7(db, "Kt??ra czarodziejka leczy??a rannych pod Brenn???", 0, "Lytta Neyd", "Marti Sodergren", "Triss Merigold", 0, 0);
            insertQuestionBook7(db, "Kto dowodzi?? brygad?? Vrihedd?", 0, "Iorweth", "Isengrim Faoiltiarna", "Yaevinn", 0, 0);
            insertQuestionBook7(db, "Kt??ry elf mordowa?? rannych w szpitalu?", 0, "Iorweth", "Yaevinn", "Isengrim Faoiltiarna", 0, 0);
            insertQuestionBook7(db, "Co zabi??o Menno Coehoorna?", 0, "Stryczek", "Be??t z kuszy", "Ko??skie kopyto", 0, 0);
            insertQuestionBook7(db, "Jak?? cz?????? cia??a straci?? Jarre podczas Bitwy pod Brenna?", 0, "Oko", "R??k??", "Nog??", 0, 0);

            // 60 - b

            insertQuestionBook7(db, "Jak mia??a na imi?? ??ona Jarre?", 0, "Julia", "Marylka", "Lucienne", 0, 0);
            insertQuestionBook7(db, "Sk??d Ciri znalaz??a si?? u Vilgefotrza?", 0, "Puszczyk j?? z??apa??", "Bonhart j?? z??apa??", "Sama przysz??a", 0, 0);
            insertQuestionBook7(db, "Kto zasugerowa?? ??eby Yennefer patrzy??a si?? na operacj??, kt??ra Vilgefotrz chcia?? podda?? Ciri?", 0, "Rience", "Puszczyk", "Bonhart", 0, 0);
            insertQuestionBook7(db, "Kto przywita?? Ciri pierwszy na Stygga?", 0, "Bonhart", "Vilgefortz", "Boreas Mun", 0, 0);
            insertQuestionBook7(db, "Kto wyzwoli?? Yennefer w Stygga?", 0, "Regis", "Ciri", "Geralt", 0, 0);
            insertQuestionBook7(db, "Jak umar??a Milva?", 0, "Od miecza", "Od Vilgefotrza", "Od Strza??y", 0, 0);
            insertQuestionBook7(db, "Kto zabi?? Cahira?", 0, "Vilgefortz", "Skellen", "Bonhart", 0, 0);
            insertQuestionBook7(db, "Kto zabi?? Regisa?", 0, "Skellen", "Bonhart", "Vilgefortz", 0, 0);
            insertQuestionBook7(db, "Kogo wspar?? ostatecznie Puszczyk na Stygga?", 0, "Geralta", "Vilgefotrza", "Nikogo", 0, 0);
            insertQuestionBook7(db, "Jaki plan na ??ycie mia??a Angouleme?", 0, "Kupiectwo", "Gildi?? ochroniarzy", "Burdel", 0, 0);


            insertQuestionBook7(db, "Kto zabi?? Bonharta?", 0, "Geralt", "Alchemik", "Ciri", 0, 0);
            insertQuestionBook7(db, "Za co Geralt mia?? pretensj?? do Ciri na Stygga?", 0, "Brak manier", "Morderczy sza??", "Obicie be??tu", 0, 0);
            insertQuestionBook7(db, "Jak mia?? na imi?? na prawd?? Emhyr?", 0, "Roderick", "Patrick", "Duny", 0, 0);
            insertQuestionBook7(db, "Kto powiedzia?? Emhyrowi, ??eby ratunku szuka?? na p????nocy?", 0, "Vilgefotrz", "Ojciec", "Xarthisius", 0, 0);
            insertQuestionBook7(db, "Kt??ra czarodziejka nie bra??a udzia??u w zniszczeniu zamku Stygga?", 0, "Keira Metz", "Sabrina Glevissig", "Filippa Eilhart", 0, 0);
            insertQuestionBook7(db, "Kt??ry kr??l zaj???? doln?? marchi?? Aedirn i nie chcia?? jej odda???", 0, "Foltest", "Radowid", "Henselt", 0, 0);
            insertQuestionBook7(db, "Ilu elfich oficer??w wydano Nordlingom po wojnie?", 0, "47", "39", "32", 0, 0);
            insertQuestionBook7(db, "Kt??ry elf przyja?? pokarm od ludzi ze ??zami w oczach?", 0, "Isengrim", "Yaevinn", "Toruviel", 0, 0);
            insertQuestionBook7(db, " Czym by??o \"wieczyste ruchad??o\"?", 0, "P??askorze??b??", "Starodawn?? ksi??g??", "Perpetuum mobile", 0, 0);
            insertQuestionBook7(db, "Komu Geralt chcia?? przedstawi?? Ciri wToussaint?", 0, "Palmerinowi", "Miltenowi", "Reynartowi", 0, 0);

            insertQuestionBook7(db, "Kogo wieszano w Toussaint podczas wizyty Geralta i Ciri?", 0, "Sebastiana Le Goff", "Charlesa Lanzano", "Jaskra", 0, 0);
            insertQuestionBook7(db, "Za co Henrietta skaza??a Jaskra?", 0, "Krzywoprzysi??stwo", "Z??odziejstwo", "Kurwiarstwo", 0, 0);
            insertQuestionBook7(db, "Gdzie Geralt szykowa?? niespodziank?? dla Zoltana i Ciri?", 0, "w Kaer Morhen", "w Verden", "w Rivii", 0, 0);
            insertQuestionBook7(db, "Czyj g??os przewa??y?? w g??osowaniu o to, czy Ciri spotka si?? z Geraltem?", 0, "Yennefer", "Keiry Metz", "Filippy Eilhart", 0, 0);
            insertQuestionBook7(db, "Jaka kobieta by??a odpowiedzialna za bezpo??redni?? przyczyn?? wybuchu pogromu w Rivii?", 0, "Anna", "Eliza", "Nadia", 0, 0);
            insertQuestionBook7(db, "Jak si?? nazywa przysz??a ma????onka Zoltana?", 0, "Breckesrick", "Breckenrek", "Breckenriggs", 0, 0);
            insertQuestionBook7(db, "Jak nazwano knajp?? w Rivii, w kt??rej spotkali si?? Geralt, Zoltan, Yarpen i Jaskier?", 0, "Wied??mi??ski obro??ca", "Ku pami??ci Geralta", "Pod wied??mi??skim mieczem", 0, 0);
            insertQuestionBook7(db, "Uda??o si?? komu?? kiedykolwiek powt??rzy?? zakl??cie o nazwie \"Gradobicie Merigold\"?", 0, "Tak", "Brak danych", "Nie", 0, 0);
            insertQuestionBook7(db, "Kogo z umar??ych nie by??o podczas wsiadania Ciri, Geralta i Yennefer na ????d???", 0, "Cahira", "Angouleme", "Regisa", 0, 0);

            // 89 - c

            insertQuestionBook8(db, "Sezon Burz dzieje si?? po czy przed sag?? wied??mi??ska?", 0, "Przed", "Po", "Nie wiadomo", 0, 0);
            insertQuestionBook8(db, "My tu je??te??my po to ??eby potworom przy??omoci??\" - czyje to s??owa?", 0, "Vesemira", "Geralta", "Lamberta", 0, 0);
            insertQuestionBook8(db, "\"Egzystowa?? nie po to, by je???? i podtrzymywa?? gatunek. Nie po to go stworzono. ??y?? po to, by zabija??.\" - jakiego potwora jest to opis?", 0, "Idra", "Gryfa", "Viverny", 0, 0);
            insertQuestionBook8(db, "Geralt podpisa?? sfa??szowane papiery w sprawie wysyko??ci wynagrodzenia. Na ile koron podpisa?? rachunek?", 0, "80", "70", "60", 0, 0);
            insertQuestionBook8(db, "W jakich klejnotach zdobi??a si?? Koral?", 0, "Rubinach", "Szmaragdach", "Obsydianie", 0, 0);
            insertQuestionBook8(db, "Jaki zapach charakteryzowa?? Lytte Neid?", 0, "Frezji i Morel", "Ambra i R????e", "Pi??mo i Olejki", 0, 0);
            insertQuestionBook8(db, "Jak mia?? na imi?? w??adca Kerack?", 0, "Belohun", "Xander", "Elmer", 0, 0);
            insertQuestionBook8(db, "Przez kogo Geralt trafi?? do lochu?", 0, "Koral", "Egmunda", "Ildiko", 0, 0);
            insertQuestionBook8(db, "Kto nie by?? synem Belohuna?", 0, "Osmyk", "Xander", "Edmund", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt zostawi?? swoje miecze?", 0, "w Kordegardzie", "w Karczmie", "u Koral", 0, 0);

            insertQuestionBook8(db, "Kto wstawi?? si?? za Geraltem, dzi??ki czemu uda??o mu si?? wej???? do ekskluzywnej knajpy?", 0, "Febus Ravenga", "Koral", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt zabi?? Leukrot???", 0, "w Cizmar", "w Kerrack", "w Ansegis", 0, 0);
            insertQuestionBook8(db, "Jak nazywa si?? elegancki lokal z Kerrack?", 0, "Natura Rerum", "Zgraggen", "Tiberghien", 0, 0);
            insertQuestionBook8(db, "Na jakie danie zdecydowa?? si?? Geralt tu?? przed zamkni??cemw celi?", 0, "Turbota", "Jagni??", "Wieprzowin??", 0, 0);
            insertQuestionBook8(db, "Ile wynosi??a kaucja ustalona za wolno???? Geralta?", 0, "500 koron", "500 floren??w", "500 oren??w", 0, 0);
            insertQuestionBook8(db, "Czego Geraltowi nie zarekwirowano po uwolneniu z lochu?", 0, "P??otki", "Got??wki", "Weksli", 0, 0);
            insertQuestionBook8(db, "Co stra??niczki chcia??y odci???? Geraltowi?", 0, "Ku??k??", "Palce", "J??zyk", 0, 0);
            insertQuestionBook8(db, "Kto uratowa?? Geralta przed stra??niczkami?", 0, "Jaskier", "Antea Derris", "Febus Ravenga", 0, 0);
            insertQuestionBook8(db, "Kto prowadzi?? spraw?? kradzie??y mieczy?", 0, "Ferrant de Lettenhove", "Febus Ravenga", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "to wp??aci?? kaucj?? za Geralta?", 0, "Koral", "Jaskier", "Yenneer", 0, 0);

            insertQuestionBook8(db, "Od kogo Geralt wie, kto wp??aci?? za niego kaucj???", 0, "od Jaskra", "od Ferranta", "od Antea", 0, 0);
            insertQuestionBook8(db, "22. Czym Geralt broni?? si?? przed 3 zbirami, kt??rzy napadli jego i Jaskra?", 0, "Klepk??", "Kijem", "Sztachet??", 0, 0);
            insertQuestionBook8(db, "Czy Geralt pasowa?? do stereotypowych pogl??d??w Koral?", 0, "troch??", "tak", "nie", 0, 0);
            insertQuestionBook8(db, "Jak mia??a na imi?? uczennica Koral?", 0, "Mozaik", "Felicja", "Nina", 0, 0);
            insertQuestionBook8(db, "W jak?? sukni?? ubra??a si?? Koral na 1 spotkanie z Geraltem?", 0, "Bia????", "Czarn??", "Czerwon??", 0, 0);
            insertQuestionBook8(db, "Co chcia??a zaproponowa?? Geraltowi Koral za wygranie zak??adu?", 0, "Fundusz w knajpie", "Pieni??dze", "Swoje towarzystwo", 0, 0);
            insertQuestionBook8(db, "Co Koral zrobi??a Mozaice przez drwiny Geralta?", 0, "Wykr??ci??a r??k??", "Po??ama??a paznokcie", "Odebra??a mow??", 0, 0);
            insertQuestionBook8(db, "akim znakiem Geralt obroni?? si?? przed wyzywaj??cym go na pojedynek Rethariusem?", 0, "Aard", "Aksji", "Quen", 0, 0);
            insertQuestionBook8(db, "Jaki kwiat dosta??a Koral od Geralta?", 0, "Frezje", "Fio??ek", "Turkusa", 0, 0);
            insertQuestionBook8(db, "Jaki tatua?? mia??a Koral?", 0, "Ryb??", "Or??a", "R??z??", 0, 0);

            insertQuestionBook8(db, "Jak brzmi prawdziwe imi?? Koral?", 0, "Astrid", "Lytta", "Aik", 0, 0);
            insertQuestionBook8(db, "Kt??ry statek jest z Lan Exeter?", 0, "Vertigo", "Albatros", "Echo", 0, 0);
            insertQuestionBook8(db, "Kt??ry statek jest z Redanii?", 0, "Albatros", "Tettyda", "Alke", 0, 0);
            insertQuestionBook8(db, "Sk??d pochodzi Koral?", 0, "ze Skellige", "z Temerii", "z Povis", 0, 0);
            insertQuestionBook8(db, "Co Geralt ujrza?? jako pierwsze w fontannie Lytty?", 0, "Yennefer", "Dziki Gon", "Cintre", 0, 0);
            insertQuestionBook8(db, "Jakiej magii u??y??a Koral w celu znalezenia mieczy Geralta?", 0, "Dywinacji", "Onejromancji", "Piromancji ", 0, 0);
            insertQuestionBook8(db, "Gdzie udali si?? Jaskier i Geralt po \"czarach Koral\"?", 0, "Ravelinu", "Alke", "do Cizmar", 0, 0);
            insertQuestionBook8(db, "Jak nazywa?? si?? stra??nik Wielebnego?", 0, "Mikita", "Astrid", "Irid", 0, 0);
            insertQuestionBook8(db, "Jak mia?? na imi?? Wielebny?", 0, "Pyral Pratt", "Zgraggen", "Antea Derris", 0, 0);
            insertQuestionBook8(db, "\"O tym ??e nie jeste?? zbyt m??dry ju?? rozmawiali??my, ale ??eby spr??bowa?? teraz wyj????.. jeste?? za m??dry\" - to s??owa?", 0, "Wielebnego", "Geralta", "Koral", 0, 0);

            // 40 a

            insertQuestionBook8(db, "Gdzie znaleziono miecze Geralta?", 0, "w Castel Ravello", "w Domu Borsodyc", "w Rissbergu", 0, 0);
            insertQuestionBook8(db, "Z jakim potworem Geralt walczy?? na arenie?", 0, "Vivern??", "Wigilozaurem", "Endriag??", 0, 0);
            insertQuestionBook8(db, "Kto razem z Ferrantem nabra?? Geralta udaj???? swojego brata?", 0, "Xavier", "Egmund", "Viraxas", 0, 0);
            insertQuestionBook8(db, "Ile Geralt dosta?? rzekomo za wampira?", 0, "1250 orenow", "1000 orenow", "750 orenow", 0, 0);
            insertQuestionBook8(db, "Kto sprzeda?? Jaskrowi tandetny miecz?", 0, "Aik", "Etna", "Nikefor", 0, 0);
            insertQuestionBook8(db, "Jest ktokolwiek w Rissbergu, kogo do siebie nie zrazi?? Geralt podczas 1 spotkania?", 0, "Ortolan", "Nikt", "Sorel Degerlund", 0, 0);
            insertQuestionBook8(db, "Kto pisa?? listy do Koral?", 0, "Ortolan", "Pinety", "Dagobert", 0, 0);
            insertQuestionBook8(db, "G??owa jakiego potwora by??a przedstawiona na tympanomie w Rissbergu?", 0, "Viverny",  "Harpii", "Gryfa", 0, 0);
            insertQuestionBook8(db, "Kto przywita?? Geralta na Rissbergu?", 0, "Ortolan", "Pinety", "Sorel", 0, 0);
            insertQuestionBook8(db, "Dlaczego wynalazki Ortolana nie wysz??y nigdy z Rissbergu?", 0, "By??y prywatne", "By??y sabotowane", "By??y nieudane", 0, 0);

            insertQuestionBook8(db, "Gdzie stworzono Wigilozaura?", 0, "w Ravelinie", "w Rissbergu", "w Kerack", 0, 0);
            insertQuestionBook8(db, "Kto stworzy?? wied??min??w?", 0, "Amos var Ypsis", "Alzur", "Bekker", 0, 0);
            insertQuestionBook8(db, "Kto udzieli?? Geraltowi audiencji w swojej prywatnej komnacie w Rissbergu?", 0, "Ortolan", "Pinety", "Xsara", 0, 0);
            insertQuestionBook8(db, "Jak nazywa si?? magia przywo??ywania demon??w?", 0, "Demonologia", "Geodecja", "Xardisius", 0, 0);
            insertQuestionBook8(db, "Gdzie Geralt patrolowa???", 0, "w Ansegis", "Na Pog??rzu", "w Ravelinie", 0, 0);
            insertQuestionBook8(db, "Co kazali wied??minom zrobi?? ze strachem?", 0, "Pozby?? si?? go", "Uczy?? si?? od niego", "Ulec mu", 0, 0);
            insertQuestionBook8(db, "Jak mia?? na imi?? konetabl z Gorns Velen?", 0, "Tarvix Sandoval", "Frans Torquil", "Stucco Zangenis", 0, 0);
            insertQuestionBook8(db, "W kt??rej osiadze Geralt przy??apa?? sprawc?? masakr?", 0, "Nowa Smolarnia", "So??nica", "Jaworek", 0, 0);
            insertQuestionBook8(db, "Kto by?? sprawc?? masakr?", 0, "Tarvix Sandoval", "Sorel Degerlund", "Ortolan", 0, 0);
            insertQuestionBook8(db, "Jakiej orientacji by?? Ortolan?", 0, "Oboj??tnej", "Homoseksualnej", "Heteroseksualnej", 0, 0);

            insertQuestionBook8(db, "Co na prawd?? zabija??o ludzi na wsiach?", 0, "Potwory", "Hybrydy", "Demon", 0, 0);
            insertQuestionBook8(db, "Czy Ortonal wiedzia??, kto morduje ludzi?", 0, "??le wiedzia??", "Tak", "Nie", 0, 0);
            insertQuestionBook8(db, "Jak?? toksyn?? z jakiego jadu pocz??stowano Geralta w niewoli?", 0, "z Mantikory", "z Bia??ych skorpion??w", "z Barbegazi", 0, 0);
            insertQuestionBook8(db, "Ko??o jakiej wsi Geralt uratowa?? wie??niak??w przed ??o??dakami?", 0, "D??bowiec", "Por??by", "Jaworek", 0, 0);
            insertQuestionBook8(db, "Jak mia?? na imi?? towarzysz podr????y do Novigradu Geralta?", 0, "Roegner de Salm", "Addarion Bach", "Hedwig z Malleore", 0, 0);
            insertQuestionBook8(db, "Kto by?? w??a??cicielem \"Proroka Liebiody\"?", 0, "Addario Bach", "Kevenard van Vliet", "Pud??orak", 0, 0);
            insertQuestionBook8(db, "Kogo porwa??a Aguara?", 0, "Vandelle", "Xymene", "Briane", 0, 0);
            insertQuestionBook8(db, "Ile lat mia??a porwana przez Aguar?? dziewczynka? ( Ta poprawna ).", 0, "12", "7", "9", 0, 0);
            insertQuestionBook8(db, "Aguary krad??y dzieci jakiej rasy?", 0, "Ludzkiej", "Elfiej", "Mieszanej", 0, 0);
            insertQuestionBook8(db, "Kto \"zabi??\" dziecko lisicy?", 0, "Addario Bach", "Parlagi", "Kevenard van Vliet", 0, 0);

            insertQuestionBook8(db, "Po ilu latach odby??o si?? spotkanie Geralta i Nimue?", 0, "77", "127", "133", 0, 0);
            insertQuestionBook8(db, "Jaka by??a magiczna moc Aguary?", 0, "Pirokineza", "Iluzja", "U??pienie", 0, 0);
            insertQuestionBook8(db, "Kto wpad?? na pomys?? oddania Aguarze \"zabo??jcy\"  jej dziecka?", 0, "Parlagi", "Petru Cobbin", "Kevenard van Vliet", 0, 0);
            insertQuestionBook8(db, "Kogo nas??a??a Aguara na statek porywaczy?", 0, "Selkimore", "Vodyanoi ", "Topielce", 0, 0);
            insertQuestionBook8(db, "Ile razy w roku odbywa??y si?? aukcje w domu Borsodych?", 0, "2", "4", "6", 0, 0);
            insertQuestionBook8(db, "Aukcje w  domu Borsodych odbywa??y si?? tradycyjnie w?", 0, "??rody", "Pi??tki", "Niedziel??", 0, 0);
            insertQuestionBook8(db, "Za il?? koron Vivaldi wylicytowa?? blu??niercz?? ksi??g???", 0, "200 0Koron", "2500 Koron", "2700 Koron", 0, 0);
            insertQuestionBook8(db, "Kt??r?? z kolei aukcj?? by??y miecze Geralta?", 0, "7", "10", "12", 0, 0);
            insertQuestionBook8(db, "Za ile wylicotowany miecz Geralta?", 0, "5000 Koron", "4000 Koron", "4500 Koron", 0, 0);
            insertQuestionBook8(db, "Kto wylicytowa?? miecze Geralta?", 0, "Vivaldi", "Giancardi", "Cianfanelli", 0, 0);


            // 80 b

            insertQuestionBook8(db, "Kto ukrad?? miecze Geralta?", 0, "Xander", "Pyral Pratt", "Nikefor Muus", 0, 0);
            insertQuestionBook8(db, "Jakk nazywa?? si?? wilko??ak ocalony przez Geralta?", 0, "Berem", "Niellen", "Otto", 0, 0);
            insertQuestionBook8(db, "Kto uszkodzi?? nog?? Torquila?", 0, "Grasanci", "Geralt", "Degerlund", 0, 0);
            insertQuestionBook8(db, "Ile Geralt zap??aci?? lekarzowi by ten odszed?? i nie leczy?? Torquila?", 0, "50 koron", "40 koron", "30 koron", 0, 0);
            insertQuestionBook8(db, "Kto wr??czy?? Geraltowi ??wietny miecz?", 0, "Jaskier", "Koral", "Pinety", 0, 0);
            insertQuestionBook8(db, "Gdzie uda?? si?? Pinety  po wygnaniu z Rissbergu?", 0, "do Povis", "do Mariboru", "do Nilfgardu", 0, 0);
            insertQuestionBook8(db, "Jak magowie ukarali Degerlunda?", 0, "??mierci??", "Wygnaniem", "Izolacj??", 0, 0);
            insertQuestionBook8(db, "Kto z??apa?? Degerlunda i doprowadzi?? przed s??d czarodziej??w?", 0, "Geralt", "Torquil", "Pinety", 0, 0);
            insertQuestionBook8(db, "Kto sfabrykowa?? dowody przeciwko Geraltowi?", 0, "Xander", "Pyral Pratt", "Ferrant", 0, 0);
            insertQuestionBook8(db, " Kto odda?? Geraltowi P??otk???", 0, "Torquil", "Jaskier", "Pinety", 0, 0);

            insertQuestionBook8(db, "Kto rzuci?? kl??tw?? na z??odzieja mieczy Geralta?", 0, "Koral", "Mozaik", "Yennefer", 0, 0);
            insertQuestionBook8(db, "Kto mia?? zosta?? kr??low?? i ??on?? Belohunda?", 0, "Lilly", "Edwine", "Ildiko", 0, 0);
            insertQuestionBook8(db,  "Kto porwa?? Jaskra?", 0, "Ferrant", "Xander", "Edmund", 0, 0);
            insertQuestionBook8(db, "Kto odkry?? spisek syn??w Belohunda?", 0, "Ferrant", "Geralt", "Belohund", 0, 0);
            insertQuestionBook8(db, "Jak nazywa?? si?? statek kt??ry przyby?? do Kerrack z najemnikami?", 0, "Gwiazda Po??udnia", "Ringhorn", "Acherontia", 0, 0);
            insertQuestionBook8(db, "Kt??ry syn chcia?? otru?? Belohunda dzi??ki pogrzebaczowi?", 0, "Xander", "Viraxas", "Egmund", 0, 0);
            insertQuestionBook8(db, "Co zabi??o Belohunda?", 0, "Apopleksja", "Trucizna", "Medalion", 0, 0);
            insertQuestionBook8(db, "Kto po ??mierci Belohunda obj???? tron w Kerrack?", 0, "Egmund", "Xander", "Vitraxas", 0, 0);
            insertQuestionBook8(db, "Z jak?? partnerk?? Geralt opu??ci?? Kerack?", 0, "Koral", "Yennefer", "Mozaik", 0, 0);
            insertQuestionBook8(db, "Co zak????ci??o spok??j mieszka??c??w Kerack?", 0, "Pogrom", "Aguara", "Sztorm", 0, 0);

            insertQuestionBook8(db, "Kto/co zabi??/zabi??o c??rk?? Pyrala Pratta?", 0, "Geralt", "Degerlund", "Sztorm", 0, 0);
            insertQuestionBook8(db, "Co si?? sta??o z nowym wy??mienitym mieczem Geralta?", 0, "Nic", "Zgubi?? go", "Te?? mu ukradli", 0, 0);
            insertQuestionBook8(db, "Co zostawi?? Geralt dla Mozaik na po??egnanie?", 0, "Pieni??dze", "Nic", "Kwiaty i Li??cik", 0, 0);
            insertQuestionBook8(db, "Jak mia?? na imi?? wied??min szko??y Kota, od kt??rego Geralt dowiedzia?? si?? o strzydze?", 0, "Aiden", "Kolgrim", "Brehen", 0, 0);
            insertQuestionBook8(db, "Gdzie Brehen dokona?? rzezi?", 0, "w Lyrii", "w Cidaris", "w Lello", 0, 0);
            insertQuestionBook8(db, "Co jest napisane na mieczu Geralta? ", 0, "\"Warownia Starego Morza\"", "\"Bia??y Wilk\" ", "\"M??j b??ysk przebije ciemnosci\"", 0, 0);
            insertQuestionBook8(db, "Kto odda?? Geraltowi jego miecze na polecenie Yennefer?", 0, "Mozaik", "Nie wiadomo", "Tiziana Frevi", 0, 0);
            insertQuestionBook8(db, "Czy Geralt dowiedzia?? si??, ??e odzyskanie mieczy zawdzi??cza Yennefer?", 0, "Nie", "Nie wiadomo", "Tak", 0, 0);
            insertQuestionBook8(db, "Czy c??rka aguary ostatecznie prze??y??a?", 0, "Nie wiadomo", "Nie", "Tak", 0, 0);
            insertQuestionBook8(db, " W co zmieni??a si?? Aguara przy ponownym spotkaniu z Geraltem?", 0, "w Cirii", "w Koral", "w Yennefer", 0, 0);

            insertQuestionBook8(db, "Jakiego znaku Geralt uzy?? na Nimue?", 0, "Aksji", "Heliotropu", "Somne", 0, 0);
            //111


    }
}


