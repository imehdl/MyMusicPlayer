package com.example.myproject;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class AudioAdapter extends RecyclerView.Adapter<AudioAdapter.SongViewHolder> {
    private List<Audio> musicTracks;
    private Context context;
    private MediaPlayer mediaPlayer;

    public AudioAdapter(List<Audio> songList, Context context) {
        this.musicTracks = songList;
        this.context = context;
    }





    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.song_item, parent, false);
        return new SongViewHolder(view);
    }





    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Audio song = musicTracks.get(position);
        holder.title.setText(song.getTitle());
        holder.artist.setText(song.getArtist());

        holder.itemView.setOnClickListener(v -> {

            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mediaPlayer = MediaPlayer.create(context, Uri.parse(song.getPath()));
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(mp -> {
                mp.release();
                mediaPlayer = null;
            });
        });
    }




    @Override
    public int getItemCount() {
        return musicTracks.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder {
        TextView title, artist;

        public SongViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.songTitle);
            artist = itemView.findViewById(R.id.songArtist);
        }
    }
}