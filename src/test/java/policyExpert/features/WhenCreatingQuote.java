package policyExpert.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

@RunWith(SerenityRunner.class)
public class WhenCreatingQuote {

    @Managed(uniqueSession = true)
    WebDriver herBrowser;

    Actor sergey = Actor.named("Sergey");

    @Steps
    CompleteQuote completeQuote;

    @Steps
    CompleteForm potentialCustomer;

    @Steps
    NavigateTo navigateToThePolicyExpertInsurancePage;

    @Test
    public void shouldBeAbleToCompleteHomeInsuranceForm(){



        givenThat(sergey).wasAbleTo(navigateToThePolicyExpertInsurancePage);
        when(sergey).attemptsTo(CompleteQuote.withDetails());
            //then(sergey).should(seeThat(TheWebPage.title(), containstString("")))
    }
}
