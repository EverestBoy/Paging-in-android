package com.example.androidpaging.model;

import java.util.List;

class Ownerr{

    public int reputation;
    public long user_id;
    public String user_type;
    public int accept_rate;
    public String profile_image;
    public String display_name;
    public String link;


}

class Item{

    public Ownerr owners;
    public Boolean is_accepted;
    public int score;
    public long last_activity_date;
    public long last_edit_date;
    public long creation_date;
    public long answer_id;
    public long question_id;



}

public class StackApiResponse {


    List<Item> items;
    public Boolean has_more;
    public int quota_man;
    public int quota_remaining;

}
