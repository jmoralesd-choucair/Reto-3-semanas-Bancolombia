package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateBusinessUnitPage {

    public static final Target BTN_NEW_BUSINESS_UNIT = Target.the("button to create new Business Unit")
            .located(By.xpath("//div[@data-action='add' and contains(@class, 'add-button')]"));

    public static final Target INPUT_NAME = Target.the("input for Business Unit name")
            .located(By.xpath("//label[contains(text(), 'Nombre')]/following-sibling::input[contains(@class, 's-Serenity-StringEditor')]"));

    public static final Target BTN_SAVE = Target.the("save button")
            .located(By.xpath("//div[@data-action='save-and-close']"));

    public static final Target BUSINESS_UNIT_1 = Target.the("Business Unit 1")
            .located(By.xpath("//a[contains(text(), 'Business Unit 1') and @data-item-type='Pro.Organization.BusinessUnit']"));
}
