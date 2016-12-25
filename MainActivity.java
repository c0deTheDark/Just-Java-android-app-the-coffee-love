/*
package package_name

example 
package com.example.justjava;
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numberOfCoffees=1;
    
    /* 
    *this method increases the numberOfCoffees by one and calls the display function to dispaly the number of coffees on the screen
    */
    
    public void increament(View view){
        numberOfCoffees+=1;
        display(numberOfCoffees);
    }
    
    /* 
    *this method decreases the numberOfCoffees by one and calls the display function to dispaly the number of coffees on the screen
    */
    
    public void decreament(View view){
        /*
        *checks the number of coffes is zero or higher. If zero do nothing(this is to avoid -ve number)
        */
        if (numberOfCoffees>0){
            numberOfCoffees-=1;
            display(numberOfCoffees);
        }

    }
    public void submitOrder(View view) {
        displayPrice(numberOfCoffees*10);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity);
        quantityTextView.setText("" + number);
    }
    
    /**
     * This method displays the price of the coffee on the screen.
     */
     
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
