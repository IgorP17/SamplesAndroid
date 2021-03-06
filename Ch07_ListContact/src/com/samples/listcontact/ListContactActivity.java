package com.samples.listcontact;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

public class ListContactActivity extends ListActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        
        ArrayList<ContactItem> list = new ArrayList<ContactItem>();

        list.add(new ContactItem("Jacob Anderson", "412412411"));
        list.add(new ContactItem("Emily Duncan", "161863187"));
        list.add(new ContactItem("Michael Fuller", "896443658"));
        list.add(new ContactItem("Emma Greenman", "964990543"));
        list.add(new ContactItem("Joshua Harrison", "759285086"));
        list.add(new ContactItem("Madison Johnson", "950285777"));
        list.add(new ContactItem("Matthew Cotman", "687699999"));
        list.add(new ContactItem("Olivia Lawson", "161863187"));
        list.add(new ContactItem("Andrew Chapman",  "546599645"));
        list.add(new ContactItem("Daniel Honeyman", "876545644"));
        list.add(new ContactItem("Isabella Jackson", "907868756"));
        list.add(new ContactItem("William Patterson", "687699693"));
        list.add(new ContactItem("Joseph Godwin", "965467575"));
        list.add(new ContactItem("Samantha Bush", "907865645"));
        list.add(new ContactItem("Christopher Gateman", "896874556"));

        ListAdapter adapter = new SimpleAdapter(this, list, R.layout.main, 
                new String[] {ContactItem.NAME, ContactItem.PHONE}, 
                new int[] {R.id.name, R.id.phone});
        setListAdapter(adapter);
    }
}
                                                                                                                                                                                                                                                                                                                                                                           