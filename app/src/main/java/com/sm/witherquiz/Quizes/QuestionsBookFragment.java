package com.sm.witherquiz.Quizes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sm.witherquiz.QuestionsDatabaseHelper;
import com.sm.witherquiz.R;


public class QuestionsBookFragment extends Fragment implements View.OnClickListener{

    private int IdQuestion = QuizBookActivity.numberOfQuestion +1;

    private int color;
    private int Id;
    private ImageView imageView;
    private String tableSQLName;

    private int number1;
    private int number2;
    private int number3;
    private int number4;

    public QuestionsBookFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        color = 0;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_questions_book, container, false);

        imageView  = (ImageView) layout.findViewById(R.id.Quiz_picture);

        QuizBookActivity activity = (QuizBookActivity) getActivity();
        Id = activity.gameId();

        number1 = 1;

        if(Id ==31)
        {
            number2 = 30;
            number3 = 70;
            number4=107;
            tableSQLName = "QUESTIONSBOOK1";
            imageView.setImageResource(R.drawable.ostatnie_zyczenie);
            imageView.setContentDescription("Ostatnie życzenie");
        }

        if(Id ==32)
        {
            number2 = 42;
            number3 = 74;
            number4=109;
            tableSQLName = "QUESTIONSBOOK2";
            imageView.setImageResource(R.drawable.miecz_przeznaczenia);
            imageView.setContentDescription("Miecz przeznaczenia");
        }

        if(Id ==33)
        {
            number2 = 40;
            number3 = 80;
            number4=106;
            tableSQLName = "QUESTIONSBOOK3";
            imageView.setImageResource(R.drawable.blood);
            imageView.setContentDescription("Krew Elfów");
        }

        if(Id ==34)
        {
            number2 = 40;
            number3 = 80;
            number4=104;
            tableSQLName = "QUESTIONSBOOK4";
            imageView.setImageResource(R.drawable.czas_pogardy);
            imageView.setContentDescription("Czas Pogardy");
        }

        if(Id ==35)
        {
            number2 = 35;
            number3 = 70;
            number4=105;
            tableSQLName = "QUESTIONSBOOK5";
            imageView.setImageResource(R.drawable.chrzest_ognia);
            imageView.setContentDescription("Chrzest Ognia");
        }

        if(Id ==36)
        {
            number2 = 35;
            number3 = 70;
            number4=87;
            tableSQLName = "QUESTIONSBOOK6";
            imageView.setImageResource(R.drawable.wieza);
            imageView.setContentDescription("Wieża Jaskółki");
        }

        if(Id ==37)
        {
            number2 = 35;
            number3 = 60;
            number4=89;
            tableSQLName = "QUESTIONSBOOK7";
            imageView.setImageResource(R.drawable.pani_jeziora);
            imageView.setContentDescription("Pani Jeziora");
        }
        if(Id ==38)
        {
            number2 = 40;
            number3 = 80;
            number4=111;
            tableSQLName = "QUESTIONSBOOK8";
            imageView.setImageResource(R.drawable.sezon_burz);
            imageView.setContentDescription("Sezon Burz");
        }

        try {
            Context context = getContext();
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(context);
            SQLiteDatabase db = questionDatabaseHelper.getWritableDatabase();
            Cursor cursor = db.query(tableSQLName, new String[]{"QUESTION, IMAGE_RESOURCE_ID, ANSWER1, ANSWER2, ANSWER3"},
                    "_id = ?",
                    new String[]{Integer.toString(IdQuestion)}, null, null, null);

            if (cursor.moveToFirst())
            {
                String question = cursor.getString(0);
                String answer1a = cursor.getString(2);
                String answer1b = cursor.getString(3);
                String answer1c = cursor.getString(4);





                Button answer1 = (Button) layout.findViewById(R.id.answer1);
                answer1.setOnClickListener(this);
                answer1.setText(answer1a);


                Button answer2 = (Button) layout.findViewById(R.id.answer2);
                answer2.setOnClickListener(this);
                answer2.setText(answer1b);


                Button answer3 = (Button) layout.findViewById(R.id.answer3);
                answer3.setOnClickListener(this);
                answer3.setText(answer1c);


                TextView questionText = (TextView) layout.findViewById(R.id.question);
                questionText.setText(question);

                db.close();
                cursor.close();

            }



        }

        catch (SQLiteException e)
        {
            Toast toast = Toast.makeText(getContext(), "Baza danych jest niedostępna", Toast.LENGTH_SHORT);
            toast.show();
        }


        return layout;

    }


    @Override
    public void onClick(View v) {

        Context context = getContext();
        SQLiteOpenHelper questionsDatabaseHelper = new QuestionsDatabaseHelper(context);
        SQLiteDatabase db = questionsDatabaseHelper.getWritableDatabase();

        ContentValues GoodAnswer = new ContentValues();
        GoodAnswer.put("SCORE", 1);

        ContentValues BadAnswer = new ContentValues();
        BadAnswer.put("SCORE", 0);

        View view = getView();

        Button answer1 = (Button) view.findViewById(R.id.answer1);
        answer1.setOnClickListener(this);


        Button answer2 = (Button) view.findViewById(R.id.answer2);
        answer2.setOnClickListener(this);


        Button answer3 = (Button) view.findViewById(R.id.answer3);
        answer3.setOnClickListener(this);



            if (color == 0)
            {
                if(IdQuestion >=number1 && IdQuestion <=number2)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update(tableSQLName, GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_good);
                            answer1.setText("   ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_bad);
                            answer2.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_bad);
                            answer3.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }

                if(IdQuestion >number2 && IdQuestion <=number3)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_bad);
                            answer1.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update(tableSQLName, GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_good);
                            answer2.setText("   ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_bad);
                            answer3.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }

                if(IdQuestion > number3 && IdQuestion <=number4)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_bad);
                            answer1.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update(tableSQLName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_bad);
                            answer2.setText("   ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update(tableSQLName, GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_good);
                            answer3.setText("   ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }
            }


    }



}
