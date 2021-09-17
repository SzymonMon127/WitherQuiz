package com.sm.witherquiz.ObjectAndAdapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.sm.witherquiz.R;


public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] numberOfList;
    private String[] captions;
    private int[] imagesId;
    private String[] Division;
    private String[] realLp;
    private Listener listener;

    interface Listener
    {
        void onClick(int position);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }


    public CaptionedImagesAdapter(String[] numberOfList, String[] captions, int[] imagesId, String[] division, String[] realLp) {
        this.numberOfList = numberOfList;
        this.captions = captions;
        this.imagesId = imagesId;
        Division = division;
        this.realLp = realLp;
    }

    @Override
  public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
  {
      CardView cv = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image, parent, false);
      return new ViewHolder(cv);
  }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final CardView cardView = holder.cardView;


        TextView textView = (TextView)cardView.findViewById(R.id.position);
        textView.setText(numberOfList[position]);

        TextView textView1 = (TextView)cardView.findViewById(R.id.Name);
        textView1.setText(captions[position]);


        ImageView imageView = (ImageView)cardView.findViewById(R.id.division_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imagesId[position]);
        imageView.setImageDrawable(drawable);

        TextView textView2 = (TextView)cardView.findViewById(R.id.Division);
        textView2.setText(Division[position]);

        TextView textView3 = (TextView)cardView.findViewById(R.id.RealLeaguePoints);
        textView3.setText(realLp[position]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null)
                {
                    listener.onClick(position);
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        private CardView cardView;

        public ViewHolder(CardView v)
        {
            super(v);
            cardView = v;
        }

    }
}

