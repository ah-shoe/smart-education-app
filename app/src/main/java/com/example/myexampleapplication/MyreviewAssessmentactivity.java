package com.example.myexampleapplication;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MyreviewAssessmentactivity extends AppCompatActivity {


    private LinkedHashMap<String, HeaderInfo> mySection = new LinkedHashMap<>();
    private ArrayList<HeaderInfo> SectionList = new ArrayList<>();

    private MyListAdapter2 listAdapter;
    private ExpandableListView expandableListView;

    LinearLayout ll_layout;
    ImageView iv_icon;
    TextView tv_title;
    Toolbar toolbarTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myreviewassessmentsactivity);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Assessment");
        iv_toolbarIcon.setImageResource(R.drawable.myassessments);
//        mToolbar.setTitle("My Notes");
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myassessmentscolor));
        setSupportActionBar(toolbarTop);


        ll_layout=(LinearLayout) findViewById(R.id.ll_layout);
        iv_icon=(ImageView)findViewById(R.id.iv_subjectIcon);
        tv_title=(TextView)findViewById(R.id.tv_subjectTitle);


        iv_icon.setImageResource(Constants.image);
        tv_title.setText(Constants.subject);
        ll_layout.setBackgroundColor(Constants.bgColor);


        AddProduct();

        Drawable myIcon = getResources().getDrawable( R.drawable.add);
        //get reference to the ExpandableListView
        expandableListView = (ExpandableListView) findViewById(R.id.lvExp);
        expandableListView.setGroupIndicator(myIcon);

        //create the adapter by passing your ArrayList data
        listAdapter = new MyListAdapter2(MyreviewAssessmentactivity.this, SectionList);
        //attach the adapter to the list
        expandableListView.setAdapter(listAdapter);

        //expand all Groups


        //listener for child row click
        expandableListView.setOnChildClickListener(myListItemClicked);
        //listener for group heading click
        expandableListView.setOnGroupClickListener(myListGroupClicked);

    }

    private void AddProduct(){

        addProduct("Chapter1","Chapter1Child2");
        addProduct("Chapter1","Chapter1Child2");
        addProduct("Chapter1","Chapter1Child3");
        addProduct("Chapter1","Chapter1Child4");
        addProduct("Chapter1","Chapter1Child5");
        addProduct("Chapter2","Chapter2Child1");
        addProduct("Chapter2","Chapter2Child2");
        addProduct("Chapter2","Chapter2Child3");
        addProduct("Chapter2","Chapter2Child4");
        addProduct("Chapter2","Chapter2Child5");
        addProduct("Chapter3","Chapter3Child1");
        addProduct("Chapter3","Chapter3Child2");
        addProduct("Chapter3","Chapter3Child3");
        addProduct("Chapter3","Chapter3Child4");
        addProduct("Chapter3","Chapter3Child5");

    }

    //our child listener
    private OnChildClickListener myListItemClicked =  new OnChildClickListener() {

        public boolean onChildClick(ExpandableListView parent, View v,
                                    int groupPosition, int childPosition, long id) {

            //get the group header
            HeaderInfo headerInfo = SectionList.get(groupPosition);
            //get the child info
            DetailInfo detailInfo =  headerInfo.getProductList().get(childPosition);
            //display it or do something with it
//            Toast.makeText(getBaseContext(), "Clicked on Detail " + headerInfo.getName()
//                    + "/" + detailInfo.getName(), Toast.LENGTH_LONG).show();
            return false;
        }
    };

    //our group listener
    private OnGroupClickListener myListGroupClicked =  new OnGroupClickListener() {

        public boolean onGroupClick(ExpandableListView parent, View v,
                                    int groupPosition, long id) {

            //get the group header
            HeaderInfo headerInfo = SectionList.get(groupPosition);
            //display it or do something with it
//            Toast.makeText(getBaseContext(), "Child on Header " + headerInfo.getName(),
//                    Toast.LENGTH_LONG).show();

            return false;
        }
    };

    //here we maintain our products in various departments
    private int addProduct(String department, String product){

        int groupPosition = 0;

        //check the hash map if the group already exists
        HeaderInfo headerInfo = mySection.get(department);
        //add the group if doesn't exists
        if(headerInfo == null){
            headerInfo = new HeaderInfo();
            headerInfo.setName(department);
            mySection.put(department, headerInfo);
            SectionList.add(headerInfo);
        }

        //get the children for the group
        ArrayList<DetailInfo> productList = headerInfo.getProductList();
        //size of the children list
        int listSize = productList.size();
        //add to the counter
        listSize++;

        //create a new child and add that to the group
        DetailInfo detailInfo = new DetailInfo();
        detailInfo.setSequence(String.valueOf(listSize));
        detailInfo.setName(product);
        productList.add(detailInfo);
        headerInfo.setProductList(productList);

        //find the group position inside the list
        groupPosition = SectionList.indexOf(headerInfo);
        return groupPosition;
    }


}