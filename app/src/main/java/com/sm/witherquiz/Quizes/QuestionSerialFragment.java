package com.sm.witherquiz.Quizes;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sm.witherquiz.QuestionsDatabaseHelper;
import com.sm.witherquiz.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuestionSerialFragment extends Fragment implements View.OnClickListener{


private int IdQuestion = QuizSerialActivity.numberOfQuestion +1;

private int color;
private int Id;
private ImageView imageView;
private String tableName;


    public QuestionSerialFragment() {        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        color = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_question2, container, false);

        imageView = (ImageView) layout.findViewById(R.id.Quiz_picture);

        QuizSerialActivity activity = (QuizSerialActivity) getActivity();
        Id = activity.gameId();

        if(Id ==11)
        {
            tableName = "QUESTIONS";
            imageView.setImageResource(R.drawable.witcher_serial_s1);
            imageView.setContentDescription("Witcher Season 1");
        }


        try {
            Context context = getContext();
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(context);
            SQLiteDatabase db = questionDatabaseHelper.getWritableDatabase();
            Cursor cursor = db.query(tableName, new String[]{"QUESTION, IMAGE_RESOURCE_ID, ANSWER1, ANSWER2, ANSWER3"},
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

        if(Id ==11)
        {
            if(color==0)
            {
                if (IdQuestion >=1 && IdQuestion <=50)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update(tableName, GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_good);
                            answer1.setText("     ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update(tableName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_bad);
                            answer2.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update(tableName, BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_bad);
                            answer3.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }

                if (IdQuestion >50 && IdQuestion <=100)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update("QUESTIONS", BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_bad);
                            answer1.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update("QUESTIONS", GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_good);
                            answer2.setText("     ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update("QUESTIONS", BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_bad);
                            answer3.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }

                if (IdQuestion >100 && IdQuestion <=140)
                {
                    switch (v.getId())
                    {
                        case R.id.answer1:

                            db.update("QUESTIONS", BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer1.setBackgroundResource(R.drawable.button_bad);
                            answer1.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer2:
                            db.update("QUESTIONS", BadAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer2.setBackgroundResource(R.drawable.button_bad);
                            answer2.setText("     ");
                            Toast.makeText(getContext(), "Nie tym razem!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                        case R.id.answer3:
                            db.update("QUESTIONS", GoodAnswer, "_id = ?", new String[]{Integer.toString(IdQuestion)});
                            answer3.setBackgroundResource(R.drawable.button_good);
                            answer3.setText("     ");
                            Toast.makeText(getContext(), "Brawo!", Toast.LENGTH_SHORT).show();
                            color =1;
                            return;
                    }
                }




                db.close();


            }
        }




    }




}
