package com.example.notesapp;

import androidx.cardview.widget.CardView;

import com.example.notesapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongCLick(Notes notes, CardView cardView);
}
