package com.ou.bonusscreen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tej on 10/11/17.
 */

public class WineListAdapter extends
        RecyclerView.Adapter<WineListAdapter.ViewHolder> {


    private final int RIGHT = 0, LEFT = 1;
    private List<WineModel> vineList;
    private Context mContext;

    public WineListAdapter(Context context, List<WineModel> vineList) {
        this.vineList = vineList;
        mContext = context;
    }

    private Context getContext() {
        return mContext;
    }



    @Override
    public WineListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);



        if(viewType==RIGHT) {
            View contactView = inflater.inflate(R.layout.list_item_right, parent, false);
            ViewHolder viewHolder = new ViewHolder(contactView);
            return viewHolder;
        }
        else {
            View contactView = inflater.inflate(R.layout.list_item_left, parent, false);
            ViewHolder viewHolder = new ViewHolder(contactView);
            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(WineListAdapter.ViewHolder viewHolder, int position) {
        WineModel wine = vineList.get(position);

        viewHolder.name.setText(wine.getName());
        viewHolder.type.setText(wine.getType()+"  /  "+wine.getYear());
        viewHolder.description.setText(wine.getDiscription());
        viewHolder.glassPrice.setText("$"+wine.getGlassPrice());
        viewHolder.bottlePrice.setText("$"+wine.getBottlePrice());
        viewHolder.wineImage.setImageResource(wine.getThumbnail());
        viewHolder.bestPrice.setVisibility(wine.isBestPrice() ? View.VISIBLE : View.INVISIBLE);


    }

    @Override
    public int getItemCount() {
        return vineList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position%2;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView type;
        public TextView description;
        public TextView glassPrice;
        public TextView bottlePrice;
        public ImageView wineImage;
        public ImageView bestPrice;

        public ViewHolder(View itemView) {

            super(itemView);

            name = (TextView) itemView.findViewById(R.id.wine_name);
            type = (TextView) itemView.findViewById(R.id.wine_type_year);
            description = (TextView) itemView.findViewById(R.id.description);
            glassPrice = (TextView) itemView.findViewById(R.id.glass_price);
            bottlePrice = (TextView) itemView.findViewById(R.id.bottle_price);
            wineImage = (ImageView) itemView.findViewById(R.id.wine_image);
            bestPrice = (ImageView) itemView.findViewById(R.id.best_price);
        }
    }


}