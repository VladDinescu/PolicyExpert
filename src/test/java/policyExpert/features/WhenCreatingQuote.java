package policyExpert.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import policyExpert.abilities.CreateQuote;
import policyExpert.tasks.CompleteQuote;
import policyExpert.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static policyExpert.identity.Sergey.*;

@RunWith(SerenityRunner.class)
public class WhenCreatingQuote {

    @Managed(uniqueSession = true)
    WebDriver herBrowser;

    Actor sergey = Actor.named("Sergey");

    @Steps
    NavigateTo navigateToThePolicyExpertInsurancePage;

    @Before
    public void sergeyCanDoStuff(){
        sergey.can(BrowseTheWeb.with(herBrowser))
               .can(CreateQuote.with(
                firstName,
                lastName,
                title,
                addressLine1,
                town,
                postcode,
                email,
                maritalStatus,
                occupation,
                telephone,
                houseDateOfFabrication,
                smoking,
                notBusiness,
                correspondence,
                trees,
                flatRoof,
                mainResidence,
                windowLock,
                lockableEntrance,
                entranceLockType,
                frenchPatioDoors,
                frenchLockType,
                otherExternalDoors,
                workingBurglarAlarm,
                burglarAlarmType,
                addJointPolicyHolder,
                insuranceClaimOrLosses,
                day,
                month,
                year,
                propertyType,
                specificPropertyType,
                bedrooms,
                ownership,
                occupied_by,
                occupied_at,
                consecutive_years_of_insurance,
                insurance_type,
                today,
                tomorrow,
                currentValueProperty,
                rebuildValueProperty,
                accidentalDamageCover

        ));
    }




    @Test
    public void shouldBeAbleToCompleteHomeInsuranceForm(){



        givenThat(sergey).wasAbleTo(navigateToThePolicyExpertInsurancePage);
        when(sergey).attemptsTo(CompleteQuote.withDetails());
            //then(sergey).should(seeThat(TheWebPage.title(), containstString("")))
    }
}
