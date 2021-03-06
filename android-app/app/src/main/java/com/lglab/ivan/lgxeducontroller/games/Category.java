package com.lglab.ivan.lgxeducontroller.games;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;
import java.util.List;

public class Category extends ExpandableGroup<Game> {

    public long id;

    public Category(long id, String title, List<Game> items) {
        super(title, items);

        this.id = id;
    }

    public Category(Category c) {
        super(c.getTitle(), new ArrayList<>(c.getItems()));

        this.id = c.id;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

    public long getId() {
        return id;
    }
}
