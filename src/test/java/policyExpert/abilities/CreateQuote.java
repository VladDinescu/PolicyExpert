package policyExpert.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import policyExpert.exceptions.CannotCreateQuoteException;

public class CreateQuote implements Ability {
    private final String firstName;
    private final String lastName;
    private final String title;
    private final String email;
    private final String addressLine1;
    private final String town;
    private final String postcode;
    private final String marital_status;
    private final String occupation;
    private final String telephone;
    private final String house_date_of_fabrication;
    private final String smoking;
    private final String not_business;
    private final String correspondence;
    private final String trees;
    private final String flat_roof;
    private final String main_residence;
    private final String window_lock;
    private final String lockable_entrance;
    private final String entrance_lock_type;
    private final String french_patio_doors;
    private final String french_lock_type;
    private final String other_external_doors;
    private final String working_burglar_alarm;
    private final String burglar_alarm_type;
    private final String add_joint_policy_holder;
    private final String insurance_claim_or_losses;
    private final String day;
    private final String month;
    private final String year;
    private final String property_type;
    private final String specific_property_type;
    private final String bedrooms;
    private final String ownership;
    private final String occupied_by;
    private final String occupied_at;
    private final String consecutive_years_of_insurance;
    private final String home_insurance_type;
    private final String today;
    private final String tomorrow;
    private final String currentValueProperty;
    private final String rebuildValueProperty;
    private final String accidentalDamageCover;

    public static CreateQuote with(
            String firstName,
            String lastName,
            String title,
            String addressLine1,
            String town,
            String postcode,
            String email,
            String marital_status,
            String occupation,
            String telephone,
            String house_date_of_fabrication,
            String smoking,
            String not_business,
            String correspondence,
            String trees,
            String flat_roof,
            String main_residence,
            String window_lock,
            String lockable_entrance,
            String entrance_lock_type,
            String french_patio_doors,
            String french_lock_type,
            String other_external_doors,
            String working_burglar_alarm,
            String burglar_alarm_type,
            String add_joint_policy_holder,
            String insurance_claim_or_losses,
            String day,
            String month,
            String year,
            String property_type,
            String specific_property_type,
            String bedrooms,
            String ownership,
            String occupied_by,
            String occupied_at,
            String consecutive_years_of_insurance,
            String home_insurance_type,
            String today,
            String tomorrow,
            String currentValueProperty,
            String rebuildValueProperty,
            String accidentalDamageCover
            ){
        return new CreateQuote(
                firstName,
                lastName,
                title,
                addressLine1,
                town,
                postcode,
                email,
                marital_status,
                occupation,
                telephone,
                house_date_of_fabrication,
                smoking,
                not_business,
                correspondence,
                trees,
                flat_roof,
                main_residence,
                window_lock,
                lockable_entrance,
                entrance_lock_type,
                french_patio_doors,
                french_lock_type,
                other_external_doors,
                working_burglar_alarm,
                burglar_alarm_type,
                add_joint_policy_holder,
                insurance_claim_or_losses,
                day,
                month,
                year,
                property_type,
                specific_property_type,
                bedrooms,
                ownership,
                occupied_by,
                occupied_at,
                consecutive_years_of_insurance,
                home_insurance_type,
                today,
                tomorrow,
                currentValueProperty,
                rebuildValueProperty,
                accidentalDamageCover
                );
    }

    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String title() { return title; }
    public String email() { return email; }
    public String addressLine1() { return addressLine1; }
    public String town() { return town;}
    public String postcode() { return postcode; }
    public String telephone() { return telephone; }
    public String maritalStatus() { return marital_status; }
    public String occupation() { return occupation; }
    public String houseDateOfFabrication() { return house_date_of_fabrication; }
    public String day() { return day; }
    public String month() { return month; }
    public String year() { return year; }
    public String propertyType() { return property_type; }
    public String specificPropertyType() { return specific_property_type; }
    public String bedrooms() { return bedrooms; }
    public String ownership() { return ownership; }
    public String occupiedBy() { return occupied_by; }
    public String occupiedAt() { return occupied_at; }
    public String consecutiveYearsOfOwnership() { return consecutive_years_of_insurance; }
    public String homeInsuranceType() { return home_insurance_type; }
    public String today() { return today; }
    public String tomorrow() { return tomorrow; }
    public String smoking() { return smoking; }
    public String notBusiness() { return not_business; }
    public String correspondence() { return correspondence; }
    public String flatRoof() { return flat_roof; }
    public String trees() { return trees; }
    public String mainResidence() { return main_residence; }
    public String windowLock() { return window_lock; }
    public String lockableEntrance() { return lockable_entrance; }
    public String entranceLockType() { return entrance_lock_type; }
    public String frenchPatioDoors() { return french_patio_doors; }
    public String frenchLockType() { return french_lock_type; }
    public String otherExternalDoors() { return other_external_doors; }
    public String workingBurglarAlarm() { return working_burglar_alarm; }
    public String burglarAlarmType() { return burglar_alarm_type; }
    public String addJointPolicyHolder() { return add_joint_policy_holder; }
    public String insuranceClaimOrLosses() { return insurance_claim_or_losses; }
    public String currentValueProperty() { return currentValueProperty; }
    public String rebuildValueProperty() { return rebuildValueProperty; }
    public String accidentalDamageCover() { return accidentalDamageCover; }

    public static CreateQuote as(Actor actor) {

        try {// complain if someone's asking the impossible
            if (actor.abilityTo(CreateQuote.class) == null) {
                throw new CannotCreateQuoteException(actor.getName());
            }

            return actor.abilityTo(CreateQuote.class);
        } catch (CannotCreateQuoteException e) {
            e.printStackTrace();
        }
        return actor.abilityTo(CreateQuote.class);
    }

    private CreateQuote(
            String firstName,
            String lastName,
            String title,
            String addressLine1,
            String town,
            String postcode,
            String email,
            String marital_status,
            String occupation,
            String telephone,
            String house_date_of_fabrication,
            String smoking,
            String not_business,
            String correspondence,
            String trees,
            String flat_roof,
            String main_residence,
            String window_lock,
            String lockable_entrance,
            String entrance_lock_type,
            String french_patio_doors,
            String french_lock_type,
            String other_external_doors,
            String working_burglar_alarm,
            String burglar_alarm_type,
            String add_joint_policy_holder,
            String insurance_claim_or_losses,
            String day,
            String month,
            String year,
            String property_type,
            String specific_property_type,
            String bedrooms,
            String ownership,
            String occupied_by,
            String occupied_at,
            String consecutive_years_of_insurance,
            String home_insurance_type,
            String today,
            String tomorrow,
            String currentValueProperty,
            String rebuildValueProperty,
            String accidentalDamageCover
            ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.addressLine1 = addressLine1;
        this.town = town;
        this.postcode = postcode;
        this.email = email;
        this.telephone = telephone;
        this.marital_status = marital_status;
        this.occupation = occupation;
        this.house_date_of_fabrication = house_date_of_fabrication;
        this.day = day;
        this.month = month;
        this.year = year;
        this.property_type = property_type;
        this.specific_property_type = specific_property_type;
        this.bedrooms = bedrooms;
        this.ownership = ownership;
        this.occupied_by = occupied_by;
        this.occupied_at = occupied_at;
        this.consecutive_years_of_insurance = consecutive_years_of_insurance;
        this.home_insurance_type = home_insurance_type;
        this.today = today;
        this.tomorrow = tomorrow;
        this.smoking = smoking;
        this.not_business = not_business;
        this.correspondence = correspondence;
        this.flat_roof = flat_roof;
        this.trees = trees;
        this.main_residence = main_residence;
        this.window_lock = window_lock;
        this.lockable_entrance = lockable_entrance;
        this.entrance_lock_type = entrance_lock_type;
        this.french_patio_doors = french_patio_doors;
        this.french_lock_type = french_lock_type;
        this.other_external_doors = other_external_doors;
        this.working_burglar_alarm = working_burglar_alarm;
        this.burglar_alarm_type = burglar_alarm_type;
        this.add_joint_policy_holder = add_joint_policy_holder;
        this.insurance_claim_or_losses = insurance_claim_or_losses;
        this.currentValueProperty = currentValueProperty;
        this.rebuildValueProperty = rebuildValueProperty;
        this.accidentalDamageCover = accidentalDamageCover;
    }
}
