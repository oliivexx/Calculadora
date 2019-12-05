package com.example.calculadoranavegation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.calculadoranavegation.R;

public class HomeFragment extends Fragment {


    Button boton;
    TextView pantallaGrande;
    TextView pantallaPequeña;
    double num1, num2, resul;
    String aux, aux1, aux2;
    int operacion;
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,btPorcent, btSuma, btResta, btDivi, btMulti, btPunt, btDel, btAc, btResul;
    String numeropantalla;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // boton=(Button)
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        pantallaGrande = root.findViewById(R.id.pantalla);
        pantallaPequeña = root.findViewById(R.id.pantalla2);
        bt0 = root.findViewById(R.id.bt0);
        bt1 = root.findViewById(R.id.bt1);
        bt2 = root.findViewById(R.id.bt2);
        bt3 = root.findViewById(R.id.bt3);
        bt4 = root.findViewById(R.id.bt4);
        bt5 = root.findViewById(R.id.bt5);
        bt6 = root.findViewById(R.id.bt6);
        bt7 = root.findViewById(R.id.bt7);
        bt8 = root.findViewById(R.id.bt8);
        bt9 = root.findViewById(R.id.bt9);
        btPorcent = root.findViewById(R.id.btpor);
        btDel = root.findViewById(R.id.btdel);
        btAc = root.findViewById(R.id.btac);
        btPunt = root.findViewById(R.id.btpun);
        btSuma = root.findViewById(R.id.btsum);
        btResta = root.findViewById(R.id.btrest);
        btMulti = root.findViewById(R.id.btmult);
        btDivi = root.findViewById(R.id.btdiv);
        btResul = root.findViewById(R.id.btresul);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton1();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt4();
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt5();
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt6();
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt7();
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt8();
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt9();
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt0();
            }
        });

        btSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumar();
            }
        });

        btResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               restar();
            }
        });

        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                multiplicar();
            }
        });

        btDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dividir();
            }
        });

        btResul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado();
            }
        });

        btPunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btpunt();
            }
        });

        btAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();
            }
        });

        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borra1();
            }
        });

        btPorcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                porcentaje();
            }
        });




        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }









    public void boton1(){
        aux="1";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt2(){
        aux="2";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt3 (){
        aux="3";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt4 (){
        aux="4";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt5 (){
        aux="5";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt6 (){
        aux="6";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt7 (){
        aux="7";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt8 (){
        aux="8";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt9 (){
        aux="9";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void bt0(){
        aux="0";
        String pant= pantallaGrande.getText().toString();
        pantallaGrande.setText(pant + aux);
    }

    public void btpunt (){

        String cadena = pantallaGrande.getText().toString();
        int resultado = cadena.indexOf(".");

        if(resultado != -1) {

        }else if (pantallaGrande.getText() == "") {

        }else{
            aux = ".";
            String pant = pantallaGrande.getText().toString();
            pantallaGrande.setText(pant + aux);
        }
    }


    public void sumar (){


        if(pantallaGrande.getText() == "") {

        }else {

            operacion = 1;
            aux1 = pantallaGrande.getText().toString();
            num1 = Double.parseDouble(aux1);
            pantallaPequeña.setText(aux1 + "+");
            pantallaGrande.setText("");
        }
    }

    public void restar (){
        aux1= pantallaGrande.getText().toString();

        if(pantallaGrande.getText() == "") {

    }else{
            operacion=2;
            num1= Double.parseDouble(aux1);
            pantallaPequeña.setText(aux1 + "-");
            pantallaGrande.setText("");
        }
    }

    public void multiplicar (){
        aux1= pantallaGrande.getText().toString();
        if(pantallaGrande.getText() == ""){

        }else{
            operacion=3;

            num1= Double.parseDouble(aux1);
            pantallaPequeña.setText(aux1 + "x");
            pantallaGrande.setText("");
        }
    }

    public void dividir (){
        aux1= pantallaGrande.getText().toString();
        if(pantallaGrande.getText() == ""){


        }else {
            operacion = 4;

            num1 = Double.parseDouble(aux1);
            pantallaPequeña.setText(aux1 + "/");
            pantallaGrande.setText("");
        }
    }

    public void porcentaje (){

        aux1= pantallaGrande.getText().toString();
        if(pantallaGrande.getText() == ""){


        }else {
            operacion = 5;
            num1 = Double.parseDouble(aux1);
            pantallaPequeña.setText(aux1 + "%");
            pantallaGrande.setText("");
        }
    }

    public void limpiar(){
        pantallaGrande.setText("");
        pantallaPequeña.setText("");
        num1 = 0;
        num2=0;
        aux1="";
        aux2="";
        operacion=0;
    }

    public void borra1(){
        if (!pantallaGrande.getText().toString().equals("")){
            pantallaGrande.setText(pantallaGrande.getText().subSequence(0, pantallaGrande.getText().length()-1));
        }
    }

    public void resultado(){
        String concadenar = "";
        try {
            aux2 = pantallaGrande.getText().toString();
            concadenar = pantallaPequeña.getText().toString()   +pantallaGrande.getText().toString();

            num2 = Integer.parseInt(aux2);
        }catch (NumberFormatException e){
            pantallaGrande.setText("");
        }

        if (operacion==1){

            pantallaPequeña.setText(concadenar);
            resul=num1+num2;
        }else if(operacion==2){
            pantallaPequeña.setText(concadenar);
            resul=num1-num2;
        }else if(operacion==3){
            pantallaPequeña.setText(concadenar);
            resul=num1*num2;
        }else if(operacion==4){
            float resultFloat;
            pantallaPequeña.setText(concadenar);
            resul=num1/num2;
            resultFloat()
        }else if(operacion==5){
            pantallaPequeña.setText(concadenar);
            resul=num1%num2;
        }



        if(num2==0){
            resul=0;
        }else{

            pantallaGrande.setText("" +resul);
            num1=resul;
        }



    }
}