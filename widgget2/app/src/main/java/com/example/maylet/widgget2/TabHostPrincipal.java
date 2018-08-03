package com.example.maylet.widgget2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

// esta es una clase que hace una interfaz con pestañas
public class TabHostPrincipal extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TabHost tab  = getTabHost();

        tab.addTab
                (tab.newTabSpec("Tab1").setIndicator // Aqui crea la primera pestaña
                        ("Info",getResources().getDrawable
                                (android.R.drawable.ic_dialog_info)).setContent
                        (new Intent(this,Info.class)));

        tab.addTab
                (tab.newTabSpec("Tab2").setIndicator // Aqui crea la segunda pestaña
                        ("",getResources().getDrawable
                                (android.R.drawable.ic_menu_today)).setContent
                        (new Intent(this,Info.class)));

        tab.addTab
                (tab.newTabSpec("Tab3").setIndicator // Aqui crea la tercera pestaña, no se recomienda colocar más de tres pestañas debido al espacio que existe en la pantalla del telefono
                        ("Alarma",getResources().getDrawable
                                (android.R.drawable.ic_lock_idle_alarm)).setContent
                        (new Intent(this,Info.class).addFlags
                                (Intent.FLAG_ACTIVITY_CLEAR_TOP)));
    }
}

