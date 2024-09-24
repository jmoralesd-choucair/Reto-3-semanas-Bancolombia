package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StarSharpHomePage {
    public static final Target PARENT_MENU_ORGANIZACION = Target.the("menu ORGANIZACION")
            .located(By.xpath("//a[@href='#nav_menu1_3_1']"));

    public static final Target CHILD_MENU_ORGANIZACION_UNIDADES_NEGOCIO = Target.the("submenu UNIDADES DE NEGOCIO")
            .located(By.xpath("//a[@href='/Organization/BusinessUnit']"));

    public static final Target MENU_REUNION = Target.the("menu REUNION")
            .located(By.xpath("//a[@href='#nav_menu1_3_2' and contains(@class, 's-sidebar-link')]"));

    public static final Target SUBMENU_REUNIONES = Target.the("submenu REUNIONES")
            .located(By.xpath("//a[@href='/Meeting/Meeting']"));
}
