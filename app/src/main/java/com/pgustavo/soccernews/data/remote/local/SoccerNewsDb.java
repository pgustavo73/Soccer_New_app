package com.pgustavo.soccernews.data.remote.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.pgustavo.soccernews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}
