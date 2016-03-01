package com.example.admin.aagma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ADMIN on 2/22/2016.
 */
public class Rules extends Fragment_1 {
    String s1[]={"Paper Presentation","Poster Presentation","Code Quiz"};
    TextView tv;
    String text;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        tv = (TextView) findViewById(R.id.rules);

        // See assets/res/any/layout/styled_text.xml for this
        // view layout definition.

        Intent in = getIntent();
        String s = in.getStringExtra("event");
        // Programmatically load text from an asset and place it into the
        // text view.  Note that the text we are loading is ASCII, so we
        // need to convert it to UTF-16.

            switch(s) {

                case "Paper Presentation":
                 text = " Description :\n" +
                        "“I am not, But M trying to” the phrases of Winston Churchill chilled out the hearts of many people. This platform a to expose your talent and in-depth knowledge on your interested areas. Come, chill out the hearts of the people with your innovative presentation.\n" +
                        "  Rules & Regulations\n" +
                        "Maximum of 2 members per team are allowed\n" +
                        "Abstract should be of only 1 page and the paper can be maximum of 15 pages\n" +
                        "Abstract should be mailed prior to the event\n" +
                        "Only technical topics related to computer science and information technology are permitted\n" +
                        "Hard copy should be submitted to the event co-ordinator at the time of event\n" +
                        "  Event Cordinators :\n" +
                        "Ch.Manasa   9618529117\n" +
                        "B.Anusha   7382115408";

                // Finally stick the string into the text view.

                tv.setText(text);
                    break;
                case "Poster Presentation":
                 text = "Description :\n" +
                        "In this event, we are looking for a potential and creative designer who has the ability to design a poster and has an eye for art. Don’t miss this onground contest to show off your skills in designing.\n" +
                        "  Rules & Regulations :\n" +
                        "College ID card must be carried\n" +
                        "Maximum of 2 members per team are allowed\n" +
                        "Design can be made using any type of art\n" +
                        "Time limit of 1 hour will be given for the event\n" +
                        "Selection of the best poster will be adjudged by guest\n" +
                        "  Event Cordinators :\n" +
                        "Nikhil.S    8096051874\n" +
                        "SK.Jahangir    8121779117\n";

                // Finally stick the string into the text view.

                tv.setText(text);
                    break;
            }

        }
    }

