package com.example.teo.a14datepicker;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    DatePicker picker;
    Button displayDate;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        picker = (DatePicker) findViewById(R.id.datePicker1);
        displayDate = (Button) findViewById(R.id.button1);
        textView1 = (TextView) findViewById(R.id.textView1);

        //Lấy giá trị Ngày tháng để set vào cho textView1;
        textView1.setText(getCurrenDate());

        //Click vô thì thay đổi textView1
        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(getCurrenDate());
            }
        });

    }

    //Hàm lấy giá trị của ngày tháng năm của DatePicker để trả về chuỗi String
    //getCurrentDate
    private String getCurrenDate() {
        StringBuilder builder = new StringBuilder();
        builder.append("Curren Date: ");
        builder.append((picker.getMonth()+1)+"/");//Lấy tháng của năm
        builder.append(picker.getDayOfMonth()+"/");//Lấy ngày của tháng vào để hiển thị
        builder.append(picker.getYear());//Lấy năm
        return builder.toString();
    }


    //Menu item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
