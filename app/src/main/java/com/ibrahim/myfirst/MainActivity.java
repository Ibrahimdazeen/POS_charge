package com.ibrahim.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText amt;
    TextView chg;
    TextView Amtchg;


    Button btnChg;
    Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         amt = findViewById(R.id.amt);
         chg = findViewById(R.id.chg);
        Amtchg = findViewById(R.id.Amtchg);

         btnChg = findViewById(R.id.getCharge);
         btnClear = findViewById(R.id.clear);

        btnChg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat deciFormat = new DecimalFormat();

                deciFormat.setDecimalSeparatorAlwaysShown(false);
                deciFormat.setRoundingMode(RoundingMode.UP);

                double getamt;

                getamt = Double.parseDouble(amt.getText().toString());
                amt.setText(deciFormat.format(getamt));
                double getChg=0;
                double total;

                if(getamt<= 999.99){
                    getChg = 50; }
                else if(getamt<= 10000) {
                    getChg = 100; }
                else if (getamt<= 20000) {
                    getChg = 200; }
                else if (getamt<= 30000){
                    getChg = 300;  }
                else if (getamt<= 40000){
                    getChg = 400; }
                else if (getamt<= 50000){
                    getChg = 500; }
                else if (getamt<= 60000){
                    getChg = 600;}
                else if (getamt<= 70000){
                    getChg = 700;}
                else if (getamt<= 80000){
                    getChg = 800;}
                else if (getamt<= 90000){
                    getChg= 900; }
                else if (getamt<= 100000){
                    getChg = 1000; }
                else if (getamt<= 110000){
                    getChg = 1100; }
                else if (getamt<= 120000){
                    getChg = 1200; }
                else if (getamt<= 130000){
                    getChg = 1300;  }
                else if (getamt<= 140000){
                    getChg = 1400;}
                else if (getamt<= 150000){
                    getChg = 1500;}
                else if (getamt<= 160000){
                        getChg = 1600; }
                    else if (getamt<= 170000){
                        getChg = 1700;}
                    else if (getamt<= 180000){
                        getChg = 1800; }
                    else if (getamt<= 190000){
                        getChg = 1900; }

                    else if (getamt<= 200000){
                     getChg = (getamt/ 10000) * 100;}

                    else if (getamt<= 210000){
                        getChg = 2100; }
                    else if (getamt<= 220000){
                        getChg = 2200; }
                    else if (getamt<= 230000){
                        getChg = 2300; }
                    else if (getamt<= 240000){
                        getChg = 2400;  }
                    else if (getamt<= 250000){
                        getChg = 2500; }
                    else if (getamt<= 260000){
                        getChg = 2600;}
                     else if (getamt<= 270000){
                            getChg = 2700;}
                        else if (getamt<= 180000){
                            getChg = 2800;}
                        else if (getamt<= 290000){
                            getChg = 2900; }
                        else if (getamt<= 300000){
                            getChg = (getamt/ 10000) * 100;  }

                        else if (getamt<= 310000){
                            getChg = 3100; }
                        else if (getamt<= 320000){
                            getChg = 3200;}
                        else if (getamt<= 330000){
                            getChg = 3300;}
                        else if (getamt<= 340000){
                            getChg = 3400;}
                        else if (getamt<= 350000){
                            getChg = 3500;}
                        else if (getamt<= 360000){
                            getChg = 3600;}
                        else if (getamt<= 370000){
                            getChg = 3700;}
                        else if (getamt<= 380000){
                            getChg = 3800;}
                        else if (getamt<= 390000){
                            getChg = 3900;}
                        else if (getamt<= 400000){
                            getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 410000){
                            getChg = 4100;}
                        else if (getamt<= 420000){
                            getChg = 4200;}
                        else if (getamt<= 430000){
                            getChg = 4300;}
                        else if (getamt<= 440000){
                            getChg = 4400;}
                        else if (getamt<= 450000){
                            getChg = 4500;}
                        else if (getamt<= 460000){
                            getChg = 4600;}
                        else if (getamt<= 470000){
                            getChg = 4700;}
                        else if (getamt<= 480000){
                            getChg = 4800;}
                        else if (getamt<= 490000){
                            getChg = 4900;}
                        else if (getamt<= 500000){
                        getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 510000){
                            getChg = 5100;}
                        else if (getamt<= 520000){
                            getChg = 5200;}
                        else if (getamt<= 530000){
                            getChg = 5300;}
                        else if (getamt<= 540000){
                            getChg = 5400;}
                        else if (getamt<= 550000){
                            getChg = 5500;}
                        else if (getamt<= 560000){
                            getChg = 5600;}
                        else if (getamt<= 570000){
                            getChg = 5700;}
                        else if (getamt<= 580000){
                            getChg = 5800;}
                        else if (getamt<= 590000){
                            getChg = 5900;}
                        else if (getamt<= 600000){
                            getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 610000){
                            getChg = 6100;}
                        else if (getamt<= 620000){
                            getChg = 6200;}
                        else if (getamt<= 630000){
                            getChg = 6300;}
                        else if (getamt<= 640000){
                            getChg = 6400;}
                        else if (getamt<= 650000){
                            getChg = 6500;}
                        else if (getamt<= 660000){
                            getChg = 6600;}
                        else if (getamt<= 670000){
                            getChg = 6700;}
                        else if (getamt<= 180000){
                            getChg = 6800;}
                        else if (getamt<= 690000){
                            getChg = 6900;}
                        else if (getamt<= 700000){
                            getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 710000){
                            getChg = 7100;}
                        else if (getamt<= 720000){
                            getChg = 7200;}
                        else if (getamt<= 730000){
                            getChg = 7300;}
                        else if (getamt<= 740000){
                            getChg = 7400;}
                        else if (getamt<= 750000){
                            getChg = 7500;}
                        else if (getamt<= 760000){
                            getChg = 7600;}
                        else if (getamt<= 770000){
                            getChg = 7700;}
                        else if (getamt<= 780000){
                            getChg = 7800;}
                        else if (getamt<= 790000){
                            getChg = 7900;}
                        else if (getamt<= 800000){
                            getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 810000){
                            getChg = 8100;}
                        else if (getamt<= 820000){
                            getChg = 8200;}
                        else if (getamt<= 830000){
                            getChg = 8300;}
                        else if (getamt<= 840000){
                            getChg = 8400;}
                        else if (getamt<= 850000){
                            getChg = 8500;}
                        else if (getamt<= 860000){
                            getChg = 8600;}
                        else if (getamt<= 870000){
                            getChg = 8700;}
                        else if (getamt<= 880000){
                            getChg = 8800;}
                        else if (getamt<= 890000){
                            getChg = 8900;}
                        else if (getamt<= 900000){
                            getChg = (getamt/ 10000) * 100;}

                        else if (getamt<= 910000){
                            getChg = 9100;}
                        else if (getamt<= 920000){
                            getChg = 9200;}
                        else if (getamt<= 930000){
                            getChg = 9300;}
                        else if (getamt<= 940000){
                            getChg = 9400;}
                        else if (getamt <= 950000){
                            getChg = 9500;}
                        else if (getamt<= 960000){
                            getChg = 9600;}
                        else if (getamt<= 970000){
                            getChg = 9700;}
                        else if (getamt<= 980000){
                            getChg = 9800;}
                        else if (getamt<= 990000){
                            getChg = 9900;}
                        else if (getamt == 1000000) {
                            getChg = (getamt/ 10000) * 100;}

                        total=getamt+getChg;

                        chg.setText(deciFormat.format(getChg));
                        Amtchg.setText(deciFormat.format(total));

            }

        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amt.setText("");
                chg.setText("");
                Amtchg.setText("");
            }
        });
    }
}
