package com.example.deepak.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //edit text name field
        EditText NameField = (EditText)findViewById(R.id.name);
        String Name = NameField.getText().toString();

        //whipped cream checkbox
        CheckBox WhippedCreamCheckBox = (CheckBox) findViewById(R.id.WhippedCream_CheckBox);
        boolean hasWhippedCream = WhippedCreamCheckBox. isChecked();
        Log.v ("MainActivity" , "Add Whipped Cream:" + hasWhippedCream);

        //bread sticks checkbox
        CheckBox BreadSticksCheckBox = (CheckBox) findViewById(R.id.BreadSticks_CheckBox);
        boolean provideBreadSticks = BreadSticksCheckBox. isChecked();
        Log.v ("MainActivity" , " provideBreadSticks:" +  provideBreadSticks);

        int Price =(quantity * 5);
        String PriceMessage ="total $ " + Price + " for " + quantity + " cups of coffee " ;
        PriceMessage = PriceMessage + " \n ThankYou ";
        displayMessage(PriceMessage);
    }
    /**
     * this method is called creatOrderSummary
     * and to add topping checkboxes
     */
    private String creatOrderSummary(int Price , boolean AddWhippedCream , boolean AddBreadSticks){
        String PriceMessage = "Name" + "Deepak.S";
        PriceMessage = PriceMessage + "\nQuantity = " + quantity;
        PriceMessage = PriceMessage + "\n Add WhippedCream" +   AddWhippedCream  ;
        PriceMessage = PriceMessage + "\n Provide BreadSticks" +   AddBreadSticks  ;
        PriceMessage = PriceMessage +"\nTotal:" + Price + " Rs";
        PriceMessage = PriceMessage +"\nThankyou";
        return  PriceMessage;

    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen when price method is called
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
