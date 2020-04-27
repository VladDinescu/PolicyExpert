package policyExpert.identity;


import net.serenitybdd.screenplay.Actor;

public class PotentialCustomer extends Actor {

    private final String firstName;
    private final String lastName;
    private final String title;
    private final String email;
    private final String address;
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
    private final String french_patio_doors;
    private final String other_external_doors;
    private final String working_burglar_alarm;
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

    public PotentialCustomer(
            String name,
            String firstName,
            String lastName,
            String title,
            String address,
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
            String french_patio_doors,
            String other_external_doors,
            String working_burglar_alarm,
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
            String tomorrow)
    {
        super(name);
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
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
        this.french_patio_doors = french_patio_doors;
        this.other_external_doors = other_external_doors;
        this.working_burglar_alarm = working_burglar_alarm;
        this.add_joint_policy_holder = add_joint_policy_holder;
        this.insurance_claim_or_losses = insurance_claim_or_losses;
    }

    public String firstName() { return firstName; }
    public String lastName() { return lastName; }
    public String title() { return title; }
    public String email() { return email; }
    public String address() { return address; }
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
    public String frenchPatioDoors() { return french_patio_doors; }
    public String otherExternalDoors() { return other_external_doors; }
    public String workingBurglarAlarm() { return working_burglar_alarm; }
    public String addJointPolicyHolder() { return add_joint_policy_holder; }
    public String insuranceClaimOrLosses() { return insurance_claim_or_losses; }

}
