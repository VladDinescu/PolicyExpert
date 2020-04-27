package policyExpert.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import policyExpert.ui.InsuranceFormPage;

public class NavigateTo implements Task {

    private InsuranceFormPage theInsuranceHomePage;

    @Override
    @Step("{0} navigates to the Home Insurance Form page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(theInsuranceHomePage)
        );
    }
}
