package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private int numberOfCoffe=0;
    private int price =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view)
    {
        display(numberOfCoffe);
        displayPrice(numberOfCoffe*price);
    }
    public void increment(View view)
    {
        numberOfCoffe++;
        display(numberOfCoffe);
    }
    public void decrement(View view)
    {
        numberOfCoffe--;
        display(numberOfCoffe);
    }

    private void display (int number)
    {
        TextView quantityValueTextView = (TextView) findViewById(R.id.quantity_value_text_view);
        quantityValueTextView.setText(""+number);

    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_value_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
