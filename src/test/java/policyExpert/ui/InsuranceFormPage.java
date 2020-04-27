package policyExpert.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://insurance.policyexpert.co.uk/home")
public class InsuranceFormPage extends PageObject{

        private static By questionnaireRadioButton(String text, int number) {
            return By.xpath("(//button[contains(text(), \"" + text + "\")])[" + number +"]");
        }

        public static By selectorOption(String option){
                return By.xpath("//option[text()=\""+ option + "\"]");
        }

        private static By questionnaireButton(String text) {
            return By.xpath("//button[@data-di-id=\"" + text + "\"]");
        }

        private static By questionnaireField(String text) {
            return By.xpath("//div[@class=\"" + text + "\"]//input");
        }

        private static By completeAddressForm(String field){
                return By.xpath("//div[@role = \""+ field +"\"]//input");
        }

        static String YES = "Yes";
        static String NO = "No";
        static String AGREE = "I agree";
        static String DISAGREE = "I disagree";

        public static By FIRST_NAME_FIELD = questionnaireField("row question-row-first-name");
        public static By LAST_NAME_FIELD = questionnaireField("row question-row-last-name");
        public static By SUBMIT_BUTTON = questionnaireButton("data-di-id=\"di-id-b05371d5-56d47f8");
        public static By ADDRESS_FIELD = questionnaireField("row question-row-address-of-property");
        public static By ADDRESS_MANUAL_BUTTON = By.xpath("//button[@role=\"enter-address\"]");
        public static By ADDRESS_SAVE_BUTTON = By.xpath("//button[@role=\"save-address\"]");
        public static By EMAIL_FIELD = By.xpath("//div[@class=\"row question-row-what-is-your-e-mail\"]//input");
        public static By ADDRESS_LINE_1_FIELD = completeAddressForm("line_1");
        public static By ADDRESS_TOWN = completeAddressForm("town");
        public static By ADDRESS_POSTCODE = completeAddressForm("postcode");
        public static By OCCUPATION_FIELD = questionnaireField("row question-row-what-is-your-occupat");
        public static By TELEPHONE_FIELD = questionnaireField("row question-row-main-telephone-numbe");
        public static By HOUSE_DATE_OF_FABRICATION_FIELD = questionnaireField("row question-row-approximately-in-whi");
        public static By SMOKING_YES = questionnaireRadioButton(YES, 1);
        public static By SMOKING_NO = questionnaireRadioButton(NO, 1);
        public static By NOT_BUSINESS_AGREE = questionnaireRadioButton(AGREE, 1);
        public static By NOT_BUSINESS_DISAGREE = questionnaireRadioButton(DISAGREE, 1);
        public static By CORRESPONDENCE_YES = questionnaireRadioButton(YES, 2);
        public static By CORRESPONDENCE_NO = questionnaireRadioButton(NO, 2);
        public static By TREES_YES = questionnaireRadioButton(YES, 3);
        public static By TREES_NO = questionnaireRadioButton(NO, 3);
        public static By FLAT_ROOF_YES = questionnaireRadioButton(YES, 4);
        public static By FLAT_ROOF_NO = questionnaireRadioButton(NO, 4);
        public static By MAIN_RESIDENCE_AGREE = questionnaireRadioButton(AGREE, 2);
        public static By MAIN_RESIDENCE_DISAGREE = questionnaireRadioButton(DISAGREE, 2);
        public static By WINDOW_LOCKS_YES = questionnaireRadioButton(YES, 5);
        public static By WINDOW_LOCKS_NO = questionnaireRadioButton(NO, 5);
        public static By LOCKABLE_ENTRANCE_YES = questionnaireRadioButton(YES, 6);
        public static By LOCKABLE_ENTRANCE_NO = questionnaireRadioButton(NO, 6);
        public static By ENTRANCE_OPTION_BS = By.xpath("//span[text() = \"5 lever mortice deadlock conforming to BS3621\"]");
        public static By FRENCH_PATIO_DOORS_YES = questionnaireRadioButton(YES, 7);
        public static By FRENCH_PATIO_DOORS_NO = questionnaireRadioButton(NO, 7);
        public static By FRENCH_OPTION_ANTI_LIFT = By.xpath("//span[text() = \"Anti-lift key operated lock with any other lock\"]");
        public static By OTHER_EXTERNAL_DOORS_YES = questionnaireRadioButton(YES, 8);
        public static By OTHER_EXTERNAL_DOORS_NO = questionnaireRadioButton(NO, 8);
        public static By WORKING_BURGLAR_ALARM_YES = questionnaireRadioButton(YES, 9);
        public static By WORKING_BURGLAR_ALARM_NO = questionnaireRadioButton(NO, 9);
        public static By BURGLAR_ALARM_OPTION_BELLS = By.xpath("//span[text() = \"Bells-only alarm\"]");
        public static By ADD_JOINT_POLICY_HOLDER_YES = questionnaireRadioButton(YES, 10);
        public static By ADD_JOINT_POLICY_HOLDER_NO = questionnaireRadioButton(NO, 10);
        public static By INSURANCE_CLAIMS_OR_LOSSES_YES = questionnaireRadioButton(YES, 11);
        public static By INSURANCE_CLAIMS_OR_LOSSES_NO = questionnaireRadioButton(NO, 11);
        public static By TODAY_BUTTON = questionnaireButton("di-id-ba00ae8d-524efd97");
        public static By TOMORROW_BUTTON = questionnaireButton("di-id-bc913eae-f4d232d5");
        public static By CURRENT_VALUE_PROPERTY_FIELD = questionnaireField("row question-row-please-enter-the-cur");
        public static By REBUILD_VALUE_FIELD = questionnaireField("row question-row-please-enter-the-reb");
        public static By ACCIDENTAL_DAMAGE_COVER_YES = questionnaireRadioButton(YES, 12);
        public static By ACCIDENTAL_DAMAGE_COVER_NO = questionnaireRadioButton(NO, 12);
}
