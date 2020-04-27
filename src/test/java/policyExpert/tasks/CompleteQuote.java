package policyExpert.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import policyExpert.abilities.CreateQuote;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static policyExpert.ui.InsuranceFormPage.*;

public class CompleteQuote extends UIInteractionSteps implements Task {
    public static CompleteQuote withDetails(){
        return instrumented(CompleteQuote.class);
    }

    private By selectOption(String actorProperty, By positiveOption, By negativeOption){
        String YES = "Yes";
        String AGREE = "I agree";

        if(actorProperty.equals(YES) || actorProperty.equals(AGREE)) return positiveOption;
        else return negativeOption;
    }

    @Override
    @Step("Completes form as: {0}")
    public <T extends Actor> void performAs(T actor) {
        By SMOKING = selectOption(potentialCustomer(actor).smoking(), SMOKING_YES, SMOKING_NO);
        By NOT_BUSINESS = selectOption(potentialCustomer(actor).notBusiness(), NOT_BUSINESS_AGREE, NOT_BUSINESS_DISAGREE);
        By CORRESPONDENCE = selectOption(potentialCustomer(actor).correspondence(), CORRESPONDENCE_YES, CORRESPONDENCE_NO);
        By TREES = selectOption(potentialCustomer(actor).trees(), TREES_YES, TREES_NO);
        By FLAT_ROOFS = selectOption(potentialCustomer(actor).flatRoof(), FLAT_ROOF_YES, FLAT_ROOF_NO);
        By MAIN_RESIDENCE = selectOption(potentialCustomer(actor).mainResidence(), MAIN_RESIDENCE_AGREE, MAIN_RESIDENCE_DISAGREE);
        By WINDOW_LOCKS = selectOption(potentialCustomer(actor).windowLock(), WINDOW_LOCKS_YES, WINDOW_LOCKS_NO);
        By LOCKABLE_ENTRANCE = selectOption(potentialCustomer(actor).lockableEntrance(), LOCKABLE_ENTRANCE_YES, LOCKABLE_ENTRANCE_NO);
        By FRENCH_PATIO_DOORS = selectOption(potentialCustomer(actor).frenchPatioDoors(), FRENCH_PATIO_DOORS_YES, FRENCH_PATIO_DOORS_NO);
        By OTHER_EXTERNAL_DOORS = selectOption(potentialCustomer(actor).otherExternalDoors(), OTHER_EXTERNAL_DOORS_YES, OTHER_EXTERNAL_DOORS_NO);
        By WORKING_BURGLAR_ALARM = selectOption(potentialCustomer(actor).workingBurglarAlarm(), WORKING_BURGLAR_ALARM_YES, WORKING_BURGLAR_ALARM_NO);
        By ADD_JOINT_HOLDER_POLICY = selectOption(potentialCustomer(actor).addJointPolicyHolder(), ADD_JOINT_POLICY_HOLDER_YES, ADD_JOINT_POLICY_HOLDER_NO);
        By INSURANCE_CLAIMS_OR_LOSSES = selectOption(potentialCustomer(actor).insuranceClaimOrLosses(), INSURANCE_CLAIMS_OR_LOSSES_YES, INSURANCE_CLAIMS_OR_LOSSES_NO);
        By INSURANCE_START_DATE = selectOption(potentialCustomer(actor).today(), TODAY_BUTTON, TOMORROW_BUTTON);
        By ADD_JOINT_POLICY_HOLDER = selectOption(potentialCustomer(actor).addJointPolicyHolder(), ADD_JOINT_POLICY_HOLDER_YES, ADD_JOINT_POLICY_HOLDER_NO);
        By ACCIDENTAL_DAMAGE_COVER = selectOption(potentialCustomer(actor).accidentalDamageCover(), ACCIDENTAL_DAMAGE_COVER_YES, ACCIDENTAL_DAMAGE_COVER_NO);

        By TITLE = selectorOption(potentialCustomer(actor).title());
        By MARITAL_STATUS = selectorOption(potentialCustomer(actor).maritalStatus());
        By DAY = selectorOption(potentialCustomer(actor).day());
        By MONTH = selectorOption(potentialCustomer(actor).month());
        By YEAR = selectorOption(potentialCustomer(actor).year());
        By PROPERTY_TYPE = selectorOption(potentialCustomer(actor).propertyType());
        By SPECIFIC_PROPERTY_TYPE = selectorOption(potentialCustomer(actor).specificPropertyType());
        By BEDROOMS = selectorOption(potentialCustomer(actor).bedrooms());
        By OWNERSHIP = selectorOption(potentialCustomer(actor).ownership());
        By OCCUPIED_BY = selectorOption(potentialCustomer(actor).occupiedBy());
        By OCCUPIED_AT = selectorOption(potentialCustomer(actor).occupiedAt());
        By CONSECUTIVE_YEARS_OF_INSURANCE = selectorOption(potentialCustomer(actor).consecutiveYearsOfOwnership());
        By INSURANCE_TYPE = selectorOption(potentialCustomer(actor).homeInsuranceType());

        actor.attemptsTo(
                //About you
                Click.on(TITLE),
                Enter.theValue(potentialCustomer(actor).firstName()).into(FIRST_NAME_FIELD),
                Enter.theValue(potentialCustomer(actor).lastName()).into(LAST_NAME_FIELD),
                Click.on(DAY),
                Click.on(MONTH),
                Click.on(YEAR),
                Click.on(MARITAL_STATUS),
                Enter.theValue(potentialCustomer(actor).occupation()).into(OCCUPATION_FIELD),
                Click.on(SMOKING),
                Click.on(SMOKING),
                Enter.theValue(potentialCustomer(actor).telephone()).into(TELEPHONE_FIELD),
                Enter.theValue(potentialCustomer(actor).email()).into(EMAIL_FIELD),

                //Statements about you
                Click.on(NOT_BUSINESS),

                //About your property

                Enter.theValue(potentialCustomer(actor).addressLine1()).into(ADDRESS_FIELD),
                Click.on(ADDRESS_MANUAL_BUTTON),
                Click.on(ADDRESS_MANUAL_BUTTON),
                Enter.theValue(potentialCustomer(actor).addressLine1()).into(ADDRESS_LINE_1_FIELD),
                Enter.theValue(potentialCustomer(actor).town()).into(ADDRESS_TOWN),
                Enter.theValue(potentialCustomer(actor).postcode()).into(ADDRESS_POSTCODE),
                Click.on(ADDRESS_SAVE_BUTTON),

                Click.on(CORRESPONDENCE),
                Click.on(PROPERTY_TYPE),
                Click.on(SPECIFIC_PROPERTY_TYPE),
                Enter.theValue(potentialCustomer(actor).houseDateOfFabrication()).into(HOUSE_DATE_OF_FABRICATION_FIELD),
                Click.on(BEDROOMS),
                Click.on(OWNERSHIP),
                Click.on(OCCUPIED_BY),
                Click.on(OCCUPIED_AT),
                Click.on(TREES),
                Click.on(FLAT_ROOFS),

                //Statements about your property
                Click.on(MAIN_RESIDENCE),

                //About safety and security
                Click.on(WINDOW_LOCKS),
                Click.on(LOCKABLE_ENTRANCE),
                Click.on(ENTRANCE_OPTION_BS),
                Click.on(FRENCH_PATIO_DOORS),
                Click.on(FRENCH_OPTION_ANTI_LIFT),
                Click.on(OTHER_EXTERNAL_DOORS),
                Click.on(WORKING_BURGLAR_ALARM),
                Click.on(BURGLAR_ALARM_OPTION_BELLS),

                //About the joint policyholders
                Click.on(ADD_JOINT_POLICY_HOLDER),

                //About your insurance history
                Click.on(ADD_JOINT_HOLDER_POLICY),
                Click.on(CONSECUTIVE_YEARS_OF_INSURANCE),
                Click.on(INSURANCE_CLAIMS_OR_LOSSES),

                //About the cover you want
                Click.on(INSURANCE_START_DATE),
                Click.on(INSURANCE_TYPE),

                Enter.theValue(potentialCustomer(actor).currentValueProperty()).into(CURRENT_VALUE_PROPERTY_FIELD),
                Enter.theValue(potentialCustomer(actor).rebuildValueProperty()).into(REBUILD_VALUE_FIELD),
                Click.on(ACCIDENTAL_DAMAGE_COVER)
        );

    }

    private CreateQuote potentialCustomer(Actor actor) {
        return CreateQuote.as(actor);
    }

}
